package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class ie extends bw implements kx {
    private static final ie zbb;
    private int zbd;
    private int zbe = -1;
    private float zbf = 1.0f;
    private int zbg;

    static {
        ie ieVar = new ie();
        zbb = ieVar;
        bw.l(ie.class, ieVar);
    }

    private ie() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ခ\u0001\u0003င\u0002", new Object[]{"zbd", "zbe", "zbf", "zbg"});
        }
        if (i16 == 3) {
            return new ie();
        }
        de deVar = null;
        if (i16 == 4) {
            return new he(deVar);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
