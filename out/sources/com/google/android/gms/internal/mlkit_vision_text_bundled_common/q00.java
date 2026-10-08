package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class q00 extends bw implements kx {
    private static final q00 zbb;
    private int zbd;
    private boolean zbf;
    private int zbg;
    private boolean zbj;
    private int zbm;
    private int zbn;
    private boolean zbo;
    private int zbe = -1;
    private yu zbh = yu.f30716b;
    private String zbi = "";
    private boolean zbk = true;
    private boolean zbl = true;

    static {
        q00 q00Var = new q00();
        zbb = q00Var;
        bw.l(q00.class, q00Var);
    }

    private q00() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            fw fwVar = o00.f30546a;
            fw fwVar2 = p00.f30549a;
            return bw.f(zbb, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001င\u0000\u0002ဇ\u0001\u0003᠌\u0002\u0004ည\u0003\u0005ဈ\u0004\u0006ဇ\u0005\u0007ဇ\u0006\bဇ\u0007\t᠌\b\n᠌\t\u000bဇ\n", new Object[]{"zbd", "zbe", "zbf", "zbg", fwVar, "zbh", "zbi", "zbj", "zbk", "zbl", "zbm", fwVar2, "zbn", fwVar2, "zbo"});
        }
        if (i16 == 3) {
            return new q00();
        }
        yy yyVar = null;
        if (i16 == 4) {
            return new n00(yyVar);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
