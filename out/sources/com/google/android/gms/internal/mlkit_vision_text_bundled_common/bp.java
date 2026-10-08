package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class bp extends bw implements kx {
    private static final bp zbb;
    private int zbd;
    private ip zbe;
    private float zbf;
    private int zbg;
    private boolean zbh;

    static {
        bp bpVar = new bp();
        zbb = bpVar;
        bw.l(bp.class, bpVar);
    }

    private bp() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ခ\u0001\u0003᠌\u0002\u0004ဇ\u0003", new Object[]{"zbd", "zbe", "zbf", "zbg", ap.f30351a, "zbh"});
        }
        if (i16 == 3) {
            return new bp();
        }
        yo yoVar = null;
        if (i16 == 4) {
            return new zo(yoVar);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
