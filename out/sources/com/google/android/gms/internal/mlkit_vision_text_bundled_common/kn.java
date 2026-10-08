package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class kn extends bw implements kx {
    private static final kn zbb;
    private String zbd = "";
    private boolean zbe;

    static {
        kn knVar = new kn();
        zbb = knVar;
        bw.l(kn.class, knVar);
    }

    private kn() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u0007", new Object[]{"zbd", "zbe"});
        }
        if (i16 == 3) {
            return new kn();
        }
        cn cnVar = null;
        if (i16 == 4) {
            return new jn(cnVar);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
