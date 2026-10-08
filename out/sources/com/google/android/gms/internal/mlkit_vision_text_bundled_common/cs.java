package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class cs extends bw implements kx {
    private static final cs zbb;
    private int zbd;
    private es zbe;
    private float zbf;
    private byte zbh = 2;
    private gw zbg = bw.z();

    static {
        cs csVar = new cs();
        zbb = csVar;
        bw.l(cs.class, csVar);
    }

    private cs() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return Byte.valueOf(this.zbh);
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001ᐉ\u0000\u0002ခ\u0001\u0003\u0013", new Object[]{"zbd", "zbe", "zbf", "zbg"});
        }
        if (i16 == 3) {
            return new cs();
        }
        lr lrVar = null;
        if (i16 == 4) {
            return new bs(lrVar);
        }
        if (i16 == 5) {
            return zbb;
        }
        this.zbh = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
