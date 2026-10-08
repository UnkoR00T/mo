package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class sq extends bw implements kx {
    private static final sq zbb;
    private int zbd;
    private int zbe;
    private int zbf;
    private int zbg;
    private int zbh;
    private float zbi;
    private byte zbj = 2;

    static {
        sq sqVar = new sq();
        zbb = sqVar;
        bw.l(sq.class, sqVar);
    }

    private sq() {
    }

    public static sq K() {
        return zbb;
    }

    public final float E() {
        return this.zbi;
    }

    public final int F() {
        return this.zbh;
    }

    public final int G() {
        return this.zbe;
    }

    public final int H() {
        return this.zbf;
    }

    public final int I() {
        return this.zbg;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return Byte.valueOf(this.zbj);
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0004\u0001ᔄ\u0000\u0002ᔄ\u0001\u0003ᔄ\u0002\u0004ᔄ\u0003\u0005ခ\u0004", new Object[]{"zbd", "zbe", "zbf", "zbg", "zbh", "zbi"});
        }
        if (i16 == 3) {
            return new sq();
        }
        gq gqVar = null;
        if (i16 == 4) {
            return new rq(gqVar);
        }
        if (i16 == 5) {
            return zbb;
        }
        this.zbj = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
