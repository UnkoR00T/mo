package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class lp extends bw implements kx {
    private static final lp zbb;
    private int zbd;
    private float zbe;
    private float zbf;
    private float zbg;
    private float zbh;
    private float zbi;
    private long zbj;
    private byte zbk = 2;

    static {
        lp lpVar = new lp();
        zbb = lpVar;
        bw.l(lp.class, lpVar);
    }

    private lp() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return Byte.valueOf(this.zbk);
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0004\u0001ᔁ\u0000\u0002ᔁ\u0001\u0003ᔁ\u0002\u0004ᔁ\u0003\u0005ခ\u0004\u0006ဂ\u0005", new Object[]{"zbd", "zbe", "zbf", "zbg", "zbh", "zbi", "zbj"});
        }
        if (i16 == 3) {
            return new lp();
        }
        jp jpVar = null;
        if (i16 == 4) {
            return new kp(jpVar);
        }
        if (i16 == 5) {
            return zbb;
        }
        this.zbk = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
