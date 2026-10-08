package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class e3 extends yv implements kx {
    private static final e3 zbd;
    private byte zbf = 2;
    private jw zbe = bw.C();

    static {
        e3 e3Var = new e3();
        zbd = e3Var;
        bw.l(e3.class, e3Var);
    }

    private e3() {
    }

    public static e3 G() {
        return zbd;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return Byte.valueOf(this.zbf);
        }
        if (i16 == 2) {
            return bw.f(zbd, "\u0001\u0001\u0000\u0000\u0003\u0003\u0001\u0000\u0001\u0000\u0003\u001b", new Object[]{"zbe", d3.class});
        }
        if (i16 == 3) {
            return new e3();
        }
        s2 s2Var = null;
        if (i16 == 4) {
            return new b3(s2Var);
        }
        if (i16 == 5) {
            return zbd;
        }
        this.zbf = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
