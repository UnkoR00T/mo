package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class e00 extends bw implements kx {
    private static final e00 zbb;
    private int zbd;
    private int zbe;
    private vz zbh;
    private int zbj;
    private int zbk;
    private int zbn;
    private jw zbf = bw.C();
    private int zbg = -1;
    private String zbi = "";
    private hw zbl = bw.A();
    private String zbm = "";

    static {
        e00 e00Var = new e00();
        zbb = e00Var;
        bw.l(e00.class, e00Var);
    }

    private e00() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0002\u0000\u0001᠌\u0000\u0002\u001b\u0003င\u0001\u0004ဉ\u0002\u0005ဈ\u0003\u0006᠌\u0004\u0007᠌\u0005\b'\tဈ\u0006\n᠌\u0007", new Object[]{"zbd", "zbe", yz.f30718a, "zbf", xz.class, "zbg", "zbh", "zbi", "zbj", b00.f30362a, "zbk", c00.f30370a, "zbl", "zbm", "zbn", d00.f30399a});
        }
        if (i16 == 3) {
            return new e00();
        }
        yy yyVar = null;
        if (i16 == 4) {
            return new zz(yyVar);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
