package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class hj extends bw implements kx {
    private static final hj zbb;
    private jw zbd = bw.C();

    static {
        hj hjVar = new hj();
        zbb = hjVar;
        bw.l(hj.class, hjVar);
    }

    private hj() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zbd", fj.class});
        }
        if (i16 == 3) {
            return new hj();
        }
        aj ajVar = null;
        if (i16 == 4) {
            return new gj(ajVar);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
