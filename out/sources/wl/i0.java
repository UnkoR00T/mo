package wl;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes4.dex */
public abstract class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i0 f214035a = c();

    class a extends i0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Method f214036b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f214037c;

        a(Method method, Object obj) {
            this.f214036b = method;
            this.f214037c = obj;
        }

        @Override // wl.i0
        public <T> T d(Class<T> cls) {
            i0.b(cls);
            return (T) this.f214036b.invoke(this.f214037c, cls);
        }
    }

    class b extends i0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Method f214038b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f214039c;

        b(Method method, int i15) {
            this.f214038b = method;
            this.f214039c = i15;
        }

        @Override // wl.i0
        public <T> T d(Class<T> cls) {
            i0.b(cls);
            return (T) this.f214038b.invoke(null, cls, Integer.valueOf(this.f214039c));
        }
    }

    class c extends i0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Method f214040b;

        c(Method method) {
            this.f214040b = method;
        }

        @Override // wl.i0
        public <T> T d(Class<T> cls) {
            i0.b(cls);
            return (T) this.f214040b.invoke(null, cls, Object.class);
        }
    }

    class d extends i0 {
        d() {
        }

        @Override // wl.i0
        public <T> T d(Class<T> cls) {
            throw new UnsupportedOperationException("Cannot allocate " + cls + ". Usage of JDK sun.misc.Unsafe is enabled, but it could not be used. Make sure your runtime is configured correctly.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(Class<?> cls) {
        String strV = v.v(cls);
        if (strV == null) {
            return;
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: " + strV);
    }

    private static i0 c() {
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
