package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class i10 extends bw implements kx {
    private static final i10 zbb;
    private int zbd;
    private int zbg;
    private String zbe = "";
    private String zbf = "";
    private String zbh = "";

    static {
        i10 i10Var = new i10();
        zbb = i10Var;
        bw.l(i10.class, i10Var);
    }

    private i10() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004ဈ\u0003", new Object[]{"zbd", "zbe", "zbf", "zbg", "zbh"});
        }
        if (i16 == 3) {
            return new i10();
        }
        yy yyVar = null;
        if (i16 == 4) {
            return new h10(yyVar);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
