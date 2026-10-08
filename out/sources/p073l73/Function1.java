package p073l73;

import androidx.p016lifecycle.h;
import androidx.p016lifecycle.y0;
import er.a;
import er.l;
import er.p;
import er.q;
import f00.d0;
import f00.f0;
import f00.g0;
import f00.s;
import fr.q0;
import gx.b;
import o73.ToExtendStudentCardValidity;
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

/* JADX INFO: renamed from: l73.w, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a1\u0010\u0006\u001a\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lkotlin/Function1;", "Lgx/b;", "Loq/i0;", "navigateToGlobalDestination", "Lkotlin/Function0;", "navResult", "k", "(Ler/l;Ler/a;Lm2/r;I)V", "studentcard_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class Function1 {
    public static final void k(final l<? super b, i0> lVar, final a<i0> aVar, r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(-312459708);
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
                t.o(-312459708, i16, -1, "pl.gov.coi.mobywatel.feature.studentcard.presentation.main.StudentCardNavContent (StudentCardNavContent.kt:22)");
            }
            final s sVarJ = f00.r.J(null, rVarH, 0, 1);
            l.c cVar = l.c.f116898a;
            boolean zG = ((i16 & 112) == 32) | ((i16 & 14) == 4) | rVarH.G(sVarJ);
            Object objE = rVarH.E();
            if (zG || objE == r.INSTANCE.a()) {
                objE = new l() { // from class: l73.m
                    @Override // er.l
                    public final Object b(Object obj) {
                        return Function1.l(aVar, lVar, sVarJ, (d1) obj);
                    }
                };
                rVarH.v(objE);
            }
            d0.j(sVarJ, cVar, (l) objE, rVarH, s.f54562e | 48);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: l73.n
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return Function1.u(lVar, aVar, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final i0 l(final a aVar, final l lVar, final s sVar, d1 d1Var) {
        f00.r.u(d1Var, l.c.f116898a, null, m.b(-1162943517, true, new er.r() { // from class: l73.o
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function1.m(aVar, lVar, sVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, l.b.f116896a, null, m.b(-563089190, true, new er.r() { // from class: l73.p
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function1.o(sVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.t(d1Var, l.a.f116894a, new g0.Dialog(null, 1, 0 == true ? 1 : 0), m.b(927479515, true, new er.r() { // from class: l73.q
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function1.r(sVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(final a aVar, final l lVar, final s sVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-1162943517, i15, -1, "pl.gov.coi.mobywatel.feature.studentcard.presentation.main.StudentCardNavContent.<anonymous>.<anonymous>.<anonymous> (StudentCardNavContent.kt:29)");
        }
        y0 y0VarC = q7.b.f165175a.c(rVar, q7.b.f165177c);
        if (y0VarC == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
        }
        i0 i0Var = (i0) d.c(q0.c(i0.class), y0VarC, null, j7.a.a(y0VarC, rVar, 0), y0VarC instanceof h ? ((h) y0VarC).x() : CreationExtras.b.f153222c, rVar, 0, 0);
        xw.b<g> bVarY1 = i0Var.Y1();
        boolean zW = rVar.W(aVar) | rVar.W(lVar) | rVar.G(sVar);
        Object objE = rVar.E();
        if (zW || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: l73.t
                @Override // er.l
                public final Object b(Object obj) {
                    return Function1.n(aVar, lVar, sVar, (g) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(bVarY1, (l) objE, rVar, xw.b.f221619c);
        b0.j(i0Var, rVar, 0);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n(a aVar, l lVar, s sVar, g gVar) {
        if (fr.t.c(gVar, g.a.f116796a)) {
            aVar.a();
        } else if (fr.t.c(gVar, g.e.f116800a)) {
            lVar.b(wn3.r.f214226a);
        } else if (fr.t.c(gVar, g.d.f116799a)) {
            lVar.b(new ToExtendStudentCardValidity(false, 1, null));
        } else if (gVar instanceof g.ShowDialog) {
            s.i(sVar, l.a.f116894a, ((g.ShowDialog) gVar).getDialogData(), null, 4, null);
        } else if (gVar instanceof g.Error) {
            s.i(sVar, l.b.f116896a, ((g.Error) gVar).getError(), null, 4, null);
        } else {
            if (!(gVar instanceof g.GoToServiceOrDocument)) {
                throw new oq.p();
            }
            lVar.b(((g.GoToServiceOrDocument) gVar).getGlobalEvent());
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o(final s sVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-563089190, i15, -1, "pl.gov.coi.mobywatel.feature.studentcard.presentation.main.StudentCardNavContent.<anonymous>.<anonymous>.<anonymous> (StudentCardNavContent.kt:59)");
        }
        l.b bVar = l.b.f116896a;
        f00.r.D(wVar, bVar, sVar.e(bVar), m.d(1629851257, true, new q() { // from class: l73.s
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function1.p(sVar, (hb4.b) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, ((i15 >> 3) & 14) | 3120);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p(final s sVar, hb4.b bVar, r rVar, int i15) {
        if (t.k()) {
            t.o(1629851257, i15, -1, "pl.gov.coi.mobywatel.feature.studentcard.presentation.main.StudentCardNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (StudentCardNavContent.kt:63)");
        }
        xw.b<hb4.b.a> bVarY1 = bVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: l73.v
                @Override // er.l
                public final Object b(Object obj) {
                    return Function1.q(sVar, (hb4.b.a) obj);
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
    public static final i0 q(s sVar, hb4.b.a aVar) {
        if (!fr.t.c(aVar, hb4.b.a.C1910a.f83033a)) {
            throw new oq.p();
        }
        sVar.c();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r(final s sVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(927479515, i15, -1, "pl.gov.coi.mobywatel.feature.studentcard.presentation.main.StudentCardNavContent.<anonymous>.<anonymous>.<anonymous> (StudentCardNavContent.kt:75)");
        }
        l.a aVar = l.a.f116894a;
        f00.r.D(wVar, aVar, sVar.e(aVar), m.d(-498077148, true, new q() { // from class: l73.r
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function1.s(sVar, (cb4.f) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, ((i15 >> 3) & 14) | 3120);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s(final s sVar, cb4.f fVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-498077148, i15, -1, "pl.gov.coi.mobywatel.feature.studentcard.presentation.main.StudentCardNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (StudentCardNavContent.kt:79)");
        }
        xw.b<cb4.f.a> bVarY1 = fVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: l73.u
                @Override // er.l
                public final Object b(Object obj) {
                    return Function1.t(sVar, (cb4.f.a) obj);
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
    public static final i0 t(s sVar, cb4.f.a aVar) {
        if (!fr.t.c(aVar, cb4.f.a.C0669a.f24980a)) {
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
