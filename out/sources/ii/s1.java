package ii;

/* JADX INFO: loaded from: classes4.dex */
abstract class s1 extends a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f92758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f92759b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f92760c;

    s1(int i15, int i16, int i17) {
        this.f92758a = i15;
        this.f92759b = i16;
        this.f92760c = i17;
    }

    @Override // ii.a0
    public final int e() {
        return this.f92760c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a0) {
            a0 a0Var = (a0) obj;
            if (this.f92758a == a0Var.j() && this.f92759b == a0Var.g() && this.f92760c == a0Var.e()) {
                return true;
            }
        }
        return false;
    }

    @Override // ii.a0
    public final int g() {
        return this.f92759b;
    }

    public final int hashCode() {
        return ((((this.f92758a ^ 1000003) * 1000003) ^ this.f92759b) * 1000003) ^ this.f92760c;
    }

    @Override // ii.a0
    public final int j() {
        return this.f92758a;
    }
}
