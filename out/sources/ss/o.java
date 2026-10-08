package ss;

/* JADX INFO: loaded from: classes4.dex */
public final class o implements ot.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v f183916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final n f183917b;

    public o(v vVar, n nVar) {
        this.f183916a = vVar;
        this.f183917b = nVar;
    }

    @Override // ot.j
    public ot.i a(zs.b bVar) {
        x xVarB = w.b(this.f183916a, bVar, this.f183917b.f().g().d());
        if (xVarB == null) {
            return null;
        }
        fr.t.c(xVarB.i(), bVar);
        return this.f183917b.l(xVarB);
    }
}
