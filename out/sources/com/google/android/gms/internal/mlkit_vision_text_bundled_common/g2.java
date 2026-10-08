package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class g2 extends yv implements kx {
    private static final g2 zbd;
    private int zbe;
    private x1 zbf;
    private float zbh;
    private float zbi;
    private x1 zbl;
    private p1 zbm;
    private byte zbo = 2;
    private jw zbg = bw.C();
    private jw zbj = bw.C();
    private yu zbk = yu.f30716b;
    private jw zbn = bw.C();

    static {
        g2 g2Var = new g2();
        zbd = g2Var;
        bw.l(g2.class, g2Var);
    }

    private g2() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return Byte.valueOf(this.zbo);
        }
        if (i16 == 2) {
            return bw.f(zbd, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0003\u0001\u0001ဉ\u0000\u0002\u001b\u0003ခ\u0001\u0004\u001b\u0005ᐉ\u0005\u0006\u001b\u0007ည\u0003\bဉ\u0004\tခ\u0002", new Object[]{"zbe", "zbf", "zbg", f2.class, "zbh", "zbj", a2.class, "zbm", "zbn", v1.class, "zbk", "zbl", "zbi"});
        }
        if (i16 == 3) {
            return new g2();
        }
        t1 t1Var = null;
        if (i16 == 4) {
            return new y1(t1Var);
        }
        if (i16 == 5) {
            return zbd;
        }
        this.zbo = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
