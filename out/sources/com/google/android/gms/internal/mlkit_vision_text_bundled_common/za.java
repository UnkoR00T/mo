package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class za extends bw implements kx {
    private static final za zbb;

    static {
        za zaVar = new za();
        zbb = zaVar;
        bw.l(za.class, zaVar);
    }

    private za() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        xa xaVar = null;
        if (i16 == 2) {
            return bw.f(zbb, "\u0000\u0000", null);
        }
        if (i16 == 3) {
            return new za();
        }
        if (i16 == 4) {
            return new ya(xaVar);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
