package xv;

import android.os.Build;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.Collection;

/* JADX INFO: loaded from: classes5.dex */
public class a {
    public static <T> T a(Class<T> cls, InvocationHandler invocationHandler) {
        if (invocationHandler == null) {
            return null;
        }
        return cls.cast(Proxy.newProxyInstance(a.class.getClassLoader(), new Class[]{cls}, invocationHandler));
    }

    public static boolean b(Collection<String> collection, String str) {
        if (collection.contains(str)) {
            return true;
        }
        if (!c()) {
            return false;
        }
        StringBuilder sb5 = new StringBuilder();
        sb5.append(str);
        sb5.append(":dev");
        return collection.contains(sb5.toString());
    }

    private static boolean c() {
        String str = Build.TYPE;
        return "eng".equals(str) || "userdebug".equals(str);
    }
}
