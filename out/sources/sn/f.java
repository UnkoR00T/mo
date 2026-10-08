package sn;

import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final f f182434e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final f f182435f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final f f182436g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final f f182437h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final f f182438j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final f f182439k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final f f182440l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final f f182441m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final f f182442n;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f182443d;

    static {
        a0 a0Var = a0.REQUIRED;
        f182434e = new f("A128CBC-HS256", a0Var, 256);
        a0 a0Var2 = a0.OPTIONAL;
        f182435f = new f("A192CBC-HS384", a0Var2, MLKEMEngine.KyberPolyBytes);
        f182436g = new f("A256CBC-HS512", a0Var, 512);
        f182437h = new f("A128CBC+HS256", a0Var2, 256);
        f182438j = new f("A256CBC+HS512", a0Var2, 512);
        a0 a0Var3 = a0.RECOMMENDED;
        f182439k = new f("A128GCM", a0Var3, 128);
        f182440l = new f("A192GCM", a0Var2, 192);
        f182441m = new f("A256GCM", a0Var3, 256);
        f182442n = new f("XC20P", a0Var2, 256);
    }

    public f(String str, a0 a0Var, int i15) {
        super(str, a0Var);
        this.f182443d = i15;
    }

    public static f d(String str) {
        f fVar = f182434e;
        if (str.equals(fVar.a())) {
            return fVar;
        }
        f fVar2 = f182435f;
        if (str.equals(fVar2.a())) {
            return fVar2;
        }
        f fVar3 = f182436g;
        if (str.equals(fVar3.a())) {
            return fVar3;
        }
        f fVar4 = f182439k;
        if (str.equals(fVar4.a())) {
            return fVar4;
        }
        f fVar5 = f182440l;
        if (str.equals(fVar5.a())) {
            return fVar5;
        }
        f fVar6 = f182441m;
        if (str.equals(fVar6.a())) {
            return fVar6;
        }
        f fVar7 = f182437h;
        if (str.equals(fVar7.a())) {
            return fVar7;
        }
        f fVar8 = f182438j;
        if (str.equals(fVar8.a())) {
            return fVar8;
        }
        f fVar9 = f182442n;
        return str.equals(fVar9.a()) ? fVar9 : new f(str);
    }

    public int c() {
        return this.f182443d;
    }

    public f(String str) {
        this(str, null, 0);
    }
}
