package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class e4 extends bw implements kx {
    private static final e4 zbb;
    private gw zbd = bw.z();
    private gw zbe = bw.z();
    private gw zbf = bw.z();
    private gw zbg = bw.z();
    private gw zbh = bw.z();
    private gw zbi = bw.z();

    static {
        e4 e4Var = new e4();
        zbb = e4Var;
        bw.l(e4.class, e4Var);
    }

    private e4() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0006\u0000\u0001\u0013\u0002\u0013\u0003\u0013\u0004\u0013\u0005\u0013\u0006\u0013", new Object[]{"zbd", "zbe", "zbf", "zbg", "zbh", "zbi"});
        }
        if (i16 == 3) {
            return new e4();
        }
        a4 a4Var = null;
        if (i16 == 4) {
            return new d4(a4Var);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
