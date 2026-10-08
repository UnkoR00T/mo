package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class b9 extends bw implements kx {
    private static final b9 zbb;
    private jw zbd = bw.C();
    private jw zbe = bw.C();

    static {
        b9 b9Var = new b9();
        zbb = b9Var;
        bw.l(b9.class, b9Var);
    }

    private b9() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"zbd", v8.class, "zbe", y8.class});
        }
        if (i16 == 3) {
            return new b9();
        }
        z8 z8Var = null;
        if (i16 == 4) {
            return new a9(z8Var);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
