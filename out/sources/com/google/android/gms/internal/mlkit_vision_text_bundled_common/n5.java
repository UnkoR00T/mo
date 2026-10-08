package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class n5 extends bw implements kx {
    private static final n5 zbb;
    private int zbd;
    private Object zbf;
    private int zbe = 0;
    private String zbg = "";
    private String zbh = "";
    private yu zbi = yu.f30716b;

    static {
        n5 n5Var = new n5();
        zbb = n5Var;
        bw.l(n5.class, n5Var);
    }

    private n5() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003<\u0000\u0004<\u0000\u0005ည\u0002", new Object[]{"zbf", "zbe", "zbd", "zbg", "zbh", g5.class, b6.class, "zbi"});
        }
        if (i16 == 3) {
            return new n5();
        }
        l5 l5Var = null;
        if (i16 == 4) {
            return new m5(l5Var);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
