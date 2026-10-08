package com.google.firebase.installations;

/* JADX INFO: loaded from: classes4.dex */
final class a extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f36397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f36398b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f36399c;

    static final class b extends g.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f36400a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f36401b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f36402c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private byte f36403d;

        b() {
        }

        @Override // com.google.firebase.installations.g.a
        public g a() {
            String str;
            if (this.f36403d == 3 && (str = this.f36400a) != null) {
                return new a(str, this.f36401b, this.f36402c);
            }
            StringBuilder sb5 = new StringBuilder();
            if (this.f36400a == null) {
                sb5.append(" token");
            }
            if ((this.f36403d & 1) == 0) {
                sb5.append(" tokenExpirationTimestamp");
            }
            if ((this.f36403d & 2) == 0) {
                sb5.append(" tokenCreationTimestamp");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb5));
        }

        @Override // com.google.firebase.installations.g.a
        public g.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null token");
            }
            this.f36400a = str;
            return this;
        }

        @Override // com.google.firebase.installations.g.a
        public g.a c(long j15) {
            this.f36402c = j15;
            this.f36403d = (byte) (this.f36403d | 2);
            return this;
        }

        @Override // com.google.firebase.installations.g.a
        public g.a d(long j15) {
            this.f36401b = j15;
            this.f36403d = (byte) (this.f36403d | 1);
            return this;
        }
    }

    @Override // com.google.firebase.installations.g
    public String b() {
        return this.f36397a;
    }

    @Override // com.google.firebase.installations.g
    public long c() {
        return this.f36399c;
    }

    @Override // com.google.firebase.installations.g
    public long d() {
        return this.f36398b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (this.f36397a.equals(gVar.b()) && this.f36398b == gVar.d() && this.f36399c == gVar.c()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (this.f36397a.hashCode() ^ 1000003) * 1000003;
        long j15 = this.f36398b;
        long j16 = this.f36399c;
        return ((iHashCode ^ ((int) (j15 ^ (j15 >>> 32)))) * 1000003) ^ ((int) (j16 ^ (j16 >>> 32)));
    }

    public String toString() {
        return "InstallationTokenResult{token=" + this.f36397a + ", tokenExpirationTimestamp=" + this.f36398b + ", tokenCreationTimestamp=" + this.f36399c + "}";
    }

    private a(String str, long j15, long j16) {
        this.f36397a = str;
        this.f36398b = j15;
        this.f36399c = j16;
    }
}
