package ze;

/* JADX INFO: loaded from: classes3.dex */
final class h extends q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p f234531a;

    static final class b extends q.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private p f234532a;

        b() {
        }

        @Override // ze.q.a
        public q a() {
            return new h(this.f234532a);
        }

        @Override // ze.q.a
        public q.a b(p pVar) {
            this.f234532a = pVar;
            return this;
        }
    }

    @Override // ze.q
    public p b() {
        return this.f234531a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        p pVar = this.f234531a;
        p pVarB = ((q) obj).b();
        if (pVar == null) {
            return pVarB == null;
        }
        return pVar.equals(pVarB);
    }

    public int hashCode() {
        p pVar = this.f234531a;
        return (pVar == null ? 0 : pVar.hashCode()) ^ 1000003;
    }

    public String toString() {
        return "ExternalPrivacyContext{prequest=" + this.f234531a + "}";
    }

    private h(p pVar) {
        this.f234531a = pVar;
    }
}
