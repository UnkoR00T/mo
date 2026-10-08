package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class d1 extends bw implements kx {
    private static final d1 zbb;
    private int zbd;
    private int zbf;
    private float zbh;
    private boolean zbi;
    private boolean zbj;
    private String zbe = "";
    private String zbg = "";

    static {
        d1 d1Var = new d1();
        zbb = d1Var;
        bw.l(d1.class, d1Var);
    }

    private d1() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003ဈ\u0002\u0004ခ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"zbd", "zbe", "zbf", "zbg", "zbh", "zbi", "zbj"});
        }
        if (i16 == 3) {
            return new d1();
        }
        b bVar = null;
        if (i16 == 4) {
            return new c0(bVar);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
