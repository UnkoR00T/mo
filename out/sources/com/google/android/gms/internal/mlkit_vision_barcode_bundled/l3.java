package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.g3;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.l3;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes3.dex */
public abstract class l3<MessageType extends l3<MessageType, BuilderType>, BuilderType extends g3<MessageType, BuilderType>> extends t1<MessageType, BuilderType> {
    private static final Map zzb = new ConcurrentHashMap();
    private int zzd = -1;
    protected z5 zzc = z5.c();

    protected static void C(Class cls, l3 l3Var) {
        l3Var.B();
        zzb.put(cls, l3Var);
    }

    protected static final boolean E(l3 l3Var, boolean z15) {
        byte bByteValue = ((Byte) l3Var.I(1, null, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zF = z4.a().b(l3Var.getClass()).f(l3Var);
        if (z15) {
            l3Var.I(2, true != zF ? null : l3Var, null);
        }
        return zF;
    }

    private final int G(k5 k5Var) {
        return z4.a().b(getClass()).b(this);
    }

    private static l3 H(l3 l3Var, byte[] bArr, int i15, int i16, w2 w2Var) throws v3 {
        if (i16 == 0) {
            return l3Var;
        }
        l3 l3VarM = l3Var.m();
        try {
            k5 k5VarB = z4.a().b(l3VarM.getClass());
            k5VarB.Y(l3VarM, bArr, 0, i16, new x1(w2Var));
            k5VarB.u(l3VarM);
            return l3VarM;
        } catch (v3 e15) {
            throw e15;
        } catch (x5 e16) {
            throw e16.a();
        } catch (IOException e17) {
            if (e17.getCause() instanceof v3) {
                throw ((v3) e17.getCause());
            }
            throw new v3(e17);
        } catch (IndexOutOfBoundsException unused) {
            throw new v3("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    public static k3 j(r4 r4Var, Object obj, r4 r4Var2, o3 o3Var, int i15, m6 m6Var, Class cls) {
        return new k3(r4Var, obj, r4Var2, new j3(null, i15, m6Var, false, false), cls);
    }

    static l3 l(Class cls) {
        Map map = zzb;
        l3 l3Var = (l3) map.get(cls);
        if (l3Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                l3Var = (l3) map.get(cls);
            } catch (ClassNotFoundException e15) {
                throw new IllegalStateException("Class initialization cannot fail.", e15);
            }
        }
        if (l3Var != null) {
            return l3Var;
        }
        l3 l3Var2 = (l3) ((l3) f6.j(cls)).I(6, null, null);
        if (l3Var2 == null) {
            throw new IllegalStateException();
        }
        map.put(cls, l3Var2);
        return l3Var2;
    }

    protected static l3 n(l3 l3Var, byte[] bArr, w2 w2Var) throws v3 {
        l3 l3VarH = H(l3Var, bArr, 0, bArr.length, w2Var);
        if (l3VarH == null || E(l3VarH, true)) {
            return l3VarH;
        }
        throw new x5(l3VarH).a();
    }

    protected static q3 o() {
        return d3.g();
    }

    protected static q3 p(q3 q3Var) {
        int size = q3Var.size();
        return q3Var.u0(size == 0 ? 10 : size + size);
    }

    protected static r3 q() {
        return m3.g();
    }

    protected static s3 r() {
        return a5.f();
    }

    protected static s3 s(s3 s3Var) {
        int size = s3Var.size();
        return s3Var.u0(size == 0 ? 10 : size + size);
    }

    static Object t(Method method, Object obj, Object... objArr) {
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

    protected static Object z(r4 r4Var, String str, Object[] objArr) {
        return new b5(r4Var, str, objArr);
    }

    protected final void A() {
        z4.a().b(getClass()).u(this);
        B();
    }

    final void B() {
        this.zzd &= Integer.MAX_VALUE;
    }

    final void D(int i15) {
        this.zzd = (this.zzd & PKIFailureInfo.systemUnavail) | Integer.MAX_VALUE;
    }

    final boolean F() {
        return (this.zzd & PKIFailureInfo.systemUnavail) != 0;
    }

    protected abstract Object I(int i15, Object obj, Object obj2);

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.s4
    public final /* synthetic */ r4 b() {
        return (l3) I(6, null, null);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.s4
    public final boolean c() {
        return E(this, true);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.t1
    final int d(k5 k5Var) {
        if (F()) {
            int iB = k5Var.b(this);
            if (iB >= 0) {
                return iB;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + iB);
        }
        int i15 = this.zzd & Integer.MAX_VALUE;
        if (i15 != Integer.MAX_VALUE) {
            return i15;
        }
        int iB2 = k5Var.b(this);
        if (iB2 >= 0) {
            this.zzd = (this.zzd & PKIFailureInfo.systemUnavail) | iB2;
            return iB2;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + iB2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return z4.a().b(getClass()).X(this, (l3) obj);
    }

    final int f() {
        return z4.a().b(getClass()).c(this);
    }

    protected final g3 g() {
        return (g3) I(5, null, null);
    }

    public final int hashCode() {
        if (F()) {
            return f();
        }
        int i15 = this.zza;
        if (i15 != 0) {
            return i15;
        }
        int iF = f();
        this.zza = iF;
        return iF;
    }

    public final g3 i() {
        g3 g3Var = (g3) I(5, null, null);
        g3Var.i(this);
        return g3Var;
    }

    final l3 m() {
        return (l3) I(4, null, null);
    }

    public final String toString() {
        return t4.a(this, super.toString());
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.r4
    public final int u() {
        if (F()) {
            int iG = G(null);
            if (iG >= 0) {
                return iG;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + iG);
        }
        int i15 = this.zzd & Integer.MAX_VALUE;
        if (i15 != Integer.MAX_VALUE) {
            return i15;
        }
        int iG2 = G(null);
        if (iG2 >= 0) {
            this.zzd = (this.zzd & PKIFailureInfo.systemUnavail) | iG2;
            return iG2;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + iG2);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.r4
    public final void v(r2 r2Var) {
        z4.a().b(getClass()).W(this, s2.a(r2Var));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.r4
    public final /* synthetic */ q4 w() {
        return (g3) I(5, null, null);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.r4
    public final /* synthetic */ q4 y() {
        g3 g3Var = (g3) I(5, null, null);
        g3Var.i(this);
        return g3Var;
    }
}
