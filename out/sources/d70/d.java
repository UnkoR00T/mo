package d70;

import d1.a3;
import d1.e0;
import d1.i;
import d1.r3;
import d1.x;
import er.l;
import er.p;
import f3.j;
import f3.m;
import h30.ButtonData;
import h30.q;
import j70.h;
import l3.d0;
import l3.g;
import l3.g0;
import l3.v;
import l3.y;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.t;
import u50.v0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a=\u0010\n\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Ld70/e;", "state", "Lkotlin/Function0;", "Loq/i0;", "onConfirmBottomDialogClick", "Ld60/c;", "textInputFocusHost", "Ll3/d0;", "bottomSheetFocusRequester", "lastElementFocusRequester", "d", "(Ld70/e;Ler/a;Ld60/c;Ll3/d0;Ll3/d0;Lm2/r;I)V", "ui_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class d {
    public static final void d(final QrScannerBottomSheetData qrScannerBottomSheetData, final er.a<i0> aVar, final d60.c cVar, final d0 d0Var, d0 d0Var2, r rVar, final int i15) {
        int i16;
        final d0 d0Var3 = d0Var2;
        r rVarH = rVar.h(-937272679);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(qrScannerBottomSheetData) : rVarH.G(qrScannerBottomSheetData) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(aVar) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= rVarH.W(cVar) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i16 |= rVarH.W(d0Var) ? 2048 : 1024;
        }
        if ((i15 & 24576) == 0) {
            i16 |= rVarH.W(d0Var3) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if (rVarH.r((i16 & 9363) != 9362, i16 & 1)) {
            if (t.k()) {
                t.o(-937272679, i16, -1, "pl.gov.coi.common.ui.scanner.bottomsheet.QrScannerBottomSheetContent (QrScannerBottomSheetContent.kt:42)");
            }
            m.Companion companion = m.INSTANCE;
            k70.a aVar2 = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            m mVarR = a3.r(companion, 0.0f, aVar2.b(rVarH, i17).getSpacing100(), 0.0f, aVar2.b(rVarH, i17).getSpacing200(), 5, null);
            i.n nVarK = i.f39152a.k();
            f3.c.Companion companion2 = f3.c.INSTANCE;
            w0 w0VarA = e0.a(nVarK, companion2.k(), rVarH, 6);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            m mVarE = j.e(rVarH, mVarR);
            androidx.compose.ui.node.c.Companion companion3 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion3.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB);
            } else {
                rVarH.u();
            }
            r rVarC = n6.c(rVarH);
            n6.i(rVarC, w0VarA, companion3.d());
            n6.i(rVarC, e0VarT, companion3.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion3.c());
            n6.g(rVarC, companion3.a());
            n6.i(rVarC, mVarE, companion3.e());
            d1.i0 i0Var = d1.i0.f39176a;
            h.g(androidx.compose.foundation.layout.d.h(companion, 0.0f, 1, null), null, qrScannerBottomSheetData.getBottomDialogLabel(), qrScannerBottomSheetData.getBottomDialogLabel(), null, aVar2.a(rVarH, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, b5.j.h(b5.j.INSTANCE.a()), 0L, 0, false, 0, 0, null, aVar2.f(rVarH, i17).d(), null, null, false, false, null, rVarH, 6, 0, MLKEMEngine.KyberPolyBytes, 28831698);
            rVarH = rVarH;
            int i18 = i16 & 7168;
            boolean z15 = i18 == 2048;
            Object objE = rVarH.E();
            if (z15 || objE == r.INSTANCE.a()) {
                objE = new l() { // from class: d70.a
                    @Override // er.l
                    public final Object b(Object obj) {
                        return d.e(d0Var, (v) obj);
                    }
                };
                rVarH.v(objE);
            }
            m mVarA = y.a(companion, (l) objE);
            g.Companion companion4 = g.INSTANCE;
            m mVarF = t70.i.F(mVarA, companion4.f(), rVarH, 0);
            w0 w0VarI = d1.r.i(companion2.o(), false);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT2 = rVarH.t();
            m mVarE2 = j.e(rVarH, mVarF);
            er.a<androidx.compose.ui.node.c> aVarB2 = companion3.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB2);
            } else {
                rVarH.u();
            }
            r rVarC2 = n6.c(rVarH);
            n6.i(rVarC2, w0VarI, companion3.d());
            n6.i(rVarC2, e0VarT2, companion3.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion3.c());
            n6.g(rVarC2, companion3.a());
            n6.i(rVarC2, mVarE2, companion3.e());
            x xVar = x.f39368a;
            v0.g(qrScannerBottomSheetData.getTextInputData(), cVar, rVarH, ((i16 >> 3) & 112) | v50.c.f203957t, 0);
            rVarH.x();
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar2.b(rVarH, i17).getSpacing400()), rVarH, 0);
            d0Var3 = d0Var2;
            m mVarA2 = g0.a(companion, d0Var3);
            boolean z16 = i18 == 2048;
            Object objE2 = rVarH.E();
            if (z16 || objE2 == r.INSTANCE.a()) {
                objE2 = new l() { // from class: d70.b
                    @Override // er.l
                    public final Object b(Object obj) {
                        return d.f(d0Var, (v) obj);
                    }
                };
                rVarH.v(objE2);
            }
            m mVarF2 = t70.i.F(y.a(mVarA2, (l) objE2), companion4.h(), rVarH, 0);
            w0 w0VarI2 = d1.r.i(companion2.o(), false);
            int iHashCode3 = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT3 = rVarH.t();
            m mVarE3 = j.e(rVarH, mVarF2);
            er.a<androidx.compose.ui.node.c> aVarB3 = companion3.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB3);
            } else {
                rVarH.u();
            }
            r rVarC3 = n6.c(rVarH);
            n6.i(rVarC3, w0VarI2, companion3.d());
            n6.i(rVarC3, e0VarT3, companion3.f());
            n6.i(rVarC3, Integer.valueOf(iHashCode3), companion3.c());
            n6.g(rVarC3, companion3.a());
            n6.i(rVarC3, mVarE3, companion3.e());
            q.p(new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(qrScannerBottomSheetData.getBottomDialogButton(), null, 2, null), k30.d.a.f107773a, (!(qrScannerBottomSheetData.getTextInputData().getValidationState() instanceof hz.b.Invalid) || qrScannerBottomSheetData.getBottomDialogButtonAlwaysEnabled()) ? k30.b.c.f107768a : k30.b.C2562b.f107767a, aVar, 3, null), false, null, rVarH, 0, 6);
            rVarH.x();
            rVarH.x();
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: d70.c
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return d.g(qrScannerBottomSheetData, aVar, cVar, d0Var, d0Var3, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 e(d0 d0Var, v vVar) {
        vVar.f(d0Var);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(d0 d0Var, v vVar) {
        vVar.m(d0Var);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 g(QrScannerBottomSheetData qrScannerBottomSheetData, er.a aVar, d60.c cVar, d0 d0Var, d0 d0Var2, int i15, r rVar, int i16) {
        d(qrScannerBottomSheetData, aVar, cVar, d0Var, d0Var2, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
