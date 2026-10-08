package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class wt extends bw implements kx {
    private static final wt zbb;
    private jw zbd = bw.C();
    private jw zbe = bw.C();

    static {
        wt wtVar = new wt();
        zbb = wtVar;
        bw.l(wt.class, wtVar);
    }

    private wt() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u0002\u0000\u0000\u0001\u000f\u0002\u0000\u0002\u0000\u0001\u001b\u000f\u001a", new Object[]{"zbd", rt.class, "zbe"});
        }
        if (i16 == 3) {
            return new wt();
        }
        nt ntVar = null;
        if (i16 == 4) {
            return new vt(ntVar);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
