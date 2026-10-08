package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class wi extends bw implements kx {
    private static final wi zbb;
    private int zbd;
    private int zbe;
    private long zbf;
    private long zbg;

    static {
        wi wiVar = new wi();
        zbb = wiVar;
        bw.l(wi.class, wiVar);
    }

    private wi() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001\u0003ဂ\u0002", new Object[]{"zbd", "zbe", "zbf", "zbg"});
        }
        if (i16 == 3) {
            return new wi();
        }
        ui uiVar = null;
        if (i16 == 4) {
            return new vi(uiVar);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
