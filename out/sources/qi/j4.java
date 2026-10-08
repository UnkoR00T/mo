package qi;

import com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.kx;

/* JADX INFO: loaded from: classes4.dex */
public final class j4 extends bw implements kx {
    private static final j4 zbb;
    private int zbd;
    private int zbe;
    private h2 zbf;

    static {
        j4 j4Var = new j4();
        zbb = j4Var;
        bw.l(j4.class, j4Var);
    }

    private j4() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001", new Object[]{"zbd", "zbe", n4.f166687a, "zbf"});
        }
        if (i16 == 3) {
            return new j4();
        }
        e3 e3Var = null;
        if (i16 == 4) {
            return new f4(e3Var);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
