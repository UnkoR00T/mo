package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class xd extends bw implements kx {
    private static final xd zbb;
    private int zbd;
    private yu zbe = yu.f30716b;
    private float zbf;
    private di zbg;
    private long zbh;

    static {
        xd xdVar = new xd();
        zbb = xdVar;
        bw.l(xd.class, xdVar);
    }

    private xd() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ည\u0000\u0002ခ\u0001\u0003ဉ\u0002\u0004ဂ\u0003", new Object[]{"zbd", "zbe", "zbf", "zbg", "zbh"});
        }
        if (i16 == 3) {
            return new xd();
        }
        ud udVar = null;
        if (i16 == 4) {
            return new wd(udVar);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
