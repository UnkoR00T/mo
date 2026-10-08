package p080n23;

import er.a;
import er.l;
import f00.d0;
import f00.f0;
import f00.s;
import fr.q0;
import mu.g;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p076m2.r;
import p076m2.t;
import p114t0.f;
import p136y9.d1;
import p136y9.w;
import q23.Setup;
import q23.c;
import u23.p2;
import u23.q;
import xw.b;
import y2.m;
import zx.d;

/* JADX INFO: renamed from: n23.r0, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001d\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/Function0;", "Loq/i0;", "navResult", "o", "(Ler/a;Lm2/r;I)V", "sanitary_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class Function0 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 A(final s sVar, d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(467670973, i15, -1, "pl.gov.coi.mobywatel.feature.sanitary.presentation.SanitaryNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SanitaryNavContent.kt:111)");
        }
        g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: n23.i0
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.B(sVar, (q) obj);
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
    public static final i0 B(s sVar, q qVar) {
        if (!fr.t.c(qVar, q.a.f194855a)) {
            throw new p();
        }
        s.m(sVar, c0.f130837a, null, 2, null);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 C(a aVar, int i15, r rVar, int i16) {
        o(aVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void o(final a<i0> aVar, r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(1818508980);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(1818508980, i16, -1, "pl.gov.coi.mobywatel.feature.sanitary.presentation.SanitaryNavContent (SanitaryNavContent.kt:24)");
            }
            final s sVarJ = f00.r.J(null, rVarH, 0, 1);
            c0 c0Var = c0.f130837a;
            boolean zG = rVarH.G(sVarJ) | ((i16 & 14) == 4);
            Object objE = rVarH.E();
            if (zG || objE == r.INSTANCE.a()) {
                objE = new l() { // from class: n23.l0
                    @Override // er.l
                    public final Object b(Object obj) {
                        return Function0.p(aVar, sVarJ, (d1) obj);
                    }
                };
                rVarH.v(objE);
            }
            d0.j(sVarJ, c0Var, (l) objE, rVarH, s.f54562e | 48);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: n23.m0
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return Function0.C(aVar, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p(final a aVar, final s sVar, d1 d1Var) {
        f00.r.u(d1Var, c0.f130837a, null, m.b(-1400303277, true, new er.r() { // from class: n23.n0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.q(aVar, sVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, f.f130847a, null, m.b(1453511498, true, new er.r() { // from class: n23.o0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.t(sVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, g.f130850a, null, m.b(-697971637, true, new er.r() { // from class: n23.p0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.w(sVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, b0.f130835a, null, m.b(1445512524, true, new er.r() { // from class: n23.q0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.z(sVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(final a aVar, final s sVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-1400303277, i15, -1, "pl.gov.coi.mobywatel.feature.sanitary.presentation.SanitaryNavContent.<anonymous>.<anonymous>.<anonymous> (SanitaryNavContent.kt:33)");
        }
        f00.r.n(wVar, q0.c(a43.q.class), m.d(1478401637, true, new er.q() { // from class: n23.g0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.r(aVar, sVar, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), e.f130841a.g(), rVar, ((i15 >> 3) & 14) | 3456);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r(final a aVar, final s sVar, d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(1478401637, i15, -1, "pl.gov.coi.mobywatel.feature.sanitary.presentation.SanitaryNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SanitaryNavContent.kt:36)");
        }
        g gVarY1 = dVar.Y1();
        boolean zW = rVar.W(aVar) | rVar.G(sVar);
        Object objE = rVar.E();
        if (zW || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: n23.d0
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.s(aVar, sVar, (a43.a.b) obj);
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
    public static final i0 s(a aVar, s sVar, a43.a.b bVar) {
        if (fr.t.c(bVar, a43.a.b.C0044a.f2891a)) {
            aVar.a();
        } else if (fr.t.c(bVar, a43.a.b.c.f2894a)) {
            s.m(sVar, b0.f130835a, null, 2, null);
        } else {
            if (!(bVar instanceof a43.a.b.GoToDetails)) {
                throw new p();
            }
            a43.a.b.GoToDetails goToDetails = (a43.a.b.GoToDetails) bVar;
            s.l(sVar, f.f130847a, new Setup(goToDetails.getId(), goToDetails.getType()), null, 4, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t(final s sVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(1453511498, i15, -1, "pl.gov.coi.mobywatel.feature.sanitary.presentation.SanitaryNavContent.<anonymous>.<anonymous>.<anonymous> (SanitaryNavContent.kt:61)");
        }
        f00.r.o(wVar, q0.c(q23.q.class), sVar.g(f.f130847a), m.d(475669947, true, new er.q() { // from class: n23.f0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.u(sVar, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), e.f130841a.h(), rVar, ((i15 >> 3) & 14) | 27648);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u(final s sVar, d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(475669947, i15, -1, "pl.gov.coi.mobywatel.feature.sanitary.presentation.SanitaryNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SanitaryNavContent.kt:67)");
        }
        g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: n23.k0
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.v(sVar, (c.InterfaceC4071c) obj);
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
    public static final i0 v(s sVar, c.InterfaceC4071c interfaceC4071c) {
        if (fr.t.c(interfaceC4071c, c.InterfaceC4071c.a.f163882a)) {
            sVar.c();
        } else {
            if (!(interfaceC4071c instanceof c.InterfaceC4071c.OpenHistory)) {
                throw new p();
            }
            s.l(sVar, g.f130850a, new s23.Setup(((c.InterfaceC4071c.OpenHistory) interfaceC4071c).a()), null, 4, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w(final s sVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-697971637, i15, -1, "pl.gov.coi.mobywatel.feature.sanitary.presentation.SanitaryNavContent.<anonymous>.<anonymous>.<anonymous> (SanitaryNavContent.kt:86)");
        }
        f00.r.o(wVar, q0.c(s23.m.class), sVar.g(g.f130850a), m.d(-1675813188, true, new er.q() { // from class: n23.h0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.x(sVar, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), e.f130841a.f(), rVar, ((i15 >> 3) & 14) | 27648);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x(final s sVar, d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-1675813188, i15, -1, "pl.gov.coi.mobywatel.feature.sanitary.presentation.SanitaryNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SanitaryNavContent.kt:92)");
        }
        g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: n23.j0
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.y(sVar, (s23.a) obj);
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
    public static final i0 y(s sVar, s23.a aVar) {
        if (!fr.t.c(aVar, s23.a.C4535a.f177695a)) {
            throw new p();
        }
        sVar.c();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z(final s sVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(1445512524, i15, -1, "pl.gov.coi.mobywatel.feature.sanitary.presentation.SanitaryNavContent.<anonymous>.<anonymous>.<anonymous> (SanitaryNavContent.kt:105)");
        }
        f00.r.o(wVar, q0.c(p2.class), sVar.g(b0.f130835a), m.d(467670973, true, new er.q() { // from class: n23.e0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.A(sVar, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), e.f130841a.e(), rVar, ((i15 >> 3) & 14) | 27648);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }
}
