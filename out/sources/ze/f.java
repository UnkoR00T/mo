package ze;

/* JADX INFO: loaded from: classes3.dex */
final class f extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q f234525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o.b f234526b;

    static final class b extends o.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private q f234527a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private o.b f234528b;

        b() {
        }

        @Override // ze.o.a
        public o a() {
            return new f(this.f234527a, this.f234528b);
        }

        @Override // ze.o.a
        public o.a b(q qVar) {
            this.f234527a = qVar;
            return this;
        }

        @Override // ze.o.a
        public o.a c(o.b bVar) {
            this.f234528b = bVar;
            return this;
        }
    }

    @Override // ze.o
    public q b() {
        return this.f234525a;
    }

    @Override // ze.o
    public o.b c() {
        return this.f234526b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o) {
            o oVar = (o) obj;
            q qVar = this.f234525a;
            if (qVar != null ? qVar.equals(oVar.b()) : oVar.b() == null) {
                o.b bVar = this.f234526b;
                if (bVar != null ? bVar.equals(oVar.c()) : oVar.c() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        q qVar = this.f234525a;
        int iHashCode = ((qVar == null ? 0 : qVar.hashCode()) ^ 1000003) * 1000003;
        o.b bVar = this.f234526b;
        return iHashCode ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "ComplianceData{privacyContext=" + this.f234525a + ", productIdOrigin=" + this.f234526b + "}";
    }

    private f(q qVar, o.b bVar) {
        this.f234525a = qVar;
        this.f234526b = bVar;
    }
}
