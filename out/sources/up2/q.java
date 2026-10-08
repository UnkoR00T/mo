package up2;

import d1.a3;
import d1.d3;
import d1.r3;
import i50.BaseScaffoldData;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import q40.IconPageData;
import v40.InputDateTimeData;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\t\u0010\b\u001a\u001f\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0003¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0017\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0014²\u0006\f\u0010\u0006\u001a\u00020\u00138\nX\u008a\u0084\u0002"}, d2 = {"Lup2/e;", "viewModel", "Loq/i0;", "z", "(Lup2/e;Lm2/r;I)V", "Lup2/e$a$c;", "screenData", "w", "(Lup2/e$a$c;Lm2/r;I)V", "o", "Lv50/c;", "data", "", "isVisible", "l", "(Lv50/c;ZLm2/r;I)V", "Lup2/e$a$a;", "t", "(Lup2/e$a$a;Lm2/r;I)V", "Lup2/e$a;", "passportagreement_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class q {
    private static final e.a A(f6<? extends e.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 B(e eVar, int i15, p076m2.r rVar, int i16) {
        z(eVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void l(final v50.c cVar, boolean z15, p076m2.r rVar, final int i15) {
        int i16;
        final boolean z16;
        p076m2.r rVarH = rVar.h(147278921);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(cVar) : rVarH.G(cVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.a(z15) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(147278921, i16, -1, "pl.gov.coi.mobywatel.feature.passportagreement.presentation.enterchilddata.AnimatedField (PassportAgreementEnterChildDataScreen.kt:137)");
            }
            z16 = z15;
            p114t0.k.g(z16, null, null, null, null, y2.m.d(24426785, true, new er.q() { // from class: up2.p
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return q.m(cVar, (p114t0.l) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVarH, ((i16 >> 3) & 14) | 196608, 30);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            z16 = z15;
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: up2.g
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return q.n(cVar, z16, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 m(v50.c cVar, p114t0.l lVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(24426785, i15, -1, "pl.gov.coi.mobywatel.feature.passportagreement.presentation.enterchilddata.AnimatedField.<anonymous> (PassportAgreementEnterChildDataScreen.kt:139)");
        }
        u50.v0.g(cVar, null, rVar, v50.c.f203957t, 2);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 n(v50.c cVar, boolean z15, int i15, p076m2.r rVar, int i16) {
        l(cVar, z15, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void o(final e.a.Initialized initialized, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(1370812347);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(initialized) : rVarH.G(initialized) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1370812347, i16, -1, "pl.gov.coi.mobywatel.feature.passportagreement.presentation.enterchilddata.FieldList (PassportAgreementEnterChildDataScreen.kt:87)");
            }
            x30.c.c(null, 0.0f, y2.m.d(-2133006500, true, new er.p() { // from class: up2.l
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return q.p(initialized, (p076m2.r) obj, ((Integer) obj2).intValue());
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
            d5VarM.a(new er.p() { // from class: up2.m
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return q.s(initialized, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 p(final e.a.Initialized initialized, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-2133006500, i15, -1, "pl.gov.coi.mobywatel.feature.passportagreement.presentation.enterchilddata.FieldList.<anonymous> (PassportAgreementEnterChildDataScreen.kt:89)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            p036e4.w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
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
            v50.c.Text firstNameInputData = initialized.getFirstNameInputData();
            boolean namesFieldsVisible = initialized.getNamesFieldsVisible();
            int i16 = v50.c.Text.P;
            l(firstNameInputData, namesFieldsVisible, rVar, i16);
            p114t0.k.e(i0Var, initialized.getLastNameFieldVisible(), null, null, null, null, y2.m.d(-884487894, true, new er.q() { // from class: up2.n
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return q.q(initialized, (p114t0.l) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVar, 54), rVar, 1572870, 30);
            if (initialized.getNamesFieldsVisible()) {
                rVar.X(849247101);
                r3.a(androidx.compose.foundation.layout.d.i(companion, k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing100()), rVar, 0);
            } else {
                rVar.X(552834448);
            }
            rVar.R();
            l(initialized.getSecondNameInputData(), initialized.getNamesFieldsVisible(), rVar, i16);
            if (initialized.getNamesFieldsVisible()) {
                rVar.X(849254877);
                r3.a(androidx.compose.foundation.layout.d.i(companion, k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing200()), rVar, 0);
            } else {
                rVar.X(552834448);
            }
            rVar.R();
            l(initialized.getOtherNameInputData(), initialized.getNamesFieldsVisible(), rVar, i16);
            if (initialized.getLastNameFieldVisible() && initialized.getNamesFieldsVisible()) {
                rVar.X(557373747);
                r3.a(androidx.compose.foundation.layout.d.i(companion, k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing200()), rVar, 0);
                rVar.R();
            } else {
                rVar.X(557471955);
                r3.a(androidx.compose.foundation.layout.d.i(companion, k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing100()), rVar, 0);
                rVar.R();
            }
            l(initialized.getLastNameInputData(), initialized.getLastNameFieldVisible(), rVar, i16);
            p114t0.k.e(i0Var, initialized.getNamesFieldsVisible(), null, null, null, null, y2.m.d(-1673222623, true, new er.q() { // from class: up2.o
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return q.r(initialized, (p114t0.l) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVar, 54), rVar, 1572870, 30);
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing100()), rVar, 0);
            l(initialized.getPeselInputData(), initialized.getPeselFieldVisible(), rVar, v50.c.Number.P);
            s50.a.c noPeselSwitchData = initialized.getNoPeselSwitchData();
            if (noPeselSwitchData == null) {
                rVar.X(558056428);
            } else {
                rVar.X(558056429);
                s50.d.b(noPeselSwitchData, rVar, 0);
            }
            rVar.R();
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing100()), rVar, 0);
            v40.i.h(initialized.getBirthDateInputData(), rVar, InputDateTimeData.f203769m);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing200()), rVar, 0);
            u50.v0.g(initialized.getBirhtPlaceInputData(), null, rVar, i16, 2);
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
    public static final oq.i0 q(e.a.Initialized initialized, p114t0.l lVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-884487894, i15, -1, "pl.gov.coi.mobywatel.feature.passportagreement.presentation.enterchilddata.FieldList.<anonymous>.<anonymous>.<anonymous> (PassportAgreementEnterChildDataScreen.kt:95)");
        }
        s50.d.b(initialized.getNoNamesSwitchData(), rVar, 0);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 r(e.a.Initialized initialized, p114t0.l lVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1673222623, i15, -1, "pl.gov.coi.mobywatel.feature.passportagreement.presentation.enterchilddata.FieldList.<anonymous>.<anonymous>.<anonymous> (PassportAgreementEnterChildDataScreen.kt:117)");
        }
        s50.d.b(initialized.getNoLastNameSwitchData(), rVar, 0);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 s(e.a.Initialized initialized, int i15, p076m2.r rVar, int i16) {
        o(initialized, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void t(final e.a.AgreementExists agreementExists, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(1606147483);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(agreementExists) : rVarH.G(agreementExists) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1606147483, i16, -1, "pl.gov.coi.mobywatel.feature.passportagreement.presentation.enterchilddata.PassportAgreementEnterChildAgreementAlreadyExists (PassportAgreementEnterChildDataScreen.kt:145)");
            }
            rVar2 = rVarH;
            i50.s.r(agreementExists.getBaseScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-1212916748, true, new er.q() { // from class: up2.j
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return q.u(agreementExists, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
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
            d5VarM.a(new er.p() { // from class: up2.k
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return q.v(agreementExists, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 u(e.a.AgreementExists agreementExists, d3 d3Var, p076m2.r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= rVar.W(d3Var) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1212916748, i15, -1, "pl.gov.coi.mobywatel.feature.passportagreement.presentation.enterchilddata.PassportAgreementEnterChildAgreementAlreadyExists.<anonymous>.<anonymous> (PassportAgreementEnterChildDataScreen.kt:147)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarL = a3.l(androidx.compose.foundation.layout.d.h(companion, 0.0f, 1, null), d3Var);
            d1.i iVar = d1.i.f39152a;
            d1.i.n nVarK = iVar.k();
            f3.c.Companion companion2 = f3.c.INSTANCE;
            p036e4.w0 w0VarA = d1.e0.a(nVarK, companion2.k(), rVar, 0);
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
            p036e4.w0 w0VarA2 = d1.e0.a(iVar.k(), companion2.k(), rVar, 0);
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
            q40.i.b(agreementExists.b(), null, b.f199590a.b(), rVar, IconPageData.f164667h | MLKEMEngine.KyberPolyBytes, 2);
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
    public static final oq.i0 v(e.a.AgreementExists agreementExists, int i15, p076m2.r rVar, int i16) {
        t(agreementExists, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void w(final e.a.Initialized initialized, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-12845998);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(initialized) : rVarH.G(initialized) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-12845998, i16, -1, "pl.gov.coi.mobywatel.feature.passportagreement.presentation.enterchilddata.PassportAgreementEnterChildDataContent (PassportAgreementEnterChildDataScreen.kt:48)");
            }
            i50.s.r(initialized.getBaseScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(1365175749, true, new er.q() { // from class: up2.h
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return q.x(initialized, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVarH, BaseScaffoldData.f89350g, 196608, 32766);
            rVarH = rVarH;
            p088nul.q0.g(false, initialized.l(), rVarH, 0, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: up2.i
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return q.y(initialized, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 x(e.a.Initialized initialized, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1365175749, i16, -1, "pl.gov.coi.mobywatel.feature.passportagreement.presentation.enterchilddata.PassportAgreementEnterChildDataContent.<anonymous> (PassportAgreementEnterChildDataScreen.kt:50)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            f3.m mVarR = a3.r(a3.l(w0.i.d(companion, aVar.a(rVar, i17).getBase().a(), null, 2, null), d3Var), aVar.b(rVar, i17).getSpacing200(), 0.0f, aVar.b(rVar, i17).getSpacing200(), aVar.b(rVar, i17).getSpacing200(), 2, null);
            d1.i iVar = d1.i.f39152a;
            d1.i.n nVarK = iVar.k();
            f3.c.Companion companion2 = f3.c.INSTANCE;
            p036e4.w0 w0VarA = d1.e0.a(nVarK, companion2.k(), rVar, 0);
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
            f3.m mVarR2 = a3.r(t70.i.S(d1.h0.b(d1.i0.f39176a, companion, 1.0f, false, 2, null), null, rVar, 0, 1), 0.0f, aVar.b(rVar, i17).getSpacing100(), 0.0f, aVar.b(rVar, i17).getSpacing200(), 5, null);
            p036e4.w0 w0VarA2 = d1.e0.a(iVar.k(), companion2.k(), rVar, 0);
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
            j70.h.g(null, null, initialized.getTitle(), null, null, aVar.a(rVar, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i17).j(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing100()), rVar, 0);
            int i18 = BaseScaffoldData.f89350g;
            int i19 = v50.c.Text.P;
            o(initialized, rVar, i18 | i19 | i19 | i19 | i19 | v50.c.Number.P | i19 | InputDateTimeData.f203769m);
            rVar.x();
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing200()), rVar, 0);
            h30.q.p(initialized.getNextButtonData(), false, null, rVar, 0, 6);
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
    public static final oq.i0 y(e.a.Initialized initialized, int i15, p076m2.r rVar, int i16) {
        w(initialized, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void z(final e eVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(383140197);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(eVar) : rVarH.G(eVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(383140197, i16, -1, "pl.gov.coi.mobywatel.feature.passportagreement.presentation.enterchilddata.PassportAgreementEnterChildDataScreen (PassportAgreementEnterChildDataScreen.kt:37)");
            }
            e.a aVarA = A(m7.b.c(eVar.getState(), null, null, null, rVarH, 0, 7));
            if (aVarA instanceof e.a.Initialized) {
                rVarH.X(-1169451618);
                w((e.a.Initialized) aVarA, rVarH, 0);
                rVarH.R();
            } else if (fr.t.c(aVarA, e.a.d.f199667a)) {
                rVarH.X(-1169448490);
                c60.b.b(rVarH, 0);
                rVarH.R();
            } else if (aVarA instanceof e.a.AgreementExists) {
                rVarH.X(-1169446551);
                t((e.a.AgreementExists) aVarA, rVarH, 0);
                rVarH.R();
            } else {
                if (!(aVarA instanceof e.a.Error)) {
                    rVarH.X(-1169453499);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(-1169442963);
                ((e.a.Error) aVarA).getErrorVMS().b(rVarH, 0);
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
            d5VarM.a(new er.p() { // from class: up2.f
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return q.B(eVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
