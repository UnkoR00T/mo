package qi;

import com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.gk;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.kx;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.lc;

/* JADX INFO: loaded from: classes4.dex */
public final class d3 extends bw implements kx {
    private static final d3 zbb;
    private int zbd;
    private lc zbe;
    private gk zbf;
    private com.google.android.gms.internal.mlkit_vision_text_bundled_common.x4 zbg;
    private gk zbh;
    private byte zbi = 2;

    static {
        d3 d3Var = new d3();
        zbb = d3Var;
        bw.l(d3.class, d3Var);
    }

    private d3() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return Byte.valueOf(this.zbi);
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001ဉ\u0000\u0002ဉ\u0001\u0003ᐉ\u0002\u0004ဉ\u0003", new Object[]{"zbd", "zbe", "zbf", "zbg", "zbh"});
        }
        if (i16 == 3) {
            return new d3();
        }
        b3 b3Var = null;
        if (i16 == 4) {
            return new c3(b3Var);
        }
        if (i16 == 5) {
            return zbb;
        }
        this.zbi = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
