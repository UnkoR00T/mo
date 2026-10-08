package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class in extends bw implements kx {
    private static final in zbb;
    private int zbd;
    private qn zbg;
    private byte zbh = 2;
    private String zbe = "";
    private String zbf = "";

    static {
        in inVar = new in();
        zbb = inVar;
        bw.l(in.class, inVar);
    }

    private in() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return Byte.valueOf(this.zbh);
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001Ȉ\u0002Ȉ\u0003ᐉ\u0000", new Object[]{"zbd", "zbe", "zbf", "zbg"});
        }
        if (i16 == 3) {
            return new in();
        }
        cn cnVar = null;
        if (i16 == 4) {
            return new hn(cnVar);
        }
        if (i16 == 5) {
            return zbb;
        }
        this.zbh = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
