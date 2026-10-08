package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class fb extends bw implements kx {
    private static final fb zbb;
    private int zbd;
    private cb zbe;
    private ib zbf;
    private lb zbg;

    static {
        fb fbVar = new fb();
        zbb = fbVar;
        bw.l(fb.class, fbVar);
    }

    private fb() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zbd", "zbe", "zbf", "zbg"});
        }
        if (i16 == 3) {
            return new fb();
        }
        db dbVar = null;
        if (i16 == 4) {
            return new eb(dbVar);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
