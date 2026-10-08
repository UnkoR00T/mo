package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class k3 extends bw implements kx {
    private static final k3 zbb;
    private int zbd;
    private jw zbe = bw.C();
    private j3 zbf;
    private float zbg;
    private int zbh;
    private boolean zbi;
    private boolean zbj;

    static {
        k3 k3Var = new k3();
        zbb = k3Var;
        bw.l(k3.class, k3Var);
        bw.v(e3.G(), k3Var, k3Var, null, 32149011, vy.f30667n, k3.class);
    }

    private k3() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001\u001b\u0002ဇ\u0003\u0003ဉ\u0000\u0004ခ\u0001\u0005ဇ\u0004\u0006᠌\u0002", new Object[]{"zbd", "zbe", j3.class, "zbi", "zbf", "zbg", "zbj", "zbh", h3.f30443a});
        }
        if (i16 == 3) {
            return new k3();
        }
        s2 s2Var = null;
        if (i16 == 4) {
            return new g3(s2Var);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
