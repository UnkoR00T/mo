package qi;

import com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.kx;

/* JADX INFO: loaded from: classes4.dex */
public final class x extends bw implements kx {
    private static final x zbb;
    private int zbd;
    private int zbe;

    static {
        x xVar = new x();
        zbb = xVar;
        bw.l(x.class, xVar);
    }

    private x() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"zbd", "zbe"});
        }
        if (i16 == 3) {
            return new x();
        }
        v vVar = null;
        if (i16 == 4) {
            return new w(vVar);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
