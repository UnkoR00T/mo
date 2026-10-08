package qi;

import com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.kx;

/* JADX INFO: loaded from: classes4.dex */
public final class t extends bw implements kx {
    private static final t zbb;
    private int zbd;
    private float zbe;
    private long zbf;
    private long zbg;
    private long zbh;

    static {
        t tVar = new t();
        zbb = tVar;
        bw.l(t.class, tVar);
    }

    private t() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ခ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003", new Object[]{"zbd", "zbe", "zbf", "zbg", "zbh"});
        }
        if (i16 == 3) {
            return new t();
        }
        o oVar = null;
        if (i16 == 4) {
            return new s(oVar);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
