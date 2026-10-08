package mp2;

import d1.a3;
import d1.d3;
import d1.h0;
import d1.r3;
import i50.BaseScaffoldData;
import oq.i0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p088nul.q0;
import q40.IconPageData;
import u50.v0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r²\u0006\f\u0010\u0006\u001a\u00020\f8\nX\u008a\u0084\u0002"}, d2 = {"Lmp2/e;", "viewModel", "Loq/i0;", "n", "(Lmp2/e;Lm2/r;I)V", "Lmp2/e$a$d;", "screenData", "j", "(Lmp2/e$a$d;Lm2/r;I)V", "Lmp2/e$a$a;", "g", "(Lmp2/e$a$a;Lm2/r;I)V", "Lmp2/e$a;", "passportagreement_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class l {
    public static final void g(final e.a.AgreementExists agreementExists, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(763692530);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(agreementExists) : rVarH.G(agreementExists) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(763692530, i16, -1, "pl.gov.coi.mobywatel.feature.passportagreement.presentation.childdata.PassportAgreementChildDataAgreementExistsContent (PassportAgreementChildDataScreen.kt:85)");
            }
            i50.s.r(agreementExists.getBaseScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(1674315065, true, new er.q() { // from class: mp2.i
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return l.h(agreementExists, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVarH, BaseScaffoldData.f89350g, 196608, 32766);
            rVarH = rVarH;
            q0.g(false, agreementExists.c(), rVarH, 0, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: mp2.j
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return l.i(agreementExists, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(e.a.AgreementExists agreementExists, d3 d3Var, p076m2.r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= rVar.W(d3Var) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1674315065, i15, -1, "pl.gov.coi.mobywatel.feature.passportagreement.presentation.childdata.PassportAgreementChildDataAgreementExistsContent.<anonymous>.<anonymous> (PassportAgreementChildDataScreen.kt:87)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarL = a3.l(androidx.compose.foundation.layout.d.h(companion, 0.0f, 1, null), d3Var);
            d1.i iVar = d1.i.f39152a;
            d1.i.n nVarK = iVar.k();
            f3.c.Companion companion2 = f3.c.INSTANCE;
            w0 w0VarA = d1.e0.a(nVarK, companion2.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarL);
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
            d1.i0 i0Var = d1.i0.f39176a;
            w0 w0VarA2 = d1.e0.a(iVar.k(), companion2.k(), rVar, 0);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT2 = rVar.t();
            f3.m mVarE2 = f3.j.e(rVar, companion);
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
            q40.i.b(agreementExists.b(), null, b.f127482a.b(), rVar, IconPageData.f164667h | MLKEMEngine.KyberPolyBytes, 2);
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
    public static final i0 i(e.a.AgreementExists agreementExists, int i15, p076m2.r rVar, int i16) {
        g(agreementExists, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void j(final e.a.Initialized initialized, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(781863342);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(initialized) : rVarH.G(initialized) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(781863342, i16, -1, "pl.gov.coi.mobywatel.feature.passportagreement.presentation.childdata.PassportAgreementChildDataContent (PassportAgreementChildDataScreen.kt:44)");
            }
            rVar2 = rVarH;
            i50.s.r(initialized.getBaseScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-1451622379, true, new er.q() { // from class: mp2.g
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return l.k(initialized, initialized, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
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
            d5VarM.a(new er.p() { // from class: mp2.h
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return l.m(initialized, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k(e.a.Initialized initialized, e.a.Initialized initialized2, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        int i17;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1451622379, i16, -1, "pl.gov.coi.mobywatel.feature.passportagreement.presentation.childdata.PassportAgreementChildDataContent.<anonymous>.<anonymous> (PassportAgreementChildDataScreen.kt:46)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarL = a3.l(companion, d3Var);
            k70.a aVar = k70.a.f108864a;
            int i18 = k70.a.f108865b;
            f3.m mVarP = a3.p(a3.r(mVarL, 0.0f, 0.0f, 0.0f, aVar.b(rVar, i18).getSpacing200(), 7, null), aVar.b(rVar, i18).getSpacing200(), 0.0f, 2, null);
            d1.i iVar = d1.i.f39152a;
            d1.i.n nVarK = iVar.k();
            f3.c.Companion companion2 = f3.c.INSTANCE;
            w0 w0VarA = d1.e0.a(nVarK, companion2.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarP);
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
            f3.m mVarR = a3.r(t70.i.S(h0.b(d1.i0.f39176a, companion, 1.0f, false, 2, null), null, rVar, 0, 1), 0.0f, aVar.b(rVar, i18).getSpacing100(), 0.0f, aVar.b(rVar, i18).getSpacing200(), 5, null);
            w0 w0VarA2 = d1.e0.a(iVar.k(), companion2.k(), rVar, 0);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT2 = rVar.t();
            f3.m mVarE2 = f3.j.e(rVar, mVarR);
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
            j70.h.g(null, null, initialized.getHeaderLabel(), null, null, aVar.a(rVar, i18).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i18).i(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i18).getSpacing200()), rVar, 0);
            m30.i.d(initialized.getChildData(), null, null, rVar, 0, 6);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i18).getSpacing200()), rVar, 0);
            final v50.c birthDateInputData = initialized2.getBirthDateInputData();
            if (birthDateInputData == null) {
                rVar.X(-1527246279);
                rVar.R();
                i17 = 1;
            } else {
                rVar.X(-1527246278);
                i17 = 1;
                x30.c.c(null, 0.0f, y2.m.d(-2115949916, true, new er.p() { // from class: mp2.k
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return l.l(birthDateInputData, (p076m2.r) obj, ((Integer) obj2).intValue());
                    }
                }, rVar, 54), rVar, MLKEMEngine.KyberPolyBytes, 3);
                rVar.R();
            }
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i18).getSpacing300()), rVar, 0);
            c30.e.c(null, initialized.getAlertData(), rVar, c30.b.f22944i << 3, i17);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i18).getSpacing100()), rVar, 0);
            rVar.x();
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i18).getSpacing200()), rVar, 0);
            h30.q.p(initialized.getButtonData(), false, null, rVar, 0, 6);
            rVar.x();
            q0.g(false, initialized.g(), rVar, 0, i17);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(v50.c cVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-2115949916, i15, -1, "pl.gov.coi.mobywatel.feature.passportagreement.presentation.childdata.PassportAgreementChildDataContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PassportAgreementChildDataScreen.kt:68)");
            }
            v0.g(cVar, null, rVar, v50.c.f203957t, 2);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(e.a.Initialized initialized, int i15, p076m2.r rVar, int i16) {
        j(initialized, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void n(final e eVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1928834743);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(eVar) : rVarH.G(eVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1928834743, i16, -1, "pl.gov.coi.mobywatel.feature.passportagreement.presentation.childdata.PassportAgreementChildDataScreen (PassportAgreementChildDataScreen.kt:30)");
            }
            e.a aVarO = o(m7.b.c(eVar.getState(), null, null, null, rVarH, 0, 7));
            if (aVarO instanceof e.a.c) {
                rVarH.X(1815691770);
                c60.b.b(rVarH, 0);
                rVarH.R();
            } else if (aVarO instanceof e.a.Initialized) {
                rVarH.X(1815694429);
                j((e.a.Initialized) aVarO, rVarH, 0);
                rVarH.R();
            } else if (aVarO instanceof e.a.AgreementExists) {
                rVarH.X(1815698508);
                g((e.a.AgreementExists) aVarO, rVarH, 0);
                rVarH.R();
            } else {
                if (!(aVarO instanceof e.a.Error)) {
                    rVarH.X(1815689293);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(1815702929);
                ((e.a.Error) aVarO).getErrorVMS().b(rVarH, 0);
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
            d5VarM.a(new er.p() { // from class: mp2.f
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return l.p(eVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final e.a o(f6<? extends e.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p(e eVar, int i15, p076m2.r rVar, int i16) {
        n(eVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
