package nl;

/* JADX INFO: loaded from: classes4.dex */
final class a extends d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f137177b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c.a f137178c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f137179d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f137180e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f137181f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f137182g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f137183h;

    static final class b extends d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f137184a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private c.a f137185b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f137186c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f137187d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f137188e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f137189f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f137190g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private byte f137191h;

        @Override // nl.d.a
        public d a() {
            if (this.f137191h == 3 && this.f137185b != null) {
                return new a(this.f137184a, this.f137185b, this.f137186c, this.f137187d, this.f137188e, this.f137189f, this.f137190g);
            }
            StringBuilder sb5 = new StringBuilder();
            if (this.f137185b == null) {
                sb5.append(" registrationStatus");
            }
            if ((this.f137191h & 1) == 0) {
                sb5.append(" expiresInSecs");
            }
            if ((this.f137191h & 2) == 0) {
                sb5.append(" tokenCreationEpochInSecs");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb5));
        }

        @Override // nl.d.a
        public d.a b(String str) {
            this.f137186c = str;
            return this;
        }

        @Override // nl.d.a
        public d.a c(long j15) {
            this.f137188e = j15;
            this.f137191h = (byte) (this.f137191h | 1);
            return this;
        }

        @Override // nl.d.a
        public d.a d(String str) {
            this.f137184a = str;
            return this;
        }

        @Override // nl.d.a
        public d.a e(String str) {
            this.f137190g = str;
            return this;
        }

        @Override // nl.d.a
        public d.a f(String str) {
            this.f137187d = str;
            return this;
        }

        @Override // nl.d.a
        public d.a g(c.a aVar) {
            if (aVar == null) {
                throw new NullPointerException("Null registrationStatus");
            }
            this.f137185b = aVar;
            return this;
        }

        @Override // nl.d.a
        public d.a h(long j15) {
            this.f137189f = j15;
            this.f137191h = (byte) (this.f137191h | 2);
            return this;
        }

        b() {
        }

        private b(d dVar) {
            this.f137184a = dVar.d();
            this.f137185b = dVar.g();
            this.f137186c = dVar.b();
            this.f137187d = dVar.f();
            this.f137188e = dVar.c();
            this.f137189f = dVar.h();
            this.f137190g = dVar.e();
            this.f137191h = (byte) 3;
        }
    }

    @Override // nl.d
    public String b() {
        return this.f137179d;
    }

    @Override // nl.d
    public long c() {
        return this.f137181f;
    }

    @Override // nl.d
    public String d() {
        return this.f137177b;
    }

    @Override // nl.d
    public String e() {
        return this.f137183h;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            String str4 = this.f137177b;
            if (str4 != null ? str4.equals(dVar.d()) : dVar.d() == null) {
                if (this.f137178c.equals(dVar.g()) && ((str = this.f137179d) != null ? str.equals(dVar.b()) : dVar.b() == null) && ((str2 = this.f137180e) != null ? str2.equals(dVar.f()) : dVar.f() == null) && this.f137181f == dVar.c() && this.f137182g == dVar.h() && ((str3 = this.f137183h) != null ? str3.equals(dVar.e()) : dVar.e() == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // nl.d
    public String f() {
        return this.f137180e;
    }

    @Override // nl.d
    public c.a g() {
        return this.f137178c;
    }

    @Override // nl.d
    public long h() {
        return this.f137182g;
    }

    public int hashCode() {
        String str = this.f137177b;
        int iHashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.f137178c.hashCode()) * 1000003;
        String str2 = this.f137179d;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f137180e;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        long j15 = this.f137181f;
        int i15 = (iHashCode3 ^ ((int) (j15 ^ (j15 >>> 32)))) * 1000003;
        long j16 = this.f137182g;
        int i16 = (i15 ^ ((int) (j16 ^ (j16 >>> 32)))) * 1000003;
        String str4 = this.f137183h;
        return i16 ^ (str4 != null ? str4.hashCode() : 0);
    }

    @Override // nl.d
    public d.a n() {
        return new b(this);
    }

    public String toString() {
        return "PersistedInstallationEntry{firebaseInstallationId=" + this.f137177b + ", registrationStatus=" + this.f137178c + ", authToken=" + this.f137179d + ", refreshToken=" + this.f137180e + ", expiresInSecs=" + this.f137181f + ", tokenCreationEpochInSecs=" + this.f137182g + ", fisError=" + this.f137183h + "}";
    }

    private a(String str, c.a aVar, String str2, String str3, long j15, long j16, String str4) {
        this.f137177b = str;
        this.f137178c = aVar;
        this.f137179d = str2;
        this.f137180e = str3;
        this.f137181f = j15;
        this.f137182g = j16;
        this.f137183h = str4;
    }
}
