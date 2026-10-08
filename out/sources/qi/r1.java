package qi;

import com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.jw;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.kx;

/* JADX INFO: loaded from: classes4.dex */
public final class r1 extends bw implements kx {
    private static final r1 zbb;
    private jw zbd = bw.C();

    static {
        r1 r1Var = new r1();
        zbb = r1Var;
        bw.l(r1.class, r1Var);
    }

    private r1() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zbd", q1.class});
        }
        if (i16 == 3) {
            return new r1();
        }
        j1 j1Var = null;
        if (i16 == 4) {
            return new k1(j1Var);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
