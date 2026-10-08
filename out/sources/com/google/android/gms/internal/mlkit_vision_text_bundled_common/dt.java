package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class dt extends bw implements kx {
    private static final dt zbb;
    private int zbd;
    private nr zbe;
    private byte zbg = 2;
    private hw zbf = bw.A();

    static {
        dt dtVar = new dt();
        zbb = dtVar;
        bw.l(dt.class, dtVar);
    }

    private dt() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return Byte.valueOf(this.zbg);
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001ᐉ\u0000\u0002\u0016", new Object[]{"zbd", "zbe", "zbf"});
        }
        if (i16 == 3) {
            return new dt();
        }
        lr lrVar = null;
        if (i16 == 4) {
            return new ct(lrVar);
        }
        if (i16 == 5) {
            return zbb;
        }
        this.zbg = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
