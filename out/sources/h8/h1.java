package h8;

/* JADX INFO: loaded from: classes3.dex */
public final class h1 extends v {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final t7.s f81606f;

    private h1(t7.e0 e0Var, t7.s sVar) {
        super(e0Var);
        this.f81606f = sVar;
    }

    public static h1 s(t7.e0 e0Var, t7.s sVar) {
        return e0Var instanceof h1 ? new h1(((h1) e0Var).f81800e, sVar) : new h1(e0Var, sVar);
    }

    @Override // h8.v, t7.e0
    public t7.e0.c o(int i15, t7.e0.c cVar, long j15) {
        super.o(i15, cVar, j15);
        t7.s sVar = this.f81606f;
        cVar.f188155c = sVar;
        t7.s.h hVar = sVar.f188433b;
        cVar.f188154b = hVar != null ? hVar.f188535h : null;
        return cVar;
    }
}
