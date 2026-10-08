package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class f1 extends bw implements kx {
    private static final f1 zbb;
    private int zbd;
    private float zbe;
    private float zbf;
    private float zbg;
    private float zbh;

    static {
        f1 f1Var = new f1();
        zbb = f1Var;
        bw.l(f1.class, f1Var);
    }

    private f1() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ခ\u0003", new Object[]{"zbd", "zbe", "zbf", "zbg", "zbh"});
        }
        if (i16 == 3) {
            return new f1();
        }
        z0 z0Var = null;
        if (i16 == 4) {
            return new e1(z0Var);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
