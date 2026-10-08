package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class e8 extends bw implements kx {
    private static final e8 zbb;
    private int zbd;
    private String zbe = "";
    private yu zbf = yu.f30716b;

    static {
        e8 e8Var = new e8();
        zbb = e8Var;
        bw.l(e8.class, e8Var);
    }

    private e8() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001", new Object[]{"zbd", "zbe", "zbf"});
        }
        if (i16 == 3) {
            return new e8();
        }
        b8 b8Var = null;
        if (i16 == 4) {
            return new d8(b8Var);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
