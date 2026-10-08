package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class xc extends bw implements kx {
    private static final xc zbb;
    private int zbd;
    private int zbe;
    private int zbf;

    static {
        xc xcVar = new xc();
        zbb = xcVar;
        bw.l(xc.class, xcVar);
    }

    private xc() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"zbd", "zbe", "zbf"});
        }
        if (i16 == 3) {
            return new xc();
        }
        vc vcVar = null;
        if (i16 == 4) {
            return new wc(vcVar);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
