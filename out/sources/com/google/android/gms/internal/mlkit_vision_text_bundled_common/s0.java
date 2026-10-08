package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class s0 extends bw implements kx {
    private static final s0 zbb;
    private dx zbd = dx.b();

    static {
        s0 s0Var = new s0();
        zbb = s0Var;
        bw.l(s0.class, s0Var);
    }

    private s0() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"zbd", r0.f30571a});
        }
        if (i16 == 3) {
            return new s0();
        }
        p0 p0Var = null;
        if (i16 == 4) {
            return new q0(p0Var);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
