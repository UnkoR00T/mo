package e84;

import androidx.p016lifecycle.y0;
import fr.q0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p136y9.d1;
import p7.CreationExtras;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a%\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lw74/a;", "featureConfig", "Lkotlin/Function0;", "Loq/i0;", "navResult", "i", "(Lw74/a;Ler/a;Lm2/r;I)V", "notifications_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class n {
    public static final void i(final w74.a aVar, final er.a<oq.i0> aVar2, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(1579726282);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.c(aVar.ordinal()) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(aVar2) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1579726282, i16, -1, "pl.gov.coi.shared.feature.notificationsettings.presentation.NotificationSettingsNavContent (NotificationSettingsNavContent.kt:16)");
            }
            final f00.s sVarJ = f00.r.J(null, rVarH, 0, 1);
            d dVar = d.f48528a;
            boolean zG = ((i16 & 14) == 4) | ((i16 & 112) == 32) | rVarH.G(sVarJ);
            Object objE = rVarH.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.l() { // from class: e84.f
                    @Override // er.l
                    public final Object b(Object obj) {
                        return n.j(aVar, aVar2, sVarJ, (d1) obj);
                    }
                };
                rVarH.v(objE);
            }
            f00.d0.j(sVarJ, dVar, (er.l) objE, rVarH, f00.s.f54562e | 48);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: e84.g
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return n.q(aVar, aVar2, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 j(final w74.a aVar, final er.a aVar2, final f00.s sVar, d1 d1Var) {
        f00.r.u(d1Var, d.f48528a, null, y2.m.b(2097493993, true, new er.r() { // from class: e84.h
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return n.k(aVar, aVar2, sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, c.f48525a, null, y2.m.b(1763530080, true, new er.r() { // from class: e84.i
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return n.n(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 k(final w74.a aVar, final er.a aVar2, final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(2097493993, i15, -1, "pl.gov.coi.shared.feature.notificationsettings.presentation.NotificationSettingsNavContent.<anonymous>.<anonymous>.<anonymous> (NotificationSettingsNavContent.kt:23)");
        }
        boolean zC = rVar.c(aVar.ordinal());
        Object objE = rVar.E();
        if (zC || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: e84.k
                @Override // er.l
                public final Object b(Object obj) {
                    return n.l(aVar, (h0.a) obj);
                }
            };
            rVar.v(objE);
        }
        er.l lVar = (er.l) objE;
        y0 y0VarC = q7.b.f165175a.c(rVar, q7.b.f165177c);
        if (y0VarC == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
        }
        h0 h0Var = (h0) q7.d.c(q0.c(h0.class), y0VarC, null, j7.a.a(y0VarC, rVar, 0), y0VarC instanceof androidx.p016lifecycle.h ? kq.a.b(((androidx.p016lifecycle.h) y0VarC).x(), lVar) : kq.a.b(CreationExtras.b.f153222c, lVar), rVar, 0, 0);
        xw.b<x.c> bVarY1 = h0Var.Y1();
        boolean zW = rVar.W(aVar2) | rVar.G(sVar);
        Object objE2 = rVar.E();
        if (zW || objE2 == p076m2.r.INSTANCE.a()) {
            objE2 = new er.l() { // from class: e84.l
                @Override // er.l
                public final Object b(Object obj) {
                    return n.m(aVar2, sVar, (x.c) obj);
                }
            };
            rVar.v(objE2);
        }
        f00.f0.b(bVarY1, (er.l) objE2, rVar, xw.b.f221619c);
        w.s(h0Var, rVar, 0);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 l(w74.a aVar, h0.a aVar2) {
        return aVar2.a(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 m(er.a aVar, f00.s sVar, x.c cVar) {
        if (fr.t.c(cVar, x.c.a.f48649a)) {
            aVar.a();
        } else {
            if (!(cVar instanceof x.c.Error)) {
                throw new oq.p();
            }
            f00.s.l(sVar, c.f48525a, ((x.c.Error) cVar).getError(), null, 4, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 n(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1763530080, i15, -1, "pl.gov.coi.shared.feature.notificationsettings.presentation.NotificationSettingsNavContent.<anonymous>.<anonymous>.<anonymous> (NotificationSettingsNavContent.kt:43)");
        }
        c cVar = c.f48525a;
        f00.r.r(wVar, cVar, sVar.g(cVar), y2.m.d(548980673, true, new er.q() { // from class: e84.j
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return n.o(sVar, (hb4.b) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, ((i15 >> 3) & 14) | 3120);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 o(final f00.s sVar, hb4.b bVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(548980673, i15, -1, "pl.gov.coi.shared.feature.notificationsettings.presentation.NotificationSettingsNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NotificationSettingsNavContent.kt:47)");
        }
        xw.b<hb4.b.a> bVarY1 = bVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: e84.m
                @Override // er.l
                public final Object b(Object obj) {
                    return n.p(sVar, (hb4.b.a) obj);
                }
            };
            rVar.v(objE);
        }
        f00.f0.b(bVarY1, (er.l) objE, rVar, xw.b.f221619c);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 p(f00.s sVar, hb4.b.a aVar) {
        if (!fr.t.c(aVar, hb4.b.a.C1910a.f83033a)) {
            throw new oq.p();
        }
        sVar.c();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 q(w74.a aVar, er.a aVar2, int i15, p076m2.r rVar, int i16) {
        i(aVar, aVar2, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }
}
