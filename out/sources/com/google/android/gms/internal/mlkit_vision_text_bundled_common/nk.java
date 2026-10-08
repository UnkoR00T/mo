package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class nk extends bw implements kx {
    private static final nk zbb;
    private int zbd;
    private tk zbe;
    private int zbf;

    static {
        nk nkVar = new nk();
        zbb = nkVar;
        bw.l(nk.class, nkVar);
    }

    private nk() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002င\u0001", new Object[]{"zbd", "zbe", "zbf"});
        }
        if (i16 == 3) {
            return new nk();
        }
        lk lkVar = null;
        if (i16 == 4) {
            return new mk(lkVar);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
