package qi;

import com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.jw;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.kx;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.qk;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.vh;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.yd;

/* JADX INFO: loaded from: classes4.dex */
public final class k2 extends bw implements kx {
    private static final k2 zbb;
    private int zbd;
    private vh zbe;
    private jw zbf = bw.C();
    private jw zbg = bw.C();

    static {
        k2 k2Var = new k2();
        zbb = k2Var;
        bw.l(k2.class, k2Var);
    }

    private k2() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001ဉ\u0000\u0002\u001b\u0003\u001b", new Object[]{"zbd", "zbe", "zbf", qk.class, "zbg", yd.class});
        }
        if (i16 == 3) {
            return new k2();
        }
        i2 i2Var = null;
        if (i16 == 4) {
            return new j2(i2Var);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
