package tp;

/* JADX INFO: loaded from: classes4.dex */
public class n implements hp.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final bp.d f191380a;

    public n(bp.d dVar) {
        this.f191380a = dVar;
    }

    private op.a d(bp.i iVar) {
        op.b bVar;
        bp.b bVarC4 = D1().C4(iVar);
        if (!(bVarC4 instanceof bp.a)) {
            return null;
        }
        bp.a aVar = (bp.a) bVarC4;
        int size = aVar.size();
        if (size == 1) {
            bVar = op.d.f148060c;
        } else {
            if (size != 3) {
                return null;
            }
            bVar = op.e.f148062c;
        }
        return new op.a(aVar, bVar);
    }

    public op.a a() {
        return d(bp.i.B0);
    }

    public op.a b() {
        return d(bp.i.f20930y0);
    }

    @Override // hp.c
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public bp.d D1() {
        return this.f191380a;
    }

    public int e() {
        return D1().y4(bp.i.f20800l7, 0);
    }
}
