package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class n7 extends bw implements kx {
    private static final n7 zbb;
    private float zbd;
    private float zbe;

    static {
        n7 n7Var = new n7();
        zbb = n7Var;
        bw.l(n7.class, n7Var);
    }

    private n7() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0001\u0002\u0001", new Object[]{"zbd", "zbe"});
        }
        if (i16 == 3) {
            return new n7();
        }
        l7 l7Var = null;
        if (i16 == 4) {
            return new m7(l7Var);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
