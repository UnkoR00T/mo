package lt;

import fr.h0;
import fr.q0;
import java.util.Collection;
import java.util.List;
import vr.g1;
import vr.z0;

/* JADX INFO: loaded from: classes4.dex */
public final class q extends l {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final /* synthetic */ mr.l<Object>[] f120135f = {q0.j(new h0(q.class, "functions", "getFunctions()Ljava/util/List;", 0)), q0.j(new h0(q.class, "properties", "getProperties()Ljava/util/List;", 0))};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final vr.e f120136b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f120137c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final rt.i f120138d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final rt.i f120139e;

    public q(rt.n nVar, vr.e eVar, boolean z15) {
        this.f120136b = eVar;
        this.f120137c = z15;
        eVar.k();
        vr.f fVar = vr.f.CLASS;
        this.f120138d = nVar.d(new o(this));
        this.f120139e = nVar.d(new p(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List j(q qVar) {
        return pq.v.q(dt.h.g(qVar.f120136b), dt.h.h(qVar.f120136b));
    }

    private final List<g1> n() {
        return (List) rt.m.a(this.f120138d, this, f120135f[0]);
    }

    private final List<z0> o() {
        return (List) rt.m.a(this.f120139e, this, f120135f[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List p(q qVar) {
        return qVar.f120137c ? pq.v.r(dt.h.f(qVar.f120136b)) : pq.v.n();
    }

    @Override // lt.l, lt.k
    public Collection<z0> c(zs.f fVar, ds.b bVar) {
        List<z0> listO = o();
        cu.j jVar = new cu.j();
        for (Object obj : listO) {
            if (fr.t.c(((z0) obj).getName(), fVar)) {
                jVar.add(obj);
            }
        }
        return jVar;
    }

    @Override // lt.l, lt.n
    public /* bridge */ /* synthetic */ vr.h e(zs.f fVar, ds.b bVar) {
        return (vr.h) k(fVar, bVar);
    }

    public Void k(zs.f fVar, ds.b bVar) {
        return null;
    }

    @Override // lt.l, lt.n
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public List<vr.b> f(d dVar, er.l<? super zs.f, Boolean> lVar) {
        return pq.v.L0(n(), o());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // lt.l, lt.k
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public cu.j<g1> a(zs.f fVar, ds.b bVar) {
        List<g1> listN = n();
        cu.j<g1> jVar = new cu.j<>();
        for (Object obj : listN) {
            if (fr.t.c(((g1) obj).getName(), fVar)) {
                jVar.add(obj);
            }
        }
        return jVar;
    }
}
