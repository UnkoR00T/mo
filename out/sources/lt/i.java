package lt;

/* JADX INFO: loaded from: classes4.dex */
public final class i extends a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final rt.i<k> f120127b;

    /* JADX WARN: Multi-variable type inference failed */
    public i(er.a<? extends k> aVar) {
        this(null, aVar, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final k k(er.a aVar) {
        k kVar = (k) aVar.a();
        return kVar instanceof a ? ((a) kVar).h() : kVar;
    }

    @Override // lt.a
    protected k i() {
        return this.f120127b.a();
    }

    public i(rt.n nVar, er.a<? extends k> aVar) {
        this.f120127b = nVar.d(new h(aVar));
    }

    public /* synthetic */ i(rt.n nVar, er.a aVar, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? rt.f.f175955e : nVar, aVar);
    }
}
