package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class v00 extends bw implements kx {
    private static final v00 zbb;
    private int zbd;
    private int zbe;

    static {
        v00 v00Var = new v00();
        zbb = v00Var;
        bw.l(v00.class, v00Var);
    }

    private v00() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"zbd", "zbe"});
        }
        if (i16 == 3) {
            return new v00();
        }
        yy yyVar = null;
        if (i16 == 4) {
            return new u00(yyVar);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
