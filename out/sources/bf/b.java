package bf;

/* JADX INFO: loaded from: classes3.dex */
final class b extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g.a f19093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f19094b;

    b(g.a aVar, long j15) {
        if (aVar == null) {
            throw new NullPointerException("Null status");
        }
        this.f19093a = aVar;
        this.f19094b = j15;
    }

    @Override // bf.g
    public long b() {
        return this.f19094b;
    }

    @Override // bf.g
    public g.a c() {
        return this.f19093a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (this.f19093a.equals(gVar.c()) && this.f19094b == gVar.b()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (this.f19093a.hashCode() ^ 1000003) * 1000003;
        long j15 = this.f19094b;
        return iHashCode ^ ((int) (j15 ^ (j15 >>> 32)));
    }

    public String toString() {
        return "BackendResponse{status=" + this.f19093a + ", nextRequestWaitMillis=" + this.f19094b + "}";
    }
}
