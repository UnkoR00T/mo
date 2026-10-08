package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class v8 extends bw implements kx {
    private static final v8 zbb;
    private int zbd;
    private s8 zbe;
    private ja zbf;

    static {
        v8 v8Var = new v8();
        zbb = v8Var;
        bw.l(v8.class, v8Var);
    }

    private v8() {
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
            return new v8();
        }
        t8 t8Var = null;
        if (i16 == 4) {
            return new u8(t8Var);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
