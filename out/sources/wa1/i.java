package wa1;

import d1.a3;
import d1.d3;
import d1.e0;
import er.p;
import er.q;
import g70.ShortcutsMoreContentData;
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

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lwa1/e;", "viewModel", "Loq/i0;", "g", "(Lwa1/e;Lm2/r;I)V", "Lwa1/e$a;", "screenData", "d", "(Lwa1/e$a;Lm2/r;I)V", "company_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class i {
    public static final void d(final e.Data data, r rVar, final int i15) {
        int i16;
        r rVar2;
        r rVarH = rVar.h(-1788957459);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(data) : rVarH.G(data) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(-1788957459, i16, -1, "pl.gov.coi.mobywatel.feature.company.presentation.moreshortcuts.CompanyShortcutsMoreContent (CompanyShortcutsMoreScreen.kt:19)");
            }
            rVar2 = rVarH;
            s.r(data.getBaseScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-1476860050, true, new q() { // from class: wa1.g
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return i.e(data, (d3) obj, (r) obj2, ((Integer) obj3).intValue());
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
            d5VarM.a(new p() { // from class: wa1.h
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i.f(data, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 e(e.Data data, d3 d3Var, r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= rVar.W(d3Var) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (t.k()) {
                t.o(-1476860050, i15, -1, "pl.gov.coi.mobywatel.feature.company.presentation.moreshortcuts.CompanyShortcutsMoreContent.<anonymous>.<anonymous> (CompanyShortcutsMoreScreen.kt:23)");
            }
            f3.m mVarN = t70.s.n(a3.l(f3.m.INSTANCE, d3Var), rVar, 0);
            w0 w0VarA = e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarN);
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
            g70.e.b(data.getShortcutsMoreContentData(), rVar, ShortcutsMoreContentData.f71139c);
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
    public static final i0 f(e.Data data, int i15, r rVar, int i16) {
        d(data, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void g(final e eVar, r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(-990089348);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(eVar) : rVarH.G(eVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(-990089348, i16, -1, "pl.gov.coi.mobywatel.feature.company.presentation.moreshortcuts.CompanyShortcutsMoreScreen (CompanyShortcutsMoreScreen.kt:13)");
            }
            d(h(m7.b.c(eVar.getState(), null, null, null, rVarH, 0, 7)), rVarH, BaseScaffoldData.f89350g | ShortcutsMoreContentData.f71139c);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: wa1.f
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i.i(eVar, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final e.Data h(f6<e.Data> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(e eVar, int i15, r rVar, int i16) {
        g(eVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
