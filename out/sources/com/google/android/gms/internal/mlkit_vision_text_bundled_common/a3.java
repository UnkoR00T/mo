package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class a3 extends bw implements kx {
    private static final a3 zbb;
    private jw zbd = bw.C();

    static {
        a3 a3Var = new a3();
        zbb = a3Var;
        bw.l(a3.class, a3Var);
    }

    private a3() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zbd", z2.class});
        }
        if (i16 == 3) {
            return new a3();
        }
        s2 s2Var = null;
        if (i16 == 4) {
            return new x2(s2Var);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
