package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class c7 extends bw implements kx {
    private static final c7 zbb;
    private int zbd = 0;
    private Object zbe;
    private int zbf;
    private float zbg;

    static {
        c7 c7Var = new c7();
        zbb = c7Var;
        bw.l(c7.class, c7Var);
    }

    private c7() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\f\u0002\u0001\u0003?\u0000\u0004Ȼ\u0000", new Object[]{"zbe", "zbd", "zbf", "zbg"});
        }
        if (i16 == 3) {
            return new c7();
        }
        f6 f6Var = null;
        if (i16 == 4) {
            return new b7(f6Var);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
