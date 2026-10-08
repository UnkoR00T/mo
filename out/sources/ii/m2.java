package ii;

/* JADX INFO: loaded from: classes4.dex */
abstract class m2 extends m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l0 f92653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final double f92654b;

    m2(l0 l0Var, double d15) {
        if (l0Var == null) {
            throw new NullPointerException("Null place");
        }
        this.f92653a = l0Var;
        this.f92654b = d15;
    }

    @Override // ii.m0
    public final double a() {
        return this.f92654b;
    }

    @Override // ii.m0
    public final l0 b() {
        return this.f92653a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof m0) {
            m0 m0Var = (m0) obj;
            if (this.f92653a.equals(m0Var.b()) && Double.doubleToLongBits(this.f92654b) == Double.doubleToLongBits(m0Var.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f92653a.hashCode() ^ 1000003;
        double d15 = this.f92654b;
        return (iHashCode * 1000003) ^ ((int) (Double.doubleToLongBits(d15) ^ (Double.doubleToLongBits(d15) >>> 32)));
    }

    public final String toString() {
        String string = this.f92653a.toString();
        int length = string.length();
        double d15 = this.f92654b;
        StringBuilder sb5 = new StringBuilder(length + 35 + String.valueOf(d15).length() + 1);
        sb5.append("PlaceLikelihood{place=");
        sb5.append(string);
        sb5.append(", likelihood=");
        sb5.append(d15);
        sb5.append("}");
        return sb5.toString();
    }
}
