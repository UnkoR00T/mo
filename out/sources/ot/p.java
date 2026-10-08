package ot;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n f149829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ws.d f149830b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final vr.m f149831c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ws.h f149832d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ws.j f149833e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ws.a f149834f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final qt.s f149835g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final x0 f149836h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final l0 f149837i;

    public p(n nVar, ws.d dVar, vr.m mVar, ws.h hVar, ws.j jVar, ws.a aVar, qt.s sVar, x0 x0Var, List<us.t> list) {
        String strA;
        this.f149829a = nVar;
        this.f149830b = dVar;
        this.f149831c = mVar;
        this.f149832d = hVar;
        this.f149833e = jVar;
        this.f149834f = aVar;
        this.f149835g = sVar;
        this.f149836h = new x0(this, x0Var, list, "Deserializer for \"" + mVar.getName() + '\"', (sVar == null || (strA = sVar.a()) == null) ? "[container not found]" : strA);
        this.f149837i = new l0(this);
    }

    public static /* synthetic */ p b(p pVar, vr.m mVar, List list, ws.d dVar, ws.h hVar, ws.j jVar, ws.a aVar, int i15, Object obj) {
        if ((i15 & 4) != 0) {
            dVar = pVar.f149830b;
        }
        ws.d dVar2 = dVar;
        if ((i15 & 8) != 0) {
            hVar = pVar.f149832d;
        }
        ws.h hVar2 = hVar;
        if ((i15 & 16) != 0) {
            jVar = pVar.f149833e;
        }
        ws.j jVar2 = jVar;
        if ((i15 & 32) != 0) {
            aVar = pVar.f149834f;
        }
        return pVar.a(mVar, list, dVar2, hVar2, jVar2, aVar);
    }

    public final p a(vr.m mVar, List<us.t> list, ws.d dVar, ws.h hVar, ws.j jVar, ws.a aVar) {
        n nVar = this.f149829a;
        if (!ws.k.b(aVar)) {
            jVar = this.f149833e;
        }
        return new p(nVar, dVar, mVar, hVar, jVar, aVar, this.f149835g, this.f149836h, list);
    }

    public final n c() {
        return this.f149829a;
    }

    public final qt.s d() {
        return this.f149835g;
    }

    public final vr.m e() {
        return this.f149831c;
    }

    public final l0 f() {
        return this.f149837i;
    }

    public final ws.d g() {
        return this.f149830b;
    }

    public final rt.n h() {
        return this.f149829a.u();
    }

    public final x0 i() {
        return this.f149836h;
    }

    public final ws.h j() {
        return this.f149832d;
    }

    public final ws.j k() {
        return this.f149833e;
    }
}
