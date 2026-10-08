package ii;

/* JADX INFO: loaded from: classes4.dex */
final class c2 extends h0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private l0.a f92382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private l0.a f92383b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private l0.a f92384c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private l0.a f92385d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private l0.a f92386e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private l0.a f92387f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private l0.a f92388g;

    c2() {
    }

    @Override // ii.h0.a
    public final h0 a() {
        l0.a aVar;
        l0.a aVar2;
        l0.a aVar3;
        l0.a aVar4;
        l0.a aVar5;
        l0.a aVar6;
        l0.a aVar7 = this.f92382a;
        if (aVar7 != null && (aVar = this.f92383b) != null && (aVar2 = this.f92384c) != null && (aVar3 = this.f92385d) != null && (aVar4 = this.f92386e) != null && (aVar5 = this.f92387f) != null && (aVar6 = this.f92388g) != null) {
            return new p5(aVar7, aVar, aVar2, aVar3, aVar4, aVar5, aVar6);
        }
        StringBuilder sb5 = new StringBuilder();
        if (this.f92382a == null) {
            sb5.append(" freeParkingLot");
        }
        if (this.f92383b == null) {
            sb5.append(" paidParkingLot");
        }
        if (this.f92384c == null) {
            sb5.append(" freeStreetParking");
        }
        if (this.f92385d == null) {
            sb5.append(" paidStreetParking");
        }
        if (this.f92386e == null) {
            sb5.append(" valetParking");
        }
        if (this.f92387f == null) {
            sb5.append(" freeGarageParking");
        }
        if (this.f92388g == null) {
            sb5.append(" paidGarageParking");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb5.toString()));
    }

    @Override // ii.h0.a
    public final h0.a b(l0.a aVar) {
        if (aVar == null) {
            throw new NullPointerException("Null freeGarageParking");
        }
        this.f92387f = aVar;
        return this;
    }

    @Override // ii.h0.a
    public final h0.a c(l0.a aVar) {
        if (aVar == null) {
            throw new NullPointerException("Null freeParkingLot");
        }
        this.f92382a = aVar;
        return this;
    }

    @Override // ii.h0.a
    public final h0.a d(l0.a aVar) {
        if (aVar == null) {
            throw new NullPointerException("Null freeStreetParking");
        }
        this.f92384c = aVar;
        return this;
    }

    @Override // ii.h0.a
    public final h0.a e(l0.a aVar) {
        if (aVar == null) {
            throw new NullPointerException("Null paidGarageParking");
        }
        this.f92388g = aVar;
        return this;
    }

    @Override // ii.h0.a
    public final h0.a f(l0.a aVar) {
        if (aVar == null) {
            throw new NullPointerException("Null paidParkingLot");
        }
        this.f92383b = aVar;
        return this;
    }

    @Override // ii.h0.a
    public final h0.a g(l0.a aVar) {
        if (aVar == null) {
            throw new NullPointerException("Null paidStreetParking");
        }
        this.f92385d = aVar;
        return this;
    }

    @Override // ii.h0.a
    public final h0.a h(l0.a aVar) {
        if (aVar == null) {
            throw new NullPointerException("Null valetParking");
        }
        this.f92386e = aVar;
        return this;
    }
}
