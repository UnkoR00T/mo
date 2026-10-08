package v81;

import d1.a3;
import d1.d3;
import d1.e0;
import d1.r3;
import i50.BaseScaffoldData;
import j50.f0;
import mx.Label;
import oq.i0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p088nul.q0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\t\u0010\b\u001a\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lv81/g;", "viewModel", "Loq/i0;", "m", "(Lv81/g;Lm2/r;I)V", "Lv81/g$a;", "screenData", "g", "(Lv81/g$a;Lm2/r;I)V", "p", "Lv81/g$b;", "noSearchResultsData", "k", "(Lv81/g$b;Lm2/r;I)V", "childpassportapplication_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class n {
    public static final void g(final g.Data data, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(-1077090022);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(data) : rVarH.G(data) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1077090022, i16, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.institutionpicker.ChildPassportApplicationInstitutionContent (ChildPassportApplicationInstitutionPickerScreen.kt:34)");
            }
            rVar2 = rVarH;
            i50.s.r(data.getBaseScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(1498590215, true, new er.q() { // from class: v81.i
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return n.h(data, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
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
            d5VarM.a(new er.p() { // from class: v81.j
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return n.j(data, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(final g.Data data, d3 d3Var, p076m2.r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= rVar.W(d3Var) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1498590215, i15, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.institutionpicker.ChildPassportApplicationInstitutionContent.<anonymous> (ChildPassportApplicationInstitutionPickerScreen.kt:38)");
            }
            f3.m mVarS = f3.m.INSTANCE;
            f3.m mVarL = a3.l(mVarS, d3Var);
            if (data.getCardListData().d().isEmpty()) {
                rVar.X(-1683690855);
                rVar.R();
            } else {
                rVar.X(-1683759365);
                mVarS = t70.i.S(mVarS, null, rVar, 6, 1);
                rVar.R();
            }
            f3.m mVarN = t70.s.n(mVarL.u(mVarS), rVar, 0);
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
            p076m2.r rVarC = n6.c(rVar);
            n6.i(rVarC, w0VarA, companion.d());
            n6.i(rVarC, e0VarT, companion.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
            n6.g(rVarC, companion.a());
            n6.i(rVarC, mVarE, companion.e());
            d1.i0 i0Var = d1.i0.f39176a;
            f0.A(null, data.getSearchBarData(), y2.m.d(1769052123, true, new er.p() { // from class: v81.k
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return n.i(data, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVar, 54), rVar, MLKEMEngine.KyberPolyBytes, 1);
            if (data.getSearchBarData().getIsActive()) {
                rVar.X(-411870523);
            } else {
                rVar.X(-409410704);
                p(data, rVar, BaseScaffoldData.f89350g);
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
    public static final i0 i(g.Data data, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1769052123, i15, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.institutionpicker.ChildPassportApplicationInstitutionContent.<anonymous>.<anonymous>.<anonymous> (ChildPassportApplicationInstitutionPickerScreen.kt:53)");
            }
            if (data.getSearchBarData().getIsActive()) {
                rVar.X(-1711839446);
                p(data, rVar, BaseScaffoldData.f89350g);
            } else {
                rVar.X(-1714136825);
            }
            rVar.R();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j(g.Data data, int i15, p076m2.r rVar, int i16) {
        g(data, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void k(final g.NoSearchResultsData noSearchResultsData, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(-743547271);
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVarH.W(noSearchResultsData) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-743547271, i16, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.institutionpicker.ChildPassportApplicationInstitutionEmptyScreen (ChildPassportApplicationInstitutionPickerScreen.kt:78)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarF = androidx.compose.foundation.layout.d.f(companion, 0.0f, 1, null);
            w0 w0VarA = e0.a(d1.i.f39152a.e(), f3.c.INSTANCE.g(), rVarH, 54);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, mVarF);
            androidx.compose.ui.node.c.Companion companion2 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion2.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB);
            } else {
                rVarH.u();
            }
            p076m2.r rVarC = n6.c(rVarH);
            n6.i(rVarC, w0VarA, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
            n6.g(rVarC, companion2.a());
            n6.i(rVarC, mVarE, companion2.e());
            d1.i0 i0Var = d1.i0.f39176a;
            Label title = noSearchResultsData.getTitle();
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            rVar2 = rVarH;
            j70.h.g(null, null, title, null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i17).a(), null, null, false, false, null, rVar2, 0, 0, 0, 33030139);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar2, i17).getSpacing200()), rVar2, 0);
            j70.h.g(null, null, noSearchResultsData.getDescription(), null, null, aVar.a(rVar2, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar2, i17).d(), null, null, false, false, null, rVar2, 0, 0, 0, 33030107);
            rVar2.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: v81.m
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return n.l(noSearchResultsData, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(g.NoSearchResultsData noSearchResultsData, int i15, p076m2.r rVar, int i16) {
        k(noSearchResultsData, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void m(final g gVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-2075364713);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(gVar) : rVarH.G(gVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-2075364713, i16, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.institutionpicker.ChildPassportApplicationInstitutionPickerScreen (ChildPassportApplicationInstitutionPickerScreen.kt:27)");
            }
            f6 f6VarC = m7.b.c(gVar.getState(), null, null, null, rVarH, 0, 7);
            g(n(f6VarC), rVarH, BaseScaffoldData.f89350g);
            q0.g(false, n(f6VarC).d(), rVarH, 0, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: v81.h
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return n.o(gVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final g.Data n(f6<g.Data> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o(g gVar, int i15, p076m2.r rVar, int i16) {
        m(gVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void p(final g.Data data, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1852576899);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(data) : rVarH.G(data) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1852576899, i16, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.institutionpicker.ChildPassportApplicationInstitutionResults (ChildPassportApplicationInstitutionPickerScreen.kt:66)");
            }
            r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing300()), rVarH, 0);
            if (data.getCardListData().d().isEmpty()) {
                rVarH.X(211674359);
                k(data.getNoSearchResultsData(), rVarH, 0);
                rVarH.R();
            } else {
                rVarH.X(211611181);
                m30.i.d(data.getCardListData(), null, null, rVarH, 0, 6);
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
            d5VarM.a(new er.p() { // from class: v81.l
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return n.q(data, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(g.Data data, int i15, p076m2.r rVar, int i16) {
        p(data, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
