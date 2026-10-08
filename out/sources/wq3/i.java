package wq3;

import d1.a3;
import d1.d3;
import d1.e0;
import d1.r3;
import i50.BaseScaffoldData;
import i50.s;
import oq.i0;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p076m2.t;
import t40.InfoRowListData;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\tH\u0001¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lwq3/c;", "viewModel", "Loq/i0;", "f", "(Lwq3/c;Lm2/r;I)V", "Lwq3/c$a;", "data", "i", "(Lwq3/c$a;Lm2/r;I)V", "Lwq3/c$a$b;", "k", "(Lwq3/c$a$b;Lm2/r;I)V", "whatsnew_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class i {
    public static final void f(final c cVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-2002159409);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(cVar) : rVarH.G(cVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(-2002159409, i16, -1, "pl.gov.coi.mobywatel.feature.whatsnew.presentation.screens.WhatsNewScreen (WhatsNewScreen.kt:28)");
            }
            i(g(m7.b.c(cVar.getState(), null, null, null, rVarH, 0, 7)), rVarH, 0);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: wq3.h
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i.h(cVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final c.a g(f6<? extends c.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(c cVar, int i15, p076m2.r rVar, int i16) {
        f(cVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void i(final c.a aVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(1707256434);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(aVar) : rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(1707256434, i16, -1, "pl.gov.coi.mobywatel.feature.whatsnew.presentation.screens.WhatsNewScreenContent (WhatsNewScreen.kt:36)");
            }
            if (fr.t.c(aVar, c.a.C5690a.f214473a)) {
                rVarH.X(-126165906);
                rVarH.R();
            } else {
                if (!(aVar instanceof c.a.Initialized)) {
                    rVarH.X(-4071540);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(-4068072);
                k((c.a.Initialized) aVar, rVarH, i16 & 14);
                rVarH.R();
            }
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: wq3.d
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i.j(aVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j(c.a aVar, int i15, p076m2.r rVar, int i16) {
        i(aVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void k(final c.a.Initialized initialized, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(107145857);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(initialized) : rVarH.G(initialized) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(107145857, i16, -1, "pl.gov.coi.mobywatel.feature.whatsnew.presentation.screens.WhatsNewScreenInitialized (WhatsNewScreen.kt:46)");
            }
            rVar2 = rVarH;
            s.r(initialized.getModel().getScaffoldData(), y2.m.d(924772972, true, new er.p() { // from class: wq3.e
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i.l(initialized, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(341925748, true, new er.q() { // from class: wq3.f
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return i.m(initialized, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVar2, BaseScaffoldData.f89350g | 48, 196608, 32764);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: wq3.g
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i.n(initialized, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(c.a.Initialized initialized, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(924772972, i15, -1, "pl.gov.coi.mobywatel.feature.whatsnew.presentation.screens.WhatsNewScreenInitialized.<anonymous> (WhatsNewScreen.kt:51)");
            }
            f3.m mVarH = androidx.compose.foundation.layout.d.h(f3.m.INSTANCE, 0.0f, 1, null);
            k70.a aVar = k70.a.f108864a;
            int i16 = k70.a.f108865b;
            f3.m mVarR = a3.r(mVarH, aVar.b(rVar, i16).getSpacing200(), 0.0f, aVar.b(rVar, i16).getSpacing200(), aVar.b(rVar, i16).getSpacing200(), 2, null);
            w0 w0VarA = e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarR);
            androidx.compose.ui.node.c.Companion companion = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion.b();
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
            n6.i(rVarC, w0VarA, companion.d());
            n6.i(rVarC, e0VarT, companion.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
            n6.g(rVarC, companion.a());
            n6.i(rVarC, mVarE, companion.e());
            d1.i0 i0Var = d1.i0.f39176a;
            h30.q.p(initialized.getModel().getButtonData(), false, null, rVar, 0, 6);
            rVar.x();
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(c.a.Initialized initialized, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (t.k()) {
                t.o(341925748, i16, -1, "pl.gov.coi.mobywatel.feature.whatsnew.presentation.screens.WhatsNewScreenInitialized.<anonymous> (WhatsNewScreen.kt:64)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarL = a3.l(androidx.compose.foundation.layout.d.f(companion, 0.0f, 1, null), d3Var);
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            f3.m mVarQ = a3.q(mVarL, aVar.b(rVar, i17).getSpacing500(), aVar.b(rVar, i17).getSpacing200(), aVar.b(rVar, i17).getSpacing500(), aVar.b(rVar, i17).getSpacing300());
            d1.i iVar = d1.i.f39152a;
            d1.i.n nVarK = iVar.k();
            f3.c.Companion companion2 = f3.c.INSTANCE;
            w0 w0VarA = e0.a(nVarK, companion2.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarQ);
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
            j70.h.g(d1.i0.f39176a.c(companion, companion2.g()), null, initialized.getModel().getTitle(), null, null, 0L, 0L, null, null, null, 0L, null, b5.j.h(b5.j.INSTANCE.a()), 0L, 0, false, 0, 0, null, aVar.f(rVar, i17).i(), null, null, false, false, null, rVar, 0, 0, 0, 33026042);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing500()), rVar, 0);
            f3.m mVarS = t70.i.S(companion, null, rVar, 6, 1);
            w0 w0VarA2 = e0.a(iVar.k(), companion2.k(), rVar, 0);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT2 = rVar.t();
            f3.m mVarE2 = f3.j.e(rVar, mVarS);
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
            s40.g.c(initialized.getModel().getAnnouncements(), 0.0f, rVar, InfoRowListData.f187643b, 2);
            rVar.x();
            rVar.x();
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n(c.a.Initialized initialized, int i15, p076m2.r rVar, int i16) {
        k(initialized, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
