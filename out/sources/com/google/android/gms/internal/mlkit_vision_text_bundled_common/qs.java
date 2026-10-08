package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class qs extends bw implements kx {
    private static final qs zbb;
    private int zbd;
    private float zbf;
    private float zbg;
    private float zbh;
    private float zbi;
    private float zbk;
    private float zbl;
    private boolean zbm;
    private int zbe = 1;
    private float zbj = 1.0f;

    static {
        qs qsVar = new qs();
        zbb = qsVar;
        bw.l(qs.class, qsVar);
    }

    private qs() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001င\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ခ\u0003\u0005ခ\u0004\u0006ခ\u0005\u0007ခ\u0006\bခ\u0007\tဇ\b", new Object[]{"zbd", "zbe", "zbf", "zbg", "zbh", "zbi", "zbj", "zbk", "zbl", "zbm"});
        }
        if (i16 == 3) {
            return new qs();
        }
        lr lrVar = null;
        if (i16 == 4) {
            return new ps(lrVar);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
