package qi;

import com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.gk;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.kx;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.rc;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.v7;

/* JADX INFO: loaded from: classes4.dex */
public final class q4 extends bw implements kx {
    private static final q4 zbb;
    private int zbd;
    private int zbe = 0;
    private Object zbf;
    private gk zbg;

    static {
        q4 q4Var = new q4();
        zbb = q4Var;
        bw.l(q4.class, q4Var);
    }

    private q4() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0004\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"zbf", "zbe", "zbd", "zbg", rc.class, v7.class});
        }
        if (i16 == 3) {
            return new q4();
        }
        o4 o4Var = null;
        if (i16 == 4) {
            return new p4(o4Var);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
