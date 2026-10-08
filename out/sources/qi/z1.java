package qi;

import com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.kx;

/* JADX INFO: loaded from: classes4.dex */
public final class z1 extends bw implements kx {
    private static final z1 zbb;
    private int zbd;
    private int zbe;
    private int zbf = 2;
    private String zbg = "";

    static {
        z1 z1Var = new z1();
        zbb = z1Var;
        bw.l(z1.class, z1Var);
    }

    private z1() {
    }

    public static w1 E() {
        return (w1) zbb.u();
    }

    static /* synthetic */ void G(z1 z1Var, int i15) {
        z1Var.zbe = i15 - 1;
        z1Var.zbd |= 1;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003ဈ\u0002", new Object[]{"zbd", "zbe", x1.f166694a, "zbf", "zbg"});
        }
        if (i16 == 3) {
            return new z1();
        }
        v1 v1Var = null;
        if (i16 == 4) {
            return new w1(v1Var);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
