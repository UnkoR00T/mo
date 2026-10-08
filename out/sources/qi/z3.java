package qi;

import com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.fc;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.jw;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.kx;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.xn;

/* JADX INFO: loaded from: classes4.dex */
public final class z3 extends bw implements kx {
    private static final z3 zbb;
    private int zbd;
    private String zbe = "";
    private jw zbf = bw.C();
    private jw zbg = bw.C();
    private jw zbh = bw.C();
    private fc zbi;
    private xn zbj;

    static {
        z3 z3Var = new z3();
        zbb = z3Var;
        bw.l(z3.class, z3Var);
    }

    private z3() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0003\u0000\u0001ဈ\u0000\u0002\u001a\u0003ဉ\u0001\u0004\u001a\u0005ဉ\u0002\u0006\u001a", new Object[]{"zbd", "zbe", "zbf", "zbi", "zbh", "zbj", "zbg"});
        }
        if (i16 == 3) {
            return new z3();
        }
        x3 x3Var = null;
        if (i16 == 4) {
            return new y3(x3Var);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
