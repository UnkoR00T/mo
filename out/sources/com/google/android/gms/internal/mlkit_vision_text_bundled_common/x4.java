package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class x4 extends yv implements kx {
    private static final x4 zbd;
    private boolean zbA;
    private int zbe;
    private float zbi;
    private boolean zbl;
    private boolean zbm;
    private boolean zbn;
    private int zbo;
    private a5 zbp;
    private z3 zbq;
    private y0 zbr;
    private p4 zbs;
    private t4 zbt;
    private bz zbv;
    private boolean zbw;
    private boolean zbx;
    private int zby;
    private int zbz;
    private byte zbB = 2;
    private String zbf = "";
    private int zbg = 10;
    private int zbh = 1;
    private float zbj = 0.3f;
    private jw zbk = bw.C();
    private int zbu = 1;

    static {
        x4 x4Var = new x4();
        zbd = x4Var;
        bw.l(x4.class, x4Var);
    }

    private x4() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return Byte.valueOf(this.zbB);
        }
        if (i16 == 2) {
            return bw.f(zbd, "\u0001\u0016\u0000\u0001\u0001\u0017\u0016\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဋ\u0001\u0003ဋ\u0002\u0004ခ\u0003\u0005ခ\u0004\u0006\u001a\u0007ဇ\u0005\bဇ\u0006\tဇ\u0007\nဋ\b\u000bဉ\t\fဉ\n\rဉ\f\u000fင\u000e\u0010ဉ\r\u0011ဉ\u000f\u0012ဇ\u0010\u0013ဇ\u0011\u0014င\u0012\u0015ဉ\u000b\u0016᠌\u0013\u0017ဇ\u0014", new Object[]{"zbe", "zbf", "zbg", "zbh", "zbi", "zbj", "zbk", "zbl", "zbm", "zbn", "zbo", "zbp", "zbq", "zbs", "zbu", "zbt", "zbv", "zbw", "zbx", "zby", "zbr", "zbz", w4.f30679a, "zbA"});
        }
        if (i16 == 3) {
            return new x4();
        }
        q4 q4Var = null;
        if (i16 == 4) {
            return new r4(q4Var);
        }
        if (i16 == 5) {
            return zbd;
        }
        this.zbB = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
