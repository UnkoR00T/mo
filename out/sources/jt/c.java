package jt;

import lt.k;
import ms.j;
import ns.d0;
import pq.v;
import qs.g;
import vr.h;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j f105191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ks.j f105192b;

    public c(j jVar, ks.j jVar2) {
        this.f105191a = jVar;
        this.f105192b = jVar2;
    }

    public final j a() {
        return this.f105191a;
    }

    public final vr.e b(g gVar) {
        d0 d0Var;
        zs.c cVarG = gVar.g();
        if (cVarG != null && gVar.O() == qs.d0.SOURCE) {
            return this.f105192b.d(cVarG);
        }
        g gVarR = gVar.r();
        if (gVarR == null) {
            if (cVarG == null || (d0Var = (d0) v.n0(this.f105191a.a(cVarG.d()))) == null) {
                return null;
            }
            return d0Var.T0(gVar);
        }
        vr.e eVarB = b(gVarR);
        k kVarX = eVarB != null ? eVarB.X() : null;
        h hVarE = kVarX != null ? kVarX.e(gVar.getName(), ds.d.FROM_JAVA_LOADER) : null;
        if (hVarE instanceof vr.e) {
            return (vr.e) hVarE;
        }
        return null;
    }
}
