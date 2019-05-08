package com.jera.apptemplate.presentation.view.user.signup

import android.Manifest
import android.content.Context
import android.content.Intent
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.design.widget.TextInputLayout
import circleCrop
import com.jera.apptemplate.R
import com.jera.apptemplate.databinding.ActivityRegisterBinding
import com.jera.apptemplate.domain.util.field.InvalidFieldsException
import com.jera.apptemplate.domain.util.provider.SchedulerProvider
import com.jera.apptemplate.util.base.BaseActivity
import com.jera.apptemplate.util.base.BaseViewModel
import com.jera.apptemplate.util.extension.*
import com.jera.apptemplate.util.mask.InputMask
import com.jera.apptemplate.util.navigation.Navigator
import com.jera.apptemplate.util.viewmodel.Placeholder
import com.tbruyelle.rxpermissions2.RxPermissions
import io.reactivex.disposables.Disposable
import io.reactivex.rxkotlin.subscribeBy
import observeChanges
import setError
import setOnClickListener
import javax.inject.Inject

class SignUpActivity : BaseActivity() {

    override val baseViewModel: BaseViewModel get() = viewModel

    private lateinit var binding: ActivityRegisterBinding
    private lateinit var rxPermissions: RxPermissions

    @Inject
    protected lateinit var schedulerProvider: SchedulerProvider
    @Inject
    protected lateinit var viewModel: SignUpViewModel

    private var avatarDisposable: Disposable? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_register)
        setupUi()
        rxPermissions = RxPermissions(this)
    }

    override fun onDestroy() {
        avatarDisposable?.dispose()
        super.onDestroy()
    }

    private fun setupUi() {
        with(binding) {
            InputMask.apply(cpfInput, CPF_MASK)
            InputMask.apply(phoneNumberInput, PHONE_MASK_9_DIGITS)
            nameInput.observeChanges(viewModel::onNameChanged)
            emailInput.observeChanges(viewModel::onEmailChanged)
            cpfInput.observeChanges(viewModel::onCpfChanged)
            phoneNumberInput.observeChanges(viewModel::onPhoneChanged)
            passwordInput.observeChanges(viewModel::onPasswordChanged)
            passwordConfirmationInput.observeChanges(viewModel::onPasswordConfirmationChanged)
            submitButton.setOnClickListener(viewModel::onSubmitClicked)
            uploadImage.setOnClickListener(viewModel::onAvatarClicked)
            uploadText.setOnClickListener(viewModel::onAvatarClicked)
        }
    }

    override fun subscribeUi() {
        super.subscribeUi()
        viewModel.placeholder.observe(this, ::onNextPlaceholder)
        viewModel.errors.observeEvent(this, ::onNextErrors)
        viewModel.goToMain.observe(this, this::onNextGoToMain)
        viewModel.requestPermission.observeEvent(this, this::onNextPermission)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (easyImageWillHandleResult(requestCode, resultCode, data)) {
            handleResult(requestCode, resultCode, data)
        }
    }

    private fun handleResult(requestCode: Int, resultCode: Int, data: Intent?) {
        avatarDisposable?.dispose()
        avatarDisposable = handleEasyImageResult(requestCode, resultCode, data)
                .defaultSched(schedulerProvider)
                .subscribeBy(viewModel::onImagePickerFailure) { file ->
                    viewModel.onImagePickerSuccess(file)
                    binding.uploadImage.circleCrop(file.absolutePath, R.drawable.ic_add_photo_32dp_white)
                }
    }

    private fun onNextPlaceholder(placeholder: Placeholder?) {
        placeholder?.let { binding.includedLoading?.placeholder = it }
    }

    private fun onNextPermission(shouldRequest: Boolean?) {
        shouldRequest?.let { condition ->
            if (condition) {
                rxPermissions.request(
                        Manifest.permission.CAMERA,
                        Manifest.permission.READ_EXTERNAL_STORAGE
                ).subscribe { granted ->
                    if (granted) startEasyImageActivity()
                }
            }
        }
    }

    private fun onNextGoToMain(shouldGo: Boolean?) {
        shouldGo?.let { Navigator.goToMain(this, true) }
    }

    private fun onNextErrors(errors: InvalidFieldsException?) {
        errors?.getFields()?.let { showFieldError(it.toList()) }
    }

    private fun showFieldError(fields: List<Int>) {
        fields.forEach { field ->
            getTextInputLayout(field)?.setError(getErrorMessageId(field))
        }
    }


    private fun getTextInputLayout(field: Int): TextInputLayout? {
        return when (field) {
            FIELD_NAME -> binding.nameInput
            FIELD_EMAIL -> binding.emailInput
            FIELD_PHONE_NUMBER -> binding.phoneNumberInput
            FIELD_CPF -> binding.cpfInput
            FIELD_PASSWORD -> binding.passwordInput
            FIELD_PASSWORD_CONFIRMATION -> binding.passwordConfirmationInput
            else -> null
        }
    }

    private fun getErrorMessageId(field: Int): Int {
        return when (field) {
            FIELD_NAME -> R.string.validation_name
            FIELD_EMAIL -> R.string.validation_email
            FIELD_PHONE_NUMBER -> R.string.validation_phone_number
            FIELD_CPF -> R.string.validation_cpf
            FIELD_PASSWORD -> R.string.validation_password
            FIELD_PASSWORD_CONFIRMATION -> R.string.validation_password_confirmation
            else -> 0
        }
    }


    companion object {
        private const val CPF_MASK = "###.###.###-##"
        private const val PHONE_MASK_9_DIGITS = "(##) #####-####"
        private const val FIELD_NAME = 1
        private const val FIELD_EMAIL = 2
        private const val FIELD_PHONE_NUMBER = 3
        private const val FIELD_CPF = 4
        private const val FIELD_PASSWORD = 5
        private const val FIELD_PASSWORD_CONFIRMATION = 6

        fun createIntent(context: Context): Intent {
            return Intent(context, SignUpActivity::class.java)
        }
    }
}