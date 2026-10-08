package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class mq extends bw implements kx {
    private static final mq zbb;
    private int zbd;
    private kq zbe;
    private double zbf;
    private boolean zbg;
    private sq zbh;
    private byte zbi = 2;

    static {
        mq mqVar = new mq();
        zbb = mqVar;
        bw.l(mq.class, mqVar);
    }

    private mq() {
    }

    public static mq F() {
        return zbb;
    }

    public final sq G() {
        sq sqVar = this.zbh;
        return sqVar == null ? sq.K() : sqVar;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return Byte.valueOf(this.zbi);
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001ဉ\u0000\u0002က\u0001\u0003ဇ\u0002\u0004ᐉ\u0003", new Object[]{"zbd", "zbe", "zbf", "zbg", "zbh"});
        }
        if (i16 == 3) {
            return new mq();
        }
        gq gqVar = null;
        if (i16 == 4) {
            return new lq(gqVar);
        }
        if (i16 == 5) {
            return zbb;
        }
        this.zbi = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
