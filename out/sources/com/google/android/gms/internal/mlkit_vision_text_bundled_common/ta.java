package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class ta extends bw implements kx {
    private static final ta zbb;
    private int zbd;
    private ja zbe;
    private double zbf;
    private double zbg;

    static {
        ta taVar = new ta();
        zbb = taVar;
        bw.l(ta.class, taVar);
    }

    private ta() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u0000\u0003\u0000", new Object[]{"zbd", "zbe", "zbf", "zbg"});
        }
        if (i16 == 3) {
            return new ta();
        }
        ra raVar = null;
        if (i16 == 4) {
            return new sa(raVar);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
