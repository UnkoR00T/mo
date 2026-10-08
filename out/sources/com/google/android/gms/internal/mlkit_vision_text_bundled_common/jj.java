package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class jj extends bw implements kx {
    private static final jj zbb;
    private int zbd;
    private Object zbf;
    private int zbg;
    private int zbh;
    private int zbe = 0;
    private jw zbi = bw.C();

    static {
        jj jjVar = new jj();
        zbb = jjVar;
        bw.l(jj.class, jjVar);
    }

    private jj() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001=\u0000\u0002င\u0000\u0003င\u0001\u0004<\u0000\u0005\u001b", new Object[]{"zbf", "zbe", "zbd", "zbg", "zbh", hj.class, "zbi", dj.class});
        }
        if (i16 == 3) {
            return new jj();
        }
        aj ajVar = null;
        if (i16 == 4) {
            return new bj(ajVar);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
