package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class sj extends bw implements kx {
    private static final sj zbb;
    private int zbd;
    private qj zbf;
    private ti zbg;
    private cb zbh;
    private bz zbk;
    private String zbe = "";
    private String zbi = "en";
    private int zbj = 1;
    private int zbl = -1;
    private String zbm = "";

    static {
        sj sjVar = new sj();
        zbb = sjVar;
        bw.l(sj.class, sjVar);
    }

    private sj() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003᠌\u0005\u0004ဉ\u0006\u0005ဉ\u0002\u0006ဈ\u0004\u0007င\u0007\bဉ\u0003\tဈ\b", new Object[]{"zbd", "zbe", "zbf", "zbj", rj.f30575a, "zbk", "zbg", "zbi", "zbl", "zbh", "zbm"});
        }
        if (i16 == 3) {
            return new sj();
        }
        nj njVar = null;
        if (i16 == 4) {
            return new oj(njVar);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
