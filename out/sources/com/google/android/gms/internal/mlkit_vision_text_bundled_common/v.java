package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class v extends yv implements kx {
    private static final v zbd;
    private int zbe;
    private Object zbg;
    private int zbi;
    private int zbj;
    private int zbk;
    private int zbf = 0;
    private byte zbl = 2;
    private String zbh = "";

    static {
        v vVar = new v();
        zbd = vVar;
        bw.l(v.class, vVar);
    }

    private v() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return Byte.valueOf(this.zbl);
        }
        if (i16 == 2) {
            return bw.f(zbd, "\u0001\u0007\u0001\u0001\u0001\b\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0006=\u0000\u0007=\u0000\b6\u0000", new Object[]{"zbg", "zbf", "zbe", "zbh", "zbi", "zbj", "zbk"});
        }
        if (i16 == 3) {
            return new v();
        }
        f fVar = null;
        if (i16 == 4) {
            return new u(fVar);
        }
        if (i16 == 5) {
            return zbd;
        }
        this.zbl = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
