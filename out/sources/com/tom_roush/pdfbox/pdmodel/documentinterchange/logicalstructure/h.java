package com.tom_roush.pdfbox.pdmodel.documentinterchange.logicalstructure;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class h implements hp.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final bp.d f36981a;

    protected h(String str) {
        bp.d dVar = new bp.d();
        this.f36981a = dVar;
        dVar.d5(bp.i.f20732e9, str);
    }

    public static h d(bp.d dVar) {
        String strH4 = dVar.H4(bp.i.f20732e9);
        if ("StructTreeRoot".equals(strH4)) {
            return new i(dVar);
        }
        if (strH4 == null || g.f36980b.equals(strH4)) {
            return new g(dVar);
        }
        throw new IllegalArgumentException("Dictionary must not include a Type entry with a value that is neither StructTreeRoot nor StructElem.");
    }

    private hp.c f(bp.d dVar) {
        String strH4 = dVar.H4(bp.i.f20732e9);
        if (strH4 == null || g.f36980b.equals(strH4)) {
            return new g(dVar);
        }
        if (e.f36977b.equals(strH4)) {
            return new e(dVar);
        }
        if (d.f36975b.equals(strH4)) {
            return new d(dVar);
        }
        return null;
    }

    protected void a(bp.b bVar) {
        if (bVar == null) {
            return;
        }
        bp.d dVarD1 = D1();
        bp.i iVar = bp.i.N4;
        bp.b bVarP4 = dVarD1.p4(iVar);
        if (bVarP4 == null) {
            D1().Y4(iVar, bVar);
            return;
        }
        if (bVarP4 instanceof bp.a) {
            ((bp.a) bVarP4).A3(bVar);
            return;
        }
        bp.a aVar = new bp.a();
        aVar.A3(bVarP4);
        aVar.A3(bVar);
        D1().Y4(iVar, aVar);
    }

    public void b(g gVar) {
        c(gVar);
        gVar.c0(this);
    }

    protected void c(hp.c cVar) {
        if (cVar == null) {
            return;
        }
        a(cVar.D1());
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001b  */
    protected Object e(bp.b bVar) {
        bp.d dVar;
        if (bVar instanceof bp.d) {
            dVar = (bp.d) bVar;
        } else if (bVar instanceof bp.l) {
            bp.b bVarX3 = ((bp.l) bVar).X3();
            if (bVarX3 instanceof bp.d) {
                dVar = (bp.d) bVarX3;
            } else {
                dVar = null;
            }
        } else {
            dVar = null;
        }
        if (dVar != null) {
            return f(dVar);
        }
        if (bVar instanceof bp.h) {
            return Integer.valueOf(((bp.h) bVar).J3());
        }
        return null;
    }

    @Override // hp.c
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public bp.d D1() {
        return this.f36981a;
    }

    public List<Object> h() {
        ArrayList arrayList = new ArrayList();
        bp.b bVarP4 = D1().p4(bp.i.N4);
        if (bVarP4 instanceof bp.a) {
            Iterator<bp.b> it = ((bp.a) bVarP4).iterator();
            while (it.hasNext()) {
                Object objE = e(it.next());
                if (objE != null) {
                    arrayList.add(objE);
                }
            }
        } else {
            Object objE2 = e(bVarP4);
            if (objE2 != null) {
                arrayList.add(objE2);
            }
        }
        return arrayList;
    }

    public String i() {
        return D1().H4(bp.i.f20732e9);
    }

    protected void j(bp.b bVar, Object obj) {
        if (bVar == null || obj == null) {
            return;
        }
        bp.d dVarD1 = D1();
        bp.i iVar = bp.i.N4;
        bp.b bVarP4 = dVarD1.p4(iVar);
        if (bVarP4 == null) {
            return;
        }
        bp.b bVarD1 = obj instanceof hp.c ? ((hp.c) obj).D1() : null;
        if (bVarP4 instanceof bp.a) {
            bp.a aVar = (bp.a) bVarP4;
            aVar.i3(aVar.l4(bVarD1), bVar.D1());
            return;
        }
        boolean zEquals = bVarP4.equals(bVarD1);
        if (!zEquals && (bVarP4 instanceof bp.l)) {
            zEquals = ((bp.l) bVarP4).X3().equals(bVarD1);
        }
        if (zEquals) {
            bp.a aVar2 = new bp.a();
            aVar2.A3(bVar);
            aVar2.A3(bVarD1);
            D1().Y4(iVar, aVar2);
        }
    }

    public void k(g gVar, Object obj) {
        l(gVar, obj);
    }

    protected void l(hp.c cVar, Object obj) {
        if (cVar == null) {
            return;
        }
        j(cVar.D1(), obj);
    }

    protected boolean m(bp.b bVar) {
        if (bVar == null) {
            return false;
        }
        bp.d dVarD1 = D1();
        bp.i iVar = bp.i.N4;
        bp.b bVarP4 = dVarD1.p4(iVar);
        if (bVarP4 == null) {
            return false;
        }
        if (bVarP4 instanceof bp.a) {
            bp.a aVar = (bp.a) bVarP4;
            boolean zO4 = aVar.o4(bVar);
            if (aVar.size() == 1) {
                D1().Y4(iVar, aVar.k4(0));
            }
            return zO4;
        }
        boolean zEquals = bVarP4.equals(bVar);
        if (!zEquals && (bVarP4 instanceof bp.l)) {
            zEquals = ((bp.l) bVarP4).X3().equals(bVar);
        }
        if (!zEquals) {
            return false;
        }
        D1().Y4(iVar, null);
        return true;
    }

    public boolean n(g gVar) {
        boolean zO = o(gVar);
        if (zO) {
            gVar.c0(null);
        }
        return zO;
    }

    protected boolean o(hp.c cVar) {
        if (cVar == null) {
            return false;
        }
        return m(cVar.D1());
    }

    public void p(List<Object> list) {
        D1().Y4(bp.i.N4, hp.a.h(list));
    }

    protected h(bp.d dVar) {
        this.f36981a = dVar;
    }
}
