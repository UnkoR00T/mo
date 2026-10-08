package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class fc extends bw implements kx {
    private static final fc zbb;
    private int zbA;
    private boolean zbB;
    private ec zbC;
    private int zbd;
    private boolean zbg;
    private xq zbh;
    private boolean zbi;
    private int zbj;
    private int zbk;
    private boolean zbl;
    private boolean zbm;
    private float zbn;
    private float zbo;
    private boolean zbp;
    private boolean zbq;
    private boolean zbt;
    private int zbu;
    private boolean zbv;
    private boolean zbx;
    private ir zby;
    private boolean zbz;
    private String zbe = "";
    private String zbf = "";
    private boolean zbr = true;
    private boolean zbs = true;
    private float zbw = 0.75f;

    static {
        fc fcVar = new fc();
        zbb = fcVar;
        bw.l(fc.class, fcVar);
    }

    private fc() {
    }

    public static cc E() {
        return (cc) zbb.u();
    }

    static /* synthetic */ void G(fc fcVar, String str) {
        fcVar.zbd |= 1;
        fcVar.zbe = str;
    }

    static /* synthetic */ void H(fc fcVar, String str) {
        fcVar.zbd |= 2;
        fcVar.zbf = str;
    }

    static /* synthetic */ void I(fc fcVar, boolean z15) {
        fcVar.zbd |= 4;
        fcVar.zbg = true;
    }

    static /* synthetic */ void J(fc fcVar, xq xqVar) {
        xqVar.getClass();
        fcVar.zbh = xqVar;
        fcVar.zbd |= 8;
    }

    static /* synthetic */ void K(fc fcVar, boolean z15) {
        fcVar.zbd |= 16;
        fcVar.zbi = true;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u0019\u0000\u0001\u0001\u001b\u0019\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ခ\t\u0004ဇ\u0007\u0005ခ\n\u0006ဇ\b\bင\u0016\tင\u0006\nဇ\u000b\u000bဇ\f\fဇ\r\rဇ\u000e\u000eဇ\u000f\u000fင\u0010\u0010ဇ\u0011\u0011ခ\u0012\u0012ဇ\u0013\u0013ဉ\u0014\u0014ဇ\u0002\u0015ဉ\u0018\u0016ဇ\u0017\u0017ဉ\u0003\u0018ဇ\u0004\u0019ဇ\u0015\u001bင\u0005", new Object[]{"zbd", "zbe", "zbf", "zbn", "zbl", "zbo", "zbm", "zbA", "zbk", "zbp", "zbq", "zbr", "zbs", "zbt", "zbu", "zbv", "zbw", "zbx", "zby", "zbg", "zbC", "zbB", "zbh", "zbi", "zbz", "zbj"});
        }
        if (i16 == 3) {
            return new fc();
        }
        bc bcVar = null;
        if (i16 == 4) {
            return new cc(bcVar);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
