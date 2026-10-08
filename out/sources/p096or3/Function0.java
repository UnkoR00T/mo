package p096or3;

import bt3.u;
import er.l;
import er.p;
import er.q;
import f00.d0;
import f00.f0;
import f00.g0;
import f00.s;
import fr.q0;
import mu.g;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p076m2.r;
import p076m2.t;
import p114t0.f;
import p136y9.d1;
import p136y9.w;
import rr3.o;
import ur3.a;
import ur3.z;
import xw.b;
import y2.m;
import zx.d;

/* JADX INFO: renamed from: or3.n2, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001d\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/Function0;", "Loq/i0;", "navResult", "G", "(Ler/a;Lm2/r;I)V", "zusvisit_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class Function0 {

    /* JADX INFO: renamed from: or3.n2$a */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class a extends fr.a implements er.a<i0> {
        a(Object obj) {
            super(0, obj, s.class, "pop", "pop()Z", 8);
        }

        @Override // er.a
        public /* bridge */ /* synthetic */ i0 a() {
            c();
            return i0.f148189a;
        }

        public final void c() {
            ((s) this.f66376a).c();
        }
    }

    public static final void G(final er.a<i0> aVar, r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(-953918923);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(-953918923, i16, -1, "pl.gov.coi.mobywatel.feature.zusvisit.presentation.ZusNavContent (ZusVisitNavContent.kt:37)");
            }
            final s sVarJ = f00.r.J(null, rVarH, 0, 1);
            w0.d dVar = w0.d.f148807a;
            boolean zG = rVarH.G(sVarJ) | ((i16 & 14) == 4);
            Object objE = rVarH.E();
            if (zG || objE == r.INSTANCE.a()) {
                objE = new l() { // from class: or3.s1
                    @Override // er.l
                    public final Object b(Object obj) {
                        return Function0.H(sVarJ, aVar, (d1) obj);
                    }
                };
                rVarH.v(objE);
            }
            d0.j(sVarJ, dVar, (l) objE, rVarH, s.f54562e | 48);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: or3.d2
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return Function0.m0(aVar, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final i0 H(final s sVar, final er.a aVar, d1 d1Var) {
        f00.r.u(d1Var, w0.d.f148807a, null, m.b(-316661706, true, new er.r() { // from class: or3.g2
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.I(sVar, aVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, w0.i.f148817a, null, m.b(-361447457, true, new er.r() { // from class: or3.h2
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.L(sVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, w0.f.f148811a, null, m.b(-125277634, true, new er.r() { // from class: or3.i2
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.O(sVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, w0.e.f148809a, null, m.b(110892189, true, new er.r() { // from class: or3.j2
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.U(sVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, w0.h.f148815a, null, m.b(347062012, true, new er.r() { // from class: or3.k2
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.X(sVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, w0.b.f148803a, null, m.b(583231835, true, new er.r() { // from class: or3.l2
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.a0(sVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, w0.g.f148813a, null, m.b(819401658, true, new er.r() { // from class: or3.m2
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.d0(sVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.t(d1Var, w0.a.f148801a, new g0.Dialog(null, 1, 0 == true ? 1 : 0), m.b(1055571481, true, new er.r() { // from class: or3.i1
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.g0(sVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }));
        f00.r.u(d1Var, w0.c.f148805a, null, m.b(1291741304, true, new er.r() { // from class: or3.j1
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.j0(sVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 I(final s sVar, final er.a aVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-316661706, i15, -1, "pl.gov.coi.mobywatel.feature.zusvisit.presentation.ZusNavContent.<anonymous>.<anonymous>.<anonymous> (ZusVisitNavContent.kt:45)");
        }
        f00.r.n(wVar, q0.c(z.class), m.d(-343461916, true, new q() { // from class: or3.l1
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.J(sVar, aVar, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), m.f148708a.j(), rVar, ((i15 >> 3) & 14) | 3456);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 J(final s sVar, final er.a aVar, d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-343461916, i15, -1, "pl.gov.coi.mobywatel.feature.zusvisit.presentation.ZusNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ZusVisitNavContent.kt:48)");
        }
        g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar) | rVar.W(aVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: or3.w1
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.K(sVar, aVar, (a.c) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(gVarY1, (l) objE, rVar, b.f221619c);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 K(s sVar, er.a aVar, ur3.a.c cVar) {
        if (cVar instanceof ur3.a.c.GoToNewVisitWizard) {
            s.l(sVar, w0.f.f148811a, ((ur3.a.c.GoToNewVisitWizard) cVar).getNewVisitSetupData(), null, 4, null);
        } else if (cVar instanceof ur3.a.c.GoToVisitDetails) {
            s.l(sVar, w0.h.f148815a, ((ur3.a.c.GoToVisitDetails) cVar).getVisitDetailsSetupData(), null, 4, null);
        } else if (cVar instanceof ur3.a.c.C5218c) {
            s.m(sVar, w0.i.f148817a, null, 2, null);
        } else if (cVar instanceof ur3.a.c.C5217a) {
            aVar.a();
        } else {
            if (!(cVar instanceof ur3.a.c.Error)) {
                throw new oq.p();
            }
            s.l(sVar, w0.c.f148805a, ((ur3.a.c.Error) cVar).getErrorData(), null, 4, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 L(final s sVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-361447457, i15, -1, "pl.gov.coi.mobywatel.feature.zusvisit.presentation.ZusNavContent.<anonymous>.<anonymous>.<anonymous> (ZusVisitNavContent.kt:81)");
        }
        f00.r.n(wVar, q0.c(o.class), m.d(-346645491, true, new q() { // from class: or3.q1
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.M(sVar, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), m.f148708a.g(), rVar, ((i15 >> 3) & 14) | 3456);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 M(final s sVar, d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-346645491, i15, -1, "pl.gov.coi.mobywatel.feature.zusvisit.presentation.ZusNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ZusVisitNavContent.kt:84)");
        }
        g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: or3.c2
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.N(sVar, (rr3.b) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(gVarY1, (l) objE, rVar, b.f221619c);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 N(s sVar, rr3.b bVar) {
        if (!fr.t.c(bVar, rr3.b.a.f175566a)) {
            throw new oq.p();
        }
        sVar.c();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 O(final s sVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-125277634, i15, -1, "pl.gov.coi.mobywatel.feature.zusvisit.presentation.ZusNavContent.<anonymous>.<anonymous>.<anonymous> (ZusVisitNavContent.kt:97)");
        }
        f00.r.o(wVar, q0.c(zr3.w.class), sVar.g(w0.f.f148811a), m.d(466720045, true, new q() { // from class: or3.m1
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.P(sVar, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), m.d(40054555, true, new q() { // from class: or3.n1
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.R(sVar, (zr3.w) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, ((i15 >> 3) & 14) | 27648);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 P(final s sVar, d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(466720045, i15, -1, "pl.gov.coi.mobywatel.feature.zusvisit.presentation.ZusNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ZusVisitNavContent.kt:101)");
        }
        g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: or3.z1
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.Q(sVar, (zr3.m) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(gVarY1, (l) objE, rVar, b.f221619c);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 Q(s sVar, zr3.m mVar) {
        if (mVar instanceof zr3.m.a) {
            sVar.c();
        } else if (mVar instanceof zr3.m.ToOutro) {
            s.l(sVar, w0.e.f148809a, ((zr3.m.ToOutro) mVar).getData(), null, 4, null);
        } else {
            if (!(mVar instanceof zr3.m.d)) {
                throw new oq.p();
            }
            s.m(sVar, w0.g.f148813a, null, 2, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 R(final s sVar, final zr3.w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(40054555, i15, -1, "pl.gov.coi.mobywatel.feature.zusvisit.presentation.ZusNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ZusVisitNavContent.kt:119)");
        }
        zr3.t.d(wVar, m.d(-408139285, true, new p() { // from class: or3.v1
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return Function0.S(sVar, wVar, (r) obj, ((Integer) obj2).intValue());
            }
        }, rVar, 54), rVar, (i15 & 14) | 48);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 S(final s sVar, zr3.w wVar, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(-408139285, i15, -1, "pl.gov.coi.mobywatel.feature.zusvisit.presentation.ZusNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ZusVisitNavContent.kt:120)");
            }
            boolean zG = rVar.G(sVar);
            Object objE = rVar.E();
            if (zG || objE == r.INSTANCE.a()) {
                objE = new a(sVar);
                rVar.v(objE);
            }
            er.a aVar = (er.a) objE;
            boolean zG2 = rVar.G(sVar);
            Object objE2 = rVar.E();
            if (zG2 || objE2 == r.INSTANCE.a()) {
                objE2 = new l() { // from class: or3.h1
                    @Override // er.l
                    public final Object b(Object obj) {
                        return Function0.T(sVar, (jb4.b) obj);
                    }
                };
                rVar.v(objE2);
            }
            C6464v0.L(aVar, (l) objE2, wVar, rVar, 0);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 T(s sVar, jb4.b bVar) {
        s.l(sVar, w0.c.f148805a, bVar, null, 4, null);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 U(final s sVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(110892189, i15, -1, "pl.gov.coi.mobywatel.feature.zusvisit.presentation.ZusNavContent.<anonymous>.<anonymous>.<anonymous> (ZusVisitNavContent.kt:136)");
        }
        f00.r.o(wVar, q0.c(xr3.p.class), sVar.g(w0.e.f148809a), m.d(702889868, true, new q() { // from class: or3.p1
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.V(sVar, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), m.f148708a.k(), rVar, ((i15 >> 3) & 14) | 27648);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 V(final s sVar, d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(702889868, i15, -1, "pl.gov.coi.mobywatel.feature.zusvisit.presentation.ZusNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ZusVisitNavContent.kt:140)");
        }
        g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: or3.y1
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.W(sVar, (xr3.f) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(gVarY1, (l) objE, rVar, b.f221619c);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 W(s sVar, xr3.f fVar) {
        if (fVar instanceof xr3.f.EnterDetails) {
            s.l(sVar, w0.h.f148815a, ((xr3.f.EnterDetails) fVar).getVisitDetailsSetupData(), null, 4, null);
        } else {
            if (!(fVar instanceof xr3.f.a)) {
                throw new oq.p();
            }
            s.m(sVar, w0.d.f148807a, null, 2, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 X(final s sVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(347062012, i15, -1, "pl.gov.coi.mobywatel.feature.zusvisit.presentation.ZusNavContent.<anonymous>.<anonymous>.<anonymous> (ZusVisitNavContent.kt:160)");
        }
        f00.r.o(wVar, q0.c(u.class), sVar.g(w0.h.f148815a), m.d(939059691, true, new q() { // from class: or3.t1
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.Y(sVar, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), m.f148708a.i(), rVar, ((i15 >> 3) & 14) | 27648);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 Y(final s sVar, d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(939059691, i15, -1, "pl.gov.coi.mobywatel.feature.zusvisit.presentation.ZusNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ZusVisitNavContent.kt:164)");
        }
        g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: or3.a2
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.Z(sVar, (bt3.a.e) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(gVarY1, (l) objE, rVar, b.f221619c);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 Z(s sVar, bt3.a.e eVar) {
        if (eVar instanceof bt3.a.e.C0564a) {
            s.m(sVar, w0.d.f148807a, null, 2, null);
        } else if (eVar instanceof bt3.a.e.RedoVisit) {
            s.l(sVar, w0.f.f148811a, ((bt3.a.e.RedoVisit) eVar).getNewVisitSetupData(), null, 4, null);
        } else if (eVar instanceof bt3.a.e.ShowNavigationDialog) {
            s.l(sVar, w0.a.f148801a, ((bt3.a.e.ShowNavigationDialog) eVar).getDialog(), null, 4, null);
        } else if (eVar instanceof bt3.a.e.Error) {
            s.l(sVar, w0.c.f148805a, ((bt3.a.e.Error) eVar).getError(), null, 4, null);
        } else {
            if (!fr.t.c(eVar, bt3.a.e.c.f21575a)) {
                throw new oq.p();
            }
            s.m(sVar, w0.b.f148803a, null, 2, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 a0(final s sVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(583231835, i15, -1, "pl.gov.coi.mobywatel.feature.zusvisit.presentation.ZusNavContent.<anonymous>.<anonymous>.<anonymous> (ZusVisitNavContent.kt:198)");
        }
        f00.r.n(wVar, q0.c(pr3.l.class), m.d(598033801, true, new q() { // from class: or3.k1
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.b0(sVar, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), m.f148708a.l(), rVar, ((i15 >> 3) & 14) | 3456);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 b0(final s sVar, d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(598033801, i15, -1, "pl.gov.coi.mobywatel.feature.zusvisit.presentation.ZusNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ZusVisitNavContent.kt:201)");
        }
        g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: or3.e2
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.c0(sVar, (pr3.b) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(gVarY1, (l) objE, rVar, b.f221619c);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 c0(s sVar, pr3.b bVar) {
        if (!fr.t.c(bVar, pr3.b.a.f162177a)) {
            throw new oq.p();
        }
        sVar.c();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 d0(final s sVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(819401658, i15, -1, "pl.gov.coi.mobywatel.feature.zusvisit.presentation.ZusNavContent.<anonymous>.<anonymous>.<anonymous> (ZusVisitNavContent.kt:214)");
        }
        f00.r.n(wVar, q0.c(zs3.o.class), m.d(834203624, true, new q() { // from class: or3.u1
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.e0(sVar, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), m.f148708a.h(), rVar, ((i15 >> 3) & 14) | 3456);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 e0(final s sVar, d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(834203624, i15, -1, "pl.gov.coi.mobywatel.feature.zusvisit.presentation.ZusNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ZusVisitNavContent.kt:217)");
        }
        g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: or3.f2
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.f0(sVar, (zs3.b) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(gVarY1, (l) objE, rVar, b.f221619c);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f0(s sVar, zs3.b bVar) {
        if (!fr.t.c(bVar, zs3.b.a.f237150a)) {
            throw new oq.p();
        }
        sVar.c();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 g0(final s sVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(1055571481, i15, -1, "pl.gov.coi.mobywatel.feature.zusvisit.presentation.ZusNavContent.<anonymous>.<anonymous>.<anonymous> (ZusVisitNavContent.kt:233)");
        }
        w0.a aVar = w0.a.f148801a;
        f00.r.r(wVar, aVar, sVar.g(aVar), m.d(-1160644818, true, new q() { // from class: or3.o1
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.h0(sVar, (cb4.f) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, ((i15 >> 3) & 14) | 3120);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h0(final s sVar, cb4.f fVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-1160644818, i15, -1, "pl.gov.coi.mobywatel.feature.zusvisit.presentation.ZusNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ZusVisitNavContent.kt:237)");
        }
        b<cb4.f.a> bVarY1 = fVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: or3.b2
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.i0(sVar, (cb4.f.a) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(bVarY1, (l) objE, rVar, b.f221619c);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i0(s sVar, cb4.f.a aVar) {
        if (!fr.t.c(aVar, cb4.f.a.C0669a.f24980a)) {
            throw new oq.p();
        }
        sVar.c();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j0(final s sVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(1291741304, i15, -1, "pl.gov.coi.mobywatel.feature.zusvisit.presentation.ZusNavContent.<anonymous>.<anonymous>.<anonymous> (ZusVisitNavContent.kt:247)");
        }
        w0.c cVar = w0.c.f148805a;
        f00.r.r(wVar, cVar, sVar.g(cVar), m.d(-1726603785, true, new q() { // from class: or3.r1
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.k0(sVar, (hb4.b) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, ((i15 >> 3) & 14) | 3120);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k0(final s sVar, hb4.b bVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-1726603785, i15, -1, "pl.gov.coi.mobywatel.feature.zusvisit.presentation.ZusNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ZusVisitNavContent.kt:251)");
        }
        b<hb4.b.a> bVarY1 = bVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: or3.x1
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.l0(sVar, (hb4.b.a) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(bVarY1, (l) objE, rVar, b.f221619c);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l0(s sVar, hb4.b.a aVar) {
        if (!fr.t.c(aVar, hb4.b.a.C1910a.f83033a)) {
            throw new oq.p();
        }
        sVar.c();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m0(er.a aVar, int i15, r rVar, int i16) {
        G(aVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
