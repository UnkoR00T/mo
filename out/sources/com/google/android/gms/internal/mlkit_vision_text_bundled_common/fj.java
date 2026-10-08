package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class fj extends bw implements kx {
    private static final fj zbb;
    private gw zbd = bw.z();

    static {
        fj fjVar = new fj();
        zbb = fjVar;
        bw.l(fj.class, fjVar);
    }

    private fj() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001$", new Object[]{"zbd"});
        }
        if (i16 == 3) {
            return new fj();
        }
        aj ajVar = null;
        if (i16 == 4) {
            return new ej(ajVar);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
