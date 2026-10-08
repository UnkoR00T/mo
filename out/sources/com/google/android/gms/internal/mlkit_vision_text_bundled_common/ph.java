package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class ph extends bw implements kx {
    private static final ph zbb;
    private int zbd;
    private float zbf;
    private boolean zbg;
    private bz zbi;
    private boolean zbj;
    private boolean zbk;
    private hw zbe = bw.A();
    private int zbh = 1;

    static {
        ph phVar = new ph();
        zbb = phVar;
        bw.l(ph.class, phVar);
    }

    private ph() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0001\u0000\u0001ࠞ\u0002ခ\u0000\u0003ဇ\u0001\u0004᠌\u0002\u0005ဉ\u0003\u0007ဇ\u0004\bဇ\u0005", new Object[]{"zbd", "zbe", lh.f30479a, "zbf", "zbg", "zbh", oh.f30547a, "zbi", "zbj", "zbk"});
        }
        if (i16 == 3) {
            return new ph();
        }
        mh mhVar = null;
        if (i16 == 4) {
            return new nh(mhVar);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
