package androidx.versionedparcelable;

import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final r0.a<String, Method> f13600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final r0.a<String, Method> f13601b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final r0.a<String, Class> f13602c;

    public a(r0.a<String, Method> aVar, r0.a<String, Method> aVar2, r0.a<String, Class> aVar3) {
        this.f13600a = aVar;
        this.f13601b = aVar2;
        this.f13602c = aVar3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void N(gb.b bVar) {
        try {
            I(c(bVar.getClass()).getName());
        } catch (ClassNotFoundException e15) {
            throw new RuntimeException(bVar.getClass().getSimpleName() + " does not have a Parcelizer", e15);
        }
    }

    private Class c(Class<? extends gb.b> cls) throws ClassNotFoundException {
        Class cls2 = this.f13602c.get(cls.getName());
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(String.format("%s.%sParcelizer", cls.getPackage().getName(), cls.getSimpleName()), false, cls.getClassLoader());
        this.f13602c.put(cls.getName(), cls3);
        return cls3;
    }

    private Method d(String str) throws NoSuchMethodException {
        Method method = this.f13600a.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, a.class.getClassLoader()).getDeclaredMethod("read", a.class);
        this.f13600a.put(str, declaredMethod);
        return declaredMethod;
    }

    private Method e(Class cls) throws NoSuchMethodException, ClassNotFoundException {
        Method method = this.f13601b.get(cls.getName());
        if (method != null) {
            return method;
        }
        Class clsC = c(cls);
        System.currentTimeMillis();
        Method declaredMethod = clsC.getDeclaredMethod("write", cls, a.class);
        this.f13601b.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    protected abstract void A(byte[] bArr);

    public void B(byte[] bArr, int i15) {
        w(i15);
        A(bArr);
    }

    protected abstract void C(CharSequence charSequence);

    public void D(CharSequence charSequence, int i15) {
        w(i15);
        C(charSequence);
    }

    protected abstract void E(int i15);

    public void F(int i15, int i16) {
        w(i16);
        E(i15);
    }

    protected abstract void G(Parcelable parcelable);

    public void H(Parcelable parcelable, int i15) {
        w(i15);
        G(parcelable);
    }

    protected abstract void I(String str);

    public void J(String str, int i15) {
        w(i15);
        I(str);
    }

    protected <T extends gb.b> void K(T t15, a aVar) {
        try {
            e(t15.getClass()).invoke(null, t15, aVar);
        } catch (ClassNotFoundException e15) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e15);
        } catch (IllegalAccessException e16) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e16);
        } catch (NoSuchMethodException e17) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e17);
        } catch (InvocationTargetException e18) {
            if (!(e18.getCause() instanceof RuntimeException)) {
                throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e18);
            }
            throw ((RuntimeException) e18.getCause());
        }
    }

    protected void L(gb.b bVar) {
        if (bVar == null) {
            I(null);
            return;
        }
        N(bVar);
        a aVarB = b();
        K(bVar, aVarB);
        aVarB.a();
    }

    public void M(gb.b bVar, int i15) {
        w(i15);
        L(bVar);
    }

    protected abstract void a();

    protected abstract a b();

    public boolean f() {
        return false;
    }

    protected abstract boolean g();

    public boolean h(boolean z15, int i15) {
        return !m(i15) ? z15 : g();
    }

    protected abstract byte[] i();

    public byte[] j(byte[] bArr, int i15) {
        return !m(i15) ? bArr : i();
    }

    protected abstract CharSequence k();

    public CharSequence l(CharSequence charSequence, int i15) {
        return !m(i15) ? charSequence : k();
    }

    protected abstract boolean m(int i15);

    protected <T extends gb.b> T n(String str, a aVar) {
        try {
            return (T) d(str).invoke(null, aVar);
        } catch (ClassNotFoundException e15) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e15);
        } catch (IllegalAccessException e16) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e16);
        } catch (NoSuchMethodException e17) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e17);
        } catch (InvocationTargetException e18) {
            if (e18.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e18.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e18);
        }
    }

    protected abstract int o();

    public int p(int i15, int i16) {
        return !m(i16) ? i15 : o();
    }

    protected abstract <T extends Parcelable> T q();

    public <T extends Parcelable> T r(T t15, int i15) {
        return !m(i15) ? t15 : (T) q();
    }

    protected abstract String s();

    public String t(String str, int i15) {
        return !m(i15) ? str : s();
    }

    protected <T extends gb.b> T u() {
        String strS = s();
        if (strS == null) {
            return null;
        }
        return (T) n(strS, b());
    }

    public <T extends gb.b> T v(T t15, int i15) {
        return !m(i15) ? t15 : (T) u();
    }

    protected abstract void w(int i15);

    public void x(boolean z15, boolean z16) {
    }

    protected abstract void y(boolean z15);

    public void z(boolean z15, int i15) {
        w(i15);
        y(z15);
    }
}
