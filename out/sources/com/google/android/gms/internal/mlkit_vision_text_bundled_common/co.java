package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class co extends yv implements kx {
    private static final co zbd;
    private byte zbe = 2;

    static {
        co coVar = new co();
        zbd = coVar;
        bw.l(co.class, coVar);
    }

    private co() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return Byte.valueOf(this.zbe);
        }
        yn ynVar = null;
        if (i16 == 2) {
            return bw.f(zbd, "\u0001\u0000", null);
        }
        if (i16 == 3) {
            return new co();
        }
        if (i16 == 4) {
            return new bo(ynVar);
        }
        if (i16 == 5) {
            return zbd;
        }
        this.zbe = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
