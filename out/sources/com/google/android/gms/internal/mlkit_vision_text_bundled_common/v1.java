package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class v1 extends bw implements kx {
    private static final v1 zbb;
    private int zbd;
    private int zbe;
    private String zbf = "";
    private float zbg;
    private float zbh;

    static {
        v1 v1Var = new v1();
        zbb = v1Var;
        bw.l(v1.class, v1Var);
    }

    private v1() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u0004\u0000\u0001\u0002\u0005\u0004\u0000\u0000\u0000\u0002ဈ\u0001\u0003ခ\u0002\u0004ခ\u0003\u0005᠌\u0000", new Object[]{"zbd", "zbf", "zbg", "zbh", "zbe", h2.f30442a});
        }
        if (i16 == 3) {
            return new v1();
        }
        t1 t1Var = null;
        if (i16 == 4) {
            return new u1(t1Var);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
