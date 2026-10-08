package qi;

import com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.f8;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.kx;

/* JADX INFO: loaded from: classes4.dex */
public final class x4 extends bw implements kx {
    private static final x4 zbb;
    private int zbd;
    private f8 zbe;
    private int zbg;
    private String zbf = "";
    private int zbh = 93;

    static {
        x4 x4Var = new x4();
        zbb = x4Var;
        bw.l(x4.class, x4Var);
    }

    private x4() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"zbd", "zbe", "zbf", "zbg", "zbh"});
        }
        if (i16 == 3) {
            return new x4();
        }
        v4 v4Var = null;
        if (i16 == 4) {
            return new w4(v4Var);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
