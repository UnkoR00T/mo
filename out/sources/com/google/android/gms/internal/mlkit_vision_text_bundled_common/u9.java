package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class u9 extends bw implements kx {
    private static final u9 zbb;
    private int zbd;
    private ja zbe;
    private double zbf;

    static {
        u9 u9Var = new u9();
        zbb = u9Var;
        bw.l(u9.class, u9Var);
    }

    private u9() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u0000", new Object[]{"zbd", "zbe", "zbf"});
        }
        if (i16 == 3) {
            return new u9();
        }
        s9 s9Var = null;
        if (i16 == 4) {
            return new t9(s9Var);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
