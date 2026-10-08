package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class cu extends bw implements kx {
    private static final cu zbb;
    private int zbd;
    private float zbf;
    private String zbe = "";
    private int zbg = 1;

    static {
        cu cuVar = new cu();
        zbb = cuVar;
        bw.l(cu.class, cuVar);
    }

    private cu() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ခ\u0001\u0003င\u0002", new Object[]{"zbd", "zbe", "zbf", "zbg"});
        }
        if (i16 == 3) {
            return new cu();
        }
        au auVar = null;
        if (i16 == 4) {
            return new bu(auVar);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
