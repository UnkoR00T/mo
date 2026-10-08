package qi;

import com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.jw;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.kx;

/* JADX INFO: loaded from: classes4.dex */
public final class e0 extends bw implements kx {
    private static final e0 zbb;
    private int zbd;
    private jw zbe = bw.C();
    private long zbf;

    static {
        e0 e0Var = new e0();
        zbb = e0Var;
        bw.l(e0.class, e0Var);
    }

    private e0() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001a\u0002ဂ\u0000", new Object[]{"zbd", "zbe", "zbf"});
        }
        if (i16 == 3) {
            return new e0();
        }
        c0 c0Var = null;
        if (i16 == 4) {
            return new d0(c0Var);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
