package qi;

import com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.kx;

/* JADX INFO: loaded from: classes4.dex */
public final class l3 extends bw implements kx {
    private static final l3 zbb;
    private int zbd;
    private String zbe = "";

    static {
        l3 l3Var = new l3();
        zbb = l3Var;
        bw.l(l3.class, l3Var);
    }

    private l3() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zbd", "zbe"});
        }
        if (i16 == 3) {
            return new l3();
        }
        i3 i3Var = null;
        if (i16 == 4) {
            return new k3(i3Var);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
