package vr;

/* JADX INFO: loaded from: classes4.dex */
public abstract class x1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f208110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f208111b;

    protected x1(String str, boolean z15) {
        this.f208110a = str;
        this.f208111b = z15;
    }

    public Integer a(x1 x1Var) {
        return w1.f208094a.a(this, x1Var);
    }

    public String b() {
        return this.f208110a;
    }

    public final boolean c() {
        return this.f208111b;
    }

    public x1 d() {
        return this;
    }

    public final String toString() {
        return b();
    }
}
