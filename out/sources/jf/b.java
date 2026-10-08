package jf;

/* JADX INFO: loaded from: classes3.dex */
final class b extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f102318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final af.o f102319b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final af.i f102320c;

    b(long j15, af.o oVar, af.i iVar) {
        this.f102318a = j15;
        if (oVar == null) {
            throw new NullPointerException("Null transportContext");
        }
        this.f102319b = oVar;
        if (iVar == null) {
            throw new NullPointerException("Null event");
        }
        this.f102320c = iVar;
    }

    @Override // jf.k
    public af.i b() {
        return this.f102320c;
    }

    @Override // jf.k
    public long c() {
        return this.f102318a;
    }

    @Override // jf.k
    public af.o d() {
        return this.f102319b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof k) {
            k kVar = (k) obj;
            if (this.f102318a == kVar.c() && this.f102319b.equals(kVar.d()) && this.f102320c.equals(kVar.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j15 = this.f102318a;
        return ((((((int) (j15 ^ (j15 >>> 32))) ^ 1000003) * 1000003) ^ this.f102319b.hashCode()) * 1000003) ^ this.f102320c.hashCode();
    }

    public String toString() {
        return "PersistedEvent{id=" + this.f102318a + ", transportContext=" + this.f102319b + ", event=" + this.f102320c + "}";
    }
}
