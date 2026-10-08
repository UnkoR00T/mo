package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class x10 extends bw implements kx {
    private static final x10 zbb;
    private int zbd;
    private int zbe;
    private int zbf;
    private gw zbg = bw.z();
    private int zbh;

    static {
        x10 x10Var = new x10();
        zbb = x10Var;
        bw.l(x10.class, x10Var);
    }

    private x10() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001င\u0000\u0002င\u0001\u0003$\u0004᠌\u0002", new Object[]{"zbd", "zbe", "zbf", "zbg", "zbh", w10.f30678a});
        }
        if (i16 == 3) {
            return new x10();
        }
        u10 u10Var = null;
        if (i16 == 4) {
            return new v10(u10Var);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
