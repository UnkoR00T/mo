package androidx.datastore.preferences.protobuf;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class q extends p<x.d> {

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f12065a;

        static {
            int[] iArr = new int[s1.b.values().length];
            f12065a = iArr;
            try {
                iArr[s1.b.f12097c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12065a[s1.b.f12098d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12065a[s1.b.f12099e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f12065a[s1.b.f12100f.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f12065a[s1.b.f12101g.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f12065a[s1.b.f12102h.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f12065a[s1.b.f12103j.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f12065a[s1.b.f12104k.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f12065a[s1.b.f12109q.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f12065a[s1.b.f12111s.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f12065a[s1.b.f12112t.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f12065a[s1.b.f12113v.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f12065a[s1.b.f12114w.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f12065a[s1.b.f12110r.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f12065a[s1.b.f12108p.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f12065a[s1.b.f12105l.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f12065a[s1.b.f12106m.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f12065a[s1.b.f12107n.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    q() {
    }

    @Override // androidx.datastore.preferences.protobuf.p
    int a(Map.Entry<?, ?> entry) {
        return ((x.d) entry.getKey()).h();
    }

    @Override // androidx.datastore.preferences.protobuf.p
    Object b(o oVar, r0 r0Var, int i15) {
        return oVar.a(r0Var, i15);
    }

    @Override // androidx.datastore.preferences.protobuf.p
    t<x.d> c(Object obj) {
        return ((x.c) obj).extensions;
    }

    @Override // androidx.datastore.preferences.protobuf.p
    t<x.d> d(Object obj) {
        return ((x.c) obj).T();
    }

    @Override // androidx.datastore.preferences.protobuf.p
    boolean e(r0 r0Var) {
        return r0Var instanceof x.c;
    }

    @Override // androidx.datastore.preferences.protobuf.p
    void f(Object obj) {
        c(obj).u();
    }

    @Override // androidx.datastore.preferences.protobuf.p
    <UT, UB> UB g(Object obj, f1 f1Var, Object obj2, o oVar, t<x.d> tVar, UB ub5, n1<UT, UB> n1Var) {
        Object objI;
        ArrayList arrayList;
        x.e eVar = (x.e) obj2;
        int iC = eVar.c();
        if (eVar.f12213b.C() && eVar.f12213b.M()) {
            switch (a.f12065a[eVar.a().ordinal()]) {
                case 1:
                    arrayList = new ArrayList();
                    f1Var.F(arrayList);
                    break;
                case 2:
                    arrayList = new ArrayList();
                    f1Var.B(arrayList);
                    break;
                case 3:
                    arrayList = new ArrayList();
                    f1Var.h(arrayList);
                    break;
                case 4:
                    arrayList = new ArrayList();
                    f1Var.f(arrayList);
                    break;
                case 5:
                    arrayList = new ArrayList();
                    f1Var.v(arrayList);
                    break;
                case 6:
                    arrayList = new ArrayList();
                    f1Var.p(arrayList);
                    break;
                case 7:
                    arrayList = new ArrayList();
                    f1Var.w(arrayList);
                    break;
                case 8:
                    arrayList = new ArrayList();
                    f1Var.l(arrayList);
                    break;
                case 9:
                    arrayList = new ArrayList();
                    f1Var.s(arrayList);
                    break;
                case 10:
                    arrayList = new ArrayList();
                    f1Var.b(arrayList);
                    break;
                case 11:
                    arrayList = new ArrayList();
                    f1Var.u(arrayList);
                    break;
                case 12:
                    arrayList = new ArrayList();
                    f1Var.q(arrayList);
                    break;
                case 13:
                    arrayList = new ArrayList();
                    f1Var.c(arrayList);
                    break;
                case 14:
                    arrayList = new ArrayList();
                    f1Var.i(arrayList);
                    eVar.f12213b.e();
                    ub5 = (UB) i1.z(obj, iC, arrayList, null, ub5, n1Var);
                    break;
                default:
                    throw new IllegalStateException("Type cannot be packed: " + eVar.f12213b.E());
            }
            tVar.y(eVar.f12213b, arrayList);
            return ub5;
        }
        Object objG = null;
        if (eVar.a() == s1.b.f12110r) {
            f1Var.o();
            eVar.f12213b.e();
            throw null;
        }
        int[] iArr = a.f12065a;
        switch (iArr[eVar.a().ordinal()]) {
            case 1:
                objG = Double.valueOf(f1Var.readDouble());
                break;
            case 2:
                objG = Float.valueOf(f1Var.readFloat());
                break;
            case 3:
                objG = Long.valueOf(f1Var.G());
                break;
            case 4:
                objG = Long.valueOf(f1Var.r());
                break;
            case 5:
                objG = Integer.valueOf(f1Var.o());
                break;
            case 6:
                objG = Long.valueOf(f1Var.a());
                break;
            case 7:
                objG = Integer.valueOf(f1Var.t());
                break;
            case 8:
                objG = Boolean.valueOf(f1Var.d());
                break;
            case 9:
                objG = Integer.valueOf(f1Var.g());
                break;
            case 10:
                objG = Integer.valueOf(f1Var.D());
                break;
            case 11:
                objG = Long.valueOf(f1Var.e());
                break;
            case 12:
                objG = Integer.valueOf(f1Var.k());
                break;
            case 13:
                objG = Long.valueOf(f1Var.x());
                break;
            case 14:
                throw new IllegalStateException("Shouldn't reach here.");
            case 15:
                objG = f1Var.n();
                break;
            case 16:
                objG = f1Var.y();
                break;
            case 17:
                if (!eVar.d()) {
                    Object objI2 = tVar.i(eVar.f12213b);
                    if (objI2 instanceof x) {
                        g1 g1VarD = c1.a().d(objI2);
                        if (!((x) objI2).H()) {
                            Object objD = g1VarD.d();
                            g1VarD.a(objD, objI2);
                            tVar.y(eVar.f12213b, objD);
                            objI2 = objD;
                        }
                        f1Var.N(objI2, g1VarD, oVar);
                        return ub5;
                    }
                }
                objG = f1Var.L(eVar.b().getClass(), oVar);
                break;
            case 18:
                if (!eVar.d()) {
                    Object objI3 = tVar.i(eVar.f12213b);
                    if (objI3 instanceof x) {
                        g1 g1VarD2 = c1.a().d(objI3);
                        if (!((x) objI3).H()) {
                            Object objD2 = g1VarD2.d();
                            g1VarD2.a(objD2, objI3);
                            tVar.y(eVar.f12213b, objD2);
                            objI3 = objD2;
                        }
                        f1Var.I(objI3, g1VarD2, oVar);
                        return ub5;
                    }
                }
                objG = f1Var.K(eVar.b().getClass(), oVar);
                break;
        }
        if (eVar.d()) {
            tVar.a(eVar.f12213b, objG);
            return ub5;
        }
        int i15 = iArr[eVar.a().ordinal()];
        if ((i15 == 17 || i15 == 18) && (objI = tVar.i(eVar.f12213b)) != null) {
            objG = z.g(objI, objG);
        }
        tVar.y(eVar.f12213b, objG);
        return ub5;
    }

    @Override // androidx.datastore.preferences.protobuf.p
    void h(f1 f1Var, Object obj, o oVar, t<x.d> tVar) {
        x.e eVar = (x.e) obj;
        tVar.y(eVar.f12213b, f1Var.K(eVar.b().getClass(), oVar));
    }

    @Override // androidx.datastore.preferences.protobuf.p
    void i(g gVar, Object obj, o oVar, t<x.d> tVar) {
        x.e eVar = (x.e) obj;
        r0.a aVarG = eVar.b().g();
        h hVarU = gVar.u();
        aVarG.Y0(hVarU, oVar);
        tVar.y(eVar.f12213b, aVarG.E());
        hVarU.a(0);
    }

    @Override // androidx.datastore.preferences.protobuf.p
    void j(t1 t1Var, Map.Entry<?, ?> entry) {
        x.d dVar = (x.d) entry.getKey();
        if (!dVar.C()) {
            switch (a.f12065a[dVar.E().ordinal()]) {
                case 1:
                    t1Var.p(dVar.h(), ((Double) entry.getValue()).doubleValue());
                    break;
                case 2:
                    t1Var.B(dVar.h(), ((Float) entry.getValue()).floatValue());
                    break;
                case 3:
                    t1Var.u(dVar.h(), ((Long) entry.getValue()).longValue());
                    break;
                case 4:
                    t1Var.f(dVar.h(), ((Long) entry.getValue()).longValue());
                    break;
                case 5:
                    t1Var.h(dVar.h(), ((Integer) entry.getValue()).intValue());
                    break;
                case 6:
                    t1Var.s(dVar.h(), ((Long) entry.getValue()).longValue());
                    break;
                case 7:
                    t1Var.c(dVar.h(), ((Integer) entry.getValue()).intValue());
                    break;
                case 8:
                    t1Var.v(dVar.h(), ((Boolean) entry.getValue()).booleanValue());
                    break;
                case 9:
                    t1Var.o(dVar.h(), ((Integer) entry.getValue()).intValue());
                    break;
                case 10:
                    t1Var.w(dVar.h(), ((Integer) entry.getValue()).intValue());
                    break;
                case 11:
                    t1Var.i(dVar.h(), ((Long) entry.getValue()).longValue());
                    break;
                case 12:
                    t1Var.H(dVar.h(), ((Integer) entry.getValue()).intValue());
                    break;
                case 13:
                    t1Var.m(dVar.h(), ((Long) entry.getValue()).longValue());
                    break;
                case 14:
                    t1Var.h(dVar.h(), ((Integer) entry.getValue()).intValue());
                    break;
                case 15:
                    t1Var.K(dVar.h(), (g) entry.getValue());
                    break;
                case 16:
                    t1Var.e(dVar.h(), (String) entry.getValue());
                    break;
                case 17:
                    t1Var.N(dVar.h(), entry.getValue(), c1.a().c(entry.getValue().getClass()));
                    break;
                case 18:
                    t1Var.L(dVar.h(), entry.getValue(), c1.a().c(entry.getValue().getClass()));
                    break;
            }
        }
        switch (a.f12065a[dVar.E().ordinal()]) {
            case 1:
                i1.O(dVar.h(), (List) entry.getValue(), t1Var, dVar.M());
                break;
            case 2:
                i1.S(dVar.h(), (List) entry.getValue(), t1Var, dVar.M());
                break;
            case 3:
                i1.V(dVar.h(), (List) entry.getValue(), t1Var, dVar.M());
                break;
            case 4:
                i1.d0(dVar.h(), (List) entry.getValue(), t1Var, dVar.M());
                break;
            case 5:
                i1.U(dVar.h(), (List) entry.getValue(), t1Var, dVar.M());
                break;
            case 6:
                i1.R(dVar.h(), (List) entry.getValue(), t1Var, dVar.M());
                break;
            case 7:
                i1.Q(dVar.h(), (List) entry.getValue(), t1Var, dVar.M());
                break;
            case 8:
                i1.M(dVar.h(), (List) entry.getValue(), t1Var, dVar.M());
                break;
            case 9:
                i1.c0(dVar.h(), (List) entry.getValue(), t1Var, dVar.M());
                break;
            case 10:
                i1.X(dVar.h(), (List) entry.getValue(), t1Var, dVar.M());
                break;
            case 11:
                i1.Y(dVar.h(), (List) entry.getValue(), t1Var, dVar.M());
                break;
            case 12:
                i1.Z(dVar.h(), (List) entry.getValue(), t1Var, dVar.M());
                break;
            case 13:
                i1.a0(dVar.h(), (List) entry.getValue(), t1Var, dVar.M());
                break;
            case 14:
                i1.U(dVar.h(), (List) entry.getValue(), t1Var, dVar.M());
                break;
            case 15:
                i1.N(dVar.h(), (List) entry.getValue(), t1Var);
                break;
            case 16:
                i1.b0(dVar.h(), (List) entry.getValue(), t1Var);
                break;
            case 17:
                List list = (List) entry.getValue();
                if (list != null && !list.isEmpty()) {
                    i1.T(dVar.h(), (List) entry.getValue(), t1Var, c1.a().c(list.get(0).getClass()));
                    break;
                }
                break;
            case 18:
                List list2 = (List) entry.getValue();
                if (list2 != null && !list2.isEmpty()) {
                    i1.W(dVar.h(), (List) entry.getValue(), t1Var, c1.a().c(list2.get(0).getClass()));
                    break;
                }
                break;
        }
    }
}
