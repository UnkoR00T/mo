package qi;

import com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.jw;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.kx;

/* JADX INFO: loaded from: classes4.dex */
public final class p1 extends bw implements kx {
    private static final p1 zbb;
    private jw zbd = bw.C();

    static {
        p1 p1Var = new p1();
        zbb = p1Var;
        bw.l(p1.class, p1Var);
    }

    private p1() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zbd", n1.class});
        }
        if (i16 == 3) {
            return new p1();
        }
        j1 j1Var = null;
        if (i16 == 4) {
            return new o1(j1Var);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
