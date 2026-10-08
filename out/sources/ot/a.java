package ot;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a<A> implements h<A> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final nt.a f149726a;

    /* JADX INFO: renamed from: ot.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C3689a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f149727a;

        static {
            int[] iArr = new int[d.values().length];
            try {
                iArr[d.PROPERTY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d.PROPERTY_GETTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[d.PROPERTY_SETTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f149727a = iArr;
        }
    }

    public a(nt.a aVar) {
        this.f149726a = aVar;
    }

    @Override // ot.h
    public List<A> a(o0 o0Var, us.o oVar) {
        bt.i.f<us.o, List<us.b>> fVarJ = this.f149726a.j();
        List listN = fVarJ != null ? (List) oVar.w(fVarJ) : null;
        if (listN == null) {
            listN = pq.v.n();
        }
        List list = listN;
        ArrayList arrayList = new ArrayList(pq.v.y(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(b((us.b) it.next(), o0Var.b()));
        }
        return arrayList;
    }

    @Override // ot.h
    public List<A> c(us.r rVar, ws.d dVar) {
        List listN = (List) rVar.w(this.f149726a.o());
        if (listN == null) {
            listN = pq.v.n();
        }
        List list = listN;
        ArrayList arrayList = new ArrayList(pq.v.y(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(b((us.b) it.next(), dVar));
        }
        return arrayList;
    }

    @Override // ot.h
    public List<A> e(o0 o0Var, us.h hVar) {
        List listN = (List) hVar.w(this.f149726a.d());
        if (listN == null) {
            listN = pq.v.n();
        }
        List list = listN;
        ArrayList arrayList = new ArrayList(pq.v.y(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(b((us.b) it.next(), o0Var.b()));
        }
        return arrayList;
    }

    @Override // ot.h
    public List<A> f(us.t tVar, ws.d dVar) {
        List listN = (List) tVar.w(this.f149726a.p());
        if (listN == null) {
            listN = pq.v.n();
        }
        List list = listN;
        ArrayList arrayList = new ArrayList(pq.v.y(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(b((us.b) it.next(), dVar));
        }
        return arrayList;
    }

    @Override // ot.h
    public List<A> g(o0 o0Var, bt.q qVar, d dVar, int i15, us.v vVar) {
        List<A> listI = vVar != null ? i(o0Var, qVar, dVar, i15, vVar) : null;
        return listI == null ? pq.v.n() : listI;
    }

    @Override // ot.h
    public List<A> h(o0.a aVar) {
        List listN = (List) aVar.f().w(this.f149726a.a());
        if (listN == null) {
            listN = pq.v.n();
        }
        List list = listN;
        ArrayList arrayList = new ArrayList(pq.v.y(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(b((us.b) it.next(), aVar.b()));
        }
        return arrayList;
    }

    @Override // ot.h
    public List<A> i(o0 o0Var, bt.q qVar, d dVar, int i15, us.v vVar) {
        List listN = (List) vVar.w(this.f149726a.h());
        if (listN == null) {
            listN = pq.v.n();
        }
        List list = listN;
        ArrayList arrayList = new ArrayList(pq.v.y(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(b((us.b) it.next(), o0Var.b()));
        }
        return arrayList;
    }

    @Override // ot.h
    public List<A> j(o0 o0Var, bt.q qVar, d dVar) {
        List listN = null;
        if (qVar instanceof us.j) {
            bt.i.f<us.j, List<us.b>> fVarG = this.f149726a.g();
            if (fVarG != null) {
                listN = (List) ((us.j) qVar).w(fVarG);
            }
        } else {
            if (!(qVar instanceof us.o)) {
                throw new IllegalStateException(("Unknown message: " + qVar).toString());
            }
            int i15 = C3689a.f149727a[dVar.ordinal()];
            if (i15 != 1 && i15 != 2 && i15 != 3) {
                throw new IllegalStateException(("Unsupported callable kind with property proto for receiver annotations: " + dVar).toString());
            }
            bt.i.f<us.o, List<us.b>> fVarL = this.f149726a.l();
            if (fVarL != null) {
                listN = (List) ((us.o) qVar).w(fVarL);
            }
        }
        if (listN == null) {
            listN = pq.v.n();
        }
        List list = listN;
        ArrayList arrayList = new ArrayList(pq.v.y(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(b((us.b) it.next(), o0Var.b()));
        }
        return arrayList;
    }

    @Override // ot.h
    public List<A> l(o0 o0Var, bt.q qVar, d dVar) {
        List listN;
        if (qVar instanceof us.e) {
            listN = (List) ((us.e) qVar).w(this.f149726a.c());
        } else if (qVar instanceof us.j) {
            listN = (List) ((us.j) qVar).w(this.f149726a.f());
        } else {
            if (!(qVar instanceof us.o)) {
                throw new IllegalStateException(("Unknown message: " + qVar).toString());
            }
            int i15 = C3689a.f149727a[dVar.ordinal()];
            if (i15 == 1) {
                listN = (List) ((us.o) qVar).w(this.f149726a.i());
            } else if (i15 == 2) {
                listN = (List) ((us.o) qVar).w(this.f149726a.m());
            } else {
                if (i15 != 3) {
                    throw new IllegalStateException("Unsupported callable kind with property proto");
                }
                listN = (List) ((us.o) qVar).w(this.f149726a.n());
            }
        }
        if (listN == null) {
            listN = pq.v.n();
        }
        List list = listN;
        ArrayList arrayList = new ArrayList(pq.v.y(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(b((us.b) it.next(), o0Var.b()));
        }
        return arrayList;
    }

    @Override // ot.h
    public List<A> m(o0 o0Var, us.o oVar) {
        bt.i.f<us.o, List<us.b>> fVarK = this.f149726a.k();
        List listN = fVarK != null ? (List) oVar.w(fVarK) : null;
        if (listN == null) {
            listN = pq.v.n();
        }
        List list = listN;
        ArrayList arrayList = new ArrayList(pq.v.y(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(b((us.b) it.next(), o0Var.b()));
        }
        return arrayList;
    }

    protected final nt.a n() {
        return this.f149726a;
    }
}
