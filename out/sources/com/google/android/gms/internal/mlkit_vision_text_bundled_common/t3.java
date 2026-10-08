package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class t3 extends bw implements kx {
    private static final t3 zbb;
    private int zbd;
    private n3 zbe;
    private jw zbf = bw.C();
    private float zbg;

    static {
        t3 t3Var = new t3();
        zbb = t3Var;
        bw.l(t3.class, t3Var);
    }

    private t3() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0003ခ\u0001", new Object[]{"zbd", "zbe", "zbf", s3.class, "zbg"});
        }
        if (i16 == 3) {
            return new t3();
        }
        l3 l3Var = null;
        if (i16 == 4) {
            return new o3(l3Var);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
