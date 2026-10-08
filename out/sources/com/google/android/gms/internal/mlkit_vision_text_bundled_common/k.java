package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends bw implements kx {
    private static final k zbb;
    private int zbd;
    private sq zbf;
    private byte zbg = 2;
    private jw zbe = bw.C();

    static {
        k kVar = new k();
        zbb = kVar;
        bw.l(k.class, kVar);
    }

    private k() {
    }

    public static k G() {
        return zbb;
    }

    public final sq E() {
        sq sqVar = this.zbf;
        return sqVar == null ? sq.K() : sqVar;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return Byte.valueOf(this.zbg);
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0002\u0001Л\u0002ᐉ\u0000", new Object[]{"zbd", "zbe", i.class, "zbf"});
        }
        if (i16 == 3) {
            return new k();
        }
        f fVar = null;
        if (i16 == 4) {
            return new j(fVar);
        }
        if (i16 == 5) {
            return zbb;
        }
        this.zbg = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
