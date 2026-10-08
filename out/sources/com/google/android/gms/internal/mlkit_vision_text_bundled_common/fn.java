package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class fn extends bw implements kx {
    private static final fn zbb;
    private int zbd;
    private bn zbk;
    private int zbm;
    private int zbn;
    private po zbo;
    private ro zbp;
    private nn zbs;
    private int zbt;
    private byte zbw = 2;
    private String zbe = "";
    private String zbf = "";
    private jw zbg = bw.C();
    private jw zbh = bw.C();
    private jw zbi = bw.C();
    private jw zbj = bw.C();
    private jw zbl = bw.C();
    private jw zbq = bw.C();
    private String zbr = "";
    private jw zbu = bw.C();
    private jw zbv = bw.C();

    static {
        fn fnVar = new fn();
        zbb = fnVar;
        bw.l(fn.class, fnVar);
    }

    private fn() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return Byte.valueOf(this.zbw);
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0000\u0012\u0000\u0001\u0001ϭ\u0012\u0000\b\u0003\u0001Ȉ\u0002Ȉ\u0003Ț\u0004Ț\u0005Ț\u0006Ț\u0007ᐉ\u0000\b\u001b\t\u0004\n\u0004\u000bᐉ\u0001\fᐉ\u0002\r\u001b\u000eȈ\u000fဉ\u0003\u0010\u0004\u0011ȚϭȚ", new Object[]{"zbd", "zbe", "zbf", "zbg", "zbh", "zbi", "zbj", "zbk", "zbl", ku.class, "zbm", "zbn", "zbo", "zbp", "zbq", kn.class, "zbr", "zbs", "zbt", "zbu", "zbv"});
        }
        if (i16 == 3) {
            return new fn();
        }
        cn cnVar = null;
        if (i16 == 4) {
            return new en(cnVar);
        }
        if (i16 == 5) {
            return zbb;
        }
        this.zbw = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
