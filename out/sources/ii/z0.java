package ii;

/* JADX INFO: loaded from: classes4.dex */
final class z0 extends a.AbstractC2187a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private l0.a f92871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private l0.a f92872b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private l0.a f92873c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private l0.a f92874d;

    z0() {
    }

    @Override // ii.a.AbstractC2187a
    public final a a() {
        l0.a aVar;
        l0.a aVar2;
        l0.a aVar3;
        l0.a aVar4 = this.f92871a;
        if (aVar4 != null && (aVar = this.f92872b) != null && (aVar2 = this.f92873c) != null && (aVar3 = this.f92874d) != null) {
            return new i3(aVar4, aVar, aVar2, aVar3);
        }
        StringBuilder sb5 = new StringBuilder();
        if (this.f92871a == null) {
            sb5.append(" wheelchairAccessibleParking");
        }
        if (this.f92872b == null) {
            sb5.append(" wheelchairAccessibleEntrance");
        }
        if (this.f92873c == null) {
            sb5.append(" wheelchairAccessibleRestroom");
        }
        if (this.f92874d == null) {
            sb5.append(" wheelchairAccessibleSeating");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb5.toString()));
    }

    @Override // ii.a.AbstractC2187a
    public final a.AbstractC2187a b(l0.a aVar) {
        if (aVar == null) {
            throw new NullPointerException("Null wheelchairAccessibleEntrance");
        }
        this.f92872b = aVar;
        return this;
    }

    @Override // ii.a.AbstractC2187a
    public final a.AbstractC2187a c(l0.a aVar) {
        if (aVar == null) {
            throw new NullPointerException("Null wheelchairAccessibleParking");
        }
        this.f92871a = aVar;
        return this;
    }

    @Override // ii.a.AbstractC2187a
    public final a.AbstractC2187a d(l0.a aVar) {
        if (aVar == null) {
            throw new NullPointerException("Null wheelchairAccessibleRestroom");
        }
        this.f92873c = aVar;
        return this;
    }

    @Override // ii.a.AbstractC2187a
    public final a.AbstractC2187a e(l0.a aVar) {
        if (aVar == null) {
            throw new NullPointerException("Null wheelchairAccessibleSeating");
        }
        this.f92874d = aVar;
        return this;
    }
}
