package qi;

import com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.jw;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.kx;

/* JADX INFO: loaded from: classes4.dex */
public final class e4 extends bw implements kx {
    private static final e4 zbb;
    private jw zbd = bw.C();

    static {
        e4 e4Var = new e4();
        zbb = e4Var;
        bw.l(e4.class, e4Var);
    }

    private e4() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zbd", d4.class});
        }
        if (i16 == 3) {
            return new e4();
        }
        a4 a4Var = null;
        if (i16 == 4) {
            return new b4(a4Var);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
