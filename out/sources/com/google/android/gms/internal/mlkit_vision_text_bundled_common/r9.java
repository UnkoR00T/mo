package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class r9 extends bw implements kx {
    private static final r9 zbb;
    private iw zbd = bw.B();

    static {
        r9 r9Var = new r9();
        zbb = r9Var;
        bw.l(r9.class, r9Var);
    }

    private r9() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001%", new Object[]{"zbd"});
        }
        if (i16 == 3) {
            return new r9();
        }
        p9 p9Var = null;
        if (i16 == 4) {
            return new q9(p9Var);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
