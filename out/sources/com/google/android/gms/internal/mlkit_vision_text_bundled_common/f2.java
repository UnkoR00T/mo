package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class f2 extends bw implements kx {
    private static final f2 zbb;
    private int zbd;
    private float zbe;
    private float zbf;
    private float zbg;
    private float zbh;
    private float zbi;
    private float zbj;
    private x1 zbk;
    private int zbl;
    private int zbm;
    private float zbn;

    static {
        f2 f2Var = new f2();
        zbb = f2Var;
        bw.l(f2.class, f2Var);
    }

    private f2() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\n\u0000\u0001\u0001\u000b\n\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004᠌\u0007\u0005᠌\b\u0006ခ\t\u0007ဉ\u0006\tခ\u0003\nခ\u0004\u000bခ\u0005", new Object[]{"zbd", "zbe", "zbf", "zbg", "zbl", c2.f30371a, "zbm", d2.f30400a, "zbn", "zbk", "zbh", "zbi", "zbj"});
        }
        if (i16 == 3) {
            return new f2();
        }
        t1 t1Var = null;
        if (i16 == 4) {
            return new b2(t1Var);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
