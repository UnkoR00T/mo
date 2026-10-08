package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class is extends yv implements kx {
    private static final is zbd;
    private int zbA;
    private float zbB;
    private boolean zbC;
    private int zbD;
    private int zbe;
    private nr zbg;
    private nr zbh;
    private nr zbi;
    private float zbk;
    private float zbn;
    private boolean zbp;
    private int zbr;
    private int zbs;
    private boolean zbt;
    private as zbu;
    private boolean zbv;
    private int zbw;
    private int zbx;
    private int zby;
    private tt zbz;
    private byte zbE = 2;
    private jw zbf = bw.C();
    private String zbj = "";
    private jw zbl = bw.C();
    private jw zbm = bw.C();
    private String zbo = "";
    private jw zbq = bw.C();

    static {
        is isVar = new is();
        zbd = isVar;
        bw.l(is.class, isVar);
    }

    private is() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return Byte.valueOf(this.zbE);
        }
        if (i16 == 2) {
            return bw.f(zbd, "\u0001\u0019\u0000\u0001\u0001d\u0019\u0000\u0004\u0006\u0001Л\u0002ᐉ\u0000\u0003ᐉ\u0001\u0004ဈ\u0003\u0005ခ\u0004\u0006\u001b\u0007ခ\u0005\bဈ\u0006\tЛ\nဇ\u0007\u000b\u001b\fင\b\rင\t\u000eဇ\n\u000fᐉ\u000b\u0010ဇ\f\u0011င\r\u0012င\u000e\u0013ᐉ\u0002\u0014င\u000f\u0015ဉ\u0010\u0016᠌\u0011\u0017ခ\u0012\u0018ဇ\u0013dင\u0014", new Object[]{"zbe", "zbf", mt.class, "zbg", "zbh", "zbj", "zbk", "zbm", pr.class, "zbn", "zbo", "zbl", sr.class, "zbp", "zbq", vs.class, "zbr", "zbs", "zbt", "zbu", "zbv", "zbw", "zbx", "zbi", "zby", "zbz", "zbA", h0.a(), "zbB", "zbC", "zbD"});
        }
        if (i16 == 3) {
            return new is();
        }
        lr lrVar = null;
        if (i16 == 4) {
            return new hs(lrVar);
        }
        if (i16 == 5) {
            return zbd;
        }
        this.zbE = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
