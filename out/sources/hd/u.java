package hd;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class u implements c, id.a.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f83705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f83706b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<id.a.b> f83707c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final od.t.a f83708d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final id.a<?, Float> f83709e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final id.a<?, Float> f83710f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final id.a<?, Float> f83711g;

    public u(pd.b bVar, od.t tVar) {
        this.f83705a = tVar.c();
        this.f83706b = tVar.g();
        this.f83708d = tVar.f();
        id.d dVarL = tVar.e().l();
        this.f83709e = dVarL;
        id.d dVarL2 = tVar.b().l();
        this.f83710f = dVarL2;
        id.d dVarL3 = tVar.d().l();
        this.f83711g = dVarL3;
        bVar.j(dVarL);
        bVar.j(dVarL2);
        bVar.j(dVarL3);
        dVarL.a(this);
        dVarL2.a(this);
        dVarL3.a(this);
    }

    @Override // id.a.b
    public void a() {
        for (int i15 = 0; i15 < this.f83707c.size(); i15++) {
            this.f83707c.get(i15).a();
        }
    }

    @Override // hd.c
    public void b(List<c> list, List<c> list2) {
    }

    void c(id.a.b bVar) {
        this.f83707c.add(bVar);
    }

    public id.a<?, Float> g() {
        return this.f83710f;
    }

    public id.a<?, Float> h() {
        return this.f83711g;
    }

    public id.a<?, Float> j() {
        return this.f83709e;
    }

    od.t.a k() {
        return this.f83708d;
    }

    public boolean l() {
        return this.f83706b;
    }
}
