package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class bf extends bw implements kx {
    private static final bf zbb;
    private int zbd;
    private me zbe;
    private ue zbf;
    private qe zbg;
    private ye zbh;

    static {
        bf bfVar = new bf();
        zbb = bfVar;
        bw.l(bf.class, bfVar);
    }

    private bf() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"zbd", "zbe", "zbf", "zbg", "zbh"});
        }
        if (i16 == 3) {
            return new bf();
        }
        ze zeVar = null;
        if (i16 == 4) {
            return new af(zeVar);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
