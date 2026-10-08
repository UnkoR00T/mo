package qi;

import com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.kx;

/* JADX INFO: loaded from: classes4.dex */
public final class i1 extends bw implements kx {
    private static final i1 zbb;
    private int zbd;
    private boolean zbe;
    private String zbf = "";

    static {
        i1 i1Var = new i1();
        zbb = i1Var;
        bw.l(i1.class, i1Var);
    }

    private i1() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဈ\u0001", new Object[]{"zbd", "zbe", "zbf"});
        }
        if (i16 == 3) {
            return new i1();
        }
        g1 g1Var = null;
        if (i16 == 4) {
            return new h1(g1Var);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
