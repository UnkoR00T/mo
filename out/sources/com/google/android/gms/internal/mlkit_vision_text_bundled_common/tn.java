package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class tn extends bw implements kx {
    private static final tn zbb;
    private Object zbe;
    private int zbd = 0;
    private jw zbf = bw.C();

    static {
        tn tnVar = new tn();
        zbb = tnVar;
        bw.l(tn.class, tnVar);
    }

    private tn() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001;\u0000\u00023\u0000\u0003<\u0000\u0004\u001b", new Object[]{"zbe", "zbd", xn.class, "zbf", tn.class});
        }
        if (i16 == 3) {
            return new tn();
        }
        rn rnVar = null;
        if (i16 == 4) {
            return new sn(rnVar);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
