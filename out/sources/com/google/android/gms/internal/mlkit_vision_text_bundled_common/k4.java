package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class k4 extends bw implements kx {
    private static final k4 zbb;
    private int zbd;
    private int zbf;
    private String zbe = "";
    private gw zbg = bw.z();
    private String zbh = "";
    private jw zbi = bw.C();

    static {
        k4 k4Var = new k4();
        zbb = k4Var;
        bw.l(k4.class, k4Var);
    }

    private k4() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001ဈ\u0000\u0002င\u0001\u0003$\u0004ဈ\u0002\u0005\u001a", new Object[]{"zbd", "zbe", "zbf", "zbg", "zbh", "zbi"});
        }
        if (i16 == 3) {
            return new k4();
        }
        i4 i4Var = null;
        if (i16 == 4) {
            return new j4(i4Var);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
