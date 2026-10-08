package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class bz extends bw implements kx {
    private static final bz zbb;
    private int zbd;
    private int zbe;
    private q10 zbf;
    private x00 zbg;
    private z00 zbh;

    static {
        bz bzVar = new bz();
        zbb = bzVar;
        bw.l(bz.class, bzVar);
    }

    private bz() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0005ဉ\u0003", new Object[]{"zbd", "zbe", f00.f30413a, "zbf", "zbg", "zbh"});
        }
        if (i16 == 3) {
            return new bz();
        }
        yy yyVar = null;
        if (i16 == 4) {
            return new az(yyVar);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
