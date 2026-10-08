package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class ls extends bw implements kx {
    private static final ls zbb;
    private int zbd;
    private int zbe;
    private String zbf = "";
    private hw zbg = bw.A();

    static {
        ls lsVar = new ls();
        zbb = lsVar;
        bw.l(ls.class, lsVar);
    }

    private ls() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0001\u0002င\u0000\u0003ࠞ", new Object[]{"zbd", "zbf", "zbe", "zbg", ms.f30506a});
        }
        if (i16 == 3) {
            return new ls();
        }
        lr lrVar = null;
        if (i16 == 4) {
            return new ks(lrVar);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
