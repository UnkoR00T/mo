package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class g5 extends bw implements kx {
    private static final g5 zbb;
    private gw zbd = bw.z();

    static {
        g5 g5Var = new g5();
        zbb = g5Var;
        bw.l(g5.class, g5Var);
    }

    private g5() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001$", new Object[]{"zbd"});
        }
        if (i16 == 3) {
            return new g5();
        }
        e5 e5Var = null;
        if (i16 == 4) {
            return new f5(e5Var);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
