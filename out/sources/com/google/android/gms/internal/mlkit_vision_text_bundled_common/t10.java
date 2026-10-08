package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class t10 extends bw implements kx {
    private static final t10 zbb;
    private int zbd;
    private int zbe;
    private int zbf;
    private String zbg = "";

    static {
        t10 t10Var = new t10();
        zbb = t10Var;
        bw.l(t10.class, t10Var);
    }

    private t10() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002᠌\u0001\u0003ဈ\u0002", new Object[]{"zbd", "zbe", "zbf", r10.f30573a, "zbg"});
        }
        if (i16 == 3) {
            return new t10();
        }
        yy yyVar = null;
        if (i16 == 4) {
            return new s10(yyVar);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
