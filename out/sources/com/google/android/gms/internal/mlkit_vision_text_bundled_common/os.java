package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class os extends bw implements kx {
    private static final os zbb;
    private int zbd;
    private boolean zbe;
    private boolean zbf;
    private boolean zbg;
    private boolean zbh = true;
    private boolean zbi;
    private boolean zbj;
    private boolean zbk;
    private float zbl;
    private boolean zbm;
    private boolean zbn;
    private boolean zbo;
    private boolean zbp;
    private int zbq;
    private boolean zbr;
    private gs zbs;
    private ts zbt;

    static {
        os osVar = new os();
        zbb = osVar;
        bw.l(os.class, osVar);
    }

    private os() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u0010\u0000\u0001\u0001\u0010\u0010\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0004\u0004ဇ\u0005\u0005ဇ\u0006\u0006ဇ\u0002\u0007ဇ\u0003\bခ\u0007\tဇ\b\nဇ\t\u000bဇ\n\fဇ\u000b\rင\f\u000eဇ\r\u000fဉ\u000e\u0010ဉ\u000f", new Object[]{"zbd", "zbe", "zbf", "zbi", "zbj", "zbk", "zbg", "zbh", "zbl", "zbm", "zbn", "zbo", "zbp", "zbq", "zbr", "zbs", "zbt"});
        }
        if (i16 == 3) {
            return new os();
        }
        lr lrVar = null;
        if (i16 == 4) {
            return new ns(lrVar);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
