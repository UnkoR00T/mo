package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class a20 extends yv implements kx {
    private static final a20 zbd;
    private int zbe;
    private double zbf;
    private int zbg;
    private int zbh;
    private double zbi;
    private double zbj;
    private byte zbk = 2;

    static {
        a20 a20Var = new a20();
        zbd = a20Var;
        bw.l(a20.class, a20Var);
    }

    private a20() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return Byte.valueOf(this.zbk);
        }
        if (i16 == 2) {
            return bw.f(zbd, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001က\u0000\u0002င\u0001\u0003င\u0002\u0004က\u0003\u0005က\u0004", new Object[]{"zbe", "zbf", "zbg", "zbh", "zbi", "zbj"});
        }
        if (i16 == 3) {
            return new a20();
        }
        y10 y10Var = null;
        if (i16 == 4) {
            return new z10(y10Var);
        }
        if (i16 == 5) {
            return zbd;
        }
        this.zbk = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
