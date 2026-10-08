package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class p7 extends bw implements kx {
    private static final p7 zbb;
    private int zbd = 0;
    private Object zbe;
    private float zbf;

    static {
        p7 p7Var = new p7();
        zbb = p7Var;
        bw.l(p7.class, p7Var);
    }

    private p7() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u00017\u0000\u0002\u0001\u0003<\u0000", new Object[]{"zbe", "zbd", "zbf", n7.class});
        }
        if (i16 == 3) {
            return new p7();
        }
        l7 l7Var = null;
        if (i16 == 4) {
            return new o7(l7Var);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
