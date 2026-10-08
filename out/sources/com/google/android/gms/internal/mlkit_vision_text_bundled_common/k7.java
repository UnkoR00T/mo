package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class k7 extends bw implements kx {
    private static final k7 zbb;
    private jw zbd = bw.C();
    private jw zbe = bw.C();
    private jw zbf = bw.C();
    private jw zbg = bw.C();

    static {
        k7 k7Var = new k7();
        zbb = k7Var;
        bw.l(k7.class, k7Var);
    }

    private k7() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u001b\u0002\u001b\u0003\u001b\u0004\u001b", new Object[]{"zbd", v6.class, "zbe", k6.class, "zbf", p7.class, "zbg", h7.class});
        }
        if (i16 == 3) {
            return new k7();
        }
        f6 f6Var = null;
        if (i16 == 4) {
            return new i7(f6Var);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
