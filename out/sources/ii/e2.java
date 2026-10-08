package ii;

/* JADX INFO: loaded from: classes4.dex */
final class e2 extends i0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private l0.a f92417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private l0.a f92418b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private l0.a f92419c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private l0.a f92420d;

    e2() {
    }

    @Override // ii.i0.a
    public final i0 a() {
        l0.a aVar;
        l0.a aVar2;
        l0.a aVar3;
        l0.a aVar4 = this.f92417a;
        if (aVar4 != null && (aVar = this.f92418b) != null && (aVar2 = this.f92419c) != null && (aVar3 = this.f92420d) != null) {
            return new r5(aVar4, aVar, aVar2, aVar3);
        }
        StringBuilder sb5 = new StringBuilder();
        if (this.f92417a == null) {
            sb5.append(" acceptsCreditCards");
        }
        if (this.f92418b == null) {
            sb5.append(" acceptsDebitCards");
        }
        if (this.f92419c == null) {
            sb5.append(" acceptsCashOnly");
        }
        if (this.f92420d == null) {
            sb5.append(" acceptsNfc");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb5.toString()));
    }

    @Override // ii.i0.a
    public final i0.a b(l0.a aVar) {
        if (aVar == null) {
            throw new NullPointerException("Null acceptsCashOnly");
        }
        this.f92419c = aVar;
        return this;
    }

    @Override // ii.i0.a
    public final i0.a c(l0.a aVar) {
        if (aVar == null) {
            throw new NullPointerException("Null acceptsCreditCards");
        }
        this.f92417a = aVar;
        return this;
    }

    @Override // ii.i0.a
    public final i0.a d(l0.a aVar) {
        if (aVar == null) {
            throw new NullPointerException("Null acceptsDebitCards");
        }
        this.f92418b = aVar;
        return this;
    }

    @Override // ii.i0.a
    public final i0.a e(l0.a aVar) {
        if (aVar == null) {
            throw new NullPointerException("Null acceptsNfc");
        }
        this.f92420d = aVar;
        return this;
    }
}
