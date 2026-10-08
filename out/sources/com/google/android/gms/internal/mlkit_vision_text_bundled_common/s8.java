package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class s8 extends bw implements kx {
    private static final s8 zbb;
    private String zbd = "";
    private String zbe = "";
    private double zbf;

    static {
        s8 s8Var = new s8();
        zbb = s8Var;
        bw.l(s8.class, s8Var);
    }

    private s8() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\u0000\u0003Ȉ", new Object[]{"zbd", "zbf", "zbe"});
        }
        if (i16 == 3) {
            return new s8();
        }
        q8 q8Var = null;
        if (i16 == 4) {
            return new r8(q8Var);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
