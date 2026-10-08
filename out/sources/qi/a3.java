package qi;

import com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.kx;

/* JADX INFO: loaded from: classes4.dex */
public final class a3 extends bw implements kx {
    private static final a3 zbb;
    private int zbd;
    private r1 zbe;
    private u zbf;
    private h zbg;
    private e4 zbh;
    private boolean zbi;
    private x zbj;
    private u1 zbk;
    private i1 zbl;

    static {
        a3 a3Var = new a3();
        zbb = a3Var;
        bw.l(a3.class, a3Var);
    }

    private a3() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\b\u0000\u0001\u0001\t\b\u0000\u0000\u0000\u0001ဉ\u0001\u0003ဉ\u0005\u0004ဉ\u0000\u0005ဉ\u0002\u0006ဉ\u0003\u0007ဇ\u0004\bဉ\u0006\tဉ\u0007", new Object[]{"zbd", "zbf", "zbj", "zbe", "zbg", "zbh", "zbi", "zbk", "zbl"});
        }
        if (i16 == 3) {
            return new a3();
        }
        y2 y2Var = null;
        if (i16 == 4) {
            return new z2(y2Var);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
