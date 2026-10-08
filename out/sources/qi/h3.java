package qi;

import com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.fc;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.kx;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.lc;

/* JADX INFO: loaded from: classes4.dex */
public final class h3 extends bw implements kx {
    private static final h3 zbb;
    private int zbd;
    private fc zbe;
    private lc zbf;
    private d3 zbg;
    private boolean zbh;
    private byte zbi = 2;

    static {
        h3 h3Var = new h3();
        zbb = h3Var;
        bw.l(h3.class, h3Var);
    }

    private h3() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return Byte.valueOf(this.zbi);
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001ဉ\u0000\u0002ဇ\u0003\u0003ᐉ\u0002\u0004ဉ\u0001", new Object[]{"zbd", "zbe", "zbh", "zbg", "zbf"});
        }
        if (i16 == 3) {
            return new h3();
        }
        f3 f3Var = null;
        if (i16 == 4) {
            return new g3(f3Var);
        }
        if (i16 == 5) {
            return zbb;
        }
        this.zbi = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
