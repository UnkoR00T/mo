package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class o0 extends yv implements kx {
    private static final o0 zbd;
    private int zbe;
    private int zbf;
    private int zbg;
    private v zbh;
    private int zbj;
    private int zbk;
    private z zbm;
    private long zbp;
    private byte zbq = 2;
    private String zbi = "";
    private jw zbl = bw.C();
    private String zbn = "";
    private jw zbo = bw.C();

    static {
        o0 o0Var = new o0();
        zbd = o0Var;
        bw.l(o0.class, o0Var);
    }

    private o0() {
    }

    public static o0 G() {
        return zbd;
    }

    public final List H() {
        return this.zbl;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return Byte.valueOf(this.zbq);
        }
        if (i16 == 2) {
            return bw.f(zbd, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0002\u0003\u0001င\u0000\u0002င\u0001\u0003ᐉ\u0002\u0004ဈ\u0003\u0005င\u0004\u0006င\u0005\u0007Л\bᐉ\u0006\tဈ\u0007\n\u001a\u000bဂ\b", new Object[]{"zbe", "zbf", "zbg", "zbh", "zbi", "zbj", "zbk", "zbl", m0.class, "zbm", "zbn", "zbo", "zbp"});
        }
        if (i16 == 3) {
            return new o0();
        }
        f fVar = null;
        if (i16 == 4) {
            return new n0(fVar);
        }
        if (i16 == 5) {
            return zbd;
        }
        this.zbq = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
