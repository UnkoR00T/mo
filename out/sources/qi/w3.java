package qi;

import com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.jw;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.kx;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.lv;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class w3 extends bw implements kx {
    private static final w3 zbb;
    private int zbd;
    private int zbe;
    private String zbf = "";
    private jw zbg = bw.C();

    static {
        w3 w3Var = new w3();
        zbb = w3Var;
        bw.l(w3.class, w3Var);
    }

    private w3() {
    }

    public static w3 G(byte[] bArr, lv lvVar) {
        return (w3) bw.y(zbb, bArr, lvVar);
    }

    public final int E() {
        return this.zbe;
    }

    public final String H() {
        return this.zbf;
    }

    public final List I() {
        return this.zbg;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b", new Object[]{"zbd", "zbe", "zbf", "zbg", e.class});
        }
        if (i16 == 3) {
            return new w3();
        }
        u3 u3Var = null;
        if (i16 == 4) {
            return new v3(u3Var);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
