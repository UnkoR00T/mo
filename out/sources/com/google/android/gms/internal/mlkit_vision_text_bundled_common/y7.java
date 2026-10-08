package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class y7 extends bw implements kx {
    private static final y7 zbb;
    private int zbd;
    private int zbe;
    private boolean zbh;
    private int zbf = 100;
    private int zbg = -100;
    private float zbi = 40.0f;

    static {
        y7 y7Var = new y7();
        zbb = y7Var;
        bw.l(y7.class, y7Var);
    }

    private y7() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004ဇ\u0003\u0005ခ\u0004", new Object[]{"zbd", "zbe", "zbf", "zbg", "zbh", "zbi"});
        }
        if (i16 == 3) {
            return new y7();
        }
        w7 w7Var = null;
        if (i16 == 4) {
            return new x7(w7Var);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
