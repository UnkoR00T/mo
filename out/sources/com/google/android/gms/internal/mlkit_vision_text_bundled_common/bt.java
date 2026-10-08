package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class bt extends bw implements kx {
    private static final bt zbb;
    private byte zbe = 2;
    private jw zbd = bw.C();

    static {
        bt btVar = new bt();
        zbb = btVar;
        bw.l(bt.class, btVar);
    }

    private bt() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return Byte.valueOf(this.zbe);
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"zbd", zs.class});
        }
        if (i16 == 3) {
            return new bt();
        }
        lr lrVar = null;
        if (i16 == 4) {
            return new at(lrVar);
        }
        if (i16 == 5) {
            return zbb;
        }
        this.zbe = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
