package ig;

import android.app.Activity;

/* JADX INFO: loaded from: classes3.dex */
public final class w extends l1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final r0.b f92285f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final e f92286g;

    w(i iVar, e eVar, gg.d dVar) {
        super(iVar, dVar);
        this.f92285f = new r0.b();
        this.f92286g = eVar;
        this.f92198a.d("ConnectionlessLifecycleHelper", this);
    }

    public static void t(Activity activity, e eVar, b bVar) {
        i iVarC = h.c(activity);
        w wVar = (w) iVarC.c("ConnectionlessLifecycleHelper", w.class);
        if (wVar == null) {
            wVar = new w(iVarC, eVar, gg.d.n());
        }
        jg.s.m(bVar, "ApiKey cannot be null");
        wVar.f92285f.add(bVar);
        eVar.p(wVar);
    }

    private final void v() {
        if (this.f92285f.isEmpty()) {
            return;
        }
        this.f92286g.p(this);
    }

    @Override // ig.h
    public final void h() {
        super.h();
        v();
    }

    @Override // ig.l1, ig.h
    public final void j() {
        super.j();
        v();
    }

    @Override // ig.l1, ig.h
    public final void k() {
        super.k();
        this.f92286g.q(this);
    }

    @Override // ig.l1
    protected final void o(gg.a aVar, int i15) {
        this.f92286g.z(aVar, i15);
    }

    @Override // ig.l1
    protected final void p() {
        this.f92286g.s();
    }

    final r0.b u() {
        return this.f92285f;
    }
}
