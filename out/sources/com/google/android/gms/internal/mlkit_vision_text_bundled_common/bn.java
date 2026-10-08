package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class bn extends yv implements kx {
    private static final bn zbd;
    private int zbe;
    private boolean zbf;
    private byte zbg = 2;

    static {
        bn bnVar = new bn();
        zbd = bnVar;
        bw.l(bn.class, bnVar);
    }

    private bn() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return Byte.valueOf(this.zbg);
        }
        if (i16 == 2) {
            return bw.f(zbd, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"zbe", "zbf"});
        }
        if (i16 == 3) {
            return new bn();
        }
        zm zmVar = null;
        if (i16 == 4) {
            return new an(zmVar);
        }
        if (i16 == 5) {
            return zbd;
        }
        this.zbg = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
