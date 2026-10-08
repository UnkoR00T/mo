package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class be extends bw implements kx {
    private static final be zbb;
    private int zbd;
    private cb zbe;
    private ti zbf;
    private float zbi;
    private bz zbm;
    private String zbg = "en";
    private int zbh = -1;
    private jw zbj = bw.C();
    private jw zbk = bw.C();
    private int zbl = -1;

    static {
        be beVar = new be();
        zbb = beVar;
        bw.l(be.class, beVar);
    }

    private be() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0004\t\u0000\u0001\u0001\t\t\u0000\u0002\u0000\u0001ဉ\u0001\u0002ဈ\u0002\u0003င\u0003\u0004ခ\u0004\u0005\u001a\u0006\u001a\u0007င\u0005\bဉ\u0006\tဉ\u0000", new Object[]{"zbd", "zbf", "zbg", "zbh", "zbi", "zbj", "zbk", "zbl", "zbm", "zbe"});
        }
        if (i16 == 3) {
            return new be();
        }
        zd zdVar = null;
        if (i16 == 4) {
            return new ae(zdVar);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
