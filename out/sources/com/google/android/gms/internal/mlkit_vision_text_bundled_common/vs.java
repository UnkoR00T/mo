package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class vs extends bw implements kx {
    private static final vs zbb;
    private int zbd;
    private float zbf;
    private String zbe = "";
    private String zbg = "";

    static {
        vs vsVar = new vs();
        zbb = vsVar;
        bw.l(vs.class, vsVar);
    }

    private vs() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ခ\u0001\u0003ဈ\u0002", new Object[]{"zbd", "zbe", "zbf", "zbg"});
        }
        if (i16 == 3) {
            return new vs();
        }
        lr lrVar = null;
        if (i16 == 4) {
            return new us(lrVar);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
