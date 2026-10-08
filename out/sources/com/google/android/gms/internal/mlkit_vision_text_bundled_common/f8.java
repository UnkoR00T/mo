package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class f8 extends bw implements kx {
    private static final f8 zbb;
    private int zbd;
    private String zbe = "visionkit-pa.googleapis.com";
    private String zbf = "";
    private jw zbg = bw.C();

    static {
        f8 f8Var = new f8();
        zbb = f8Var;
        bw.l(f8.class, f8Var);
    }

    private f8() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003\u001b", new Object[]{"zbd", "zbe", "zbf", "zbg", e8.class});
        }
        if (i16 == 3) {
            return new f8();
        }
        b8 b8Var = null;
        if (i16 == 4) {
            return new c8(b8Var);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
