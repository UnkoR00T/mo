package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class s1 extends bw implements kx {
    private static final s1 zbb;
    private byte zbe = 2;
    private jw zbd = bw.C();

    static {
        s1 s1Var = new s1();
        zbb = s1Var;
        bw.l(s1.class, s1Var);
    }

    private s1() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return Byte.valueOf(this.zbe);
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"zbd", p1.class});
        }
        if (i16 == 3) {
            return new s1();
        }
        q1 q1Var = null;
        if (i16 == 4) {
            return new r1(q1Var);
        }
        if (i16 == 5) {
            return zbb;
        }
        this.zbe = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
