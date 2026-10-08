package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class h7 extends bw implements kx {
    private static final h7 zbb;
    private int zbd;
    private long zbh;
    private a7 zbl;
    private o6 zbm;
    private int zbo;
    private jw zbe = bw.C();
    private jw zbf = bw.C();
    private jw zbg = bw.C();
    private String zbi = "";
    private jw zbj = bw.C();
    private String zbk = "";
    private iw zbn = bw.B();

    static {
        h7 h7Var = new h7();
        zbb = h7Var;
        bw.l(h7.class, h7Var);
    }

    private h7() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0000\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0005\u0000\u0001\u001b\u0002\u001b\u0003\u0002\u0004Ȉ\u0005Ț\u0006Ȉ\u0007ဉ\u0001\b%\t\u0004\n\u001b\u000bဉ\u0000", new Object[]{"zbd", "zbe", c7.class, "zbf", e7.class, "zbh", "zbi", "zbj", "zbk", "zbm", "zbn", "zbo", "zbg", y6.class, "zbl"});
        }
        if (i16 == 3) {
            return new h7();
        }
        f6 f6Var = null;
        if (i16 == 4) {
            return new w6(f6Var);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
