package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class sh extends bw implements kx {
    private static final sh zbb;
    private jw zbd = bw.C();

    static {
        sh shVar = new sh();
        zbb = shVar;
        bw.l(sh.class, shVar);
    }

    private sh() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zbd", kh.class});
        }
        if (i16 == 3) {
            return new sh();
        }
        qh qhVar = null;
        if (i16 == 4) {
            return new rh(qhVar);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
