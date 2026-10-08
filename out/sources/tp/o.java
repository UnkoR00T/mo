package tp;

/* JADX INFO: loaded from: classes4.dex */
public class o implements hp.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final bp.d f191381a;

    public o() {
        bp.d dVar = new bp.d();
        this.f191381a = dVar;
        dVar.Y4(bp.i.L5, new bp.d());
    }

    @Override // hp.c
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public bp.d D1() {
        return this.f191381a;
    }

    public p b() {
        bp.b bVarP4 = this.f191381a.p4(bp.i.L5);
        if (bVarP4 instanceof bp.d) {
            return new p(bVarP4);
        }
        return null;
    }

    public void c(q qVar) {
        this.f191381a.Z4(bp.i.L5, qVar);
    }

    public o(bp.d dVar) {
        this.f191381a = dVar;
    }
}
