package ks;

import fr.h0;
import fr.q0;
import java.util.Map;
import oq.y;
import pq.v;
import pq.v0;
import sr.p;

/* JADX INFO: loaded from: classes4.dex */
public final class n extends c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final /* synthetic */ mr.l<Object>[] f112329h = {q0.j(new h0(n.class, "allValueArguments", "getAllValueArguments()Ljava/util/Map;", 0))};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final rt.i f112330g;

    public n(qs.a aVar, ms.k kVar) {
        super(kVar, aVar, p.a.H);
        this.f112330g = kVar.e().d(new m(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map h(n nVar) {
        ft.g<?> gVarD;
        qs.b bVarC = nVar.c();
        if (bVarC instanceof qs.e) {
            gVarD = f.f112317a.d(((qs.e) nVar.c()).c());
        } else {
            gVarD = bVarC instanceof qs.m ? f.f112317a.d(v.e(nVar.c())) : null;
        }
        Map mapF = gVarD != null ? v0.f(y.a(d.f112311a.d(), gVarD)) : null;
        return mapF == null ? v0.i() : mapF;
    }

    @Override // ks.c, wr.c
    public Map<zs.f, ft.g<Object>> a() {
        return (Map) rt.m.a(this.f112330g, this, f112329h[0]);
    }
}
