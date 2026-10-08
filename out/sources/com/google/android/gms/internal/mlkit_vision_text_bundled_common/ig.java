package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class ig extends bw implements kx {
    private static final ig zbb;
    private int zbd;
    private float zbe = 0.3f;

    static {
        ig igVar = new ig();
        zbb = igVar;
        bw.l(ig.class, igVar);
    }

    private ig() {
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
            return new ig();
        }
        gg ggVar = null;
        if (i16 == 4) {
            return new hg(ggVar);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
