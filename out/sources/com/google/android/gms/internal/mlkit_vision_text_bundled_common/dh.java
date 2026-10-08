package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class dh extends bw implements kx {
    private static final dh zbb;
    private int zbd;
    private float zbe = 0.7f;
    private int zbf = 2;
    private float zbg = 0.2f;

    static {
        dh dhVar = new dh();
        zbb = dhVar;
        bw.l(dh.class, dhVar);
    }

    private dh() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ခ\u0000\u0002င\u0001\u0003ခ\u0002", new Object[]{"zbd", "zbe", "zbf", "zbg"});
        }
        if (i16 == 3) {
            return new dh();
        }
        bh bhVar = null;
        if (i16 == 4) {
            return new ch(bhVar);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
