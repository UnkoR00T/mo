package b11;

import d1.a3;
import d1.d3;
import d1.m3;
import d1.q3;
import d1.r3;
import i50.BaseScaffoldData;
import mx.Label;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p046f2.c2;
import p046f2.y1;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import q40.IconPageBottomContentData;
import q40.IconPageData;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\fH\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0011²\u0006\f\u0010\u0010\u001a\u00020\u000f8\nX\u008a\u0084\u0002"}, d2 = {"Lb11/p;", "viewModel", "Loq/i0;", "w", "(Lb11/p;Lm2/r;I)V", "Lb11/p$a$b;", "data", "m", "(Lb11/p$a$b;Lm2/r;I)V", "Lb11/p$a$c;", "s", "(Lb11/p$a$c;Lm2/r;I)V", "Lb11/p$a$d;", "z", "(Lb11/p$a$d;Lm2/r;I)V", "Lb11/p$a;", "state", "notifications_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class m {
    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 A(p.a.UnableToConfirm unableToConfirm, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        f3.m.Companion companion;
        int i17;
        k70.a aVar;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1578240944, i16, -1, "pl.gov.coi.mobywatel.feature.authconfirmation.presentation.confirmation.AuthConfirmationUnableToConfirmScreen.<anonymous> (AuthConfirmationScreen.kt:203)");
            }
            f3.m.Companion companion2 = f3.m.INSTANCE;
            f3.m mVarL = a3.l(androidx.compose.foundation.layout.d.f(companion2, 0.0f, 1, null), d3Var);
            k70.a aVar2 = k70.a.f108864a;
            int i18 = k70.a.f108865b;
            f3.m mVarQ = a3.q(mVarL, aVar2.b(rVar, i18).getSpacing200(), aVar2.b(rVar, i18).getSpacing100(), aVar2.b(rVar, i18).getSpacing200(), aVar2.b(rVar, i18).getSpacing200());
            d1.i iVar = d1.i.f39152a;
            d1.i.n nVarK = iVar.k();
            f3.c.Companion companion3 = f3.c.INSTANCE;
            p036e4.w0 w0VarA = d1.e0.a(nVarK, companion3.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarQ);
            androidx.compose.ui.node.c.Companion companion4 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion4.b();
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
            n6.i(rVarC, w0VarA, companion4.d());
            n6.i(rVarC, e0VarT, companion4.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion4.c());
            n6.g(rVarC, companion4.a());
            n6.i(rVarC, mVarE, companion4.e());
            f3.m mVarB = d1.h0.b(d1.i0.f39176a, companion2, 1.0f, false, 2, null);
            p036e4.w0 w0VarA2 = d1.e0.a(iVar.k(), companion3.k(), rVar, 0);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT2 = rVar.t();
            f3.m mVarE2 = f3.j.e(rVar, mVarB);
            er.a<androidx.compose.ui.node.c> aVarB2 = companion4.b();
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
            n6.i(rVarC2, w0VarA2, companion4.d());
            n6.i(rVarC2, e0VarT2, companion4.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion4.c());
            n6.g(rVarC2, companion4.a());
            n6.i(rVarC2, mVarE2, companion4.e());
            j70.h.g(null, null, unableToConfirm.getMessageDate(), null, null, aVar2.a(rVar, i18).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVar, i18).f(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
            r3.a(androidx.compose.foundation.layout.d.i(companion2, aVar2.b(rVar, i18).getSpacing300()), rVar, 0);
            j70.h.g(null, null, unableToConfirm.getMessageTitle(), null, null, aVar2.a(rVar, i18).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVar, i18).a(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
            r3.a(androidx.compose.foundation.layout.d.i(companion2, aVar2.b(rVar, i18).getSpacing200()), rVar, 0);
            j70.h.g(null, null, unableToConfirm.getMessageText(), null, null, aVar2.a(rVar, i18).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVar, i18).b(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
            p076m2.r rVar2 = rVar;
            Label messagePrivateText = unableToConfirm.getMessagePrivateText();
            if (messagePrivateText == null) {
                rVar2.X(1362076892);
                rVar2.R();
                companion = companion2;
                aVar = aVar2;
                i17 = i18;
            } else {
                rVar2.X(1362076893);
                r3.a(androidx.compose.foundation.layout.d.i(companion2, aVar2.b(rVar2, i18).getSpacing200()), rVar2, 0);
                companion = companion2;
                i17 = i18;
                aVar = aVar2;
                j70.h.g(null, null, messagePrivateText, null, null, aVar2.a(rVar2, i18).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVar2, i18).b(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
                rVar2 = rVar;
                oq.i0 i0Var = oq.i0.f148189a;
                rVar2.R();
            }
            rVar2.x();
            k70.a aVar3 = aVar;
            int i19 = i17;
            f3.m.Companion companion5 = companion;
            f3.m mVarR = a3.r(companion5, aVar3.b(rVar2, i19).getSpacing200(), aVar3.b(rVar2, i19).getSpacing200(), aVar3.b(rVar2, i19).getSpacing200(), 0.0f, 8, null);
            p036e4.w0 w0VarA3 = d1.e0.a(iVar.k(), companion3.k(), rVar2, 0);
            int iHashCode3 = Long.hashCode(p076m2.m.b(rVar2, 0));
            p076m2.e0 e0VarT3 = rVar2.t();
            f3.m mVarE3 = f3.j.e(rVar2, mVarR);
            er.a<androidx.compose.ui.node.c> aVarB3 = companion4.b();
            if (rVar2.l() == null) {
                p076m2.m.d();
            }
            rVar2.K();
            if (rVar2.getInserting()) {
                rVar2.H(aVarB3);
            } else {
                rVar2.u();
            }
            p076m2.r rVarC3 = n6.c(rVar2);
            n6.i(rVarC3, w0VarA3, companion4.d());
            n6.i(rVarC3, e0VarT3, companion4.f());
            n6.i(rVarC3, Integer.valueOf(iHashCode3), companion4.c());
            n6.g(rVarC3, companion4.a());
            n6.i(rVarC3, mVarE3, companion4.e());
            j70.h.g(androidx.compose.foundation.layout.d.h(companion5, 0.0f, 1, null), null, unableToConfirm.getInfoText(), null, null, aVar3.a(rVar2, i19).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, b5.j.h(b5.j.INSTANCE.a()), 0L, 0, false, 0, 0, null, aVar3.f(rVar2, i19).a(), null, null, false, false, null, rVar, 6, 0, 0, 33026010);
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
    public static final oq.i0 B(p.a.UnableToConfirm unableToConfirm) {
        unableToConfirm.f().a();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 C(p.a.UnableToConfirm unableToConfirm, int i15, p076m2.r rVar, int i16) {
        z(unableToConfirm, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void m(final p.a.ReadyToConfirm readyToConfirm, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1408141347);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(readyToConfirm) : rVarH.G(readyToConfirm) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1408141347, i16, -1, "pl.gov.coi.mobywatel.feature.authconfirmation.presentation.confirmation.AuthConfirmationEntryScreen (AuthConfirmationScreen.kt:60)");
            }
            i50.s.r(readyToConfirm.getScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(1008325392, true, new er.q() { // from class: b11.a
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return m.n(readyToConfirm, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVarH, BaseScaffoldData.f89350g, 196608, 32766);
            rVarH = rVarH;
            Object objE = rVarH.E();
            if (objE == p076m2.r.INSTANCE.a()) {
                objE = new er.a() { // from class: b11.d
                    @Override // er.a
                    public final Object a() {
                        return m.q();
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
            d5VarM.a(new er.p() { // from class: b11.e
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return m.r(readyToConfirm, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 n(final p.a.ReadyToConfirm readyToConfirm, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        f3.m.Companion companion;
        k70.a aVar;
        int i17;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1008325392, i16, -1, "pl.gov.coi.mobywatel.feature.authconfirmation.presentation.confirmation.AuthConfirmationEntryScreen.<anonymous> (AuthConfirmationScreen.kt:62)");
            }
            f3.m.Companion companion2 = f3.m.INSTANCE;
            f3.m mVarF = androidx.compose.foundation.layout.d.f(companion2, 0.0f, 1, null);
            k70.a aVar2 = k70.a.f108864a;
            int i18 = k70.a.f108865b;
            f3.m mVarQ = a3.q(a3.l(w0.i.d(mVarF, aVar2.a(rVar, i18).getBase().a(), null, 2, null), d3Var), aVar2.b(rVar, i18).getSpacing200(), aVar2.b(rVar, i18).getSpacing100(), aVar2.b(rVar, i18).getSpacing200(), aVar2.b(rVar, i18).getSpacing200());
            d1.i iVar = d1.i.f39152a;
            d1.i.n nVarK = iVar.k();
            f3.c.Companion companion3 = f3.c.INSTANCE;
            p036e4.w0 w0VarA = d1.e0.a(nVarK, companion3.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarQ);
            androidx.compose.ui.node.c.Companion companion4 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion4.b();
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
            n6.i(rVarC, w0VarA, companion4.d());
            n6.i(rVarC, e0VarT, companion4.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion4.c());
            n6.g(rVarC, companion4.a());
            n6.i(rVarC, mVarE, companion4.e());
            f3.m mVarB = d1.h0.b(d1.i0.f39176a, companion2, 1.0f, false, 2, null);
            p036e4.w0 w0VarA2 = d1.e0.a(iVar.k(), companion3.k(), rVar, 0);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT2 = rVar.t();
            f3.m mVarE2 = f3.j.e(rVar, mVarB);
            er.a<androidx.compose.ui.node.c> aVarB2 = companion4.b();
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
            n6.i(rVarC2, w0VarA2, companion4.d());
            n6.i(rVarC2, e0VarT2, companion4.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion4.c());
            n6.g(rVarC2, companion4.a());
            n6.i(rVarC2, mVarE2, companion4.e());
            j70.h.g(null, null, readyToConfirm.getMessageDate(), null, null, aVar2.a(rVar, i18).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVar, i18).f(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
            r3.a(androidx.compose.foundation.layout.d.i(companion2, aVar2.b(rVar, i18).getSpacing300()), rVar, 0);
            j70.h.g(null, null, readyToConfirm.getMessageTitle(), null, null, aVar2.a(rVar, i18).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVar, i18).a(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
            r3.a(androidx.compose.foundation.layout.d.i(companion2, aVar2.b(rVar, i18).getSpacing200()), rVar, 0);
            j70.h.g(null, null, readyToConfirm.getMessageText(), null, null, aVar2.a(rVar, i18).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVar, i18).b(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
            p076m2.r rVar2 = rVar;
            Label messagePrivateText = readyToConfirm.getMessagePrivateText();
            if (messagePrivateText == null) {
                rVar2.X(1072928116);
                rVar2.R();
                companion = companion2;
                aVar = aVar2;
                i17 = i18;
            } else {
                rVar2.X(1072928117);
                r3.a(androidx.compose.foundation.layout.d.i(companion2, aVar2.b(rVar2, i18).getSpacing200()), rVar2, 0);
                companion = companion2;
                j70.h.g(null, null, messagePrivateText, null, null, aVar2.a(rVar2, i18).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVar2, i18).b(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
                rVar2 = rVar;
                oq.i0 i0Var = oq.i0.f148189a;
                rVar2.R();
                aVar = aVar2;
                i17 = i18;
            }
            f3.m.Companion companion5 = companion;
            r3.a(androidx.compose.foundation.layout.d.i(companion5, aVar.b(rVar2, i17).getSpacing300()), rVar2, 0);
            if (readyToConfirm.getProgress() > 0.0f) {
                rVar2.X(1073397364);
                f3.m mVarP = a3.p(androidx.compose.foundation.layout.d.C(androidx.compose.foundation.layout.d.h(companion5, 0.0f, 1, null), null, false, 3, null), 0.0f, aVar.b(rVar2, i17).getSpacing100(), 1, null);
                y1 y1Var = y1.f58315a;
                long jC = aVar.a(rVar2, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().c();
                int i19 = y1.f58316b;
                c2.c(mVarP, l1.h.f(aVar.b(rVar, i17).getSpacing150()), y1Var.b(jC, 0L, 0L, 0L, rVar, i19 << 12, 14), y1Var.c(aVar.c(rVar, i17).getLevel0(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, rVar, i19 << 18, 62), null, y2.m.d(-2074215561, true, new er.q() { // from class: b11.l
                    @Override // er.q
                    public final Object w(Object obj, Object obj2, Object obj3) {
                        return m.o(readyToConfirm, (d1.h0) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                    }
                }, rVar, 54), rVar, 196608, 16);
                rVar2 = rVar;
            } else {
                rVar2.X(1069360606);
            }
            rVar2.R();
            rVar2.x();
            k70.a aVar3 = aVar;
            int i25 = i17;
            f3.m mVarR = a3.r(companion5, 0.0f, aVar.b(rVar2, i17).getSpacing200(), 0.0f, 0.0f, 13, null);
            p036e4.w0 w0VarA3 = d1.e0.a(iVar.k(), companion3.k(), rVar2, 0);
            int iHashCode3 = Long.hashCode(p076m2.m.b(rVar2, 0));
            p076m2.e0 e0VarT3 = rVar2.t();
            f3.m mVarE3 = f3.j.e(rVar2, mVarR);
            er.a<androidx.compose.ui.node.c> aVarB3 = companion4.b();
            if (rVar2.l() == null) {
                p076m2.m.d();
            }
            rVar2.K();
            if (rVar2.getInserting()) {
                rVar2.H(aVarB3);
            } else {
                rVar2.u();
            }
            p076m2.r rVarC3 = n6.c(rVar2);
            n6.i(rVarC3, w0VarA3, companion4.d());
            n6.i(rVarC3, e0VarT3, companion4.f());
            n6.i(rVarC3, Integer.valueOf(iHashCode3), companion4.c());
            n6.g(rVarC3, companion4.a());
            n6.i(rVarC3, mVarE3, companion4.e());
            h30.q.p(readyToConfirm.getConfirmButton(), false, null, rVar2, 0, 6);
            r3.a(androidx.compose.foundation.layout.d.i(companion5, aVar3.b(rVar2, i25).getSpacing150()), rVar2, 0);
            h30.q.p(readyToConfirm.getRejectButton(), false, null, rVar2, 0, 6);
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
    public static final oq.i0 o(final p.a.ReadyToConfirm readyToConfirm, d1.h0 h0Var, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 17) != 16, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-2074215561, i15, -1, "pl.gov.coi.mobywatel.feature.authconfirmation.presentation.confirmation.AuthConfirmationEntryScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AuthConfirmationScreen.kt:120)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarH = androidx.compose.foundation.layout.d.h(companion, 0.0f, 1, null);
            k70.a aVar = k70.a.f108864a;
            int i16 = k70.a.f108865b;
            f3.m mVarO = a3.o(mVarH, aVar.b(rVar, i16).getSpacing200(), aVar.b(rVar, i16).getSpacing300());
            d1.i iVar = d1.i.f39152a;
            d1.i.n nVarK = iVar.k();
            f3.c.Companion companion2 = f3.c.INSTANCE;
            p036e4.w0 w0VarA = d1.e0.a(nVarK, companion2.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarO);
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
            f3.m mVarI = androidx.compose.foundation.layout.d.i(androidx.compose.foundation.layout.d.h(companion, 0.0f, 1, null), aVar.b(rVar, i16).getSpacing50());
            boolean zG = rVar.G(readyToConfirm);
            Object objE = rVar.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.a() { // from class: b11.b
                    @Override // er.a
                    public final Object a() {
                        return Float.valueOf(m.p(readyToConfirm));
                    }
                };
                rVar.v(objE);
            }
            k60.c.c(mVarI, (er.a) objE, 0, 0L, rVar, 0, 12);
            f3.m mVarR = a3.r(androidx.compose.foundation.layout.d.h(companion, 0.0f, 1, null), 0.0f, aVar.b(rVar, i16).getSpacing300(), 0.0f, 0.0f, 13, null);
            p036e4.w0 w0VarB = m3.b(iVar.e(), companion2.l(), rVar, 6);
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
            n6.i(rVarC2, w0VarB, companion3.d());
            n6.i(rVarC2, e0VarT2, companion3.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion3.c());
            n6.g(rVarC2, companion3.a());
            n6.i(rVarC2, mVarE2, companion3.e());
            q3 q3Var = q3.f39261a;
            j70.h.g(null, null, readyToConfirm.getTimeLabel(), null, null, aVar.a(rVar, i16).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i16).b(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
            j70.h.g(a3.r(companion, aVar.b(rVar, i16).getSpacing25(), 0.0f, 0.0f, 0.0f, 14, null), null, readyToConfirm.getTimeFormatted(), null, null, aVar.a(rVar, i16).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i16).a(), null, null, false, false, null, rVar, 0, 0, 0, 33030106);
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
    public static final float p(p.a.ReadyToConfirm readyToConfirm) {
        return readyToConfirm.getProgress();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 q() {
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 r(p.a.ReadyToConfirm readyToConfirm, int i15, p076m2.r rVar, int i16) {
        m(readyToConfirm, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void s(final p.a.Success success, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(803604565);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(success) : rVarH.G(success) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(803604565, i16, -1, "pl.gov.coi.mobywatel.feature.authconfirmation.presentation.confirmation.AuthConfirmationResultScreen (AuthConfirmationScreen.kt:178)");
            }
            int i17 = i16;
            i50.s.r(success.getScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-1756133944, true, new er.q() { // from class: b11.i
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return m.t(success, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVarH, BaseScaffoldData.f89350g, 196608, 32766);
            rVarH = rVarH;
            boolean z15 = (i17 & 14) == 4 || ((i17 & 8) != 0 && rVarH.G(success));
            Object objE = rVarH.E();
            if (z15 || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.a() { // from class: b11.j
                    @Override // er.a
                    public final Object a() {
                        return m.u(success);
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
            d5VarM.a(new er.p() { // from class: b11.k
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return m.v(success, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 t(p.a.Success success, d3 d3Var, p076m2.r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= rVar.W(d3Var) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1756133944, i15, -1, "pl.gov.coi.mobywatel.feature.authconfirmation.presentation.confirmation.AuthConfirmationResultScreen.<anonymous> (AuthConfirmationScreen.kt:180)");
            }
            f3.m mVarL = a3.l(androidx.compose.foundation.layout.d.f(f3.m.INSTANCE, 0.0f, 1, null), d3Var);
            p036e4.w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarL);
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
            q40.i.b(success.a(), null, x0.f16113a.b(), rVar, IconPageData.f164667h | IconPageBottomContentData.f164663d | MLKEMEngine.KyberPolyBytes, 2);
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
    public static final oq.i0 u(p.a.Success success) {
        success.b().a();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 v(p.a.Success success, int i15, p076m2.r rVar, int i16) {
        s(success, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void w(final p pVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(1012352729);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(pVar) : rVarH.G(pVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1012352729, i16, -1, "pl.gov.coi.mobywatel.feature.authconfirmation.presentation.confirmation.AuthConfirmationScreen (AuthConfirmationScreen.kt:35)");
            }
            p.a aVarX = x(m7.b.c(pVar.getState(), null, null, null, rVarH, 0, 7));
            if (fr.t.c(aVarX, p.a.C0379a.f16062a)) {
                rVarH.X(-2086596867);
                rVarH.R();
            } else if (aVarX instanceof p.a.ReadyToConfirm) {
                rVarH.X(-2086594542);
                m((p.a.ReadyToConfirm) aVarX, rVarH, 0);
                rVarH.R();
            } else if (aVarX instanceof p.a.Success) {
                rVarH.X(-2086590797);
                s((p.a.Success) aVarX, rVarH, 0);
                rVarH.R();
            } else {
                if (!(aVarX instanceof p.a.UnableToConfirm)) {
                    rVarH.X(-2086598749);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(-2086586756);
                z((p.a.UnableToConfirm) aVarX, rVarH, 0);
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
            d5VarM.a(new er.p() { // from class: b11.c
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return m.y(pVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final p.a x(f6<? extends p.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 y(p pVar, int i15, p076m2.r rVar, int i16) {
        w(pVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void z(final p.a.UnableToConfirm unableToConfirm, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(1489583459);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(unableToConfirm) : rVarH.G(unableToConfirm) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1489583459, i16, -1, "pl.gov.coi.mobywatel.feature.authconfirmation.presentation.confirmation.AuthConfirmationUnableToConfirmScreen (AuthConfirmationScreen.kt:201)");
            }
            int i17 = i16;
            i50.s.r(unableToConfirm.getScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-1578240944, true, new er.q() { // from class: b11.f
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return m.A(unableToConfirm, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVarH, BaseScaffoldData.f89350g, 196608, 32766);
            rVarH = rVarH;
            boolean z15 = (i17 & 14) == 4 || ((i17 & 8) != 0 && rVarH.G(unableToConfirm));
            Object objE = rVarH.E();
            if (z15 || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.a() { // from class: b11.g
                    @Override // er.a
                    public final Object a() {
                        return m.B(unableToConfirm);
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
            d5VarM.a(new er.p() { // from class: b11.h
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return m.C(unableToConfirm, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
