package p038eh1;

import android.os.Bundle;
import androidx.p016lifecycle.h;
import er.l;
import er.p;
import er.q;
import f00.f0;
import f00.r;
import f00.s;
import fr.q0;
import fr.t;
import hi1.g0;
import hi1.v;
import jh1.SetupData;
import jh1.e0;
import ju.p0;
import l3.d0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p071kotlin.Metadata;
import p076m2.Function0;
import p076m2.d5;
import p076m2.g4;
import p136y9.d1;
import p136y9.g1;
import p136y9.w;
import p136y9.y0;
import p7.CreationExtras;
import q7.d;
import qh1.o;
import qh1.z;
import r54.c;
import tq.e;
import uh1.f;
import uh1.g;
import uh1.j;
import uq.b;
import vq.k;
import xh1.a;
import y2.m;

/* JADX INFO: renamed from: eh1.h1, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a{\u0010\u0011\u001a\u00020\u00022\u001e\u0010\u0003\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lkotlin/Function1;", "Lgx/b;", "Loq/i0;", "globalEventsHandler", "navigateToGlobalDestination", "Luh1/j;", "dashboardMainViewModel", "Luh1/h;", "dashboardMainNavigation", "Lf00/s;", "dashboardDestinationNavigator", "Lkotlin/Function0;", "navResult", "Lr54/c;", "localNotificationItem", "Ll3/d0;", "focusRequester", "z", "(Ler/l;Ler/l;Luh1/j;Luh1/h;Lf00/s;Ler/a;Lr54/c;Ll3/d0;Lm2/r;I)V", "dashboard_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class Function1 {

    /* JADX INFO: renamed from: eh1.h1$a */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class a extends k implements p<p0, e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f51438e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ c f51439f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ e0 f51440g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(c cVar, e0 e0Var, e<? super a> eVar) {
            super(2, eVar);
            this.f51439f = cVar;
            this.f51440g = e0Var;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            b.e();
            if (this.f51438e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            c cVar = this.f51439f;
            if (cVar != null) {
                this.f51440g.Y9(cVar);
            }
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, e<? super i0> eVar) {
            return ((a) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final e<i0> v(Object obj, e<?> eVar) {
            return new a(this.f51439f, this.f51440g, eVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A(j jVar, p136y9.e0 e0Var, y0 y0Var, Bundle bundle) {
        String strU = y0Var.u();
        if (t.c(strU, h.a.C1210a.f51406a.getRoute())) {
            jVar.c1(g.DOCUMENT_EXPIRED);
            return;
        }
        if (t.c(strU, h.a.b.f51408a.getRoute())) {
            jVar.c1(g.DOCUMENTS);
            return;
        }
        if (t.c(strU, h.a.f.f51416a.getRoute())) {
            jVar.c1(g.SERVICES);
            return;
        }
        if (t.c(strU, h.a.e.f51414a.getRoute())) {
            jVar.c1(g.SCANNER);
        } else if (t.c(strU, h.a.c.f51410a.getRoute())) {
            jVar.c1(g.GLOBAL_SEARCH);
        } else if (t.c(strU, h.a.d.f51412a.getRoute())) {
            jVar.c1(g.MORE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 B(s sVar, s sVar2, f.m mVar) {
        if (mVar instanceof f.m.b) {
            s.m(sVar, h.a.C1210a.f51406a, null, 2, null);
        } else if (t.c(mVar, f.m.c.f198404a)) {
            s.l(sVar, h.a.b.f51408a, new SetupData(null), null, 4, null);
        } else if (t.c(mVar, f.m.g.f198408a)) {
            s.m(sVar, h.a.f.f51416a, null, 2, null);
        } else if (t.c(mVar, f.m.C5162f.f198407a)) {
            s.m(sVar, h.a.e.f51414a, null, 2, null);
        } else if (t.c(mVar, f.m.d.f198405a)) {
            s.m(sVar, h.a.c.f51410a, null, 2, null);
        } else if (mVar instanceof f.m.e) {
            s.l(sVar, h.a.d.f51412a, new xh1.SetupData(null), null, 4, null);
        } else if (mVar instanceof f.m.h) {
            s.l(sVar2, h.g.f51430a, ((f.m.h) mVar).a(), null, 4, null);
        } else {
            if (!(mVar instanceof f.m.Error)) {
                throw new oq.p();
            }
            s.l(sVar2, h.e.f51426a, ((f.m.Error) mVar).getError(), null, 4, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 C(final l lVar, final s sVar, final s sVar2, final j jVar, final er.a aVar, final c cVar, final l lVar2, final d0 d0Var, d1 d1Var) {
        r.u(d1Var, h.a.f.f51416a, null, m.b(-938332314, true, new er.r() { // from class: eh1.b1
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function1.D(lVar, sVar, sVar2, jVar, (p114t0.f) obj, (w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        r.u(d1Var, h.a.g.f51418a, null, g.f51397a.g(), 2, null);
        r.u(d1Var, h.a.b.f51408a, null, m.b(-147764642, true, new er.r() { // from class: eh1.c1
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function1.F(sVar, sVar2, lVar, aVar, cVar, lVar2, d0Var, (p114t0.f) obj, (w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        r.u(d1Var, h.a.d.f51412a, null, m.b(1077901151, true, new er.r() { // from class: eh1.d1
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function1.K(sVar, lVar, sVar2, aVar, (p114t0.f) obj, (w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        r.u(d1Var, h.a.e.f51414a, null, m.b(-1991400352, true, new er.r() { // from class: eh1.e1
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function1.N(lVar, (p114t0.f) obj, (w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        r.u(d1Var, h.a.c.f51410a, null, m.b(-765734559, true, new er.r() { // from class: eh1.f1
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function1.Q(sVar, lVar, lVar2, (p114t0.f) obj, (w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        r.u(d1Var, h.a.C1210a.f51406a, null, m.b(459931234, true, new er.r() { // from class: eh1.g1
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function1.V(sVar2, sVar, aVar, (p114t0.f) obj, (w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 D(final l lVar, final s sVar, final s sVar2, final j jVar, p114t0.f fVar, w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-938332314, i15, -1, "pl.gov.coi.mobywatel.feature.dashboard.presentation.NestedNavContent.<anonymous>.<anonymous>.<anonymous> (NestedNavContent.kt:140)");
        }
        androidx.p016lifecycle.y0 y0VarC = q7.b.f165175a.c(rVar, q7.b.f165177c);
        if (y0VarC == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
        }
        g0 g0Var = (g0) d.c(q0.c(g0.class), y0VarC, null, j7.a.a(y0VarC, rVar, 0), y0VarC instanceof h ? ((h) y0VarC).x() : CreationExtras.b.f153222c, rVar, 0, 0);
        xw.b<hi1.e.g> bVarY1 = g0Var.Y1();
        boolean zW = rVar.W(lVar) | rVar.G(sVar) | rVar.G(sVar2) | rVar.G(jVar);
        Object objE = rVar.E();
        if (zW || objE == p076m2.r.INSTANCE.a()) {
            objE = new l() { // from class: eh1.l0
                @Override // er.l
                public final Object b(Object obj) {
                    return Function1.E(lVar, sVar, sVar2, jVar, (hi1.e.g) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(bVarY1, (l) objE, rVar, xw.b.f221619c);
        v.o(g0Var, rVar, 0);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 E(l lVar, s sVar, s sVar2, j jVar, hi1.e.g gVar) {
        if (gVar instanceof hi1.e.g.GoToServiceView) {
            lVar.b(((hi1.e.g.GoToServiceView) gVar).getGlobalEvent());
        } else if (gVar instanceof hi1.e.g.d) {
            sVar.c();
        } else if (gVar instanceof hi1.e.g.Error) {
            s.l(sVar2, h.e.f51426a, ((hi1.e.g.Error) gVar).getError(), null, 4, null);
        } else if (t.c(gVar, hi1.e.g.C1976e.f84813a)) {
            s.m(sVar2, h.i.f51434a, null, 2, null);
        } else if (t.c(gVar, hi1.e.g.c.f84811a)) {
            s.m(sVar2, h.C1211h.f51432a, null, 2, null);
        } else if (gVar instanceof hi1.e.g.ShowDialog) {
            s.l(sVar2, h.g.f51430a, ((hi1.e.g.ShowDialog) gVar).getDialog(), null, 4, null);
        } else {
            if (!t.c(gVar, hi1.e.g.a.f84809a)) {
                throw new oq.p();
            }
            jVar.U6();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 F(s sVar, final s sVar2, final l lVar, final er.a aVar, final c cVar, final l lVar2, final d0 d0Var, p114t0.f fVar, w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-147764642, i15, -1, "pl.gov.coi.mobywatel.feature.dashboard.presentation.NestedNavContent.<anonymous>.<anonymous>.<anonymous> (NestedNavContent.kt:179)");
        }
        r.o(wVar, q0.c(e0.class), sVar.g(h.a.b.f51408a), m.d(-1485926193, true, new q() { // from class: eh1.m0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function1.G(sVar2, lVar, aVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), m.d(1986763799, true, new q() { // from class: eh1.n0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function1.I(cVar, lVar2, d0Var, (e0) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 G(final s sVar, final l lVar, final er.a aVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1485926193, i15, -1, "pl.gov.coi.mobywatel.feature.dashboard.presentation.NestedNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NestedNavContent.kt:183)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar) | rVar.W(lVar) | rVar.W(aVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new l() { // from class: eh1.v0
                @Override // er.l
                public final Object b(Object obj) {
                    return Function1.H(sVar, lVar, aVar, (jh1.t.s) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(gVarY1, (l) objE, rVar, xw.b.f221619c);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 H(s sVar, l lVar, er.a aVar, jh1.t.s sVar2) {
        if (t.c(sVar2, jh1.t.s.i.f102957a)) {
            s.m(sVar, h.d.f51424a, null, 2, null);
        } else if (t.c(sVar2, jh1.t.s.f.f102954a)) {
            lVar.b(new zw0.a.ToAddDocument(true, zw0.a.ToAddDocument.EnumC6430a.ASYNC_MAIN_DOCUMENTS_LIST, false, true, null, 20, null));
        } else if (t.c(sVar2, jh1.t.s.g.f102955a)) {
            lVar.b(new zw0.a.ToAddDocument(true, null, false, false, null, 30, null));
        } else if (sVar2 instanceof jh1.t.s.OnGlobalEvent) {
            lVar.b(((jh1.t.s.OnGlobalEvent) sVar2).getGlobalEvent());
        } else if (sVar2 instanceof jh1.t.s.ShowDialog) {
            s.l(sVar, h.g.f51430a, ((jh1.t.s.ShowDialog) sVar2).getDialog(), null, 4, null);
        } else if (sVar2 instanceof jh1.t.s.Error) {
            s.l(sVar, h.e.f51426a, ((jh1.t.s.Error) sVar2).getError(), null, 4, null);
        } else if (t.c(sVar2, jh1.t.s.k.f102959a)) {
            lVar.b(new go2.a.ToNotification(go2.a.ToNotification.EnumC1705a.NOTIFICATION_HISTORY));
        } else if (t.c(sVar2, jh1.t.s.h.f102956a)) {
            lVar.b(b21.a.C0381a.f16145a);
        } else if (t.c(sVar2, jh1.t.s.j.f102958a)) {
            lVar.b(f02.b.a.f54579a);
        } else if (t.c(sVar2, jh1.t.s.b.f102950a)) {
            aVar.a();
        } else {
            if (!t.c(sVar2, jh1.t.s.e.f102953a)) {
                throw new oq.p();
            }
            lVar.b(oq3.a.f148261a);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 I(c cVar, l lVar, d0 d0Var, final e0 e0Var, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1986763799, i15, -1, "pl.gov.coi.mobywatel.feature.dashboard.presentation.NestedNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NestedNavContent.kt:242)");
        }
        boolean zG = rVar.G(cVar) | rVar.G(e0Var);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new a(cVar, e0Var, null);
            rVar.v(objE);
        }
        Function0.d(cVar, (p) objE, rVar, 0);
        boolean zG2 = rVar.G(e0Var);
        Object objE2 = rVar.E();
        if (zG2 || objE2 == p076m2.r.INSTANCE.a()) {
            objE2 = new l() { // from class: eh1.u0
                @Override // er.l
                public final Object b(Object obj) {
                    return Function1.J(e0Var, (gx.b) obj);
                }
            };
            rVar.v(objE2);
        }
        lVar.b((l) objE2);
        jh1.s.Q(e0Var, d0Var, rVar, i15 & 14, 0);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 J(e0 e0Var, gx.b bVar) {
        e0Var.T9(bVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 K(final s sVar, final l lVar, final s sVar2, final er.a aVar, p114t0.f fVar, w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1077901151, i15, -1, "pl.gov.coi.mobywatel.feature.dashboard.presentation.NestedNavContent.<anonymous>.<anonymous>.<anonymous> (NestedNavContent.kt:256)");
        }
        r.o(wVar, q0.c(xh1.v.class), sVar.g(h.a.d.f51412a), m.d(-260260400, true, new q() { // from class: eh1.q0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function1.L(sVar, lVar, sVar2, aVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), g.f51397a.h(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 L(final s sVar, final l lVar, final s sVar2, final er.a aVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-260260400, i15, -1, "pl.gov.coi.mobywatel.feature.dashboard.presentation.NestedNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NestedNavContent.kt:260)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar) | rVar.W(lVar) | rVar.G(sVar2) | rVar.W(aVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new l() { // from class: eh1.s0
                @Override // er.l
                public final Object b(Object obj) {
                    return Function1.M(sVar, lVar, sVar2, aVar, (a.s) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(gVarY1, (l) objE, rVar, xw.b.f221619c);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 M(s sVar, l lVar, s sVar2, er.a aVar, xh1.a.s sVar3) {
        if (t.c(sVar3, xh1.a.s.C5845a.f218737a)) {
            sVar.c();
        } else if (sVar3 instanceof xh1.a.s.ToHistory) {
            lVar.b(new y92.b.ToHistory(((xh1.a.s.ToHistory) sVar3).getExcludeItems()));
        } else if (t.c(sVar3, xh1.a.s.e.f218741a)) {
            lVar.b(sw0.a.C4774a.f184873a);
        } else if (t.c(sVar3, xh1.a.s.i.f218745a)) {
            lVar.b(n11.a.C3242a.f130646a);
        } else if (t.c(sVar3, xh1.a.s.r.f218754a)) {
            lVar.b(m83.a.b.f124583a);
        } else if (t.c(sVar3, xh1.a.s.k.f218747a)) {
            lVar.b(b21.a.C0381a.f16145a);
        } else if (t.c(sVar3, xh1.a.s.j.f218746a)) {
            lVar.b(new e53.a.ToSettings(e53.a.ToSettings.EnumC1095a.CHANGE_PASSWORD));
        } else if (t.c(sVar3, xh1.a.s.h.f218744a)) {
            lVar.b(new e53.a.ToSettings(e53.a.ToSettings.EnumC1095a.BIOMETRIC_LOGIN));
        } else if (t.c(sVar3, xh1.a.s.p.f218752a)) {
            lVar.b(new go2.a.ToNotification(go2.a.ToNotification.EnumC1705a.NOTIFICATION_SETTINGS));
        } else if (t.c(sVar3, xh1.a.s.l.f218748a)) {
            lVar.b(new e53.a.ToSettings(e53.a.ToSettings.EnumC1095a.CONTACT_DETAILS));
        } else if (t.c(sVar3, xh1.a.s.C5846s.f218755a)) {
            lVar.b(new nc3.a.ToUserData(false, 1, null));
        } else if (sVar3 instanceof xh1.a.s.ShowNavigationDialog) {
            s.l(sVar2, h.g.f51430a, ((xh1.a.s.ShowNavigationDialog) sVar3).getNavigationDialogModel(), null, 4, null);
        } else if (t.c(sVar3, xh1.a.s.n.f218750a)) {
            lVar.b(new po2.a.ToOnboarding(false, true, false, 5, null));
        } else if (sVar3 instanceof xh1.a.s.NavigateToErrorScreen) {
            s.l(sVar2, h.e.f51426a, ((xh1.a.s.NavigateToErrorScreen) sVar3).getResultData(), null, 4, null);
        } else if (t.c(sVar3, xh1.a.s.u.f218757a)) {
            lVar.b(new e53.a.ToSettings(e53.a.ToSettings.EnumC1095a.TURN_ON_BIOMETRIC_LOGIN));
        } else if (t.c(sVar3, xh1.a.s.o.f218751a)) {
            lVar.b(new e53.a.ToSettings(e53.a.ToSettings.EnumC1095a.LANGUAGE_SWITCH));
        } else if (t.c(sVar3, xh1.a.s.b.f218738a)) {
            aVar.a();
        } else if (t.c(sVar3, xh1.a.s.t.f218756a)) {
            lVar.b(hp3.a.C2012a.f86276a);
        } else if (t.c(sVar3, xh1.a.s.f.f218742a)) {
            lVar.b(e01.a.C1053a.f46494a);
        } else if (t.c(sVar3, xh1.a.s.q.f218753a)) {
            lVar.b(xz2.a.C5949a.f222433a);
        } else {
            if (!t.c(sVar3, xh1.a.s.g.f218743a)) {
                throw new oq.p();
            }
            lVar.b(kz0.a.C2755a.f113473a);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 N(final l lVar, p114t0.f fVar, w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1991400352, i15, -1, "pl.gov.coi.mobywatel.feature.dashboard.presentation.NestedNavContent.<anonymous>.<anonymous>.<anonymous> (NestedNavContent.kt:364)");
        }
        r.n(wVar, q0.c(ai1.m.class), m.d(-1586504462, true, new q() { // from class: eh1.j0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function1.O(lVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), g.f51397a.e(), rVar, ((i15 >> 3) & 14) | 3456);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 O(final l lVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1586504462, i15, -1, "pl.gov.coi.mobywatel.feature.dashboard.presentation.NestedNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NestedNavContent.kt:367)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zW = rVar.W(lVar);
        Object objE = rVar.E();
        if (zW || objE == p076m2.r.INSTANCE.a()) {
            objE = new l() { // from class: eh1.w0
                @Override // er.l
                public final Object b(Object obj) {
                    return Function1.P(lVar, (ai1.a) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(gVarY1, (l) objE, rVar, xw.b.f221619c);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 P(l lVar, ai1.a aVar) {
        if (t.c(aVar, ai1.a.C0134a.f6376a)) {
            lVar.b(wn3.d.f214210a);
        } else if (t.c(aVar, ai1.a.b.f6377a)) {
            lVar.b(wn3.v.f214230a);
        } else {
            if (!t.c(aVar, ai1.a.c.f6378a)) {
                throw new oq.p();
            }
            lVar.b(new wy2.c.ToIdentityConfirmation(wy2.c.ToIdentityConfirmation.InterfaceC5735a.b.f215978a));
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 Q(final s sVar, final l lVar, final l lVar2, p114t0.f fVar, w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-765734559, i15, -1, "pl.gov.coi.mobywatel.feature.dashboard.presentation.NestedNavContent.<anonymous>.<anonymous>.<anonymous> (NestedNavContent.kt:387)");
        }
        r.n(wVar, q0.c(z.class), m.d(-360838669, true, new q() { // from class: eh1.o0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function1.R(sVar, lVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), m.d(-547246097, true, new q() { // from class: eh1.p0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function1.T(lVar2, (z) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, ((i15 >> 3) & 14) | 3456);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 R(final s sVar, final l lVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-360838669, i15, -1, "pl.gov.coi.mobywatel.feature.dashboard.presentation.NestedNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NestedNavContent.kt:390)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar) | rVar.W(lVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new l() { // from class: eh1.y0
                @Override // er.l
                public final Object b(Object obj) {
                    return Function1.S(sVar, lVar, (qh1.a.h) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(gVarY1, (l) objE, rVar, xw.b.f221619c);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 S(s sVar, l lVar, qh1.a.h hVar) {
        if (hVar instanceof qh1.a.h.C4180a) {
            sVar.c();
        } else if (hVar instanceof qh1.a.h.GoToGlobalDestination) {
            lVar.b(((qh1.a.h.GoToGlobalDestination) hVar).getGlobalEvent());
        } else if (t.c(hVar, qh1.a.h.b.f166457a)) {
            lVar.b(new zw0.a.ToAddDocument(true, zw0.a.ToAddDocument.EnumC6430a.ASYNC_DOCUMENTS_LIST, false, false, null, 28, null));
        } else if (hVar instanceof qh1.a.h.GoToDocuments) {
            s.l(sVar, h.a.b.f51408a, new SetupData(((qh1.a.h.GoToDocuments) hVar).getAppMenuItem()), null, 4, null);
        } else if (hVar instanceof qh1.a.h.GoToMore) {
            s.l(sVar, h.a.d.f51412a, new xh1.SetupData(((qh1.a.h.GoToMore) hVar).getAppMenuItem()), null, 4, null);
        } else {
            if (!t.c(hVar, qh1.a.h.f.f166461a)) {
                throw new oq.p();
            }
            s.m(sVar, h.a.e.f51414a, null, 2, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 T(l lVar, final z zVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-547246097, i15, -1, "pl.gov.coi.mobywatel.feature.dashboard.presentation.NestedNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NestedNavContent.kt:423)");
        }
        boolean zG = rVar.G(zVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new l() { // from class: eh1.x0
                @Override // er.l
                public final Object b(Object obj) {
                    return Function1.U(zVar, (gx.b) obj);
                }
            };
            rVar.v(objE);
        }
        lVar.b((l) objE);
        o.o(zVar, rVar, i15 & 14);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 U(z zVar, gx.b bVar) {
        zVar.N9(bVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 V(final s sVar, final s sVar2, final er.a aVar, p114t0.f fVar, w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(459931234, i15, -1, "pl.gov.coi.mobywatel.feature.dashboard.presentation.NestedNavContent.<anonymous>.<anonymous>.<anonymous> (NestedNavContent.kt:430)");
        }
        r.n(wVar, q0.c(hh1.k.class), m.d(864827124, true, new q() { // from class: eh1.k0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function1.W(sVar, sVar2, aVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), g.f51397a.f(), rVar, ((i15 >> 3) & 14) | 3456);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 W(final s sVar, final s sVar2, final er.a aVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(864827124, i15, -1, "pl.gov.coi.mobywatel.feature.dashboard.presentation.NestedNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NestedNavContent.kt:433)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar) | rVar.G(sVar2) | rVar.W(aVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new l() { // from class: eh1.r0
                @Override // er.l
                public final Object b(Object obj) {
                    return Function1.X(sVar, sVar2, aVar, (hh1.e.c) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(gVarY1, (l) objE, rVar, xw.b.f221619c);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 X(s sVar, s sVar2, er.a aVar, hh1.e.c cVar) {
        if (cVar instanceof hh1.e.c.ShowDialog) {
            s.l(sVar, h.g.f51430a, ((hh1.e.c.ShowDialog) cVar).getDialog(), null, 4, null);
        } else if (cVar instanceof hh1.e.c.a) {
            s.l(sVar2, h.a.b.f51408a, new SetupData(null), null, 4, null);
        } else {
            if (!t.c(cVar, hh1.e.c.b.f84642a)) {
                throw new oq.p();
            }
            aVar.a();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 Y(l lVar, l lVar2, j jVar, uh1.h hVar, s sVar, er.a aVar, c cVar, d0 d0Var, int i15, p076m2.r rVar, int i16) {
        z(lVar, lVar2, jVar, hVar, sVar, aVar, cVar, d0Var, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void z(final l<? super l<? super gx.b, i0>, i0> lVar, final l<? super gx.b, i0> lVar2, final j jVar, final uh1.h hVar, final s sVar, final er.a<i0> aVar, final c cVar, final d0 d0Var, p076m2.r rVar, final int i15) {
        int i16;
        l<? super gx.b, i0> lVar3;
        er.a<i0> aVar2;
        final s sVar2;
        Object obj;
        p076m2.r rVarH = rVar.h(1283199175);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(lVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            lVar3 = lVar2;
            i16 |= rVarH.G(lVar3) ? 32 : 16;
        } else {
            lVar3 = lVar2;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= (i15 & 512) == 0 ? rVarH.W(jVar) : rVarH.G(jVar) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i16 |= (i15 & PKIFailureInfo.certConfirmed) == 0 ? rVarH.W(hVar) : rVarH.G(hVar) ? 2048 : 1024;
        }
        if ((i15 & 24576) == 0) {
            i16 |= (i15 & 32768) == 0 ? rVarH.W(sVar) : rVarH.G(sVar) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i15) == 0) {
            aVar2 = aVar;
            i16 |= rVarH.G(aVar2) ? PKIFailureInfo.unsupportedVersion : PKIFailureInfo.notAuthorized;
        } else {
            aVar2 = aVar;
        }
        if ((i15 & 1572864) == 0) {
            i16 |= rVarH.G(cVar) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if ((i15 & 12582912) == 0) {
            i16 |= rVarH.W(d0Var) ? 8388608 : 4194304;
        }
        if (rVarH.r((i16 & 4793491) != 4793490, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1283199175, i16, -1, "pl.gov.coi.mobywatel.feature.dashboard.presentation.NestedNavContent (NestedNavContent.kt:65)");
            }
            final s sVarJ = r.J(null, rVarH, 0, 1);
            g1 navController = sVarJ.getNavController();
            int i17 = i16 & 896;
            boolean z15 = i17 == 256 || ((i16 & 512) != 0 && rVarH.G(jVar));
            Object objE = rVarH.E();
            if (z15 || objE == p076m2.r.INSTANCE.a()) {
                objE = new y9.e0.c() { // from class: eh1.i0
                    @Override // y9.e0.c
                    public final void a(p136y9.e0 e0Var, y0 y0Var, Bundle bundle) {
                        Function1.A(jVar, e0Var, y0Var, bundle);
                    }
                };
                rVarH.v(objE);
            }
            navController.i((y9.e0.c) objE);
            xw.b<f.m> bVarY1 = hVar.Y1();
            int i18 = 57344 & i16;
            boolean zG = (i18 == 16384 || ((i16 & 32768) != 0 && rVarH.G(sVar))) | rVarH.G(sVarJ);
            Object objE2 = rVarH.E();
            if (zG || objE2 == p076m2.r.INSTANCE.a()) {
                objE2 = new l() { // from class: eh1.t0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return Function1.B(sVarJ, sVar, (f.m) obj2);
                    }
                };
                rVarH.v(objE2);
            }
            f0.b(bVarY1, (l) objE2, rVarH, xw.b.f221619c);
            h.a.g gVar = h.a.g.f51418a;
            boolean zG2 = ((i16 & 112) == 32) | rVarH.G(sVarJ) | (i18 == 16384 || ((i16 & 32768) != 0 && rVarH.G(sVar))) | (i17 == 256 || ((i16 & 512) != 0 && rVarH.G(jVar))) | ((458752 & i16) == 131072) | rVarH.G(cVar) | ((i16 & 14) == 4) | ((i16 & 29360128) == 8388608);
            Object objE3 = rVarH.E();
            if (zG2 || objE3 == p076m2.r.INSTANCE.a()) {
                sVar2 = sVarJ;
                final l<? super gx.b, i0> lVar4 = lVar3;
                final er.a<i0> aVar3 = aVar2;
                obj = new l() { // from class: eh1.z0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return Function1.C(lVar4, sVar2, sVar, jVar, aVar3, cVar, lVar, d0Var, (d1) obj2);
                    }
                };
                rVarH.v(obj);
            } else {
                sVar2 = sVarJ;
                obj = objE3;
            }
            f00.d0.j(sVar2, gVar, (l) obj, rVarH, s.f54562e | 48);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: eh1.a1
                @Override // er.p
                public final Object B(Object obj2, Object obj3) {
                    return Function1.Y(lVar, lVar2, jVar, hVar, sVar, aVar, cVar, d0Var, i15, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }
}
