package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class t00 extends bw implements kx {
    private static final t00 zbb;
    private int zbd;
    private int zbe;
    private int zbf = 100;
    private int zbg;

    static {
        t00 t00Var = new t00();
        zbb = t00Var;
        bw.l(t00.class, t00Var);
    }

    private t00() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"zbd", "zbe", r00.f30572a, "zbf", "zbg"});
        }
        if (i16 == 3) {
            return new t00();
        }
        yy yyVar = null;
        if (i16 == 4) {
            return new s00(yyVar);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
