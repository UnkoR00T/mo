package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class v0 extends bw implements kx {
    private static final v0 zbb;
    private int zbd;
    private gw zbe = bw.z();
    private gw zbf = bw.z();
    private int zbg;
    private int zbh;
    private int zbi;
    private int zbj;

    static {
        v0 v0Var = new v0();
        zbb = v0Var;
        bw.l(v0.class, v0Var);
    }

    private v0() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0002\u0000\u0001\u0013\u0002\u0013\u0003ဋ\u0000\u0004ဋ\u0001\u0005ဋ\u0002\u0006ဋ\u0003", new Object[]{"zbd", "zbe", "zbf", "zbg", "zbh", "zbi", "zbj"});
        }
        if (i16 == 3) {
            return new v0();
        }
        t0 t0Var = null;
        if (i16 == 4) {
            return new u0(t0Var);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
