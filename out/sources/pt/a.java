package pt;

import bt.g;
import fu.r;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends nt.a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final a f162502r = new a();

    /* JADX WARN: Illegal instructions before constructor call */
    private a() {
        g gVarD = g.d();
        vs.b.a(gVarD);
        super(gVarD, vs.b.f208225a, vs.b.f208227c, vs.b.f208226b, vs.b.f208228d, null, vs.b.f208229e, vs.b.f208230f, vs.b.f208231g, null, null, null, vs.b.f208233i, vs.b.f208232h, vs.b.f208234j, vs.b.f208235k, vs.b.f208236l);
    }

    private final String s(zs.c cVar) {
        return cVar.c() ? "default-package" : cVar.f().e();
    }

    public final String q(zs.c cVar) {
        return s(cVar) + ".kotlin_builtins";
    }

    public final String r(zs.c cVar) {
        return r.O(cVar.a(), '.', '/', false, 4, null) + '/' + q(cVar);
    }
}
