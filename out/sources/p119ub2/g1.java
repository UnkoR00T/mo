package p119ub2;

import al0.BEContactDetailsData;
import androidx.p016lifecycle.h;
import androidx.p016lifecycle.y0;
import dc2.u;
import er.l;
import er.q;
import f00.d0;
import f00.f0;
import f00.g0;
import f00.s;
import fr.q0;
import gc2.e;
import ip.a;
import jc2.c;
import jc2.e0;
import mu.g;
import nc2.b;
import nc2.y;
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
import p7.CreationExtras;
import wb2.k;
import y2.m;
import yb2.o;
import zx.d;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a%\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ltc2/a;", "dataSourceContract", "Lkotlin/Function0;", "Loq/i0;", "exitProcess", a.f96137b, "(Ltc2/a;Ler/a;Lm2/r;I)V", "identitycardinvalidation_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class g1 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 A0(s sVar, p115tc2.a aVar, ru3.a.AbstractC4497a abstractC4497a) {
        if (abstractC4497a instanceof ru3.a.AbstractC4497a.Back) {
            sVar.c();
        } else if (abstractC4497a instanceof ru3.a.AbstractC4497a.Close) {
            L0(aVar, sVar);
        } else {
            if (!(abstractC4497a instanceof ru3.a.AbstractC4497a.Next)) {
                throw new p();
            }
            ru3.a.AbstractC4497a.Next next = (ru3.a.AbstractC4497a.Next) abstractC4497a;
            aVar.j6(new BEContactDetailsData(next.getContactDetailsData().getPhoneNumber(), next.getContactDetailsData().getEmailAddress()));
            s.m(sVar, h1.l.f197346b, null, 2, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 B0(final p115tc2.a aVar, final s sVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(1342454446, i15, -1, "pl.gov.coi.mobywatel.feature.identitycardinvalidation.presentation.NestedNavContent.<anonymous>.<anonymous>.<anonymous> (NestedNavContent.kt:226)");
        }
        f00.r.o(wVar, q0.c(y.class), aVar, m.d(623827485, true, new q() { // from class: ub2.w
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return g1.C0(sVar, aVar, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), h.f197324a.j(), rVar, ((i15 >> 3) & 14) | 27648);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 C0(final s sVar, final p115tc2.a aVar, d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(623827485, i15, -1, "pl.gov.coi.mobywatel.feature.identitycardinvalidation.presentation.NestedNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NestedNavContent.kt:231)");
        }
        g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar) | rVar.G(aVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: ub2.t0
                @Override // er.l
                public final Object b(Object obj) {
                    return g1.D0(sVar, aVar, (b.InterfaceC3327b) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(gVarY1, (l) objE, rVar, xw.b.f221619c);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 D0(s sVar, p115tc2.a aVar, b.InterfaceC3327b interfaceC3327b) {
        if (interfaceC3327b instanceof b.InterfaceC3327b.ShowDialog) {
            s.l(sVar, h1.c.f197337b, ((b.InterfaceC3327b.ShowDialog) interfaceC3327b).getData(), null, 4, null);
        } else if (interfaceC3327b instanceof b.InterfaceC3327b.ShowError) {
            s.l(sVar, h1.e.f197339b, ((b.InterfaceC3327b.ShowError) interfaceC3327b).getData(), null, 4, null);
        } else if (interfaceC3327b instanceof b.InterfaceC3327b.ShowImagePreview) {
            s.l(sVar, h1.f.f197340b, ((b.InterfaceC3327b.ShowImagePreview) interfaceC3327b).getData(), null, 4, null);
        } else if (fr.t.c(interfaceC3327b, b.InterfaceC3327b.a.f134029a)) {
            sVar.c();
        } else if (fr.t.c(interfaceC3327b, b.InterfaceC3327b.C3328b.f134030a)) {
            L0(aVar, sVar);
        } else {
            if (!(interfaceC3327b instanceof b.InterfaceC3327b.ContactDetails)) {
                throw new p();
            }
            s.l(sVar, h1.a.f197335b, ((b.InterfaceC3327b.ContactDetails) interfaceC3327b).getModel(), null, 4, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 E0(final p115tc2.a aVar, final s sVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-833461875, i15, -1, "pl.gov.coi.mobywatel.feature.identitycardinvalidation.presentation.NestedNavContent.<anonymous>.<anonymous>.<anonymous> (NestedNavContent.kt:262)");
        }
        f00.r.o(wVar, q0.c(e0.class), aVar, m.d(-1552088836, true, new q() { // from class: ub2.f0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return g1.F0(sVar, aVar, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), h.f197324a.m(), rVar, ((i15 >> 3) & 14) | 27648);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 F0(final s sVar, final p115tc2.a aVar, d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-1552088836, i15, -1, "pl.gov.coi.mobywatel.feature.identitycardinvalidation.presentation.NestedNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NestedNavContent.kt:267)");
        }
        g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar) | rVar.G(aVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: ub2.u0
                @Override // er.l
                public final Object b(Object obj) {
                    return g1.G0(sVar, aVar, (c.InterfaceC2399c) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(gVarY1, (l) objE, rVar, xw.b.f221619c);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 G0(s sVar, p115tc2.a aVar, c.InterfaceC2399c interfaceC2399c) {
        if (fr.t.c(interfaceC2399c, c.InterfaceC2399c.d.f101440a)) {
            s.m(sVar, h1.k.f197345b, null, 2, null);
        } else if (interfaceC2399c instanceof c.InterfaceC2399c.EdorAuth) {
            s.l(sVar, h1.d.f197338b, ((c.InterfaceC2399c.EdorAuth) interfaceC2399c).getData(), null, 4, null);
        } else if (fr.t.c(interfaceC2399c, c.InterfaceC2399c.a.f101437a)) {
            sVar.c();
        } else {
            if (!fr.t.c(interfaceC2399c, c.InterfaceC2399c.b.f101438a)) {
                throw new p();
            }
            L0(aVar, sVar);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 H0(p115tc2.a aVar, final er.a aVar2, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(1285589100, i15, -1, "pl.gov.coi.mobywatel.feature.identitycardinvalidation.presentation.NestedNavContent.<anonymous>.<anonymous>.<anonymous> (NestedNavContent.kt:285)");
        }
        f00.r.o(wVar, q0.c(gc2.p.class), aVar, m.d(566962139, true, new q() { // from class: ub2.g0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return g1.I0(aVar2, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), h.f197324a.l(), rVar, ((i15 >> 3) & 14) | 27648);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 I0(final er.a aVar, d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(566962139, i15, -1, "pl.gov.coi.mobywatel.feature.identitycardinvalidation.presentation.NestedNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NestedNavContent.kt:290)");
        }
        g gVarY1 = dVar.Y1();
        boolean zW = rVar.W(aVar);
        Object objE = rVar.E();
        if (zW || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: ub2.m0
                @Override // er.l
                public final Object b(Object obj) {
                    return g1.J0(aVar, (e) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(gVarY1, (l) objE, rVar, xw.b.f221619c);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 J0(er.a aVar, e eVar) {
        if (!fr.t.c(eVar, e.a.f71777a)) {
            throw new p();
        }
        aVar.a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 K0(p115tc2.a aVar, er.a aVar2, int i15, r rVar, int i16) {
        S(aVar, aVar2, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private static final void L0(p115tc2.a aVar, s sVar) {
        aVar.clear();
        s.m(sVar, h1.n.f197348b, null, 2, null);
    }

    public static final void S(final p115tc2.a aVar, final er.a<i0> aVar2, r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(1526397130);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(aVar) : rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(aVar2) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (t.k()) {
                t.o(1526397130, i16, -1, "pl.gov.coi.mobywatel.feature.identitycardinvalidation.presentation.NestedNavContent (NestedNavContent.kt:48)");
            }
            final s sVarJ = f00.r.J(null, rVarH, 0, 1);
            h1.n nVar = h1.n.f197348b;
            boolean zG = ((i16 & 14) == 4 || ((i16 & 8) != 0 && rVarH.G(aVar))) | ((i16 & 112) == 32) | rVarH.G(sVarJ);
            Object objE = rVarH.E();
            if (zG || objE == r.INSTANCE.a()) {
                objE = new l() { // from class: ub2.y0
                    @Override // er.l
                    public final Object b(Object obj) {
                        return g1.T(aVar, aVar2, sVarJ, (d1) obj);
                    }
                };
                rVarH.v(objE);
            }
            d0.j(sVarJ, nVar, (l) objE, rVarH, s.f54562e | 48);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: ub2.z0
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return g1.K0(aVar, aVar2, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 T(final p115tc2.a aVar, final er.a aVar2, final s sVar, d1 d1Var) {
        f00.r.u(d1Var, h1.n.f197348b, null, m.b(1085510219, true, new er.r() { // from class: ub2.o
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return g1.U(aVar, aVar2, sVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, h1.g.f197341b, null, m.b(1513050484, true, new er.r() { // from class: ub2.b1
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return g1.X(aVar, aVar2, sVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, h1.i.f197343b, null, m.b(-662865837, true, new er.r() { // from class: ub2.c1
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return g1.m0(sVar, aVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, h1.j.f197344b, null, m.b(1456185138, true, new er.r() { // from class: ub2.d1
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return g1.p0(sVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, h1.d.f197338b, null, m.b(-719731183, true, new er.r() { // from class: ub2.e1
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return g1.s0(sVar, aVar2, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, h1.h.f197342b, null, m.b(1399319792, true, new er.r() { // from class: ub2.f1
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return g1.v0(aVar, sVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, h1.a.f197335b, null, m.b(-776596529, true, new er.r() { // from class: ub2.p
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return g1.y0(sVar, aVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, h1.m.f197347b, null, m.b(1342454446, true, new er.r() { // from class: ub2.q
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return g1.B0(aVar, sVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, h1.l.f197346b, null, m.b(-833461875, true, new er.r() { // from class: ub2.r
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return g1.E0(aVar, sVar, (f) obj, (w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, h1.k.f197345b, null, m.b(1285589100, true, new er.r() { // from class: ub2.s
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return g1.H0(aVar, aVar2, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, h1.f.f197340b, null, m.b(-470545292, true, new er.r() { // from class: ub2.z
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return g1.a0(sVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, h1.e.f197339b, null, m.b(1648505683, true, new er.r() { // from class: ub2.k0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return g1.d0(sVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.t(d1Var, h1.c.f197337b, new g0.Dialog(null, 1, null), m.b(-527410638, true, new er.r() { // from class: ub2.v0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return g1.g0(sVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }));
        f00.r.u(d1Var, h1.b.f197336b, null, m.b(1591640337, true, new er.r() { // from class: ub2.a1
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return g1.j0(sVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 U(p115tc2.a aVar, final er.a aVar2, final s sVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(1085510219, i15, -1, "pl.gov.coi.mobywatel.feature.identitycardinvalidation.presentation.NestedNavContent.<anonymous>.<anonymous>.<anonymous> (NestedNavContent.kt:63)");
        }
        f00.r.o(wVar, q0.c(qc2.r.class), aVar, m.d(-443727494, true, new q() { // from class: ub2.b0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return g1.V(aVar2, sVar, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), h.f197324a.h(), rVar, ((i15 >> 3) & 14) | 27648);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 V(final er.a aVar, final s sVar, d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-443727494, i15, -1, "pl.gov.coi.mobywatel.feature.identitycardinvalidation.presentation.NestedNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NestedNavContent.kt:68)");
        }
        g gVarY1 = dVar.Y1();
        boolean zW = rVar.W(aVar) | rVar.G(sVar);
        Object objE = rVar.E();
        if (zW || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: ub2.q0
                @Override // er.l
                public final Object b(Object obj) {
                    return g1.W(aVar, sVar, (qc2.a.InterfaceC4147a) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(gVarY1, (l) objE, rVar, xw.b.f221619c);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 W(er.a aVar, s sVar, qc2.a.InterfaceC4147a interfaceC4147a) {
        if (fr.t.c(interfaceC4147a, qc2.a.InterfaceC4147a.C4148a.f165977a)) {
            aVar.a();
        } else if (interfaceC4147a instanceof qc2.a.InterfaceC4147a.Error) {
            s.l(sVar, h1.e.f197339b, ((qc2.a.InterfaceC4147a.Error) interfaceC4147a).getData(), null, 4, null);
        } else if (interfaceC4147a instanceof qc2.a.InterfaceC4147a.CustomError) {
            s.l(sVar, h1.b.f197336b, ((qc2.a.InterfaceC4147a.CustomError) interfaceC4147a).getData(), null, 4, null);
        } else {
            if (!fr.t.c(interfaceC4147a, qc2.a.InterfaceC4147a.d.f165980a)) {
                throw new p();
            }
            s.m(sVar, h1.g.f197341b, null, 2, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 X(p115tc2.a aVar, final er.a aVar2, final s sVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(1513050484, i15, -1, "pl.gov.coi.mobywatel.feature.identitycardinvalidation.presentation.NestedNavContent.<anonymous>.<anonymous>.<anonymous> (NestedNavContent.kt:90)");
        }
        f00.r.o(wVar, q0.c(u.class), aVar, m.d(794423523, true, new q() { // from class: ub2.v
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return g1.Y(aVar2, sVar, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), h.f197324a.k(), rVar, ((i15 >> 3) & 14) | 27648);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 Y(final er.a aVar, final s sVar, d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(794423523, i15, -1, "pl.gov.coi.mobywatel.feature.identitycardinvalidation.presentation.NestedNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NestedNavContent.kt:95)");
        }
        g gVarY1 = dVar.Y1();
        boolean zW = rVar.W(aVar) | rVar.G(sVar);
        Object objE = rVar.E();
        if (zW || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: ub2.r0
                @Override // er.l
                public final Object b(Object obj) {
                    return g1.Z(aVar, sVar, (dc2.c.a) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(gVarY1, (l) objE, rVar, xw.b.f221619c);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 Z(er.a aVar, s sVar, dc2.c.a aVar2) {
        if (fr.t.c(aVar2, dc2.c.a.b.f40804a)) {
            aVar.a();
        } else if (fr.t.c(aVar2, dc2.c.a.C0900c.f40805a)) {
            sVar.c();
        } else if (aVar2 instanceof dc2.c.a.EdorAuth) {
            s.l(sVar, h1.d.f197338b, ((dc2.c.a.EdorAuth) aVar2).getModel(), null, 4, null);
        } else if (aVar2 instanceof dc2.c.a.OfficeSelection) {
            s.l(sVar, h1.i.f197343b, ((dc2.c.a.OfficeSelection) aVar2).getModel(), null, 4, null);
        } else if (fr.t.c(aVar2, dc2.c.a.d.f40806a)) {
            s.m(sVar, h1.h.f197342b, null, 2, null);
        } else {
            if (!fr.t.c(aVar2, dc2.c.a.f.f40808a)) {
                throw new p();
            }
            s.m(sVar, h1.l.f197346b, null, 2, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 a0(final s sVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-470545292, i15, -1, "pl.gov.coi.mobywatel.feature.identitycardinvalidation.presentation.NestedNavContent.<anonymous>.<anonymous>.<anonymous> (NestedNavContent.kt:301)");
        }
        h1.f fVar2 = h1.f.f197340b;
        f00.r.r(wVar, fVar2, sVar.g(fVar2), m.d(-1892783814, true, new q() { // from class: ub2.u
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return g1.b0(sVar, (dx3.c) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, ((i15 >> 3) & 14) | 3120);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 b0(final s sVar, dx3.c cVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-1892783814, i15, -1, "pl.gov.coi.mobywatel.feature.identitycardinvalidation.presentation.NestedNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NestedNavContent.kt:306)");
        }
        xw.b<dx3.c.a> bVarY1 = cVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: ub2.s0
                @Override // er.l
                public final Object b(Object obj) {
                    return g1.c0(sVar, (dx3.c.a) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(bVarY1, (l) objE, rVar, xw.b.f221619c);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 c0(s sVar, dx3.c.a aVar) {
        if (!fr.t.c(aVar, dx3.c.a.C1047a.f45490a)) {
            throw new p();
        }
        sVar.c();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 d0(final s sVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(1648505683, i15, -1, "pl.gov.coi.mobywatel.feature.identitycardinvalidation.presentation.NestedNavContent.<anonymous>.<anonymous>.<anonymous> (NestedNavContent.kt:316)");
        }
        h1.e eVar = h1.e.f197339b;
        f00.r.r(wVar, eVar, sVar.g(eVar), m.d(1497583924, true, new q() { // from class: ub2.y
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return g1.e0(sVar, (hb4.b) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, ((i15 >> 3) & 14) | 3120);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 e0(final s sVar, hb4.b bVar, r rVar, int i15) {
        if (t.k()) {
            t.o(1497583924, i15, -1, "pl.gov.coi.mobywatel.feature.identitycardinvalidation.presentation.NestedNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NestedNavContent.kt:321)");
        }
        xw.b<hb4.b.a> bVarY1 = bVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: ub2.i0
                @Override // er.l
                public final Object b(Object obj) {
                    return g1.f0(sVar, (hb4.b.a) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(bVarY1, (l) objE, rVar, xw.b.f221619c);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f0(s sVar, hb4.b.a aVar) {
        if (!fr.t.c(aVar, hb4.b.a.C1910a.f83033a)) {
            throw new p();
        }
        sVar.c();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 g0(final s sVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-527410638, i15, -1, "pl.gov.coi.mobywatel.feature.identitycardinvalidation.presentation.NestedNavContent.<anonymous>.<anonymous>.<anonymous> (NestedNavContent.kt:331)");
        }
        h1.c cVar = h1.c.f197337b;
        f00.r.r(wVar, cVar, sVar.g(cVar), m.d(-105932227, true, new q() { // from class: ub2.x
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return g1.h0(sVar, (cb4.f) obj, (r) obj2, ((Integer) obj3).intValue());
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
            t.o(-105932227, i15, -1, "pl.gov.coi.mobywatel.feature.identitycardinvalidation.presentation.NestedNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NestedNavContent.kt:336)");
        }
        xw.b<cb4.f.a> bVarY1 = fVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: ub2.n0
                @Override // er.l
                public final Object b(Object obj) {
                    return g1.i0(sVar, (cb4.f.a) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(bVarY1, (l) objE, rVar, xw.b.f221619c);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i0(s sVar, cb4.f.a aVar) {
        if (!fr.t.c(aVar, cb4.f.a.C0669a.f24980a)) {
            throw new p();
        }
        sVar.c();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j0(final s sVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(1591640337, i15, -1, "pl.gov.coi.mobywatel.feature.identitycardinvalidation.presentation.NestedNavContent.<anonymous>.<anonymous>.<anonymous> (NestedNavContent.kt:346)");
        }
        f00.r.o(wVar, q0.c(k.class), sVar.g(h1.b.f197336b), m.d(789041026, true, new q() { // from class: ub2.c0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return g1.k0(sVar, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), h.f197324a.i(), rVar, ((i15 >> 3) & 14) | 27648);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k0(final s sVar, d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(789041026, i15, -1, "pl.gov.coi.mobywatel.feature.identitycardinvalidation.presentation.NestedNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NestedNavContent.kt:351)");
        }
        g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: ub2.w0
                @Override // er.l
                public final Object b(Object obj) {
                    return g1.l0(sVar, (wb2.a) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(gVarY1, (l) objE, rVar, xw.b.f221619c);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l0(s sVar, wb2.a aVar) {
        if (!fr.t.c(aVar, wb2.a.C5579a.f211807a)) {
            throw new p();
        }
        sVar.c();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m0(final s sVar, final p115tc2.a aVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-662865837, i15, -1, "pl.gov.coi.mobywatel.feature.identitycardinvalidation.presentation.NestedNavContent.<anonymous>.<anonymous>.<anonymous> (NestedNavContent.kt:122)");
        }
        y0 y0VarC = q7.b.f165175a.c(rVar, q7.b.f165177c);
        if (y0VarC == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
        }
        final bc2.a aVar2 = (bc2.a) q7.d.c(q0.c(bc2.a.class), y0VarC, null, j7.a.a(y0VarC, rVar, 0), y0VarC instanceof h ? ((h) y0VarC).x() : CreationExtras.b.f153222c, rVar, 0, 0);
        h1.i iVar = h1.i.f197343b;
        f00.r.r(wVar, iVar, sVar.g(iVar), m.d(2011917406, true, new q() { // from class: ub2.e0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return g1.n0(sVar, aVar, aVar2, (py3.d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, ((i15 >> 3) & 14) | 3120);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n0(final s sVar, final p115tc2.a aVar, final bc2.a aVar2, py3.d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(2011917406, i15, -1, "pl.gov.coi.mobywatel.feature.identitycardinvalidation.presentation.NestedNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NestedNavContent.kt:128)");
        }
        xw.b<py3.d.a> bVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar) | rVar.G(aVar) | rVar.G(aVar2);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: ub2.l0
                @Override // er.l
                public final Object b(Object obj) {
                    return g1.o0(sVar, aVar, aVar2, (py3.d.a) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(bVarY1, (l) objE, rVar, xw.b.f221619c);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o0(s sVar, p115tc2.a aVar, bc2.a aVar2, py3.d.a aVar3) {
        if (fr.t.c(aVar3, py3.d.a.C4046a.f163265a)) {
            sVar.c();
        } else if (fr.t.c(aVar3, py3.d.a.b.f163266a)) {
            L0(aVar, sVar);
        } else if (aVar3 instanceof py3.d.a.OfficeSelected) {
            aVar.s1(kb2.a.a(((py3.d.a.OfficeSelected) aVar3).getOffice()));
            i0 i0Var = i0.f148189a;
            s.m(sVar, h1.m.f197347b, null, 2, null);
        } else {
            if (!(aVar3 instanceof py3.d.a.Search)) {
                throw new p();
            }
            s.l(sVar, h1.j.f197344b, aVar2.Z8(((py3.d.a.Search) aVar3).getModel()), null, 4, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p0(final s sVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(1456185138, i15, -1, "pl.gov.coi.mobywatel.feature.identitycardinvalidation.presentation.NestedNavContent.<anonymous>.<anonymous>.<anonymous> (NestedNavContent.kt:150)");
        }
        h1.j jVar = h1.j.f197344b;
        f00.r.r(wVar, jVar, sVar.g(jVar), m.d(-144027931, true, new q() { // from class: ub2.a0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return g1.q0(sVar, (tt3.d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, ((i15 >> 3) & 14) | 3120);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q0(final s sVar, tt3.d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-144027931, i15, -1, "pl.gov.coi.mobywatel.feature.identitycardinvalidation.presentation.NestedNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NestedNavContent.kt:155)");
        }
        xw.b<tt3.d.a> bVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: ub2.j0
                @Override // er.l
                public final Object b(Object obj) {
                    return g1.r0(sVar, (tt3.d.a) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(bVarY1, (l) objE, rVar, xw.b.f221619c);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r0(s sVar, tt3.d.a aVar) {
        if (!fr.t.c(aVar, tt3.d.a.C5021a.f192310a)) {
            throw new p();
        }
        sVar.c();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s0(final s sVar, final er.a aVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-719731183, i15, -1, "pl.gov.coi.mobywatel.feature.identitycardinvalidation.presentation.NestedNavContent.<anonymous>.<anonymous>.<anonymous> (NestedNavContent.kt:167)");
        }
        h1.d dVar = h1.d.f197338b;
        f00.r.r(wVar, dVar, sVar.g(dVar), m.d(1632746220, true, new q() { // from class: ub2.t
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return g1.t0(sVar, aVar, (mv3.c) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, ((i15 >> 3) & 14) | 3120);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t0(final s sVar, final er.a aVar, mv3.c cVar, r rVar, int i15) {
        if (t.k()) {
            t.o(1632746220, i15, -1, "pl.gov.coi.mobywatel.feature.identitycardinvalidation.presentation.NestedNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NestedNavContent.kt:172)");
        }
        xw.b<mv3.c.a> bVarY1 = cVar.Y1();
        boolean zG = rVar.G(sVar) | rVar.W(aVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: ub2.x0
                @Override // er.l
                public final Object b(Object obj) {
                    return g1.u0(sVar, aVar, (mv3.c.a) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(bVarY1, (l) objE, rVar, xw.b.f221619c);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u0(s sVar, er.a aVar, mv3.c.a aVar2) {
        if (fr.t.c(aVar2, mv3.c.a.C3193a.f128686a)) {
            sVar.c();
        } else {
            if (!fr.t.c(aVar2, mv3.c.a.b.f128687a)) {
                throw new p();
            }
            aVar.a();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v0(final p115tc2.a aVar, final s sVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(1399319792, i15, -1, "pl.gov.coi.mobywatel.feature.identitycardinvalidation.presentation.NestedNavContent.<anonymous>.<anonymous>.<anonymous> (NestedNavContent.kt:183)");
        }
        f00.r.o(wVar, q0.c(o.class), aVar, m.d(680692831, true, new q() { // from class: ub2.d0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return g1.w0(sVar, aVar, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), h.f197324a.n(), rVar, ((i15 >> 3) & 14) | 27648);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w0(final s sVar, final p115tc2.a aVar, d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(680692831, i15, -1, "pl.gov.coi.mobywatel.feature.identitycardinvalidation.presentation.NestedNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NestedNavContent.kt:188)");
        }
        g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar) | rVar.G(aVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: ub2.p0
                @Override // er.l
                public final Object b(Object obj) {
                    return g1.x0(sVar, aVar, (yb2.a) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(gVarY1, (l) objE, rVar, xw.b.f221619c);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x0(s sVar, p115tc2.a aVar, yb2.a aVar2) {
        if (fr.t.c(aVar2, yb2.a.C6058a.f226048a)) {
            sVar.c();
        } else if (fr.t.c(aVar2, yb2.a.b.f226049a)) {
            L0(aVar, sVar);
        } else {
            if (!fr.t.c(aVar2, yb2.a.c.f226050a)) {
                throw new p();
            }
            s.m(sVar, h1.l.f197346b, null, 2, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 y0(final s sVar, final p115tc2.a aVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-776596529, i15, -1, "pl.gov.coi.mobywatel.feature.identitycardinvalidation.presentation.NestedNavContent.<anonymous>.<anonymous>.<anonymous> (NestedNavContent.kt:201)");
        }
        h1.a aVar2 = h1.a.f197335b;
        f00.r.r(wVar, aVar2, sVar.g(aVar2), m.d(-662290245, true, new q() { // from class: ub2.h0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return g1.z0(sVar, aVar, (ru3.a) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, ((i15 >> 3) & 14) | 3120);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z0(final s sVar, final p115tc2.a aVar, ru3.a aVar2, r rVar, int i15) {
        if (t.k()) {
            t.o(-662290245, i15, -1, "pl.gov.coi.mobywatel.feature.identitycardinvalidation.presentation.NestedNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NestedNavContent.kt:206)");
        }
        xw.b<ru3.a.AbstractC4497a> bVarY1 = aVar2.Y1();
        boolean zG = rVar.G(sVar) | rVar.G(aVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: ub2.o0
                @Override // er.l
                public final Object b(Object obj) {
                    return g1.A0(sVar, aVar, (ru3.a.AbstractC4497a) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(bVarY1, (l) objE, rVar, xw.b.f221619c);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }
}
