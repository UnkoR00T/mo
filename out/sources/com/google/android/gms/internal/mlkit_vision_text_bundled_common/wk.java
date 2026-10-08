package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class wk extends yv implements kx {
    private static final wk zbd;
    private int zbe;
    private long zbf;
    private vh zbg;
    private di zbh;
    private byte zbj = 2;
    private jw zbi = bw.C();

    static {
        wk wkVar = new wk();
        zbd = wkVar;
        bw.l(wk.class, wkVar);
    }

    private wk() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return Byte.valueOf(this.zbj);
        }
        if (i16 == 2) {
            return bw.f(zbd, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဂ\u0000\u0002ဉ\u0001\u0003\u001b\u0004ဉ\u0002", new Object[]{"zbe", "zbf", "zbg", "zbi", gi.class, "zbh"});
        }
        if (i16 == 3) {
            return new wk();
        }
        uk ukVar = null;
        if (i16 == 4) {
            return new vk(ukVar);
        }
        if (i16 == 5) {
            return zbd;
        }
        this.zbj = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
