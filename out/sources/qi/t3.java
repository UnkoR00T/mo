package qi;

import com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.kx;

/* JADX INFO: loaded from: classes4.dex */
public final class t3 extends bw implements kx {
    private static final t3 zbb;
    private int zbd = 0;
    private Object zbe;

    static {
        t3 t3Var = new t3();
        zbb = t3Var;
        bw.l(t3.class, t3Var);
    }

    private t3() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"zbe", "zbd", e0.class, y0.class});
        }
        if (i16 == 3) {
            return new t3();
        }
        r3 r3Var = null;
        if (i16 == 4) {
            return new s3(r3Var);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
