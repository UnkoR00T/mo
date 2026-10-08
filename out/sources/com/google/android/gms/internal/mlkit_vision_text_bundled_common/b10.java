package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class b10 extends bw implements kx {
    private static final b10 zbb;
    private jw zbd = bw.C();

    static {
        b10 b10Var = new b10();
        zbb = b10Var;
        bw.l(b10.class, b10Var);
    }

    private b10() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zbd", d1.class});
        }
        if (i16 == 3) {
            return new b10();
        }
        zy zyVar = null;
        if (i16 == 4) {
            return new a00(zyVar);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
