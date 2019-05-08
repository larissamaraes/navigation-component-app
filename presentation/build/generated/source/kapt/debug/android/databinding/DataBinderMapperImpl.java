
package android.databinding;
import com.jera.apptemplate.BR;
class DataBinderMapperImpl extends android.databinding.DataBinderMapper {
    public DataBinderMapperImpl() {
    }
    @Override
    public android.databinding.ViewDataBinding getDataBinder(android.databinding.DataBindingComponent bindingComponent, android.view.View view, int layoutId) {
        switch(layoutId) {
                case com.jera.apptemplate.R.layout.activity_login:
 {
                        final Object tag = view.getTag();
                        if(tag == null) throw new java.lang.RuntimeException("view must have a tag");
                    if ("layout/activity_login_0".equals(tag)) {
                            return new com.jera.apptemplate.databinding.ActivityLoginBinding(bindingComponent, view);
                    }
                        throw new java.lang.IllegalArgumentException("The tag for activity_login is invalid. Received: " + tag);
                }
                case com.jera.apptemplate.R.layout.loading_placeholder:
 {
                        final Object tag = view.getTag();
                        if(tag == null) throw new java.lang.RuntimeException("view must have a tag");
                    if ("layout/loading_placeholder_0".equals(tag)) {
                            return new com.jera.apptemplate.databinding.LoadingPlaceholderBinding(bindingComponent, view);
                    }
                        throw new java.lang.IllegalArgumentException("The tag for loading_placeholder is invalid. Received: " + tag);
                }
                case com.jera.apptemplate.R.layout.activity_register:
 {
                        final Object tag = view.getTag();
                        if(tag == null) throw new java.lang.RuntimeException("view must have a tag");
                    if ("layout/activity_register_0".equals(tag)) {
                            return new com.jera.apptemplate.databinding.ActivityRegisterBinding(bindingComponent, view);
                    }
                        throw new java.lang.IllegalArgumentException("The tag for activity_register is invalid. Received: " + tag);
                }
        }
        return null;
    }
    @Override
    public android.databinding.ViewDataBinding getDataBinder(android.databinding.DataBindingComponent bindingComponent, android.view.View[] views, int layoutId) {
        switch(layoutId) {
        }
        return null;
    }
    @Override
    public int getLayoutId(String tag) {
        if (tag == null) {
            return 0;
        }
        final int code = tag.hashCode();
        switch(code) {
            case -237232145: {
                if(tag.equals("layout/activity_login_0")) {
                    return com.jera.apptemplate.R.layout.activity_login;
                }
                break;
            }
            case 1259863420: {
                if(tag.equals("layout/loading_placeholder_0")) {
                    return com.jera.apptemplate.R.layout.loading_placeholder;
                }
                break;
            }
            case 2013163103: {
                if(tag.equals("layout/activity_register_0")) {
                    return com.jera.apptemplate.R.layout.activity_register;
                }
                break;
            }
        }
        return 0;
    }
    @Override
    public String convertBrIdToString(int id) {
        if (id < 0 || id >= InnerBrLookup.sKeys.length) {
            return null;
        }
        return InnerBrLookup.sKeys[id];
    }
    private static class InnerBrLookup {
        static String[] sKeys = new String[]{
            "_all"
            ,"placeholder"};
    }
}