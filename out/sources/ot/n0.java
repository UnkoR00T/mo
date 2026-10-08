package ot;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import vr.h1;

/* JADX INFO: loaded from: classes4.dex */
public final class n0 implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ws.d f149814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ws.a f149815b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final er.l<zs.b, h1> f149816c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map<zs.b, us.c> f149817d;

    /* JADX WARN: Multi-variable type inference failed */
    public n0(us.n nVar, ws.d dVar, ws.a aVar, er.l<? super zs.b, ? extends h1> lVar) {
        this.f149814a = dVar;
        this.f149815b = aVar;
        this.f149816c = lVar;
        List<us.c> listN = nVar.N();
        LinkedHashMap linkedHashMap = new LinkedHashMap(lr.m.e(pq.v0.e(pq.v.y(listN, 10)), 16));
        for (Object obj : listN) {
            linkedHashMap.put(m0.a(this.f149814a, ((us.c) obj).O0()), obj);
        }
        this.f149817d = linkedHashMap;
    }

    @Override // ot.j
    public i a(zs.b bVar) {
        us.c cVar = this.f149817d.get(bVar);
        if (cVar == null) {
            return null;
        }
        return new i(this.f149814a, cVar, this.f149815b, this.f149816c.b(bVar));
    }

    public final Collection<zs.b> b() {
        return this.f149817d.keySet();
    }
}
