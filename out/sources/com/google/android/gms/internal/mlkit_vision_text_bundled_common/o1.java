package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class o1 extends bw implements kx {
    private static final o1 zbb;
    private int zbd;
    private float zbe;
    private float zbf;
    private float zbg;
    private int zbh = 15000;
    private int zbi;
    private float zbj;

    static {
        o1 o1Var = new o1();
        zbb = o1Var;
        bw.l(o1.class, o1Var);
    }

    private o1() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004᠌\u0003\u0005᠌\u0004\u0006ခ\u0005", new Object[]{"zbd", "zbe", "zbf", "zbg", "zbh", m1.f30497a, "zbi", n1.f30522a, "zbj"});
        }
        if (i16 == 3) {
            return new o1();
        }
        z0 z0Var = null;
        if (i16 == 4) {
            return new l1(z0Var);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
