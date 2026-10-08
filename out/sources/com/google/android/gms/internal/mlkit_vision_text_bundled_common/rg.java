package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class rg extends bw implements kx {
    private static final rg zbb;
    private int zbd;
    private float zbe;
    private boolean zbf;
    private yu zbg = yu.f30716b;

    static {
        rg rgVar = new rg();
        zbb = rgVar;
        bw.l(rg.class, rgVar);
    }

    private rg() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ခ\u0000\u0002ဇ\u0001\u0003ည\u0002", new Object[]{"zbd", "zbe", "zbf", "zbg"});
        }
        if (i16 == 3) {
            return new rg();
        }
        pg pgVar = null;
        if (i16 == 4) {
            return new qg(pgVar);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
