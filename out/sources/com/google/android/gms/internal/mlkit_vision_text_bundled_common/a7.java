package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class a7 extends bw implements kx {
    private static final a7 zbb;
    private int zbd = 0;
    private Object zbe;
    private float zbf;

    static {
        a7 a7Var = new a7();
        zbb = a7Var;
        bw.l(a7.class, a7Var);
    }

    private a7() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u00017\u0000\u00024\u0000\u0003Ȼ\u0000\u0004\u0001", new Object[]{"zbe", "zbd", "zbf"});
        }
        if (i16 == 3) {
            return new a7();
        }
        f6 f6Var = null;
        if (i16 == 4) {
            return new z6(f6Var);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
