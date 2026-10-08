package ao;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes4.dex */
public abstract class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j0 f13919a = c();

    class a extends j0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Method f13920b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f13921c;

        a(Method method, Object obj) {
            this.f13920b = method;
            this.f13921c = obj;
        }

        @Override // ao.j0
        public <T> T d(Class<T> cls) {
            j0.b(cls);
            return (T) this.f13920b.invoke(this.f13921c, cls);
        }
    }

    class b extends j0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Method f13922b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f13923c;

        b(Method method, int i15) {
            this.f13922b = method;
            this.f13923c = i15;
        }

        @Override // ao.j0
        public <T> T d(Class<T> cls) {
            j0.b(cls);
            return (T) this.f13922b.invoke(null, cls, Integer.valueOf(this.f13923c));
        }
    }

    class c extends j0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Method f13924b;

        c(Method method) {
            this.f13924b = method;
        }

        @Override // ao.j0
        public <T> T d(Class<T> cls) {
            j0.b(cls);
            return (T) this.f13924b.invoke(null, cls, Object.class);
        }
    }

    class d extends j0 {
        d() {
        }

        @Override // ao.j0
        public <T> T d(Class<T> cls) {
            throw new UnsupportedOperationException("Cannot allocate " + cls + ". Usage of JDK sun.misc.Unsafe is enabled, but it could not be used. Make sure your runtime is configured correctly.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(Class<?> cls) {
        String strU = w.u(cls);
        if (strU == null) {
            return;
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: " + strU);
    }

    private static j0 c() {
        try {
            try {
                try {
                    Class<?> cls = Class.forName("sun.misc.Unsafe");
                    Field declaredField = cls.getDeclaredField("theUnsafe");
                    declaredField.setAccessible(true);
                    return new a(cls.getMethod("allocateInstance", Class.class), declaredField.get(null));
                } catch (Exception unused) {
                    return new d();
                }
            } catch (Exception unused2) {
                Method declaredMethod = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                declaredMethod.setAccessible(true);
                return new c(declaredMethod);
            }
        } catch (Exception unused3) {
            Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
            declaredMethod2.setAccessible(true);
            int iIntValue = ((Integer) declaredMethod2.invoke(null, Object.class)).intValue();
            Method declaredMethod3 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
            declaredMethod3.setAccessible(true);
            return new b(declaredMethod3, iIntValue);
        }
    }

    public abstract <T> T d(Class<T> cls);
}
