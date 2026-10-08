package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class gr extends bw implements kx {
    private static final gr zbb;
    private int zbd;
    private int zbe;
    private int zbf;
    private int zbg;
    private String zbh = "";

    static {
        gr grVar = new gr();
        zbb = grVar;
        bw.l(gr.class, grVar);
    }

    private gr() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003ဏ\u0002\u0004ဈ\u0003", new Object[]{"zbd", "zbe", kr.f30473a, "zbf", jr.f30468a, "zbg", "zbh"});
        }
        if (i16 == 3) {
            return new gr();
        }
        er erVar = null;
        if (i16 == 4) {
            return new fr(erVar);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
