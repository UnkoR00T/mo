package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends bw implements kx {
    private static final l zbb;
    private Object zbe;
    private int zbd = 0;
    private byte zbf = 2;

    static {
        l lVar = new l();
        zbb = lVar;
        bw.l(l.class, lVar);
    }

    private l() {
    }

    public static l J() {
        return zbb;
    }

    public final boolean E() {
        return this.zbd == 1;
    }

    public final mq F() {
        return this.zbd == 3 ? (mq) this.zbe : mq.F();
    }

    public final sq G() {
        return this.zbd == 2 ? (sq) this.zbe : sq.K();
    }

    public final k H() {
        return this.zbd == 1 ? (k) this.zbe : k.G();
    }

    public final boolean K() {
        return this.zbd == 3;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return Byte.valueOf(this.zbf);
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0003\u0001м\u0000\u0002м\u0000\u0003м\u0000", new Object[]{"zbe", "zbd", k.class, sq.class, mq.class});
        }
        if (i16 == 3) {
            return new l();
        }
        f fVar = null;
        if (i16 == 4) {
            return new g(fVar);
        }
        if (i16 == 5) {
            return zbb;
        }
        this.zbf = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
