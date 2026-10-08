package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class ti extends bw implements kx {
    private static final ti zbb;
    private int zbd;
    private yu zbe = yu.f30716b;
    private String zbf = "";
    private wi zbg;

    static {
        ti tiVar = new ti();
        zbb = tiVar;
        bw.l(ti.class, tiVar);
    }

    private ti() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဈ\u0001\u0002ည\u0000\u0004ဉ\u0002", new Object[]{"zbd", "zbf", "zbe", "zbg"});
        }
        if (i16 == 3) {
            return new ti();
        }
        ri riVar = null;
        if (i16 == 4) {
            return new si(riVar);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
