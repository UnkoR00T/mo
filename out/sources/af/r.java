package af;

/* JADX INFO: loaded from: classes3.dex */
final class r<T> implements ye.h<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o f6146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f6147b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ye.c f6148c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ye.g<T, byte[]> f6149d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final s f6150e;

    r(o oVar, String str, ye.c cVar, ye.g<T, byte[]> gVar, s sVar) {
        this.f6146a = oVar;
        this.f6147b = str;
        this.f6148c = cVar;
        this.f6149d = gVar;
        this.f6150e = sVar;
    }

    public static /* synthetic */ void b(Exception exc) {
    }

    @Override // ye.h
    public void a(ye.d<T> dVar) {
        c(dVar, new ye.j() { // from class: af.q
            @Override // ye.j
            public final void a(Exception exc) {
                r.b(exc);
            }
        });
    }

    public void c(ye.d<T> dVar, ye.j jVar) {
        this.f6150e.a(n.a().e(this.f6146a).c(dVar).f(this.f6147b).d(this.f6149d).b(this.f6148c).a(), jVar);
    }
}
