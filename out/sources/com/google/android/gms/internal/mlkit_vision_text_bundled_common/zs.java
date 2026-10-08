package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class zs extends bw implements kx {
    private static final zs zbb;
    private int zbd;
    private int zbe;
    private float zbg;
    private byte zbh = 2;
    private hw zbf = bw.A();

    static {
        zs zsVar = new zs();
        zbb = zsVar;
        bw.l(zs.class, zsVar);
    }

    private zs() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return Byte.valueOf(this.zbh);
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0002\u0001ᔄ\u0000\u0002ᔁ\u0001\u0003\u0016", new Object[]{"zbd", "zbe", "zbg", "zbf"});
        }
        if (i16 == 3) {
            return new zs();
        }
        lr lrVar = null;
        if (i16 == 4) {
            return new ys(lrVar);
        }
        if (i16 == 5) {
            return zbb;
        }
        this.zbh = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
