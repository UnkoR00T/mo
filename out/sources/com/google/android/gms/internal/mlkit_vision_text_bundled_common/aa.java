package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class aa extends bw implements kx {
    private static final aa zbb;
    private int zbd;
    private ga zbe;
    private wa zbf;
    private x9 zbg;
    private b9 zbh;
    private p8 zbi;
    private qa zbj;
    private h9 zbk;

    static {
        aa aaVar = new aa();
        zbb = aaVar;
        bw.l(aa.class, aaVar);
    }

    private aa() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဉ\u0006", new Object[]{"zbd", "zbe", "zbf", "zbg", "zbh", "zbi", "zbj", "zbk"});
        }
        if (i16 == 3) {
            return new aa();
        }
        y9 y9Var = null;
        if (i16 == 4) {
            return new z9(y9Var);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
