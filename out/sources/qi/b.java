package qi;

import com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.gk;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.jw;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.kx;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends bw implements kx {
    private static final b zbb;
    private int zbd;
    private int zbf;
    private jw zbe = bw.C();
    private jw zbg = bw.C();

    static {
        b bVar = new b();
        zbb = bVar;
        bw.l(b.class, bVar);
    }

    private b() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u001b\u0002င\u0000\u0003\u001a", new Object[]{"zbd", "zbe", gk.class, "zbf", "zbg"});
        }
        if (i16 == 3) {
            return new b();
        }
        b5 b5Var = null;
        if (i16 == 4) {
            return new c5(b5Var);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
