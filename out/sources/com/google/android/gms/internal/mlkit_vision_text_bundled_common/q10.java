package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class q10 extends bw implements kx {
    private static final q10 zbb;
    private int zbd;
    private int zbe;
    private g10 zbf;
    private k00 zbg;
    private jz zbh;
    private v00 zbi;
    private e00 zbj;
    private oz zbk;
    private t10 zbl;
    private rz zbm;
    private q00 zbn;
    private t00 zbo;
    private t00 zbp;
    private t00 zbq;
    private boolean zbr;
    private h00 zbs;
    private int zbt = -1;
    private boolean zbu;
    private m10 zbv;
    private lz zbw;

    static {
        q10 q10Var = new q10();
        zbb = q10Var;
        bw.l(q10.class, q10Var);
    }

    private q10() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u0013\u0000\u0001\u0001\u0013\u0013\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\n\u0007ဉ\u000b\bဉ\f\tဇ\r\nဉ\u0005\u000bဉ\u000e\fဉ\u0006\rဉ\u0007\u000eင\u000f\u000fဉ\b\u0010ဇ\u0010\u0011ဉ\u0011\u0012ဉ\t\u0013ဉ\u0012", new Object[]{"zbd", "zbe", sz.f30635a, "zbf", "zbg", "zbh", "zbi", "zbo", "zbp", "zbq", "zbr", "zbj", "zbs", "zbk", "zbl", "zbt", "zbm", "zbu", "zbv", "zbn", "zbw"});
        }
        if (i16 == 3) {
            return new q10();
        }
        yy yyVar = null;
        if (i16 == 4) {
            return new p10(yyVar);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
