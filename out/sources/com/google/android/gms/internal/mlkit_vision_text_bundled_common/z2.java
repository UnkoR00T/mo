package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class z2 extends bw implements kx {
    private static final z2 zbb;
    private int zbd;
    private String zbe = "";
    private gw zbf = bw.z();
    private gw zbg = bw.z();
    private jw zbh = bw.C();

    static {
        z2 z2Var = new z2();
        zbb = z2Var;
        bw.l(z2.class, z2Var);
    }

    private z2() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0003\u0000\u0001ဈ\u0000\u0002$\u0003$\u0004\u001a", new Object[]{"zbd", "zbe", "zbf", "zbg", "zbh"});
        }
        if (i16 == 3) {
            return new z2();
        }
        s2 s2Var = null;
        if (i16 == 4) {
            return new y2(s2Var);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
