package ol;

/* JADX INFO: loaded from: classes4.dex */
final class a extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f146540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f146541b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f146542c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final f f146543d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final d.b f146544e;

    static final class b extends d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f146545a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f146546b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f146547c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private f f146548d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private d.b f146549e;

        b() {
        }

        @Override // ol.d.a
        public d a() {
            return new a(this.f146545a, this.f146546b, this.f146547c, this.f146548d, this.f146549e);
        }

        @Override // ol.d.a
        public d.a b(f fVar) {
            this.f146548d = fVar;
            return this;
        }

        @Override // ol.d.a
        public d.a c(String str) {
            this.f146546b = str;
            return this;
        }

        @Override // ol.d.a
        public d.a d(String str) {
            this.f146547c = str;
            return this;
        }

        @Override // ol.d.a
        public d.a e(d.b bVar) {
            this.f146549e = bVar;
            return this;
        }

        @Override // ol.d.a
        public d.a f(String str) {
            this.f146545a = str;
            return this;
        }
    }

    @Override // ol.d
    public f b() {
        return this.f146543d;
    }

    @Override // ol.d
    public String c() {
        return this.f146541b;
    }

    @Override // ol.d
    public String d() {
        return this.f146542c;
    }

    @Override // ol.d
    public d.b e() {
        return this.f146544e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            String str = this.f146540a;
            if (str != null ? str.equals(dVar.f()) : dVar.f() == null) {
                String str2 = this.f146541b;
                if (str2 != null ? str2.equals(dVar.c()) : dVar.c() == null) {
                    String str3 = this.f146542c;
                    if (str3 != null ? str3.equals(dVar.d()) : dVar.d() == null) {
                        f fVar = this.f146543d;
                        if (fVar != null ? fVar.equals(dVar.b()) : dVar.b() == null) {
                            d.b bVar = this.f146544e;
                            if (bVar != null ? bVar.equals(dVar.e()) : dVar.e() == null) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // ol.d
    public String f() {
        return this.f146540a;
    }

    public int hashCode() {
        String str = this.f146540a;
        int iHashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f146541b;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f146542c;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        f fVar = this.f146543d;
        int iHashCode4 = (iHashCode3 ^ (fVar == null ? 0 : fVar.hashCode())) * 1000003;
        d.b bVar = this.f146544e;
        return iHashCode4 ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "InstallationResponse{uri=" + this.f146540a + ", fid=" + this.f146541b + ", refreshToken=" + this.f146542c + ", authToken=" + this.f146543d + ", responseCode=" + this.f146544e + "}";
    }

    private a(String str, String str2, String str3, f fVar, d.b bVar) {
        this.f146540a = str;
        this.f146541b = str2;
        this.f146542c = str3;
        this.f146543d = fVar;
        this.f146544e = bVar;
    }
}
