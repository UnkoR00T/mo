package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class bk extends bw implements kx {
    private static final bk zbb;
    private int zbd;
    private jw zbe = bw.C();
    private int zbf;

    static {
        bk bkVar = new bk();
        zbb = bkVar;
        bw.l(bk.class, bkVar);
    }

    private bk() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002င\u0000", new Object[]{"zbd", "zbe", gi.class, "zbf"});
        }
        if (i16 == 3) {
            return new bk();
        }
        zj zjVar = null;
        if (i16 == 4) {
            return new ak(zjVar);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
