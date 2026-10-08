package qi;

import com.google.android.gms.internal.mlkit_vision_text_bundled_common.be;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.gk;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.kx;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.ni;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.rc;

/* JADX INFO: loaded from: classes4.dex */
public final class n extends bw implements kx {
    private static final n zbb;
    private int zbd;
    private Object zbf;
    private boolean zbg;
    private gk zbh;
    private boolean zbi;
    private ni zbj;
    private float zbk;
    private boolean zbl;
    private boolean zbm;
    private boolean zbo;
    private float zbp;
    private int zbq;
    private rc zbr;
    private int zbe = 0;
    private byte zbs = 2;
    private int zbn = -1;

    static {
        n nVar = new n();
        zbb = nVar;
        bw.l(n.class, nVar);
    }

    private n() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return Byte.valueOf(this.zbs);
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0004\u000e\u0001\u0001\u0001\u000e\u000e\u0000\u0000\u0001\u0001м\u0000\u0002ဉ\u0001\u0003ဉ\u0003\u0004ဇ\u0006\u0005င\u0007\u0006ဇ\b\u0007ဇ\u0000\bခ\t\tင\n\nဇ\u0002\u000bဉ\u000b\fခ\u0004\rဇ\u0005\u000e<\u0000", new Object[]{"zbf", "zbe", "zbd", com.google.android.gms.internal.mlkit_vision_text_bundled_common.x4.class, "zbh", "zbj", "zbm", "zbn", "zbo", "zbg", "zbp", "zbq", "zbi", "zbr", "zbk", "zbl", be.class});
        }
        if (i16 == 3) {
            return new n();
        }
        l lVar = null;
        if (i16 == 4) {
            return new m(lVar);
        }
        if (i16 == 5) {
            return zbb;
        }
        this.zbs = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
