package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class xz extends bw implements kx {
    private static final xz zbb;
    private int zbd;
    private int zbe;
    private long zbf;

    static {
        xz xzVar = new xz();
        zbb = xzVar;
        bw.l(xz.class, xzVar);
    }

    private xz() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဂ\u0001", new Object[]{"zbd", "zbe", yz.f30718a, "zbf"});
        }
        if (i16 == 3) {
            return new xz();
        }
        yy yyVar = null;
        if (i16 == 4) {
            return new wz(yyVar);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
