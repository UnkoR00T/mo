package so;

/* JADX INFO: loaded from: classes4.dex */
public class e extends l0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private d[] f182615g;

    e(n0 n0Var) {
        super(n0Var);
    }

    @Override // so.l0
    void e(n0 n0Var, i0 i0Var) {
        i0Var.N();
        int iN = i0Var.N();
        this.f182615g = new d[iN];
        for (int i15 = 0; i15 < iN; i15++) {
            d dVar = new d();
            dVar.g(i0Var);
            this.f182615g[i15] = dVar;
        }
        int iZ = n0Var.Z();
        for (int i16 = 0; i16 < iN; i16++) {
            this.f182615g[i16].h(this, iZ, i0Var);
        }
        this.f182681e = true;
    }

    public d[] j() {
        return this.f182615g;
    }

    public d k(int i15, int i16) {
        for (d dVar : this.f182615g) {
            if (dVar.f() == i15 && dVar.e() == i16) {
                return dVar;
            }
        }
        return null;
    }
}
