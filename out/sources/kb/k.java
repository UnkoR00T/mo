package kb;

import android.os.Build;
import android.webkit.WebView;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* JADX INFO: loaded from: classes3.dex */
public class k {

    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final o f109725a = new o(k.d().getWebkitToCompatConverter());
    }

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final l f109726a = k.a();
    }

    static l a() {
        try {
            return new m((WebViewProviderFactoryBoundaryInterface) xv.a.a(WebViewProviderFactoryBoundaryInterface.class, b()));
        } catch (ClassNotFoundException unused) {
            return new f();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e15) {
            throw new RuntimeException(e15);
        }
    }

    private static InvocationHandler b() {
        return (InvocationHandler) Class.forName("org.chromium.support_lib_glue.SupportLibReflectionUtil", false, e()).getDeclaredMethod("createWebViewProviderFactory", null).invoke(null, null);
    }

    public static o c() {
        return a.f109725a;
    }

    public static l d() {
        return b.f109726a;
    }

    public static ClassLoader e() {
        return Build.VERSION.SDK_INT >= 28 ? d.a() : f().getClass().getClassLoader();
    }

    private static Object f() {
        try {
            Method declaredMethod = WebView.class.getDeclaredMethod("getFactory", null);
            declaredMethod.setAccessible(true);
            return declaredMethod.invoke(null, null);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e15) {
            throw new RuntimeException(e15);
        }
    }
}
