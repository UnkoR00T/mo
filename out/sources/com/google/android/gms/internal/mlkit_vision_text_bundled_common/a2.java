package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class a2 extends bw implements kx {
    private static final a2 zbb;
    private int zbd;
    private int zbe;
    private yu zbf = yu.f30716b;
    private float zbg;

    static {
        a2 a2Var = new a2();
        zbb = a2Var;
        bw.l(a2.class, a2Var);
    }

    private a2() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ည\u0001\u0003ခ\u0002", new Object[]{"zbd", "zbe", "zbf", "zbg"});
        }
        if (i16 == 3) {
            return new a2();
        }
        t1 t1Var = null;
        if (i16 == 4) {
            return new z1(t1Var);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
