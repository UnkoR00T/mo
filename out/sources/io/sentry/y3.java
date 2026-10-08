package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
public final class y3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private io.sentry.protocol.v f95978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private s8 f95979b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private s8 f95980c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Boolean f95981d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final d f95982e;

    public y3() {
        this(new io.sentry.protocol.v(), new s8(), null, null, null);
    }

    public d a() {
        return this.f95982e;
    }

    public s8 b() {
        return this.f95980c;
    }

    public Double c() {
        Double dM = this.f95982e.m();
        return Double.valueOf(dM == null ? 0.0d : dM.doubleValue());
    }

    public s8 d() {
        return this.f95979b;
    }

    public io.sentry.protocol.v e() {
        return this.f95978a;
    }

    public Boolean f() {
        return this.f95981d;
    }

    public n8 g() {
        n8 n8Var = new n8(this.f95978a, this.f95979b, "default", null, null);
        n8Var.r("auto");
        return n8Var;
    }

    public z8 h() {
        return this.f95982e.Q();
    }

    public y3(y3 y3Var) {
        this(y3Var.e(), y3Var.d(), y3Var.b(), y3Var.a(), y3Var.f());
    }

    public y3(io.sentry.protocol.v vVar, s8 s8Var, s8 s8Var2, d dVar, Boolean bool) {
        this.f95978a = vVar;
        this.f95979b = s8Var;
        this.f95980c = s8Var2;
        this.f95982e = io.sentry.util.i0.f(dVar, bool, null, null);
        this.f95981d = bool;
    }
}
