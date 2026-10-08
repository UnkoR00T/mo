package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class pt extends bw implements kx {
    private static final pt zbb;
    private int zbd;
    private String zbe = "";
    private double zbf = 1.0d;
    private jw zbg = bw.C();

    static {
        pt ptVar = new pt();
        zbb = ptVar;
        bw.l(pt.class, ptVar);
    }

    private pt() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u0003\u0000\u0001\u0001\u000f\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002က\u0001\u000f\u001a", new Object[]{"zbd", "zbe", "zbf", "zbg"});
        }
        if (i16 == 3) {
            return new pt();
        }
        nt ntVar = null;
        if (i16 == 4) {
            return new ot(ntVar);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
