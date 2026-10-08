package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class qi extends bw implements kx {
    private static final qi zbb;
    private int zbd;
    private Object zbf;
    private float zbg;
    private boolean zbi;
    private int zbe = 0;
    private String zbh = "";

    static {
        qi qiVar = new qi();
        zbb = qiVar;
        bw.l(qi.class, qiVar);
    }

    private qi() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0004\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001;\u0000\u0002ခ\u0000\u0003;\u0000\u0004ဈ\u0001\u0005ဇ\u0002", new Object[]{"zbf", "zbe", "zbd", "zbg", "zbh", "zbi"});
        }
        if (i16 == 3) {
            return new qi();
        }
        oi oiVar = null;
        if (i16 == 4) {
            return new pi(oiVar);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
