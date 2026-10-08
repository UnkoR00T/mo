package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class pr extends bw implements kx {
    private static final pr zbb;
    private int zbd;
    private int zbe = -1;
    private int zbf = -1;
    private gw zbg = bw.z();
    private hw zbh = bw.A();
    private gw zbi = bw.z();

    static {
        pr prVar = new pr();
        zbb = prVar;
        bw.l(pr.class, prVar);
    }

    private pr() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0003\u0000\u0001င\u0000\u0002င\u0001\u0003\u0013\u0004\u0016\u0006\u0013", new Object[]{"zbd", "zbe", "zbf", "zbg", "zbh", "zbi"});
        }
        if (i16 == 3) {
            return new pr();
        }
        lr lrVar = null;
        if (i16 == 4) {
            return new or(lrVar);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
