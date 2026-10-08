package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class v6 extends bw implements kx {
    private static final v6 zbb;
    private int zbd;
    private Object zbf;
    private o6 zbg;
    private int zbe = 0;
    private dx zbm = dx.b();
    private String zbh = "";
    private String zbi = "";
    private String zbj = "";
    private jw zbk = bw.C();
    private jw zbl = bw.C();
    private jw zbn = bw.C();

    static {
        v6 v6Var = new v6();
        zbb = v6Var;
        bw.l(v6.class, v6Var);
    }

    private v6() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0000\t\u0001\u0001\u0001\u000b\t\u0001\u0003\u0000\u0001ဉ\u0000\u0002Ȉ\u0003\u001b\u0004\u001b\u0005<\u0000\b2\t\u001b\nȈ\u000bȈ", new Object[]{"zbf", "zbe", "zbd", "zbg", "zbh", "zbk", s6.class, "zbl", u6.class, m6.class, "zbm", p6.f30551a, "zbn", ku.class, "zbi", "zbj"});
        }
        if (i16 == 3) {
            return new v6();
        }
        f6 f6Var = null;
        if (i16 == 4) {
            return new q6(f6Var);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
