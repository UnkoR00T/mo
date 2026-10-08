package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class w3 extends bw implements kx {
    private static final w3 zbb;
    private jw zbd = bw.C();

    static {
        w3 w3Var = new w3();
        zbb = w3Var;
        bw.l(w3.class, w3Var);
    }

    private w3() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zbd", t3.class});
        }
        if (i16 == 3) {
            return new w3();
        }
        u3 u3Var = null;
        if (i16 == 4) {
            return new v3(u3Var);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
