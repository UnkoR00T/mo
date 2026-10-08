package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class kh extends bw implements kx {
    private static final kh zbb;
    private int zbd;
    private Object zbf;
    private int zbg;
    private long zbj;
    private int zbl;
    private int zbe = 0;
    private String zbh = "";
    private jw zbi = bw.C();
    private String zbk = "";

    static {
        kh khVar = new kh();
        zbb = khVar;
        bw.l(kh.class, khVar);
    }

    private kh() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u000b\u0001\u0001\u0001\u000b\u000b\u0000\u0001\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဈ\u0003\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000\nဂ\u0002\u000b᠌\u0004", new Object[]{"zbf", "zbe", "zbd", "zbg", lh.f30479a, "zbh", "zbi", jh.class, "zbk", kd.class, k8.class, ed.class, qb.class, rd.class, "zbj", "zbl", fh.f30425a});
        }
        if (i16 == 3) {
            return new kh();
        }
        eh ehVar = null;
        if (i16 == 4) {
            return new hh(ehVar);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
