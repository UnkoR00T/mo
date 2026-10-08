package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class g7 extends bw implements kx {
    private static final g7 zbb;
    private gw zbd = bw.z();

    static {
        g7 g7Var = new g7();
        zbb = g7Var;
        bw.l(g7.class, g7Var);
    }

    private g7() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001$", new Object[]{"zbd"});
        }
        if (i16 == 3) {
            return new g7();
        }
        f6 f6Var = null;
        if (i16 == 4) {
            return new f7(f6Var);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
