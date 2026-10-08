package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class s6 extends bw implements kx {
    private static final s6 zbb;
    private int zbd;
    private float zbe;

    static {
        s6 s6Var = new s6();
        zbb = s6Var;
        bw.l(s6.class, s6Var);
    }

    private s6() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u0001", new Object[]{"zbd", "zbe"});
        }
        if (i16 == 3) {
            return new s6();
        }
        f6 f6Var = null;
        if (i16 == 4) {
            return new r6(f6Var);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
