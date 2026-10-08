package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class g10 extends bw implements kx {
    private static final g10 zbb;
    private int zbd;
    private String zbe = "";
    private String zbf = "";
    private String zbg = "";
    private int zbh;
    private int zbi;
    private h00 zbj;
    private boolean zbk;
    private int zbl;
    private boolean zbm;
    private boolean zbn;
    private boolean zbo;
    private long zbp;

    static {
        g10 g10Var = new g10();
        zbb = g10Var;
        bw.l(g10.class, g10Var);
    }

    private g10() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004᠌\u0003\u0005င\u0004\u0006ဉ\u0005\u0007ဇ\u0006\b᠌\u0007\tဇ\b\nဇ\t\u000bဇ\n\fဂ\u000b", new Object[]{"zbd", "zbe", "zbf", "zbg", "zbh", j10.f30456a, "zbi", "zbj", "zbk", "zbl", k10.f30470a, "zbm", "zbn", "zbo", "zbp"});
        }
        if (i16 == 3) {
            return new g10();
        }
        yy yyVar = null;
        if (i16 == 4) {
            return new f10(yyVar);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
