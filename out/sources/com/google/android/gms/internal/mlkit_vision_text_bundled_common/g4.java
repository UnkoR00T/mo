package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class g4 extends bw implements kx {
    private static final g4 zbb;
    private int zbd;
    private wb zbe;
    private cu zbf;
    private String zbg = "";

    static {
        g4 g4Var = new g4();
        zbb = g4Var;
        bw.l(g4.class, g4Var);
    }

    private g4() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0002\u0003ဉ\u0001", new Object[]{"zbd", "zbe", "zbg", "zbf"});
        }
        if (i16 == 3) {
            return new g4();
        }
        e2 e2Var = null;
        if (i16 == 4) {
            return new f3(e2Var);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
