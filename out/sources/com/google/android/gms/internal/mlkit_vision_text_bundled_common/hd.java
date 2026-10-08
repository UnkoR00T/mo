package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class hd extends bw implements kx {
    private static final hd zbb;
    private int zbd;
    private float zbf;
    private int zbi;
    private float zbj;
    private jw zbe = bw.C();
    private boolean zbg = true;
    private float zbh = 0.8f;

    static {
        hd hdVar = new hd();
        zbb = hdVar;
        bw.l(hd.class, hdVar);
    }

    private hd() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001\u001a\u0002ခ\u0000\u0003ဇ\u0001\u0004ခ\u0002\u0005င\u0003\u0006ခ\u0004", new Object[]{"zbd", "zbe", "zbf", "zbg", "zbh", "zbi", "zbj"});
        }
        if (i16 == 3) {
            return new hd();
        }
        fd fdVar = null;
        if (i16 == 4) {
            return new gd(fdVar);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
