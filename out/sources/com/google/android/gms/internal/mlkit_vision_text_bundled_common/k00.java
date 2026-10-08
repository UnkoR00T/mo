package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class k00 extends bw implements kx {
    private static final k00 zbb;
    private int zbd;
    private boolean zbe;
    private int zbf;
    private int zbh;
    private int zbi;
    private int zbj;
    private int zbk;
    private boolean zbg = true;
    private String zbl = "";
    private String zbm = "";

    static {
        k00 k00Var = new k00();
        zbb = k00Var;
        bw.l(k00.class, k00Var);
    }

    private k00() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            fw fwVar = m00.f30496a;
            fw fwVar2 = i00.f30451a;
            fw fwVar3 = l00.f30478a;
            return bw.f(zbb, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဇ\u0000\u0002᠌\u0001\u0003ဇ\u0002\u0004᠌\u0003\u0005᠌\u0004\u0006᠌\u0005\u0007᠌\u0006\bဈ\u0007\tဈ\b", new Object[]{"zbd", "zbe", "zbf", fwVar, "zbg", "zbh", fwVar2, "zbi", fwVar3, "zbj", fwVar3, "zbk", fwVar3, "zbl", "zbm"});
        }
        if (i16 == 3) {
            return new k00();
        }
        yy yyVar = null;
        if (i16 == 4) {
            return new j00(yyVar);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
