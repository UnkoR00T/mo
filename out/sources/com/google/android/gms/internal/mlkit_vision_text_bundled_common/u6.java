package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class u6 extends bw implements kx {
    private static final u6 zbb;
    private String zbd = "";
    private String zbe = "";
    private float zbf;

    static {
        u6 u6Var = new u6();
        zbb = u6Var;
        bw.l(u6.class, u6Var);
    }

    private u6() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0001", new Object[]{"zbd", "zbe", "zbf"});
        }
        if (i16 == 3) {
            return new u6();
        }
        f6 f6Var = null;
        if (i16 == 4) {
            return new t6(f6Var);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
