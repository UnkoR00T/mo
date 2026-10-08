package ur;

import fr.h0;
import fr.q0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import pq.e1;
import vr.f0;
import vr.h1;
import vr.i0;
import vr.o0;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements xr.b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final zs.f f200058g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final zs.b f200059h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i0 f200060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final er.l<i0, vr.m> f200061b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final rt.i f200062c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final /* synthetic */ mr.l<Object>[] f200056e = {q0.j(new h0(g.class, "cloneable", "getCloneable()Lorg/jetbrains/kotlin/descriptors/impl/ClassDescriptorImpl;", 0))};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f200055d = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final zs.c f200057f = sr.p.B;

    public static final class a {
        public /* synthetic */ a(fr.k kVar) {
            this();
        }

        public final zs.b a() {
            return g.f200059h;
        }

        private a() {
        }
    }

    static {
        zs.d dVar = sr.p.a.f183635d;
        f200058g = dVar.j();
        f200059h = zs.b.f236634d.c(dVar.m());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g(rt.n nVar, i0 i0Var, er.l<? super i0, ? extends vr.m> lVar) {
        this.f200060a = i0Var;
        this.f200061b = lVar;
        this.f200062c = nVar.d(new e(this, nVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final sr.c d(i0 i0Var) {
        List<o0> listN0 = i0Var.V(f200057f).n0();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listN0) {
            if (obj instanceof sr.c) {
                arrayList.add(obj);
            }
        }
        return (sr.c) pq.v.l0(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final yr.k h(g gVar, rt.n nVar) {
        yr.k kVar = new yr.k(gVar.f200061b.b(gVar.f200060a), f200058g, f0.ABSTRACT, vr.f.INTERFACE, pq.v.e(gVar.f200060a.i().i()), h1.f208052a, false, nVar);
        kVar.Q0(new ur.a(nVar, kVar), e1.e(), null);
        return kVar;
    }

    private final yr.k i() {
        return (yr.k) rt.m.a(this.f200062c, this, f200056e[0]);
    }

    @Override // xr.b
    public Collection<vr.e> a(zs.c cVar) {
        return fr.t.c(cVar, f200057f) ? e1.d(i()) : e1.e();
    }

    @Override // xr.b
    public vr.e b(zs.b bVar) {
        if (fr.t.c(bVar, f200059h)) {
            return i();
        }
        return null;
    }

    @Override // xr.b
    public boolean c(zs.c cVar, zs.f fVar) {
        return fr.t.c(fVar, f200058g) && fr.t.c(cVar, f200057f);
    }

    public /* synthetic */ g(rt.n nVar, i0 i0Var, er.l lVar, int i15, fr.k kVar) {
        this(nVar, i0Var, (i15 & 4) != 0 ? f.f200054a : lVar);
    }
}
