package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class ip extends bw implements kx {
    private static final ip zbb;
    private int zbd;
    private jw zbe = bw.C();
    private int zbf;
    private int zbg;

    static {
        ip ipVar = new ip();
        zbb = ipVar;
        bw.l(ip.class, ipVar);
    }

    private ip() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002᠌\u0000\u0003᠌\u0001", new Object[]{"zbd", "zbe", gp.class, "zbf", hp.f30447a, "zbg", cp.f30381a});
        }
        if (i16 == 3) {
            return new ip();
        }
        dp dpVar = null;
        if (i16 == 4) {
            return new ep(dpVar);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
