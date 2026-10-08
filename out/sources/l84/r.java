package l84;

import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p136y9.d1;
import p7.CreationExtras;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a9\u0010\b\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lw74/a;", "featureConfig", "Lkotlin/Function0;", "Loq/i0;", "navResult", "Lkotlin/Function1;", "Ll84/d$e;", "onNotificationNavigation", "i", "(Lw74/a;Ler/a;Ler/l;Lm2/r;I)V", "notifications_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class r {
    public static final void i(final w74.a aVar, final er.a<oq.i0> aVar2, final er.l<? super d.e, oq.i0> lVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(670095545);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.c(aVar.ordinal()) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(aVar2) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= rVarH.G(lVar) ? 256 : 128;
        }
        if (rVarH.r((i16 & 147) != 146, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(670095545, i16, -1, "pl.gov.coi.shared.feature.notificationshistory.presentation.NotificationsHistoryNavContent (NotificationsHistoryNavContent.kt:17)");
            }
            final f00.s sVarJ = f00.r.J(null, rVarH, 0, 1);
            h hVar = h.f117083a;
            boolean zG = ((i16 & 14) == 4) | ((i16 & 112) == 32) | rVarH.G(sVarJ) | ((i16 & 896) == 256);
            Object objE = rVarH.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.l() { // from class: l84.j
                    @Override // er.l
                    public final Object b(Object obj) {
                        return r.j(aVar, aVar2, sVarJ, lVar, (d1) obj);
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
            d5VarM.a(new er.p() { // from class: l84.k
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return r.q(aVar, aVar2, lVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 j(final w74.a aVar, final er.a aVar2, final f00.s sVar, final er.l lVar, d1 d1Var) {
        f00.r.u(d1Var, h.f117083a, null, y2.m.b(-1908113384, true, new er.r() { // from class: l84.l
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return r.k(aVar, aVar2, sVar, lVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, g.f117080a, null, y2.m.b(1525380303, true, new er.r() { // from class: l84.m
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return r.n(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 k(final w74.a aVar, final er.a aVar2, final f00.s sVar, final er.l lVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1908113384, i15, -1, "pl.gov.coi.shared.feature.notificationshistory.presentation.NotificationsHistoryNavContent.<anonymous>.<anonymous>.<anonymous> (NotificationsHistoryNavContent.kt:24)");
        }
        boolean zC = rVar.c(aVar.ordinal());
        Object objE = rVar.E();
        if (zC || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: l84.o
                @Override // er.l
                public final Object b(Object obj) {
                    return r.l(aVar, (r0.a) obj);
                }
            };
            rVar.v(objE);
        }
        er.l lVar2 = (er.l) objE;
        androidx.p016lifecycle.y0 y0VarC = q7.b.f165175a.c(rVar, q7.b.f165177c);
        if (y0VarC == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
        }
        r0 r0Var = (r0) q7.d.c(fr.q0.c(r0.class), y0VarC, null, j7.a.a(y0VarC, rVar, 0), y0VarC instanceof androidx.p016lifecycle.h ? kq.a.b(((androidx.p016lifecycle.h) y0VarC).x(), lVar2) : kq.a.b(CreationExtras.b.f153222c, lVar2), rVar, 0, 0);
        xw.b<d.e> bVarY1 = r0Var.Y1();
        boolean zW = rVar.W(aVar2) | rVar.G(sVar) | rVar.W(lVar);
        Object objE2 = rVar.E();
        if (zW || objE2 == p076m2.r.INSTANCE.a()) {
            objE2 = new er.l() { // from class: l84.p
                @Override // er.l
                public final Object b(Object obj) {
                    return r.m(aVar2, sVar, lVar, (d.e) obj);
                }
            };
            rVar.v(objE2);
        }
        f00.f0.b(bVarY1, (er.l) objE2, rVar, xw.b.f221619c);
        f0.u(r0Var, rVar, 0);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r0 l(w74.a aVar, r0.a aVar2) {
        return aVar2.a(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 m(er.a aVar, f00.s sVar, er.l lVar, d.e eVar) {
        if (fr.t.c(eVar, d.e.a.f117034a)) {
            aVar.a();
        } else if (eVar instanceof d.e.Error) {
            f00.s.l(sVar, g.f117080a, ((d.e.Error) eVar).getError(), null, 4, null);
        } else {
            if (!(eVar instanceof d.e.GoToAuthConfirmation) && !(eVar instanceof d.e.GoToCountryDetailsTravelAbroad) && !(eVar instanceof d.e.GoToInstantPaymentDetails) && !(eVar instanceof d.e.GoToNotificationDetail)) {
                throw new oq.p();
            }
            lVar.b(eVar);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 n(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1525380303, i15, -1, "pl.gov.coi.shared.feature.notificationshistory.presentation.NotificationsHistoryNavContent.<anonymous>.<anonymous>.<anonymous> (NotificationsHistoryNavContent.kt:51)");
        }
        g gVar = g.f117080a;
        f00.r.r(wVar, gVar, sVar.g(gVar), y2.m.d(-821550608, true, new er.q() { // from class: l84.n
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return r.o(sVar, (hb4.b) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
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
            p076m2.t.o(-821550608, i15, -1, "pl.gov.coi.shared.feature.notificationshistory.presentation.NotificationsHistoryNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NotificationsHistoryNavContent.kt:55)");
        }
        xw.b<hb4.b.a> bVarY1 = bVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: l84.q
                @Override // er.l
                public final Object b(Object obj) {
                    return r.p(sVar, (hb4.b.a) obj);
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
    public static final oq.i0 q(w74.a aVar, er.a aVar2, er.l lVar, int i15, p076m2.r rVar, int i16) {
        i(aVar, aVar2, lVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }
}
