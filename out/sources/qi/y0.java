package qi;

import com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.jw;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.kx;

/* JADX INFO: loaded from: classes4.dex */
public final class y0 extends bw implements kx {
    private static final y0 zbb;
    private int zbd;
    private jw zbe = bw.C();
    private long zbf;

    static {
        y0 y0Var = new y0();
        zbb = y0Var;
        bw.l(y0.class, y0Var);
    }

    private y0() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001a\u0002ဂ\u0000", new Object[]{"zbd", "zbe", "zbf"});
        }
        if (i16 == 3) {
            return new y0();
        }
        w0 w0Var = null;
        if (i16 == 4) {
            return new x0(w0Var);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
