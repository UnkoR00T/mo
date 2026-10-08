package as;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import pq.v;
import ss.n;
import ss.w;
import ss.x;
import yr.p;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n f14274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g f14275b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ConcurrentHashMap<zs.b, lt.k> f14276c = new ConcurrentHashMap<>();

    public a(n nVar, g gVar) {
        this.f14274a = nVar;
        this.f14275b = gVar;
    }

    public final lt.k a(f fVar) {
        Collection collectionE;
        ConcurrentHashMap<zs.b, lt.k> concurrentHashMap = this.f14276c;
        zs.b bVarI = fVar.i();
        lt.k kVar = concurrentHashMap.get(bVarI);
        if (kVar == null) {
            zs.c cVarF = fVar.i().f();
            if (fVar.d().c() == ts.a.EnumC5006a.MULTIFILE_CLASS) {
                List<String> listF = fVar.d().f();
                collectionE = new ArrayList();
                Iterator<T> it = listF.iterator();
                while (it.hasNext()) {
                    x xVarB = w.b(this.f14275b, zs.b.f236634d.c(jt.d.d((String) it.next()).e()), this.f14274a.f().g().d());
                    if (xVarB != null) {
                        collectionE.add(xVarB);
                    }
                }
            } else {
                collectionE = v.e(fVar);
            }
            p pVar = new p(this.f14274a.f().q(), cVarF);
            ArrayList arrayList = new ArrayList();
            Iterator it4 = collectionE.iterator();
            while (it4.hasNext()) {
                lt.k kVarC = this.f14274a.c(pVar, (x) it4.next());
                if (kVarC != null) {
                    arrayList.add(kVarC);
                }
            }
            List listF1 = v.f1(arrayList);
            lt.k kVarA = lt.b.f120085d.a("package " + cVarF + " (" + fVar + ')', listF1);
            lt.k kVarPutIfAbsent = concurrentHashMap.putIfAbsent(bVarI, kVarA);
            kVar = kVarPutIfAbsent == null ? kVarA : kVarPutIfAbsent;
        }
        return kVar;
    }
}
