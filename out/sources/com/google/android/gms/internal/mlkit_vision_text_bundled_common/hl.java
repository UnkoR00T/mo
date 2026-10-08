package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class hl extends bw implements kx {
    private static final hl zbb;
    private int zbd;
    private int zbf;
    private int zbe = 1;
    private int zbg = 4;
    private int zbh = 240;
    private hw zbi = bw.A();

    static {
        hl hlVar = new hl();
        zbb = hlVar;
        bw.l(hl.class, hlVar);
    }

    private hl() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u0005\u0000\u0001\u0003\n\u0005\u0000\u0001\u0000\u0003᠌\u0000\u0007င\u0001\bင\u0002\tင\u0003\nࠬ", new Object[]{"zbd", "zbe", gl.f30430a, "zbf", "zbg", "zbh", "zbi", fl.f30426a});
        }
        if (i16 == 3) {
            return new hl();
        }
        dl dlVar = null;
        if (i16 == 4) {
            return new el(dlVar);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
