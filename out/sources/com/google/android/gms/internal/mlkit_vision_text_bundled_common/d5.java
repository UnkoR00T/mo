package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class d5 extends bw implements kx {
    private static final d5 zbb;
    private int zbd = 0;
    private Object zbe;

    static {
        d5 d5Var = new d5();
        zbb = d5Var;
        bw.l(d5.class, d5Var);
    }

    private d5() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001;\u0000\u0002=\u0000", new Object[]{"zbe", "zbd"});
        }
        if (i16 == 3) {
            return new d5();
        }
        b5 b5Var = null;
        if (i16 == 4) {
            return new c5(b5Var);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
