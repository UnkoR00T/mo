package qi;

import com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.kx;

/* JADX INFO: loaded from: classes4.dex */
public final class h extends bw implements kx {
    private static final h zbb;
    private int zbd;
    private long zbe;
    private float zbf = 0.5f;

    static {
        h hVar = new h();
        zbb = hVar;
        bw.l(h.class, hVar);
    }

    private h() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ခ\u0001", new Object[]{"zbd", "zbe", "zbf"});
        }
        if (i16 == 3) {
            return new h();
        }
        f fVar = null;
        if (i16 == 4) {
            return new g(fVar);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
