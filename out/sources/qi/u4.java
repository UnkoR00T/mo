package qi;

import com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.f8;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.kx;

/* JADX INFO: loaded from: classes4.dex */
public final class u4 extends bw implements kx {
    private static final u4 zbb;
    private int zbd;
    private f8 zbe;
    private String zbf = "";
    private int zbg;
    private boolean zbh;
    private int zbi;

    static {
        u4 u4Var = new u4();
        zbb = u4Var;
        bw.l(u4.class, u4Var);
    }

    private u4() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004ဇ\u0003\u0005᠌\u0004", new Object[]{"zbd", "zbe", "zbf", "zbg", "zbh", "zbi", t4.f166692a});
        }
        if (i16 == 3) {
            return new u4();
        }
        r4 r4Var = null;
        if (i16 == 4) {
            return new s4(r4Var);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
