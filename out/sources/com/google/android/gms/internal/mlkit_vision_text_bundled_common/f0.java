package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class f0 extends bw implements kx {
    private static final f0 zbb;
    private int zbd;
    private int zbe;
    private int zbf;
    private int zbg;
    private int zbh;
    private int zbi;
    private jw zbj = bw.C();
    private jw zbk = bw.C();

    static {
        f0 f0Var = new f0();
        zbb = f0Var;
        bw.l(f0.class, f0Var);
    }

    private f0() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0002\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006\u001b\u0007\u001b", new Object[]{"zbd", "zbe", "zbf", "zbg", "zbh", "zbi", "zbj", e0.class, "zbk", e0.class});
        }
        if (i16 == 3) {
            return new f0();
        }
        f fVar = null;
        if (i16 == 4) {
            return new b0(fVar);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
