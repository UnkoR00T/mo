package ks;

import fr.t;
import java.util.Map;
import js.j0;
import oq.y;
import pq.v0;
import sr.p;

/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f112311a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final zs.f f112312b = zs.f.l("message");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final zs.f f112313c = zs.f.l("allowedTargets");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final zs.f f112314d = zs.f.l("value");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Map<zs.c, zs.c> f112315e = v0.l(y.a(p.a.H, j0.f104663d), y.a(p.a.L, j0.f104665f), y.a(p.a.P, j0.f104668i));

    private d() {
    }

    public static /* synthetic */ wr.c f(d dVar, qs.a aVar, ms.k kVar, boolean z15, int i15, Object obj) {
        if ((i15 & 4) != 0) {
            z15 = false;
        }
        return dVar.e(aVar, kVar, z15);
    }

    public final wr.c a(zs.c cVar, qs.d dVar, ms.k kVar) {
        qs.a aVarH;
        qs.a aVarH2;
        if (t.c(cVar, p.a.f183677y) && ((aVarH2 = dVar.H(j0.f104667h)) != null || dVar.F())) {
            return new h(aVarH2, kVar);
        }
        zs.c cVar2 = f112315e.get(cVar);
        if (cVar2 == null || (aVarH = dVar.H(cVar2)) == null) {
            return null;
        }
        return f(f112311a, aVarH, kVar, false, 4, null);
    }

    public final zs.f b() {
        return f112312b;
    }

    public final zs.f c() {
        return f112314d;
    }

    public final zs.f d() {
        return f112313c;
    }

    public final wr.c e(qs.a aVar, ms.k kVar, boolean z15) {
        zs.b bVarI = aVar.i();
        zs.b.a aVar2 = zs.b.f236634d;
        if (t.c(bVarI, aVar2.c(j0.f104663d))) {
            return new n(aVar, kVar);
        }
        if (t.c(bVarI, aVar2.c(j0.f104665f))) {
            return new l(aVar, kVar);
        }
        if (t.c(bVarI, aVar2.c(j0.f104668i))) {
            return new c(kVar, aVar, p.a.P);
        }
        if (t.c(bVarI, aVar2.c(j0.f104667h))) {
            return null;
        }
        return new ns.j(kVar, aVar, z15);
    }
}
