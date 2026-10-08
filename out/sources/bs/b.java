package bs;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f21214a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static a f21215b;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Method f21216a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Method f21217b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Method f21218c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Method f21219d;

        public a(Method method, Method method2, Method method3, Method method4) {
            this.f21216a = method;
            this.f21217b = method2;
            this.f21218c = method3;
            this.f21219d = method4;
        }

        public final Method a() {
            return this.f21217b;
        }

        public final Method b() {
            return this.f21219d;
        }

        public final Method c() {
            return this.f21218c;
        }

        public final Method d() {
            return this.f21216a;
        }
    }

    private b() {
    }

    private final a a() {
        try {
            return new a(Class.class.getMethod("isSealed", null), Class.class.getMethod("getPermittedSubclasses", null), Class.class.getMethod("isRecord", null), Class.class.getMethod("getRecordComponents", null));
        } catch (NoSuchMethodException unused) {
            return new a(null, null, null, null);
        }
    }

    private final a b() {
        a aVar = f21215b;
        if (aVar != null) {
            return aVar;
        }
        a aVarA = a();
        f21215b = aVarA;
        return aVarA;
    }

    public final Class<?>[] c(Class<?> cls) {
        Method methodA = b().a();
        if (methodA == null) {
            return null;
        }
        return (Class[]) methodA.invoke(cls, null);
    }

    public final Object[] d(Class<?> cls) {
        Method methodB = b().b();
        if (methodB == null) {
            return null;
        }
        return (Object[]) methodB.invoke(cls, null);
    }

    public final Boolean e(Class<?> cls) {
        Method methodC = b().c();
        if (methodC == null) {
            return null;
        }
        return (Boolean) methodC.invoke(cls, null);
    }

    public final Boolean f(Class<?> cls) {
        Method methodD = b().d();
        if (methodD == null) {
            return null;
        }
        return (Boolean) methodD.invoke(cls, null);
    }
}
