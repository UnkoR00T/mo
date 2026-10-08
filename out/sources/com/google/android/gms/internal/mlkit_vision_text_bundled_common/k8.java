package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class k8 extends bw implements kx {
    private static final k8 zbb;
    private int zbd;
    private String zbe = "";
    private String zbf = "";
    private String zbg = "";
    private int zbh;

    static {
        k8 k8Var = new k8();
        zbb = k8Var;
        bw.l(k8.class, k8Var);
    }

    private k8() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004᠌\u0003", new Object[]{"zbd", "zbe", "zbf", "zbg", "zbh", j7.f30457a});
        }
        if (i16 == 3) {
            return new k8();
        }
        h5 h5Var = null;
        if (i16 == 4) {
            return new i6(h5Var);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
