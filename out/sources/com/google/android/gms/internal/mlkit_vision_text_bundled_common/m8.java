package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class m8 extends bw implements kx {
    private static final m8 zbb;
    private String zbd = "";
    private jw zbe = bw.C();

    static {
        m8 m8Var = new m8();
        zbb = m8Var;
        bw.l(m8.class, m8Var);
    }

    private m8() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"zbd", "zbe", s8.class});
        }
        if (i16 == 3) {
            return new m8();
        }
        j8 j8Var = null;
        if (i16 == 4) {
            return new l8(j8Var);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
