package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class v7 extends bw implements kx {
    private static final v7 zbb;
    private int zbd;
    private ti zbe;
    private String zbf = "";

    static {
        v7 v7Var = new v7();
        zbb = v7Var;
        bw.l(v7.class, v7Var);
    }

    private v7() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001", new Object[]{"zbd", "zbe", "zbf"});
        }
        if (i16 == 3) {
            return new v7();
        }
        t7 t7Var = null;
        if (i16 == 4) {
            return new u7(t7Var);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
