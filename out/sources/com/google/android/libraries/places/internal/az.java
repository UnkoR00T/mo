package com.google.android.libraries.places.internal;

import com.google.android.libraries.places.internal.az;
import com.google.android.libraries.places.internal.uy;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes4.dex */
public abstract class az<MessageType extends az<MessageType, BuilderType>, BuilderType extends uy<MessageType, BuilderType>> extends fx<MessageType, BuilderType> {
    public static final /* synthetic */ int zzd = 0;
    private static final Map zze = new ConcurrentHashMap();
    private int zzb = -1;
    protected j10 zzc = j10.a();

    protected static iz A(iz izVar) {
        int size = izVar.size();
        return izVar.a0(size + size);
    }

    private final int G(v00 v00Var) {
        return r00.a().b(getClass()).d(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean H(az azVar, boolean z15) {
        byte bByteValue = ((Byte) azVar.h(1, null, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zG = r00.a().b(azVar.getClass()).g(azVar);
        if (z15) {
            azVar.h(2, true != zG ? null : azVar, null);
        }
        return zG;
    }

    static az q(Class cls) {
        Map map = zze;
        az azVar = (az) map.get(cls);
        if (azVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                azVar = (az) map.get(cls);
            } catch (ClassNotFoundException e15) {
                throw new IllegalStateException("Class initialization cannot fail.", e15);
            }
        }
        if (azVar != null) {
            return azVar;
        }
        az azVar2 = (az) ((az) p10.f(cls)).h(6, null, null);
        if (azVar2 == null) {
            throw new IllegalStateException();
        }
        map.put(cls, azVar2);
        return azVar2;
    }

    protected static void r(Class cls, az azVar) {
        azVar.D();
        zze.put(cls, azVar);
    }

    protected static Object s(g00 g00Var, String str, Object[] objArr) {
        return new t00(g00Var, str, objArr);
    }

    public static zy t(g00 g00Var, Object obj, g00 g00Var2, dz dzVar, int i15, u10 u10Var, Class cls) {
        return new zy(g00Var, obj, g00Var2, new yy(null, 525004180, u10Var, false, false), cls);
    }

    static Object v(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e15) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e15);
        } catch (InvocationTargetException e16) {
            Throwable cause = e16.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    protected static fz w() {
        return bz.g();
    }

    protected static fz x(fz fzVar) {
        int size = fzVar.size();
        return fzVar.a0(size + size);
    }

    protected static hz y() {
        return uz.h();
    }

    protected static iz z() {
        return s00.g();
    }

    final boolean C() {
        return (this.zzb & PKIFailureInfo.systemUnavail) != 0;
    }

    final void D() {
        this.zzb &= Integer.MAX_VALUE;
    }

    final az E() {
        return (az) h(4, null, null);
    }

    final int F() {
        return r00.a().b(getClass()).a(this);
    }

    @Override // com.google.android.libraries.places.internal.g00
    public final /* synthetic */ f00 c() {
        return (uy) h(5, null, null);
    }

    @Override // com.google.android.libraries.places.internal.fx
    final int d(v00 v00Var) {
        if (C()) {
            int iD = v00Var.d(this);
            if (iD >= 0) {
                return iD;
            }
            StringBuilder sb5 = new StringBuilder(String.valueOf(iD).length() + 42);
            sb5.append("serialized size must be non-negative, was ");
            sb5.append(iD);
            throw new IllegalStateException(sb5.toString());
        }
        int i15 = this.zzb & Integer.MAX_VALUE;
        if (i15 != Integer.MAX_VALUE) {
            return i15;
        }
        int iD2 = v00Var.d(this);
        if (iD2 >= 0) {
            this.zzb = (this.zzb & PKIFailureInfo.systemUnavail) | iD2;
            return iD2;
        }
        StringBuilder sb6 = new StringBuilder(String.valueOf(iD2).length() + 42);
        sb6.append("serialized size must be non-negative, was ");
        sb6.append(iD2);
        throw new IllegalStateException(sb6.toString());
    }

    @Override // com.google.android.libraries.places.internal.g00
    public final void e(dy dyVar) {
        r00.a().b(getClass()).c(this, ey.D(dyVar));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return r00.a().b(getClass()).e(this, (az) obj);
    }

    @Override // com.google.android.libraries.places.internal.g00
    public final /* synthetic */ f00 g() {
        uy uyVar = (uy) h(5, null, null);
        uyVar.w(this);
        return uyVar;
    }

    protected abstract Object h(int i15, Object obj, Object obj2);

    public final int hashCode() {
        if (C()) {
            return F();
        }
        int i15 = this.zza;
        if (i15 != 0) {
            return i15;
        }
        int iF = F();
        this.zza = iF;
        return iF;
    }

    @Override // com.google.android.libraries.places.internal.g00
    public final int j() {
        if (C()) {
            int iG = G(null);
            if (iG >= 0) {
                return iG;
            }
            StringBuilder sb5 = new StringBuilder(String.valueOf(iG).length() + 42);
            sb5.append("serialized size must be non-negative, was ");
            sb5.append(iG);
            throw new IllegalStateException(sb5.toString());
        }
        int i15 = this.zzb & Integer.MAX_VALUE;
        if (i15 != Integer.MAX_VALUE) {
            return i15;
        }
        int iG2 = G(null);
        if (iG2 >= 0) {
            this.zzb = (this.zzb & PKIFailureInfo.systemUnavail) | iG2;
            return iG2;
        }
        StringBuilder sb6 = new StringBuilder(String.valueOf(iG2).length() + 42);
        sb6.append("serialized size must be non-negative, was ");
        sb6.append(iG2);
        throw new IllegalStateException(sb6.toString());
    }

    protected final void k() {
        r00.a().b(getClass()).h(this);
        D();
    }

    @Override // com.google.android.libraries.places.internal.g00
    public final p00 l() {
        return (p00) h(7, null, null);
    }

    @Override // com.google.android.libraries.places.internal.i00
    public final boolean m() {
        return H(this, true);
    }

    @Override // com.google.android.libraries.places.internal.i00
    public final /* synthetic */ g00 n() {
        return (az) h(6, null, null);
    }

    protected final uy o() {
        return (uy) h(5, null, null);
    }

    final void p(int i15) {
        this.zzb = (this.zzb & PKIFailureInfo.systemUnavail) | Integer.MAX_VALUE;
    }

    public final String toString() {
        return j00.a(this, super.toString());
    }
}
