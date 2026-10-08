package zj;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes4.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f235450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Method f235451b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Method f235452c;

    static {
        Object objB = b();
        f235450a = objB;
        f235451b = objB == null ? null : a();
        f235452c = objB != null ? d(objB) : null;
    }

    private static Method a() {
        return c("getStackTraceElement", Throwable.class, Integer.TYPE);
    }

    private static Object b() {
        try {
            return Class.forName("sun.misc.SharedSecrets", false, null).getMethod("getJavaLangAccess", null).invoke(null, null);
        } catch (ThreadDeath e15) {
            throw e15;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method c(String str, Class<?>... clsArr) {
        try {
            return Class.forName("sun.misc.JavaLangAccess", false, null).getMethod(str, clsArr);
        } catch (ThreadDeath e15) {
            throw e15;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method d(Object obj) {
        try {
            Method methodC = c("getStackTraceDepth", Throwable.class);
            if (methodC == null) {
                return null;
            }
            methodC.invoke(obj, new Throwable());
            return methodC;
        } catch (IllegalAccessException | UnsupportedOperationException | InvocationTargetException unused) {
            return null;
        }
    }

    public static String e(Throwable th4) {
        StringWriter stringWriter = new StringWriter();
        th4.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public static void f(Throwable th4) {
        p.q(th4);
        if (th4 instanceof RuntimeException) {
            throw ((RuntimeException) th4);
        }
        if (th4 instanceof Error) {
            throw ((Error) th4);
        }
    }
}
