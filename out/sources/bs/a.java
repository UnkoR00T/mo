package bs;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes4.dex */
final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f21210a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static C0551a f21211b;

    /* JADX INFO: renamed from: bs.a$a, reason: collision with other inner class name */
    public static final class C0551a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Method f21212a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Method f21213b;

        public C0551a(Method method, Method method2) {
            this.f21212a = method;
            this.f21213b = method2;
        }

        public final Method a() {
            return this.f21213b;
        }

        public final Method b() {
            return this.f21212a;
        }
    }

    private a() {
    }

    private final C0551a a(Object obj) {
        Class<?> cls = obj.getClass();
        try {
            return new C0551a(cls.getMethod("getType", null), cls.getMethod("getAccessor", null));
        } catch (NoSuchMethodException unused) {
            return new C0551a(null, null);
        }
    }

    private final C0551a b(Object obj) {
        C0551a c0551a = f21211b;
        if (c0551a != null) {
            return c0551a;
        }
        C0551a c0551aA = a(obj);
        f21211b = c0551aA;
        return c0551aA;
    }

    public final Method c(Object obj) {
        Method methodA = b(obj).a();
        if (methodA == null) {
            return null;
        }
        return (Method) methodA.invoke(obj, null);
    }

    public final Class<?> d(Object obj) {
        Method methodB = b(obj).b();
        if (methodB == null) {
            return null;
        }
        return (Class) methodB.invoke(obj, null);
    }
}
