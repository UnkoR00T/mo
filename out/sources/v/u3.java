package v;

/* JADX INFO: loaded from: classes.dex */
public final class u3 implements o.o1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f202874d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final o.o1 f202875e;

    public u3(long j15, o.o1 o1Var) {
        i6.i.b(j15 >= 0, "Timeout must be non-negative.");
        this.f202874d = j15;
        this.f202875e = o1Var;
    }

    @Override // o.o1
    public long b() {
        return this.f202874d;
    }

    @Override // o.o1
    public o.o1.c e(o.o1.b bVar) {
        o.o1.c cVarE = this.f202875e.e(bVar);
        return (b() <= 0 || bVar.a() < b() - cVarE.b()) ? cVarE : o.o1.c.f140092d;
    }
}
