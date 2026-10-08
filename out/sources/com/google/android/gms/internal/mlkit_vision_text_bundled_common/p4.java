package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class p4 extends bw implements kx {
    private static final p4 zbb;
    private int zbd = 0;
    private Object zbe;

    static {
        p4 p4Var = new p4();
        zbb = p4Var;
        bw.l(p4.class, p4Var);
    }

    private p4() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"zbe", "zbd", h4.class, c4.class});
        }
        if (i16 == 3) {
            return new p4();
        }
        n4 n4Var = null;
        if (i16 == 4) {
            return new o4(n4Var);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
