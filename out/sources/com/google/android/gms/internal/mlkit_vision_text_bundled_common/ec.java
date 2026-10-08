package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class ec extends bw implements kx {
    private static final ec zbb;
    private int zbd;
    private String zbe = "";
    private String zbf = "";
    private String zbg = "";

    static {
        ec ecVar = new ec();
        zbb = ecVar;
        bw.l(ec.class, ecVar);
    }

    private ec() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"zbd", "zbe", "zbf", "zbg"});
        }
        if (i16 == 3) {
            return new ec();
        }
        bc bcVar = null;
        if (i16 == 4) {
            return new dc(bcVar);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
