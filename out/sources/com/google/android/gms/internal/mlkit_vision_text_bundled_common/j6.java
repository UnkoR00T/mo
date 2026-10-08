package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class j6 extends bw implements kx {
    private static final j6 zbb;
    private int zbd;
    private hw zbe = bw.A();

    static {
        j6 j6Var = new j6();
        zbb = j6Var;
        bw.l(j6.class, j6Var);
    }

    private j6() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u0004\u0002'", new Object[]{"zbd", "zbe"});
        }
        if (i16 == 3) {
            return new j6();
        }
        f6 f6Var = null;
        if (i16 == 4) {
            return new h6(f6Var);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
