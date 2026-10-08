package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class go extends bw implements kx {
    private static final go zbb;
    private int zbd;
    private io zbj;
    private byte zbk = 2;
    private String zbe = "";
    private jw zbf = bw.C();
    private jw zbg = bw.C();
    private jw zbh = bw.C();
    private jw zbi = bw.C();

    static {
        go goVar = new go();
        zbb = goVar;
        bw.l(go.class, goVar);
    }

    private go() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return Byte.valueOf(this.zbk);
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u0006\u0000\u0001\u0001ϫ\u0006\u0000\u0004\u0001\u0001ဈ\u0000\u0002\u001a\u0003\u001a\u0004ᐉ\u0001Ϫ\u001aϫ\u001a", new Object[]{"zbd", "zbe", "zbf", "zbh", "zbj", "zbg", "zbi"});
        }
        if (i16 == 3) {
            return new go();
        }
        eo eoVar = null;
        if (i16 == 4) {
            return new fo(eoVar);
        }
        if (i16 == 5) {
            return zbb;
        }
        this.zbk = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
