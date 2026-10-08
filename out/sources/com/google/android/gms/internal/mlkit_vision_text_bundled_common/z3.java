package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class z3 extends bw implements kx {
    private static final z3 zbb;
    private int zbd;
    private int zbe;
    private int zbf;
    private int zbg;
    private int zbh;
    private float zbi;
    private float zbj;
    private gw zbk = bw.z();
    private hw zbl = bw.A();
    private hw zbm = bw.A();

    static {
        z3 z3Var = new z3();
        zbb = z3Var;
        bw.l(z3.class, z3Var);
    }

    private z3() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0003\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005ခ\u0004\u0006ခ\u0005\u0007$\b'\t'", new Object[]{"zbd", "zbe", "zbf", "zbg", "zbh", "zbi", "zbj", "zbk", "zbl", "zbm"});
        }
        if (i16 == 3) {
            return new z3();
        }
        x3 x3Var = null;
        if (i16 == 4) {
            return new y3(x3Var);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
