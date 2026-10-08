package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class io extends yv implements kx {
    private static final io zbd;
    private int zbe;
    private byte zbg = 2;
    private boolean zbf = true;

    static {
        io ioVar = new io();
        zbd = ioVar;
        bw.l(io.class, ioVar);
    }

    private io() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return Byte.valueOf(this.zbg);
        }
        if (i16 == 2) {
            return bw.f(zbd, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"zbe", "zbf"});
        }
        if (i16 == 3) {
            return new io();
        }
        eo eoVar = null;
        if (i16 == 4) {
            return new ho(eoVar);
        }
        if (i16 == 5) {
            return zbd;
        }
        this.zbg = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
