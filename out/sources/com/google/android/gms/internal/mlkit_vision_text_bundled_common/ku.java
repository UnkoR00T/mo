package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class ku extends bw implements kx {
    private static final ku zbb;
    private String zbd = "";
    private yu zbe = yu.f30716b;

    static {
        ku kuVar = new ku();
        zbb = kuVar;
        bw.l(ku.class, kuVar);
    }

    private ku() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return new tx(zbb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\n", new Object[]{"zbd", "zbe"});
        }
        if (i16 == 3) {
            return new ku();
        }
        iu iuVar = null;
        if (i16 == 4) {
            return new ju(iuVar);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
