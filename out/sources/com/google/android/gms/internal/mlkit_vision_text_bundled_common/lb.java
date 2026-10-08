package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class lb extends bw implements kx {
    private static final lb zbb;
    private int zbd;
    private boolean zbe;
    private boolean zbf;

    static {
        lb lbVar = new lb();
        zbb = lbVar;
        bw.l(lb.class, lbVar);
    }

    private lb() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"zbd", "zbe", "zbf"});
        }
        if (i16 == 3) {
            return new lb();
        }
        jb jbVar = null;
        if (i16 == 4) {
            return new kb(jbVar);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
