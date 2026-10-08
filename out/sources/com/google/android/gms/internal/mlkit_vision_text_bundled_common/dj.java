package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class dj extends bw implements kx {
    private static final dj zbb;
    private int zbd;
    private int zbe;
    private int zbf;
    private int zbg;
    private String zbh = "";
    private String zbi = "";

    static {
        dj djVar = new dj();
        zbb = djVar;
        bw.l(dj.class, djVar);
    }

    private dj() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဋ\u0001\u0003ဋ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"zbd", "zbe", "zbf", "zbg", "zbh", "zbi"});
        }
        if (i16 == 3) {
            return new dj();
        }
        aj ajVar = null;
        if (i16 == 4) {
            return new cj(ajVar);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
