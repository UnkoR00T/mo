package nl2;

import f00.f0;
import fr.q0;
import java.time.LocalDate;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.c4;
import p076m2.d0;
import p076m2.d5;
import p076m2.g4;
import p136y9.d1;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a%\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001d\u0010\u0007\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0003¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lol2/a;", "colorScheme", "Lkotlin/Function0;", "Loq/i0;", "navResult", "o", "(Lol2/a;Ler/a;Lm2/r;I)V", "r", "(Ler/a;Lm2/r;I)V", "nationalcourtregister_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class w {
    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 A(final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(143929392, i15, -1, "pl.gov.coi.mobywatel.feature.nationalcourtregister.presentation.NationalCourtRegisterNavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NationalCourtRegisterNavContent.kt:87)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: nl2.n
                @Override // er.l
                public final Object b(Object obj) {
                    return w.B(sVar, (sl2.a.b) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(gVarY1, (er.l) objE, rVar, xw.b.f221619c);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 B(f00.s sVar, final sl2.a.b bVar) {
        if (fr.t.c(bVar, sl2.a.b.C4693a.f182207a)) {
            sVar.c();
        } else {
            if (!(bVar instanceof sl2.a.b.ShowDatePicker)) {
                throw new oq.p();
            }
            sl2.a.b.ShowDatePicker showDatePicker = (sl2.a.b.ShowDatePicker) bVar;
            f00.s.l(sVar, e.f137217a, new uw.j.Single(null, showDatePicker.getInitialDate().getDate(), new er.l() { // from class: nl2.p
                @Override // er.l
                public final Object b(Object obj) {
                    return w.C(bVar, (LocalDate) obj);
                }
            }, showDatePicker.getMin().getDate(), showDatePicker.getMax().getDate(), 1, null), null, 4, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 C(sl2.a.b bVar, LocalDate localDate) {
        ((sl2.a.b.ShowDatePicker) bVar).a().b(new fz.b.LocalDate(localDate));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 D(er.a aVar, int i15, p076m2.r rVar, int i16) {
        r(aVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void o(final ol2.a aVar, final er.a<i0> aVar2, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(1378598053);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(aVar) : rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(aVar2) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1378598053, i16, -1, "pl.gov.coi.mobywatel.feature.nationalcourtregister.presentation.NationalCourtRegisterNavContent (NationalCourtRegisterNavContent.kt:28)");
            }
            d0.c(ol2.c.c().d(aVar), y2.m.d(1392255333, true, new er.p() { // from class: nl2.q
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return w.p(aVar2, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), rVarH, c4.f122821i | 48);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: nl2.r
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return w.q(aVar, aVar2, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p(er.a aVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1392255333, i15, -1, "pl.gov.coi.mobywatel.feature.nationalcourtregister.presentation.NationalCourtRegisterNavContent.<anonymous> (NationalCourtRegisterNavContent.kt:32)");
            }
            r(aVar, rVar, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(ol2.a aVar, er.a aVar2, int i15, p076m2.r rVar, int i16) {
        o(aVar, aVar2, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private static final void r(final er.a<i0> aVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-240374984);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-240374984, i16, -1, "pl.gov.coi.mobywatel.feature.nationalcourtregister.presentation.NationalCourtRegisterNavGraph (NationalCourtRegisterNavContent.kt:39)");
            }
            final f00.s sVarJ = f00.r.J(null, rVarH, 0, 1);
            h hVar = h.f137223a;
            boolean zG = rVarH.G(sVarJ) | ((i16 & 14) == 4);
            Object objE = rVarH.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.l() { // from class: nl2.s
                    @Override // er.l
                    public final Object b(Object obj) {
                        return w.s(sVarJ, aVar, (d1) obj);
                    }
                };
                rVarH.v(objE);
            }
            f00.d0.j(sVarJ, hVar, (er.l) objE, rVarH, f00.s.f54562e | 48);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: nl2.t
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return w.D(aVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s(final f00.s sVar, final er.a aVar, d1 d1Var) {
        f00.r.u(d1Var, h.f137223a, null, y2.m.b(-288235527, true, new er.r() { // from class: nl2.u
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return w.t(aVar, sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, f.f137219a, null, y2.m.b(-14558110, true, new er.r() { // from class: nl2.v
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return w.w(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, g.f137221a, null, y2.m.b(1279860737, true, new er.r() { // from class: nl2.j
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return w.z(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        uw.m.c(d1Var, e.f137217a, sVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t(final er.a aVar, final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-288235527, i15, -1, "pl.gov.coi.mobywatel.feature.nationalcourtregister.presentation.NationalCourtRegisterNavGraph.<anonymous>.<anonymous>.<anonymous> (NationalCourtRegisterNavContent.kt:46)");
        }
        f00.r.n(wVar, q0.c(vl2.q.class), y2.m.d(-1536199129, true, new er.q() { // from class: nl2.m
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return w.u(aVar, sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), d.f137213a.e(), rVar, ((i15 >> 3) & 14) | 3456);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u(final er.a aVar, final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1536199129, i15, -1, "pl.gov.coi.mobywatel.feature.nationalcourtregister.presentation.NationalCourtRegisterNavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NationalCourtRegisterNavContent.kt:49)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zW = rVar.W(aVar) | rVar.G(sVar);
        Object objE = rVar.E();
        if (zW || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: nl2.i
                @Override // er.l
                public final Object b(Object obj) {
                    return w.v(aVar, sVar, (vl2.a.InterfaceC5428a) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(gVarY1, (er.l) objE, rVar, xw.b.f221619c);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v(er.a aVar, f00.s sVar, vl2.a.InterfaceC5428a interfaceC5428a) {
        if (fr.t.c(interfaceC5428a, vl2.a.InterfaceC5428a.C5429a.f207256a)) {
            aVar.a();
        } else {
            if (!(interfaceC5428a instanceof vl2.a.InterfaceC5428a.ToEntryDetails)) {
                throw new oq.p();
            }
            f00.s.l(sVar, f.f137219a, ((vl2.a.InterfaceC5428a.ToEntryDetails) interfaceC5428a).getItem(), null, 4, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-14558110, i15, -1, "pl.gov.coi.mobywatel.feature.nationalcourtregister.presentation.NationalCourtRegisterNavGraph.<anonymous>.<anonymous>.<anonymous> (NationalCourtRegisterNavContent.kt:64)");
        }
        f00.r.o(wVar, q0.c(ql2.n.class), sVar.g(f.f137219a), y2.m.d(-1150489455, true, new er.q() { // from class: nl2.l
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return w.x(sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), d.f137213a.f(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x(final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1150489455, i15, -1, "pl.gov.coi.mobywatel.feature.nationalcourtregister.presentation.NationalCourtRegisterNavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NationalCourtRegisterNavContent.kt:68)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: nl2.o
                @Override // er.l
                public final Object b(Object obj) {
                    return w.y(sVar, (ql2.a.c) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(gVarY1, (er.l) objE, rVar, xw.b.f221619c);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 y(f00.s sVar, ql2.a.c cVar) {
        if (fr.t.c(cVar, ql2.a.c.C4207a.f167180a)) {
            sVar.c();
        } else {
            if (!(cVar instanceof ql2.a.c.ToNotifications)) {
                throw new oq.p();
            }
            f00.s.l(sVar, g.f137221a, ((ql2.a.c.ToNotifications) cVar).getItem(), null, 4, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1279860737, i15, -1, "pl.gov.coi.mobywatel.feature.nationalcourtregister.presentation.NationalCourtRegisterNavGraph.<anonymous>.<anonymous>.<anonymous> (NationalCourtRegisterNavContent.kt:83)");
        }
        f00.r.o(wVar, q0.c(sl2.q.class), sVar.g(g.f137221a), y2.m.d(143929392, true, new er.q() { // from class: nl2.k
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return w.A(sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), d.f137213a.d(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }
}
