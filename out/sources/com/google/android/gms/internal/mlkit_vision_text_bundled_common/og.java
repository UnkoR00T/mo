package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class og extends bw implements kx {
    private static final og zbb;
    private int zbd;
    private boolean zbe;
    private String zbf = "";
    private String zbg = "";

    static {
        og ogVar = new og();
        zbb = ogVar;
        bw.l(og.class, ogVar);
    }

    private og() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"zbd", "zbe", "zbf", "zbg"});
        }
        if (i16 == 3) {
            return new og();
        }
        mg mgVar = null;
        if (i16 == 4) {
            return new ng(mgVar);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
