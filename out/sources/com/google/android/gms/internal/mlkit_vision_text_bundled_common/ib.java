package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class ib extends bw implements kx {
    private static final ib zbb;
    private int zbd;
    private float zbg;
    private String zbe = "en";
    private int zbf = -1;
    private jw zbh = bw.C();
    private jw zbi = bw.C();

    static {
        ib ibVar = new ib();
        zbb = ibVar;
        bw.l(ib.class, ibVar);
    }

    private ib() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001ဈ\u0000\u0002င\u0001\u0003ခ\u0002\u0004\u001a\u0005\u001a", new Object[]{"zbd", "zbe", "zbf", "zbg", "zbh", "zbi"});
        }
        if (i16 == 3) {
            return new ib();
        }
        gb gbVar = null;
        if (i16 == 4) {
            return new hb(gbVar);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
