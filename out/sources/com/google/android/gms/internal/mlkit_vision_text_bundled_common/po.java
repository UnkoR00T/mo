package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class po extends bw implements kx {
    private static final po zbb;
    private int zbd;
    private qn zbf;
    private byte zbg = 2;
    private String zbe = "DefaultInputStreamHandler";

    static {
        po poVar = new po();
        zbb = poVar;
        bw.l(po.class, poVar);
    }

    private po() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return Byte.valueOf(this.zbg);
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0001\u0001ဈ\u0000\u0003ᐉ\u0001", new Object[]{"zbd", "zbe", "zbf"});
        }
        if (i16 == 3) {
            return new po();
        }
        mo moVar = null;
        if (i16 == 4) {
            return new no(moVar);
        }
        if (i16 == 5) {
            return zbb;
        }
        this.zbg = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
