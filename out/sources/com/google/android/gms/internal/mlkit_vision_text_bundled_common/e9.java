package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class e9 extends bw implements kx {
    private static final e9 zbb;
    private int zbd;
    private int zbe;
    private int zbf;
    private String zbg = "";

    static {
        e9 e9Var = new e9();
        zbb = e9Var;
        bw.l(e9.class, e9Var);
    }

    private e9() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002\u000b\u0003\u000b\u0004Ȉ", new Object[]{"zbd", "zbe", "zbf", "zbg"});
        }
        if (i16 == 3) {
            return new e9();
        }
        c9 c9Var = null;
        if (i16 == 4) {
            return new d9(c9Var);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
