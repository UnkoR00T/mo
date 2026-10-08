package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class wr extends bw implements kx {
    private static final wr zbb;
    private jw zbd = bw.C();

    static {
        wr wrVar = new wr();
        zbb = wrVar;
        bw.l(wr.class, wrVar);
    }

    private wr() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zbd", vr.class});
        }
        if (i16 == 3) {
            return new wr();
        }
        lr lrVar = null;
        if (i16 == 4) {
            return new tr(lrVar);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
