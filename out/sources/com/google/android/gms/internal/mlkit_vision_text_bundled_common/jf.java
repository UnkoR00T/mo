package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class jf extends bw implements kx {
    private static final jf zbb;
    private int zbd;
    private int zbe = 3;
    private float zbf = 100000.0f;
    private float zbg;

    static {
        jf jfVar = new jf();
        zbb = jfVar;
        bw.l(jf.class, jfVar);
    }

    private jf() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ခ\u0001\u0003ခ\u0002", new Object[]{"zbd", "zbe", gf.f30429a, "zbf", "zbg"});
        }
        if (i16 == 3) {
            return new jf();
        }
        ff ffVar = null;
        if (i16 == 4) {
            return new hf(ffVar);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
