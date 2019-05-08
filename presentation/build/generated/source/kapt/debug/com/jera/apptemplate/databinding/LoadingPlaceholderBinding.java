package com.jera.apptemplate.databinding;
import com.jera.apptemplate.R;
import com.jera.apptemplate.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class LoadingPlaceholderBinding extends android.databinding.ViewDataBinding implements android.databinding.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    public final android.widget.Button actionButton;
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    @NonNull
    public final android.widget.TextView messageTextView;
    @NonNull
    public final android.widget.ProgressBar progressBar;
    // variables
    @Nullable
    private com.jera.apptemplate.util.viewmodel.Placeholder mPlaceholder;
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public LoadingPlaceholderBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 0);
        final Object[] bindings = mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds);
        this.actionButton = (android.widget.Button) bindings[3];
        this.actionButton.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.messageTextView = (android.widget.TextView) bindings[2];
        this.messageTextView.setTag(null);
        this.progressBar = (android.widget.ProgressBar) bindings[1];
        this.progressBar.setTag(null);
        setRootTag(root);
        // listeners
        mCallback1 = new android.databinding.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.placeholder == variableId) {
            setPlaceholder((com.jera.apptemplate.util.viewmodel.Placeholder) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setPlaceholder(@Nullable com.jera.apptemplate.util.viewmodel.Placeholder Placeholder) {
        this.mPlaceholder = Placeholder;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.placeholder);
        super.requestRebind();
    }
    @Nullable
    public com.jera.apptemplate.util.viewmodel.Placeholder getPlaceholder() {
        return mPlaceholder;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
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
        boolean placeholderMessageVisible = false;
        int placeholderButtonVisibleViewVISIBLEViewGONE = 0;
        int placeholderProgressVisibleViewVISIBLEViewGONE = 0;
        boolean placeholderVisible = false;
        boolean placeholderButtonVisible = false;
        com.jera.apptemplate.util.viewmodel.Placeholder placeholder = mPlaceholder;
        java.lang.String placeholderButtonText = null;
        int placeholderVisibleViewVISIBLEViewGONE = 0;
        boolean placeholderProgressVisible = false;
        java.lang.String placeholderMessage = null;
        int placeholderMessageVisibleViewVISIBLEViewGONE = 0;

        if ((dirtyFlags & 0x3L) != 0) {



                if (placeholder != null) {
                    // read placeholder.messageVisible
                    placeholderMessageVisible = placeholder.getMessageVisible();
                    // read placeholder.visible()
                    placeholderVisible = placeholder.visible();
                    // read placeholder.buttonVisible
                    placeholderButtonVisible = placeholder.getButtonVisible();
                    // read placeholder.buttonText
                    placeholderButtonText = placeholder.getButtonText();
                    // read placeholder.progressVisible
                    placeholderProgressVisible = placeholder.getProgressVisible();
                    // read placeholder.message
                    placeholderMessage = placeholder.getMessage();
                }
            if((dirtyFlags & 0x3L) != 0) {
                if(placeholderMessageVisible) {
                        dirtyFlags |= 0x200L;
                }
                else {
                        dirtyFlags |= 0x100L;
                }
            }
            if((dirtyFlags & 0x3L) != 0) {
                if(placeholderVisible) {
                        dirtyFlags |= 0x80L;
                }
                else {
                        dirtyFlags |= 0x40L;
                }
            }
            if((dirtyFlags & 0x3L) != 0) {
                if(placeholderButtonVisible) {
                        dirtyFlags |= 0x8L;
                }
                else {
                        dirtyFlags |= 0x4L;
                }
            }
            if((dirtyFlags & 0x3L) != 0) {
                if(placeholderProgressVisible) {
                        dirtyFlags |= 0x20L;
                }
                else {
                        dirtyFlags |= 0x10L;
                }
            }


                // read placeholder.messageVisible ? View.VISIBLE : View.GONE
                placeholderMessageVisibleViewVISIBLEViewGONE = ((placeholderMessageVisible) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read placeholder.visible() ? View.VISIBLE : View.GONE
                placeholderVisibleViewVISIBLEViewGONE = ((placeholderVisible) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read placeholder.buttonVisible ? View.VISIBLE : View.GONE
                placeholderButtonVisibleViewVISIBLEViewGONE = ((placeholderButtonVisible) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read placeholder.progressVisible ? View.VISIBLE : View.GONE
                placeholderProgressVisibleViewVISIBLEViewGONE = ((placeholderProgressVisible) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            this.actionButton.setOnClickListener(mCallback1);
        }
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.actionButton, placeholderButtonText);
            this.actionButton.setVisibility(placeholderButtonVisibleViewVISIBLEViewGONE);
            this.mboundView0.setVisibility(placeholderVisibleViewVISIBLEViewGONE);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.messageTextView, placeholderMessage);
            this.messageTextView.setVisibility(placeholderMessageVisibleViewVISIBLEViewGONE);
            this.progressBar.setVisibility(placeholderProgressVisibleViewVISIBLEViewGONE);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // placeholder != null
        boolean placeholderJavaLangObjectNull = false;
        // placeholder
        com.jera.apptemplate.util.viewmodel.Placeholder placeholder = mPlaceholder;



        placeholderJavaLangObjectNull = (placeholder) != (null);
        if (placeholderJavaLangObjectNull) {


            placeholder.onActionButtonClicked();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    @NonNull
    public static LoadingPlaceholderBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static LoadingPlaceholderBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<LoadingPlaceholderBinding>inflate(inflater, com.jera.apptemplate.R.layout.loading_placeholder, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static LoadingPlaceholderBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static LoadingPlaceholderBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(com.jera.apptemplate.R.layout.loading_placeholder, null, false), bindingComponent);
    }
    @NonNull
    public static LoadingPlaceholderBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static LoadingPlaceholderBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/loading_placeholder_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new LoadingPlaceholderBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): placeholder
        flag 1 (0x2L): null
        flag 2 (0x3L): placeholder.buttonVisible ? View.VISIBLE : View.GONE
        flag 3 (0x4L): placeholder.buttonVisible ? View.VISIBLE : View.GONE
        flag 4 (0x5L): placeholder.progressVisible ? View.VISIBLE : View.GONE
        flag 5 (0x6L): placeholder.progressVisible ? View.VISIBLE : View.GONE
        flag 6 (0x7L): placeholder.visible() ? View.VISIBLE : View.GONE
        flag 7 (0x8L): placeholder.visible() ? View.VISIBLE : View.GONE
        flag 8 (0x9L): placeholder.messageVisible ? View.VISIBLE : View.GONE
        flag 9 (0xaL): placeholder.messageVisible ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}