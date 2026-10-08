package qi;

import com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.kx;

/* JADX INFO: loaded from: classes4.dex */
public final class d1 extends bw implements kx {
    private static final d1 zbb;
    private int zbd;
    private Object zbf;
    private s2 zbg;
    private boolean zbh;
    private j4 zbi;
    private i4 zbj;
    private d2 zbk;
    private int zbl;
    private int zbe = 0;
    private byte zbm = 2;

    static {
        d1 d1Var = new d1();
        zbb = d1Var;
        bw.l(d1.class, d1Var);
    }

    private d1() {
    }

    public static b1 F() {
        return (b1) zbb.u();
    }

    static /* synthetic */ void H(d1 d1Var, i4 i4Var) {
        i4Var.getClass();
        d1Var.zbj = i4Var;
        d1Var.zbd |= 8;
    }

    static /* synthetic */ void I(d1 d1Var, s2 s2Var) {
        s2Var.getClass();
        d1Var.zbg = s2Var;
        d1Var.zbd |= 1;
    }

    public final int E() {
        return this.zbl;
    }

    public final boolean J() {
        if (this.zbe == 6) {
            return ((Boolean) this.zbf).booleanValue();
        }
        return false;
    }

    public final boolean K() {
        if (this.zbe == 5) {
            return ((Boolean) this.zbf).booleanValue();
        }
        return false;
    }

    public final boolean M() {
        return (this.zbd & 32) != 0;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return Byte.valueOf(this.zbm);
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\b\u0001\u0001\u0001\b\b\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဇ\u0001\u0003ဉ\u0003\u0004ဉ\u0002\u0005:\u0000\u0006:\u0000\u0007ဉ\u0004\bင\u0005", new Object[]{"zbf", "zbe", "zbd", "zbg", "zbh", "zbj", "zbi", "zbk", "zbl"});
        }
        if (i16 == 3) {
            return new d1();
        }
        a1 a1Var = null;
        if (i16 == 4) {
            return new b1(a1Var);
        }
        if (i16 == 5) {
            return zbb;
        }
        this.zbm = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
