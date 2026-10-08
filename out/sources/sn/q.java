package sn;

import org.bouncycastle.jcajce.spec.EdDSAParameterSpec;

/* JADX INFO: loaded from: classes4.dex */
public final class q extends b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final q f182527d = new q("HS256", a0.REQUIRED);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final q f182528e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final q f182529f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final q f182530g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final q f182531h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final q f182532j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final q f182533k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final q f182534l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final q f182535m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final q f182536n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final q f182537p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final q f182538q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final q f182539r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final q f182540s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final q f182541t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final q f182542v;

    static {
        a0 a0Var = a0.OPTIONAL;
        f182528e = new q("HS384", a0Var);
        f182529f = new q("HS512", a0Var);
        a0 a0Var2 = a0.RECOMMENDED;
        f182530g = new q("RS256", a0Var2);
        f182531h = new q("RS384", a0Var);
        f182532j = new q("RS512", a0Var);
        f182533k = new q("ES256", a0Var2);
        f182534l = new q("ES256K", a0Var);
        f182535m = new q("ES384", a0Var);
        f182536n = new q("ES512", a0Var);
        f182537p = new q("PS256", a0Var);
        f182538q = new q("PS384", a0Var);
        f182539r = new q("PS512", a0Var);
        f182540s = new q("EdDSA", a0Var);
        f182541t = new q(EdDSAParameterSpec.Ed25519, a0Var);
        f182542v = new q(EdDSAParameterSpec.Ed448, a0Var);
    }

    public q(String str, a0 a0Var) {
        super(str, a0Var);
    }

    public static q c(String str) {
        q qVar = f182527d;
        if (str.equals(qVar.a())) {
            return qVar;
        }
        q qVar2 = f182528e;
        if (str.equals(qVar2.a())) {
            return qVar2;
        }
        q qVar3 = f182529f;
        if (str.equals(qVar3.a())) {
            return qVar3;
        }
        q qVar4 = f182530g;
        if (str.equals(qVar4.a())) {
            return qVar4;
        }
        q qVar5 = f182531h;
        if (str.equals(qVar5.a())) {
            return qVar5;
        }
        q qVar6 = f182532j;
        if (str.equals(qVar6.a())) {
            return qVar6;
        }
        q qVar7 = f182533k;
        if (str.equals(qVar7.a())) {
            return qVar7;
        }
        q qVar8 = f182534l;
        if (str.equals(qVar8.a())) {
            return qVar8;
        }
        q qVar9 = f182535m;
        if (str.equals(qVar9.a())) {
            return qVar9;
        }
        q qVar10 = f182536n;
        if (str.equals(qVar10.a())) {
            return qVar10;
        }
        q qVar11 = f182537p;
        if (str.equals(qVar11.a())) {
            return qVar11;
        }
        q qVar12 = f182538q;
        if (str.equals(qVar12.a())) {
            return qVar12;
        }
        q qVar13 = f182539r;
        if (str.equals(qVar13.a())) {
            return qVar13;
        }
        q qVar14 = f182540s;
        if (str.equals(qVar14.a())) {
            return qVar14;
        }
        q qVar15 = f182541t;
        if (str.equals(qVar15.a())) {
            return qVar15;
        }
        q qVar16 = f182542v;
        return str.equals(qVar16.a()) ? qVar16 : new q(str);
    }

    public q(String str) {
        super(str, null);
    }
}
