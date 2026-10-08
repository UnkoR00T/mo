package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class kk extends bw implements kx {
    private static final kk zbb;
    private int zbd;
    private ti zbg;
    private ti zbh;
    private boolean zbi;
    private boolean zbj;
    private boolean zbk;
    private bz zbm;
    private String zbe = "";
    private String zbf = "";
    private int zbl = 1;

    static {
        kk kkVar = new kk();
        zbb = kkVar;
        bw.l(kk.class, kkVar);
    }

    private kk() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\t\u0000\u0001\u0001\n\t\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0005\u0003ဇ\u0006\u0004ဉ\u0002\u0006ဇ\u0004\u0007င\u0007\bဉ\b\tဉ\u0003\nဈ\u0001", new Object[]{"zbd", "zbe", "zbj", "zbk", "zbg", "zbi", "zbl", "zbm", "zbh", "zbf"});
        }
        if (i16 == 3) {
            return new kk();
        }
        hk hkVar = null;
        if (i16 == 4) {
            return new ik(hkVar);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
