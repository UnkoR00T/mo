package pa1;

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
import p076m2.t;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lpa1/e;", "viewModel", "Loq/i0;", "j", "(Lpa1/e;Lm2/r;I)V", "Lpa1/e$a;", "screenData", "e", "(Lpa1/e$a;Lm2/r;I)V", "Lpa1/e$a$b;", "g", "(Lpa1/e$a$b;Lm2/r;I)V", "company_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class j {
    public static final void e(final e.a aVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(802424955);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(aVar) : rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(802424955, i16, -1, "pl.gov.coi.mobywatel.feature.company.presentation.cardlist.CompanyCardListContent (CompanyCardListScreen.kt:33)");
            }
            if (fr.t.c(aVar, e.a.C3805a.f153802a)) {
                rVarH.X(-745990235);
                rVarH.R();
            } else {
                if (!(aVar instanceof e.a.Initialized)) {
                    rVarH.X(-1963728788);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(-1963725010);
                g((e.a.Initialized) aVar, rVarH, i16 & 14);
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
            d5VarM.a(new er.p() { // from class: pa1.g
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return j.f(aVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(e.a aVar, int i15, p076m2.r rVar, int i16) {
        e(aVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void g(final e.a.Initialized initialized, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(1461565736);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(initialized) : rVarH.G(initialized) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(1461565736, i16, -1, "pl.gov.coi.mobywatel.feature.company.presentation.cardlist.CompanyCardListInitialized (CompanyCardListScreen.kt:43)");
            }
            rVar2 = rVarH;
            s.r(initialized.getScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(1180535579, true, new er.q() { // from class: pa1.h
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return j.h(initialized, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
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
            d5VarM.a(new er.p() { // from class: pa1.i
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return j.i(initialized, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(e.a.Initialized initialized, d3 d3Var, p076m2.r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= rVar.W(d3Var) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (t.k()) {
                t.o(1180535579, i15, -1, "pl.gov.coi.mobywatel.feature.company.presentation.cardlist.CompanyCardListInitialized.<anonymous> (CompanyCardListScreen.kt:48)");
            }
            f3.m mVarF = androidx.compose.foundation.layout.d.f(f3.m.INSTANCE, 0.0f, 1, null);
            k70.a aVar = k70.a.f108864a;
            int i16 = k70.a.f108865b;
            f3.m mVarS = t70.i.S(a3.q(a3.l(w0.i.d(mVarF, aVar.a(rVar, i16).getBase().a(), null, 2, null), d3Var), aVar.b(rVar, i16).getSpacing200(), aVar.b(rVar, i16).getSpacing100(), aVar.b(rVar, i16).getSpacing200(), aVar.b(rVar, i16).getSpacing200()), null, rVar, 0, 1);
            w0 w0VarA = e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarS);
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
            m30.i.d(initialized.getCards(), null, null, rVar, 0, 6);
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
    public static final i0 i(e.a.Initialized initialized, int i15, p076m2.r rVar, int i16) {
        g(initialized, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void j(final e eVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(2102336714);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(eVar) : rVarH.G(eVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(2102336714, i16, -1, "pl.gov.coi.mobywatel.feature.company.presentation.cardlist.CompanyCardListScreen (CompanyCardListScreen.kt:22)");
            }
            e(k(m7.b.c(eVar.getState(), null, null, null, rVarH, 0, 7)), rVarH, 0);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: pa1.f
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return j.l(eVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final e.a k(f6<? extends e.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(e eVar, int i15, p076m2.r rVar, int i16) {
        j(eVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
