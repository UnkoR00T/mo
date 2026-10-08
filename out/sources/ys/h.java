package ys;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import us.j;
import us.m;
import us.o;
import us.r;
import us.v;

/* JADX INFO: loaded from: classes4.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f229107a = new h();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final bt.g f229108b;

    static {
        bt.g gVarD = bt.g.d();
        xs.a.a(gVarD);
        f229108b = gVarD;
    }

    private h() {
    }

    public static /* synthetic */ d.a d(h hVar, o oVar, ws.d dVar, ws.h hVar2, boolean z15, int i15, Object obj) {
        if ((i15 & 8) != 0) {
            z15 = true;
        }
        return hVar.c(oVar, dVar, hVar2, z15);
    }

    public static final boolean f(o oVar) {
        return c.f229090a.a().d(((Number) oVar.w(xs.a.f220667e)).intValue()).booleanValue();
    }

    private final String g(r rVar, ws.d dVar) {
        if (rVar.s0()) {
            return b.b(dVar.b(rVar.d0()));
        }
        return null;
    }

    public static final oq.r<e, us.c> h(byte[] bArr, String[] strArr) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        return new oq.r<>(f229107a.k(byteArrayInputStream, strArr), us.c.z1(byteArrayInputStream, f229108b));
    }

    public static final oq.r<e, us.c> i(String[] strArr, String[] strArr2) {
        return h(a.e(strArr), strArr2);
    }

    public static final oq.r<e, j> j(String[] strArr, String[] strArr2) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(a.e(strArr));
        return new oq.r<>(f229107a.k(byteArrayInputStream, strArr2), j.e1(byteArrayInputStream, f229108b));
    }

    private final e k(InputStream inputStream, String[] strArr) {
        return new e(xs.a.e.H(inputStream, f229108b), strArr);
    }

    public static final oq.r<e, m> l(byte[] bArr, String[] strArr) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        return new oq.r<>(f229107a.k(byteArrayInputStream, strArr), m.k0(byteArrayInputStream, f229108b));
    }

    public static final oq.r<e, m> m(String[] strArr, String[] strArr2) {
        return l(a.e(strArr), strArr2);
    }

    public final bt.g a() {
        return f229108b;
    }

    public final d.b b(us.e eVar, ws.d dVar, ws.h hVar) {
        String strV0;
        xs.a.c cVar = (xs.a.c) ws.f.a(eVar, xs.a.f220663a);
        String string = (cVar == null || !cVar.D()) ? "<init>" : dVar.getString(cVar.B());
        if (cVar == null || !cVar.C()) {
            List<v> listC0 = eVar.c0();
            ArrayList arrayList = new ArrayList(pq.v.y(listC0, 10));
            Iterator<T> it = listC0.iterator();
            while (it.hasNext()) {
                String strG = f229107a.g(ws.g.r((v) it.next(), hVar), dVar);
                if (strG == null) {
                    return null;
                }
                arrayList.add(strG);
            }
            strV0 = pq.v.v0(arrayList, "", "(", ")V", 0, null, null, 56, null);
        } else {
            strV0 = dVar.getString(cVar.A());
        }
        return new d.b(string, strV0);
    }

    public final d.a c(o oVar, ws.d dVar, ws.h hVar, boolean z15) {
        String strG;
        xs.a.d dVar2 = (xs.a.d) ws.f.a(oVar, xs.a.f220666d);
        if (dVar2 == null) {
            return null;
        }
        xs.a.b bVarE = dVar2.J() ? dVar2.E() : null;
        if (bVarE == null && z15) {
            return null;
        }
        int iT0 = (bVarE == null || !bVarE.D()) ? oVar.T0() : bVarE.B();
        if (bVarE == null || !bVarE.C()) {
            strG = g(ws.g.o(oVar, hVar), dVar);
            if (strG == null) {
                return null;
            }
        } else {
            strG = dVar.getString(bVarE.A());
        }
        return new d.a(dVar.getString(iT0), strG);
    }

    public final d.b e(j jVar, ws.d dVar, ws.h hVar) {
        String string;
        xs.a.c cVar = (xs.a.c) ws.f.a(jVar, xs.a.f220664b);
        int iD0 = (cVar == null || !cVar.D()) ? jVar.D0() : cVar.B();
        if (cVar == null || !cVar.C()) {
            List listR = pq.v.r(ws.g.l(jVar, hVar));
            List<v> listP0 = jVar.P0();
            ArrayList arrayList = new ArrayList(pq.v.y(listP0, 10));
            Iterator<T> it = listP0.iterator();
            while (it.hasNext()) {
                arrayList.add(ws.g.r((v) it.next(), hVar));
            }
            List listL0 = pq.v.L0(listR, arrayList);
            ArrayList arrayList2 = new ArrayList(pq.v.y(listL0, 10));
            Iterator it4 = listL0.iterator();
            while (it4.hasNext()) {
                String strG = f229107a.g((r) it4.next(), dVar);
                if (strG == null) {
                    return null;
                }
                arrayList2.add(strG);
            }
            String strG2 = g(ws.g.n(jVar, hVar), dVar);
            if (strG2 == null) {
                return null;
            }
            string = pq.v.v0(arrayList2, "", "(", ")", 0, null, null, 56, null) + strG2;
        } else {
            string = dVar.getString(cVar.A());
        }
        return new d.b(dVar.getString(iD0), string);
    }
}
