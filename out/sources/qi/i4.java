package qi;

import com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.kx;

/* JADX INFO: loaded from: classes4.dex */
public final class i4 extends bw implements kx {
    private static final i4 zbb;
    private int zbd;
    private int zbe = 1;
    private boolean zbf;

    static {
        i4 i4Var = new i4();
        zbb = i4Var;
        bw.l(i4.class, i4Var);
    }

    private i4() {
    }

    public static h4 E() {
        return (h4) zbb.u();
    }

    static /* synthetic */ void G(i4 i4Var, int i15) {
        i4Var.zbe = 1;
        i4Var.zbd = 1 | i4Var.zbd;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001", new Object[]{"zbd", "zbe", n4.f166687a, "zbf"});
        }
        if (i16 == 3) {
            return new i4();
        }
        g4 g4Var = null;
        if (i16 == 4) {
            return new h4(g4Var);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
