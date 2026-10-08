package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class rd extends bw implements kx {
    private static final rd zbb;
    private int zbd;
    private String zbe = "";
    private String zbf = "";
    private int zbg = 1;

    static {
        rd rdVar = new rd();
        zbb = rdVar;
        bw.l(rd.class, rdVar);
    }

    private rd() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003᠌\u0002", new Object[]{"zbd", "zbe", "zbf", "zbg", qd.f30561a});
        }
        if (i16 == 3) {
            return new rd();
        }
        od odVar = null;
        if (i16 == 4) {
            return new pd(odVar);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
