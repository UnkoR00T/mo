package com.google.crypto.tink.shaded.protobuf;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
final class r extends q<y.d> {

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f36174a;

        static {
            int[] iArr = new int[t1.b.values().length];
            f36174a = iArr;
            try {
                iArr[t1.b.f36207c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f36174a[t1.b.f36208d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f36174a[t1.b.f36209e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f36174a[t1.b.f36210f.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f36174a[t1.b.f36211g.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f36174a[t1.b.f36212h.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f36174a[t1.b.f36213j.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f36174a[t1.b.f36214k.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f36174a[t1.b.f36219q.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f36174a[t1.b.f36221s.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f36174a[t1.b.f36222t.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f36174a[t1.b.f36223v.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f36174a[t1.b.f36224w.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f36174a[t1.b.f36220r.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f36174a[t1.b.f36218p.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f36174a[t1.b.f36215l.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f36174a[t1.b.f36216m.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f36174a[t1.b.f36217n.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    r() {
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q
    int a(Map.Entry<?, ?> entry) {
        return ((y.d) entry.getKey()).h();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q
    Object b(p pVar, r0 r0Var, int i15) {
        return pVar.a(r0Var, i15);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q
    u<y.d> c(Object obj) {
        return ((y.c) obj).extensions;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q
    u<y.d> d(Object obj) {
        return ((y.c) obj).V();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q
    boolean e(r0 r0Var) {
        return r0Var instanceof y.c;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q
    void f(Object obj) {
        c(obj).t();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q
    <UT, UB> UB g(Object obj, f1 f1Var, Object obj2, p pVar, u<y.d> uVar, UB ub5, n1<UT, UB> n1Var) {
        Object objValueOf;
        Object objI;
        ArrayList arrayList;
        y.e eVar = (y.e) obj2;
        int iC = eVar.c();
        if (eVar.f36326b.C() && eVar.f36326b.M()) {
            switch (a.f36174a[eVar.a().ordinal()]) {
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
                    ub5 = (UB) i1.z(obj, iC, arrayList, eVar.f36326b.e(), ub5, n1Var);
                    break;
                default:
                    throw new IllegalStateException("Type cannot be packed: " + eVar.f36326b.E());
            }
            uVar.x(eVar.f36326b, arrayList);
            return ub5;
        }
        if (eVar.a() != t1.b.f36220r) {
            switch (a.f36174a[eVar.a().ordinal()]) {
                case 1:
                    objValueOf = Double.valueOf(f1Var.readDouble());
                    break;
                case 2:
                    objValueOf = Float.valueOf(f1Var.readFloat());
                    break;
                case 3:
                    objValueOf = Long.valueOf(f1Var.G());
                    break;
                case 4:
                    objValueOf = Long.valueOf(f1Var.r());
                    break;
                case 5:
                    objValueOf = Integer.valueOf(f1Var.o());
                    break;
                case 6:
                    objValueOf = Long.valueOf(f1Var.a());
                    break;
                case 7:
                    objValueOf = Integer.valueOf(f1Var.t());
                    break;
                case 8:
                    objValueOf = Boolean.valueOf(f1Var.d());
                    break;
                case 9:
                    objValueOf = Integer.valueOf(f1Var.g());
                    break;
                case 10:
                    objValueOf = Integer.valueOf(f1Var.D());
                    break;
                case 11:
                    objValueOf = Long.valueOf(f1Var.e());
                    break;
                case 12:
                    objValueOf = Integer.valueOf(f1Var.k());
                    break;
                case 13:
                    objValueOf = Long.valueOf(f1Var.x());
                    break;
                case 14:
                    throw new IllegalStateException("Shouldn't reach here.");
                case 15:
                    objValueOf = f1Var.n();
                    break;
                case 16:
                    objValueOf = f1Var.y();
                    break;
                case 17:
                    if (!eVar.d()) {
                        Object objI2 = uVar.i(eVar.f36326b);
                        if (objI2 instanceof y) {
                            g1 g1VarD = c1.a().d(objI2);
                            if (!((y) objI2).F()) {
                                Object objD = g1VarD.d();
                                g1VarD.a(objD, objI2);
                                uVar.x(eVar.f36326b, objD);
                                objI2 = objD;
                            }
                            f1Var.I(objI2, g1VarD, pVar);
                            return ub5;
                        }
                    }
                    objValueOf = f1Var.J(eVar.b().getClass(), pVar);
                    break;
                case 18:
                    if (!eVar.d()) {
                        Object objI3 = uVar.i(eVar.f36326b);
                        if (objI3 instanceof y) {
                            g1 g1VarD2 = c1.a().d(objI3);
                            if (!((y) objI3).F()) {
                                Object objD2 = g1VarD2.d();
                                g1VarD2.a(objD2, objI3);
                                uVar.x(eVar.f36326b, objD2);
                                objI3 = objD2;
                            }
                            f1Var.L(objI3, g1VarD2, pVar);
                            return ub5;
                        }
                    }
                    objValueOf = f1Var.N(eVar.b().getClass(), pVar);
                    break;
                default:
                    objValueOf = null;
                    break;
            }
        } else {
            int iO = f1Var.o();
            if (eVar.f36326b.e().a(iO) == null) {
                return (UB) i1.L(obj, iC, iO, ub5, n1Var);
            }
            objValueOf = Integer.valueOf(iO);
        }
        if (eVar.d()) {
            uVar.a(eVar.f36326b, objValueOf);
            return ub5;
        }
        int i15 = a.f36174a[eVar.a().ordinal()];
        if ((i15 == 17 || i15 == 18) && (objI = uVar.i(eVar.f36326b)) != null) {
            objValueOf = a0.h(objI, objValueOf);
        }
        uVar.x(eVar.f36326b, objValueOf);
        return ub5;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q
    void h(f1 f1Var, Object obj, p pVar, u<y.d> uVar) {
        y.e eVar = (y.e) obj;
        uVar.x(eVar.f36326b, f1Var.N(eVar.b().getClass(), pVar));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q
    void i(h hVar, Object obj, p pVar, u<y.d> uVar) {
        y.e eVar = (y.e) obj;
        r0.a aVarG = eVar.b().g();
        i iVarV = hVar.v();
        aVarG.o1(iVarV, pVar);
        uVar.x(eVar.f36326b, aVarG.E());
        iVarV.a(0);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q
    void j(u1 u1Var, Map.Entry<?, ?> entry) {
        y.d dVar = (y.d) entry.getKey();
        if (!dVar.C()) {
            switch (a.f36174a[dVar.E().ordinal()]) {
                case 1:
                    u1Var.p(dVar.h(), ((Double) entry.getValue()).doubleValue());
                    break;
                case 2:
                    u1Var.B(dVar.h(), ((Float) entry.getValue()).floatValue());
                    break;
                case 3:
                    u1Var.u(dVar.h(), ((Long) entry.getValue()).longValue());
                    break;
                case 4:
                    u1Var.f(dVar.h(), ((Long) entry.getValue()).longValue());
                    break;
                case 5:
                    u1Var.h(dVar.h(), ((Integer) entry.getValue()).intValue());
                    break;
                case 6:
                    u1Var.s(dVar.h(), ((Long) entry.getValue()).longValue());
                    break;
                case 7:
                    u1Var.c(dVar.h(), ((Integer) entry.getValue()).intValue());
                    break;
                case 8:
                    u1Var.v(dVar.h(), ((Boolean) entry.getValue()).booleanValue());
                    break;
                case 9:
                    u1Var.o(dVar.h(), ((Integer) entry.getValue()).intValue());
                    break;
                case 10:
                    u1Var.w(dVar.h(), ((Integer) entry.getValue()).intValue());
                    break;
                case 11:
                    u1Var.i(dVar.h(), ((Long) entry.getValue()).longValue());
                    break;
                case 12:
                    u1Var.H(dVar.h(), ((Integer) entry.getValue()).intValue());
                    break;
                case 13:
                    u1Var.m(dVar.h(), ((Long) entry.getValue()).longValue());
                    break;
                case 14:
                    u1Var.h(dVar.h(), ((Integer) entry.getValue()).intValue());
                    break;
                case 15:
                    u1Var.M(dVar.h(), (h) entry.getValue());
                    break;
                case 16:
                    u1Var.e(dVar.h(), (String) entry.getValue());
                    break;
                case 17:
                    u1Var.K(dVar.h(), entry.getValue(), c1.a().c(entry.getValue().getClass()));
                    break;
                case 18:
                    u1Var.N(dVar.h(), entry.getValue(), c1.a().c(entry.getValue().getClass()));
                    break;
            }
        }
        switch (a.f36174a[dVar.E().ordinal()]) {
            case 1:
                i1.P(dVar.h(), (List) entry.getValue(), u1Var, dVar.M());
                break;
            case 2:
                i1.T(dVar.h(), (List) entry.getValue(), u1Var, dVar.M());
                break;
            case 3:
                i1.W(dVar.h(), (List) entry.getValue(), u1Var, dVar.M());
                break;
            case 4:
                i1.e0(dVar.h(), (List) entry.getValue(), u1Var, dVar.M());
                break;
            case 5:
                i1.V(dVar.h(), (List) entry.getValue(), u1Var, dVar.M());
                break;
            case 6:
                i1.S(dVar.h(), (List) entry.getValue(), u1Var, dVar.M());
                break;
            case 7:
                i1.R(dVar.h(), (List) entry.getValue(), u1Var, dVar.M());
                break;
            case 8:
                i1.N(dVar.h(), (List) entry.getValue(), u1Var, dVar.M());
                break;
            case 9:
                i1.d0(dVar.h(), (List) entry.getValue(), u1Var, dVar.M());
                break;
            case 10:
                i1.Y(dVar.h(), (List) entry.getValue(), u1Var, dVar.M());
                break;
            case 11:
                i1.Z(dVar.h(), (List) entry.getValue(), u1Var, dVar.M());
                break;
            case 12:
                i1.a0(dVar.h(), (List) entry.getValue(), u1Var, dVar.M());
                break;
            case 13:
                i1.b0(dVar.h(), (List) entry.getValue(), u1Var, dVar.M());
                break;
            case 14:
                i1.V(dVar.h(), (List) entry.getValue(), u1Var, dVar.M());
                break;
            case 15:
                i1.O(dVar.h(), (List) entry.getValue(), u1Var);
                break;
            case 16:
                i1.c0(dVar.h(), (List) entry.getValue(), u1Var);
                break;
            case 17:
                List list = (List) entry.getValue();
                if (list != null && !list.isEmpty()) {
                    i1.U(dVar.h(), (List) entry.getValue(), u1Var, c1.a().c(list.get(0).getClass()));
                    break;
                }
                break;
            case 18:
                List list2 = (List) entry.getValue();
                if (list2 != null && !list2.isEmpty()) {
                    i1.X(dVar.h(), (List) entry.getValue(), u1Var, c1.a().c(list2.get(0).getClass()));
                    break;
                }
                break;
        }
    }
}
