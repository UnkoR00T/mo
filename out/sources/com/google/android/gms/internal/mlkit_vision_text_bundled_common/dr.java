package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class dr extends bw implements kx {
    private static final dr zbb;
    private int zbd;
    private ku zbe;

    static {
        dr drVar = new dr();
        zbb = drVar;
        bw.l(dr.class, drVar);
    }

    private dr() {
    }

    public static dr F() {
        return zbb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"zbd", "zbe"});
        }
        if (i16 == 3) {
            return new dr();
        }
        yq yqVar = null;
        if (i16 == 4) {
            return new cr(yqVar);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
