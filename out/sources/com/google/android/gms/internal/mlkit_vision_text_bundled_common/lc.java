package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class lc extends bw implements kx {
    private static final lc zbb;
    private int zbd;
    private int zbe;
    private int zbf;
    private int zbg;
    private boolean zbh;
    private int zbi;
    private boolean zbj;
    private int zbk;

    static {
        lc lcVar = new lc();
        zbb = lcVar;
        bw.l(lc.class, lcVar);
    }

    private lc() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004ဇ\u0003\u0005င\u0004\u0006ဇ\u0005\u0007င\u0006", new Object[]{"zbd", "zbe", "zbf", "zbg", "zbh", "zbi", "zbj", "zbk"});
        }
        if (i16 == 3) {
            return new lc();
        }
        jc jcVar = null;
        if (i16 == 4) {
            return new kc(jcVar);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
