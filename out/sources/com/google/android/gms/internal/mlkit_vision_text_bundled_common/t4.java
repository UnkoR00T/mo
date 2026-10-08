package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class t4 extends bw implements kx {
    private static final t4 zbb;
    private int zbd;
    private String zbe = "";
    private yu zbf;
    private v4 zbg;
    private String zbh;
    private yu zbi;
    private v4 zbj;
    private String zbk;
    private yu zbl;
    private v4 zbm;
    private String zbn;
    private String zbo;
    private v4 zbp;

    static {
        t4 t4Var = new t4();
        zbb = t4Var;
        bw.l(t4.class, t4Var);
    }

    private t4() {
        yu yuVar = yu.f30716b;
        this.zbf = yuVar;
        this.zbh = "";
        this.zbi = yuVar;
        this.zbk = "";
        this.zbl = yuVar;
        this.zbn = "";
        this.zbo = "";
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ည\u0004\u0004ဈ\u0003\u0005ဈ\u0006\u0006ည\u0007\u0007ဈ\t\bဈ\n\tဉ\u0002\nဉ\u0005\u000bဉ\b\fဉ\u000b", new Object[]{"zbd", "zbe", "zbf", "zbi", "zbh", "zbk", "zbl", "zbn", "zbo", "zbg", "zbj", "zbm", "zbp"});
        }
        if (i16 == 3) {
            return new t4();
        }
        q4 q4Var = null;
        if (i16 == 4) {
            return new s4(q4Var);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
