package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class na extends bw implements kx {
    private static final na zbb;
    private long zbe;
    private long zbf;
    private yu zbd = yu.f30716b;
    private jw zbg = bw.C();

    static {
        na naVar = new na();
        zbb = naVar;
        bw.l(na.class, naVar);
    }

    private na() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001\n\u0002\u0002\u0003\u0002\u0004\u001b", new Object[]{"zbd", "zbe", "zbf", "zbg", e9.class});
        }
        if (i16 == 3) {
            return new na();
        }
        ka kaVar = null;
        if (i16 == 4) {
            return new la(kaVar);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
