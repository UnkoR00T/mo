package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class zi extends bw implements kx {
    private static final zi zbb;
    private int zbd;
    private Object zbf;
    private boolean zbg;
    private long zbi;
    private float zbm;
    private float zbn;
    private float zbo;
    private int zbe = 0;
    private byte zbp = 2;
    private jw zbh = bw.C();
    private boolean zbj = true;
    private gw zbk = bw.z();
    private float zbl = 0.15f;

    static {
        zi ziVar = new zi();
        zbb = ziVar;
        bw.l(zi.class, ziVar);
    }

    private zi() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return Byte.valueOf(this.zbp);
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\n\u0001\u0001\u0002\r\n\u0000\u0002\u0001\u0002м\u0000\u0003ဇ\u0000\u0004\u001b\u0005\u0013\u0006ခ\u0003\u0007ခ\u0004\bခ\u0005\u000bခ\u0006\fဂ\u0001\rဇ\u0002", new Object[]{"zbf", "zbe", "zbd", vj.class, "zbg", "zbh", qi.class, "zbk", "zbl", "zbm", "zbn", "zbo", "zbi", "zbj"});
        }
        if (i16 == 3) {
            return new zi();
        }
        xi xiVar = null;
        if (i16 == 4) {
            return new yi(xiVar);
        }
        if (i16 == 5) {
            return zbb;
        }
        this.zbp = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
