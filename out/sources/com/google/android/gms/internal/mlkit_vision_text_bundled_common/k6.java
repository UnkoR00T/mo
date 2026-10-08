package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class k6 extends bw implements kx {
    private static final k6 zbb;
    private Object zbe;
    private int zbf;
    private int zbg;
    private int zbh;
    private int zbd = 0;
    private jw zbi = bw.C();

    static {
        k6 k6Var = new k6();
        zbb = k6Var;
        bw.l(k6.class, k6Var);
    }

    private k6() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0000\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0001\u0000\u0001\f\u0002<\u0000\u0003\u0004\u0004\u001b\u00057\u0000\u0006\u0004", new Object[]{"zbe", "zbd", "zbf", j6.class, "zbg", "zbi", ku.class, "zbh"});
        }
        if (i16 == 3) {
            return new k6();
        }
        f6 f6Var = null;
        if (i16 == 4) {
            return new g6(f6Var);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
