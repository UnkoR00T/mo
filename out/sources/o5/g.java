package o5;

/* JADX INFO: loaded from: classes.dex */
class g extends f {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f142410m;

    g(p pVar) {
        super(pVar);
        if (pVar instanceof l) {
            this.f142393e = f.a.HORIZONTAL_DIMENSION;
        } else {
            this.f142393e = f.a.VERTICAL_DIMENSION;
        }
    }

    @Override // o5.f
    public void d(int i15) {
        if (this.f142398j) {
            return;
        }
        this.f142398j = true;
        this.f142395g = i15;
        for (d dVar : this.f142399k) {
            dVar.a(dVar);
        }
    }
}
