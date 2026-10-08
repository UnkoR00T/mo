package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class y8 extends bw implements kx {
    private static final y8 zbb;
    private String zbd = "";
    private jw zbe = bw.C();
    private String zbf = "";

    static {
        y8 y8Var = new y8();
        zbb = y8Var;
        bw.l(y8.class, y8Var);
    }

    private y8() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002\u001b\u0003Ȉ", new Object[]{"zbd", "zbe", v8.class, "zbf"});
        }
        if (i16 == 3) {
            return new y8();
        }
        w8 w8Var = null;
        if (i16 == 4) {
            return new x8(w8Var);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
