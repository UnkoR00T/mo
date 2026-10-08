package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class as extends bw implements kx {
    private static final as zbb;
    private gw zbA;
    private hw zbB;
    private float zbC;
    private int zbD;
    private int zbE;
    private byte zbF = 2;
    private int zbd;
    private nr zbe;
    private float zbf;
    private yu zbg;
    private yu zbh;
    private nr zbi;
    private int zbj;
    private jw zbk;
    private boolean zbl;
    private boolean zbm;
    private jw zbn;
    private String zbo;
    private String zbp;
    private jw zbq;
    private jw zbr;
    private int zbs;
    private int zbt;
    private float zbu;
    private float zbv;
    private float zbw;
    private int zbx;
    private qs zby;
    private jw zbz;

    static {
        as asVar = new as();
        zbb = asVar;
        bw.l(as.class, asVar);
    }

    private as() {
        yu yuVar = yu.f30716b;
        this.zbg = yuVar;
        this.zbh = yuVar;
        this.zbk = bw.C();
        this.zbn = bw.C();
        this.zbo = "";
        this.zbp = "";
        this.zbq = bw.C();
        this.zbr = bw.C();
        this.zbt = 1;
        this.zbz = bw.C();
        this.zbA = bw.z();
        this.zbB = bw.A();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return Byte.valueOf(this.zbF);
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u001b\u0000\u0001\u0001d\u001b\u0000\u0007\u0007\u0001ᔉ\u0000\u0002ခ\u0001\u0003ည\u0002\u0004ည\u0003\u0005င\u0005\u0006ᐉ\u0004\u0007Л\bဇ\u0006\tဇ\u0007\nЛ\u000bဈ\b\fЛ\rЛ\u000eင\n\u000f᠌\u000b\u0010ခ\u000e\u0011ဈ\t\u0012င\u000f\u0013ဉ\u0010\u0014Л\u0015\u0013\u0016\u0016\u0017ခ\f\u0018ခ\r\u0019ခ\u0011\u001aင\u0012dင\u0013", new Object[]{"zbd", "zbe", "zbf", "zbg", "zbh", "zbj", "zbi", "zbk", cs.class, "zbl", "zbm", "zbn", zt.class, "zbo", "zbq", nr.class, "zbr", sr.class, "zbs", "zbt", js.f30469a, "zbw", "zbp", "zbx", "zby", "zbz", nr.class, "zbA", "zbB", "zbu", "zbv", "zbC", "zbD", "zbE"});
        }
        if (i16 == 3) {
            return new as();
        }
        lr lrVar = null;
        if (i16 == 4) {
            return new zr(lrVar);
        }
        if (i16 == 5) {
            return zbb;
        }
        this.zbF = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
