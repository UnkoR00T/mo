package bt3;

import d1.a3;
import d1.d3;
import d1.e0;
import d1.r3;
import i50.BaseScaffoldData;
import mx.Label;
import n50.h0;
import oq.i0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p046f2.al;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p088nul.q0;
import x50.NavigationButtonData;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a-\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a-\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\tH\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a-\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\tH\u0007¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002²\u0006\f\u0010\b\u001a\u00020\u00078\nX\u008a\u0084\u0002"}, d2 = {"Lbt3/d;", "viewModel", "Loq/i0;", "x", "(Lbt3/d;Lm2/r;I)V", "Lbt3/d$a;", "screenData", "Li70/p;", "snackBarState", "Lkotlin/Function0;", "onSnackBarHidden", "k", "(Lbt3/d$a;Li70/p;Ler/a;Lm2/r;I)V", "Lbt3/d$a$b;", "r", "(Lbt3/d$a$b;Li70/p;Ler/a;Lm2/r;I)V", "u", "(Lbt3/d$a$b;Lm2/r;I)V", "Lbt3/d$a$a;", "m", "(Lbt3/d$a$a;Li70/p;Ler/a;Lm2/r;I)V", "zusvisit_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class o {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class a extends fr.q implements er.a<i0> {
        a(Object obj) {
            super(0, obj, d.class, "hideSnackBar", "hideSnackBar()V", 0);
        }

        public final void E() {
            ((d) this.f66391b).B0();
        }

        @Override // er.a
        public /* bridge */ /* synthetic */ i0 a() {
            E();
            return i0.f148189a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 A(d dVar, int i15, p076m2.r rVar, int i16) {
        x(dVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void k(final d.a aVar, final i70.p pVar, final er.a<i0> aVar2, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-649670057);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(aVar) : rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(pVar) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= rVarH.G(aVar2) ? 256 : 128;
        }
        if (rVarH.r((i16 & 147) != 146, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-649670057, i16, -1, "pl.gov.coi.mobywatel.feature.zusvisit.presentation.screens.visitdetails.VisitDetailsContent (VisitDetailsScreen.kt:55)");
            }
            if (aVar instanceof d.a.c) {
                rVarH.X(-1197833847);
                rVarH.R();
            } else if (aVar instanceof d.a.DisplayedPlanned) {
                rVarH.X(-1562658536);
                r((d.a.DisplayedPlanned) aVar, pVar, aVar2, rVarH, i16 & 1022);
                rVarH.R();
            } else {
                if (!(aVar instanceof d.a.DisplayedFinished)) {
                    rVarH.X(-1562662068);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(-1562652615);
                m((d.a.DisplayedFinished) aVar, pVar, aVar2, rVarH, i16 & 1022);
                rVarH.R();
            }
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: bt3.f
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return o.l(aVar, pVar, aVar2, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(d.a aVar, i70.p pVar, er.a aVar2, int i15, p076m2.r rVar, int i16) {
        k(aVar, pVar, aVar2, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void m(final d.a.DisplayedFinished displayedFinished, final i70.p pVar, final er.a<i0> aVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-26615397);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(displayedFinished) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(pVar) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= rVarH.G(aVar) ? 256 : 128;
        }
        if (rVarH.r((i16 & 147) != 146, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-26615397, i16, -1, "pl.gov.coi.mobywatel.feature.zusvisit.presentation.screens.visitdetails.VisitDetailsFinished (VisitDetailsScreen.kt:150)");
            }
            Object objE = rVarH.E();
            p076m2.r.Companion companion = p076m2.r.INSTANCE;
            if (objE == companion.a()) {
                objE = new al();
                rVarH.v(objE);
            }
            final al alVar = (al) objE;
            i70.m.d(alVar, pVar, aVar, null, null, rVarH, (i16 & 112) | 6 | (i16 & 896), 24);
            i50.s.r(new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), displayedFinished.d()), displayedFinished.getTopBarTitle(), null, null, null, 28, null), null, null, null, null, 61, null), null, y2.m.d(865493989, true, new er.p() { // from class: bt3.g
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return o.n(alVar, pVar, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-231508274, true, new er.q() { // from class: bt3.h
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return o.o(displayedFinished, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVarH, BaseScaffoldData.f89350g | MLKEMEngine.KyberPolyBytes, 196608, 32762);
            boolean zG = rVarH.G(displayedFinished);
            Object objE2 = rVarH.E();
            if (zG || objE2 == companion.a()) {
                objE2 = new er.a() { // from class: bt3.i
                    @Override // er.a
                    public final Object a() {
                        return o.p(displayedFinished);
                    }
                };
                rVarH.v(objE2);
            }
            q0.g(false, (er.a) objE2, rVarH, 0, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: bt3.j
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return o.q(displayedFinished, pVar, aVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n(al alVar, i70.p pVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(865493989, i15, -1, "pl.gov.coi.mobywatel.feature.zusvisit.presentation.screens.visitdetails.VisitDetailsFinished.<anonymous> (VisitDetailsScreen.kt:168)");
            }
            i70.d.d(alVar, pVar, false, rVar, 6, 4);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o(d.a.DisplayedFinished displayedFinished, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-231508274, i16, -1, "pl.gov.coi.mobywatel.feature.zusvisit.presentation.screens.visitdetails.VisitDetailsFinished.<anonymous> (VisitDetailsScreen.kt:172)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarN = t70.s.n(a3.l(t70.i.S(androidx.compose.foundation.layout.d.f(companion, 0.0f, 1, null), null, rVar, 6, 1), d3Var), rVar, 0);
            w0 w0VarA = e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarN);
            androidx.compose.ui.node.c.Companion companion2 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion2.b();
            if (rVar.l() == null) {
                p076m2.m.d();
            }
            rVar.K();
            if (rVar.getInserting()) {
                rVar.H(aVarB);
            } else {
                rVar.u();
            }
            p076m2.r rVarC = n6.c(rVar);
            n6.i(rVarC, w0VarA, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
            n6.g(rVarC, companion2.a());
            n6.i(rVarC, mVarE, companion2.e());
            d1.i0 i0Var = d1.i0.f39176a;
            Label headline = displayedFinished.getHeadline();
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            j70.h.g(null, null, headline, null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i17).j(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing200()), rVar, 0);
            m30.i.d(displayedFinished.getDetailsSection(), null, null, rVar, 0, 6);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing200()), rVar, 0);
            n50.k redoVisitCard = displayedFinished.getRedoVisitCard();
            if (redoVisitCard == null) {
                rVar.X(-1339643955);
            } else {
                rVar.X(-1339643954);
                h0.v(redoVisitCard, null, rVar, 0, 2);
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing200()), rVar, 0);
            }
            rVar.R();
            rVar.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p(d.a.DisplayedFinished displayedFinished) {
        displayedFinished.c().a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(d.a.DisplayedFinished displayedFinished, i70.p pVar, er.a aVar, int i15, p076m2.r rVar, int i16) {
        m(displayedFinished, pVar, aVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void r(final d.a.DisplayedPlanned displayedPlanned, final i70.p pVar, final er.a<i0> aVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(50216293);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(displayedPlanned) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(pVar) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= rVarH.G(aVar) ? 256 : 128;
        }
        if (rVarH.r((i16 & 147) != 146, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(50216293, i16, -1, "pl.gov.coi.mobywatel.feature.zusvisit.presentation.screens.visitdetails.VisitDetailsPlanned (VisitDetailsScreen.kt:75)");
            }
            u(displayedPlanned, rVarH, i16 & 14);
            Object objE = rVarH.E();
            p076m2.r.Companion companion = p076m2.r.INSTANCE;
            if (objE == companion.a()) {
                objE = new al();
                rVarH.v(objE);
            }
            i70.m.d((al) objE, pVar, aVar, null, null, rVarH, (i16 & 112) | 6 | (i16 & 896), 24);
            boolean zG = rVarH.G(displayedPlanned);
            Object objE2 = rVarH.E();
            if (zG || objE2 == companion.a()) {
                objE2 = new er.a() { // from class: bt3.k
                    @Override // er.a
                    public final Object a() {
                        return o.s(displayedPlanned);
                    }
                };
                rVarH.v(objE2);
            }
            q0.g(false, (er.a) objE2, rVarH, 0, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: bt3.l
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return o.t(displayedPlanned, pVar, aVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s(d.a.DisplayedPlanned displayedPlanned) {
        displayedPlanned.g().a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t(d.a.DisplayedPlanned displayedPlanned, i70.p pVar, er.a aVar, int i15, p076m2.r rVar, int i16) {
        r(displayedPlanned, pVar, aVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void u(final d.a.DisplayedPlanned displayedPlanned, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(521376542);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(displayedPlanned) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(521376542, i16, -1, "pl.gov.coi.mobywatel.feature.zusvisit.presentation.screens.visitdetails.VisitDetailsPlannedContent (VisitDetailsScreen.kt:95)");
            }
            rVar2 = rVarH;
            i50.s.r(displayedPlanned.getBaseScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(495795403, true, new er.q() { // from class: bt3.m
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return o.v(displayedPlanned, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVar2, BaseScaffoldData.f89350g, 196608, 32766);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: bt3.n
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return o.w(displayedPlanned, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v(d.a.DisplayedPlanned displayedPlanned, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(495795403, i16, -1, "pl.gov.coi.mobywatel.feature.zusvisit.presentation.screens.visitdetails.VisitDetailsPlannedContent.<anonymous> (VisitDetailsScreen.kt:100)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarL = a3.l(androidx.compose.foundation.layout.d.f(companion, 0.0f, 1, null), d3Var);
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            f3.m mVarR = a3.r(mVarL, aVar.b(rVar, i17).getSpacing200(), 0.0f, aVar.b(rVar, i17).getSpacing200(), aVar.b(rVar, i17).getSpacing200(), 2, null);
            f3.c.Companion companion2 = f3.c.INSTANCE;
            f3.c.b bVarG = companion2.g();
            d1.i iVar = d1.i.f39152a;
            w0 w0VarA = e0.a(iVar.k(), bVarG, rVar, 48);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarR);
            androidx.compose.ui.node.c.Companion companion3 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion3.b();
            if (rVar.l() == null) {
                p076m2.m.d();
            }
            rVar.K();
            if (rVar.getInserting()) {
                rVar.H(aVarB);
            } else {
                rVar.u();
            }
            p076m2.r rVarC = n6.c(rVar);
            n6.i(rVarC, w0VarA, companion3.d());
            n6.i(rVarC, e0VarT, companion3.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion3.c());
            n6.g(rVarC, companion3.a());
            n6.i(rVarC, mVarE, companion3.e());
            f3.m mVarR2 = a3.r(t70.i.S(d1.h0.b(d1.i0.f39176a, companion, 1.0f, false, 2, null), null, rVar, 0, 1), 0.0f, aVar.b(rVar, i17).getSpacing100(), 0.0f, aVar.b(rVar, i17).getSpacing200(), 5, null);
            w0 w0VarA2 = e0.a(iVar.k(), companion2.k(), rVar, 0);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT2 = rVar.t();
            f3.m mVarE2 = f3.j.e(rVar, mVarR2);
            er.a<androidx.compose.ui.node.c> aVarB2 = companion3.b();
            if (rVar.l() == null) {
                p076m2.m.d();
            }
            rVar.K();
            if (rVar.getInserting()) {
                rVar.H(aVarB2);
            } else {
                rVar.u();
            }
            p076m2.r rVarC2 = n6.c(rVar);
            n6.i(rVarC2, w0VarA2, companion3.d());
            n6.i(rVarC2, e0VarT2, companion3.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion3.c());
            n6.g(rVarC2, companion3.a());
            n6.i(rVarC2, mVarE2, companion3.e());
            c30.e.c(null, displayedPlanned.getAlertData(), rVar, c30.b.f22944i << 3, 1);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing250()), rVar, 0);
            j70.h.g(null, null, displayedPlanned.getHeadline(), null, null, aVar.a(rVar, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i17).i(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing200()), rVar, 0);
            m30.i.d(displayedPlanned.getDetailsSection(), null, null, rVar, 0, 6);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing200()), rVar, 0);
            h0.v(displayedPlanned.getShareLinkCard(), null, rVar, 0, 2);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing100()), rVar, 0);
            h0.v(displayedPlanned.getCancelVisitCard(), null, rVar, 0, 2);
            rVar.x();
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing200()), rVar, 0);
            h30.q.p(displayedPlanned.getJoinVisitButtonData(), false, null, rVar, 0, 6);
            rVar.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w(d.a.DisplayedPlanned displayedPlanned, int i15, p076m2.r rVar, int i16) {
        u(displayedPlanned, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void x(final d dVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-2079914630);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(dVar) : rVarH.G(dVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        boolean z15 = true;
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-2079914630, i16, -1, "pl.gov.coi.mobywatel.feature.zusvisit.presentation.screens.visitdetails.VisitDetailsScreen (VisitDetailsScreen.kt:38)");
            }
            f6 f6VarC = m7.b.c(dVar.getState(), null, null, null, rVarH, 0, 7);
            f6 f6VarB = m7.b.b(dVar.j(), i70.p.a.f89857a, null, null, null, rVarH, i70.p.a.f89858b << 3, 14);
            rVarH = rVarH;
            d.a aVarY = y(f6VarC);
            i70.p pVarZ = z(f6VarB);
            if ((i16 & 14) != 4 && ((i16 & 8) == 0 || !rVarH.G(dVar))) {
                z15 = false;
            }
            Object objE = rVarH.E();
            if (z15 || objE == p076m2.r.INSTANCE.a()) {
                objE = new a(dVar);
                rVarH.v(objE);
            }
            k(aVarY, pVarZ, (er.a) ((mr.g) objE), rVarH, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: bt3.e
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return o.A(dVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final d.a y(f6<? extends d.a> f6Var) {
        return f6Var.getValue();
    }

    private static final i70.p z(f6<? extends i70.p> f6Var) {
        return f6Var.getValue();
    }
}
