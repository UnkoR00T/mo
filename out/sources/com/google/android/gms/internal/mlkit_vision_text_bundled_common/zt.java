package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class zt extends bw implements kx {
    private static final zt zbb;
    private int zbd;
    private float zbe;
    private float zbf;
    private float zbg;
    private boolean zbl;
    private float zbm;
    private float zbn;
    private byte zbo = 2;
    private String zbh = "";
    private int zbi = -1;
    private float zbj = -1.0f;
    private float zbk = -1.0f;

    static {
        zt ztVar = new zt();
        zbb = ztVar;
        bw.l(zt.class, ztVar);
    }

    private zt() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return Byte.valueOf(this.zbo);
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\n\u0000\u0001\u0001\u000b\n\u0000\u0000\u0001\u0001ᔁ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ဈ\u0003\u0005င\u0004\u0007ခ\u0005\bခ\u0006\tဇ\u0007\nခ\b\u000bခ\t", new Object[]{"zbd", "zbe", "zbf", "zbg", "zbh", "zbi", "zbj", "zbk", "zbl", "zbm", "zbn"});
        }
        if (i16 == 3) {
            return new zt();
        }
        xt xtVar = null;
        if (i16 == 4) {
            return new yt(xtVar);
        }
        if (i16 == 5) {
            return zbb;
        }
        this.zbo = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
