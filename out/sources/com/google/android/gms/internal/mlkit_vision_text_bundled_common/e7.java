package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class e7 extends bw implements kx {
    private static final e7 zbb;
    private int zbd = 0;
    private Object zbe;
    private float zbf;

    static {
        e7 e7Var = new e7();
        zbb = e7Var;
        bw.l(e7.class, e7Var);
    }

    private e7() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001?\u0000\u0002Ȼ\u0000\u0003\u0001\u0004<\u0000", new Object[]{"zbe", "zbd", "zbf", g7.class});
        }
        if (i16 == 3) {
            return new e7();
        }
        f6 f6Var = null;
        if (i16 == 4) {
            return new d7(f6Var);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
