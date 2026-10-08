package za1;

import d1.a3;
import d1.d3;
import d1.r3;
import i50.BaseScaffoldData;
import mx.Label;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import q40.IconPageBottomContentData;
import q40.IconPageData;
import x40.LinkData;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001a#\u0010\u0013\u001a\u00020\u00022\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00110\u0010H\u0007¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0017\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0019²\u0006\f\u0010\u0018\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lza1/c;", "viewModel", "Loq/i0;", "t", "(Lza1/c;Lm2/r;I)V", "Lza1/c$a;", "data", "w", "(Lza1/c$a;Lm2/r;I)V", "Lza1/c$a$b;", "q", "(Lza1/c$a$b;Lm2/r;I)V", "Lmx/a;", "emptyStateDescription", "k", "(Lmx/a;Lm2/r;I)V", "Lq40/g;", "Lq40/f;", "iconPageData", "y", "(Lq40/g;Lm2/r;I)V", "Lza1/c$a$a;", "n", "(Lza1/c$a$a;Lm2/r;I)V", "screenData", "company_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class n {
    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 A(IconPageData iconPageData, int i15, p076m2.r rVar, int i16) {
        y(iconPageData, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void k(final Label label, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-911145446);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.W(label) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-911145446, i16, -1, "pl.gov.coi.mobywatel.feature.company.presentation.representatives.CompanyRepresentativeEmptyList (CompanyRepresentativesScreen.kt:101)");
            }
            x30.c.c(null, 0.0f, y2.m.d(-985654759, true, new er.p() { // from class: za1.l
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return n.l(label, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), rVarH, MLKEMEngine.KyberPolyBytes, 3);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: za1.m
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return n.m(label, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 l(Label label, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-985654759, i15, -1, "pl.gov.coi.mobywatel.feature.company.presentation.representatives.CompanyRepresentativeEmptyList.<anonymous> (CompanyRepresentativesScreen.kt:103)");
            }
            k70.a aVar = k70.a.f108864a;
            int i16 = k70.a.f108865b;
            j70.h.g(null, null, label, null, null, aVar.a(rVar, i16).getNeutral().b(), 0L, null, null, null, 0L, null, b5.j.h(b5.j.INSTANCE.a()), 0L, 0, false, 0, 0, null, aVar.f(rVar, i16).d(), null, null, false, false, null, rVar, 0, 0, 0, 33026011);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 m(Label label, int i15, p076m2.r rVar, int i16) {
        k(label, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void n(final c.a.Error error, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1432099280);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(error) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1432099280, i16, -1, "pl.gov.coi.mobywatel.feature.company.presentation.representatives.CompanyRepresentativesError (CompanyRepresentativesScreen.kt:129)");
            }
            error.getErrorVMS().b(rVarH, 0);
            Object objE = rVarH.E();
            if (objE == p076m2.r.INSTANCE.a()) {
                objE = new er.a() { // from class: za1.j
                    @Override // er.a
                    public final Object a() {
                        return n.o();
                    }
                };
                rVarH.v(objE);
            }
            p088nul.q0.g(false, (er.a) objE, rVarH, 48, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: za1.k
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return n.p(error, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 o() {
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 p(c.a.Error error, int i15, p076m2.r rVar, int i16) {
        n(error, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void q(final c.a.Initialized initialized, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(650117192);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(initialized) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(650117192, i16, -1, "pl.gov.coi.mobywatel.feature.company.presentation.representatives.CompanyRepresentativesInitialized (CompanyRepresentativesScreen.kt:62)");
            }
            cb4.i dialogVMSAdapter = initialized.getDialogVMSAdapter();
            if (dialogVMSAdapter == null) {
                rVarH.X(1633855441);
            } else {
                rVarH.X(1992367664);
                dialogVMSAdapter.b(rVarH, 0);
            }
            rVarH.R();
            rVar2 = rVarH;
            i50.s.r(initialized.getScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(1663890485, true, new er.q() { // from class: za1.h
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return n.r(initialized, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
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
            d5VarM.a(new er.p() { // from class: za1.i
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return n.s(initialized, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 r(c.a.Initialized initialized, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1663890485, i16, -1, "pl.gov.coi.mobywatel.feature.company.presentation.representatives.CompanyRepresentativesInitialized.<anonymous> (CompanyRepresentativesScreen.kt:68)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarS = t70.i.S(androidx.compose.foundation.layout.d.f(a3.l(companion, d3Var), 0.0f, 1, null), null, rVar, 0, 1);
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            f3.m mVarP = a3.p(mVarS, aVar.b(rVar, i17).getSpacing200(), 0.0f, 2, null);
            w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarP);
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
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing100()), rVar, 0);
            j70.h.g(null, null, initialized.getDescription(), null, null, aVar.a(rVar, i17).getNeutral().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i17).d(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing100()), rVar, 0);
            x40.h.g(initialized.getLinkData(), rVar, LinkData.f216731g);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing200()), rVar, 0);
            boolean zIsEmpty = initialized.getRepresentativesCardListData().d().isEmpty();
            if (!zIsEmpty) {
                rVar.X(616412578);
                m30.i.d(initialized.getRepresentativesCardListData(), null, null, rVar, 0, 6);
                rVar.R();
            } else {
                if (!zIsEmpty) {
                    rVar.X(616410041);
                    rVar.R();
                    throw new oq.p();
                }
                rVar.X(616414962);
                k(initialized.getEmptyStateDescription(), rVar, 0);
                rVar.R();
            }
            rVar.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 s(c.a.Initialized initialized, int i15, p076m2.r rVar, int i16) {
        q(initialized, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void t(final c cVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(347668094);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(cVar) : rVarH.G(cVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(347668094, i16, -1, "pl.gov.coi.mobywatel.feature.company.presentation.representatives.CompanyRepresentativesScreen (CompanyRepresentativesScreen.kt:34)");
            }
            w(u(m7.b.c(cVar.getState(), null, null, null, rVarH, 0, 7)), rVarH, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: za1.d
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return n.v(cVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final c.a u(f6<? extends c.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 v(c cVar, int i15, p076m2.r rVar, int i16) {
        t(cVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void w(final c.a aVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-273109317);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(aVar) : rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-273109317, i16, -1, "pl.gov.coi.mobywatel.feature.company.presentation.representatives.CompanyRepresentativesScreenContent (CompanyRepresentativesScreen.kt:45)");
            }
            if (aVar instanceof c.a.C6305c) {
                rVarH.X(-465043316);
                c60.b.b(rVarH, 0);
                rVarH.R();
            } else if (aVar instanceof c.a.Initialized) {
                rVarH.X(-465040778);
                q((c.a.Initialized) aVar, rVarH, i16 & 14);
                rVarH.R();
            } else if (aVar instanceof c.a.Error) {
                rVarH.X(-465037117);
                n((c.a.Error) aVar, rVarH, i16 & 14);
                rVarH.R();
            } else {
                if (!(aVar instanceof c.a.RepresentativeRemovedSuccess)) {
                    rVarH.X(-465045128);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(-465033321);
                y(((c.a.RepresentativeRemovedSuccess) aVar).a(), rVarH, IconPageData.f164667h | IconPageBottomContentData.f164663d);
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
            d5VarM.a(new er.p() { // from class: za1.e
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return n.x(aVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 x(c.a aVar, int i15, p076m2.r rVar, int i16) {
        w(aVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void y(IconPageData<oq.i0, IconPageBottomContentData> iconPageData, p076m2.r rVar, final int i15) {
        int i16;
        final IconPageData<oq.i0, IconPageBottomContentData> iconPageData2;
        p076m2.r rVarH = rVar.h(-1753429605);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(iconPageData) : rVarH.G(iconPageData) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1753429605, i16, -1, "pl.gov.coi.mobywatel.feature.company.presentation.representatives.RepresentativeRemovedSuccess (CompanyRepresentativesScreen.kt:115)");
            }
            iconPageData2 = iconPageData;
            q40.i.b(iconPageData2, null, t0.f233963a.b(), rVarH, IconPageData.f164667h | IconPageBottomContentData.f164663d | MLKEMEngine.KyberPolyBytes | (i16 & 14), 2);
            Object objE = rVarH.E();
            if (objE == p076m2.r.INSTANCE.a()) {
                objE = new er.a() { // from class: za1.f
                    @Override // er.a
                    public final Object a() {
                        return n.z();
                    }
                };
                rVarH.v(objE);
            }
            p088nul.q0.g(false, (er.a) objE, rVarH, 48, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            iconPageData2 = iconPageData;
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: za1.g
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return n.A(iconPageData2, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 z() {
        return oq.i0.f148189a;
    }
}
