package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class mt extends bw implements kx {
    private static final mt zbb;
    private int zbA;
    private float zbB;
    private float zbD;
    private int zbE;
    private int zbd;
    private nr zbf;
    private nr zbg;
    private float zbi;
    private boolean zbl;
    private boolean zbn;
    private boolean zbq;
    private boolean zbr;
    private int zbs;
    private int zbt;
    private int zbu;
    private int zbv;
    private int zbw;
    private int zbx;
    private float zbz;
    private byte zbF = 2;
    private jw zbe = bw.C();
    private String zbh = "";
    private jw zbj = bw.C();
    private jw zbk = bw.C();
    private String zbm = "";
    private jw zbo = bw.C();
    private boolean zbp = true;
    private String zby = "";
    private int zbC = 1;

    static {
        mt mtVar = new mt();
        zbb = mtVar;
        bw.l(mt.class, mtVar);
    }

    private mt() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return Byte.valueOf(this.zbF);
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u001b\u0000\u0001\u0001\u001b\u001b\u0000\u0004\u0004\u0001Л\u0002ᔉ\u0000\u0003ᐉ\u0001\u0004ဈ\u0002\u0005ခ\u0003\u0006\u001b\u0007ဇ\u0004\bဈ\u0005\tЛ\nဇ\u0006\u000b\u001b\fဇ\u0007\rဇ\b\u000eဇ\t\u000fင\u000b\u0010င\f\u0011င\r\u0012င\u000e\u0013င\u000f\u0014ဈ\u0010\u0015ခ\u0011\u0016᠌\u0012\u0017᠌\u0014\u0018ခ\u0013\u0019ခ\u0015\u001aင\u0016\u001bင\n", new Object[]{"zbd", "zbe", xs.class, "zbf", "zbg", "zbh", "zbi", "zbk", pr.class, "zbl", "zbm", "zbj", sr.class, "zbn", "zbo", vs.class, "zbp", "zbq", "zbr", "zbt", "zbu", "zbv", "zbw", "zbx", "zby", "zbz", "zbA", h0.a(), "zbC", js.f30469a, "zbB", "zbD", "zbE", "zbs"});
        }
        if (i16 == 3) {
            return new mt();
        }
        lr lrVar = null;
        if (i16 == 4) {
            return new lt(lrVar);
        }
        if (i16 == 5) {
            return zbb;
        }
        this.zbF = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
