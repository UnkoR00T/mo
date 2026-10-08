package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class z00 extends bw implements kx {
    private static final z00 zbb;
    private int zbd;
    private jw zbe = bw.C();
    private c10 zbf;
    private hz zbg;

    static {
        z00 z00Var = new z00();
        zbb = z00Var;
        bw.l(z00.class, z00Var);
    }

    private z00() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"zbd", "zbe", q10.class, "zbf", "zbg"});
        }
        if (i16 == 3) {
            return new z00();
        }
        yy yyVar = null;
        if (i16 == 4) {
            return new y00(yyVar);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
