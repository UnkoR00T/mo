package ii;

/* JADX INFO: loaded from: classes4.dex */
abstract class s2 extends p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e0 f92761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e0 f92762b;

    s2(e0 e0Var, e0 e0Var2) {
        this.f92761a = e0Var;
        this.f92762b = e0Var2;
    }

    @Override // ii.p0
    public final e0 b() {
        return this.f92762b;
    }

    @Override // ii.p0
    public final e0 c() {
        return this.f92761a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p0) {
            p0 p0Var = (p0) obj;
            e0 e0Var = this.f92761a;
            if (e0Var != null ? e0Var.equals(p0Var.c()) : p0Var.c() == null) {
                e0 e0Var2 = this.f92762b;
                if (e0Var2 != null ? e0Var2.equals(p0Var.b()) : p0Var.b() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        e0 e0Var = this.f92761a;
        int iHashCode = e0Var == null ? 0 : e0Var.hashCode();
        e0 e0Var2 = this.f92762b;
        return ((iHashCode ^ 1000003) * 1000003) ^ (e0Var2 != null ? e0Var2.hashCode() : 0);
    }

    public final String toString() {
        e0 e0Var = this.f92762b;
        String strValueOf = String.valueOf(this.f92761a);
        String strValueOf2 = String.valueOf(e0Var);
        StringBuilder sb5 = new StringBuilder(strValueOf.length() + 33 + strValueOf2.length() + 1);
        sb5.append("PriceRange{startPrice=");
        sb5.append(strValueOf);
        sb5.append(", endPrice=");
        sb5.append(strValueOf2);
        sb5.append("}");
        return sb5.toString();
    }
}
