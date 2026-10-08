package zj;

/* JADX INFO: loaded from: classes4.dex */
final class s<T> extends m<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final T f235423a;

    s(T t15) {
        this.f235423a = t15;
    }

    @Override // zj.m
    public boolean b() {
        return true;
    }

    @Override // zj.m
    public T d(T t15) {
        p.r(t15, "use Optional.orNull() instead of Optional.or(null)");
        return this.f235423a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof s) {
            return this.f235423a.equals(((s) obj).f235423a);
        }
        return false;
    }

    public int hashCode() {
        return this.f235423a.hashCode() + 1502476572;
    }

    public String toString() {
        return "Optional.of(" + this.f235423a + ")";
    }
}
