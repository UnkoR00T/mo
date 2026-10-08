package ks;

import fr.h0;
import fr.q0;
import java.util.Map;
import oq.y;
import pq.v0;
import sr.p;

/* JADX INFO: loaded from: classes4.dex */
public final class l extends c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final /* synthetic */ mr.l<Object>[] f112326h = {q0.j(new h0(l.class, "allValueArguments", "getAllValueArguments()Ljava/util/Map;", 0))};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final rt.i f112327g;

    public l(qs.a aVar, ms.k kVar) {
        super(kVar, aVar, p.a.L);
        this.f112327g = kVar.e().d(new k(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map h(l lVar) {
        ft.g<?> gVarB = f.f112317a.b(lVar.c());
        Map mapF = gVarB != null ? v0.f(y.a(d.f112311a.c(), gVarB)) : null;
        return mapF == null ? v0.i() : mapF;
    }

    @Override // ks.c, wr.c
    public Map<zs.f, ft.g<?>> a() {
        return (Map) rt.m.a(this.f112327g, this, f112326h[0]);
    }
}
