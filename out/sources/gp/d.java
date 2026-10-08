package gp;

/* JADX INFO: loaded from: classes4.dex */
public class d implements hp.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final bp.d f75792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f75793b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private vp.d f75794c;

    public d(c cVar) {
        this.f75793b = cVar;
        bp.d dVar = new bp.d();
        this.f75792a = dVar;
        dVar.Y4(bp.i.f20732e9, bp.i.Z0);
        cVar.H().k4().Y4(bp.i.D7, dVar);
    }

    public vp.d a(kp.a aVar) {
        if (aVar != null) {
            aVar.apply();
            this.f75794c = null;
        }
        if (this.f75794c == null) {
            bp.d dVarK4 = this.f75792a.k4(bp.i.f20783k);
            this.f75794c = dVarK4 != null ? new vp.d(this.f75793b, dVarK4) : null;
        }
        return this.f75794c;
    }

    @Override // hp.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public bp.d D1() {
        return this.f75792a;
    }

    public g c() {
        return new g((bp.d) this.f75792a.p4(bp.i.F6), this.f75793b);
    }

    public String d() {
        return this.f75792a.H4(bp.i.f20895u9);
    }

    public void e(vp.d dVar) {
        this.f75792a.Z4(bp.i.f20783k, dVar);
        this.f75794c = null;
    }

    public void f(String str) {
        this.f75792a.d5(bp.i.f20895u9, str);
    }

    public d(c cVar, bp.d dVar) {
        this.f75793b = cVar;
        this.f75792a = dVar;
    }
}
