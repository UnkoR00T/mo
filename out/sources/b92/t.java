package b92;

import d1.a3;
import d1.d3;
import d1.e0;
import g30.ModalBottomSheetData;
import i50.BaseScaffoldData;
import java.util.Iterator;
import mx.Label;
import oq.i0;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p088nul.q0;
import u4.FontWeight;
import z30.FileBottomSheetItemData;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a'\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b²\u0006\f\u0010\b\u001a\u00020\u00078\nX\u008a\u0084\u0002"}, d2 = {"Lb92/g;", "viewModel", "Lkotlin/Function0;", "Loq/i0;", "innerNavContent", "h", "(Lb92/g;Ler/p;Lm2/r;II)V", "Lb92/g$a;", "reportViolationWizardData", "k", "(Lb92/g$a;Ler/p;Lm2/r;II)V", "gios_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class t {
    public static final void h(final g gVar, final er.p<? super p076m2.r, ? super Integer, i0> pVar, p076m2.r rVar, final int i15, final int i16) {
        int i17;
        p076m2.r rVarH = rVar.h(-1204081336);
        if ((i15 & 6) == 0) {
            i17 = ((i15 & 8) == 0 ? rVarH.W(gVar) : rVarH.G(gVar) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        int i18 = i16 & 2;
        if (i18 != 0) {
            i17 |= 48;
        } else if ((i15 & 48) == 0) {
            i17 |= rVarH.G(pVar) ? 32 : 16;
        }
        if (rVarH.r((i17 & 19) != 18, i17 & 1)) {
            if (i18 != 0) {
                pVar = c.f17608a.c();
            }
            if (p076m2.t.k()) {
                p076m2.t.o(-1204081336, i17, -1, "pl.gov.coi.mobywatel.feature.gios.presentation.reportviolationwizard.ReportViolationWizardScreen (ReportViolationWizardScreen.kt:31)");
            }
            k(i(m7.b.c(gVar.getState(), null, null, null, rVarH, 0, 7)), pVar, rVarH, (i17 & 112) | BaseScaffoldData.f89350g | ModalBottomSheetData.f70192e, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: b92.m
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return t.j(gVar, pVar, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final g.Data i(f6<g.Data> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j(g gVar, er.p pVar, int i15, int i16, p076m2.r rVar, int i17) {
        h(gVar, pVar, rVar, g4.a(i15 | 1), i16);
        return i0.f148189a;
    }

    public static final void k(final g.Data data, final er.p<? super p076m2.r, ? super Integer, i0> pVar, p076m2.r rVar, final int i15, final int i16) {
        int i17;
        p076m2.r rVarH = rVar.h(1432820741);
        if ((i15 & 6) == 0) {
            i17 = ((i15 & 8) == 0 ? rVarH.W(data) : rVarH.G(data) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        int i18 = i16 & 2;
        if (i18 != 0) {
            i17 |= 48;
        } else if ((i15 & 48) == 0) {
            i17 |= rVarH.G(pVar) ? 32 : 16;
        }
        if (rVarH.r((i17 & 19) != 18, i17 & 1)) {
            if (i18 != 0) {
                pVar = c.f17608a.d();
            }
            if (p076m2.t.k()) {
                p076m2.t.o(1432820741, i17, -1, "pl.gov.coi.mobywatel.feature.gios.presentation.reportviolationwizard.ReportViolationWizardScreenContent (ReportViolationWizardScreen.kt:44)");
            }
            g30.t.f(data.getBottomSheetData(), 0.0f, false, null, null, y2.m.d(-1648064866, true, new er.p() { // from class: b92.n
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return t.l(data, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), y2.m.d(-484483681, true, new er.p() { // from class: b92.o
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return t.n(data, pVar, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), rVarH, ModalBottomSheetData.f70192e | 1769472, 30);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: b92.p
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return t.q(data, pVar, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v3 */
    public static final i0 l(final g.Data data, p076m2.r rVar, int i15) {
        p076m2.r rVar2 = rVar;
        int i16 = 1;
        ?? r15 = 0;
        if (rVar2.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1648064866, i15, -1, "pl.gov.coi.mobywatel.feature.gios.presentation.reportviolationwizard.ReportViolationWizardScreenContent.<anonymous> (ReportViolationWizardScreen.kt:48)");
            }
            c92.b bottomSheetContentData = data.getBottomSheetContentData();
            if (bottomSheetContentData instanceof c92.b.Photo) {
                rVar2.X(1052599883);
                f3.m.Companion companion = f3.m.INSTANCE;
                w0 w0VarA = e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar2, 0);
                int iHashCode = Long.hashCode(p076m2.m.b(rVar2, 0));
                p076m2.e0 e0VarT = rVar2.t();
                f3.m mVarE = f3.j.e(rVar2, companion);
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
                rVar2.X(1448785634);
                Iterator it = ((c92.b.Photo) data.getBottomSheetContentData()).a().iterator();
                while (it.hasNext()) {
                    z30.e.d((FileBottomSheetItemData) it.next(), rVar2, FileBottomSheetItemData.f232760e);
                }
                rVar2.R();
                rVar2.x();
                rVar2.R();
            } else if (bottomSheetContentData instanceof c92.b.Voivodeship) {
                rVar2.X(1052608224);
                Object obj = null;
                f3.m mVarS = t70.i.S(f3.m.INSTANCE, null, rVar2, 6, 1);
                w0 w0VarA2 = e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar2, 0);
                int iHashCode2 = Long.hashCode(p076m2.m.b(rVar2, 0));
                p076m2.e0 e0VarT2 = rVar2.t();
                f3.m mVarE2 = f3.j.e(rVar2, mVarS);
                androidx.compose.ui.node.c.Companion companion3 = androidx.compose.ui.node.c.INSTANCE;
                er.a<androidx.compose.ui.node.c> aVarB2 = companion3.b();
                if (rVar2.l() == null) {
                    p076m2.m.d();
                }
                rVar2.K();
                if (rVar2.getInserting()) {
                    rVar2.H(aVarB2);
                } else {
                    rVar2.u();
                }
                p076m2.r rVarC2 = n6.c(rVar2);
                n6.i(rVarC2, w0VarA2, companion3.d());
                n6.i(rVarC2, e0VarT2, companion3.f());
                n6.i(rVarC2, Integer.valueOf(iHashCode2), companion3.c());
                n6.g(rVarC2, companion3.a());
                n6.i(rVarC2, mVarE2, companion3.e());
                d1.i0 i0Var2 = d1.i0.f39176a;
                rVar2.X(250728247);
                for (final Label label : ((c92.b.Voivodeship) data.getBottomSheetContentData()).a()) {
                    f3.m mVarH = androidx.compose.foundation.layout.d.h(f3.m.INSTANCE, 0.0f, i16, obj);
                    k70.a aVar = k70.a.f108864a;
                    int i17 = k70.a.f108865b;
                    f3.m mVarN = a3.n(mVarH, aVar.b(rVar2, i17).getSpacing200());
                    t70.x xVar = new t70.x();
                    boolean zG = rVar2.G(data) | rVar2.W(label);
                    Object objE = rVar2.E();
                    if (zG || objE == p076m2.r.INSTANCE.a()) {
                        objE = new er.a() { // from class: b92.r
                            @Override // er.a
                            public final Object a() {
                                return t.m(data, label);
                            }
                        };
                        rVar2.v(objE);
                    }
                    f3.m mVarL = androidx.compose.foundation.b.l(mVarN, xVar, null, false, null, null, (er.a) objE, 28, null);
                    w0 w0VarI = d1.r.i(f3.c.INSTANCE.o(), r15);
                    int iHashCode3 = Long.hashCode(p076m2.m.b(rVar2, r15));
                    p076m2.e0 e0VarT3 = rVar2.t();
                    f3.m mVarE3 = f3.j.e(rVar2, mVarL);
                    androidx.compose.ui.node.c.Companion companion4 = androidx.compose.ui.node.c.INSTANCE;
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
                    n6.i(rVarC3, w0VarI, companion4.d());
                    n6.i(rVarC3, e0VarT3, companion4.f());
                    n6.i(rVarC3, Integer.valueOf(iHashCode3), companion4.c());
                    n6.g(rVarC3, companion4.a());
                    n6.i(rVarC3, mVarE3, companion4.e());
                    d1.x xVar2 = d1.x.f39368a;
                    j70.h.g(null, null, label, null, null, aVar.a(rVar2, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, FontWeight.INSTANCE.d(), null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar2, i17).d(), null, null, false, false, null, rVar, 100663296, 0, 0, 33029851);
                    rVar2 = rVar;
                    rVar2.x();
                    obj = obj;
                    i16 = i16;
                    r15 = r15 == true ? 1 : 0;
                }
                rVar2.R();
                rVar2.x();
                rVar2.R();
            } else {
                if (bottomSheetContentData != null) {
                    rVar2.X(1052597743);
                    rVar2.R();
                    throw new oq.p();
                }
                rVar2.X(-1727787262);
                rVar2.R();
            }
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(g.Data data, Label label) {
        ((c92.b.Voivodeship) data.getBottomSheetContentData()).b().b(label);
        data.d().a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n(final g.Data data, final er.p pVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-484483681, i15, -1, "pl.gov.coi.mobywatel.feature.gios.presentation.reportviolationwizard.ReportViolationWizardScreenContent.<anonymous> (ReportViolationWizardScreen.kt:92)");
            }
            i50.s.r(data.getScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(1864573516, true, new er.q() { // from class: b92.q
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return t.o(data, pVar, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVar, 54), rVar, BaseScaffoldData.f89350g, 196608, 32766);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o(final g.Data data, er.p pVar, d3 d3Var, p076m2.r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= rVar.W(d3Var) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1864573516, i15, -1, "pl.gov.coi.mobywatel.feature.gios.presentation.reportviolationwizard.ReportViolationWizardScreenContent.<anonymous>.<anonymous> (ReportViolationWizardScreen.kt:96)");
            }
            f3.m mVarL = a3.l(f3.m.INSTANCE, d3Var);
            w0 w0VarI = d1.r.i(f3.c.INSTANCE.o(), false);
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
            n6.i(rVarC, w0VarI, companion.d());
            n6.i(rVarC, e0VarT, companion.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
            n6.g(rVarC, companion.a());
            n6.i(rVarC, mVarE, companion.e());
            d1.x xVar = d1.x.f39368a;
            pVar.B(rVar, 0);
            rVar.x();
            boolean zG = rVar.G(data);
            Object objE = rVar.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.a() { // from class: b92.s
                    @Override // er.a
                    public final Object a() {
                        return t.p(data);
                    }
                };
                rVar.v(objE);
            }
            q0.g(false, (er.a) objE, rVar, 0, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p(g.Data data) {
        if (data.getBottomSheetData().getSheetState().getValue() != g30.v.HIDDEN) {
            data.d().a();
        } else {
            data.a().a();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(g.Data data, er.p pVar, int i15, int i16, p076m2.r rVar, int i17) {
        k(data, pVar, rVar, g4.a(i15 | 1), i16);
        return i0.f148189a;
    }
}
