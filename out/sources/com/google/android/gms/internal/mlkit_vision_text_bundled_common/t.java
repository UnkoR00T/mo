package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class t extends bw implements kx {
    private static final t zbb;
    private int zbd;
    private int zbe;
    private double zbf;
    private double zbg;
    private int zbh;
    private boolean zbi;
    private boolean zbj;
    private boolean zbk;
    private boolean zbl;
    private boolean zbm;
    private boolean zbn;
    private boolean zbo;
    private int zbp;
    private r zbq;
    private float zbr;
    private r zbs;
    private float zbt;
    private String zbu = "";

    static {
        t tVar = new t();
        zbb = tVar;
        bw.l(t.class, tVar);
    }

    private t() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u0011\u0000\u0001\u0001\u0011\u0011\u0000\u0000\u0000\u0001င\u0000\u0002က\u0001\u0003က\u0002\u0004᠌\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဇ\u0006\bဇ\u0007\tဇ\b\nဇ\t\u000bဇ\n\fင\u000b\rဉ\f\u000eခ\r\u000fဉ\u000e\u0010ခ\u000f\u0011ဈ\u0010", new Object[]{"zbd", "zbe", "zbf", "zbg", "zbh", s.f30624a, "zbi", "zbj", "zbk", "zbl", "zbm", "zbn", "zbo", "zbp", "zbq", "zbr", "zbs", "zbt", "zbu"});
        }
        if (i16 == 3) {
            return new t();
        }
        f fVar = null;
        if (i16 == 4) {
            return new p(fVar);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
