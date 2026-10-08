package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class r extends bw implements kx {
    private static final r zbb;
    private int zbd;
    private float zbe;
    private float zbf;

    static {
        r rVar = new r();
        zbb = rVar;
        bw.l(r.class, rVar);
    }

    private r() {
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
            return new r();
        }
        f fVar = null;
        if (i16 == 4) {
            return new q(fVar);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
