package qi;

import com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.jf;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.kx;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.mf;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.pf;

/* JADX INFO: loaded from: classes4.dex */
public final class k0 extends bw implements kx {
    private static final k0 zbb;
    private int zbd;
    private jf zbe;
    private pf zbf;
    private mf zbg;

    static {
        k0 k0Var = new k0();
        zbb = k0Var;
        bw.l(k0.class, k0Var);
    }

    private k0() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0004\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0004ဉ\u0002", new Object[]{"zbd", "zbe", "zbf", "zbg"});
        }
        if (i16 == 3) {
            return new k0();
        }
        i0 i0Var = null;
        if (i16 == 4) {
            return new j0(i0Var);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
