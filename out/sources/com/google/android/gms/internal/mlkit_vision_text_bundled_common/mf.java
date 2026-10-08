package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class mf extends bw implements kx {
    private static final mf zbb;
    private int zbd;
    private float zbe;

    static {
        mf mfVar = new mf();
        zbb = mfVar;
        bw.l(mf.class, mfVar);
    }

    private mf() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ခ\u0000", new Object[]{"zbd", "zbe"});
        }
        if (i16 == 3) {
            return new mf();
        }
        kf kfVar = null;
        if (i16 == 4) {
            return new lf(kfVar);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
