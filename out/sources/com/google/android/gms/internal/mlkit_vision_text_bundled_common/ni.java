package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class ni extends bw implements kx {
    private static final ni zbb;
    private jw zbd = bw.C();

    static {
        ni niVar = new ni();
        zbb = niVar;
        bw.l(ni.class, niVar);
    }

    private ni() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zbd", ki.class});
        }
        if (i16 == 3) {
            return new ni();
        }
        li liVar = null;
        if (i16 == 4) {
            return new mi(liVar);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
