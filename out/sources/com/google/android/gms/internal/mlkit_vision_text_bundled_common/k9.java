package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class k9 extends bw implements kx {
    private static final k9 zbb;
    private gw zbd = bw.z();

    static {
        k9 k9Var = new k9();
        zbb = k9Var;
        bw.l(k9.class, k9Var);
    }

    private k9() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001$", new Object[]{"zbd"});
        }
        if (i16 == 3) {
            return new k9();
        }
        i9 i9Var = null;
        if (i16 == 4) {
            return new j9(i9Var);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
