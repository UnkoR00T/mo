package qi;

import com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.kx;

/* JADX INFO: loaded from: classes4.dex */
public final class k extends bw implements kx {
    private static final k zbb;
    private int zbd;
    private String zbe = "";
    private int zbf;

    static {
        k kVar = new k();
        zbb = kVar;
        bw.l(k.class, kVar);
    }

    private k() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001", new Object[]{"zbd", "zbe", "zbf"});
        }
        if (i16 == 3) {
            return new k();
        }
        i iVar = null;
        if (i16 == 4) {
            return new j(iVar);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
