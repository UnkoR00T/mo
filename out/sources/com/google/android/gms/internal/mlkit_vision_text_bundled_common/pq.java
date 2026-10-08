package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class pq extends bw implements kx {
    private static final pq zbb;
    private int zbd;
    private int zbe;
    private int zbf;
    private int zbg = 2;
    private float zbh;
    private boolean zbi;

    static {
        pq pqVar = new pq();
        zbb = pqVar;
        bw.l(pq.class, pqVar);
    }

    private pq() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004ခ\u0003\u0005ဇ\u0004", new Object[]{"zbd", "zbe", nq.f30526a, "zbf", uq.f30649a, "zbg", tq.f30639a, "zbh", "zbi"});
        }
        if (i16 == 3) {
            return new pq();
        }
        gq gqVar = null;
        if (i16 == 4) {
            return new oq(gqVar);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
