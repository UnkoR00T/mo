package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class ic extends bw implements kx {
    private static final ic zbb;
    private int zbd;
    private s7 zbg;
    private cl zbh;
    private boolean zbk;
    private boolean zbe = true;
    private boolean zbf = true;
    private float zbi = 0.7f;
    private float zbj = 0.8f;

    static {
        ic icVar = new ic();
        zbb = icVar;
        bw.l(ic.class, icVar);
    }

    private ic() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဉ\u0002\u0003ဉ\u0003\u0004ဇ\u0001\u0005ခ\u0004\u0006ခ\u0005\u0007ဇ\u0006", new Object[]{"zbd", "zbe", "zbg", "zbh", "zbf", "zbi", "zbj", "zbk"});
        }
        if (i16 == 3) {
            return new ic();
        }
        gc gcVar = null;
        if (i16 == 4) {
            return new hc(gcVar);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
