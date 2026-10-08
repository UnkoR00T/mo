package vp;

/* JADX INFO: loaded from: classes4.dex */
public abstract class j implements hp.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f207804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final n f207805b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final bp.d f207806c;

    j(d dVar) {
        this(dVar, new bp.d(), null);
    }

    static j a(d dVar, bp.d dVar2, n nVar) {
        return k.c(dVar, dVar2, nVar);
    }

    public d b() {
        return this.f207804a;
    }

    public sp.q c() {
        bp.d dVar = (bp.d) this.f207806c.p4(bp.i.f20743g);
        if (dVar != null) {
            return new sp.q(dVar);
        }
        return null;
    }

    @Override // hp.c
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public bp.d D1() {
        return this.f207806c;
    }

    public String e() {
        String strG = g();
        n nVar = this.f207805b;
        String strE = nVar != null ? nVar.e() : null;
        if (strE == null) {
            return strG;
        }
        if (strG == null) {
            return strE;
        }
        return strE + "." + strG;
    }

    protected bp.b f(bp.i iVar) {
        if (this.f207806c.J3(iVar)) {
            return this.f207806c.p4(iVar);
        }
        n nVar = this.f207805b;
        return nVar != null ? nVar.f(iVar) : this.f207804a.D1().p4(iVar);
    }

    public String g() {
        return this.f207806c.L4(bp.i.F8);
    }

    public void h(String str) {
        if (!str.contains(".")) {
            this.f207806c.g5(bp.i.F8, str);
            return;
        }
        throw new IllegalArgumentException("A field partial name shall not contain a period character: " + str);
    }

    public String toString() {
        return e() + "{type: " + getClass().getSimpleName() + " value: " + f(bp.i.f20863r9) + "}";
    }

    j(d dVar, bp.d dVar2, n nVar) {
        this.f207804a = dVar;
        this.f207806c = dVar2;
        this.f207805b = nVar;
    }
}
