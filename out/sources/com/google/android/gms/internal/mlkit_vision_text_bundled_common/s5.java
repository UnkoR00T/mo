package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class s5 extends bw implements kx {
    private static final s5 zbb;
    private int zbd;
    private long zbe;
    private int zbh;
    private int zbi;
    private k5 zbl;
    private yu zbm;
    private e6 zbn;
    private String zbo;
    private jw zbp;
    private jw zbq;
    private yu zbr;
    private String zbs;
    private byte zbt = 2;
    private String zbf = "";
    private String zbg = "";
    private jw zbj = bw.C();
    private String zbk = "";

    static {
        s5 s5Var = new s5();
        zbb = s5Var;
        bw.l(s5.class, s5Var);
    }

    private s5() {
        yu yuVar = yu.f30716b;
        this.zbm = yuVar;
        this.zbo = "";
        this.zbp = bw.C();
        this.zbq = bw.C();
        this.zbr = yuVar;
        this.zbs = "";
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return Byte.valueOf(this.zbt);
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u000f\u0000\u0001\u0001\u001c\u000f\u0000\u0003\u0004\u0001ᔂ\u0000\u0002б\u0010ဈ\u0001\u0011ဈ\u0002\u0012င\u0003\u0013င\u0004\u0014\u001a\u0015ဈ\u0005\u0016ည\u0007\u0017ᐉ\b\u0018ᐉ\u0006\u0019ည\n\u001aဈ\t\u001bဈ\u000b\u001c\u001b", new Object[]{"zbd", "zbe", "zbp", r5.class, "zbf", "zbg", "zbh", "zbi", "zbj", "zbk", "zbm", "zbn", "zbl", "zbr", "zbo", "zbs", "zbq", n5.class});
        }
        if (i16 == 3) {
            return new s5();
        }
        o5 o5Var = null;
        if (i16 == 4) {
            return new p5(o5Var);
        }
        if (i16 == 5) {
            return zbb;
        }
        this.zbt = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
