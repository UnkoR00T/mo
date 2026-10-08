package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
public final class c9 extends n8 {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final io.sentry.protocol.f0 f94711t = io.sentry.protocol.f0.CUSTOM;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f94712p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private io.sentry.protocol.f0 f94713q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private b9 f94714r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f94715s;

    public c9(String str, String str2) {
        this(str, str2, (b9) null);
    }

    public static c9 v(y3 y3Var) {
        Boolean boolF = y3Var.f();
        d dVarA = y3Var.a();
        return new c9(y3Var.e(), y3Var.d(), y3Var.b(), boolF == null ? null : new b9(boolF, dVarA.n(), y3Var.c()), dVarA);
    }

    public String w() {
        return this.f94712p;
    }

    public b9 x() {
        return this.f94714r;
    }

    public io.sentry.protocol.f0 y() {
        return this.f94713q;
    }

    public void z(boolean z15) {
        this.f94715s = z15;
    }

    public c9(String str, io.sentry.protocol.f0 f0Var, String str2) {
        this(str, f0Var, str2, null);
    }

    public c9(String str, String str2, b9 b9Var) {
        this(str, io.sentry.protocol.f0.CUSTOM, str2, b9Var);
    }

    public c9(String str, io.sentry.protocol.f0 f0Var, String str2, b9 b9Var) {
        super(str2);
        this.f94715s = false;
        this.f94712p = (String) io.sentry.util.v.c(str, "name is required");
        this.f94713q = f0Var;
        s(b9Var);
        this.f95230n = io.sentry.util.i0.e(null, b9Var);
    }

    public c9(io.sentry.protocol.v vVar, s8 s8Var, s8 s8Var2, b9 b9Var, d dVar) {
        super(vVar, s8Var, "default", s8Var2, null);
        this.f94715s = false;
        this.f94712p = "<unlabeled transaction>";
        this.f94714r = b9Var;
        this.f94713q = f94711t;
        this.f95230n = io.sentry.util.i0.e(dVar, b9Var);
    }
}
