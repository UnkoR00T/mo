package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class ad extends bw implements kx {
    private static final ad zbb;
    private int zbd;
    private jw zbe = bw.C();
    private xc zbf;

    static {
        ad adVar = new ad();
        zbb = adVar;
        bw.l(ad.class, adVar);
    }

    private ad() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zbd", "zbe", yh.class, "zbf"});
        }
        if (i16 == 3) {
            return new ad();
        }
        yc ycVar = null;
        if (i16 == 4) {
            return new zc(ycVar);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
