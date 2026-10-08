package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class nn extends bw implements kx {
    private static final nn zbb;
    private long zbd;
    private long zbe;
    private boolean zbf;
    private boolean zbg;
    private boolean zbh;
    private boolean zbi;
    private long zbj;
    private int zbm;
    private long zbn;
    private long zbo;
    private boolean zbp;
    private int zbq;
    private boolean zbr;
    private boolean zbs;
    private boolean zbt;
    private hw zbk = bw.A();
    private String zbl = "";
    private String zbu = "";

    static {
        nn nnVar = new nn();
        zbb = nnVar;
        bw.l(nn.class, nnVar);
    }

    private nn() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0000\u0012\u0000\u0000\u0001\u0012\u0012\u0000\u0001\u0000\u0001\u0002\u0002\u0002\u0003\u0007\u0004\u0007\u0005\u0007\u0006\u0007\u0007\u0002\b'\tȈ\n\u0004\u000b\u0002\f\u0002\r\u0007\u000e\u0004\u000f\u0007\u0010\u0007\u0011\u0007\u0012Ȉ", new Object[]{"zbd", "zbe", "zbf", "zbg", "zbh", "zbi", "zbj", "zbk", "zbl", "zbm", "zbn", "zbo", "zbp", "zbq", "zbr", "zbs", "zbt", "zbu"});
        }
        if (i16 == 3) {
            return new nn();
        }
        cn cnVar = null;
        if (i16 == 4) {
            return new ln(cnVar);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
