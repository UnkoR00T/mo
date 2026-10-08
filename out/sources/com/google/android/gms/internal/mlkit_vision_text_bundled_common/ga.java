package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class ga extends bw implements kx {
    private static final ga zbb;
    private int zbd;
    private uc zbe;
    private jw zbf = bw.C();

    static {
        ga gaVar = new ga();
        zbb = gaVar;
        bw.l(ga.class, gaVar);
    }

    private ga() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", new Object[]{"zbd", "zbe", "zbf", s8.class});
        }
        if (i16 == 3) {
            return new ga();
        }
        ea eaVar = null;
        if (i16 == 4) {
            return new fa(eaVar);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
