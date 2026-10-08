package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class es extends bw implements kx {
    private static final es zbb;
    private int zbd;
    private yu zbe;
    private yu zbf;
    private yu zbg;
    private nr zbh;
    private String zbi;
    private byte zbj = 2;

    static {
        es esVar = new es();
        zbb = esVar;
        bw.l(es.class, esVar);
    }

    private es() {
        yu yuVar = yu.f30716b;
        this.zbe = yuVar;
        this.zbf = yuVar;
        this.zbg = yuVar;
        this.zbi = "";
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return Byte.valueOf(this.zbj);
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0002\u0001ᔊ\u0000\u0002ည\u0001\u0003ည\u0002\u0004ᐉ\u0003\u0005ဈ\u0004", new Object[]{"zbd", "zbe", "zbf", "zbg", "zbh", "zbi"});
        }
        if (i16 == 3) {
            return new es();
        }
        lr lrVar = null;
        if (i16 == 4) {
            return new ds(lrVar);
        }
        if (i16 == 5) {
            return zbb;
        }
        this.zbj = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
