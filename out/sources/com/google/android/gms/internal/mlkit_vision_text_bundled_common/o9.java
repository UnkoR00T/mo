package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class o9 extends bw implements kx {
    private static final o9 zbb;

    static {
        o9 o9Var = new o9();
        zbb = o9Var;
        bw.l(o9.class, o9Var);
    }

    private o9() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        m9 m9Var = null;
        if (i16 == 2) {
            return bw.f(zbb, "\u0000\u0000", null);
        }
        if (i16 == 3) {
            return new o9();
        }
        if (i16 == 4) {
            return new n9(m9Var);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
