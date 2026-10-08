package lt;

import fr.h0;
import fr.q0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import st.t0;
import vr.g1;
import vr.z;
import vr.z0;

/* JADX INFO: loaded from: classes4.dex */
public abstract class f extends l {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final /* synthetic */ mr.l<Object>[] f120120d = {q0.j(new h0(f.class, "allDescriptors", "getAllDescriptors()Ljava/util/List;", 0))};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final vr.e f120121b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final rt.i f120122c;

    public static final class a extends dt.m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ArrayList<vr.m> f120123a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ f f120124b;

        a(ArrayList<vr.m> arrayList, f fVar) {
            this.f120123a = arrayList;
            this.f120124b = fVar;
        }

        @Override // dt.n
        public void a(vr.b bVar) {
            dt.o.K(bVar, null);
            this.f120123a.add(bVar);
        }

        @Override // dt.m
        protected void e(vr.b bVar, vr.b bVar2) {
            throw new IllegalStateException(("Conflict in scope of " + this.f120124b.m() + ": " + bVar + " vs " + bVar2).toString());
        }
    }

    public f(rt.n nVar, vr.e eVar) {
        this.f120121b = eVar;
        this.f120122c = nVar.d(new e(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List i(f fVar) {
        List<z> listJ = fVar.j();
        return pq.v.L0(listJ, fVar.k(listJ));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final List<vr.m> k(List<? extends z> list) {
        Collection<? extends vr.b> collectionN;
        ArrayList arrayList = new ArrayList(3);
        Collection<t0> collectionQ = this.f120121b.o().q();
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it = collectionQ.iterator();
        while (it.hasNext()) {
            pq.v.D(arrayList2, n.a.a(((t0) it.next()).r(), null, null, 3, null));
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayList2) {
            if (obj instanceof vr.b) {
                arrayList3.add(obj);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : arrayList3) {
            zs.f name = ((vr.b) obj2).getName();
            Object arrayList4 = linkedHashMap.get(name);
            if (arrayList4 == null) {
                arrayList4 = new ArrayList();
                linkedHashMap.put(name, arrayList4);
            }
            ((List) arrayList4).add(obj2);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            zs.f fVar = (zs.f) entry.getKey();
            List list2 = (List) entry.getValue();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Object obj3 : list2) {
                Boolean boolValueOf = Boolean.valueOf(((vr.b) obj3) instanceof z);
                Object arrayList5 = linkedHashMap2.get(boolValueOf);
                if (arrayList5 == null) {
                    arrayList5 = new ArrayList();
                    linkedHashMap2.put(boolValueOf, arrayList5);
                }
                ((List) arrayList5).add(obj3);
            }
            for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                boolean zBooleanValue = ((Boolean) entry2.getKey()).booleanValue();
                List list3 = (List) entry2.getValue();
                dt.o oVar = dt.o.f44494f;
                List list4 = list3;
                if (zBooleanValue) {
                    collectionN = new ArrayList<>();
                    for (Object obj4 : list) {
                        if (fr.t.c(((z) obj4).getName(), fVar)) {
                            collectionN.add(obj4);
                        }
                    }
                } else {
                    collectionN = pq.v.n();
                }
                oVar.v(fVar, list4, collectionN, this.f120121b, new a(arrayList, this));
            }
        }
        return cu.a.c(arrayList);
    }

    private final List<vr.m> l() {
        return (List) rt.m.a(this.f120122c, this, f120120d[0]);
    }

    @Override // lt.l, lt.k
    public Collection<g1> a(zs.f fVar, ds.b bVar) {
        List listN;
        List<vr.m> listL = l();
        if (listL.isEmpty()) {
            listN = pq.v.n();
        } else {
            cu.j jVar = new cu.j();
            for (Object obj : listL) {
                if ((obj instanceof g1) && fr.t.c(((g1) obj).getName(), fVar)) {
                    jVar.add(obj);
                }
            }
            listN = jVar;
        }
        return listN;
    }

    @Override // lt.l, lt.k
    public Collection<z0> c(zs.f fVar, ds.b bVar) {
        List listN;
        List<vr.m> listL = l();
        if (listL.isEmpty()) {
            listN = pq.v.n();
        } else {
            cu.j jVar = new cu.j();
            for (Object obj : listL) {
                if ((obj instanceof z0) && fr.t.c(((z0) obj).getName(), fVar)) {
                    jVar.add(obj);
                }
            }
            listN = jVar;
        }
        return listN;
    }

    @Override // lt.l, lt.n
    public Collection<vr.m> f(d dVar, er.l<? super zs.f, Boolean> lVar) {
        return !dVar.a(d.f120104p.m()) ? pq.v.n() : l();
    }

    protected abstract List<z> j();

    protected final vr.e m() {
        return this.f120121b;
    }
}
