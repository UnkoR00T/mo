package p037e73;

import androidx.p016lifecycle.t0;
import androidx.p016lifecycle.y0;
import dx.i;
import er.l;
import f00.f0;
import f00.r;
import f00.s;
import fr.q;
import fr.q0;
import g53.a;
import g53.k;
import iy.b0;
import k53.b;
import k53.c;
import l53.j;
import mr.g;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import p076m2.t;
import p114t0.f;
import p136y9.b1;
import p136y9.d1;
import p136y9.g1;
import p136y9.w;
import p53.RepeatNewPinNavResultData;
import p7.CreationExtras;
import q7.d;
import tq.e;
import y2.m;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Ly9/d1;", "Lf00/s;", "destinationNavigator", "Loq/i0;", "h", "(Ly9/d1;Lf00/s;)V", "Ly9/w;", "navBackStackEntry", "Lk53/c;", "o", "(Ly9/w;Lf00/s;Lm2/r;I)Lk53/c;", "settings_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class h {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class a extends q implements l<RepeatNewPinNavResultData, i0> {
        a(Object obj) {
            super(1, obj, n53.l.class, "retrieveNavigationData", "retrieveNavigationData(Lpl/gov/coi/mobywatel/feature/settings/presentation/biometriclogin/changepin/repeatnewpin/model/RepeatNewPinNavResultData;)V", 0);
        }

        public final void E(RepeatNewPinNavResultData repeatNewPinNavResultData) {
            ((n53.l) this.f66391b).w9(repeatNewPinNavResultData);
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(RepeatNewPinNavResultData repeatNewPinNavResultData) {
            E(repeatNewPinNavResultData);
            return i0.f148189a;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class b extends q implements l<e<? super i<? extends dx.b, ? extends b0>>, Object> {
        b(Object obj) {
            super(1, obj, c.class, "getAuthorizationData", "getAuthorizationData(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // er.l
        /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
        public final Object b(e<? super i<? extends dx.b, b0>> eVar) {
            return ((c) this.f66391b).O8(eVar);
        }
    }

    public static final void h(d1 d1Var, final s sVar) {
        w.a aVar = w.a.f48273a;
        d1 d1Var2 = new d1(d1Var.getProvider(), aVar.getRoute(), w.c.f48277a.getRoute());
        r.u(d1Var2, aVar, null, m.b(239915037, true, new er.r() { // from class: e73.b
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return h.i(sVar, (f) obj, (w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        r.u(d1Var2, w.b.f48275a, null, m.b(986727814, true, new er.r() { // from class: e73.c
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return h.k(sVar, (f) obj, (w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        r.u(d1Var2, w.d.f48279a, null, m.b(501782565, true, new er.r() { // from class: e73.d
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return h.m(sVar, (f) obj, (w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        d1Var.i(d1Var2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(final s sVar, f fVar, w wVar, p076m2.r rVar, int i15) {
        if (t.k()) {
            t.o(239915037, i15, -1, "pl.gov.coi.mobywatel.feature.settings.presentation.navigation.addChangePinGraph.<anonymous>.<anonymous> (ChangePinGraph.kt:33)");
        }
        final c cVarO = o(wVar, sVar, rVar, ((i15 >> 3) & 14) | (s.f54562e << 3));
        y0 y0VarC = q7.b.f165175a.c(rVar, q7.b.f165177c);
        if (y0VarC == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
        }
        k kVar = (k) d.c(q0.c(k.class), y0VarC, null, j7.a.a(y0VarC, rVar, 0), y0VarC instanceof androidx.p016lifecycle.h ? ((androidx.p016lifecycle.h) y0VarC).x() : CreationExtras.b.f153222c, rVar, 0, 0);
        xw.b<g53.a.d> bVarY1 = kVar.Y1();
        boolean zG = rVar.G(cVarO) | rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new l() { // from class: e73.g
                @Override // er.l
                public final Object b(Object obj) {
                    return h.j(cVarO, sVar, (a.d) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(bVarY1, (l) objE, rVar, xw.b.f221619c);
        g53.f.e(kVar, rVar, 0);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j(c cVar, s sVar, g53.a.d dVar) {
        if (dVar instanceof g53.a.d.NavigateToNewPinScreen) {
            cVar.Z6(((g53.a.d.NavigateToNewPinScreen) dVar).getDecryptedPassword());
            s.i(sVar, w.b.f48275a, null, null, 6, null);
        } else if (fr.t.c(dVar, g53.a.d.C1600a.f70725a)) {
            g73.c.b(sVar, w.c.f48277a, false, 2, null);
        } else if (dVar instanceof g53.a.d.ShowNavigationDialog) {
            s.i(sVar, i0.f48175a, ((g53.a.d.ShowNavigationDialog) dVar).getNavigationDialogModel(), null, 4, null);
        } else if (dVar instanceof g53.a.d.CloseWithSnackBarInfo) {
            s.i(sVar, v.f48267a, ((g53.a.d.CloseWithSnackBarInfo) dVar).getResultData(), null, 4, null);
        } else {
            if (!(dVar instanceof g53.a.d.OnError)) {
                throw new p();
            }
            s.l(sVar, l0.f48195a, ((g53.a.d.OnError) dVar).getResultData(), null, 4, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k(final s sVar, f fVar, w wVar, p076m2.r rVar, int i15) {
        if (t.k()) {
            t.o(986727814, i15, -1, "pl.gov.coi.mobywatel.feature.settings.presentation.navigation.addChangePinGraph.<anonymous>.<anonymous> (ChangePinGraph.kt:62)");
        }
        o(wVar, sVar, rVar, ((i15 >> 3) & 14) | (s.f54562e << 3));
        y0 y0VarC = q7.b.f165175a.c(rVar, q7.b.f165177c);
        if (y0VarC == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
        }
        j jVar = (j) d.c(q0.c(j.class), y0VarC, null, j7.a.a(y0VarC, rVar, 0), y0VarC instanceof androidx.p016lifecycle.h ? ((androidx.p016lifecycle.h) y0VarC).x() : CreationExtras.b.f153222c, rVar, 0, 0);
        xw.b<l53.a.b> bVarY1 = jVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new l() { // from class: e73.e
                @Override // er.l
                public final Object b(Object obj) {
                    return h.l(sVar, (l53.a.b) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(bVarY1, (l) objE, rVar, xw.b.f221619c);
        l53.f.e(jVar, rVar, 0);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(s sVar, l53.a.b bVar) {
        if (fr.t.c(bVar, l53.a.b.C2813a.f116267a)) {
            g73.c.b(sVar, w.c.f48277a, false, 2, null);
        } else if (bVar instanceof l53.a.b.ShowNavigationDialog) {
            s.i(sVar, i0.f48175a, ((l53.a.b.ShowNavigationDialog) bVar).getNavigationDialogModel(), null, 4, null);
        } else {
            if (!(bVar instanceof l53.a.b.C2814b)) {
                throw new p();
            }
            s.i(sVar, w.d.f48279a, ((l53.a.b.C2814b) bVar).getResultData(), null, 4, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(final s sVar, f fVar, w wVar, p076m2.r rVar, int i15) {
        if (t.k()) {
            t.o(501782565, i15, -1, "pl.gov.coi.mobywatel.feature.settings.presentation.navigation.addChangePinGraph.<anonymous>.<anonymous> (ChangePinGraph.kt:84)");
        }
        Object objO = o(wVar, sVar, rVar, ((i15 >> 3) & 14) | (s.f54562e << 3));
        y0 y0VarC = q7.b.f165175a.c(rVar, q7.b.f165177c);
        if (y0VarC == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
        }
        n53.l lVar = (n53.l) d.c(q0.c(n53.l.class), y0VarC, null, j7.a.a(y0VarC, rVar, 0), y0VarC instanceof androidx.p016lifecycle.h ? ((androidx.p016lifecycle.h) y0VarC).x() : CreationExtras.b.f153222c, rVar, 0, 0);
        w.d dVar = w.d.f48279a;
        boolean zG = rVar.G(lVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new a(lVar);
            rVar.v(objE);
        }
        sVar.f(dVar, (l) ((g) objE));
        boolean zG2 = rVar.G(objO);
        Object objE2 = rVar.E();
        if (zG2 || objE2 == p076m2.r.INSTANCE.a()) {
            objE2 = new b(objO);
            rVar.v(objE2);
        }
        lVar.x9((l) ((g) objE2));
        xw.b<n53.a.c> bVarY1 = lVar.Y1();
        boolean zG3 = rVar.G(sVar);
        Object objE3 = rVar.E();
        if (zG3 || objE3 == p076m2.r.INSTANCE.a()) {
            objE3 = new l() { // from class: e73.f
                @Override // er.l
                public final Object b(Object obj) {
                    return h.n(sVar, (n53.a.c) obj);
                }
            };
            rVar.v(objE3);
        }
        f0.b(bVarY1, (l) objE3, rVar, xw.b.f221619c);
        n53.f.e(lVar, rVar, 0);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n(s sVar, n53.a.c cVar) {
        if (fr.t.c(cVar, n53.a.c.C3283a.f132235a)) {
            sVar.c();
        } else if (cVar instanceof n53.a.c.CloseWithSnackBarInfo) {
            s.i(sVar, v.f48267a, ((n53.a.c.CloseWithSnackBarInfo) cVar).getResultData(), null, 4, null);
        } else if (cVar instanceof n53.a.c.OnError) {
            s.i(sVar, e0.f48145a, ((n53.a.c.OnError) cVar).getResultData(), null, 4, null);
        } else if (cVar instanceof n53.a.c.ShowNavigationDialog) {
            s.i(sVar, i0.f48175a, ((n53.a.c.ShowNavigationDialog) cVar).getNavigationDialogModel(), null, 4, null);
        } else {
            if (!fr.t.c(cVar, n53.a.c.b.f132236a)) {
                throw new p();
            }
            g73.c.b(sVar, w.c.f48277a, false, 2, null);
        }
        return i0.f148189a;
    }

    private static final c o(w wVar, final s sVar, p076m2.r rVar, int i15) {
        p076m2.r rVar2;
        t0 t0VarC;
        if (t.k()) {
            t.o(-1166654416, i15, -1, "pl.gov.coi.mobywatel.feature.settings.presentation.navigation.createChangePinSharedViewModel (ChangePinGraph.kt:123)");
        }
        g1 navController = sVar.getNavController();
        rVar.X(-980107958);
        b1 parent = wVar.getDestination().getParent();
        String strU = parent != null ? parent.u() : null;
        if (strU == null) {
            rVar.X(-1208351070);
            y0 y0VarC = q7.b.f165175a.c(rVar, q7.b.f165177c);
            if (y0VarC == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            rVar2 = rVar;
            t0VarC = d.c(q0.c(k53.d.class), y0VarC, null, j7.a.a(y0VarC, rVar, 0), y0VarC instanceof androidx.p016lifecycle.h ? ((androidx.p016lifecycle.h) y0VarC).x() : CreationExtras.b.f153222c, rVar2, 0, 0);
            rVar2.R();
            rVar2.R();
        } else {
            rVar2 = rVar;
            rVar2.X(-1285905955);
            rVar2.R();
            boolean zW = rVar2.W(wVar);
            Object objE = rVar2.E();
            if (zW || objE == p076m2.r.INSTANCE.a()) {
                objE = navController.p(strU);
                rVar2.v(objE);
            }
            w wVar2 = (w) objE;
            t0VarC = d.c(q0.c(k53.d.class), wVar2, null, j7.a.a(wVar2, rVar2, 0), wVar2 != null ? wVar2.x() : CreationExtras.b.f153222c, rVar2, 0, 0);
            rVar2.R();
        }
        k53.d dVar = (k53.d) t0VarC;
        xw.b<k53.b> bVarY1 = dVar.Y1();
        boolean z15 = (((i15 & 112) ^ 48) > 32 && rVar2.G(sVar)) || (i15 & 48) == 32;
        Object objE2 = rVar2.E();
        if (z15 || objE2 == p076m2.r.INSTANCE.a()) {
            objE2 = new l() { // from class: e73.a
                @Override // er.l
                public final Object b(Object obj) {
                    return h.p(sVar, (b) obj);
                }
            };
            rVar2.v(objE2);
        }
        f0.b(bVarY1, (l) objE2, rVar2, xw.b.f221619c);
        oz.l.b(dVar.getLifecycleConnector(), rVar2, 0);
        if (t.k()) {
            t.n();
        }
        return dVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p(s sVar, k53.b bVar) {
        if (!fr.t.c(bVar, k53.b.a.f108609a)) {
            throw new p();
        }
        g73.c.b(sVar, w.c.f48277a, false, 2, null);
        return i0.f148189a;
    }
}
