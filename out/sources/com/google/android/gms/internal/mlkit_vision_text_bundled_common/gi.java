package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class gi extends bw implements kx {
    private static final gi zbb;
    private int zbd;
    private int zbe;
    private float zbf;
    private String zbg = "";
    private String zbh = "";

    static {
        gi giVar = new gi();
        zbb = giVar;
        bw.l(gi.class, giVar);
    }

    private gi() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ခ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"zbd", "zbe", "zbf", "zbg", "zbh"});
        }
        if (i16 == 3) {
            return new gi();
        }
        ei eiVar = null;
        if (i16 == 4) {
            return new fi(eiVar);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
