package vr;

/* JADX INFO: loaded from: classes4.dex */
public abstract class r extends u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final x1 f208073a;

    public r(x1 x1Var) {
        this.f208073a = x1Var;
    }

    @Override // vr.u
    public x1 b() {
        return this.f208073a;
    }

    @Override // vr.u
    public String c() {
        return b().b();
    }

    @Override // vr.u
    public u f() {
        return t.j(b().d());
    }
}
