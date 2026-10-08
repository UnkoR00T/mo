package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class ht extends bw implements kx {
    private static final ht zbb;
    private int zbd;
    private int zbf;
    private int zbg;
    private kt zbj;
    private os zbl;
    private ls zbm;
    private byte zbo = 2;
    private yu zbe = yu.f30716b;
    private String zbh = "";
    private jw zbi = bw.C();
    private jw zbk = bw.C();
    private jw zbn = bw.C();

    static {
        ht htVar = new ht();
        zbb = htVar;
        bw.l(ht.class, htVar);
    }

    private ht() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return Byte.valueOf(this.zbo);
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0003\u0004\u0001ᔊ\u0000\u0002ဈ\u0003\u0003Л\u0004ဉ\u0004\u0005Л\u0006ဉ\u0005\u0007ဉ\u0006\bЛ\tင\u0001\nင\u0002", new Object[]{"zbd", "zbe", "zbh", "zbi", is.class, "zbj", "zbk", ft.class, "zbl", "zbm", "zbn", dt.class, "zbf", "zbg"});
        }
        if (i16 == 3) {
            return new ht();
        }
        lr lrVar = null;
        if (i16 == 4) {
            return new gt(lrVar);
        }
        if (i16 == 5) {
            return zbb;
        }
        this.zbo = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
