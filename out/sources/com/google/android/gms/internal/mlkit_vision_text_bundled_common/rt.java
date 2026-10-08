package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class rt extends bw implements kx {
    private static final rt zbb;
    private int zbd;
    private int zbe;
    private String zbf = "";
    private gw zbg = bw.z();
    private int zbh;
    private int zbi;
    private float zbj;

    static {
        rt rtVar = new rt();
        zbb = rtVar;
        bw.l(rt.class, rtVar);
    }

    private rt() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u0013\u0004င\u0002\u0005င\u0003\u0006ခ\u0004", new Object[]{"zbd", "zbe", "zbf", "zbg", "zbh", "zbi", "zbj"});
        }
        if (i16 == 3) {
            return new rt();
        }
        nt ntVar = null;
        if (i16 == 4) {
            return new qt(ntVar);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
