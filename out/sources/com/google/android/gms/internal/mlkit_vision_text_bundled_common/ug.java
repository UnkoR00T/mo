package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class ug extends bw implements kx {
    private static final ug zbb;
    private int zbd;
    private boolean zbe;
    private float zbf = 0.8f;
    private int zbg;
    private int zbh;

    static {
        ug ugVar = new ug();
        zbb = ugVar;
        bw.l(ug.class, ugVar);
    }

    private ug() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဇ\u0000\u0002ခ\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"zbd", "zbe", "zbf", "zbg", "zbh"});
        }
        if (i16 == 3) {
            return new ug();
        }
        sg sgVar = null;
        if (i16 == 4) {
            return new tg(sgVar);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
