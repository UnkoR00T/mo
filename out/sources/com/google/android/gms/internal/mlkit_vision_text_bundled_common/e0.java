package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class e0 extends bw implements kx {
    private static final e0 zbb;
    private int zbd;
    private int zbe;
    private int zbf;

    static {
        e0 e0Var = new e0();
        zbb = e0Var;
        bw.l(e0.class, e0Var);
    }

    private e0() {
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
            return new e0();
        }
        f fVar = null;
        if (i16 == 4) {
            return new d0(fVar);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
