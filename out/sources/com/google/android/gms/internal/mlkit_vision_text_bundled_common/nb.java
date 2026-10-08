package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class nb extends bw implements kx {
    private static final nb zbb;
    private int zbd;
    private int zbe;
    private float zbf = 1.0f;

    static {
        nb nbVar = new nb();
        zbb = nbVar;
        bw.l(nb.class, nbVar);
    }

    private nb() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ခ\u0001", new Object[]{"zbd", "zbe", mb.f30498a, "zbf"});
        }
        if (i16 == 3) {
            return new nb();
        }
        l9 l9Var = null;
        if (i16 == 4) {
            return new ma(l9Var);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
