package com.jera.apptemplate.databinding;
import com.jera.apptemplate.R;
import com.jera.apptemplate.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityLoginBinding extends android.databinding.ViewDataBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new android.databinding.ViewDataBinding.IncludedLayouts(13);
        sIncludes.setIncludes(1, 
            new String[] {"loading_placeholder"},
            new int[] {2},
            new int[] {R.layout.loading_placeholder});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.imageView, 3);
        sViewsWithIds.put(R.id.textView, 4);
        sViewsWithIds.put(R.id.facebook_button, 5);
        sViewsWithIds.put(R.id.google_button, 6);
        sViewsWithIds.put(R.id.textView2, 7);
        sViewsWithIds.put(R.id.email_input, 8);
        sViewsWithIds.put(R.id.password_input, 9);
        sViewsWithIds.put(R.id.submit_button, 10);
        sViewsWithIds.put(R.id.register_button, 11);
        sViewsWithIds.put(R.id.recover_password_button, 12);
    }
    // views
    @NonNull
    public final android.support.design.widget.TextInputLayout emailInput;
    @NonNull
    public final android.widget.LinearLayout facebookButton;
    @NonNull
    public final android.widget.LinearLayout googleButton;
    @NonNull
    public final android.widget.ImageView imageView;
    @Nullable
    public final com.jera.apptemplate.databinding.LoadingPlaceholderBinding includedLoading;
    @NonNull
    private final android.widget.ScrollView mboundView0;
    @NonNull
    private final android.widget.FrameLayout mboundView1;
    @NonNull
    public final android.support.design.widget.TextInputLayout passwordInput;
    @NonNull
    public final android.widget.TextView recoverPasswordButton;
    @NonNull
    public final android.widget.TextView registerButton;
    @NonNull
    public final android.widget.Button submitButton;
    @NonNull
    public final android.widget.TextView textView;
    @NonNull
    public final android.widget.TextView textView2;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityLoginBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 1);
        final Object[] bindings = mapBindings(bindingComponent, root, 13, sIncludes, sViewsWithIds);
        this.emailInput = (android.support.design.widget.TextInputLayout) bindings[8];
        this.facebookButton = (android.widget.LinearLayout) bindings[5];
        this.googleButton = (android.widget.LinearLayout) bindings[6];
        this.imageView = (android.widget.ImageView) bindings[3];
        this.includedLoading = (com.jera.apptemplate.databinding.LoadingPlaceholderBinding) bindings[2];
        setContainedBinding(this.includedLoading);
        this.mboundView0 = (android.widget.ScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.FrameLayout) bindings[1];
        this.mboundView1.setTag(null);
        this.passwordInput = (android.support.design.widget.TextInputLayout) bindings[9];
        this.recoverPasswordButton = (android.widget.TextView) bindings[12];
        this.registerButton = (android.widget.TextView) bindings[11];
        this.submitButton = (android.widget.Button) bindings[10];
        this.textView = (android.widget.TextView) bindings[4];
        this.textView2 = (android.widget.TextView) bindings[7];
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
    public static ActivityLoginBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityLoginBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ActivityLoginBinding>inflate(inflater, com.jera.apptemplate.R.layout.activity_login, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static ActivityLoginBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityLoginBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(com.jera.apptemplate.R.layout.activity_login, null, false), bindingComponent);
    }
    @NonNull
    public static ActivityLoginBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityLoginBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/activity_login_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ActivityLoginBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): includedLoading
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}