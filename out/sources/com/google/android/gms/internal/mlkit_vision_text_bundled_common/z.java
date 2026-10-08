package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class z extends bw implements kx {
    private static final z zbb;
    private byte zbe = 2;
    private jw zbd = bw.C();

    static {
        z zVar = new z();
        zbb = zVar;
        bw.l(z.class, zVar);
    }

    private z() {
    }

    public static z F() {
        return zbb;
    }

    public final List G() {
        return this.zbd;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return Byte.valueOf(this.zbe);
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"zbd", y.class});
        }
        if (i16 == 3) {
            return new z();
        }
        f fVar = null;
        if (i16 == 4) {
            return new w(fVar);
        }
        if (i16 == 5) {
            return zbb;
        }
        this.zbe = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
