package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class d3 extends bw implements kx {
    private static final d3 zbb;
    private int zbd;
    private Object zbf;
    private int zbe = 0;
    private String zbg = "";

    static {
        d3 d3Var = new d3();
        zbb = d3Var;
        bw.l(d3.class, d3Var);
    }

    private d3() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000", new Object[]{"zbf", "zbe", "zbd", "zbg", u2.class, w2.class, k3.class, a3.class});
        }
        if (i16 == 3) {
            return new d3();
        }
        s2 s2Var = null;
        if (i16 == 4) {
            return new c3(s2Var);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
