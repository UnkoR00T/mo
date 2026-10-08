package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class tk extends bw implements kx {
    private static final tk zbb;
    private int zbd;
    private gw zbe = bw.z();
    private yu zbf = yu.f30716b;

    static {
        tk tkVar = new tk();
        zbb = tkVar;
        bw.l(tk.class, tkVar);
    }

    private tk() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001$\u0002ည\u0000", new Object[]{"zbd", "zbe", "zbf"});
        }
        if (i16 == 3) {
            return new tk();
        }
        rk rkVar = null;
        if (i16 == 4) {
            return new sk(rkVar);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
