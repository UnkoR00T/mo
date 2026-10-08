package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class r5 extends bw implements kx {
    private static final r5 zbb;
    private int zbd;
    private int zbe;
    private int zbg;
    private boolean zbh;
    private byte zbi = 2;
    private jw zbf = bw.C();

    static {
        r5 r5Var = new r5();
        zbb = r5Var;
        bw.l(r5.class, r5Var);
    }

    private r5() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return Byte.valueOf(this.zbi);
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u0004\u0000\u0001\u0003\u0006\u0004\u0000\u0001\u0002\u0003ᔄ\u0000\u0004Л\u0005င\u0001\u0006ဇ\u0002", new Object[]{"zbd", "zbe", "zbf", v5.class, "zbg", "zbh"});
        }
        if (i16 == 3) {
            return new r5();
        }
        o5 o5Var = null;
        if (i16 == 4) {
            return new q5(o5Var);
        }
        if (i16 == 5) {
            return zbb;
        }
        this.zbi = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
