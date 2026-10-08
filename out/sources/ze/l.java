package ze;

/* JADX INFO: loaded from: classes3.dex */
final class l extends u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u.c f234564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final u.b f234565b;

    static final class b extends u.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private u.c f234566a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private u.b f234567b;

        b() {
        }

        @Override // ze.u.a
        public u a() {
            return new l(this.f234566a, this.f234567b);
        }

        @Override // ze.u.a
        public u.a b(u.b bVar) {
            this.f234567b = bVar;
            return this;
        }

        @Override // ze.u.a
        public u.a c(u.c cVar) {
            this.f234566a = cVar;
            return this;
        }
    }

    @Override // ze.u
    public u.b b() {
        return this.f234565b;
    }

    @Override // ze.u
    public u.c c() {
        return this.f234564a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof u) {
            u uVar = (u) obj;
            u.c cVar = this.f234564a;
            if (cVar != null ? cVar.equals(uVar.c()) : uVar.c() == null) {
                u.b bVar = this.f234565b;
                if (bVar != null ? bVar.equals(uVar.b()) : uVar.b() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        u.c cVar = this.f234564a;
        int iHashCode = ((cVar == null ? 0 : cVar.hashCode()) ^ 1000003) * 1000003;
        u.b bVar = this.f234565b;
        return iHashCode ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f234564a + ", mobileSubtype=" + this.f234565b + "}";
    }

    private l(u.c cVar, u.b bVar) {
        this.f234564a = cVar;
        this.f234565b = bVar;
    }
}
