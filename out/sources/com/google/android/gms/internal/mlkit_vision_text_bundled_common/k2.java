package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class k2 extends bw implements kx {
    private static final k2 zbb;
    private byte zbe = 2;
    private jw zbd = bw.C();

    static {
        k2 k2Var = new k2();
        zbb = k2Var;
        bw.l(k2.class, k2Var);
    }

    private k2() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return Byte.valueOf(this.zbe);
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"zbd", g2.class});
        }
        if (i16 == 3) {
            return new k2();
        }
        i2 i2Var = null;
        if (i16 == 4) {
            return new j2(i2Var);
        }
        if (i16 == 5) {
            return zbb;
        }
        this.zbe = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
