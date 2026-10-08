package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class m6 extends bw implements kx {
    private static final m6 zbb;
    private jw zbd = bw.C();

    static {
        m6 m6Var = new m6();
        zbb = m6Var;
        bw.l(m6.class, m6Var);
    }

    private m6() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zbd", n7.class});
        }
        if (i16 == 3) {
            return new m6();
        }
        f6 f6Var = null;
        if (i16 == 4) {
            return new l6(f6Var);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
