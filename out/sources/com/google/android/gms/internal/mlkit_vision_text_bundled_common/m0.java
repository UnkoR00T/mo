package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public final class m0 extends yv implements kx {
    private static final m0 zbd;
    private int zbD;
    private t zbE;
    private e zbF;
    private int zbG;
    private int zbe;
    private l zbh;
    private v zbi;
    private int zbk;
    private pq zbl;
    private float zbm;
    private float zbn;
    private float zbo;
    private float zbp;
    private float zbq;
    private z zbs;
    private o zbu;
    private f0 zbv;
    private l0 zbw;
    private int zbx;
    private long zby;
    private ku zbz;
    private byte zbH = 2;
    private int zbf = -1;
    private hw zbg = bw.A();
    private int zbj = 2;
    private String zbr = "";
    private String zbt = "";
    private String zbA = "";
    private jw zbB = bw.C();
    private gw zbC = bw.z();

    static {
        m0 m0Var = new m0();
        zbd = m0Var;
        bw.l(m0.class, m0Var);
    }

    private m0() {
    }

    public final String F() {
        return this.zbt;
    }

    public final int G() {
        int iA = j0.a(this.zbj);
        if (iA == 0) {
            return 3;
        }
        return iA;
    }

    public final float H() {
        return this.zbp;
    }

    public final int I() {
        return this.zbf;
    }

    public final l J() {
        l lVar = this.zbh;
        return lVar == null ? l.J() : lVar;
    }

    public final z K() {
        z zVar = this.zbs;
        return zVar == null ? z.F() : zVar;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return Byte.valueOf(this.zbH);
        }
        if (i16 == 2) {
            return bw.f(zbd, "\u0001\u001c\u0000\u0001\u0001 \u001c\u0000\u0003\u0005\u0001င\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004᠌\u0003\u0005᠌\u0004\u0006ဉ\u0005\u0007ခ\t\bဈ\u000b\rᐉ\f\u000eခ\u0006\u000fဈ\r\u0010ᐉ\u000e\u0011ဉ\u000f\u0012ဉ\u0010\u0013င\u0011\u0014ဂ\u0012\u0015ဉ\u0013\u0016ခ\b\u0017ဈ\u0014\u0018\u001a\u0019\u0013\u001aင\u0015\u001bခ\u0007\u001cဉ\u0016\u001d'\u001eᐉ\u0017\u001fခ\n င\u0018", new Object[]{"zbe", "zbf", "zbh", "zbi", "zbj", i0.f30450a, "zbk", g0.f30428a, "zbl", "zbp", "zbr", "zbs", "zbm", "zbt", "zbu", "zbv", "zbw", "zbx", "zby", "zbz", "zbo", "zbA", "zbB", "zbC", "zbD", "zbn", "zbE", "zbg", "zbF", "zbq", "zbG"});
        }
        if (i16 == 3) {
            return new m0();
        }
        f fVar = null;
        if (i16 == 4) {
            return new a0(fVar);
        }
        if (i16 == 5) {
            return zbd;
        }
        this.zbH = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
