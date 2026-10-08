package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class vz extends bw implements kx {
    private static final vz zbb;
    private int zbd;
    private int zbe;
    private int zbf;
    private jw zbg = bw.C();
    private int zbh;

    static {
        vz vzVar = new vz();
        zbb = vzVar;
        bw.l(vz.class, vzVar);
    }

    private vz() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001᠌\u0000\u0002င\u0001\u0003\u001a\u0004င\u0002", new Object[]{"zbd", "zbe", uz.f30652a, "zbf", "zbg", "zbh"});
        }
        if (i16 == 3) {
            return new vz();
        }
        yy yyVar = null;
        if (i16 == 4) {
            return new tz(yyVar);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
