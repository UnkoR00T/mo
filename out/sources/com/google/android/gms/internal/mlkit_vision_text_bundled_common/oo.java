package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class oo extends bw implements kx {
    private static final oo zbb;
    private int zbd;
    private float zbf;
    private String zbe = "";
    private jw zbg = bw.C();
    private jw zbh = bw.C();

    static {
        oo ooVar = new oo();
        zbb = ooVar;
        bw.l(oo.class, ooVar);
    }

    private oo() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0004\u0005\u0000\u0000\u0001\u007f\u0005\u0000\u0002\u0000\u0001\f\u0002Ȉ\u0003\u0001\u0004Ț\u007fȚ", new Object[]{"zbd", "zbe", "zbf", "zbg", "zbh"});
        }
        if (i16 == 3) {
            return new oo();
        }
        lm lmVar = null;
        if (i16 == 4) {
            return new mn(lmVar);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
