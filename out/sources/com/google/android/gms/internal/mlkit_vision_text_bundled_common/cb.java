package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class cb extends bw implements kx {
    private static final cb zbb;
    private int zbd;
    private ti zbe;
    private bz zbf;

    static {
        cb cbVar = new cb();
        zbb = cbVar;
        bw.l(cb.class, cbVar);
    }

    private cb() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zbd", "zbe", "zbf"});
        }
        if (i16 == 3) {
            return new cb();
        }
        ab abVar = null;
        if (i16 == 4) {
            return new bb(abVar);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
