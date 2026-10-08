package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class ro extends bw implements kx {
    private static final ro zbb;
    private int zbd;
    private qn zbg;
    private byte zbh = 2;
    private String zbe = "InOrderOutputStreamHandler";
    private jw zbf = bw.C();

    static {
        ro roVar = new ro();
        zbb = roVar;
        bw.l(ro.class, roVar);
    }

    private ro() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return Byte.valueOf(this.zbh);
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001ဈ\u0000\u0002\u001a\u0003ᐉ\u0001", new Object[]{"zbd", "zbe", "zbf", "zbg"});
        }
        if (i16 == 3) {
            return new ro();
        }
        mo moVar = null;
        if (i16 == 4) {
            return new qo(moVar);
        }
        if (i16 == 5) {
            return zbb;
        }
        this.zbh = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
