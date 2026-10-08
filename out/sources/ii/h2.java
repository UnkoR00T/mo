package ii;

/* JADX INFO: loaded from: classes4.dex */
abstract class h2 extends j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final y0 f92464a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final y0 f92465b;

    h2(y0 y0Var, y0 y0Var2) {
        this.f92464a = y0Var;
        this.f92465b = y0Var2;
    }

    @Override // ii.j0
    public final y0 b() {
        return this.f92465b;
    }

    @Override // ii.j0
    public final y0 c() {
        return this.f92464a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j0) {
            j0 j0Var = (j0) obj;
            y0 y0Var = this.f92464a;
            if (y0Var != null ? y0Var.equals(j0Var.c()) : j0Var.c() == null) {
                y0 y0Var2 = this.f92465b;
                if (y0Var2 != null ? y0Var2.equals(j0Var.b()) : j0Var.b() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        y0 y0Var = this.f92464a;
        int iHashCode = y0Var == null ? 0 : y0Var.hashCode();
        y0 y0Var2 = this.f92465b;
        return ((iHashCode ^ 1000003) * 1000003) ^ (y0Var2 != null ? y0Var2.hashCode() : 0);
    }

    public final String toString() {
        y0 y0Var = this.f92465b;
        String strValueOf = String.valueOf(this.f92464a);
        String strValueOf2 = String.valueOf(y0Var);
        StringBuilder sb5 = new StringBuilder(strValueOf.length() + 20 + strValueOf2.length() + 1);
        sb5.append("Period{open=");
        sb5.append(strValueOf);
        sb5.append(", close=");
        sb5.append(strValueOf2);
        sb5.append("}");
        return sb5.toString();
    }
}
