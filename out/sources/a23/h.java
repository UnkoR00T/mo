package a23;

import c23.SafetyGuideNumbersSection;
import d1.a3;
import d1.d3;
import d1.e0;
import d1.r3;
import er.p;
import er.q;
import i50.BaseScaffoldData;
import i50.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import mx.Label;
import n50.DefaultSingleCardData;
import n50.h0;
import oq.i0;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.t;
import pq.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"La23/d;", "viewModel", "Loq/i0;", "d", "(La23/d;Lm2/r;I)V", "La23/d$a;", "screenData", "g", "(La23/d$a;Lm2/r;I)V", "safetyguide_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class h {
    public static final void d(final d dVar, r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(-1588676681);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(dVar) : rVarH.G(dVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(-1588676681, i16, -1, "pl.gov.coi.mobywatel.feature.safetyguide.presentation.numbers.SafetyGuideNumbersScreen (SafetyGuideNumbersScreen.kt:23)");
            }
            g(e(m7.b.c(dVar.getState(), null, null, null, rVarH, 0, 7)), rVarH, 0);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: a23.e
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return h.f(dVar, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final d.Data e(f6<d.Data> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(d dVar, int i15, r rVar, int i16) {
        d(dVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void g(final d.Data data, r rVar, final int i15) {
        int i16;
        r rVar2;
        r rVarH = rVar.h(1848260404);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(data) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(1848260404, i16, -1, "pl.gov.coi.mobywatel.feature.safetyguide.presentation.numbers.SafetyGuideNumbersScreenContent (SafetyGuideNumbersScreen.kt:29)");
            }
            rVar2 = rVarH;
            s.r(data.getBaseScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(880400295, true, new q() { // from class: a23.f
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return h.h(data, (d3) obj, (r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVar2, BaseScaffoldData.f89350g, 196608, 32766);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: a23.g
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return h.i(data, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(d.Data data, d3 d3Var, r rVar, int i15) {
        k70.a aVar;
        int i16;
        r rVar2 = rVar;
        char c15 = 2;
        int i17 = (i15 & 6) == 0 ? i15 | (rVar2.W(d3Var) ? 4 : 2) : i15;
        boolean z15 = false;
        if (rVar2.r((i17 & 19) != 18, i17 & 1)) {
            if (t.k()) {
                t.o(880400295, i17, -1, "pl.gov.coi.mobywatel.feature.safetyguide.presentation.numbers.SafetyGuideNumbersScreenContent.<anonymous> (SafetyGuideNumbersScreen.kt:33)");
            }
            Object obj = null;
            f3.m mVarN = t70.s.n(t70.i.S(a3.l(f3.m.INSTANCE, d3Var), null, rVar2, 0, 1), rVar2, 0);
            w0 w0VarA = e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar2, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar2, 0));
            p076m2.e0 e0VarT = rVar2.t();
            f3.m mVarE = f3.j.e(rVar2, mVarN);
            androidx.compose.ui.node.c.Companion companion = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion.b();
            if (rVar2.l() == null) {
                p076m2.m.d();
            }
            rVar2.K();
            if (rVar2.getInserting()) {
                rVar2.H(aVarB);
            } else {
                rVar2.u();
            }
            r rVarC = n6.c(rVar2);
            n6.i(rVarC, w0VarA, companion.d());
            n6.i(rVarC, e0VarT, companion.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
            n6.g(rVarC, companion.a());
            n6.i(rVarC, mVarE, companion.e());
            d1.i0 i0Var = d1.i0.f39176a;
            rVar2.X(-1682066170);
            for (SafetyGuideNumbersSection safetyGuideNumbersSection : data.b()) {
                Label headerLabel = safetyGuideNumbersSection.getHeaderLabel();
                k70.a aVar2 = k70.a.f108864a;
                int i18 = k70.a.f108865b;
                j70.h.g(null, null, headerLabel, null, null, aVar2.a(rVar2, i18).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVar2, i18).j(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
                rVar2 = rVar;
                Label descriptionLabel = safetyGuideNumbersSection.getDescriptionLabel();
                if (descriptionLabel == null) {
                    rVar2.X(855628894);
                    rVar2.R();
                    aVar = aVar2;
                    i16 = i18;
                } else {
                    rVar2.X(855628895);
                    r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, aVar2.b(rVar2, i18).getSpacing100()), rVar2, 0);
                    aVar = aVar2;
                    i16 = i18;
                    j70.h.g(null, null, descriptionLabel, null, null, aVar2.a(rVar2, i18).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVar2, i18).b(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
                    rVar2 = rVar;
                    rVar2.R();
                }
                r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, aVar.b(rVar2, i16).getSpacing200()), rVar2, 0);
                rVar2.X(-1682047095);
                List<DefaultSingleCardData> listA = safetyGuideNumbersSection.a();
                ArrayList arrayList = new ArrayList(v.y(listA, 10));
                Iterator<T> it = listA.iterator();
                while (it.hasNext()) {
                    h0.v((DefaultSingleCardData) it.next(), null, rVar2, 0, 2);
                    r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, k70.a.f108864a.b(rVar2, k70.a.f108865b).getSpacing100()), rVar2, 0);
                    arrayList.add(i0.f148189a);
                }
                rVar2.R();
                r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, k70.a.f108864a.b(rVar2, k70.a.f108865b).getSpacing300()), rVar2, 0);
                obj = null;
                z15 = false;
                c15 = 2;
            }
            rVar2.R();
            rVar2.x();
            if (t.k()) {
                t.n();
            }
        } else {
            rVar2.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(d.Data data, int i15, r rVar, int i16) {
        g(data, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
