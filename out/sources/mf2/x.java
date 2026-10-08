package mf2;

import d1.a3;
import d1.d3;
import d1.r3;
import i50.BaseScaffoldData;
import mx.Label;
import of2.SummarySectionCardListData;
import of2.SummarySectionSingleCardData;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import q40.IconPageBottomContentData;
import q40.IconPageData;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\tH\u0003¢\u0006\u0004\b\n\u0010\u000b\u001a\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\fH\u0003¢\u0006\u0004\b\r\u0010\u000e\u001a\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0017\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0017\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0015H\u0003¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0017\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0018H\u0003¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001d²\u0006\f\u0010\u001c\u001a\u00020\u001b8\nX\u008a\u0084\u0002"}, d2 = {"Lmf2/e;", "viewModel", "Loq/i0;", "t", "(Lmf2/e;Lm2/r;I)V", "Lmf2/e$a$f;", "data", "w", "(Lmf2/e$a$f;Lm2/r;I)V", "Lof2/b;", "N", "(Lof2/b;Lm2/r;I)V", "Lof2/a;", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37094u, "(Lof2/a;Lm2/r;I)V", "Lmf2/e$a$c;", "A", "(Lmf2/e$a$c;Lm2/r;I)V", "Lmf2/e$a$d;", "E", "(Lmf2/e$a$d;Lm2/r;I)V", "Lmf2/e$a$e;", "I", "(Lmf2/e$a$e;Lm2/r;I)V", "Lmf2/e$a$a;", "q", "(Lmf2/e$a$a;Lm2/r;I)V", "Lmf2/e$a;", "stateData", "internetaccess_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class x {
    public static final void A(final e.a.ProviderList providerList, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1688200997);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(providerList) : rVarH.G(providerList) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1688200997, i16, -1, "pl.gov.coi.mobywatel.feature.internetaccess.presentation.formsummary.ProviderListScreenContent (FormSummaryScreen.kt:126)");
            }
            int i17 = i16;
            i50.s.r(providerList.getScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(206137486, true, new er.q() { // from class: mf2.w
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return x.B(providerList, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVarH, BaseScaffoldData.f89350g, 196608, 32766);
            rVarH = rVarH;
            boolean z15 = (i17 & 14) == 4 || ((i17 & 8) != 0 && rVarH.G(providerList));
            Object objE = rVarH.E();
            if (z15 || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.a() { // from class: mf2.i
                    @Override // er.a
                    public final Object a() {
                        return x.C(providerList);
                    }
                };
                rVarH.v(objE);
            }
            p088nul.q0.g(false, (er.a) objE, rVarH, 0, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: mf2.j
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return x.D(providerList, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 B(e.a.ProviderList providerList, d3 d3Var, p076m2.r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= rVar.W(d3Var) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(206137486, i15, -1, "pl.gov.coi.mobywatel.feature.internetaccess.presentation.formsummary.ProviderListScreenContent.<anonymous> (FormSummaryScreen.kt:130)");
            }
            f3.m mVarN = t70.s.n(a3.l(t70.i.S(f3.m.INSTANCE, null, rVar, 6, 1), d3Var), rVar, 0);
            p036e4.w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
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
            m30.i.d(providerList.getProviderList(), null, null, rVar, 0, 6);
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
    public static final oq.i0 C(e.a.ProviderList providerList) {
        providerList.a().a();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 D(e.a.ProviderList providerList, int i15, p076m2.r rVar, int i16) {
        A(providerList, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void E(final e.a.StatementFullText statementFullText, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(1511917831);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(statementFullText) : rVarH.G(statementFullText) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1511917831, i16, -1, "pl.gov.coi.mobywatel.feature.internetaccess.presentation.formsummary.StatementFullTextScreenContent (FormSummaryScreen.kt:148)");
            }
            int i17 = i16;
            i50.s.r(statementFullText.getScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(718902522, true, new er.q() { // from class: mf2.t
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return x.F(statementFullText, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVarH, BaseScaffoldData.f89350g, 196608, 32766);
            rVarH = rVarH;
            boolean z15 = (i17 & 14) == 4 || ((i17 & 8) != 0 && rVarH.G(statementFullText));
            Object objE = rVarH.E();
            if (z15 || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.a() { // from class: mf2.u
                    @Override // er.a
                    public final Object a() {
                        return x.G(statementFullText);
                    }
                };
                rVarH.v(objE);
            }
            p088nul.q0.g(false, (er.a) objE, rVarH, 0, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: mf2.v
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return x.H(statementFullText, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 F(e.a.StatementFullText statementFullText, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        p076m2.r rVar2 = rVar;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar2.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar2.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(718902522, i16, -1, "pl.gov.coi.mobywatel.feature.internetaccess.presentation.formsummary.StatementFullTextScreenContent.<anonymous> (FormSummaryScreen.kt:152)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarN = t70.s.n(a3.l(t70.i.S(companion, null, rVar2, 6, 1), d3Var), rVar2, 0);
            p036e4.w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar2, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar2, 0));
            p076m2.e0 e0VarT = rVar2.t();
            f3.m mVarE = f3.j.e(rVar2, mVarN);
            androidx.compose.ui.node.c.Companion companion2 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion2.b();
            if (rVar2.l() == null) {
                p076m2.m.d();
            }
            rVar2.K();
            if (rVar2.getInserting()) {
                rVar2.H(aVarB);
            } else {
                rVar2.u();
            }
            p076m2.r rVarC = n6.c(rVar2);
            n6.i(rVarC, w0VarA, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
            n6.g(rVarC, companion2.a());
            n6.i(rVarC, mVarE, companion2.e());
            d1.i0 i0Var = d1.i0.f39176a;
            Label emailStatement = statementFullText.getEmailStatement();
            if (emailStatement == null) {
                rVar2.X(-969160738);
            } else {
                rVar2.X(-969160737);
                k70.a aVar = k70.a.f108864a;
                int i17 = k70.a.f108865b;
                j70.h.g(null, null, emailStatement, null, null, aVar.a(rVar2, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar2, i17).b(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
                rVar2 = rVar;
                r3.a(a3.r(companion, 0.0f, aVar.b(rVar2, i17).getSpacing200(), 0.0f, 0.0f, 13, null), rVar2, 0);
            }
            rVar2.R();
            Label phoneNumberStatement = statementFullText.getPhoneNumberStatement();
            if (phoneNumberStatement == null) {
                rVar2.X(-968844476);
                rVar2.R();
            } else {
                rVar2.X(-968844475);
                k70.a aVar2 = k70.a.f108864a;
                int i18 = k70.a.f108865b;
                j70.h.g(null, null, phoneNumberStatement, null, null, aVar2.a(rVar2, i18).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVar2, i18).b(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
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
    public static final oq.i0 G(e.a.StatementFullText statementFullText) {
        statementFullText.b().a();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 H(e.a.StatementFullText statementFullText, int i15, p076m2.r rVar, int i16) {
        E(statementFullText, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void I(final e.a.Success success, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(-755231472);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(success) : rVarH.G(success) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-755231472, i16, -1, "pl.gov.coi.mobywatel.feature.internetaccess.presentation.formsummary.SuccessScreen (FormSummaryScreen.kt:183)");
            }
            rVar2 = rVarH;
            i50.s.r(success.getScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-536085251, true, new er.q() { // from class: mf2.r
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return x.J(success, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
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
            d5VarM.a(new er.p() { // from class: mf2.s
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return x.K(success, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 J(e.a.Success success, d3 d3Var, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 17) != 16, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-536085251, i15, -1, "pl.gov.coi.mobywatel.feature.internetaccess.presentation.formsummary.SuccessScreen.<anonymous> (FormSummaryScreen.kt:187)");
            }
            q40.i.b(success.a(), null, b.f126137a.b(), rVar, IconPageData.f164667h | IconPageBottomContentData.f164663d | MLKEMEngine.KyberPolyBytes, 2);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 K(e.a.Success success, int i15, p076m2.r rVar, int i16) {
        I(success, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void L(final SummarySectionCardListData summarySectionCardListData, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(-625153160);
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVarH.W(summarySectionCardListData) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-625153160, i16, -1, "pl.gov.coi.mobywatel.feature.internetaccess.presentation.formsummary.SummarySectionCardList (FormSummaryScreen.kt:113)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            r3.a(a3.r(companion, 0.0f, aVar.b(rVarH, i17).getSpacing300(), 0.0f, 0.0f, 13, null), rVarH, 0);
            rVar2 = rVarH;
            j70.h.g(null, null, summarySectionCardListData.getSectionLabel(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i17).p(), null, null, false, false, null, rVar2, 0, 0, 0, 33030139);
            r3.a(a3.r(companion, 0.0f, aVar.b(rVar2, i17).getSpacing200(), 0.0f, 0.0f, 13, null), rVar2, 0);
            m30.i.d(summarySectionCardListData.getSectionListData(), null, null, rVar2, 0, 6);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: mf2.n
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return x.M(summarySectionCardListData, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 M(SummarySectionCardListData summarySectionCardListData, int i15, p076m2.r rVar, int i16) {
        L(summarySectionCardListData, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void N(final SummarySectionSingleCardData summarySectionSingleCardData, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(1918731000);
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVarH.W(summarySectionSingleCardData) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1918731000, i16, -1, "pl.gov.coi.mobywatel.feature.internetaccess.presentation.formsummary.SummarySectionSingleCard (FormSummaryScreen.kt:100)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            r3.a(a3.r(companion, 0.0f, aVar.b(rVarH, i17).getSpacing300(), 0.0f, 0.0f, 13, null), rVarH, 0);
            j70.h.g(null, null, summarySectionSingleCardData.getSectionLabel(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i17).p(), null, null, false, false, null, rVarH, 0, 0, 0, 33030139);
            rVarH = rVarH;
            r3.a(a3.r(companion, 0.0f, aVar.b(rVarH, i17).getSpacing200(), 0.0f, 0.0f, 13, null), rVarH, 0);
            n50.h0.v(summarySectionSingleCardData.getSectionData(), null, rVarH, 0, 2);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: mf2.m
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return x.O(summarySectionSingleCardData, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 O(SummarySectionSingleCardData summarySectionSingleCardData, int i15, p076m2.r rVar, int i16) {
        N(summarySectionSingleCardData, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void q(final e.a.Error error, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(859973210);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(error) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(859973210, i16, -1, "pl.gov.coi.mobywatel.feature.internetaccess.presentation.formsummary.ErrorScreen (FormSummaryScreen.kt:199)");
            }
            error.getErrorVMS().b(rVarH, 0);
            Object objE = rVarH.E();
            if (objE == p076m2.r.INSTANCE.a()) {
                objE = new er.a() { // from class: mf2.k
                    @Override // er.a
                    public final Object a() {
                        return x.r();
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
            d5VarM.a(new er.p() { // from class: mf2.l
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return x.s(error, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 r() {
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 s(e.a.Error error, int i15, p076m2.r rVar, int i16) {
        q(error, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void t(final e eVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(1107999120);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(eVar) : rVarH.G(eVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1107999120, i16, -1, "pl.gov.coi.mobywatel.feature.internetaccess.presentation.formsummary.FormSummaryScreen (FormSummaryScreen.kt:36)");
            }
            e.a aVarU = u(m7.b.c(eVar.getState(), null, null, null, rVarH, 0, 7));
            if (fr.t.c(aVarU, e.a.b.f126164a)) {
                rVarH.X(-364728607);
                c60.b.b(rVarH, 0);
                rVarH.R();
            } else if (aVarU instanceof e.a.SummaryData) {
                rVarH.X(-364726443);
                w((e.a.SummaryData) aVarU, rVarH, 0);
                rVarH.R();
            } else if (aVarU instanceof e.a.ProviderList) {
                rVarH.X(-364723626);
                A((e.a.ProviderList) aVarU, rVarH, 0);
                rVarH.R();
            } else if (aVarU instanceof e.a.StatementFullText) {
                rVarH.X(-364720613);
                E((e.a.StatementFullText) aVarU, rVarH, 0);
                rVarH.R();
            } else if (aVarU instanceof e.a.Error) {
                rVarH.X(-364717848);
                q((e.a.Error) aVarU, rVarH, 0);
                rVarH.R();
            } else {
                if (!(aVarU instanceof e.a.Success)) {
                    rVarH.X(-364730420);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(-364715606);
                I((e.a.Success) aVarU, rVarH, 0);
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
            d5VarM.a(new er.p() { // from class: mf2.h
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return x.v(eVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final e.a u(f6<? extends e.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 v(e eVar, int i15, p076m2.r rVar, int i16) {
        t(eVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void w(final e.a.SummaryData summaryData, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(69076373);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(summaryData) : rVarH.G(summaryData) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(69076373, i16, -1, "pl.gov.coi.mobywatel.feature.internetaccess.presentation.formsummary.FormSummaryScreenContent (FormSummaryScreen.kt:51)");
            }
            rVar2 = rVarH;
            i50.s.r(summaryData.getScaffoldData(), y2.m.d(1780120832, true, new er.p() { // from class: mf2.o
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return x.x(summaryData, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-898783736, true, new er.q() { // from class: mf2.p
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return x.y(summaryData, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVar2, BaseScaffoldData.f89350g | 48, 196608, 32764);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: mf2.q
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return x.z(summaryData, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 x(e.a.SummaryData summaryData, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1780120832, i15, -1, "pl.gov.coi.mobywatel.feature.internetaccess.presentation.formsummary.FormSummaryScreenContent.<anonymous> (FormSummaryScreen.kt:55)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            k70.a aVar = k70.a.f108864a;
            int i16 = k70.a.f108865b;
            f3.m mVarN = a3.n(w0.i.d(companion, aVar.a(rVar, i16).getBase().a(), null, 2, null), aVar.b(rVar, i16).getSpacing200());
            p036e4.w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
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
            h30.q.p(summaryData.getButtonData(), false, null, rVar, 0, 6);
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
    public static final oq.i0 y(e.a.SummaryData summaryData, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-898783736, i16, -1, "pl.gov.coi.mobywatel.feature.internetaccess.presentation.formsummary.FormSummaryScreenContent.<anonymous> (FormSummaryScreen.kt:64)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarN = t70.s.n(a3.l(androidx.compose.foundation.layout.d.f(companion, 0.0f, 1, null), d3Var), rVar, 0);
            f3.c.Companion companion2 = f3.c.INSTANCE;
            p036e4.w0 w0VarI = d1.r.i(companion2.o(), false);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarN);
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
            n6.i(rVarC, w0VarI, companion3.d());
            n6.i(rVarC, e0VarT, companion3.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion3.c());
            n6.g(rVarC, companion3.a());
            n6.i(rVarC, mVarE, companion3.e());
            d1.x xVar = d1.x.f39368a;
            f3.m mVarS = t70.i.S(companion, null, rVar, 6, 1);
            p036e4.w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), companion2.k(), rVar, 0);
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
            n6.i(rVarC2, w0VarA, companion3.d());
            n6.i(rVarC2, e0VarT2, companion3.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion3.c());
            n6.g(rVarC2, companion3.a());
            n6.i(rVarC2, mVarE2, companion3.e());
            d1.i0 i0Var = d1.i0.f39176a;
            Label title = summaryData.getTitle();
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            j70.h.g(null, null, title, null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i17).m(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
            N(summaryData.getYourData(), rVar, 0);
            N(summaryData.getAddress(), rVar, 0);
            N(summaryData.getProviders(), rVar, 0);
            N(summaryData.getReason(), rVar, 0);
            L(summaryData.getSpeedParams(), rVar, 0);
            L(summaryData.getContactDetails(), rVar, 0);
            r3.a(a3.r(companion, 0.0f, aVar.b(rVar, i17).getSpacing300(), 0.0f, 0.0f, 13, null), rVar, 0);
            j70.h.g(null, null, summaryData.getStatementLabel(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i17).p(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
            r3.a(a3.r(companion, 0.0f, aVar.b(rVar, i17).getSpacing200(), 0.0f, 0.0f, 13, null), rVar, 0);
            s50.d.b(summaryData.getStatementSwitch(), rVar, s50.a.f177982i);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing200()), rVar, 0);
            rVar.x();
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
    public static final oq.i0 z(e.a.SummaryData summaryData, int i15, p076m2.r rVar, int i16) {
        w(summaryData, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }
}
