package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class u2 extends bw implements kx {
    private static final u2 zbb;
    private int zbd;
    private jw zbe = bw.C();
    private String zbf = "";
    private float zbg;

    static {
        u2 u2Var = new u2();
        zbb = u2Var;
        bw.l(u2.class, u2Var);
    }

    private u2() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001a\u0002ဈ\u0000\u0003ခ\u0001", new Object[]{"zbd", "zbe", "zbf", "zbg"});
        }
        if (i16 == 3) {
            return new u2();
        }
        s2 s2Var = null;
        if (i16 == 4) {
            return new t2(s2Var);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
