package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class ts extends bw implements kx {
    private static final ts zbb;
    private int zbd;
    private float zbe;
    private float zbf;
    private float zbg;
    private float zbh;
    private float zbi;
    private float zbj;
    private float zbk;
    private float zbl;
    private float zbm;
    private float zbn;
    private float zbo;
    private float zbp;
    private int zbq;
    private float zbr;
    private float zbs;
    private float zbt;
    private boolean zbu;
    private boolean zbv;
    private boolean zbw;
    private int zbx;

    static {
        ts tsVar = new ts();
        zbb = tsVar;
        bw.l(ts.class, tsVar);
    }

    private ts() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u0014\u0000\u0001\u0001\u0014\u0014\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ခ\u0003\u0005ခ\u0004\u0006ခ\u0005\u0007ခ\u0006\bခ\u0007\tခ\b\nခ\t\u000bခ\n\fခ\u000b\rင\f\u000eခ\r\u000fခ\u000e\u0010ခ\u000f\u0011ဇ\u0010\u0012ဇ\u0011\u0013ဇ\u0012\u0014င\u0013", new Object[]{"zbd", "zbe", "zbf", "zbg", "zbh", "zbi", "zbj", "zbk", "zbl", "zbm", "zbn", "zbo", "zbp", "zbq", "zbr", "zbs", "zbt", "zbu", "zbv", "zbw", "zbx"});
        }
        if (i16 == 3) {
            return new ts();
        }
        lr lrVar = null;
        if (i16 == 4) {
            return new rs(lrVar);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
