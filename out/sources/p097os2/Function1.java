package p097os2;

import androidx.p016lifecycle.h;
import androidx.p016lifecycle.y0;
import er.l;
import er.p;
import er.q;
import f00.d0;
import f00.f0;
import f00.g0;
import f00.s;
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

/* JADX INFO: renamed from: os2.n, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a#\u0010\u0004\u001a\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lkotlin/Function1;", "Los2/p;", "Loq/i0;", "navResult", "n", "(Ler/l;Lm2/r;I)V", "pensionercard_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class Function1 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 A(l lVar, int i15, r rVar, int i16) {
        n(lVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void n(final l<? super p, i0> lVar, r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(-1684036279);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(lVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(-1684036279, i16, -1, "pl.gov.coi.mobywatel.feature.pensionercard.presentation.NavContent (NavContent.kt:22)");
            }
            final s sVarJ = f00.r.J(null, rVarH, 0, 1);
            o.d dVar = o.d.f149719a;
            boolean zG = rVarH.G(sVarJ) | ((i16 & 14) == 4);
            Object objE = rVarH.E();
            if (zG || objE == r.INSTANCE.a()) {
                objE = new l() { // from class: os2.a
                    @Override // er.l
                    public final Object b(Object obj) {
                        return Function1.o(lVar, sVarJ, (d1) obj);
                    }
                };
                rVarH.v(objE);
            }
            d0.j(sVarJ, dVar, (l) objE, rVarH, s.f54562e | 48);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: os2.e
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
        f00.r.u(d1Var, o.d.f149719a, null, m.b(1130643466, true, new er.r() { // from class: os2.f
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function1.p(lVar, sVar, (p114t0.f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, o.c.f149717a, null, m.b(99619443, true, new er.r() { // from class: os2.g
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function1.r(sVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.t(d1Var, o.a.f149713a, new g0.Dialog(null, 1, 0 == true ? 1 : 0), m.b(-315707374, true, new er.r() { // from class: os2.h
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function1.u(sVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }));
        f00.r.u(d1Var, o.b.f149715a, null, m.b(-731034191, true, new er.r() { // from class: os2.i
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
            t.o(1130643466, i15, -1, "pl.gov.coi.mobywatel.feature.pensionercard.presentation.NavContent.<anonymous>.<anonymous>.<anonymous> (NavContent.kt:29)");
        }
        y0 y0VarC = b.f165175a.c(rVar, b.f165177c);
        if (y0VarC == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
        }
        ps2.w wVar2 = (ps2.w) d.c(q0.c(ps2.w.class), y0VarC, null, a.a(y0VarC, rVar, 0), y0VarC instanceof h ? ((h) y0VarC).x() : CreationExtras.b.f153222c, rVar, 0, 0);
        xw.b<ps2.f> bVarY1 = wVar2.Y1();
        boolean zW = rVar.W(lVar) | rVar.G(sVar);
        Object objE = rVar.E();
        if (zW || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: os2.m
                @Override // er.l
                public final Object b(Object obj) {
                    return Function1.q(lVar, sVar, (ps2.f) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(bVarY1, (l) objE, rVar, xw.b.f221619c);
        ps2.p.d(wVar2, rVar, 0);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(l lVar, s sVar, ps2.f fVar) {
        if (fr.t.c(fVar, ps2.f.a.f162278a)) {
            lVar.b(p.a.f149721a);
        } else if (fr.t.c(fVar, ps2.f.b.f162279a)) {
            lVar.b(p.b.f149722a);
        } else if (fVar instanceof ps2.f.ShowDialog) {
            s.i(sVar, o.a.f149713a, ((ps2.f.ShowDialog) fVar).getDialogData(), null, 4, null);
        } else if (fVar instanceof ps2.f.ShowError) {
            s.i(sVar, o.c.f149717a, ((ps2.f.ShowError) fVar).getError(), null, 4, null);
        } else if (fVar instanceof ps2.f.ShowAsyncDownloadLoader) {
            sVar.h(o.b.f149715a, ((ps2.f.ShowAsyncDownloadLoader) fVar).getSetupData(), o.d.f149719a);
        } else {
            if (!(fVar instanceof ps2.f.c)) {
                throw new oq.p();
            }
            lVar.b(p.c.f149723a);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r(final s sVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(99619443, i15, -1, "pl.gov.coi.mobywatel.feature.pensionercard.presentation.NavContent.<anonymous>.<anonymous>.<anonymous> (NavContent.kt:64)");
        }
        o.c cVar = o.c.f149717a;
        f00.r.D(wVar, cVar, sVar.e(cVar), m.d(-1534020300, true, new q() { // from class: os2.k
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
            t.o(-1534020300, i15, -1, "pl.gov.coi.mobywatel.feature.pensionercard.presentation.NavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NavContent.kt:68)");
        }
        xw.b<hb4.b.a> bVarY1 = bVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: os2.d
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
            t.o(-315707374, i15, -1, "pl.gov.coi.mobywatel.feature.pensionercard.presentation.NavContent.<anonymous>.<anonymous>.<anonymous> (NavContent.kt:80)");
        }
        o.a aVar = o.a.f149713a;
        f00.r.D(wVar, aVar, sVar.e(aVar), m.d(-352846487, true, new q() { // from class: os2.l
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
            t.o(-352846487, i15, -1, "pl.gov.coi.mobywatel.feature.pensionercard.presentation.NavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NavContent.kt:84)");
        }
        xw.b<cb4.f.a> bVarY1 = fVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: os2.c
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
            t.o(-731034191, i15, -1, "pl.gov.coi.mobywatel.feature.pensionercard.presentation.NavContent.<anonymous>.<anonymous>.<anonymous> (NavContent.kt:94)");
        }
        o.b bVar = o.b.f149715a;
        f00.r.D(wVar, bVar, sVar.e(bVar), m.d(-1149333437, true, new q() { // from class: os2.j
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
            t.o(-1149333437, i15, -1, "pl.gov.coi.mobywatel.feature.pensionercard.presentation.NavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NavContent.kt:101)");
        }
        xw.b<gv3.b.a> bVarY1 = bVar.Y1();
        boolean zW = rVar.W(lVar) | rVar.G(sVar);
        Object objE = rVar.E();
        if (zW || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: os2.b
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
            lVar.b(p.a.f149721a);
        } else if (aVar instanceof gv3.b.a.LoadDocument) {
            s.i(sVar, o.d.f149719a, null, o.b.f149715a, 2, null);
        } else if (aVar instanceof gv3.b.a.Error) {
            s.i(sVar, o.c.f149717a, ((gv3.b.a.Error) aVar).getError(), null, 4, null);
        } else {
            if (!(aVar instanceof gv3.b.a.ShowDialog)) {
                throw new oq.p();
            }
            s.i(sVar, o.a.f149713a, ((gv3.b.a.ShowDialog) aVar).getModel(), null, 4, null);
        }
        return i0.f148189a;
    }
}
