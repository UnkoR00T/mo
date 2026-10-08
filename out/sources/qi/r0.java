package qi;

import com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.je;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.kx;

/* JADX INFO: loaded from: classes4.dex */
public final class r0 extends bw implements kx {
    private static final r0 zbb;
    private int zbd;
    private int zbe;
    private je zbf;
    private x4 zbg;

    static {
        r0 r0Var = new r0();
        zbb = r0Var;
        bw.l(r0.class, r0Var);
    }

    private r0() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zbd", "zbe", q0.f166689a, "zbf", "zbg"});
        }
        if (i16 == 3) {
            return new r0();
        }
        o0 o0Var = null;
        if (i16 == 4) {
            return new p0(o0Var);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
