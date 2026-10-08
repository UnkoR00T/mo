package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class i8 extends bw implements kx {
    private static final i8 zbb;
    private int zbd = 0;
    private Object zbe;

    static {
        i8 i8Var = new i8();
        zbb = i8Var;
        bw.l(i8.class, i8Var);
    }

    private i8() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0000\u0003\u0001\u0000\u0002\u0004\u0003\u0000\u0000\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000", new Object[]{"zbe", "zbd", da.class, o9.class, za.class});
        }
        if (i16 == 3) {
            return new i8();
        }
        g8 g8Var = null;
        if (i16 == 4) {
            return new h8(g8Var);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
