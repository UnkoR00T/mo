package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class k5 extends bw implements kx {
    private static final k5 zbb;
    private int zbd;
    private double zbe;
    private double zbf;
    private double zbh;
    private boolean zbi;
    private double zbj;
    private double zbk;
    private byte zbl = 2;
    private String zbg = "";

    static {
        k5 k5Var = new k5();
        zbb = k5Var;
        bw.l(k5.class, k5Var);
    }

    private k5() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return Byte.valueOf(this.zbl);
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0000\u0002\u0001ᔀ\u0000\u0002ᔀ\u0001\u0004က\u0005\u0005က\u0006\u0006ဇ\u0004\u0007က\u0003\bဈ\u0002", new Object[]{"zbd", "zbe", "zbf", "zbj", "zbk", "zbi", "zbh", "zbg"});
        }
        if (i16 == 3) {
            return new k5();
        }
        i5 i5Var = null;
        if (i16 == 4) {
            return new j5(i5Var);
        }
        if (i16 == 5) {
            return zbb;
        }
        this.zbl = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
