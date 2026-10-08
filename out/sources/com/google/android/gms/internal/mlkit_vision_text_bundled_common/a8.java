package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class a8 extends bw implements kx {
    private static final a8 zbb;
    private int zbd;
    private y7 zbe;
    private float zbf = 0.6f;
    private float zbg = 0.5f;
    private float zbh = 0.01f;
    private float zbi = 0.2f;
    private float zbj = 3.0f;
    private float zbk = 0.75f;
    private float zbl = 0.75f;
    private float zbm = 0.25f;
    private float zbn = 0.2f;
    private float zbo = 0.4f;
    private int zbp = 10;
    private float zbq = 0.05f;
    private int zbr = 3;

    static {
        a8 a8Var = new a8();
        zbb = a8Var;
        bw.l(a8.class, a8Var);
    }

    private a8() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u000e\u0000\u0001\u0001\u000f\u000e\u0000\u0000\u0000\u0001ဉ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ခ\u0003\u0005ခ\u0004\u0006ခ\u0005\bခ\u0006\tခ\u0007\nခ\b\u000bခ\t\fခ\n\rင\u000b\u000eခ\f\u000fင\r", new Object[]{"zbd", "zbe", "zbf", "zbg", "zbh", "zbi", "zbj", "zbk", "zbl", "zbm", "zbn", "zbo", "zbp", "zbq", "zbr"});
        }
        if (i16 == 3) {
            return new a8();
        }
        w7 w7Var = null;
        if (i16 == 4) {
            return new z7(w7Var);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
