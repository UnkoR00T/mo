package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class nd extends bw implements kx {
    private static final nd zbb;
    private int zbd;
    private ad zbe;
    private gw zbf = bw.z();

    static {
        nd ndVar = new nd();
        zbb = ndVar;
        bw.l(nd.class, ndVar);
    }

    private nd() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u0013", new Object[]{"zbd", "zbe", "zbf"});
        }
        if (i16 == 3) {
            return new nd();
        }
        ld ldVar = null;
        if (i16 == 4) {
            return new md(ldVar);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
