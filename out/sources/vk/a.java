package vk;

/* JADX INFO: loaded from: classes4.dex */
final class a extends l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f207129a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f207130b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f207131c;

    a(long j15, long j16, long j17) {
        this.f207129a = j15;
        this.f207130b = j16;
        this.f207131c = j17;
    }

    @Override // vk.l
    public long b() {
        return this.f207130b;
    }

    @Override // vk.l
    public long c() {
        return this.f207129a;
    }

    @Override // vk.l
    public long d() {
        return this.f207131c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof l) {
            l lVar = (l) obj;
            if (this.f207129a == lVar.c() && this.f207130b == lVar.b() && this.f207131c == lVar.d()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j15 = this.f207129a;
        long j16 = this.f207130b;
        int i15 = (((((int) (j15 ^ (j15 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j16 ^ (j16 >>> 32)))) * 1000003;
        long j17 = this.f207131c;
        return i15 ^ ((int) ((j17 >>> 32) ^ j17));
    }

    public String toString() {
        return "StartupTime{epochMillis=" + this.f207129a + ", elapsedRealtime=" + this.f207130b + ", uptimeMillis=" + this.f207131c + "}";
    }
}
