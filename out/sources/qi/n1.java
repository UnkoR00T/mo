package qi;

import com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.kx;

/* JADX INFO: loaded from: classes4.dex */
public final class n1 extends bw implements kx {
    private static final n1 zbb;
    private int zbd;
    private long zbe;
    private long zbf;

    static {
        n1 n1Var = new n1();
        zbb = n1Var;
        bw.l(n1.class, n1Var);
    }

    private n1() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001", new Object[]{"zbd", "zbe", "zbf"});
        }
        if (i16 == 3) {
            return new n1();
        }
        j1 j1Var = null;
        if (i16 == 4) {
            return new m1(j1Var);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
