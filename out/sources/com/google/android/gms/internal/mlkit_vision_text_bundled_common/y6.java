package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class y6 extends bw implements kx {
    private static final y6 zbb;
    private int zbd = 0;
    private Object zbe;
    private float zbf;

    static {
        y6 y6Var = new y6();
        zbb = y6Var;
        bw.l(y6.class, y6Var);
    }

    private y6() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001?\u0000\u0002Ȼ\u0000\u0003\u0001", new Object[]{"zbe", "zbd", "zbf"});
        }
        if (i16 == 3) {
            return new y6();
        }
        f6 f6Var = null;
        if (i16 == 4) {
            return new x6(f6Var);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
