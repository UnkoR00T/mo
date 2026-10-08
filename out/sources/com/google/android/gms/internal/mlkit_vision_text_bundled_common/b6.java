package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class b6 extends bw implements kx {
    private static final b6 zbb;
    private int zbd;
    private float zbe;
    private yu zbf = yu.f30716b;

    static {
        b6 b6Var = new b6();
        zbb = b6Var;
        bw.l(b6.class, b6Var);
    }

    private b6() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ခ\u0000\u0002ည\u0001", new Object[]{"zbd", "zbe", "zbf"});
        }
        if (i16 == 3) {
            return new b6();
        }
        z5 z5Var = null;
        if (i16 == 4) {
            return new a6(z5Var);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
