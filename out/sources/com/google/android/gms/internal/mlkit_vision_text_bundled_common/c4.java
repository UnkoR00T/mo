package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class c4 extends bw implements kx {
    private static final c4 zbb;
    private int zbd;
    private float zbe = 0.01f;

    static {
        c4 c4Var = new c4();
        zbb = c4Var;
        bw.l(c4.class, c4Var);
    }

    private c4() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ခ\u0000", new Object[]{"zbd", "zbe"});
        }
        if (i16 == 3) {
            return new c4();
        }
        a4 a4Var = null;
        if (i16 == 4) {
            return new b4(a4Var);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
