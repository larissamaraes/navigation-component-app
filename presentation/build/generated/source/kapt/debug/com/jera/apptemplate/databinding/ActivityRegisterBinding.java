package com.jera.apptemplate.databinding;
import com.jera.apptemplate.R;
import com.jera.apptemplate.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityRegisterBinding extends android.databinding.ViewDataBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new android.databinding.ViewDataBinding.IncludedLayouts(18);
        sIncludes.setIncludes(1, 
            new String[] {"loading_placeholder"},
            new int[] {2},
            new int[] {R.layout.loading_placeholder});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.upload_image, 3);
        sViewsWithIds.put(R.id.upload_text, 4);
        sViewsWithIds.put(R.id.name_input, 5);
        sViewsWithIds.put(R.id.name_edit_text, 6);
        sViewsWithIds.put(R.id.email_input, 7);
        sViewsWithIds.put(R.id.email_edit_text, 8);
        sViewsWithIds.put(R.id.phone_number_input, 9);
        sViewsWithIds.put(R.id.phone_number_edit_text, 10);
        sViewsWithIds.put(R.id.cpf_input, 11);
        sViewsWithIds.put(R.id.cpf_edit_text, 12);
        sViewsWithIds.put(R.id.password_input, 13);
        sViewsWithIds.put(R.id.password_edit_text, 14);
        sViewsWithIds.put(R.id.password_confirmation_input, 15);
        sViewsWithIds.put(R.id.password_confirmation_edit_text, 16);
        sViewsWithIds.put(R.id.submit_button, 17);
    }
    // views
    @NonNull
    public final android.widget.EditText cpfEditText;
    @NonNull
    public final android.support.design.widget.TextInputLayout cpfInput;
    @NonNull
    public final android.widget.EditText emailEditText;
    @NonNull
    public final android.support.design.widget.TextInputLayout emailInput;
    @Nullable
    public final com.jera.apptemplate.databinding.LoadingPlaceholderBinding includedLoading;
    @NonNull
    private final android.widget.ScrollView mboundView0;
    @NonNull
    private final android.widget.FrameLayout mboundView1;
    @NonNull
    public final android.widget.EditText nameEditText;
    @NonNull
    public final android.support.design.widget.TextInputLayout nameInput;
    @NonNull
    public final android.widget.EditText passwordConfirmationEditText;
    @NonNull
    public final android.support.design.widget.TextInputLayout passwordConfirmationInput;
    @NonNull
    public final android.widget.EditText passwordEditText;
    @NonNull
    public final android.support.design.widget.TextInputLayout passwordInput;
    @NonNull
    public final android.widget.EditText phoneNumberEditText;
    @NonNull
    public final android.support.design.widget.TextInputLayout phoneNumberInput;
    @NonNull
    public final android.widget.Button submitButton;
    @NonNull
    public final android.widget.ImageView uploadImage;
    @NonNull
    public final android.widget.TextView uploadText;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityRegisterBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 1);
        final Object[] bindings = mapBindings(bindingComponent, root, 18, sIncludes, sViewsWithIds);
        this.cpfEditText = (android.widget.EditText) bindings[12];
        this.cpfInput = (android.support.design.widget.TextInputLayout) bindings[11];
        this.emailEditText = (android.widget.EditText) bindings[8];
        this.emailInput = (android.support.design.widget.TextInputLayout) bindings[7];
        this.includedLoading = (com.jera.apptemplate.databinding.LoadingPlaceholderBinding) bindings[2];
        setContainedBinding(this.includedLoading);
        this.mboundView0 = (android.widget.ScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.FrameLayout) bindings[1];
        this.mboundView1.setTag(null);
        this.nameEditText = (android.widget.EditText) bindings[6];
        this.nameInput = (android.support.design.widget.TextInputLayout) bindings[5];
        this.passwordConfirmationEditText = (android.widget.EditText) bindings[16];
        this.passwordConfirmationInput = (android.support.design.widget.TextInputLayout) bindings[15];
        this.passwordEditText = (android.widget.EditText) bindings[14];
        this.passwordInput = (android.support.design.widget.TextInputLayout) bindings[13];
        this.phoneNumberEditText = (android.widget.EditText) bindings[10];
        this.phoneNumberInput = (android.support.design.widget.TextInputLayout) bindings[9];
        this.submitButton = (android.widget.Button) bindings[17];
        this.uploadImage = (android.widget.ImageView) bindings[3];
        this.uploadText = (android.widget.TextView) bindings[4];
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        includedLoading.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (includedLoading.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
            return variableSet;
    }

    @Override
    public void setLifecycleOwner(@Nullable android.arch.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        includedLoading.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeIncludedLoading((com.jera.apptemplate.databinding.LoadingPlaceholderBinding) object, fieldId);
        }
        return false;
    }
    private boolean onChangeIncludedLoading(com.jera.apptemplate.databinding.LoadingPlaceholderBinding IncludedLoading, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        // batch finished
        executeBindingsOn(includedLoading);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    @NonNull
    public static ActivityRegisterBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityRegisterBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ActivityRegisterBinding>inflate(inflater, com.jera.apptemplate.R.layout.activity_register, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static ActivityRegisterBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityRegisterBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(com.jera.apptemplate.R.layout.activity_register, null, false), bindingComponent);
    }
    @NonNull
    public static ActivityRegisterBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityRegisterBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/activity_register_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ActivityRegisterBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): includedLoading
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}