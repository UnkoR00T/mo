package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class ue extends bw implements kx {
    private static final ue zbb;
    private int zbd;
    private int zbe;
    private String zbf = "";

    static {
        ue ueVar = new ue();
        zbb = ueVar;
        bw.l(ue.class, ueVar);
    }

    private ue() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001", new Object[]{"zbd", "zbe", te.f30638a, "zbf"});
        }
        if (i16 == 3) {
            return new ue();
        }
        re reVar = null;
        if (i16 == 4) {
            return new se(reVar);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
