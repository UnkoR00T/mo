package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class gp extends bw implements kx {
    private static final gp zbb;
    private int zbd;
    private float zbe;
    private float zbf;

    static {
        gp gpVar = new gp();
        zbb = gpVar;
        bw.l(gp.class, gpVar);
    }

    private gp() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001", new Object[]{"zbd", "zbe", "zbf"});
        }
        if (i16 == 3) {
            return new gp();
        }
        dp dpVar = null;
        if (i16 == 4) {
            return new fp(dpVar);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
