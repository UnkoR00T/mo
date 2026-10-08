package v83;

import a50.RadioButtonData;
import d1.a3;
import d1.d3;
import d1.r3;
import i50.BaseScaffoldData;
import j30.ButtonTextData;
import j40.DropDownButtonData;
import mx.Label;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import t50.TextAreaData;
import u50.v0;
import w0.f3;
import w0.u2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\tH\u0003¢\u0006\u0004\b\n\u0010\u000b\u001a\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\fH\u0003¢\u0006\u0004\b\r\u0010\u000e\u001a%\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u000fH\u0003¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0014²\u0006\f\u0010\u0006\u001a\u00020\u00138\nX\u008a\u0084\u0002"}, d2 = {"Lv83/e;", "viewModel", "Loq/i0;", "u", "(Lv83/e;Lm2/r;I)V", "Lv83/e$a$b;", "data", "x", "(Lv83/e$a$b;Lm2/r;I)V", "Lv83/e$a$b$c;", "s", "(Lv83/e$a$b$c;Lm2/r;I)V", "Lv83/e$a$b$a;", "q", "(Lv83/e$a$b$a;Lm2/r;I)V", "Lkotlin/Function0;", "content", "l", "(Lv83/e$a$b;Ler/p;Lm2/r;I)V", "Lv83/e$a;", "technicalsupport_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class q {
    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 A(e.a.b bVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-502240259, i15, -1, "pl.gov.coi.mobywatel.feature.technicalsupport.presentation.screens.reporterror.ReportErrorScreenInitialized.<anonymous> (ReportErrorScreen.kt:62)");
            }
            q((e.a.b.InterfaceC5339a) bVar, rVar, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 B(e.a.b bVar, int i15, p076m2.r rVar, int i16) {
        x(bVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void l(final e.a.b bVar, final er.p<? super p076m2.r, ? super Integer, oq.i0> pVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(233446012);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(bVar) : rVarH.G(bVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(pVar) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(233446012, i16, -1, "pl.gov.coi.mobywatel.feature.technicalsupport.presentation.screens.reporterror.InnerContent (ReportErrorScreen.kt:121)");
            }
            final f3 f3VarB = u2.b(0, rVarH, 0, 1);
            rVar2 = rVarH;
            i50.s.r(bVar.getCommonData().getScaffoldData(), y2.m.d(-1769099993, true, new er.p() { // from class: v83.m
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return q.m(bVar, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(1595647023, true, new er.q() { // from class: v83.n
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return q.n(f3VarB, bVar, pVar, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
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
            d5VarM.a(new er.p() { // from class: v83.o
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return q.p(bVar, pVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 m(e.a.b bVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1769099993, i15, -1, "pl.gov.coi.mobywatel.feature.technicalsupport.presentation.screens.reporterror.InnerContent.<anonymous> (ReportErrorScreen.kt:127)");
            }
            f3.m mVarN = a3.n(f3.m.INSTANCE, k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing200());
            w0 w0VarI = d1.r.i(f3.c.INSTANCE.o(), false);
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
            n6.i(rVarC, w0VarI, companion.d());
            n6.i(rVarC, e0VarT, companion.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
            n6.g(rVarC, companion.a());
            n6.i(rVarC, mVarE, companion.e());
            d1.x xVar = d1.x.f39368a;
            h30.q.p(bVar.getCommonData().getNextButton(), false, null, rVar, 0, 6);
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
    public static final oq.i0 n(f3 f3Var, final e.a.b bVar, final er.p pVar, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1595647023, i16, -1, "pl.gov.coi.mobywatel.feature.technicalsupport.presentation.screens.reporterror.InnerContent.<anonymous> (ReportErrorScreen.kt:135)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarL = a3.l(androidx.compose.foundation.layout.d.f(companion, 0.0f, 1, null), d3Var);
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
            f3.m mVarN = t70.s.n(t70.i.S(companion, f3Var, rVar, 6, 0), rVar, 0);
            w0 w0VarA2 = d1.e0.a(iVar.k(), companion2.k(), rVar, 0);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT2 = rVar.t();
            f3.m mVarE2 = f3.j.e(rVar, mVarN);
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
            Label message = bVar.getCommonData().getMessage();
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            j70.h.g(null, null, message, null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i17).d(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing200()), rVar, 0);
            x30.c.c(null, 0.0f, y2.m.d(-992177790, true, new er.p() { // from class: v83.g
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return q.o(bVar, pVar, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVar, 54), rVar, MLKEMEngine.KyberPolyBytes, 3);
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
    public static final oq.i0 o(e.a.b bVar, er.p pVar, p076m2.r rVar, int i15) {
        p076m2.r rVar2;
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-992177790, i15, -1, "pl.gov.coi.mobywatel.feature.technicalsupport.presentation.screens.reporterror.InnerContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ReportErrorScreen.kt:151)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
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
            j40.l.m(bVar.getCommonData().getTopicDropDownButtonData(), rVar, DropDownButtonData.f99359i);
            ButtonTextData infoButtonData = bVar.getCommonData().getInfoButtonData();
            if (infoButtonData == null) {
                rVar.X(-472260059);
                rVar.R();
                rVar2 = rVar;
            } else {
                rVar.X(-472260058);
                r3.a(androidx.compose.foundation.layout.d.i(companion, k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing100()), rVar, 0);
                rVar2 = rVar;
                j30.f.e(null, infoButtonData, false, rVar2, ButtonTextData.f99099f << 3, 5);
                rVar2.R();
            }
            pVar.B(rVar2, 0);
            rVar2.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 p(e.a.b bVar, er.p pVar, int i15, p076m2.r rVar, int i16) {
        l(bVar, pVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void q(final e.a.b.InterfaceC5339a interfaceC5339a, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(704238039);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(interfaceC5339a) : rVarH.G(interfaceC5339a) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(704238039, i16, -1, "pl.gov.coi.mobywatel.feature.technicalsupport.presentation.screens.reporterror.InnerContentDrivingLicence (ReportErrorScreen.kt:101)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVarH, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, companion);
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
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i17).getSpacing200()), rVarH, 0);
            a50.k.j(interfaceC5339a.getIssueRadioButtonData(), rVarH, RadioButtonData.f3462h);
            if (interfaceC5339a instanceof e.a.b.InterfaceC5339a.Other) {
                rVarH.X(-2015026142);
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i17).getSpacing200()), rVarH, 0);
                t50.r.m(((e.a.b.InterfaceC5339a.Other) interfaceC5339a).getDescriptionTextAreaData(), null, rVarH, TextAreaData.f187694o, 2);
                rVarH.R();
            } else {
                if (!(interfaceC5339a instanceof e.a.b.InterfaceC5339a.DataDisparency)) {
                    rVarH.X(-757740069);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(-757730287);
                rVarH.R();
            }
            rVarH.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: v83.l
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return q.r(interfaceC5339a, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 r(e.a.b.InterfaceC5339a interfaceC5339a, int i15, p076m2.r rVar, int i16) {
        q(interfaceC5339a, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void s(final e.a.b.VehicleCard vehicleCard, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-101692692);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(vehicleCard) : rVarH.G(vehicleCard) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-101692692, i16, -1, "pl.gov.coi.mobywatel.feature.technicalsupport.presentation.screens.reporterror.InnerContentVehicles (ReportErrorScreen.kt:71)");
            }
            d1.i iVar = d1.i.f39152a;
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            d1.i.f fVarR = iVar.r(aVar.b(rVarH, i17).getSpacing200());
            f3.m mVarR = a3.r(f3.m.INSTANCE, 0.0f, aVar.b(rVarH, i17).getSpacing200(), 0.0f, 0.0f, 13, null);
            w0 w0VarA = d1.e0.a(fVarR, f3.c.INSTANCE.k(), rVarH, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, mVarR);
            androidx.compose.ui.node.c.Companion companion = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion.b();
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
            n6.i(rVarC, w0VarA, companion.d());
            n6.i(rVarC, e0VarT, companion.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
            n6.g(rVarC, companion.a());
            n6.i(rVarC, mVarE, companion.e());
            d1.i0 i0Var = d1.i0.f39176a;
            v50.c vehicleNumberTextFieldData = vehicleCard.getVehicleNumberTextFieldData();
            int i18 = v50.c.f203957t;
            v0.g(vehicleNumberTextFieldData, null, rVarH, i18, 2);
            v0.g(vehicleCard.getNamesTextFieldData(), null, rVarH, i18, 2);
            j70.h.g(null, null, vehicleCard.getStatusLabel(), null, null, aVar.a(rVarH, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i17).d(), null, null, false, false, null, rVarH, 0, 0, 0, 33030107);
            rVarH = rVarH;
            a50.k.j(vehicleCard.getStatusRadioButtonData(), rVarH, RadioButtonData.f3462h);
            j40.l.m(vehicleCard.getReasonDropDownData(), rVarH, DropDownButtonData.f99359i);
            t50.r.m(vehicleCard.getDescriptionTextAreaData(), null, rVarH, TextAreaData.f187694o, 2);
            rVarH.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: v83.p
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return q.t(vehicleCard, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 t(e.a.b.VehicleCard vehicleCard, int i15, p076m2.r rVar, int i16) {
        s(vehicleCard, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void u(final e eVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(1368357390);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(eVar) : rVarH.G(eVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1368357390, i16, -1, "pl.gov.coi.mobywatel.feature.technicalsupport.presentation.screens.reporterror.ReportErrorScreen (ReportErrorScreen.kt:32)");
            }
            e.a aVarV = v(m7.b.c(eVar.getState(), null, null, null, rVarH, 0, 7));
            if (fr.t.c(aVarV, e.a.C5338a.f204541a)) {
                rVarH.X(1200583730);
                rVarH.R();
            } else {
                if (aVarV instanceof e.a.b) {
                    rVarH.X(731466871);
                    x((e.a.b) aVarV, rVarH, 0);
                } else {
                    rVarH.X(1198816916);
                }
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
            d5VarM.a(new er.p() { // from class: v83.f
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return q.w(eVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final e.a v(f6<? extends e.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 w(e eVar, int i15, p076m2.r rVar, int i16) {
        u(eVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void x(final e.a.b bVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-627117394);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(bVar) : rVarH.G(bVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-627117394, i16, -1, "pl.gov.coi.mobywatel.feature.technicalsupport.presentation.screens.reporterror.ReportErrorScreenInitialized (ReportErrorScreen.kt:44)");
            }
            if (bVar instanceof e.a.b.Generic) {
                rVarH.X(-1364388871);
                l(bVar, y2.m.d(1754675461, true, new er.p() { // from class: v83.h
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return q.y(bVar, (p076m2.r) obj, ((Integer) obj2).intValue());
                    }
                }, rVarH, 54), rVarH, (i16 & 14) | 48);
                rVarH.R();
            } else if (bVar instanceof e.a.b.VehicleCard) {
                rVarH.X(-1364380469);
                l(bVar, y2.m.d(459384956, true, new er.p() { // from class: v83.i
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return q.z(bVar, (p076m2.r) obj, ((Integer) obj2).intValue());
                    }
                }, rVarH, 54), rVarH, (i16 & 14) | 48);
                rVarH.R();
            } else {
                if (!(bVar instanceof e.a.b.InterfaceC5339a)) {
                    rVarH.X(-1364390747);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(-1364375375);
                l(bVar, y2.m.d(-502240259, true, new er.p() { // from class: v83.j
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return q.A(bVar, (p076m2.r) obj, ((Integer) obj2).intValue());
                    }
                }, rVarH, 54), rVarH, (i16 & 14) | 48);
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
            d5VarM.a(new er.p() { // from class: v83.k
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return q.B(bVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 y(e.a.b bVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1754675461, i15, -1, "pl.gov.coi.mobywatel.feature.technicalsupport.presentation.screens.reporterror.ReportErrorScreenInitialized.<anonymous> (ReportErrorScreen.kt:50)");
            }
            r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing200()), rVar, 0);
            t50.r.m(((e.a.b.Generic) bVar).getDescriptionTextAreaData(), null, rVar, TextAreaData.f187694o, 2);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 z(e.a.b bVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(459384956, i15, -1, "pl.gov.coi.mobywatel.feature.technicalsupport.presentation.screens.reporterror.ReportErrorScreenInitialized.<anonymous> (ReportErrorScreen.kt:57)");
            }
            s((e.a.b.VehicleCard) bVar, rVar, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }
}
