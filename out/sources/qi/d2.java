package qi;

import com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.kx;

/* JADX INFO: loaded from: classes4.dex */
public final class d2 extends bw implements kx {
    private static final d2 zbb;
    private int zbd;
    private boolean zbe;
    private String zbf = "";

    static {
        d2 d2Var = new d2();
        zbb = d2Var;
        bw.l(d2.class, d2Var);
    }

    private d2() {
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
            return new d2();
        }
        b0 b0Var = null;
        if (i16 == 4) {
            return new c1(b0Var);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
