package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class bg extends bw implements kx {
    private static final bg zbb;
    private int zbd;
    private boolean zbe;
    private float zbf = 0.2f;
    private jw zbg = bw.C();

    static {
        bg bgVar = new bg();
        zbb = bgVar;
        bw.l(bg.class, bgVar);
    }

    private bg() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0000\u0001ဇ\u0000\u0002ခ\u0001\u0004\u001b", new Object[]{"zbd", "zbe", "zbf", "zbg", eg.class});
        }
        if (i16 == 3) {
            return new bg();
        }
        zf zfVar = null;
        if (i16 == 4) {
            return new ag(zfVar);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
