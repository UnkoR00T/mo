package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class c10 extends bw implements kx {
    private static final c10 zbb;
    private int zbd;
    private String zbe = "";
    private long zbf;
    private long zbg;
    private long zbh;

    static {
        c10 c10Var = new c10();
        zbb = c10Var;
        bw.l(c10.class, c10Var);
    }

    private c10() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003", new Object[]{"zbd", "zbe", "zbf", "zbg", "zbh"});
        }
        if (i16 == 3) {
            return new c10();
        }
        yy yyVar = null;
        if (i16 == 4) {
            return new a10(yyVar);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
