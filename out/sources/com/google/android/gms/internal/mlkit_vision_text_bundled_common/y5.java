package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class y5 extends bw implements kx {
    private static final y5 zbb;
    private int zbd;
    private float zbe;
    private float zbf;
    private float zbg;
    private float zbh;
    private byte zbi = 2;

    static {
        y5 y5Var = new y5();
        zbb = y5Var;
        bw.l(y5.class, y5Var);
    }

    private y5() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return Byte.valueOf(this.zbi);
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0004\u0001ᔁ\u0000\u0002ᔁ\u0001\u0003ᔁ\u0002\u0004ᔁ\u0003", new Object[]{"zbd", "zbe", "zbf", "zbg", "zbh"});
        }
        if (i16 == 3) {
            return new y5();
        }
        w5 w5Var = null;
        if (i16 == 4) {
            return new x5(w5Var);
        }
        if (i16 == 5) {
            return zbb;
        }
        this.zbi = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
