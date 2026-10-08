package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class p1 extends yv implements kx {
    private static final p1 zbd;
    private int zbe;
    private f1 zbf;
    private float zbh;
    private float zbi;
    private float zbj;
    private float zbk;
    private float zbl;
    private long zbo;
    private long zbp;
    private long zbq;
    private float zbr;
    private k1 zbs;
    private byte zbt = 2;
    private jw zbg = bw.C();
    private jw zbm = bw.C();
    private jw zbn = bw.C();

    static {
        p1 p1Var = new p1();
        zbd = p1Var;
        bw.l(p1.class, p1Var);
    }

    private p1() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return Byte.valueOf(this.zbt);
        }
        if (i16 == 2) {
            return bw.f(zbd, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0003\u0000\u0001ဉ\u0000\u0002\u001b\u0003ခ\u0001\u0004ခ\u0002\u0005ခ\u0003\u0006ခ\u0004\u0007\u001b\b\u001b\tဃ\u0007\nခ\t\u000bဃ\b\fဃ\u0006\rခ\u0005\u000eဉ\n", new Object[]{"zbe", "zbf", "zbg", o1.class, "zbh", "zbi", "zbj", "zbk", "zbm", i1.class, "zbn", c1.class, "zbp", "zbr", "zbq", "zbo", "zbl", "zbs"});
        }
        if (i16 == 3) {
            return new p1();
        }
        z0 z0Var = null;
        if (i16 == 4) {
            return new g1(z0Var);
        }
        if (i16 == 5) {
            return zbd;
        }
        this.zbt = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
