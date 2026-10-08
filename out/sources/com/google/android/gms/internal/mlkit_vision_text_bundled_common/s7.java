package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import org.bouncycastle.asn1.x509.DisplayText;

/* JADX INFO: loaded from: classes3.dex */
public final class s7 extends bw implements kx {
    private static final s7 zbb;
    private int zbd;
    private boolean zbg;
    private boolean zbo;
    private float zbe = 0.05f;
    private float zbf = 0.5f;
    private int zbh = 10;
    private int zbi = DisplayText.DISPLAY_TEXT_MAXIMUM_SIZE;
    private float zbj = 0.8f;
    private int zbk = 4;
    private int zbl = 10;
    private float zbm = 0.2f;
    private float zbn = 0.1f;

    static {
        s7 s7Var = new s7();
        zbb = s7Var;
        bw.l(s7.class, s7Var);
    }

    private s7() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return bw.f(zbb, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003င\u0003\u0004င\u0004\u0005င\u0006\u0006င\u0007\u0007ခ\b\bခ\t\tဇ\n\nခ\u0005\u000bဇ\u0002", new Object[]{"zbd", "zbe", "zbf", "zbh", "zbi", "zbk", "zbl", "zbm", "zbn", "zbo", "zbj", "zbg"});
        }
        if (i16 == 3) {
            return new s7();
        }
        q7 q7Var = null;
        if (i16 == 4) {
            return new r7(q7Var);
        }
        if (i16 != 5) {
            return null;
        }
        return zbb;
    }
}
