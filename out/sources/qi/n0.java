package qi;

import com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.kx;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.lp;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.ym;

/* JADX INFO: loaded from: classes4.dex */
public final class n0 extends bw implements kx {
    private static final n0 zbb;
    private int zbd;
    private ym zbe;
    private lp zbf;
    private boolean zbg;
    private byte zbi = 2;
    private String zbh = "";

    static {
        n0 n0Var = new n0();
        zbb = n0Var;
        bw.l(n0.class, n0Var);
    }

    private n0() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return Byte.valueOf(this.zbi);
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001ဉ\u0000\u0002ᐉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"zbd", "zbe", "zbf", "zbg", "zbh"});
        }
        if (i16 == 3) {
            return new n0();
        }
        l0 l0Var = null;
        if (i16 == 4) {
            return new m0(l0Var);
        }
        if (i16 == 5) {
            return zbb;
        }
        this.zbi = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
