package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class tt extends bw implements kx {
    private static final tt zbb;
    private int zbd;
    private jw zbe = bw.C();
    private jw zbf = bw.C();
    private int zbg;

    static {
        tt ttVar = new tt();
        zbb = ttVar;
        bw.l(tt.class, ttVar);
    }

    private tt() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u001b\u0002\u001b\u0003င\u0000", new Object[]{"zbd", "zbe", wt.class, "zbf", pt.class, "zbg"});
        }
        if (i16 == 3) {
            return new tt();
        }
        nt ntVar = null;
        if (i16 == 4) {
            return new st(ntVar);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
