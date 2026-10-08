package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class vh extends bw implements kx {
    private static final vh zbb;
    private int zbd;
    private int zbe;
    private int zbf;
    private int zbg;
    private int zbh;

    static {
        vh vhVar = new vh();
        zbb = vhVar;
        bw.l(vh.class, vhVar);
    }

    private vh() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"zbd", "zbe", "zbf", "zbg", "zbh"});
        }
        if (i16 == 3) {
            return new vh();
        }
        th thVar = null;
        if (i16 == 4) {
            return new uh(thVar);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
