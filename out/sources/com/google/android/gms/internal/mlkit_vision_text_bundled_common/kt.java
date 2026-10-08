package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class kt extends bw implements kx {
    private static final kt zbb;
    private int zbd;
    private int zbe;
    private int zbf;
    private float zbg;
    private float zbh;
    private int zbi;
    private int zbj;
    private int zbk;
    private int zbl;
    private int zbm;
    private float zbo;
    private float zbq;
    private String zbn = "";
    private String zbp = "";
    private jw zbr = bw.C();
    private gw zbs = bw.z();
    private gw zbt = bw.z();
    private jw zbu = bw.C();
    private gw zbv = bw.z();
    private gw zbw = bw.z();

    static {
        kt ktVar = new kt();
        zbb = ktVar;
        bw.l(kt.class, ktVar);
    }

    private kt() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u0013\u0000\u0001\u0001\u0013\u0013\u0000\u0006\u0000\u0001င\u0000\u0002င\u0001\u0003ခ\u0002\u0004ခ\u0003\u0005င\u0004\u0006င\u0005\u0007င\u0006\bင\u0007\tင\b\nဈ\u000b\u000b\u001a\fဈ\t\rခ\n\u000eခ\f\u000f$\u0010$\u0011\u001a\u0012$\u0013$", new Object[]{"zbd", "zbe", "zbf", "zbg", "zbh", "zbi", "zbj", "zbk", "zbl", "zbm", "zbp", "zbr", "zbn", "zbo", "zbq", "zbs", "zbt", "zbu", "zbv", "zbw"});
        }
        if (i16 == 3) {
            return new kt();
        }
        lr lrVar = null;
        if (i16 == 4) {
            return new jt(lrVar);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
