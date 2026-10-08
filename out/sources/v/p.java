package v;

/* JADX INFO: loaded from: classes.dex */
final class p extends m3.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Throwable f202753a;

    p(Throwable th4) {
        if (th4 == null) {
            throw new NullPointerException("Null error");
        }
        this.f202753a = th4;
    }

    @Override // v.m3.a
    public Throwable a() {
        return this.f202753a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof m3.a) {
            return this.f202753a.equals(((m3.a) obj).a());
        }
        return false;
    }

    public int hashCode() {
        return this.f202753a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "ErrorWrapper{error=" + this.f202753a + "}";
    }
}
