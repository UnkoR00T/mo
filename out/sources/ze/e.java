package ze;

/* JADX INFO: loaded from: classes3.dex */
final class e extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n.b f234521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ze.a f234522b;

    static final class b extends n.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private n.b f234523a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private ze.a f234524b;

        b() {
        }

        @Override // ze.n.a
        public n a() {
            return new e(this.f234523a, this.f234524b);
        }

        @Override // ze.n.a
        public n.a b(ze.a aVar) {
            this.f234524b = aVar;
            return this;
        }

        @Override // ze.n.a
        public n.a c(n.b bVar) {
            this.f234523a = bVar;
            return this;
        }
    }

    @Override // ze.n
    public ze.a b() {
        return this.f234522b;
    }

    @Override // ze.n
    public n.b c() {
        return this.f234521a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof n) {
            n nVar = (n) obj;
            n.b bVar = this.f234521a;
            if (bVar != null ? bVar.equals(nVar.c()) : nVar.c() == null) {
                ze.a aVar = this.f234522b;
                if (aVar != null ? aVar.equals(nVar.b()) : nVar.b() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        n.b bVar = this.f234521a;
        int iHashCode = ((bVar == null ? 0 : bVar.hashCode()) ^ 1000003) * 1000003;
        ze.a aVar = this.f234522b;
        return iHashCode ^ (aVar != null ? aVar.hashCode() : 0);
    }

    public String toString() {
        return "ClientInfo{clientType=" + this.f234521a + ", androidClientInfo=" + this.f234522b + "}";
    }

    private e(n.b bVar, ze.a aVar) {
        this.f234521a = bVar;
        this.f234522b = aVar;
    }
}
