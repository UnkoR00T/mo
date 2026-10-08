package ss;

import vr.n0;

/* JADX INFO: loaded from: classes4.dex */
public final class k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f183904b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ot.n f183905a;

    public static final class a {

        /* JADX INFO: renamed from: ss.k$a$a, reason: collision with other inner class name */
        public static final class C4739a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final k f183906a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final n f183907b;

            public C4739a(k kVar, n nVar) {
                this.f183906a = kVar;
                this.f183907b = nVar;
            }

            public final k a() {
                return this.f183906a;
            }

            public final n b() {
                return this.f183907b;
            }
        }

        public /* synthetic */ a(fr.k kVar) {
            this();
        }

        public final C4739a a(v vVar, v vVar2, js.u uVar, String str, ot.w wVar, ps.b bVar) {
            rt.f fVar = new rt.f("DeserializationComponentsForJava.ModuleData");
            ur.k kVar = new ur.k(fVar, ur.k.a.FROM_DEPENDENCIES);
            yr.f0 f0Var = new yr.f0(zs.f.p('<' + str + '>'), fVar, kVar, null, null, null, 56, null);
            kVar.F0(f0Var);
            kVar.N0(f0Var, true);
            n nVar = new n();
            ms.o oVar = new ms.o();
            n0 n0Var = new n0(fVar, f0Var);
            ms.j jVarB = l.b(uVar, f0Var, fVar, n0Var, vVar, nVar, wVar, bVar, oVar, (512 & 512) != 0 ? d0.a.f183837a : null);
            k kVarA = l.a(f0Var, fVar, n0Var, jVarB, vVar, nVar, wVar, ws.c.f214749i);
            nVar.p(kVarA);
            jt.c cVar = new jt.c(jVarB, ks.j.f112324a);
            oVar.c(cVar);
            ur.w wVar2 = new ur.w(fVar, vVar2, f0Var, n0Var, kVar.M0(), kVar.M0(), ot.o.a.f149818a, tt.p.f192137b.a(), new kt.b(fVar, pq.v.n()));
            f0Var.c1(f0Var);
            f0Var.U0(new yr.l(pq.v.q(cVar.a(), wVar2), "CompositeProvider@RuntimeModuleData for " + f0Var));
            return new C4739a(kVarA, nVar);
        }

        private a() {
        }
    }

    public k(rt.n nVar, vr.i0 i0Var, ot.o oVar, o oVar2, h hVar, ms.j jVar, n0 n0Var, ot.w wVar, ds.c cVar, ot.m mVar, tt.p pVar, vt.a aVar) {
        xr.c cVarM0;
        xr.a aVarM0;
        sr.j jVarI = i0Var.i();
        ur.k kVar = jVarI instanceof ur.k ? (ur.k) jVarI : null;
        this.f183905a = new ot.n(nVar, i0Var, oVar, oVar2, hVar, jVar, ot.b0.a.f149729a, wVar, cVar, p.f183918a, pq.v.n(), n0Var, mVar, (kVar == null || (aVarM0 = kVar.M0()) == null) ? xr.a.C5895a.f220525a : aVarM0, (kVar == null || (cVarM0 = kVar.M0()) == null) ? xr.c.b.f220527a : cVarM0, ys.h.f229107a.a(), pVar, new kt.b(nVar, pq.v.n()), aVar.a(), ot.z.f149885a);
    }

    public final ot.n a() {
        return this.f183905a;
    }
}
