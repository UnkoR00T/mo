package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class rr extends bw implements kx {
    private static final rr zbb;
    private jw zbd = bw.C();
    private int zbe;

    static {
        rr rrVar = new rr();
        zbb = rrVar;
        bw.l(rr.class, rrVar);
    }

    private rr() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\f", new Object[]{"zbd", oo.class, "zbe"});
        }
        if (i16 == 3) {
            return new rr();
        }
        pp ppVar = null;
        if (i16 == 4) {
            return new qq(ppVar);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
