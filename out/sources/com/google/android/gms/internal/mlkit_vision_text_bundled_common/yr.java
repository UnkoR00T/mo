package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class yr extends bw implements kx {
    private static final yr zbb;
    private int zbd;
    private wr zbe;
    private double zbf;
    private boolean zbg;

    static {
        yr yrVar = new yr();
        zbb = yrVar;
        bw.l(yr.class, yrVar);
    }

    private yr() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002က\u0001\u0003ဇ\u0002", new Object[]{"zbd", "zbe", "zbf", "zbg"});
        }
        if (i16 == 3) {
            return new yr();
        }
        lr lrVar = null;
        if (i16 == 4) {
            return new xr(lrVar);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
