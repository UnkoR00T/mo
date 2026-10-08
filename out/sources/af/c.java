package af;

/* JADX INFO: loaded from: classes3.dex */
final class c extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o f6106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f6107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ye.d<?> f6108c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ye.g<?, byte[]> f6109d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ye.c f6110e;

    static final class b extends n.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private o f6111a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f6112b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private ye.d<?> f6113c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private ye.g<?, byte[]> f6114d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private ye.c f6115e;

        b() {
        }

        @Override // af.n.a
        public n a() {
            String str = "";
            if (this.f6111a == null) {
                str = " transportContext";
            }
            if (this.f6112b == null) {
                str = str + " transportName";
            }
            if (this.f6113c == null) {
                str = str + " event";
            }
            if (this.f6114d == null) {
                str = str + " transformer";
            }
            if (this.f6115e == null) {
                str = str + " encoding";
            }
            if (str.isEmpty()) {
                return new c(this.f6111a, this.f6112b, this.f6113c, this.f6114d, this.f6115e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // af.n.a
        n.a b(ye.c cVar) {
            if (cVar == null) {
                throw new NullPointerException("Null encoding");
            }
            this.f6115e = cVar;
            return this;
        }

        @Override // af.n.a
        n.a c(ye.d<?> dVar) {
            if (dVar == null) {
                throw new NullPointerException("Null event");
            }
            this.f6113c = dVar;
            return this;
        }

        @Override // af.n.a
        n.a d(ye.g<?, byte[]> gVar) {
            if (gVar == null) {
                throw new NullPointerException("Null transformer");
            }
            this.f6114d = gVar;
            return this;
        }

        @Override // af.n.a
        public n.a e(o oVar) {
            if (oVar == null) {
                throw new NullPointerException("Null transportContext");
            }
            this.f6111a = oVar;
            return this;
        }

        @Override // af.n.a
        public n.a f(String str) {
            if (str == null) {
                throw new NullPointerException("Null transportName");
            }
            this.f6112b = str;
            return this;
        }
    }

    @Override // af.n
    public ye.c b() {
        return this.f6110e;
    }

    @Override // af.n
    ye.d<?> c() {
        return this.f6108c;
    }

    @Override // af.n
    ye.g<?, byte[]> e() {
        return this.f6109d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof n) {
            n nVar = (n) obj;
            if (this.f6106a.equals(nVar.f()) && this.f6107b.equals(nVar.g()) && this.f6108c.equals(nVar.c()) && this.f6109d.equals(nVar.e()) && this.f6110e.equals(nVar.b())) {
                return true;
            }
        }
        return false;
    }

    @Override // af.n
    public o f() {
        return this.f6106a;
    }

    @Override // af.n
    public String g() {
        return this.f6107b;
    }

    public int hashCode() {
        return ((((((((this.f6106a.hashCode() ^ 1000003) * 1000003) ^ this.f6107b.hashCode()) * 1000003) ^ this.f6108c.hashCode()) * 1000003) ^ this.f6109d.hashCode()) * 1000003) ^ this.f6110e.hashCode();
    }

    public String toString() {
        return "SendRequest{transportContext=" + this.f6106a + ", transportName=" + this.f6107b + ", event=" + this.f6108c + ", transformer=" + this.f6109d + ", encoding=" + this.f6110e + "}";
    }

    private c(o oVar, String str, ye.d<?> dVar, ye.g<?, byte[]> gVar, ye.c cVar) {
        this.f6106a = oVar;
        this.f6107b = str;
        this.f6108c = dVar;
        this.f6109d = gVar;
        this.f6110e = cVar;
    }
}
