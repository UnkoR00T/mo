package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class fk extends bw implements kx {
    private static final fk zbb;
    private int zbd;
    private ti zbe;
    private ti zbf;

    static {
        fk fkVar = new fk();
        zbb = fkVar;
        bw.l(fk.class, fkVar);
    }

    private fk() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u0002\u0000\u0001\u0005\u0006\u0002\u0000\u0000\u0000\u0005ဉ\u0000\u0006ဉ\u0001", new Object[]{"zbd", "zbe", "zbf"});
        }
        if (i16 == 3) {
            return new fk();
        }
        ck ckVar = null;
        if (i16 == 4) {
            return new ek(ckVar);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
