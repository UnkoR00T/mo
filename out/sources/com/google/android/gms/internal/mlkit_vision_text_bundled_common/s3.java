package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class s3 extends bw implements kx {
    private static final s3 zbb;
    private int zbd;
    private float zbe;
    private float zbf;
    private float zbg;
    private int zbh;
    private int zbi;
    private float zbj;

    static {
        s3 s3Var = new s3();
        zbb = s3Var;
        bw.l(s3.class, s3Var);
    }

    private s3() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004᠌\u0003\u0005᠌\u0004\u0006ခ\u0005", new Object[]{"zbd", "zbe", "zbf", "zbg", "zbh", q3.f30560a, "zbi", r3.f30574a, "zbj"});
        }
        if (i16 == 3) {
            return new s3();
        }
        l3 l3Var = null;
        if (i16 == 4) {
            return new p3(l3Var);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
