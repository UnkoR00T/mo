package qi;

import com.google.android.gms.internal.mlkit_vision_text_bundled_common.bf;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.kk;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.kx;

/* JADX INFO: loaded from: classes4.dex */
public final class q3 extends bw implements kx {
    private static final q3 zbb;
    private int zbd;
    private int zbe;
    private com.google.android.gms.internal.mlkit_vision_text_bundled_common.x4 zbf;
    private kk zbg;
    private bf zbh;
    private a5 zbi;
    private byte zbj = 2;

    static {
        q3 q3Var = new q3();
        zbb = q3Var;
        bw.l(q3.class, q3Var);
    }

    private q3() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return Byte.valueOf(this.zbj);
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0001\u0001ဉ\u0002\u0002ဉ\u0003\u0003᠌\u0000\u0004ဉ\u0004\u0005ᐉ\u0001", new Object[]{"zbd", "zbg", "zbh", "zbe", p3.f166688a, "zbi", "zbf"});
        }
        if (i16 == 3) {
            return new q3();
        }
        n3 n3Var = null;
        if (i16 == 4) {
            return new o3(n3Var);
        }
        if (i16 == 5) {
            return zbb;
        }
        this.zbj = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
