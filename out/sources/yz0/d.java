package yz0;

import d1.a3;
import d1.d3;
import d1.e0;
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

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b²\u0006\f\u0010\n\u001a\u00020\t8\nX\u008a\u0084\u0002"}, d2 = {"Lyz0/g;", "viewModel", "Loq/i0;", "d", "(Lyz0/g;Lm2/r;I)V", "Lyz0/g$a$c;", "data", "g", "(Lyz0/g$a$c;Lm2/r;I)V", "Lyz0/g$a;", "state", "applicationforms_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class d {
    public static final void d(final g gVar, r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(-1116142610);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(gVar) : rVarH.G(gVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(-1116142610, i16, -1, "pl.gov.coi.mobywatel.feature.applicationforms.presentation.genericapplications.GenericApplicationsScreen (GenericApplicationsScreen.kt:15)");
            }
            g.a aVarE = e(m7.b.c(gVar.getState(), null, null, null, rVarH, 0, 7));
            if (fr.t.c(aVarE, g.a.b.f230873a)) {
                rVarH.X(632551250);
                rVarH.R();
            } else if (aVarE instanceof g.a.Initialized) {
                rVarH.X(1128785775);
                g((g.a.Initialized) aVarE, rVarH, 0);
                rVarH.R();
            } else {
                if (!fr.t.c(aVarE, g.a.C6206a.f230872a)) {
                    rVarH.X(1128780879);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(632709970);
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
            d5VarM.a(new er.p() { // from class: yz0.a
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return d.f(gVar, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final g.a e(f6<? extends g.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(g gVar, int i15, r rVar, int i16) {
        d(gVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private static final void g(final g.a.Initialized initialized, r rVar, final int i15) {
        int i16;
        r rVar2;
        r rVarH = rVar.h(1971172863);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(initialized) : rVarH.G(initialized) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(1971172863, i16, -1, "pl.gov.coi.mobywatel.feature.applicationforms.presentation.genericapplications.LoadWebContent (GenericApplicationsScreen.kt:25)");
            }
            rVar2 = rVarH;
            s.r(initialized.getBaseScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-588565646, true, new er.q() { // from class: yz0.b
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return d.h(initialized, (d3) obj, (r) obj2, ((Integer) obj3).intValue());
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
            d5VarM.a(new er.p() { // from class: yz0.c
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return d.i(initialized, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(g.a.Initialized initialized, d3 d3Var, r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= rVar.W(d3Var) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (t.k()) {
                t.o(-588565646, i15, -1, "pl.gov.coi.mobywatel.feature.applicationforms.presentation.genericapplications.LoadWebContent.<anonymous> (GenericApplicationsScreen.kt:29)");
            }
            f3.m mVarL = a3.l(f3.m.INSTANCE, d3Var);
            k70.a aVar = k70.a.f108864a;
            int i16 = k70.a.f108865b;
            f3.m mVarR = a3.r(mVarL, aVar.b(rVar, i16).getSpacing200(), aVar.b(rVar, i16).getSpacing100(), aVar.b(rVar, i16).getSpacing200(), 0.0f, 8, null);
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
            r rVarC = n6.c(rVar);
            n6.i(rVarC, w0VarA, companion.d());
            n6.i(rVarC, e0VarT, companion.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
            n6.g(rVarC, companion.a());
            n6.i(rVarC, mVarE, companion.e());
            d1.i0 i0Var = d1.i0.f39176a;
            w70.l.d(initialized.getPageData(), rVar, 0);
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
    public static final i0 i(g.a.Initialized initialized, int i15, r rVar, int i16) {
        g(initialized, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
