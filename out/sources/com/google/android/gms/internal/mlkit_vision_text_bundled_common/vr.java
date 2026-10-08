package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class vr extends bw implements kx {
    private static final vr zbb;
    private int zbd;
    private double zbe;
    private double zbf;

    static {
        vr vrVar = new vr();
        zbb = vrVar;
        bw.l(vr.class, vrVar);
    }

    private vr() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001က\u0000\u0002က\u0001", new Object[]{"zbd", "zbe", "zbf"});
        }
        if (i16 == 3) {
            return new vr();
        }
        lr lrVar = null;
        if (i16 == 4) {
            return new ur(lrVar);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
