package tp;

/* JADX INFO: loaded from: classes4.dex */
public class r implements hp.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final bp.d f191383a;

    public r(bp.d dVar) {
        this.f191383a = dVar;
    }

    @Override // hp.c
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public bp.d D1() {
        return this.f191383a;
    }

    public float b() {
        bp.d dVarD1 = D1();
        bp.i iVar = bp.i.D9;
        if (dVarD1.p4(iVar) instanceof bp.i) {
            return 0.0f;
        }
        return D1().u4(iVar, 1.0f);
    }
}
