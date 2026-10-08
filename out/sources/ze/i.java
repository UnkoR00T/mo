package ze;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
final class i extends r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f234533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Integer f234534b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final o f234535c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f234536d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final byte[] f234537e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f234538f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f234539g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final u f234540h;

    static final class b extends r.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Long f234541a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Integer f234542b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private o f234543c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Long f234544d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private byte[] f234545e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private String f234546f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Long f234547g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private u f234548h;

        b() {
        }

        @Override // ze.r.a
        public r a() {
            String str = "";
            if (this.f234541a == null) {
                str = " eventTimeMs";
            }
            if (this.f234544d == null) {
                str = str + " eventUptimeMs";
            }
            if (this.f234547g == null) {
                str = str + " timezoneOffsetSeconds";
            }
            if (str.isEmpty()) {
                return new i(this.f234541a.longValue(), this.f234542b, this.f234543c, this.f234544d.longValue(), this.f234545e, this.f234546f, this.f234547g.longValue(), this.f234548h);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // ze.r.a
        public r.a b(o oVar) {
            this.f234543c = oVar;
            return this;
        }

        @Override // ze.r.a
        public r.a c(Integer num) {
            this.f234542b = num;
            return this;
        }

        @Override // ze.r.a
        public r.a d(long j15) {
            this.f234541a = Long.valueOf(j15);
            return this;
        }

        @Override // ze.r.a
        public r.a e(long j15) {
            this.f234544d = Long.valueOf(j15);
            return this;
        }

        @Override // ze.r.a
        public r.a f(u uVar) {
            this.f234548h = uVar;
            return this;
        }

        @Override // ze.r.a
        r.a g(byte[] bArr) {
            this.f234545e = bArr;
            return this;
        }

        @Override // ze.r.a
        r.a h(String str) {
            this.f234546f = str;
            return this;
        }

        @Override // ze.r.a
        public r.a i(long j15) {
            this.f234547g = Long.valueOf(j15);
            return this;
        }
    }

    @Override // ze.r
    public o b() {
        return this.f234535c;
    }

    @Override // ze.r
    public Integer c() {
        return this.f234534b;
    }

    @Override // ze.r
    public long d() {
        return this.f234533a;
    }

    @Override // ze.r
    public long e() {
        return this.f234536d;
    }

    public boolean equals(Object obj) {
        Integer num;
        o oVar;
        String str;
        u uVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof r) {
            r rVar = (r) obj;
            if (this.f234533a == rVar.d() && ((num = this.f234534b) != null ? num.equals(rVar.c()) : rVar.c() == null) && ((oVar = this.f234535c) != null ? oVar.equals(rVar.b()) : rVar.b() == null) && this.f234536d == rVar.e()) {
                if (Arrays.equals(this.f234537e, rVar instanceof i ? ((i) rVar).f234537e : rVar.g()) && ((str = this.f234538f) != null ? str.equals(rVar.h()) : rVar.h() == null) && this.f234539g == rVar.i() && ((uVar = this.f234540h) != null ? uVar.equals(rVar.f()) : rVar.f() == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // ze.r
    public u f() {
        return this.f234540h;
    }

    @Override // ze.r
    public byte[] g() {
        return this.f234537e;
    }

    @Override // ze.r
    public String h() {
        return this.f234538f;
    }

    public int hashCode() {
        long j15 = this.f234533a;
        int i15 = (((int) (j15 ^ (j15 >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f234534b;
        int iHashCode = (i15 ^ (num == null ? 0 : num.hashCode())) * 1000003;
        o oVar = this.f234535c;
        int iHashCode2 = oVar == null ? 0 : oVar.hashCode();
        long j16 = this.f234536d;
        int iHashCode3 = (((((iHashCode ^ iHashCode2) * 1000003) ^ ((int) (j16 ^ (j16 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f234537e)) * 1000003;
        String str = this.f234538f;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        long j17 = this.f234539g;
        int i16 = (((iHashCode3 ^ iHashCode4) * 1000003) ^ ((int) ((j17 >>> 32) ^ j17))) * 1000003;
        u uVar = this.f234540h;
        return i16 ^ (uVar != null ? uVar.hashCode() : 0);
    }

    @Override // ze.r
    public long i() {
        return this.f234539g;
    }

    public String toString() {
        return "LogEvent{eventTimeMs=" + this.f234533a + ", eventCode=" + this.f234534b + ", complianceData=" + this.f234535c + ", eventUptimeMs=" + this.f234536d + ", sourceExtension=" + Arrays.toString(this.f234537e) + ", sourceExtensionJsonProto3=" + this.f234538f + ", timezoneOffsetSeconds=" + this.f234539g + ", networkConnectionInfo=" + this.f234540h + "}";
    }

    private i(long j15, Integer num, o oVar, long j16, byte[] bArr, String str, long j17, u uVar) {
        this.f234533a = j15;
        this.f234534b = num;
        this.f234535c = oVar;
        this.f234536d = j16;
        this.f234537e = bArr;
        this.f234538f = str;
        this.f234539g = j17;
        this.f234540h = uVar;
    }
}
