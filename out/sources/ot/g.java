package ot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import vr.h1;
import vr.t1;

/* JADX INFO: loaded from: classes4.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final vr.i0 f149753a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final vr.n0 f149754b;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f149755a;

        static {
            int[] iArr = new int[us.b.C5222b.c.EnumC5225c.values().length];
            try {
                iArr[us.b.C5222b.c.EnumC5225c.BYTE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[us.b.C5222b.c.EnumC5225c.CHAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[us.b.C5222b.c.EnumC5225c.SHORT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[us.b.C5222b.c.EnumC5225c.INT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[us.b.C5222b.c.EnumC5225c.LONG.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[us.b.C5222b.c.EnumC5225c.FLOAT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[us.b.C5222b.c.EnumC5225c.DOUBLE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[us.b.C5222b.c.EnumC5225c.BOOLEAN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[us.b.C5222b.c.EnumC5225c.STRING.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[us.b.C5222b.c.EnumC5225c.CLASS.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[us.b.C5222b.c.EnumC5225c.ENUM.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[us.b.C5222b.c.EnumC5225c.ANNOTATION.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[us.b.C5222b.c.EnumC5225c.ARRAY.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            f149755a = iArr;
        }
    }

    public g(vr.i0 i0Var, vr.n0 n0Var) {
        this.f149753a = i0Var;
        this.f149754b = n0Var;
    }

    private final boolean b(ft.g<?> gVar, st.t0 t0Var, us.b.C5222b.c cVar) {
        us.b.C5222b.c.EnumC5225c enumC5225cY = cVar.Y();
        int i15 = enumC5225cY == null ? -1 : a.f149755a[enumC5225cY.ordinal()];
        if (i15 == 10) {
            vr.h hVarC = t0Var.T0().c();
            vr.e eVar = hVarC instanceof vr.e ? (vr.e) hVarC : null;
            return eVar == null || sr.j.m0(eVar);
        }
        if (i15 != 13) {
            return fr.t.c(gVar.a(this.f149753a), t0Var);
        }
        if (!(gVar instanceof ft.b) || ((ft.b) gVar).b().size() != cVar.N().size()) {
            throw new IllegalStateException(("Deserialized ArrayValue should have the same number of elements as the original array value: " + gVar).toString());
        }
        st.t0 t0VarL = c().l(t0Var);
        if (t0VarL == null) {
            return false;
        }
        ft.b bVar = (ft.b) gVar;
        Iterable iterableO = pq.v.o(bVar.b());
        if ((iterableO instanceof Collection) && ((Collection) iterableO).isEmpty()) {
            return true;
        }
        Iterator it = iterableO.iterator();
        while (it.hasNext()) {
            int iNextInt = ((pq.s0) it).nextInt();
            if (!b(bVar.b().get(iNextInt), t0VarL, cVar.L(iNextInt))) {
                return false;
            }
        }
        return true;
    }

    private final sr.j c() {
        return this.f149753a.i();
    }

    private final oq.r<zs.f, ft.g<?>> d(us.b.C5222b c5222b, Map<zs.f, ? extends t1> map, ws.d dVar) {
        t1 t1Var = map.get(m0.b(dVar, c5222b.A()));
        if (t1Var == null) {
            return null;
        }
        return new oq.r<>(m0.b(dVar, c5222b.A()), g(t1Var.getType(), c5222b.B(), dVar));
    }

    private final vr.e e(zs.b bVar) {
        return vr.y.d(this.f149753a, bVar, this.f149754b);
    }

    private final ft.g<?> g(st.t0 t0Var, us.b.C5222b.c cVar, ws.d dVar) {
        ft.g<?> gVarF = f(t0Var, cVar, dVar);
        if (!b(gVarF, t0Var, cVar)) {
            gVarF = null;
        }
        if (gVarF != null) {
            return gVarF;
        }
        return ft.l.f66959b.a("Unexpected argument value: actual type " + cVar.Y() + " != expected type " + t0Var);
    }

    public final wr.c a(us.b bVar, ws.d dVar) {
        vr.d dVar2;
        vr.e eVarE = e(m0.a(dVar, bVar.E()));
        Map mapI = pq.v0.i();
        if (bVar.B() != 0 && !ut.l.m(eVarE) && dt.i.t(eVarE) && (dVar2 = (vr.d) pq.v.Q0(eVarE.p())) != null) {
            List<t1> listL = dVar2.l();
            LinkedHashMap linkedHashMap = new LinkedHashMap(lr.m.e(pq.v0.e(pq.v.y(listL, 10)), 16));
            for (Object obj : listL) {
                linkedHashMap.put(((t1) obj).getName(), obj);
            }
            List<us.b.C5222b> listC = bVar.C();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = listC.iterator();
            while (it.hasNext()) {
                oq.r<zs.f, ft.g<?>> rVarD = d((us.b.C5222b) it.next(), linkedHashMap, dVar);
                if (rVarD != null) {
                    arrayList.add(rVarD);
                }
            }
            mapI = pq.v0.s(arrayList);
        }
        return new wr.d(eVarE.t(), mapI, h1.f208052a);
    }

    public final ft.g<?> f(st.t0 t0Var, us.b.C5222b.c cVar, ws.d dVar) {
        boolean zBooleanValue = ws.b.S.d(cVar.U()).booleanValue();
        us.b.C5222b.c.EnumC5225c enumC5225cY = cVar.Y();
        switch (enumC5225cY == null ? -1 : a.f149755a[enumC5225cY.ordinal()]) {
            case 1:
                byte bW = (byte) cVar.W();
                return zBooleanValue ? new ft.b0(bW) : new ft.d(bW);
            case 2:
                return new ft.e((char) cVar.W());
            case 3:
                short sW = (short) cVar.W();
                return zBooleanValue ? new ft.e0(sW) : new ft.x(sW);
            case 4:
                int iW = (int) cVar.W();
                return zBooleanValue ? new ft.c0(iW) : new ft.n(iW);
            case 5:
                long jW = cVar.W();
                return zBooleanValue ? new ft.d0(jW) : new ft.u(jW);
            case 6:
                return new ft.m(cVar.V());
            case 7:
                return new ft.j(cVar.R());
            case 8:
                return new ft.c(cVar.W() != 0);
            case 9:
                return new ft.y(dVar.getString(cVar.X()));
            case 10:
                return new ft.t(m0.a(dVar, cVar.O()), cVar.K());
            case 11:
                return new ft.k(m0.a(dVar, cVar.O()), m0.b(dVar, cVar.T()));
            case 12:
                return new ft.a(a(cVar.J(), dVar));
            case 13:
                ft.i iVar = ft.i.f66956a;
                List<us.b.C5222b.c> listN = cVar.N();
                ArrayList arrayList = new ArrayList(pq.v.y(listN, 10));
                Iterator<T> it = listN.iterator();
                while (it.hasNext()) {
                    arrayList.add(f(c().i(), (us.b.C5222b.c) it.next(), dVar));
                }
                return iVar.b(arrayList, t0Var);
            default:
                throw new IllegalStateException(("Unsupported annotation argument type: " + cVar.Y() + " (expected " + t0Var + ')').toString());
        }
    }
}
