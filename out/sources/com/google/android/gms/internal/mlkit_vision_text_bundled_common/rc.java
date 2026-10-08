package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class rc extends bw implements kx {
    private static final rc zbb;
    private int zbd;
    private int zbf;
    private nb zbh;
    private double zbe = 1.0d;
    private float zbg = 0.3f;

    static {
        rc rcVar = new rc();
        zbb = rcVar;
        bw.l(rc.class, rcVar);
    }

    private rc() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001က\u0000\u0002င\u0001\u0003ခ\u0002\u0004ဉ\u0003", new Object[]{"zbd", "zbe", "zbf", "zbg", "zbh"});
        }
        if (i16 == 3) {
            return new rc();
        }
        pc pcVar = null;
        if (i16 == 4) {
            return new qc(pcVar);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
