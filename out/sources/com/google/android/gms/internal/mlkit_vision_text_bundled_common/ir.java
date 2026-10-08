package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class ir extends bw implements kx {
    private static final ir zbb;
    private int zbd;
    private int zbe;
    private int zbg;
    private boolean zbh;
    private int zbi;
    private boolean zbk;
    private bz zbl;
    private jw zbf = bw.C();
    private int zbj = 1;

    static {
        ir irVar = new ir();
        zbb = irVar;
        bw.l(ir.class, irVar);
    }

    private ir() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002\u001b\u0003င\u0001\u0004ဇ\u0002\u0005င\u0003\u0006င\u0004\u0007ဇ\u0005\bဉ\u0006", new Object[]{"zbd", "zbe", "zbf", gr.class, "zbg", "zbh", "zbi", "zbj", "zbk", "zbl"});
        }
        if (i16 == 3) {
            return new ir();
        }
        er erVar = null;
        if (i16 == 4) {
            return new hr(erVar);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
