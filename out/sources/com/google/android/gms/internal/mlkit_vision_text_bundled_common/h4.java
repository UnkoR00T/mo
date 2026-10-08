package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class h4 extends bw implements kx {
    private static final h4 zbb;
    private int zbd;
    private float zbe = 10.0f;
    private float zbf = 10.0f;
    private float zbg = 5.0f;
    private float zbh = 5.0f;
    private float zbi = 10.0f;
    private float zbj = 10.0f;

    static {
        h4 h4Var = new h4();
        zbb = h4Var;
        bw.l(h4.class, h4Var);
    }

    private h4() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ခ\u0003\u0005ခ\u0004\u0006ခ\u0005", new Object[]{"zbd", "zbe", "zbf", "zbg", "zbh", "zbi", "zbj"});
        }
        if (i16 == 3) {
            return new h4();
        }
        a4 a4Var = null;
        if (i16 == 4) {
            return new f4(a4Var);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
