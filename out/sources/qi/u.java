package qi;

import com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.jw;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.kx;

/* JADX INFO: loaded from: classes4.dex */
public final class u extends bw implements kx {
    private static final u zbb;
    private jw zbd = bw.C();

    static {
        u uVar = new u();
        zbb = uVar;
        bw.l(u.class, uVar);
    }

    private u() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zbd", r.class});
        }
        if (i16 == 3) {
            return new u();
        }
        o oVar = null;
        if (i16 == 4) {
            return new p(oVar);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
