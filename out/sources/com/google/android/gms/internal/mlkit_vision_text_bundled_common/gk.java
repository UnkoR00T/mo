package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class gk extends bw implements kx {
    private static final gk zbb;
    private int zbd;
    private fk zbg;
    private ti zbh;
    private ti zbi;
    private cb zbj;
    private float zbm;
    private boolean zbp;
    private bz zbq;
    private String zbe = "";
    private String zbf = "";
    private String zbk = "en";
    private int zbl = -1;
    private jw zbn = bw.C();
    private jw zbo = bw.C();
    private int zbr = -1;

    static {
        gk gkVar = new gk();
        zbb = gkVar;
        bw.l(gk.class, gkVar);
    }

    private gk() {
    }

    public static dk E() {
        return (dk) zbb.u();
    }

    static /* synthetic */ void G(gk gkVar, String str) {
        gkVar.zbd |= 1;
        gkVar.zbe = "PassThroughCoarseClassifier";
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u000e\u0000\u0001\u0001\u000f\u000e\u0000\u0002\u0000\u0001ဈ\u0000\u0002င\u0007\u0003ခ\b\u0004\u001a\u0005\u001a\u0006ဉ\u0002\bဇ\t\tဉ\n\nဉ\u0003\u000bဈ\u0006\fဉ\u0004\rင\u000b\u000eဉ\u0005\u000fဈ\u0001", new Object[]{"zbd", "zbe", "zbl", "zbm", "zbn", "zbo", "zbg", "zbp", "zbq", "zbh", "zbk", "zbi", "zbr", "zbj", "zbf"});
        }
        if (i16 == 3) {
            return new gk();
        }
        ck ckVar = null;
        if (i16 == 4) {
            return new dk(ckVar);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
