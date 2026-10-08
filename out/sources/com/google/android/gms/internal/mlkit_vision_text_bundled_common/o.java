package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class o extends bw implements kx {
    private static final o zbb;
    private int zbd;
    private sq zbf;
    private float zbg;
    private byte zbh = 2;
    private int zbe = 2;

    static {
        o oVar = new o();
        zbb = oVar;
        bw.l(o.class, oVar);
    }

    private o() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return Byte.valueOf(this.zbh);
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u0003\u0000\u0001\u0001\u0007\u0003\u0000\u0000\u0001\u0001᠌\u0000\u0002ᐉ\u0001\u0007ခ\u0002", new Object[]{"zbd", "zbe", m.f30495a, "zbf", "zbg"});
        }
        if (i16 == 3) {
            return new o();
        }
        f fVar = null;
        if (i16 == 4) {
            return new n(fVar);
        }
        if (i16 == 5) {
            return zbb;
        }
        this.zbh = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
