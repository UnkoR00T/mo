package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class r2 extends yv implements kx {
    private static final r2 zbd;
    private int zbe;
    private Object zbg;
    private Object zbi;
    private yu zbl;
    private bz zbm;
    private int zbn;
    private int zbo;
    private boolean zbp;
    private int zbq;
    private yu zbr;
    private int zbf = 0;
    private int zbh = 0;
    private byte zbs = 2;
    private String zbj = "FaceAttributesClientBrainEmbedder";
    private String zbk = "";

    static {
        r2 r2Var = new r2();
        zbd = r2Var;
        bw.l(r2.class, r2Var);
    }

    private r2() {
        yu yuVar = yu.f30716b;
        this.zbl = yuVar;
        this.zbp = true;
        this.zbq = 1;
        this.zbr = yuVar;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return Byte.valueOf(this.zbs);
        }
        if (i16 == 2) {
            return bw.f(zbd, "\u0004\r\u0002\u0001\u0002\u0010\r\u0000\u0000\u0001\u0002<\u0000\u0003;\u0000\u0004ဇ\u0006\u0005᠌\u0007\u0007м\u0001\b;\u0001\tဈ\u0000\nဈ\u0001\fင\u0004\rဉ\u0003\u000eည\b\u000fည\u0002\u0010င\u0005", new Object[]{"zbg", "zbf", "zbi", "zbh", "zbe", s0.class, "zbp", "zbq", p2.f30550a, e3.class, "zbj", "zbk", "zbn", "zbm", "zbr", "zbl", "zbo"});
        }
        if (i16 == 3) {
            return new r2();
        }
        o2 o2Var = null;
        if (i16 == 4) {
            return new q2(o2Var);
        }
        if (i16 == 5) {
            return zbd;
        }
        this.zbs = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
