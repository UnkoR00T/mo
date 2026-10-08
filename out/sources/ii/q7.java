package ii;

import java.time.Instant;

/* JADX INFO: loaded from: classes4.dex */
final class q7 extends k.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private r f92728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Double f92729b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Integer f92730c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Integer f92731d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Integer f92732e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Instant f92733f;

    q7() {
    }

    @Override // ii.k.a
    public final k a() {
        Double d15;
        Integer num;
        r rVar = this.f92728a;
        if (rVar != null && (d15 = this.f92729b) != null && (num = this.f92730c) != null) {
            return new d4(rVar, d15, num, this.f92731d, this.f92732e, this.f92733f);
        }
        StringBuilder sb5 = new StringBuilder();
        if (this.f92728a == null) {
            sb5.append(" type");
        }
        if (this.f92729b == null) {
            sb5.append(" maxChargeRateKw");
        }
        if (this.f92730c == null) {
            sb5.append(" count");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb5.toString()));
    }

    @Override // ii.k.a
    public final k.a b(Instant instant) {
        this.f92733f = instant;
        return this;
    }

    @Override // ii.k.a
    public final k.a c(Integer num) {
        this.f92731d = num;
        return this;
    }

    @Override // ii.k.a
    public final k.a d(Integer num) {
        if (num == null) {
            throw new NullPointerException("Null count");
        }
        this.f92730c = num;
        return this;
    }

    @Override // ii.k.a
    public final k.a e(Double d15) {
        if (d15 == null) {
            throw new NullPointerException("Null maxChargeRateKw");
        }
        this.f92729b = d15;
        return this;
    }

    @Override // ii.k.a
    public final k.a f(Integer num) {
        this.f92732e = num;
        return this;
    }

    public final k.a g(r rVar) {
        if (rVar == null) {
            throw new NullPointerException("Null type");
        }
        this.f92728a = rVar;
        return this;
    }
}
