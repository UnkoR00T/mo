package ze;

/* JADX INFO: loaded from: classes3.dex */
final class k extends t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f234563a;

    k(long j15) {
        this.f234563a = j15;
    }

    @Override // ze.t
    public long c() {
        return this.f234563a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof t) && this.f234563a == ((t) obj).c();
    }

    public int hashCode() {
        long j15 = this.f234563a;
        return ((int) (j15 ^ (j15 >>> 32))) ^ 1000003;
    }

    public String toString() {
        return "LogResponse{nextRequestWaitMillis=" + this.f234563a + "}";
    }
}
