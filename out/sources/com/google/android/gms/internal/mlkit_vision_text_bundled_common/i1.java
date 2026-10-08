package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class i1 extends bw implements kx {
    private static final i1 zbb;
    private int zbd;
    private int zbe;
    private yu zbf = yu.f30716b;
    private String zbg = "";
    private float zbh;

    static {
        i1 i1Var = new i1();
        zbb = i1Var;
        bw.l(i1.class, i1Var);
    }

    private i1() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ည\u0001\u0003ဈ\u0002\u0004ခ\u0003", new Object[]{"zbd", "zbe", "zbf", "zbg", "zbh"});
        }
        if (i16 == 3) {
            return new i1();
        }
        z0 z0Var = null;
        if (i16 == 4) {
            return new h1(z0Var);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
