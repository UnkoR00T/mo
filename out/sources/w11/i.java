package w11;

import b30.AccordionData;
import d1.a3;
import d1.d3;
import d1.e0;
import d1.h0;
import d1.r3;
import i50.BaseScaffoldData;
import oq.i0;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p088nul.q0;
import w0.f3;
import w0.u2;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\tH\u0003¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000e²\u0006\f\u0010\r\u001a\u00020\f8\nX\u008a\u0084\u0002"}, d2 = {"Lw11/c;", "viewModel", "Loq/i0;", "f", "(Lw11/c;Lm2/r;I)V", "Lw11/c$a$c;", "state", "i", "(Lw11/c$a$c;Lm2/r;I)V", "Lw11/c$a$a;", "l", "(Lw11/c$a$a;Lm2/r;I)V", "Lw11/c$a;", "screenState", "certificates_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class i {
    public static final void f(final c cVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-213016014);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(cVar) : rVarH.G(cVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-213016014, i16, -1, "pl.gov.coi.mobywatel.feature.certificates.presentation.screens.details.CertificateDetailsScreen (CertificateDetailsScreen.kt:29)");
            }
            c.a aVarG = g(m7.b.c(cVar.getState(), null, null, null, rVarH, 0, 7));
            if (fr.t.c(aVarG, c.a.b.f209196a)) {
                rVarH.X(1450048086);
                rVarH.R();
            } else if (aVarG instanceof c.a.Initialized) {
                rVarH.X(1450050275);
                i((c.a.Initialized) aVarG, rVarH, 0);
                rVarH.R();
            } else {
                if (!(aVarG instanceof c.a.Error)) {
                    rVarH.X(1450045738);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(1450053484);
                l((c.a.Error) aVarG, rVarH, 0);
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
            d5VarM.a(new er.p() { // from class: w11.h
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

    public static final void i(final c.a.Initialized initialized, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(1968627795);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(initialized) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1968627795, i16, -1, "pl.gov.coi.mobywatel.feature.certificates.presentation.screens.details.CertificateDetailsScreenDataLoaded (CertificateDetailsScreen.kt:44)");
            }
            final f3 f3VarB = u2.b(0, rVarH, 0, 1);
            rVar2 = rVarH;
            i50.s.r(initialized.getScreenModel().getScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(1247186176, true, new er.q() { // from class: w11.d
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return i.j(f3VarB, initialized, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
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
            d5VarM.a(new er.p() { // from class: w11.e
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i.k(initialized, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j(f3 f3Var, c.a.Initialized initialized, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        f3.m mVar;
        float spacing400;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1247186176, i16, -1, "pl.gov.coi.mobywatel.feature.certificates.presentation.screens.details.CertificateDetailsScreenDataLoaded.<anonymous> (CertificateDetailsScreen.kt:50)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarL = a3.l(androidx.compose.foundation.layout.d.f(companion, 0.0f, 1, null), d3Var);
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            f3.m mVarR = a3.r(mVarL, aVar.b(rVar, i17).getSpacing200(), 0.0f, aVar.b(rVar, i17).getSpacing200(), 0.0f, 10, null);
            d1.i iVar = d1.i.f39152a;
            d1.i.n nVarK = iVar.k();
            f3.c.Companion companion2 = f3.c.INSTANCE;
            w0 w0VarA = e0.a(nVarK, companion2.k(), rVar, 0);
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
            f3.m mVarR2 = a3.r(h0.b(d1.i0.f39176a, t70.i.S(companion, f3Var, rVar, 6, 0), 1.0f, false, 2, null), 0.0f, aVar.b(rVar, i17).getSpacing100(), 0.0f, aVar.b(rVar, i17).getSpacing200(), 5, null);
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
            j70.h.g(a3.r(companion, 0.0f, 0.0f, 0.0f, aVar.b(rVar, i17).getSpacing200(), 7, null), null, initialized.getScreenModel().getDetailsHeader(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i17).j(), null, null, false, false, null, rVar, 0, 0, 0, 33030138);
            m30.i.d(initialized.getScreenModel().getDetailsSection(), null, null, rVar, 0, 6);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing200()), rVar, 0);
            AccordionData issuerAccordionData = initialized.getScreenModel().getIssuerAccordionData();
            int i18 = AccordionData.f16343b;
            b30.j.g(issuerAccordionData, rVar, i18);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing200()), rVar, 0);
            b30.j.g(initialized.getScreenModel().getUserAccordionData(), rVar, i18);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing200()), rVar, 0);
            n50.k invalidateSingleCardData = initialized.getScreenModel().getInvalidateSingleCardData();
            if (invalidateSingleCardData == null) {
                rVar.X(-923976167);
                rVar.R();
                mVar = null;
            } else {
                rVar.X(-923976166);
                mVar = null;
                n50.h0.v(invalidateSingleCardData, null, rVar, 0, 2);
                if (initialized.getScreenModel().getInfoAlertData() != null) {
                    rVar.X(4528899);
                    spacing400 = aVar.b(rVar, i17).getSpacing250();
                    rVar.R();
                } else {
                    rVar.X(4598339);
                    spacing400 = aVar.b(rVar, i17).getSpacing400();
                    rVar.R();
                }
                r3.a(androidx.compose.foundation.layout.d.i(companion, spacing400), rVar, 0);
                rVar.R();
            }
            c30.b.c infoAlertData = initialized.getScreenModel().getInfoAlertData();
            if (infoAlertData == null) {
                rVar.X(-923567153);
            } else {
                rVar.X(-923567152);
                c30.e.c(mVar, infoAlertData, rVar, 0, 1);
            }
            rVar.R();
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing200()), rVar, 0);
            rVar.x();
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
    public static final i0 k(c.a.Initialized initialized, int i15, p076m2.r rVar, int i16) {
        i(initialized, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private static final void l(final c.a.Error error, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(929214733);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(error) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(929214733, i16, -1, "pl.gov.coi.mobywatel.feature.certificates.presentation.screens.details.ErrorScreen (CertificateDetailsScreen.kt:110)");
            }
            error.getErrorVMS().b(rVarH, 0);
            Object objE = rVarH.E();
            if (objE == p076m2.r.INSTANCE.a()) {
                objE = new er.a() { // from class: w11.f
                    @Override // er.a
                    public final Object a() {
                        return i.m();
                    }
                };
                rVarH.v(objE);
            }
            q0.g(false, (er.a) objE, rVarH, 48, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: w11.g
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i.n(error, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m() {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n(c.a.Error error, int i15, p076m2.r rVar, int i16) {
        l(error, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
