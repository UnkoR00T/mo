package h0;

/* JADX INFO: loaded from: classes.dex */
final class a extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i0.f f79130a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i0.f f79131b;

    a(i0.f fVar, i0.f fVar2) {
        if (fVar == null) {
            throw new NullPointerException("Null primaryOutConfig");
        }
        this.f79130a = fVar;
        if (fVar2 == null) {
            throw new NullPointerException("Null secondaryOutConfig");
        }
        this.f79131b = fVar2;
    }

    @Override // h0.d
    public i0.f a() {
        return this.f79130a;
    }

    @Override // h0.d
    public i0.f b() {
        return this.f79131b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (this.f79130a.equals(dVar.a()) && this.f79131b.equals(dVar.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f79130a.hashCode() ^ 1000003) * 1000003) ^ this.f79131b.hashCode();
    }

    public String toString() {
        return "DualOutConfig{primaryOutConfig=" + this.f79130a + ", secondaryOutConfig=" + this.f79131b + "}";
    }
}
