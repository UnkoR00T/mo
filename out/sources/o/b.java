package o;

/* JADX INFO: loaded from: classes.dex */
final class b extends t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final t.b f139887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final t.a f139888b;

    b(t.b bVar, t.a aVar) {
        if (bVar == null) {
            throw new NullPointerException("Null type");
        }
        this.f139887a = bVar;
        this.f139888b = aVar;
    }

    @Override // o.t
    public t.a b() {
        return this.f139888b;
    }

    @Override // o.t
    public t.b c() {
        return this.f139887a;
    }

    public boolean equals(Object obj) {
        t.a aVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof t) {
            t tVar = (t) obj;
            if (this.f139887a.equals(tVar.c()) && ((aVar = this.f139888b) != null ? aVar.equals(tVar.b()) : tVar.b() == null)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (this.f139887a.hashCode() ^ 1000003) * 1000003;
        t.a aVar = this.f139888b;
        return iHashCode ^ (aVar == null ? 0 : aVar.hashCode());
    }

    public String toString() {
        return "CameraState{type=" + this.f139887a + ", error=" + this.f139888b + "}";
    }
}
