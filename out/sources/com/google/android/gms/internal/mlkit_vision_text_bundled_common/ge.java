package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class ge extends bw implements kx {
    private static final ge zbb;
    private int zbd;
    private ti zbe;

    static {
        ge geVar = new ge();
        zbb = geVar;
        bw.l(ge.class, geVar);
    }

    private ge() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0000\u0004ဉ\u0000", new Object[]{"zbd", "zbe"});
        }
        if (i16 == 3) {
            return new ge();
        }
        de deVar = null;
        if (i16 == 4) {
            return new fe(deVar);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
