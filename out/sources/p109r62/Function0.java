package p109r62;

import er.a;
import er.l;
import er.q;
import f00.d0;
import f00.f0;
import f00.s;
import fr.q0;
import hb4.b;
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
import s62.n;
import x62.c;
import x62.x;
import y2.m;
import zx.d;

/* JADX INFO: renamed from: r62.w, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001d\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/Function0;", "Loq/i0;", "navResult", "o", "(Ler/a;Lm2/r;I)V", "fines_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class Function0 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 A(final s sVar, b bVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-1711059203, i15, -1, "pl.gov.coi.mobywatel.feature.fines.presentation.FinesNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (FinesNavContent.kt:98)");
        }
        xw.b<b.a> bVarY1 = bVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: r62.k
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.B(sVar, (b.a) obj);
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
    public static final i0 B(s sVar, b.a aVar) {
        if (!fr.t.c(aVar, b.a.C1910a.f83033a)) {
            throw new p();
        }
        sVar.c();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 C(a aVar, int i15, r rVar, int i16) {
        o(aVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void o(final a<i0> aVar, r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(-1528179818);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(-1528179818, i16, -1, "pl.gov.coi.mobywatel.feature.fines.presentation.FinesNavContent (FinesNavContent.kt:23)");
            }
            final s sVarJ = f00.r.J(null, rVarH, 0, 1);
            h hVar = h.f172210a;
            boolean zG = rVarH.G(sVarJ) | ((i16 & 14) == 4);
            Object objE = rVarH.E();
            if (zG || objE == r.INSTANCE.a()) {
                objE = new l() { // from class: r62.i
                    @Override // er.l
                    public final Object b(Object obj) {
                        return Function0.p(aVar, sVarJ, (d1) obj);
                    }
                };
                rVarH.v(objE);
            }
            d0.j(sVarJ, hVar, (l) objE, rVarH, s.f54562e | 48);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: r62.n
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return Function0.C(aVar, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p(final a aVar, final s sVar, d1 d1Var) {
        f00.r.u(d1Var, h.f172210a, null, m.b(1844625943, true, new er.r() { // from class: r62.o
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.q(aVar, sVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, f.f172206a, null, m.b(-1126982080, true, new er.r() { // from class: r62.p
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.t(sVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, g.f172208a, null, m.b(-824094689, true, new er.r() { // from class: r62.q
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.w(sVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, e.f172204a, null, m.b(-521207298, true, new er.r() { // from class: r62.r
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.z(sVar, (f) obj, (w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(final a aVar, final s sVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(1844625943, i15, -1, "pl.gov.coi.mobywatel.feature.fines.presentation.FinesNavContent.<anonymous>.<anonymous>.<anonymous> (FinesNavContent.kt:31)");
        }
        f00.r.n(wVar, q0.c(x.class), m.d(-1010771771, true, new q() { // from class: r62.s
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.r(aVar, sVar, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), d.f172200a.f(), rVar, ((i15 >> 3) & 14) | 3456);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r(final a aVar, final s sVar, d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-1010771771, i15, -1, "pl.gov.coi.mobywatel.feature.fines.presentation.FinesNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (FinesNavContent.kt:34)");
        }
        g gVarY1 = dVar.Y1();
        boolean zW = rVar.W(aVar) | rVar.G(sVar);
        Object objE = rVar.E();
        if (zW || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: r62.j
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.s(aVar, sVar, (c.f) obj);
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
    public static final i0 s(a aVar, s sVar, c.f fVar) {
        if (fr.t.c(fVar, c.f.a.f216996a)) {
            aVar.a();
        } else if (fVar instanceof c.f.GenericError) {
            s.l(sVar, e.f172204a, ((c.f.GenericError) fVar).getResult(), null, 4, null);
        } else if (fVar instanceof c.f.ToDetails) {
            s.l(sVar, f.f172206a, ((c.f.ToDetails) fVar).getTicketDetailsDestinationParams(), null, 4, null);
        } else {
            if (!fr.t.c(fVar, c.f.d.f216999a)) {
                throw new p();
            }
            s.m(sVar, g.f172208a, null, 2, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t(final s sVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-1126982080, i15, -1, "pl.gov.coi.mobywatel.feature.fines.presentation.FinesNavContent.<anonymous>.<anonymous>.<anonymous> (FinesNavContent.kt:56)");
        }
        f00.r.o(wVar, q0.c(n.class), sVar.g(f.f172206a), m.d(462264495, true, new q() { // from class: r62.v
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.u(sVar, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), d.f172200a.e(), rVar, ((i15 >> 3) & 14) | 27648);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u(final s sVar, d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(462264495, i15, -1, "pl.gov.coi.mobywatel.feature.fines.presentation.FinesNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (FinesNavContent.kt:62)");
        }
        g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: r62.m
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.v(sVar, (s62.a.c) obj);
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
    public static final i0 v(s sVar, s62.a.c cVar) {
        if (fr.t.c(cVar, s62.a.c.C4567a.f178267a)) {
            sVar.c();
        } else if (fr.t.c(cVar, s62.a.c.C4568c.f178269a)) {
            s.m(sVar, g.f172208a, null, 2, null);
        } else {
            if (!(cVar instanceof s62.a.c.Error)) {
                throw new p();
            }
            s.l(sVar, e.f172204a, ((s62.a.c.Error) cVar).getErrorData(), null, 4, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w(final s sVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-824094689, i15, -1, "pl.gov.coi.mobywatel.feature.fines.presentation.FinesNavContent.<anonymous>.<anonymous>.<anonymous> (FinesNavContent.kt:80)");
        }
        f00.r.n(wVar, q0.c(u62.l.class), m.d(-377195699, true, new q() { // from class: r62.u
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.x(sVar, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), d.f172200a.d(), rVar, ((i15 >> 3) & 14) | 3456);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x(final s sVar, d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-377195699, i15, -1, "pl.gov.coi.mobywatel.feature.fines.presentation.FinesNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (FinesNavContent.kt:83)");
        }
        g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: r62.l
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.y(sVar, (u62.b) obj);
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
    public static final i0 y(s sVar, u62.b bVar) {
        if (!fr.t.c(bVar, u62.b.a.f195835a)) {
            throw new p();
        }
        sVar.c();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z(final s sVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-521207298, i15, -1, "pl.gov.coi.mobywatel.feature.fines.presentation.FinesNavContent.<anonymous>.<anonymous>.<anonymous> (FinesNavContent.kt:94)");
        }
        e eVar = e.f172204a;
        f00.r.r(wVar, eVar, sVar.g(eVar), m.d(-1711059203, true, new q() { // from class: r62.t
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.A(sVar, (b) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, ((i15 >> 3) & 14) | 3120);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }
}
