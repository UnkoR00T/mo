package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class gn extends bw implements kx {
    private static final gn zbb;
    private int zbd;
    private int zbh;
    private int zbn;
    private boolean zbo;
    private po zbp;
    private ro zbq;
    private nn zbs;
    private qn zbv;
    private byte zbx = 2;
    private jw zbe = bw.C();
    private jw zbf = bw.C();
    private jw zbg = bw.C();
    private jw zbi = bw.C();
    private jw zbj = bw.C();
    private jw zbk = bw.C();
    private jw zbl = bw.C();
    private jw zbm = bw.C();
    private jw zbr = bw.C();
    private String zbt = "";
    private String zbu = "";
    private jw zbw = bw.C();

    static {
        gn gnVar = new gn();
        zbb = gnVar;
        bw.l(gn.class, gnVar);
    }

    private gn() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return Byte.valueOf(this.zbx);
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0000\u0013\u0000\u0001\u0001Ϫ\u0013\u0000\n\b\u0001Л\u0006Л\u0007Л\b\u0004\tЛ\nȚ\u000b\u0004\fᐉ\u0000\rᐉ\u0001\u000eЛ\u000fȚ\u0010Ț\u0011Ț\u0012ဉ\u0002\u0013Ȉ\u0014Ȉ\u0015\u0007ϩᐉ\u0003Ϫ\u001b", new Object[]{"zbd", "zbe", fn.class, "zbf", ao.class, "zbg", go.class, "zbh", "zbi", lo.class, "zbj", "zbn", "zbp", "zbq", "zbr", in.class, "zbk", "zbl", "zbm", "zbs", "zbt", "zbu", "zbo", "zbv", "zbw", ku.class});
        }
        if (i16 == 3) {
            return new gn();
        }
        cn cnVar = null;
        if (i16 == 4) {
            return new dn(cnVar);
        }
        if (i16 == 5) {
            return zbb;
        }
        this.zbx = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
