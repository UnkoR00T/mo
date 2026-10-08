package lq2;

import d1.a3;
import d1.d3;
import d1.m3;
import d1.q3;
import d1.r3;
import i50.BaseScaffoldData;
import j40.DropDownButtonData;
import oq.i0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p088nul.q0;
import u50.v0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Llq2/d;", "viewModel", "Loq/i0;", "l", "(Llq2/d;Lm2/r;I)V", "Llq2/d$a;", "screenData", "f", "(Llq2/d$a;Lm2/r;I)V", "Llq2/d$a$c;", "h", "(Llq2/d$a$c;Lm2/r;I)V", "passportagreement_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class j {
    public static final void f(final d.a aVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1132393691);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(aVar) : rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1132393691, i16, -1, "pl.gov.coi.mobywatel.feature.passportagreement.presentation.yourdata.PassportAgreementYourDataContent (PassportAgreementYourDataScreen.kt:38)");
            }
            if (aVar instanceof d.a.Initial) {
                rVarH.X(-1603605706);
                c60.b.b(rVarH, 0);
                rVarH.R();
            } else if (aVar instanceof d.a.Error) {
                rVarH.X(-1603602739);
                ((d.a.Error) aVar).getErrorVMS().b(rVarH, 0);
                rVarH.R();
            } else {
                if (!(aVar instanceof d.a.Initialized)) {
                    rVarH.X(-1603607868);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(-1603600430);
                h((d.a.Initialized) aVar, rVarH, i16 & 14);
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
            d5VarM.a(new er.p() { // from class: lq2.f
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return j.g(aVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 g(d.a aVar, int i15, p076m2.r rVar, int i16) {
        f(aVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void h(final d.a.Initialized initialized, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(-549493901);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(initialized) : rVarH.G(initialized) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-549493901, i16, -1, "pl.gov.coi.mobywatel.feature.passportagreement.presentation.yourdata.PassportAgreementYourDataContentInitialized (PassportAgreementYourDataScreen.kt:49)");
            }
            rVar2 = rVarH;
            i50.s.r(initialized.getBaseScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(1502724826, true, new er.q() { // from class: lq2.g
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return j.i(initialized, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
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
            d5VarM.a(new er.p() { // from class: lq2.h
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return j.k(initialized, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(d.a.Initialized initialized, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        final d.a.Initialized initialized2;
        int i17;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1502724826, i16, -1, "pl.gov.coi.mobywatel.feature.passportagreement.presentation.yourdata.PassportAgreementYourDataContentInitialized.<anonymous>.<anonymous> (PassportAgreementYourDataScreen.kt:53)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarL = a3.l(companion, d3Var);
            k70.a aVar = k70.a.f108864a;
            int i18 = k70.a.f108865b;
            f3.m mVarP = a3.p(mVarL, aVar.b(rVar, i18).getSpacing200(), 0.0f, 2, null);
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
            f3.m mVarR = a3.r(t70.i.S(d1.h0.b(d1.i0.f39176a, companion, 1.0f, false, 2, null), null, rVar, 0, 1), 0.0f, aVar.b(rVar, i18).getSpacing100(), 0.0f, aVar.b(rVar, i18).getSpacing200(), 5, null);
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
            c30.e.c(null, initialized.getAlertData(), rVar, c30.b.f22944i << 3, 1);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i18).getSpacing200()), rVar, 0);
            j70.h.g(null, null, initialized.getHeaderLabel(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i18).i(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i18).getSpacing200()), rVar, 0);
            m30.i.d(initialized.getList(), null, null, rVar, 0, 6);
            if (initialized.getIdCardSeriesAndNumberStateFieldData() == null && initialized.getBirthPlaceFieldData() == null) {
                rVar.X(-199121412);
                rVar.R();
                i17 = 1;
                initialized2 = initialized;
            } else {
                rVar.X(-195948500);
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i18).getSpacing200()), rVar, 0);
                initialized2 = initialized;
                i17 = 1;
                x30.c.c(null, 0.0f, y2.m.d(-1864359358, true, new er.p() { // from class: lq2.i
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return j.j(initialized2, (p076m2.r) obj, ((Integer) obj2).intValue());
                    }
                }, rVar, 54), rVar, MLKEMEngine.KyberPolyBytes, 3);
                rVar.R();
            }
            rVar.x();
            f3.m mVarP2 = a3.p(companion, 0.0f, aVar.b(rVar, i18).getSpacing200(), i17, null);
            w0 w0VarB = m3.b(iVar.j(), companion2.l(), rVar, 0);
            int iHashCode3 = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT3 = rVar.t();
            f3.m mVarE3 = f3.j.e(rVar, mVarP2);
            er.a<androidx.compose.ui.node.c> aVarB3 = companion3.b();
            if (rVar.l() == null) {
                p076m2.m.d();
            }
            rVar.K();
            if (rVar.getInserting()) {
                rVar.H(aVarB3);
            } else {
                rVar.u();
            }
            p076m2.r rVarC3 = n6.c(rVar);
            n6.i(rVarC3, w0VarB, companion3.d());
            n6.i(rVarC3, e0VarT3, companion3.f());
            n6.i(rVarC3, Integer.valueOf(iHashCode3), companion3.c());
            n6.g(rVarC3, companion3.a());
            n6.i(rVarC3, mVarE3, companion3.e());
            q3 q3Var = q3.f39261a;
            h30.q.p(initialized2.getNextButtonData(), false, null, rVar, 0, 6);
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
    public static final i0 j(d.a.Initialized initialized, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1864359358, i15, -1, "pl.gov.coi.mobywatel.feature.passportagreement.presentation.yourdata.PassportAgreementYourDataContentInitialized.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PassportAgreementYourDataScreen.kt:75)");
            }
            d1.i.f fVarR = d1.i.f39152a.r(k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing200());
            f3.m.Companion companion = f3.m.INSTANCE;
            w0 w0VarA = d1.e0.a(fVarR, f3.c.INSTANCE.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, companion);
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
            DropDownButtonData documentTypeDropDownData = initialized.getDocumentTypeDropDownData();
            if (documentTypeDropDownData == null) {
                rVar.X(3807200);
            } else {
                rVar.X(3807201);
                j40.l.m(documentTypeDropDownData, rVar, DropDownButtonData.f99359i);
            }
            rVar.R();
            v50.c idCardSeriesAndNumberStateFieldData = initialized.getIdCardSeriesAndNumberStateFieldData();
            if (idCardSeriesAndNumberStateFieldData == null) {
                rVar.X(3931355);
            } else {
                rVar.X(3931356);
                v0.g(idCardSeriesAndNumberStateFieldData, null, rVar, v50.c.f203957t, 2);
            }
            rVar.R();
            v50.c idCardNameFieldData = initialized.getIdCardNameFieldData();
            if (idCardNameFieldData == null) {
                rVar.X(4044443);
            } else {
                rVar.X(4044444);
                v0.g(idCardNameFieldData, null, rVar, v50.c.f203957t, 2);
            }
            rVar.R();
            v50.c birthPlaceFieldData = initialized.getBirthPlaceFieldData();
            if (birthPlaceFieldData == null) {
                rVar.X(4157531);
            } else {
                rVar.X(4157532);
                v0.g(birthPlaceFieldData, null, rVar, v50.c.f203957t, 2);
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
    public static final i0 k(d.a.Initialized initialized, int i15, p076m2.r rVar, int i16) {
        h(initialized, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void l(final d dVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(1544465652);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(dVar) : rVarH.G(dVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1544465652, i16, -1, "pl.gov.coi.mobywatel.feature.passportagreement.presentation.yourdata.PassportAgreementYourDataScreen (PassportAgreementYourDataScreen.kt:30)");
            }
            f6 f6VarC = m7.b.c(dVar.getState(), null, null, null, rVarH, 0, 7);
            f(m(f6VarC), rVarH, 0);
            q0.g(false, m(f6VarC).a(), rVarH, 0, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: lq2.e
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return j.n(dVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final d.a m(f6<? extends d.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n(d dVar, int i15, p076m2.r rVar, int i16) {
        l(dVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
