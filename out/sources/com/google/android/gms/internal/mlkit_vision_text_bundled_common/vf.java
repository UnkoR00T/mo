package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class vf extends bw implements kx {
    private static final vf zbb;
    private int zbd;
    private int zbf;
    private int zbg;
    private float zbi;
    private jw zbe = bw.C();
    private String zbh = "";

    static {
        vf vfVar = new vf();
        zbb = vfVar;
        bw.l(vf.class, vfVar);
    }

    private vf() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001c\u0002င\u0000\u0003င\u0001\u0004ဈ\u0002\u0005ခ\u0003", new Object[]{"zbd", "zbe", "zbf", "zbg", "zbh", "zbi"});
        }
        if (i16 == 3) {
            return new vf();
        }
        tf tfVar = null;
        if (i16 == 4) {
            return new uf(tfVar);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
