package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class sf extends bw implements kx {
    private static final sf zbb;
    private int zbd;
    private ah zbe;
    private bp zbf;
    private oc zbg;
    private rg zbh;
    private yf zbi;
    private vf zbj;
    private lg zbk;
    private byte zbl = 2;

    static {
        sf sfVar = new sf();
        zbb = sfVar;
        bw.l(sf.class, sfVar);
    }

    private sf() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return Byte.valueOf(this.zbl);
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0001\u0001ဉ\u0000\u0002ဉ\u0001\u0003ᐉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဉ\u0006", new Object[]{"zbd", "zbe", "zbf", "zbg", "zbh", "zbi", "zbj", "zbk"});
        }
        if (i16 == 3) {
            return new sf();
        }
        qf qfVar = null;
        if (i16 == 4) {
            return new rf(qfVar);
        }
        if (i16 == 5) {
            return zbb;
        }
        this.zbl = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
