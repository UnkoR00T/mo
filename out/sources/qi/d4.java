package qi;

import com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.jw;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.kx;

/* JADX INFO: loaded from: classes4.dex */
public final class d4 extends bw implements kx {
    private static final d4 zbb;
    private int zbd;
    private String zbe = "";
    private jw zbf = bw.C();
    private boolean zbg;

    static {
        d4 d4Var = new d4();
        zbb = d4Var;
        bw.l(d4.class, d4Var);
    }

    private d4() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001a\u0003ဇ\u0001", new Object[]{"zbd", "zbe", "zbf", "zbg"});
        }
        if (i16 == 3) {
            return new d4();
        }
        a4 a4Var = null;
        if (i16 == 4) {
            return new c4(a4Var);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
