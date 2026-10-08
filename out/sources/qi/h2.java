package qi;

import com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.kx;

/* JADX INFO: loaded from: classes4.dex */
public final class h2 extends bw implements kx {
    private static final h2 zbb;
    private int zbd;
    private int zbe = 1;
    private int zbf = 5;

    static {
        h2 h2Var = new h2();
        zbb = h2Var;
        bw.l(h2.class, h2Var);
    }

    private h2() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001", new Object[]{"zbd", "zbe", g2.f166684a, "zbf"});
        }
        if (i16 == 3) {
            return new h2();
        }
        e2 e2Var = null;
        if (i16 == 4) {
            return new f2(e2Var);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
