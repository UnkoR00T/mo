package qi;

import com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.kx;

/* JADX INFO: loaded from: classes4.dex */
public final class q1 extends bw implements kx {
    private static final q1 zbb;
    private int zbd;
    private Object zbf;
    private int zbe = 0;
    private String zbg = "";

    static {
        q1 q1Var = new q1();
        zbb = q1Var;
        bw.l(q1.class, q1Var);
    }

    private q1() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u00025\u0000\u0003<\u0000", new Object[]{"zbf", "zbe", "zbd", "zbg", p1.class});
        }
        if (i16 == 3) {
            return new q1();
        }
        j1 j1Var = null;
        if (i16 == 4) {
            return new l1(j1Var);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
