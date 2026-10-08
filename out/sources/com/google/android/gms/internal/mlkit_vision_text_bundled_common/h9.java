package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class h9 extends bw implements kx {
    private static final h9 zbb;
    private int zbd = 0;
    private Object zbe;

    static {
        h9 h9Var = new h9();
        zbb = h9Var;
        bw.l(h9.class, h9Var);
    }

    private h9() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"zbe", "zbd", k9.class, r9.class});
        }
        if (i16 == 3) {
            return new h9();
        }
        f9 f9Var = null;
        if (i16 == 4) {
            return new g9(f9Var);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
