package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class qk extends bw implements kx {
    private static final qk zbb;
    private int zbd;
    private jw zbe = bw.C();
    private String zbf = "";

    static {
        qk qkVar = new qk();
        zbb = qkVar;
        bw.l(qk.class, qkVar);
    }

    private qk() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000", new Object[]{"zbd", "zbe", nk.class, "zbf"});
        }
        if (i16 == 3) {
            return new qk();
        }
        ok okVar = null;
        if (i16 == 4) {
            return new pk(okVar);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
