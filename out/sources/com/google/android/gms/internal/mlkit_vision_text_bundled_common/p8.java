package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class p8 extends bw implements kx {
    private static final p8 zbb;
    private jw zbd = bw.C();

    static {
        p8 p8Var = new p8();
        zbb = p8Var;
        bw.l(p8.class, p8Var);
    }

    private p8() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zbd", m8.class});
        }
        if (i16 == 3) {
            return new p8();
        }
        n8 n8Var = null;
        if (i16 == 4) {
            return new o8(n8Var);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
