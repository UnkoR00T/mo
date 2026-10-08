package qi;

import com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.jw;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.kx;

/* JADX INFO: loaded from: classes4.dex */
public final class a0 extends bw implements kx {
    private static final a0 zbb;
    private Object zbe;
    private int zbd = 0;
    private byte zbg = 2;
    private jw zbf = bw.C();

    static {
        a0 a0Var = new a0();
        zbb = a0Var;
        bw.l(a0.class, a0Var);
    }

    private a0() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return Byte.valueOf(this.zbg);
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0004\u0002\u0001\u0000\u0001\u0003\u0002\u0000\u0001\u0001\u0001:\u0000\u0003Л", new Object[]{"zbe", "zbd", "zbf", com.google.android.gms.internal.mlkit_vision_text_bundled_common.r2.class});
        }
        if (i16 == 3) {
            return new a0();
        }
        y yVar = null;
        if (i16 == 4) {
            return new z(yVar);
        }
        if (i16 == 5) {
            return zbb;
        }
        this.zbg = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
