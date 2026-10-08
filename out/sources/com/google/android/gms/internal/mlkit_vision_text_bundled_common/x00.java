package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class x00 extends bw implements kx {
    private static final x00 zbb;
    private int zbd;
    private String zbe = "";
    private e10 zbf;

    static {
        x00 x00Var = new x00();
        zbb = x00Var;
        bw.l(x00.class, x00Var);
    }

    private x00() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001", new Object[]{"zbd", "zbe", "zbf"});
        }
        if (i16 == 3) {
            return new x00();
        }
        yy yyVar = null;
        if (i16 == 4) {
            return new w00(yyVar);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
