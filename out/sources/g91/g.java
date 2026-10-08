package g91;

import d1.a3;
import d1.d3;
import d1.e0;
import d1.h0;
import d1.r3;
import er.p;
import er.q;
import i50.BaseScaffoldData;
import i50.s;
import mx.Label;
import oq.i0;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.t;
import p088nul.q0;
import t40.InfoRowListData;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n²\u0006\f\u0010\u0006\u001a\u00020\t8\nX\u008a\u0084\u0002"}, d2 = {"Lg91/c;", "viewModel", "Loq/i0;", "g", "(Lg91/c;Lm2/r;I)V", "Lg91/c$a$b;", "screenData", "d", "(Lg91/c$a$b;Lm2/r;I)V", "Lg91/c$a;", "childpassportapplication_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class g {
    public static final void d(final c.a.Presenting presenting, r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(1058976265);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(presenting) : rVarH.G(presenting) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(1058976265, i16, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.paynow.ChildPassportApplicationPayNowContent (ChildPassportApplicationPayNowScreen.kt:36)");
            }
            s.r(presenting.getBaseScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-1272579443, true, new q() { // from class: g91.e
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return g.e(presenting, (d3) obj, (r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVarH, BaseScaffoldData.f89350g, 196608, 32766);
            rVarH = rVarH;
            q0.g(false, presenting.g(), rVarH, 0, 1);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: g91.f
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return g.f(presenting, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 e(c.a.Presenting presenting, d3 d3Var, r rVar, int i15) {
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
            if (t.k()) {
                t.o(-1272579443, i16, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.paynow.ChildPassportApplicationPayNowContent.<anonymous>.<anonymous> (ChildPassportApplicationPayNowScreen.kt:38)");
            }
            f3.m.Companion companion2 = f3.m.INSTANCE;
            f3.m mVarL = a3.l(companion2, d3Var);
            k70.a aVar2 = k70.a.f108864a;
            int i18 = k70.a.f108865b;
            f3.m mVarP = a3.p(a3.r(mVarL, 0.0f, 0.0f, 0.0f, aVar2.b(rVar, i18).getSpacing200(), 7, null), aVar2.b(rVar, i18).getSpacing200(), 0.0f, 2, null);
            d1.i iVar = d1.i.f39152a;
            d1.i.n nVarK = iVar.k();
            f3.c.Companion companion3 = f3.c.INSTANCE;
            w0 w0VarA = e0.a(nVarK, companion3.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarP);
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
            r rVarC = n6.c(rVar);
            n6.i(rVarC, w0VarA, companion4.d());
            n6.i(rVarC, e0VarT, companion4.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion4.c());
            n6.g(rVarC, companion4.a());
            n6.i(rVarC, mVarE, companion4.e());
            f3.m mVarR = a3.r(t70.i.S(h0.b(d1.i0.f39176a, companion2, 1.0f, false, 2, null), null, rVar, 0, 1), 0.0f, aVar2.b(rVar, i18).getSpacing100(), 0.0f, aVar2.b(rVar, i18).getSpacing200(), 5, null);
            w0 w0VarA2 = e0.a(iVar.k(), companion3.k(), rVar, 0);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT2 = rVar.t();
            f3.m mVarE2 = f3.j.e(rVar, mVarR);
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
            r rVarC2 = n6.c(rVar);
            n6.i(rVarC2, w0VarA2, companion4.d());
            n6.i(rVarC2, e0VarT2, companion4.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion4.c());
            n6.g(rVarC2, companion4.a());
            n6.i(rVarC2, mVarE2, companion4.e());
            j70.h.g(null, null, presenting.getHeaderLabel(), null, null, aVar2.a(rVar, i18).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVar, i18).i(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
            r3.a(androidx.compose.foundation.layout.d.i(companion2, aVar2.b(rVar, i18).getSpacing300()), rVar, 0);
            j70.h.g(null, null, presenting.getDescriptionLabel(), null, null, aVar2.a(rVar, i18).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVar, i18).b(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
            r3.a(androidx.compose.foundation.layout.d.i(companion2, aVar2.b(rVar, i18).getSpacing300()), rVar, 0);
            j70.h.g(null, null, presenting.getSubHeader1(), null, null, aVar2.a(rVar, i18).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVar, i18).a(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
            r rVar2 = rVar;
            Label subDescription1 = presenting.getSubDescription1();
            if (subDescription1 == null) {
                rVar2.X(-1512999232);
                rVar2.R();
                companion = companion2;
                aVar = aVar2;
                i17 = i18;
            } else {
                rVar2.X(-1512999231);
                r3.a(androidx.compose.foundation.layout.d.i(companion2, aVar2.b(rVar2, i18).getSpacing100()), rVar2, 0);
                companion = companion2;
                j70.h.g(null, null, subDescription1, null, null, aVar2.a(rVar2, i18).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVar2, i18).b(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
                rVar2 = rVar;
                i0 i0Var = i0.f148189a;
                rVar2.R();
                aVar = aVar2;
                i17 = i18;
            }
            f3.m.Companion companion5 = companion;
            boolean z15 = false;
            r3.a(androidx.compose.foundation.layout.d.i(companion5, aVar.b(rVar2, i17).getSpacing300()), rVar2, 0);
            Label subHeader2 = presenting.getSubHeader2();
            if (subHeader2 == null) {
                rVar2.X(-1512591334);
            } else {
                rVar2.X(-1512591333);
                k70.a aVar3 = aVar;
                int i19 = i17;
                j70.h.g(null, null, subHeader2, null, null, aVar.a(rVar2, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar2, i17).a(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
                r3.a(androidx.compose.foundation.layout.d.i(companion5, aVar3.b(rVar, i19).getSpacing100()), rVar, 0);
                j70.h.g(null, null, presenting.getSubDescription2(), null, null, aVar3.a(rVar, i19).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar3.f(rVar, i19).b(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
                rVar2 = rVar;
                aVar = aVar3;
                i17 = i19;
                companion5 = companion5;
                z15 = false;
                r3.a(androidx.compose.foundation.layout.d.i(companion5, aVar.b(rVar2, i17).getSpacing300()), rVar2, 0);
                i0 i0Var2 = i0.f148189a;
            }
            rVar2.R();
            k70.a aVar4 = aVar;
            int i25 = i17;
            f3.m.Companion companion6 = companion5;
            j70.h.g(null, null, presenting.getInfoRowHeader(), null, null, aVar.a(rVar2, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar2, i17).a(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
            r3.a(androidx.compose.foundation.layout.d.i(companion6, aVar4.b(rVar, i25).getSpacing200()), rVar, 0);
            s40.g.c(presenting.getInfoRowListData(), 0.0f, rVar, InfoRowListData.f187643b, 2);
            rVar.x();
            r3.a(androidx.compose.foundation.layout.d.i(companion6, aVar4.b(rVar, i25).getSpacing200()), rVar, 0);
            h30.q.p(presenting.getButtonData(), false, null, rVar, 0, 6);
            rVar.x();
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(c.a.Presenting presenting, int i15, r rVar, int i16) {
        d(presenting, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void g(final c cVar, r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(1362994619);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(cVar) : rVarH.G(cVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(1362994619, i16, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.paynow.ChildPassportApplicationPayNowScreen (ChildPassportApplicationPayNowScreen.kt:24)");
            }
            c.a aVarH = h(m7.b.c(cVar.getState(), null, null, null, rVarH, 0, 7));
            if (aVarH instanceof c.a.Error) {
                rVarH.X(-127187517);
                ((c.a.Error) aVarH).getErrorVMSAdapter().b(rVarH, 0);
                rVarH.R();
            } else {
                if (!(aVarH instanceof c.a.Presenting)) {
                    rVarH.X(-127190917);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(-127184845);
                d((c.a.Presenting) aVarH, rVarH, 0);
                rVarH.R();
            }
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: g91.d
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return g.i(cVar, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final c.a h(f6<? extends c.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(c cVar, int i15, r rVar, int i16) {
        g(cVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
