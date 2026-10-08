package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends yv implements kx {
    private static final e zbd;
    private int zbe;
    private int zbf;
    private byte zbg = 2;

    static {
        e eVar = new e();
        zbd = eVar;
        bw.l(e.class, eVar);
    }

    private e() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return Byte.valueOf(this.zbg);
        }
        if (i16 == 2) {
            return bw.f(zbd, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zbe", "zbf", d.f30398a});
        }
        if (i16 == 3) {
            return new e();
        }
        b20 b20Var = null;
        if (i16 == 4) {
            return new c(b20Var);
        }
        if (i16 == 5) {
            return zbd;
        }
        this.zbg = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
