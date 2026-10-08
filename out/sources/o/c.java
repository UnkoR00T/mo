package o;

/* JADX INFO: loaded from: classes.dex */
final class c extends t.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f139897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Throwable f139898b;

    c(int i15, Throwable th4) {
        this.f139897a = i15;
        this.f139898b = th4;
    }

    @Override // o.t.a
    public Throwable c() {
        return this.f139898b;
    }

    @Override // o.t.a
    public int d() {
        return this.f139897a;
    }

    public boolean equals(Object obj) {
        Throwable th4;
        if (obj == this) {
            return true;
        }
        if (obj instanceof t.a) {
            t.a aVar = (t.a) obj;
            if (this.f139897a == aVar.d() && ((th4 = this.f139898b) != null ? th4.equals(aVar.c()) : aVar.c() == null)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i15 = (this.f139897a ^ 1000003) * 1000003;
        Throwable th4 = this.f139898b;
        return i15 ^ (th4 == null ? 0 : th4.hashCode());
    }

    public String toString() {
        return "StateError{code=" + this.f139897a + ", cause=" + this.f139898b + "}";
    }
}
