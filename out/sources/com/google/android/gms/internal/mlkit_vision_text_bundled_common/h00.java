package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class h00 extends bw implements kx {
    private static final h00 zbb;
    private int zbd;
    private boolean zbe;
    private boolean zbf;

    static {
        h00 h00Var = new h00();
        zbb = h00Var;
        bw.l(h00.class, h00Var);
    }

    private h00() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u0002\u0000\u0001\u0005\u0006\u0002\u0000\u0000\u0000\u0005ဇ\u0000\u0006ဇ\u0001", new Object[]{"zbd", "zbe", "zbf"});
        }
        if (i16 == 3) {
            return new h00();
        }
        yy yyVar = null;
        if (i16 == 4) {
            return new g00(yyVar);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
