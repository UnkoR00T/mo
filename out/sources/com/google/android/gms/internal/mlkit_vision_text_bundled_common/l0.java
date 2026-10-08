package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class l0 extends bw implements kx {
    private static final l0 zbb;
    private int zbd;
    private int zbe;
    private int zbf;
    private int zbg = 1;
    private int zbh = 1;

    static {
        l0 l0Var = new l0();
        zbb = l0Var;
        bw.l(l0.class, l0Var);
    }

    private l0() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"zbd", "zbe", "zbf", "zbg", "zbh"});
        }
        if (i16 == 3) {
            return new l0();
        }
        f fVar = null;
        if (i16 == 4) {
            return new k0(fVar);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
