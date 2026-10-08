package ol;

/* JADX INFO: loaded from: classes4.dex */
final class b extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f146550a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f146551b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f.b f146552c;

    /* JADX INFO: renamed from: ol.b$b, reason: collision with other inner class name */
    static final class C3643b extends f.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f146553a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f146554b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private f.b f146555c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private byte f146556d;

        C3643b() {
        }

        @Override // ol.f.a
        public f a() {
            if (this.f146556d == 1) {
                return new b(this.f146553a, this.f146554b, this.f146555c);
            }
            throw new IllegalStateException("Missing required properties: tokenExpirationTimestamp");
        }

        @Override // ol.f.a
        public f.a b(f.b bVar) {
            this.f146555c = bVar;
            return this;
        }

        @Override // ol.f.a
        public f.a c(String str) {
            this.f146553a = str;
            return this;
        }

        @Override // ol.f.a
        public f.a d(long j15) {
            this.f146554b = j15;
            this.f146556d = (byte) (this.f146556d | 1);
            return this;
        }
    }

    @Override // ol.f
    public f.b b() {
        return this.f146552c;
    }

    @Override // ol.f
    public String c() {
        return this.f146550a;
    }

    @Override // ol.f
    public long d() {
        return this.f146551b;
    }

    public boolean equals(Object obj) {
        f.b bVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            String str = this.f146550a;
            if (str != null ? str.equals(fVar.c()) : fVar.c() == null) {
                if (this.f146551b == fVar.d() && ((bVar = this.f146552c) != null ? bVar.equals(fVar.b()) : fVar.b() == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f146550a;
        int iHashCode = str == null ? 0 : str.hashCode();
        long j15 = this.f146551b;
        int i15 = (((iHashCode ^ 1000003) * 1000003) ^ ((int) (j15 ^ (j15 >>> 32)))) * 1000003;
        f.b bVar = this.f146552c;
        return i15 ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "TokenResult{token=" + this.f146550a + ", tokenExpirationTimestamp=" + this.f146551b + ", responseCode=" + this.f146552c + "}";
    }

    private b(String str, long j15, f.b bVar) {
        this.f146550a = str;
        this.f146551b = j15;
        this.f146552c = bVar;
    }
}
