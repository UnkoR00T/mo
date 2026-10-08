package ze;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class j extends s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f234549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f234550b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final n f234551c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Integer f234552d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f234553e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List<r> f234554f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final v f234555g;

    static final class b extends s.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Long f234556a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Long f234557b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private n f234558c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Integer f234559d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f234560e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private List<r> f234561f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private v f234562g;

        b() {
        }

        @Override // ze.s.a
        public s a() {
            String str = "";
            if (this.f234556a == null) {
                str = " requestTimeMs";
            }
            if (this.f234557b == null) {
                str = str + " requestUptimeMs";
            }
            if (str.isEmpty()) {
                return new j(this.f234556a.longValue(), this.f234557b.longValue(), this.f234558c, this.f234559d, this.f234560e, this.f234561f, this.f234562g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // ze.s.a
        public s.a b(n nVar) {
            this.f234558c = nVar;
            return this;
        }

        @Override // ze.s.a
        public s.a c(List<r> list) {
            this.f234561f = list;
            return this;
        }

        @Override // ze.s.a
        s.a d(Integer num) {
            this.f234559d = num;
            return this;
        }

        @Override // ze.s.a
        s.a e(String str) {
            this.f234560e = str;
            return this;
        }

        @Override // ze.s.a
        public s.a f(v vVar) {
            this.f234562g = vVar;
            return this;
        }

        @Override // ze.s.a
        public s.a g(long j15) {
            this.f234556a = Long.valueOf(j15);
            return this;
        }

        @Override // ze.s.a
        public s.a h(long j15) {
            this.f234557b = Long.valueOf(j15);
            return this;
        }
    }

    @Override // ze.s
    public n b() {
        return this.f234551c;
    }

    @Override // ze.s
    public List<r> c() {
        return this.f234554f;
    }

    @Override // ze.s
    public Integer d() {
        return this.f234552d;
    }

    @Override // ze.s
    public String e() {
        return this.f234553e;
    }

    public boolean equals(Object obj) {
        n nVar;
        Integer num;
        String str;
        List<r> list;
        v vVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof s) {
            s sVar = (s) obj;
            if (this.f234549a == sVar.g() && this.f234550b == sVar.h() && ((nVar = this.f234551c) != null ? nVar.equals(sVar.b()) : sVar.b() == null) && ((num = this.f234552d) != null ? num.equals(sVar.d()) : sVar.d() == null) && ((str = this.f234553e) != null ? str.equals(sVar.e()) : sVar.e() == null) && ((list = this.f234554f) != null ? list.equals(sVar.c()) : sVar.c() == null) && ((vVar = this.f234555g) != null ? vVar.equals(sVar.f()) : sVar.f() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // ze.s
    public v f() {
        return this.f234555g;
    }

    @Override // ze.s
    public long g() {
        return this.f234549a;
    }

    @Override // ze.s
    public long h() {
        return this.f234550b;
    }

    public int hashCode() {
        long j15 = this.f234549a;
        long j16 = this.f234550b;
        int i15 = (((((int) (j15 ^ (j15 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j16 >>> 32) ^ j16))) * 1000003;
        n nVar = this.f234551c;
        int iHashCode = (i15 ^ (nVar == null ? 0 : nVar.hashCode())) * 1000003;
        Integer num = this.f234552d;
        int iHashCode2 = (iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.f234553e;
        int iHashCode3 = (iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List<r> list = this.f234554f;
        int iHashCode4 = (iHashCode3 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        v vVar = this.f234555g;
        return iHashCode4 ^ (vVar != null ? vVar.hashCode() : 0);
    }

    public String toString() {
        return "LogRequest{requestTimeMs=" + this.f234549a + ", requestUptimeMs=" + this.f234550b + ", clientInfo=" + this.f234551c + ", logSource=" + this.f234552d + ", logSourceName=" + this.f234553e + ", logEvents=" + this.f234554f + ", qosTier=" + this.f234555g + "}";
    }

    private j(long j15, long j16, n nVar, Integer num, String str, List<r> list, v vVar) {
        this.f234549a = j15;
        this.f234550b = j16;
        this.f234551c = nVar;
        this.f234552d = num;
        this.f234553e = str;
        this.f234554f = list;
        this.f234555g = vVar;
    }
}
