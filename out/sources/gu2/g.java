package gu2;

import d1.a3;
import d1.d3;
import d1.e0;
import er.q;
import i50.BaseScaffoldData;
import i50.s;
import oq.i0;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.t;
import q40.IconPageData;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n²\u0006\f\u0010\u0006\u001a\u00020\t8\nX\u008a\u0084\u0002"}, d2 = {"Lgu2/c;", "viewModel", "Loq/i0;", "g", "(Lgu2/c;Lm2/r;I)V", "Lgu2/c$a$b;", "data", "d", "(Lgu2/c$a$b;Lm2/r;I)V", "Lgu2/c$a;", "peselrestrictionverification_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class g {
    public static final void d(final c.a.Underage underage, r rVar, final int i15) {
        int i16;
        r rVar2;
        r rVarH = rVar.h(85690752);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(underage) : rVarH.G(underage) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(85690752, i16, -1, "pl.gov.coi.mobywatel.feature.peselrestrictionverification.presentation.screen.dispatcher.PeselRestrictionVerificationDispatcherContent (PeselRestrictionVerificationDispatcherScreen.kt:31)");
            }
            rVar2 = rVarH;
            s.r(underage.getScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(1763315565, true, new q() { // from class: gu2.e
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return g.e(underage, (d3) obj, (r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVar2, BaseScaffoldData.f89350g, 196608, 32766);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: gu2.f
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return g.f(underage, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 e(c.a.Underage underage, d3 d3Var, r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= rVar.W(d3Var) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (t.k()) {
                t.o(1763315565, i15, -1, "pl.gov.coi.mobywatel.feature.peselrestrictionverification.presentation.screen.dispatcher.PeselRestrictionVerificationDispatcherContent.<anonymous> (PeselRestrictionVerificationDispatcherScreen.kt:33)");
            }
            f3.m mVarL = a3.l(f3.m.INSTANCE, d3Var);
            w0 w0VarA = e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarL);
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
            r rVarC = n6.c(rVar);
            n6.i(rVarC, w0VarA, companion.d());
            n6.i(rVarC, e0VarT, companion.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
            n6.g(rVarC, companion.a());
            n6.i(rVarC, mVarE, companion.e());
            d1.i0 i0Var = d1.i0.f39176a;
            q40.i.b(underage.a(), null, null, rVar, IconPageData.f164667h, 6);
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
    public static final i0 f(c.a.Underage underage, int i15, r rVar, int i16) {
        d(underage, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void g(final c cVar, r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(-754227538);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(cVar) : rVarH.G(cVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(-754227538, i16, -1, "pl.gov.coi.mobywatel.feature.peselrestrictionverification.presentation.screen.dispatcher.PeselRestrictionVerificationDispatcherScreen (PeselRestrictionVerificationDispatcherScreen.kt:18)");
            }
            f6 f6VarC = m7.b.c(cVar.getState(), null, null, null, rVarH, 0, 7);
            c.a aVarH = h(f6VarC);
            if (fr.t.c(aVarH, c.a.C1748a.f77009a)) {
                rVarH.X(1036817330);
                rVarH.R();
            } else {
                if (!(aVarH instanceof c.a.Underage)) {
                    rVarH.X(1036815034);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(1036819959);
                d((c.a.Underage) h(f6VarC), rVarH, 0);
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
            d5VarM.a(new er.p() { // from class: gu2.d
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return g.i(cVar, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final c.a h(f6<? extends c.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(c cVar, int i15, r rVar, int i16) {
        g(cVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
