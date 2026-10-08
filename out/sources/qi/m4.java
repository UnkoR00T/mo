package qi;

import com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.kx;

/* JADX INFO: loaded from: classes4.dex */
public final class m4 extends bw implements kx {
    private static final m4 zbb;
    private int zbd;
    private t3 zbe;

    static {
        m4 m4Var = new m4();
        zbb = m4Var;
        bw.l(m4.class, m4Var);
    }

    private m4() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"zbd", "zbe"});
        }
        if (i16 == 3) {
            return new m4();
        }
        k4 k4Var = null;
        if (i16 == 4) {
            return new l4(k4Var);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
