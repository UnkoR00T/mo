package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class j3 extends bw implements kx {
    private static final j3 zbb;
    private int zbd;
    private float zbf;
    private float zbg;
    private float zbi;
    private String zbe = "";
    private float zbh = 1.0f;
    private jw zbj = bw.C();

    static {
        j3 j3Var = new j3();
        zbb = j3Var;
        bw.l(j3.class, j3Var);
    }

    private j3() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ခ\u0003\u0005ခ\u0004\u0006\u001a", new Object[]{"zbd", "zbe", "zbf", "zbg", "zbh", "zbi", "zbj"});
        }
        if (i16 == 3) {
            return new j3();
        }
        s2 s2Var = null;
        if (i16 == 4) {
            return new i3(s2Var);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
