package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class oz extends bw implements kx {
    private static final oz zbb;
    private int zbd;
    private String zbe = "";
    private int zbf = 1;
    private boolean zbg;
    private int zbh;

    static {
        oz ozVar = new oz();
        zbb = ozVar;
        bw.l(oz.class, ozVar);
    }

    private oz() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"zbd", "zbe", "zbf", nz.f30545a, "zbg", "zbh"});
        }
        if (i16 == 3) {
            return new oz();
        }
        yy yyVar = null;
        if (i16 == 4) {
            return new mz(yyVar);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
