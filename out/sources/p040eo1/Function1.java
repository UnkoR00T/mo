package p040eo1;

import androidx.p016lifecycle.h;
import androidx.p016lifecycle.y0;
import er.l;
import er.p;
import f00.d0;
import f00.f0;
import f00.g0;
import f00.s;
import fo1.b0;
import fo1.q;
import fr.q0;
import j7.a;
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
import q7.b;
import q7.d;
import y2.m;

/* JADX INFO: renamed from: eo1.o, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a#\u0010\u0004\u001a\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lkotlin/Function1;", "Leo1/p;", "Loq/i0;", "navResult", "n", "(Ler/l;Lm2/r;I)V", "deputycard_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class Function1 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 A(l lVar, int i15, r rVar, int i16) {
        n(lVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void n(final l<? super p, i0> lVar, r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(1906656165);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(lVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(1906656165, i16, -1, "pl.gov.coi.mobywatel.feature.deputy.presentation.DeputyCardNavContent (DeputyCardNavContent.kt:22)");
            }
            final s sVarJ = f00.r.J(null, rVarH, 0, 1);
            a.C1237a c1237a = a.C1237a.f52432a;
            boolean zG = rVarH.G(sVarJ) | ((i16 & 14) == 4);
            Object objE = rVarH.E();
            if (zG || objE == r.INSTANCE.a()) {
                objE = new l() { // from class: eo1.b
                    @Override // er.l
                    public final Object b(Object obj) {
                        return Function1.o(lVar, sVarJ, (d1) obj);
                    }
                };
                rVarH.v(objE);
            }
            d0.j(sVarJ, c1237a, (l) objE, rVarH, s.f54562e | 48);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: eo1.f
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return Function1.A(lVar, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final i0 o(final l lVar, final s sVar, d1 d1Var) {
        f00.r.u(d1Var, a.C1237a.f52432a, null, m.b(1004530308, true, new er.r() { // from class: eo1.g
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function1.p(lVar, sVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, a.d.f52438a, null, m.b(-963573061, true, new er.r() { // from class: eo1.h
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function1.r(sVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.t(d1Var, a.b.f52434a, new g0.Dialog(null, 1, 0 == true ? 1 : 0), m.b(1635370876, true, new er.r() { // from class: eo1.i
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function1.u(sVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }));
        f00.r.u(d1Var, a.c.f52436a, null, m.b(-60652483, true, new er.r() { // from class: eo1.j
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function1.x(sVar, lVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p(final l lVar, final s sVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(1004530308, i15, -1, "pl.gov.coi.mobywatel.feature.deputy.presentation.DeputyCardNavContent.<anonymous>.<anonymous>.<anonymous> (DeputyCardNavContent.kt:29)");
        }
        y0 y0VarC = b.f165175a.c(rVar, b.f165177c);
        if (y0VarC == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
        }
        b0 b0Var = (b0) d.c(q0.c(b0.class), y0VarC, null, a.a(y0VarC, rVar, 0), y0VarC instanceof h ? ((h) y0VarC).x() : CreationExtras.b.f153222c, rVar, 0, 0);
        xw.b<fo1.f> bVarY1 = b0Var.Y1();
        boolean zW = rVar.W(lVar) | rVar.G(sVar);
        Object objE = rVar.E();
        if (zW || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: eo1.n
                @Override // er.l
                public final Object b(Object obj) {
                    return Function1.q(lVar, sVar, (fo1.f) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(bVarY1, (l) objE, rVar, xw.b.f221619c);
        q.g(b0Var, rVar, 0);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(l lVar, s sVar, fo1.f fVar) {
        if (fr.t.c(fVar, fo1.f.a.f65695a)) {
            lVar.b(p.a.f52460a);
        } else if (fr.t.c(fVar, fo1.f.b.f65696a)) {
            lVar.b(p.b.f52461a);
        } else if (fVar instanceof fo1.f.ShowDialog) {
            s.i(sVar, a.b.f52434a, ((fo1.f.ShowDialog) fVar).getDialogData(), null, 4, null);
        } else {
            if (!(fVar instanceof fo1.f.ShowAsyncDownloadLoader)) {
                throw new oq.p();
            }
            sVar.h(a.c.f52436a, ((fo1.f.ShowAsyncDownloadLoader) fVar).getSetupData(), a.C1237a.f52432a);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r(final s sVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-963573061, i15, -1, "pl.gov.coi.mobywatel.feature.deputy.presentation.DeputyCardNavContent.<anonymous>.<anonymous>.<anonymous> (DeputyCardNavContent.kt:53)");
        }
        a.d dVar = a.d.f52438a;
        f00.r.D(wVar, dVar, sVar.e(dVar), m.d(-1917015654, true, new er.q() { // from class: eo1.k
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
            t.o(-1917015654, i15, -1, "pl.gov.coi.mobywatel.feature.deputy.presentation.DeputyCardNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DeputyCardNavContent.kt:57)");
        }
        xw.b<hb4.b.a> bVarY1 = bVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: eo1.e
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
    public static final i0 u(final s sVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(1635370876, i15, -1, "pl.gov.coi.mobywatel.feature.deputy.presentation.DeputyCardNavContent.<anonymous>.<anonymous>.<anonymous> (DeputyCardNavContent.kt:69)");
        }
        a.b bVar = a.b.f52434a;
        f00.r.D(wVar, bVar, sVar.e(bVar), m.d(1247092613, true, new er.q() { // from class: eo1.l
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function1.v(sVar, (cb4.f) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, ((i15 >> 3) & 14) | 3120);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v(final s sVar, cb4.f fVar, r rVar, int i15) {
        if (t.k()) {
            t.o(1247092613, i15, -1, "pl.gov.coi.mobywatel.feature.deputy.presentation.DeputyCardNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DeputyCardNavContent.kt:73)");
        }
        xw.b<cb4.f.a> bVarY1 = fVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: eo1.c
                @Override // er.l
                public final Object b(Object obj) {
                    return Function1.w(sVar, (cb4.f.a) obj);
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
    public static final i0 w(s sVar, cb4.f.a aVar) {
        if (!fr.t.c(aVar, cb4.f.a.C0669a.f24980a)) {
            throw new oq.p();
        }
        sVar.c();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x(final s sVar, final l lVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-60652483, i15, -1, "pl.gov.coi.mobywatel.feature.deputy.presentation.DeputyCardNavContent.<anonymous>.<anonymous>.<anonymous> (DeputyCardNavContent.kt:83)");
        }
        a.c cVar = a.c.f52436a;
        f00.r.D(wVar, cVar, sVar.e(cVar), m.d(-680952085, true, new er.q() { // from class: eo1.m
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function1.y(lVar, sVar, (gv3.b) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, ((i15 >> 3) & 14) | 3120);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 y(final l lVar, final s sVar, gv3.b bVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-680952085, i15, -1, "pl.gov.coi.mobywatel.feature.deputy.presentation.DeputyCardNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DeputyCardNavContent.kt:90)");
        }
        xw.b<gv3.b.a> bVarY1 = bVar.Y1();
        boolean zW = rVar.W(lVar) | rVar.G(sVar);
        Object objE = rVar.E();
        if (zW || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: eo1.d
                @Override // er.l
                public final Object b(Object obj) {
                    return Function1.z(lVar, sVar, (gv3.b.a) obj);
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
    public static final i0 z(l lVar, s sVar, gv3.b.a aVar) {
        if (aVar instanceof gv3.b.a.Close) {
            lVar.b(p.a.f52460a);
        } else if (aVar instanceof gv3.b.a.LoadDocument) {
            s.i(sVar, a.C1237a.f52432a, null, a.c.f52436a, 2, null);
        } else if (aVar instanceof gv3.b.a.Error) {
            s.i(sVar, a.d.f52438a, ((gv3.b.a.Error) aVar).getError(), null, 4, null);
        } else {
            if (!(aVar instanceof gv3.b.a.ShowDialog)) {
                throw new oq.p();
            }
            s.i(sVar, a.b.f52434a, ((gv3.b.a.ShowDialog) aVar).getModel(), null, 4, null);
        }
        return i0.f148189a;
    }
}
