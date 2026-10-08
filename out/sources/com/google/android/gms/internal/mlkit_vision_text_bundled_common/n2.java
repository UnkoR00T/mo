package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class n2 extends bw implements kx {
    private static final n2 zbb;
    private int zbd;
    private int zbe;
    private int zbf;

    static {
        n2 n2Var = new n2();
        zbb = n2Var;
        bw.l(n2.class, n2Var);
    }

    private n2() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဋ\u0001", new Object[]{"zbd", "zbe", "zbf"});
        }
        if (i16 == 3) {
            return new n2();
        }
        l2 l2Var = null;
        if (i16 == 4) {
            return new m2(l2Var);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
