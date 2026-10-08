package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class ao extends bw implements kx {
    private static final ao zbb;
    private int zbd;
    private co zbh;
    private byte zbi = 2;
    private String zbe = "";
    private String zbf = "";
    private String zbg = "";

    static {
        ao aoVar = new ao();
        zbb = aoVar;
        bw.l(ao.class, aoVar);
    }

    private ao() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return Byte.valueOf(this.zbi);
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u0004\u0000\u0001\u0001Ϫ\u0004\u0000\u0000\u0001\u0001ဈ\u0000\u0002ဈ\u0001\u0003ᐉ\u0003Ϫဈ\u0002", new Object[]{"zbd", "zbe", "zbf", "zbh", "zbg"});
        }
        if (i16 == 3) {
            return new ao();
        }
        yn ynVar = null;
        if (i16 == 4) {
            return new zn(ynVar);
        }
        if (i16 == 5) {
            return zbb;
        }
        this.zbi = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
