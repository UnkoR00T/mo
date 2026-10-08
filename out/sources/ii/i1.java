package ii;

import java.time.Instant;

/* JADX INFO: loaded from: classes4.dex */
final class i1 extends v.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private v.b f92471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private e0 f92472b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Instant f92473c;

    i1() {
    }

    @Override // ii.v.a
    public final v a() {
        e0 e0Var;
        Instant instant;
        v.b bVar = this.f92471a;
        if (bVar != null && (e0Var = this.f92472b) != null && (instant = this.f92473c) != null) {
            return new u4(bVar, e0Var, instant);
        }
        StringBuilder sb5 = new StringBuilder();
        if (this.f92471a == null) {
            sb5.append(" type");
        }
        if (this.f92472b == null) {
            sb5.append(" price");
        }
        if (this.f92473c == null) {
            sb5.append(" updateTime");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb5.toString()));
    }

    @Override // ii.v.a
    public final v.a b(e0 e0Var) {
        if (e0Var == null) {
            throw new NullPointerException("Null price");
        }
        this.f92472b = e0Var;
        return this;
    }

    @Override // ii.v.a
    public final v.a c(Instant instant) {
        if (instant == null) {
            throw new NullPointerException("Null updateTime");
        }
        this.f92473c = instant;
        return this;
    }

    public final v.a d(v.b bVar) {
        if (bVar == null) {
            throw new NullPointerException("Null type");
        }
        this.f92471a = bVar;
        return this;
    }
}
