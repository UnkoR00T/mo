package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class zk extends bw implements kx {
    private static final zk zbb;
    private byte zbe = 2;
    private jw zbd = bw.C();

    static {
        zk zkVar = new zk();
        zbb = zkVar;
        bw.l(zk.class, zkVar);
    }

    private zk() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return Byte.valueOf(this.zbe);
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"zbd", wk.class});
        }
        if (i16 == 3) {
            return new zk();
        }
        xk xkVar = null;
        if (i16 == 4) {
            return new yk(xkVar);
        }
        if (i16 == 5) {
            return zbb;
        }
        this.zbe = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
