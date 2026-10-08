package p085np3;

import er.a;
import er.l;
import er.p;
import er.q;
import f00.d0;
import f00.f0;
import f00.s;
import fr.q0;
import iq3.h0;
import lq3.e;
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
import xw.b;
import y2.m;
import yp3.c;
import yp3.o;
import zx.d;

/* JADX INFO: renamed from: np3.z0, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001d\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/Function0;", "Loq/i0;", "navResult", "M", "(Ler/a;Lm2/r;I)V", "voteidea_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class Function0 {
    public static final void M(final a<i0> aVar, r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(-1553855728);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(-1553855728, i16, -1, "pl.gov.coi.mobywatel.feature.voteidea.presentation.VoteIdeaNavContent (VoteIdeaNavContent.kt:46)");
            }
            final s sVarJ = f00.r.J(null, rVarH, 0, 1);
            m.e eVar = m.e.f137631a;
            boolean zG = rVarH.G(sVarJ) | ((i16 & 14) == 4);
            Object objE = rVarH.E();
            if (zG || objE == r.INSTANCE.a()) {
                objE = new l() { // from class: np3.n
                    @Override // er.l
                    public final Object b(Object obj) {
                        return Function0.N(aVar, sVarJ, (d1) obj);
                    }
                };
                rVarH.v(objE);
            }
            d0.j(sVarJ, eVar, (l) objE, rVarH, s.f54562e | 48);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: np3.y
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return Function0.y0(aVar, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 N(final a aVar, final s sVar, d1 d1Var) {
        f00.r.u(d1Var, m.j.f137641a, null, m.b(-477700689, true, new er.r() { // from class: np3.j0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.O(aVar, sVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, m.b.f137625a, null, m.b(-1918853210, true, new er.r() { // from class: np3.u0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.R(sVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, m.f.f137633a, null, m.b(224630951, true, new er.r() { // from class: np3.v0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.a0(sVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, m.l.f137645a, null, m.b(-1926852184, true, new er.r() { // from class: np3.w0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.d0(sVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, m.e.f137631a, null, m.b(216631977, true, new er.r() { // from class: np3.x0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.g0(sVar, aVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, m.g.f137635a, null, m.b(-1934851158, true, new er.r() { // from class: np3.y0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.j0(sVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, m.h.f137637a, null, m.b(208633003, true, new er.r() { // from class: np3.o
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.m0(sVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, m.k.f137643a, null, m.b(-1942850132, true, new er.r() { // from class: np3.p
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.p0(sVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, m.i.f137639a, null, m.b(200634029, true, new er.r() { // from class: np3.q
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.s0(sVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, m.c.f137627a, null, m.b(-1950849106, true, new er.r() { // from class: np3.r
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.v0(sVar, (f) obj, (w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, m.d.f137629a, null, m.b(1212630182, true, new er.r() { // from class: np3.s0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.U(sVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, m.a.f137623a, null, m.b(-938852953, true, new er.r() { // from class: np3.t0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.X(sVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 O(final a aVar, final s sVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-477700689, i15, -1, "pl.gov.coi.mobywatel.feature.voteidea.presentation.VoteIdeaNavContent.<anonymous>.<anonymous>.<anonymous> (VoteIdeaNavContent.kt:54)");
        }
        f00.r.n(wVar, q0.c(h0.class), m.d(-1893963071, true, new q() { // from class: np3.v
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.P(aVar, sVar, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), l.f137610a.o(), rVar, ((i15 >> 3) & 14) | 3456);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 P(final a aVar, final s sVar, d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-1893963071, i15, -1, "pl.gov.coi.mobywatel.feature.voteidea.presentation.VoteIdeaNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (VoteIdeaNavContent.kt:57)");
        }
        g gVarY1 = dVar.Y1();
        boolean zW = rVar.W(aVar) | rVar.G(sVar);
        Object objE = rVar.E();
        if (zW || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: np3.o0
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.Q(aVar, sVar, (iq3.d.j) obj);
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
    public static final i0 Q(a aVar, s sVar, iq3.d.j jVar) {
        if (fr.t.c(jVar, iq3.d.j.a.f96556a)) {
            aVar.a();
        } else if (jVar instanceof iq3.d.j.GoToDetails) {
            s.l(sVar, m.b.f137625a, ((iq3.d.j.GoToDetails) jVar).getIdeaDetailsData(), null, 4, null);
        } else if (fr.t.c(jVar, iq3.d.j.e.f96560a)) {
            s.m(sVar, m.f.f137633a, null, 2, null);
        } else if (fr.t.c(jVar, iq3.d.j.f.f96561a)) {
            s.m(sVar, m.k.f137643a, null, 2, null);
        } else if (fr.t.c(jVar, iq3.d.j.C2256d.f96559a)) {
            s.m(sVar, m.i.f137639a, null, 2, null);
        } else if (jVar instanceof iq3.d.j.Error) {
            s.l(sVar, m.a.f137623a, ((iq3.d.j.Error) jVar).getErrorData(), null, 4, null);
        } else {
            if (!fr.t.c(jVar, iq3.d.j.g.f96562a)) {
                throw new oq.p();
            }
            s.m(sVar, m.c.f137627a, null, 2, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 R(final s sVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-1918853210, i15, -1, "pl.gov.coi.mobywatel.feature.voteidea.presentation.VoteIdeaNavContent.<anonymous>.<anonymous>.<anonymous> (VoteIdeaNavContent.kt:93)");
        }
        f00.r.o(wVar, q0.c(op3.p.class), sVar.g(m.b.f137625a), m.d(1398272535, true, new q() { // from class: np3.z
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.S(sVar, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), l.f137610a.u(), rVar, ((i15 >> 3) & 14) | 27648);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 S(final s sVar, d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(1398272535, i15, -1, "pl.gov.coi.mobywatel.feature.voteidea.presentation.VoteIdeaNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (VoteIdeaNavContent.kt:97)");
        }
        g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: np3.g0
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.T(sVar, (op3.d) obj);
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
    public static final i0 T(s sVar, op3.d dVar) {
        if (fr.t.c(dVar, op3.d.a.f148092a)) {
            sVar.c();
        } else if (dVar instanceof op3.d.GoToSuccess) {
            s.l(sVar, m.l.f137645a, ((op3.d.GoToSuccess) dVar).getIdeaActiveRoundData(), null, 4, null);
        } else if (dVar instanceof op3.d.Error) {
            s.l(sVar, m.a.f137623a, ((op3.d.Error) dVar).getErrorData(), null, 4, null);
        } else if (fr.t.c(dVar, op3.d.e.f148096a)) {
            s.m(sVar, m.k.f137643a, null, 2, null);
        } else {
            if (!fr.t.c(dVar, op3.d.c.f148094a)) {
                throw new oq.p();
            }
            s.m(sVar, m.i.f137639a, null, 2, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 U(final s sVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(1212630182, i15, -1, "pl.gov.coi.mobywatel.feature.voteidea.presentation.VoteIdeaNavContent.<anonymous>.<anonymous>.<anonymous> (VoteIdeaNavContent.kt:296)");
        }
        f00.r.o(wVar, q0.c(up3.t.class), sVar.g(m.d.f137629a), m.d(964313173, true, new q() { // from class: np3.s
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.V(sVar, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), l.f137610a.n(), rVar, ((i15 >> 3) & 14) | 27648);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 V(final s sVar, d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(964313173, i15, -1, "pl.gov.coi.mobywatel.feature.voteidea.presentation.VoteIdeaNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (VoteIdeaNavContent.kt:300)");
        }
        g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: np3.p0
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.W(sVar, (up3.a.d) obj);
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
    public static final i0 W(s sVar, up3.a.d dVar) {
        if (fr.t.c(dVar, up3.a.d.C5195a.f199830a)) {
            sVar.c();
        } else if (dVar instanceof up3.a.d.Error) {
            s.l(sVar, m.a.f137623a, ((up3.a.d.Error) dVar).getErrorData(), null, 4, null);
        } else {
            if (!(dVar instanceof up3.a.d.GoToIdea)) {
                throw new oq.p();
            }
            s.l(sVar, m.b.f137625a, ((up3.a.d.GoToIdea) dVar).getIdea(), null, 4, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 X(final s sVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-938852953, i15, -1, "pl.gov.coi.mobywatel.feature.voteidea.presentation.VoteIdeaNavContent.<anonymous>.<anonymous>.<anonymous> (VoteIdeaNavContent.kt:320)");
        }
        m.a aVar = m.a.f137623a;
        f00.r.r(wVar, aVar, sVar.g(aVar), m.d(1828558822, true, new q() { // from class: np3.e0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.Y(sVar, (hb4.b) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, ((i15 >> 3) & 14) | 3120);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 Y(final s sVar, hb4.b bVar, r rVar, int i15) {
        if (t.k()) {
            t.o(1828558822, i15, -1, "pl.gov.coi.mobywatel.feature.voteidea.presentation.VoteIdeaNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (VoteIdeaNavContent.kt:324)");
        }
        b<hb4.b.a> bVarY1 = bVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: np3.k0
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.Z(sVar, (hb4.b.a) obj);
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
    public static final i0 Z(s sVar, hb4.b.a aVar) {
        if (!fr.t.c(aVar, hb4.b.a.C1910a.f83033a)) {
            throw new oq.p();
        }
        sVar.c();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 a0(final s sVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(224630951, i15, -1, "pl.gov.coi.mobywatel.feature.voteidea.presentation.VoteIdeaNavContent.<anonymous>.<anonymous>.<anonymous> (VoteIdeaNavContent.kt:125)");
        }
        f00.r.n(wVar, q0.c(o.class), m.d(701114681, true, new q() { // from class: np3.c0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.b0(sVar, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), l.f137610a.l(), rVar, ((i15 >> 3) & 14) | 3456);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 b0(final s sVar, d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(701114681, i15, -1, "pl.gov.coi.mobywatel.feature.voteidea.presentation.VoteIdeaNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (VoteIdeaNavContent.kt:128)");
        }
        g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: np3.m0
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.c0(sVar, (c) obj);
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
    public static final i0 c0(s sVar, c cVar) {
        if (fr.t.c(cVar, c.a.f228470a)) {
            sVar.c();
        } else {
            if (!(cVar instanceof c.GoToSendIdeaDetails)) {
                throw new oq.p();
            }
            s.l(sVar, m.g.f137635a, ((c.GoToSendIdeaDetails) cVar).getCategory(), null, 4, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 d0(final s sVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-1926852184, i15, -1, "pl.gov.coi.mobywatel.feature.voteidea.presentation.VoteIdeaNavContent.<anonymous>.<anonymous>.<anonymous> (VoteIdeaNavContent.kt:143)");
        }
        f00.r.o(wVar, q0.c(lq3.o.class), sVar.g(m.l.f137645a), m.d(1390273561, true, new q() { // from class: np3.d0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.e0(sVar, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), l.f137610a.t(), rVar, ((i15 >> 3) & 14) | 27648);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 e0(final s sVar, d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(1390273561, i15, -1, "pl.gov.coi.mobywatel.feature.voteidea.presentation.VoteIdeaNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (VoteIdeaNavContent.kt:147)");
        }
        g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: np3.l0
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.f0(sVar, (e) obj);
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
    public static final i0 f0(s sVar, e eVar) {
        if (!fr.t.c(eVar, e.a.f119631a)) {
            throw new oq.p();
        }
        m.j jVar = m.j.f137641a;
        sVar.k(jVar, jVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 g0(final s sVar, final a aVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(216631977, i15, -1, "pl.gov.coi.mobywatel.feature.voteidea.presentation.VoteIdeaNavContent.<anonymous>.<anonymous>.<anonymous> (VoteIdeaNavContent.kt:161)");
        }
        f00.r.n(wVar, q0.c(wp3.r.class), m.d(693115707, true, new q() { // from class: np3.w
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.h0(sVar, aVar, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), l.f137610a.s(), rVar, ((i15 >> 3) & 14) | 3456);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h0(final s sVar, final a aVar, d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(693115707, i15, -1, "pl.gov.coi.mobywatel.feature.voteidea.presentation.VoteIdeaNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (VoteIdeaNavContent.kt:164)");
        }
        g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar) | rVar.W(aVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: np3.i0
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.i0(sVar, aVar, (wp3.e.InterfaceC5680e) obj);
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
    public static final i0 i0(s sVar, a aVar, wp3.e.InterfaceC5680e interfaceC5680e) {
        if (fr.t.c(interfaceC5680e, wp3.e.InterfaceC5680e.d.f214325a)) {
            sVar.k(m.j.f137641a, m.e.f137631a);
        } else if (fr.t.c(interfaceC5680e, wp3.e.InterfaceC5680e.a.f214322a)) {
            aVar.a();
        } else if (fr.t.c(interfaceC5680e, wp3.e.InterfaceC5680e.C5681e.f214326a)) {
            s.m(sVar, m.k.f137643a, null, 2, null);
        } else if (fr.t.c(interfaceC5680e, wp3.e.InterfaceC5680e.c.f214324a)) {
            s.m(sVar, m.i.f137639a, null, 2, null);
        } else if (interfaceC5680e instanceof wp3.e.InterfaceC5680e.Error) {
            s.l(sVar, m.a.f137623a, ((wp3.e.InterfaceC5680e.Error) interfaceC5680e).getErrorData(), null, 4, null);
        } else {
            if (!fr.t.c(interfaceC5680e, wp3.e.InterfaceC5680e.f.f214327a)) {
                throw new oq.p();
            }
            s.m(sVar, m.c.f137627a, null, 2, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j0(final s sVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-1934851158, i15, -1, "pl.gov.coi.mobywatel.feature.voteidea.presentation.VoteIdeaNavContent.<anonymous>.<anonymous>.<anonymous> (VoteIdeaNavContent.kt:196)");
        }
        f00.r.o(wVar, q0.c(aq3.o.class), sVar.g(m.g.f137635a), m.d(1382274587, true, new q() { // from class: np3.u
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.k0(sVar, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), l.f137610a.v(), rVar, ((i15 >> 3) & 14) | 27648);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k0(final s sVar, d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(1382274587, i15, -1, "pl.gov.coi.mobywatel.feature.voteidea.presentation.VoteIdeaNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (VoteIdeaNavContent.kt:200)");
        }
        g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: np3.n0
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.l0(sVar, (aq3.a.c) obj);
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
    public static final i0 l0(s sVar, aq3.a.c cVar) {
        if (fr.t.c(cVar, aq3.a.c.C0306a.f14125a)) {
            sVar.c();
        } else if (fr.t.c(cVar, aq3.a.c.C0307c.f14127a)) {
            sVar.k(m.h.f137637a, m.g.f137635a);
        } else {
            if (!(cVar instanceof aq3.a.c.Error)) {
                throw new oq.p();
            }
            s.l(sVar, m.a.f137623a, ((aq3.a.c.Error) cVar).getErrorData(), null, 4, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m0(final s sVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(208633003, i15, -1, "pl.gov.coi.mobywatel.feature.voteidea.presentation.VoteIdeaNavContent.<anonymous>.<anonymous>.<anonymous> (VoteIdeaNavContent.kt:220)");
        }
        f00.r.n(wVar, q0.c(cq3.l.class), m.d(685116733, true, new q() { // from class: np3.b0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.n0(sVar, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), l.f137610a.q(), rVar, ((i15 >> 3) & 14) | 3456);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n0(final s sVar, d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(685116733, i15, -1, "pl.gov.coi.mobywatel.feature.voteidea.presentation.VoteIdeaNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (VoteIdeaNavContent.kt:223)");
        }
        g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: np3.f0
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.o0(sVar, (cq3.d) obj);
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
    public static final i0 o0(s sVar, cq3.d dVar) {
        if (!fr.t.c(dVar, cq3.d.a.f37266a)) {
            throw new oq.p();
        }
        sVar.k(m.j.f137641a, m.h.f137637a);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p0(final s sVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-1942850132, i15, -1, "pl.gov.coi.mobywatel.feature.voteidea.presentation.VoteIdeaNavContent.<anonymous>.<anonymous>.<anonymous> (VoteIdeaNavContent.kt:237)");
        }
        f00.r.n(wVar, q0.c(eq3.o.class), m.d(-1466366402, true, new q() { // from class: np3.x
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.q0(sVar, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), l.f137610a.r(), rVar, ((i15 >> 3) & 14) | 3456);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q0(final s sVar, d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-1466366402, i15, -1, "pl.gov.coi.mobywatel.feature.voteidea.presentation.VoteIdeaNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (VoteIdeaNavContent.kt:240)");
        }
        g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: np3.h0
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.r0(sVar, (eq3.a.c) obj);
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
    public static final i0 r0(s sVar, eq3.a.c cVar) {
        if (fr.t.c(cVar, eq3.a.c.C1244a.f52817a)) {
            sVar.c();
        } else {
            if (!(cVar instanceof eq3.a.c.Error)) {
                throw new oq.p();
            }
            s.l(sVar, m.a.f137623a, ((eq3.a.c.Error) cVar).getErrorData(), null, 4, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s0(final s sVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(200634029, i15, -1, "pl.gov.coi.mobywatel.feature.voteidea.presentation.VoteIdeaNavContent.<anonymous>.<anonymous>.<anonymous> (VoteIdeaNavContent.kt:255)");
        }
        f00.r.n(wVar, q0.c(qp3.p.class), m.d(677117759, true, new q() { // from class: np3.a0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.t0(sVar, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), l.f137610a.m(), rVar, ((i15 >> 3) & 14) | 3456);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t0(final s sVar, d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(677117759, i15, -1, "pl.gov.coi.mobywatel.feature.voteidea.presentation.VoteIdeaNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (VoteIdeaNavContent.kt:258)");
        }
        g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: np3.r0
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.u0(sVar, (qp3.a.c) obj);
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
    public static final i0 u0(s sVar, qp3.a.c cVar) {
        if (fr.t.c(cVar, qp3.a.c.C4238a.f167937a)) {
            sVar.c();
        } else {
            if (!(cVar instanceof qp3.a.c.Error)) {
                throw new oq.p();
            }
            s.l(sVar, m.a.f137623a, ((qp3.a.c.Error) cVar).getErrorData(), null, 4, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v0(final s sVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-1950849106, i15, -1, "pl.gov.coi.mobywatel.feature.voteidea.presentation.VoteIdeaNavContent.<anonymous>.<anonymous>.<anonymous> (VoteIdeaNavContent.kt:273)");
        }
        f00.r.n(wVar, q0.c(sp3.p.class), m.d(-1474365376, true, new q() { // from class: np3.t
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.w0(sVar, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), l.f137610a.p(), rVar, ((i15 >> 3) & 14) | 3456);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w0(final s sVar, d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-1474365376, i15, -1, "pl.gov.coi.mobywatel.feature.voteidea.presentation.VoteIdeaNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (VoteIdeaNavContent.kt:276)");
        }
        g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: np3.q0
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.x0(sVar, (sp3.g.d) obj);
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
    public static final i0 x0(s sVar, sp3.g.d dVar) {
        if (fr.t.c(dVar, sp3.g.d.a.f183449a)) {
            sVar.c();
        } else if (dVar instanceof sp3.g.d.Error) {
            s.l(sVar, m.a.f137623a, ((sp3.g.d.Error) dVar).getErrorData(), null, 4, null);
        } else {
            if (!(dVar instanceof sp3.g.d.ShowRoundResults)) {
                throw new oq.p();
            }
            s.l(sVar, m.d.f137629a, ((sp3.g.d.ShowRoundResults) dVar).getRound(), null, 4, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 y0(a aVar, int i15, r rVar, int i16) {
        M(aVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
