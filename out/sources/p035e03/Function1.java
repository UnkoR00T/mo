package p035e03;

import androidx.p016lifecycle.h;
import androidx.p016lifecycle.y0;
import er.a;
import er.l;
import er.p;
import er.q;
import f00.d0;
import f00.f0;
import f00.s;
import f03.i;
import f03.u;
import fr.q0;
import gx.b;
import i03.o;
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
import p7.CreationExtras;
import q7.d;
import y2.m;

/* JADX INFO: renamed from: e03.n, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a1\u0010\u0006\u001a\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lkotlin/Function1;", "Lgx/b;", "Loq/i0;", "navigateToGlobalDestination", "Lkotlin/Function0;", "navResult", "k", "(Ler/l;Ler/a;Lm2/r;I)V", "registeredaddress_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class Function1 {
    public static final void k(final l<? super b, i0> lVar, final a<i0> aVar, r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(-730478882);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(lVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(aVar) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (t.k()) {
                t.o(-730478882, i16, -1, "pl.gov.coi.mobywatel.feature.registeredaddress.presentation.RegisteredAddressNavContent (RegisteredAddressNavContent.kt:24)");
            }
            final s sVarJ = f00.r.J(null, rVarH, 0, 1);
            c.C1054c c1054c = c.C1054c.f46658a;
            boolean zG = ((i16 & 112) == 32) | ((i16 & 14) == 4) | rVarH.G(sVarJ);
            Object objE = rVarH.E();
            if (zG || objE == r.INSTANCE.a()) {
                objE = new l() { // from class: e03.d
                    @Override // er.l
                    public final Object b(Object obj) {
                        return Function1.l(aVar, lVar, sVarJ, (d1) obj);
                    }
                };
                rVarH.v(objE);
            }
            d0.j(sVarJ, c1054c, (l) objE, rVarH, s.f54562e | 48);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: e03.e
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return Function1.u(lVar, aVar, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(final a aVar, final l lVar, final s sVar, d1 d1Var) {
        f00.r.u(d1Var, c.C1054c.f46658a, null, m.b(-778339425, true, new er.r() { // from class: e03.f
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function1.m(aVar, lVar, sVar, (p114t0.f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, c.b.f46656a, null, m.b(-504662008, true, new er.r() { // from class: e03.g
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function1.o(sVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, c.a.f46654a, null, m.b(789756839, true, new er.r() { // from class: e03.h
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function1.r(sVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(final a aVar, final l lVar, final s sVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-778339425, i15, -1, "pl.gov.coi.mobywatel.feature.registeredaddress.presentation.RegisteredAddressNavContent.<anonymous>.<anonymous>.<anonymous> (RegisteredAddressNavContent.kt:31)");
        }
        y0 y0VarC = q7.b.f165175a.c(rVar, q7.b.f165177c);
        if (y0VarC == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
        }
        u uVar = (u) d.c(q0.c(u.class), y0VarC, null, j7.a.a(y0VarC, rVar, 0), y0VarC instanceof h ? ((h) y0VarC).x() : CreationExtras.b.f153222c, rVar, 0, 0);
        xw.b<i.d> bVarY1 = uVar.Y1();
        boolean zW = rVar.W(aVar) | rVar.W(lVar) | rVar.G(sVar);
        Object objE = rVar.E();
        if (zW || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: e03.j
                @Override // er.l
                public final Object b(Object obj) {
                    return Function1.n(aVar, lVar, sVar, (i.d) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(bVarY1, (l) objE, rVar, xw.b.f221619c);
        f03.h.i(uVar, rVar, 0);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n(a aVar, l lVar, s sVar, i.d dVar) {
        if (fr.t.c(dVar, i.d.a.f54600a)) {
            aVar.a();
        } else if (fr.t.c(dVar, i.d.C1292d.f54603a)) {
            lVar.b(jk2.a.C2462a.f103502a);
        } else if (dVar instanceof i.d.Error) {
            s.l(sVar, c.a.f46654a, ((i.d.Error) dVar).getError(), null, 4, null);
        } else {
            if (!(dVar instanceof i.d.GoToAddressHistory)) {
                throw new oq.p();
            }
            s.l(sVar, c.b.f46656a, ((i.d.GoToAddressHistory) dVar).getHistoryPayload(), null, 4, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o(final s sVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-504662008, i15, -1, "pl.gov.coi.mobywatel.feature.registeredaddress.presentation.RegisteredAddressNavContent.<anonymous>.<anonymous>.<anonymous> (RegisteredAddressNavContent.kt:53)");
        }
        f00.r.o(wVar, q0.c(o.class), sVar.g(c.b.f46656a), m.d(-1640593353, true, new q() { // from class: e03.k
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function1.p(sVar, (zx.d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), b.f46652a.b(), rVar, ((i15 >> 3) & 14) | 27648);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p(final s sVar, zx.d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-1640593353, i15, -1, "pl.gov.coi.mobywatel.feature.registeredaddress.presentation.RegisteredAddressNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (RegisteredAddressNavContent.kt:57)");
        }
        g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: e03.l
                @Override // er.l
                public final Object b(Object obj) {
                    return Function1.q(sVar, (i03.a) obj);
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
    public static final i0 q(s sVar, i03.a aVar) {
        if (!fr.t.c(aVar, i03.a.C2061a.f87767a)) {
            throw new oq.p();
        }
        sVar.c();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r(final s sVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(789756839, i15, -1, "pl.gov.coi.mobywatel.feature.registeredaddress.presentation.RegisteredAddressNavContent.<anonymous>.<anonymous>.<anonymous> (RegisteredAddressNavContent.kt:68)");
        }
        c.a aVar = c.a.f46654a;
        f00.r.r(wVar, aVar, sVar.g(aVar), m.d(1831740006, true, new q() { // from class: e03.i
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function1.s(sVar, (hb4.b) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, ((i15 >> 3) & 14) | 3120);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s(final s sVar, hb4.b bVar, r rVar, int i15) {
        if (t.k()) {
            t.o(1831740006, i15, -1, "pl.gov.coi.mobywatel.feature.registeredaddress.presentation.RegisteredAddressNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (RegisteredAddressNavContent.kt:72)");
        }
        xw.b<hb4.b.a> bVarY1 = bVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: e03.m
                @Override // er.l
                public final Object b(Object obj) {
                    return Function1.t(sVar, (hb4.b.a) obj);
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
    public static final i0 t(s sVar, hb4.b.a aVar) {
        if (!fr.t.c(aVar, hb4.b.a.C1910a.f83033a)) {
            throw new oq.p();
        }
        sVar.c();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u(l lVar, a aVar, int i15, r rVar, int i16) {
        k(lVar, aVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
