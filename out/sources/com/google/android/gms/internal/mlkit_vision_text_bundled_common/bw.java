package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.vv;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes3.dex */
public abstract class bw<MessageType extends bw<MessageType, BuilderType>, BuilderType extends vv<MessageType, BuilderType>> extends eu<MessageType, BuilderType> {
    private static final Map zbb = new ConcurrentHashMap();
    private int zbd = -1;
    protected ly zbc = ly.c();

    protected static hw A() {
        return cw.g();
    }

    protected static iw B() {
        return xw.g();
    }

    protected static jw C() {
        return sx.f();
    }

    static Object D(Method method, Object obj, Object... objArr) {
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

    protected static Object f(jx jxVar, String str, Object[] objArr) {
        return new tx(jxVar, str, objArr);
    }

    protected static void l(Class cls, bw bwVar) {
        bwVar.k();
        zbb.put(cls, bwVar);
    }

    protected static final boolean n(bw bwVar, boolean z15) {
        byte bByteValue = ((Byte) bwVar.p(1, null, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zD = rx.a().b(bwVar.getClass()).d(bwVar);
        if (z15) {
            bwVar.p(2, true != zD ? null : bwVar, null);
        }
        return zD;
    }

    private final int q(ux uxVar) {
        return rx.a().b(getClass()).a(this);
    }

    private static bw s(bw bwVar, byte[] bArr, int i15, int i16, lv lvVar) throws mw {
        if (i16 == 0) {
            return bwVar;
        }
        bw bwVarX = bwVar.x();
        try {
            ux uxVarB = rx.a().b(bwVarX.getClass());
            uxVarB.e(bwVarX, bArr, 0, i16, new lu(lvVar));
            uxVarB.f(bwVarX);
            return bwVarX;
        } catch (jy e15) {
            throw e15.a();
        } catch (mw e16) {
            throw e16;
        } catch (IOException e17) {
            if (e17.getCause() instanceof mw) {
                throw ((mw) e17.getCause());
            }
            throw new mw(e17);
        } catch (IndexOutOfBoundsException unused) {
            throw new mw("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    public static aw v(jx jxVar, Object obj, jx jxVar2, ew ewVar, int i15, vy vyVar, Class cls) {
        return new aw(jxVar, obj, jxVar2, new zv(null, 32149011, vyVar, false, false), cls);
    }

    static bw w(Class cls) {
        Map map = zbb;
        bw bwVar = (bw) map.get(cls);
        if (bwVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                bwVar = (bw) map.get(cls);
            } catch (ClassNotFoundException e15) {
                throw new IllegalStateException("Class initialization cannot fail.", e15);
            }
        }
        if (bwVar != null) {
            return bwVar;
        }
        bw bwVar2 = (bw) ((bw) ry.j(cls)).p(6, null, null);
        if (bwVar2 == null) {
            throw new IllegalStateException();
        }
        map.put(cls, bwVar2);
        return bwVar2;
    }

    protected static bw y(bw bwVar, byte[] bArr, lv lvVar) throws mw {
        bw bwVarS = s(bwVar, bArr, 0, bArr.length, lvVar);
        if (bwVarS == null || n(bwVarS, true)) {
            return bwVarS;
        }
        throw new jy(bwVarS).a();
    }

    protected static gw z() {
        return sv.g();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.eu
    final int a(ux uxVar) {
        if (o()) {
            int iA = uxVar.a(this);
            if (iA >= 0) {
                return iA;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + iA);
        }
        int i15 = this.zbd & Integer.MAX_VALUE;
        if (i15 != Integer.MAX_VALUE) {
            return i15;
        }
        int iA2 = uxVar.a(this);
        if (iA2 >= 0) {
            this.zbd = (this.zbd & PKIFailureInfo.systemUnavail) | iA2;
            return iA2;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + iA2);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.jx
    public final int b() {
        if (o()) {
            int iQ = q(null);
            if (iQ >= 0) {
                return iQ;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + iQ);
        }
        int i15 = this.zbd & Integer.MAX_VALUE;
        if (i15 != Integer.MAX_VALUE) {
            return i15;
        }
        int iQ2 = q(null);
        if (iQ2 >= 0) {
            this.zbd = (this.zbd & PKIFailureInfo.systemUnavail) | iQ2;
            return iQ2;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + iQ2);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.kx
    public final boolean c() {
        return n(this, true);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.jx
    public final /* synthetic */ ix e() {
        return (vv) p(5, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return rx.a().b(getClass()).g(this, (bw) obj);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.jx
    public final /* synthetic */ ix g() {
        vv vvVar = (vv) p(5, null, null);
        vvVar.n(this);
        return vvVar;
    }

    protected final void h() {
        rx.a().b(getClass()).f(this);
        k();
    }

    public final int hashCode() {
        if (o()) {
            return t();
        }
        int i15 = this.zba;
        if (i15 != 0) {
            return i15;
        }
        int iT = t();
        this.zba = iT;
        return iT;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.kx
    public final /* synthetic */ jx i() {
        return (bw) p(6, null, null);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.jx
    public final void j(gv gvVar) {
        rx.a().b(getClass()).c(this, hv.M(gvVar));
    }

    final void k() {
        this.zbd &= Integer.MAX_VALUE;
    }

    final void m(int i15) {
        this.zbd = (this.zbd & PKIFailureInfo.systemUnavail) | Integer.MAX_VALUE;
    }

    final boolean o() {
        return (this.zbd & PKIFailureInfo.systemUnavail) != 0;
    }

    protected abstract Object p(int i15, Object obj, Object obj2);

    final int t() {
        return rx.a().b(getClass()).h(this);
    }

    public final String toString() {
        return lx.a(this, super.toString());
    }

    protected final vv u() {
        return (vv) p(5, null, null);
    }

    final bw x() {
        return (bw) p(4, null, null);
    }
}
