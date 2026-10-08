package ze;

/* JADX INFO: loaded from: classes3.dex */
final class g extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Integer f234529a;

    static final class b extends p.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Integer f234530a;

        b() {
        }

        @Override // ze.p.a
        public p a() {
            return new g(this.f234530a);
        }

        @Override // ze.p.a
        public p.a b(Integer num) {
            this.f234530a = num;
            return this;
        }
    }

    @Override // ze.p
    public Integer b() {
        return this.f234529a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        Integer num = this.f234529a;
        Integer numB = ((p) obj).b();
        if (num == null) {
            return numB == null;
        }
        return num.equals(numB);
    }

    public int hashCode() {
        Integer num = this.f234529a;
        return (num == null ? 0 : num.hashCode()) ^ 1000003;
    }

    public String toString() {
        return "ExternalPRequestContext{originAssociatedProductId=" + this.f234529a + "}";
    }

    private g(Integer num) {
        this.f234529a = num;
    }
}
