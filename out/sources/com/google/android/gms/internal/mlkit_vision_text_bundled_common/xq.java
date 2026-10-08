package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class xq extends bw implements kx {
    private static final xq zbb;
    private int zbd;
    private br zbe;
    private double zbf;
    private double zbg;

    static {
        xq xqVar = new xq();
        zbb = xqVar;
        bw.l(xq.class, xqVar);
    }

    private xq() {
    }

    public static wq E() {
        return (wq) zbb.u();
    }

    static /* synthetic */ void G(xq xqVar, br brVar) {
        brVar.getClass();
        xqVar.zbe = brVar;
        xqVar.zbd |= 1;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u0000\u0003\u0000", new Object[]{"zbd", "zbe", "zbf", "zbg"});
        }
        if (i16 == 3) {
            return new xq();
        }
        vq vqVar = null;
        if (i16 == 4) {
            return new wq(vqVar);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
