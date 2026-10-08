package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class o6 extends bw implements kx {
    private static final o6 zbb;
    private int zbd;
    private n7 zbe;
    private n7 zbf;

    static {
        o6 o6Var = new o6();
        zbb = o6Var;
        bw.l(o6.class, o6Var);
    }

    private o6() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zbd", "zbe", "zbf"});
        }
        if (i16 == 3) {
            return new o6();
        }
        f6 f6Var = null;
        if (i16 == 4) {
            return new n6(f6Var);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
