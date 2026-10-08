package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class o10 extends bw implements kx {
    private static final o10 zbb;
    private int zbd;
    private int zbf;
    private boolean zbh;
    private int zbm;
    private String zbe = "";
    private String zbg = "";
    private String zbi = "";
    private jw zbj = bw.C();
    private jw zbk = bw.C();
    private jw zbl = bw.C();

    static {
        o10 o10Var = new o10();
        zbb = o10Var;
        bw.l(o10.class, o10Var);
    }

    private o10() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\t\u0000\u0001\u0001\n\t\u0000\u0003\u0000\u0001ဈ\u0000\u0002င\u0001\u0003\u001a\u0004\u001b\u0006ဈ\u0002\u0007ဇ\u0003\bဈ\u0004\t\u001a\nင\u0005", new Object[]{"zbd", "zbe", "zbf", "zbj", "zbk", i10.class, "zbg", "zbh", "zbi", "zbl", "zbm"});
        }
        if (i16 == 3) {
            return new o10();
        }
        yy yyVar = null;
        if (i16 == 4) {
            return new n10(yyVar);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
