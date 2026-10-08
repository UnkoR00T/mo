package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class rz extends bw implements kx {
    private static final rz zbb;
    private int zbd;
    private int zbe;
    private int zbf;
    private int zbg;
    private int zbh = 2;

    static {
        rz rzVar = new rz();
        zbb = rzVar;
        bw.l(rz.class, rzVar);
    }

    private rz() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"zbd", "zbe", qz.f30570a, "zbf", "zbg", "zbh"});
        }
        if (i16 == 3) {
            return new rz();
        }
        yy yyVar = null;
        if (i16 == 4) {
            return new pz(yyVar);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
