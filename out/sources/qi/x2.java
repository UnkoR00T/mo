package qi;

import com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.jw;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.kx;

/* JADX INFO: loaded from: classes4.dex */
public final class x2 extends bw implements kx {
    private static final x2 zbb;
    private jw zbd = bw.C();

    static {
        x2 x2Var = new x2();
        zbb = x2Var;
        bw.l(x2.class, x2Var);
    }

    private x2() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zbd", w2.class});
        }
        if (i16 == 3) {
            return new x2();
        }
        t2 t2Var = null;
        if (i16 == 4) {
            return new u2(t2Var);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
