package v33;

import d1.r3;
import mx.Label;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.n6;
import q40.IconPageBottomContentData;
import x33.SummaryContentData;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f203507a = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static er.q<SummaryContentData, p076m2.r, Integer, oq.i0> f203508b = y2.m.b(1934263486, false, new er.q() { // from class: v33.a
        @Override // er.q
        public final Object w(Object obj, Object obj2, Object obj3) {
            return e.g((SummaryContentData) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static er.q<IconPageBottomContentData, p076m2.r, Integer, oq.i0> f203509c = y2.m.b(-578201190, false, new er.q() { // from class: v33.b
        @Override // er.q
        public final Object w(Object obj, Object obj2, Object obj3) {
            return e.j((IconPageBottomContentData) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 g(final SummaryContentData summaryContentData, p076m2.r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= (i15 & 8) == 0 ? rVar.W(summaryContentData) : rVar.G(summaryContentData) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1934263486, i15, -1, "pl.gov.coi.mobywatel.feature.sanitary.presentation.screens.newreport.summary.ComposableSingletons$SummaryScreenKt.lambda$1934263486.<anonymous> (SummaryScreen.kt:196)");
            }
            x30.c.c(null, 0.0f, y2.m.d(-1629186051, true, new er.p() { // from class: v33.c
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return e.h(summaryContentData, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVar, 54), rVar, MLKEMEngine.KyberPolyBytes, 3);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 h(SummaryContentData summaryContentData, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1629186051, i15, -1, "pl.gov.coi.mobywatel.feature.sanitary.presentation.screens.newreport.summary.ComposableSingletons$SummaryScreenKt.lambda$1934263486.<anonymous>.<anonymous> (SummaryScreen.kt:197)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarH = androidx.compose.foundation.layout.d.h(companion, 0.0f, 1, null);
            Object objE = rVar.E();
            if (objE == p076m2.r.INSTANCE.a()) {
                objE = new er.l() { // from class: v33.d
                    @Override // er.l
                    public final Object b(Object obj) {
                        return e.i((n4.i0) obj);
                    }
                };
                rVar.v(objE);
            }
            f3.m mVarC = n4.v.c(mVarH, true, (er.l) objE);
            w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.g(), rVar, 48);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarC);
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
            b5.j.Companion companion3 = b5.j.INSTANCE;
            int iA = companion3.a();
            Label infoLabel = summaryContentData.getInfoLabel();
            k70.a aVar = k70.a.f108864a;
            int i16 = k70.a.f108865b;
            j70.h.g(null, null, infoLabel, null, null, aVar.a(rVar, i16).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, null, null, 0L, null, b5.j.h(iA), 0L, 0, false, 0, 0, null, aVar.f(rVar, i16).d(), null, null, false, false, null, rVar, 0, 0, 0, 33026011);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i16).getSpacing50()), rVar, 0);
            j70.h.g(null, null, summaryContentData.getBodyLabel(), null, null, 0L, 0L, null, null, null, 0L, null, b5.j.h(companion3.a()), 0L, 0, false, 0, 0, null, aVar.f(rVar, i16).p(), null, null, false, false, null, rVar, 0, 0, 0, 33026043);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i16).getSpacing100()), rVar, 0);
            d40.h.f(null, summaryContentData.getIconData(), false, rVar, d40.b.f39676g << 3, 5);
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
    public static final oq.i0 i(n4.i0 i0Var) {
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 j(IconPageBottomContentData iconPageBottomContentData, p076m2.r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= (i15 & 8) == 0 ? rVar.W(iconPageBottomContentData) : rVar.G(iconPageBottomContentData) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-578201190, i15, -1, "pl.gov.coi.mobywatel.feature.sanitary.presentation.screens.newreport.summary.ComposableSingletons$SummaryScreenKt.lambda$-578201190.<anonymous> (SummaryScreen.kt:223)");
            }
            h30.q.p(iconPageBottomContentData.getPrimaryButtonData(), false, null, rVar, 0, 6);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    public final er.q<IconPageBottomContentData, p076m2.r, Integer, oq.i0> e() {
        return f203509c;
    }

    public final er.q<SummaryContentData, p076m2.r, Integer, oq.i0> f() {
        return f203508b;
    }
}
