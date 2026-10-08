package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class w2 extends bw implements kx {
    private static final w2 zbb;
    private int zbd;
    private jw zbe = bw.C();
    private String zbf = "";

    static {
        w2 w2Var = new w2();
        zbb = w2Var;
        bw.l(w2.class, w2Var);
    }

    private w2() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001a\u0002ဈ\u0000", new Object[]{"zbd", "zbe", "zbf"});
        }
        if (i16 == 3) {
            return new w2();
        }
        s2 s2Var = null;
        if (i16 == 4) {
            return new v2(s2Var);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
