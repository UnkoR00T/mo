package qi;

import com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.f8;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.kx;

/* JADX INFO: loaded from: classes4.dex */
public final class a5 extends bw implements kx {
    private static final a5 zbb;
    private int zbd;
    private f8 zbe;
    private String zbf = "";
    private boolean zbg;
    private m3 zbh;

    static {
        a5 a5Var = new a5();
        zbb = a5Var;
        bw.l(a5.class, a5Var);
    }

    private a5() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004ဉ\u0003", new Object[]{"zbd", "zbe", "zbf", "zbg", "zbh"});
        }
        if (i16 == 3) {
            return new a5();
        }
        y4 y4Var = null;
        if (i16 == 4) {
            return new z4(y4Var);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
