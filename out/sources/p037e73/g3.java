package p037e73;

import a63.RepeatSetNewPinNavResultData;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.p016lifecycle.h;
import androidx.p016lifecycle.t0;
import androidx.p016lifecycle.y0;
import e63.j;
import er.l;
import f00.f0;
import f00.r;
import f00.s;
import fr.q;
import fr.q0;
import gx.b;
import mr.g;
import oq.i0;
import oq.p;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p071kotlin.Metadata;
import p076m2.t;
import p114t0.f;
import p136y9.b1;
import p136y9.d1;
import p136y9.g1;
import p136y9.w;
import p7.CreationExtras;
import q53.a;
import q53.i;
import q53.o;
import q7.d;
import s53.ConfirmPasswordNavResultData;
import x53.c;
import y2.m;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a;\u0010\t\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0004\b\t\u0010\n\u001a-\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0003¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Ly9/d1;", "Lf00/s;", "destinationNavigator", "Lkotlin/Function0;", "Loq/i0;", "navResult", "Lkotlin/Function1;", "Lgx/b;", "navigateToGlobalDestination", "l", "(Ly9/d1;Lf00/s;Ler/a;Ler/l;)V", "Ly9/w;", "navBackStackEntry", "Lx53/c;", "w", "(Ly9/w;Lf00/s;Ler/a;Lm2/r;I)Lx53/c;", "settings_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class g3 {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class a extends q implements l<ConfirmPasswordNavResultData, i0> {
        a(Object obj) {
            super(1, obj, o.class, "setup", "setup(Lpl/gov/coi/mobywatel/feature/settings/presentation/biometriclogin/confirmpassword/model/ConfirmPasswordNavResultData;)V", 0);
        }

        public final void E(ConfirmPasswordNavResultData confirmPasswordNavResultData) {
            ((o) this.f66391b).P5(confirmPasswordNavResultData);
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(ConfirmPasswordNavResultData confirmPasswordNavResultData) {
            E(confirmPasswordNavResultData);
            return i0.f148189a;
        }
    }

    public static final void l(d1 d1Var, final s sVar, final er.a<i0> aVar, final l<? super b, i0> lVar) {
        n0.a aVar2 = n0.a.f48205a;
        d1 d1Var2 = new d1(d1Var.getProvider(), aVar2.getRoute(), n0.b.f48207a.getRoute());
        r.u(d1Var2, aVar2, null, m.b(1980556846, true, new er.r() { // from class: e73.x2
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return g3.m(sVar, aVar, (f) obj, (w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        r.u(d1Var2, n0.e.f48213a, null, m.b(601763799, true, new er.r() { // from class: e73.y2
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return g3.o(sVar, aVar, (f) obj, (w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        r.u(d1Var2, n0.c.f48209a, null, m.b(-733609930, true, new er.r() { // from class: e73.z2
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return g3.q(sVar, aVar, (f) obj, (w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        r.u(d1Var2, n0.d.f48211a, null, m.b(-2068983659, true, new er.r() { // from class: e73.a3
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return g3.t(sVar, aVar, lVar, (f) obj, (w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        d1Var.i(d1Var2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(final s sVar, final er.a aVar, f fVar, w wVar, p076m2.r rVar, int i15) {
        if (t.k()) {
            t.o(1980556846, i15, -1, "pl.gov.coi.mobywatel.feature.settings.presentation.navigation.addTurnOnGraph.<anonymous>.<anonymous> (TurnOnGraph.kt:42)");
        }
        final c cVarW = w(wVar, sVar, aVar, rVar, ((i15 >> 3) & 14) | (s.f54562e << 3));
        y0 y0VarC = q7.b.f165175a.c(rVar, q7.b.f165177c);
        if (y0VarC == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
        }
        o oVar = (o) d.c(q0.c(o.class), y0VarC, null, j7.a.a(y0VarC, rVar, 0), y0VarC instanceof h ? ((h) y0VarC).x() : CreationExtras.b.f153222c, rVar, 0, 0);
        n0.a aVar2 = n0.a.f48205a;
        boolean zG = rVar.G(oVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new a(oVar);
            rVar.v(objE);
        }
        sVar.f(aVar2, (l) ((g) objE));
        xw.b<q53.a.c> bVarY1 = oVar.Y1();
        boolean zG2 = rVar.G(cVarW) | rVar.G(sVar) | rVar.W(aVar);
        Object objE2 = rVar.E();
        if (zG2 || objE2 == p076m2.r.INSTANCE.a()) {
            objE2 = new l() { // from class: e73.b3
                @Override // er.l
                public final Object b(Object obj) {
                    return g3.n(cVarW, sVar, aVar, (a.c) obj);
                }
            };
            rVar.v(objE2);
        }
        f0.b(bVarY1, (l) objE2, rVar, xw.b.f221619c);
        i.l(oVar, rVar, 0);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n(c cVar, s sVar, er.a aVar, q53.a.c cVar2) {
        if (cVar2 instanceof q53.a.c.SetNewPinScreen) {
            cVar.Q2(((q53.a.c.SetNewPinScreen) cVar2).getPassword());
            s.i(sVar, n0.e.f48213a, null, null, 6, null);
        } else if (!(cVar2 instanceof q53.a.c.b)) {
            if (cVar2 instanceof q53.a.c.Error) {
                s.l(sVar, l0.f48195a, ((q53.a.c.Error) cVar2).getErrorData(), null, 4, null);
            } else if (fr.t.c(cVar2, q53.a.c.e.f164885a)) {
                aVar.a();
            } else {
                if (!(cVar2 instanceof q53.a.c.ShowNavigationDialog)) {
                    throw new p();
                }
                s.i(sVar, i0.f48175a, ((q53.a.c.ShowNavigationDialog) cVar2).getNavigationDialogModel(), null, 4, null);
            }
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o(final s sVar, final er.a aVar, f fVar, w wVar, p076m2.r rVar, int i15) {
        if (t.k()) {
            t.o(601763799, i15, -1, "pl.gov.coi.mobywatel.feature.settings.presentation.navigation.addTurnOnGraph.<anonymous>.<anonymous> (TurnOnGraph.kt:77)");
        }
        w(wVar, sVar, aVar, rVar, ((i15 >> 3) & 14) | (s.f54562e << 3));
        y0 y0VarC = q7.b.f165175a.c(rVar, q7.b.f165177c);
        if (y0VarC == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
        }
        j jVar = (j) d.c(q0.c(j.class), y0VarC, null, j7.a.a(y0VarC, rVar, 0), y0VarC instanceof h ? ((h) y0VarC).x() : CreationExtras.b.f153222c, rVar, 0, 0);
        xw.b<e63.a.b> bVarY1 = jVar.Y1();
        boolean zW = rVar.W(aVar) | rVar.G(sVar);
        Object objE = rVar.E();
        if (zW || objE == p076m2.r.INSTANCE.a()) {
            objE = new l() { // from class: e73.w2
                @Override // er.l
                public final Object b(Object obj) {
                    return g3.p(aVar, sVar, (e63.a.b) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(bVarY1, (l) objE, rVar, xw.b.f221619c);
        e63.f.e(jVar, rVar, 0);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p(er.a aVar, s sVar, e63.a.b bVar) {
        if (fr.t.c(bVar, e63.a.b.C1108a.f47851a)) {
            aVar.a();
        } else if (bVar instanceof e63.a.b.NavigateToRepeatSetNewPinScreen) {
            s.i(sVar, n0.c.f48209a, ((e63.a.b.NavigateToRepeatSetNewPinScreen) bVar).getResultData(), null, 4, null);
        } else {
            if (!(bVar instanceof e63.a.b.c)) {
                throw new p();
            }
            s.i(sVar, i0.f48175a, ((e63.a.b.c) bVar).getNavigationDialogModel(), null, 4, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(final s sVar, final er.a aVar, f fVar, w wVar, p076m2.r rVar, int i15) {
        if (t.k()) {
            t.o(-733609930, i15, -1, "pl.gov.coi.mobywatel.feature.settings.presentation.navigation.addTurnOnGraph.<anonymous>.<anonymous> (TurnOnGraph.kt:99)");
        }
        int i16 = i15 >> 3;
        final c cVarW = w(wVar, sVar, aVar, rVar, (i16 & 14) | (s.f54562e << 3));
        boolean zG = rVar.G(cVarW) | rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new l() { // from class: e73.e3
                @Override // er.l
                public final Object b(Object obj) {
                    return g3.r(cVarW, sVar, (y53.j.a) obj);
                }
            };
            rVar.v(objE);
        }
        y53.j jVar = (y53.j) d.c(q0.c(y53.j.class), wVar, null, i7.a.a((Context) rVar.N(AndroidCompositionLocals_androidKt.c()), wVar.w()), kq.a.b(wVar.x(), (l) objE), rVar, ((i16 & 14) << 3) & 112, 0);
        xw.b<y53.a.c> bVarY1 = jVar.Y1();
        boolean zW = rVar.W(aVar) | rVar.G(sVar) | rVar.G(cVarW);
        Object objE2 = rVar.E();
        if (zW || objE2 == p076m2.r.INSTANCE.a()) {
            objE2 = new l() { // from class: e73.f3
                @Override // er.l
                public final Object b(Object obj) {
                    return g3.s(aVar, sVar, cVarW, (y53.a.c) obj);
                }
            };
            rVar.v(objE2);
        }
        f0.b(bVarY1, (l) objE2, rVar, xw.b.f221619c);
        y53.f.e(jVar, rVar, 0);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final y53.j r(c cVar, s sVar, y53.j.a aVar) {
        return aVar.a(new y53.j.a.SetupData(cVar.Q1(), (RepeatSetNewPinNavResultData) sVar.e(n0.c.f48209a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s(er.a aVar, s sVar, c cVar, y53.a.c cVar2) {
        if (fr.t.c(cVar2, y53.a.c.b.f224275a)) {
            aVar.a();
        } else if (fr.t.c(cVar2, y53.a.c.C6006a.f224274a)) {
            sVar.c();
        } else if (cVar2 instanceof y53.a.c.SelectLoginMethod) {
            cVar.o8(((y53.a.c.SelectLoginMethod) cVar2).getPin());
            s.i(sVar, n0.d.f48211a, null, null, 6, null);
        } else {
            if (!(cVar2 instanceof y53.a.c.d)) {
                throw new p();
            }
            s.i(sVar, i0.f48175a, ((y53.a.c.d) cVar2).getNavigationDialogModel(), null, 4, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t(final s sVar, final er.a aVar, final l lVar, f fVar, w wVar, p076m2.r rVar, int i15) {
        if (t.k()) {
            t.o(-2068983659, i15, -1, "pl.gov.coi.mobywatel.feature.settings.presentation.navigation.addTurnOnGraph.<anonymous>.<anonymous> (TurnOnGraph.kt:133)");
        }
        int i16 = i15 >> 3;
        final c cVarW = w(wVar, sVar, aVar, rVar, (i16 & 14) | (s.f54562e << 3));
        boolean zG = rVar.G(cVarW);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new l() { // from class: e73.c3
                @Override // er.l
                public final Object b(Object obj) {
                    return g3.u(cVarW, (b63.j.a) obj);
                }
            };
            rVar.v(objE);
        }
        b63.j jVar = (b63.j) d.c(q0.c(b63.j.class), wVar, null, i7.a.a((Context) rVar.N(AndroidCompositionLocals_androidKt.c()), wVar.w()), kq.a.b(wVar.x(), (l) objE), rVar, ((i16 & 14) << 3) & 112, 0);
        xw.b<b63.a.d> bVarY1 = jVar.Y1();
        boolean zW = rVar.W(lVar) | rVar.G(sVar) | rVar.W(aVar);
        Object objE2 = rVar.E();
        if (zW || objE2 == p076m2.r.INSTANCE.a()) {
            objE2 = new l() { // from class: e73.d3
                @Override // er.l
                public final Object b(Object obj) {
                    return g3.v(lVar, sVar, aVar, (b63.a.d) obj);
                }
            };
            rVar.v(objE2);
        }
        f0.b(bVarY1, (l) objE2, rVar, xw.b.f221619c);
        b63.g.g(jVar, rVar, 0);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b63.j u(c cVar, b63.j.a aVar) {
        return aVar.a(new b63.j.a.SetupData(cVar.Q1(), cVar.N5()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v(l lVar, s sVar, er.a aVar, b63.a.d dVar) {
        if (dVar instanceof b63.a.d.b) {
            lVar.b(new tg1.a.ToDashboard(false, 1, null));
        } else if (dVar instanceof b63.a.d.OnError) {
            s.i(sVar, e0.f48145a, ((b63.a.d.OnError) dVar).getResultData(), null, 4, null);
        } else if (dVar instanceof b63.a.d.ShowNavigationDialog) {
            s.i(sVar, i0.f48175a, ((b63.a.d.ShowNavigationDialog) dVar).getNavigationDialogModel(), null, 4, null);
        } else {
            if (!fr.t.c(dVar, b63.a.d.C0414a.f16885a)) {
                throw new p();
            }
            aVar.a();
        }
        return i0.f148189a;
    }

    private static final c w(w wVar, s sVar, final er.a<i0> aVar, p076m2.r rVar, int i15) {
        p076m2.r rVar2;
        t0 t0VarC;
        if (t.k()) {
            t.o(-1230197221, i15, -1, "pl.gov.coi.mobywatel.feature.settings.presentation.navigation.createTurnOnSharedViewModel (TurnOnGraph.kt:170)");
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
            t0VarC = d.c(q0.c(x53.d.class), y0VarC, null, j7.a.a(y0VarC, rVar, 0), y0VarC instanceof h ? ((h) y0VarC).x() : CreationExtras.b.f153222c, rVar2, 0, 0);
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
            t0VarC = d.c(q0.c(x53.d.class), wVar2, null, j7.a.a(wVar2, rVar2, 0), wVar2 != null ? wVar2.x() : CreationExtras.b.f153222c, rVar2, 0, 0);
            rVar2.R();
        }
        x53.d dVar = (x53.d) t0VarC;
        xw.b<x53.b> bVarY1 = dVar.Y1();
        boolean z15 = (((i15 & 896) ^ MLKEMEngine.KyberPolyBytes) > 256 && rVar2.W(aVar)) || (i15 & MLKEMEngine.KyberPolyBytes) == 256;
        Object objE2 = rVar2.E();
        if (z15 || objE2 == p076m2.r.INSTANCE.a()) {
            objE2 = new l() { // from class: e73.v2
                @Override // er.l
                public final Object b(Object obj) {
                    return g3.x(aVar, (x53.b) obj);
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
    public static final i0 x(er.a aVar, x53.b bVar) {
        if (!fr.t.c(bVar, x53.b.a.f216916a)) {
            throw new p();
        }
        aVar.a();
        return i0.f148189a;
    }
}
