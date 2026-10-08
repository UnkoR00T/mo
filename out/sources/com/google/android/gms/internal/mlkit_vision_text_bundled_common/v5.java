package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class v5 extends bw implements kx {
    private static final v5 zbb;
    private int zbd;
    private float zbe;
    private float zbf;
    private float zbg;
    private float zbh;
    private y5 zbi;
    private float zbj;
    private g5 zbk;
    private float zbl;
    private yu zbm;
    private yu zbn;
    private byte zbo = 2;

    static {
        v5 v5Var = new v5();
        zbb = v5Var;
        bw.l(v5.class, v5Var);
    }

    private v5() {
        yu yuVar = yu.f30716b;
        this.zbm = yuVar;
        this.zbn = yuVar;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return Byte.valueOf(this.zbo);
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0004\u0001ᔁ\u0000\u0002ᔁ\u0001\u0003ᔁ\u0002\u0004ခ\u0003\u0005ခ\u0007\u0006ည\b\u0007ခ\u0005\bဉ\u0006\tᐉ\u0004\nည\t", new Object[]{"zbd", "zbe", "zbf", "zbg", "zbh", "zbl", "zbm", "zbj", "zbk", "zbi", "zbn"});
        }
        if (i16 == 3) {
            return new v5();
        }
        t5 t5Var = null;
        if (i16 == 4) {
            return new u5(t5Var);
        }
        if (i16 == 5) {
            return zbb;
        }
        this.zbo = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
