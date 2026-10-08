package es;

/* JADX INFO: loaded from: classes4.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e0 f53068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d0 f53069b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Integer f53070c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f53071d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b0 f53072e;

    public final e0 a() {
        e0 e0Var = this.f53068a;
        if (e0Var != null) {
            return e0Var;
        }
        return null;
    }

    public final d0 b() {
        d0 d0Var = this.f53069b;
        if (d0Var != null) {
            return d0Var;
        }
        return null;
    }

    public final b0 c() {
        b0 b0Var = this.f53072e;
        if (b0Var != null) {
            return b0Var;
        }
        return null;
    }

    public final void d(Integer num) {
        this.f53070c = num;
    }

    public final void e(e0 e0Var) {
        this.f53068a = e0Var;
    }

    public final void f(d0 d0Var) {
        this.f53069b = d0Var;
    }

    public final void g(String str) {
        this.f53071d = str;
    }

    public final void h(b0 b0Var) {
        this.f53072e = b0Var;
    }

    public String toString() {
        return "KmVersionRequirement(kind=" + a() + ", level=" + b() + ", version=" + c() + ", errorCode=" + this.f53070c + ", message=" + this.f53071d + ')';
    }
}
