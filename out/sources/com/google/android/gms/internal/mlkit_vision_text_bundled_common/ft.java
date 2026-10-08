package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class ft extends bw implements kx {
    private static final ft zbb;
    private int zbd;
    private nr zbe;
    private int zbh;
    private int zbi;
    private byte zbj = 2;
    private String zbf = "";
    private hw zbg = bw.A();

    static {
        ft ftVar = new ft();
        zbb = ftVar;
        bw.l(ft.class, ftVar);
    }

    private ft() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return Byte.valueOf(this.zbj);
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001ᐉ\u0000\u0002ဈ\u0001\u0003\u0016\u0004င\u0002\u0005᠌\u0003", new Object[]{"zbd", "zbe", "zbf", "zbg", "zbh", "zbi", h0.a()});
        }
        if (i16 == 3) {
            return new ft();
        }
        lr lrVar = null;
        if (i16 == 4) {
            return new et(lrVar);
        }
        if (i16 == 5) {
            return zbb;
        }
        this.zbj = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
