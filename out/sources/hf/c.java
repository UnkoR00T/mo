package hf;

import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
final class c extends f.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f84071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f84072b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set<f.c> f84073c;

    static final class b extends f.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Long f84074a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Long f84075b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Set<f.c> f84076c;

        b() {
        }

        @Override // hf.f.b.a
        public f.b a() {
            String str = "";
            if (this.f84074a == null) {
                str = " delta";
            }
            if (this.f84075b == null) {
                str = str + " maxAllowedDelay";
            }
            if (this.f84076c == null) {
                str = str + " flags";
            }
            if (str.isEmpty()) {
                return new c(this.f84074a.longValue(), this.f84075b.longValue(), this.f84076c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // hf.f.b.a
        public f.b.a b(long j15) {
            this.f84074a = Long.valueOf(j15);
            return this;
        }

        @Override // hf.f.b.a
        public f.b.a c(Set<f.c> set) {
            if (set == null) {
                throw new NullPointerException("Null flags");
            }
            this.f84076c = set;
            return this;
        }

        @Override // hf.f.b.a
        public f.b.a d(long j15) {
            this.f84075b = Long.valueOf(j15);
            return this;
        }
    }

    @Override // hf.f.b
    long b() {
        return this.f84071a;
    }

    @Override // hf.f.b
    Set<f.c> c() {
        return this.f84073c;
    }

    @Override // hf.f.b
    long d() {
        return this.f84072b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f.b) {
            f.b bVar = (f.b) obj;
            if (this.f84071a == bVar.b() && this.f84072b == bVar.d() && this.f84073c.equals(bVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j15 = this.f84071a;
        int i15 = (((int) (j15 ^ (j15 >>> 32))) ^ 1000003) * 1000003;
        long j16 = this.f84072b;
        return ((i15 ^ ((int) ((j16 >>> 32) ^ j16))) * 1000003) ^ this.f84073c.hashCode();
    }

    public String toString() {
        return "ConfigValue{delta=" + this.f84071a + ", maxAllowedDelay=" + this.f84072b + ", flags=" + this.f84073c + "}";
    }

    private c(long j15, long j16, Set<f.c> set) {
        this.f84071a = j15;
        this.f84072b = j16;
        this.f84073c = set;
    }
}
