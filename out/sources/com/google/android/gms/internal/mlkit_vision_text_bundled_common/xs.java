package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class xs extends bw implements kx {
    private static final xs zbb;
    private int zbd;
    private int zbe;
    private nr zbg;
    private nr zbh;
    private float zbj;
    private nr zbl;
    private nr zbm;
    private es zbn;
    private bt zbp;
    private byte zbq = 2;
    private hw zbf = bw.A();
    private String zbi = "";
    private jw zbk = bw.C();
    private boolean zbo = true;

    static {
        xs xsVar = new xs();
        zbb = xsVar;
        bw.l(xs.class, xsVar);
    }

    private xs() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return Byte.valueOf(this.zbq);
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0002\b\u0001ᔄ\u0000\u0002ᔉ\u0001\u0003ᐉ\u0002\u0004ဈ\u0003\u0005ခ\u0004\u0006ᐉ\u0005\u0007ᐉ\u0006\bᐉ\u0007\tဇ\b\nᐉ\t\u000bЛ\f\u0016", new Object[]{"zbd", "zbe", "zbg", "zbh", "zbi", "zbj", "zbl", "zbm", "zbn", "zbo", "zbp", "zbk", sr.class, "zbf"});
        }
        if (i16 == 3) {
            return new xs();
        }
        lr lrVar = null;
        if (i16 == 4) {
            return new ws(lrVar);
        }
        if (i16 == 5) {
            return zbb;
        }
        this.zbq = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
