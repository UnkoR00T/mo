package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class uo extends bw implements kx {
    private static final uo zbb;
    private int zbd;
    private int zbe;
    private vh zbf;
    private String zbg = "";

    static {
        uo uoVar = new uo();
        zbb = uoVar;
        bw.l(uo.class, uoVar);
    }

    private uo() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဈ\u0002", new Object[]{"zbd", "zbe", "zbf", "zbg"});
        }
        if (i16 == 3) {
            return new uo();
        }
        so soVar = null;
        if (i16 == 4) {
            return new to(soVar);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
