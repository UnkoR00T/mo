package jf;

/* JADX INFO: loaded from: classes3.dex */
final class a extends e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f102305b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f102306c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f102307d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f102308e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f102309f;

    static final class b extends e.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Long f102310a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Integer f102311b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Integer f102312c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Long f102313d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Integer f102314e;

        b() {
        }

        @Override // jf.e.a
        e a() {
            String str = "";
            if (this.f102310a == null) {
                str = " maxStorageSizeInBytes";
            }
            if (this.f102311b == null) {
                str = str + " loadBatchSize";
            }
            if (this.f102312c == null) {
                str = str + " criticalSectionEnterTimeoutMs";
            }
            if (this.f102313d == null) {
                str = str + " eventCleanUpAge";
            }
            if (this.f102314e == null) {
                str = str + " maxBlobByteSizePerRow";
            }
            if (str.isEmpty()) {
                return new a(this.f102310a.longValue(), this.f102311b.intValue(), this.f102312c.intValue(), this.f102313d.longValue(), this.f102314e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // jf.e.a
        e.a b(int i15) {
            this.f102312c = Integer.valueOf(i15);
            return this;
        }

        @Override // jf.e.a
        e.a c(long j15) {
            this.f102313d = Long.valueOf(j15);
            return this;
        }

        @Override // jf.e.a
        e.a d(int i15) {
            this.f102311b = Integer.valueOf(i15);
            return this;
        }

        @Override // jf.e.a
        e.a e(int i15) {
            this.f102314e = Integer.valueOf(i15);
            return this;
        }

        @Override // jf.e.a
        e.a f(long j15) {
            this.f102310a = Long.valueOf(j15);
            return this;
        }
    }

    @Override // jf.e
    int b() {
        return this.f102307d;
    }

    @Override // jf.e
    long c() {
        return this.f102308e;
    }

    @Override // jf.e
    int d() {
        return this.f102306c;
    }

    @Override // jf.e
    int e() {
        return this.f102309f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (this.f102305b == eVar.f() && this.f102306c == eVar.d() && this.f102307d == eVar.b() && this.f102308e == eVar.c() && this.f102309f == eVar.e()) {
                return true;
            }
        }
        return false;
    }

    @Override // jf.e
    long f() {
        return this.f102305b;
    }

    public int hashCode() {
        long j15 = this.f102305b;
        int i15 = (((((((int) (j15 ^ (j15 >>> 32))) ^ 1000003) * 1000003) ^ this.f102306c) * 1000003) ^ this.f102307d) * 1000003;
        long j16 = this.f102308e;
        return ((i15 ^ ((int) ((j16 >>> 32) ^ j16))) * 1000003) ^ this.f102309f;
    }

    public String toString() {
        return "EventStoreConfig{maxStorageSizeInBytes=" + this.f102305b + ", loadBatchSize=" + this.f102306c + ", criticalSectionEnterTimeoutMs=" + this.f102307d + ", eventCleanUpAge=" + this.f102308e + ", maxBlobByteSizePerRow=" + this.f102309f + "}";
    }

    private a(long j15, int i15, int i16, long j16, int i17) {
        this.f102305b = j15;
        this.f102306c = i15;
        this.f102307d = i16;
        this.f102308e = j16;
        this.f102309f = i17;
    }
}
