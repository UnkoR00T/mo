package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class fz extends bw implements kx {
    private static final fz zbb;
    private int zbd;
    private x00 zbe;
    private jw zbf = bw.C();
    private jw zbg = bw.C();

    static {
        fz fzVar = new fz();
        zbb = fzVar;
        bw.l(fz.class, fzVar);
    }

    private fz() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001ဉ\u0000\u0002\u001b\u0003\u001b", new Object[]{"zbd", "zbe", "zbf", o10.class, "zbg", bz.class});
        }
        if (i16 == 3) {
            return new fz();
        }
        yy yyVar = null;
        if (i16 == 4) {
            return new ez(yyVar);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
