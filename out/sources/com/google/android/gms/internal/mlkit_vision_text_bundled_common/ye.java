package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class ye extends bw implements kx {
    private static final ye zbb;
    private int zbd;
    private String zbe = "";
    private int zbf;

    static {
        ye yeVar = new ye();
        zbb = yeVar;
        bw.l(ye.class, yeVar);
    }

    private ye() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001", new Object[]{"zbd", "zbe", "zbf", xe.f30700a});
        }
        if (i16 == 3) {
            return new ye();
        }
        ve veVar = null;
        if (i16 == 4) {
            return new we(veVar);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
