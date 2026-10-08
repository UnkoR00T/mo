package y42;

import d1.e0;
import d1.r3;
import h30.ButtonData;
import mx.Label;
import oq.i0;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.n6;
import q4.TextStyle;
import q40.IconPageBottomContentData;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f224033a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static er.q<g.a.Result.ContentData, p076m2.r, Integer, i0> f224034b = y2.m.b(-2142030210, false, new er.q() { // from class: y42.a
        @Override // er.q
        public final Object w(Object obj, Object obj2, Object obj3) {
            return c.f((g.a.Result.ContentData) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static er.q<IconPageBottomContentData, p076m2.r, Integer, i0> f224035c = y2.m.b(1254326802, false, new er.q() { // from class: y42.b
        @Override // er.q
        public final Object w(Object obj, Object obj2, Object obj3) {
            return c.e((IconPageBottomContentData) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 e(IconPageBottomContentData iconPageBottomContentData, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVar.W(iconPageBottomContentData) : rVar.G(iconPageBottomContentData) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1254326802, i16, -1, "pl.gov.coi.mobywatel.feature.epayments.presentation.result.ComposableSingletons$PaymentResultScreenKt.lambda$1254326802.<anonymous> (PaymentResultScreen.kt:110)");
            }
            h30.q.p(iconPageBottomContentData.getPrimaryButtonData(), false, null, rVar, 0, 6);
            ButtonData secondaryButtonData = iconPageBottomContentData.getSecondaryButtonData();
            if (secondaryButtonData == null) {
                rVar.X(1434420544);
            } else {
                rVar.X(1434420545);
                r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing150()), rVar, 0);
                h30.q.p(secondaryButtonData, false, null, rVar, 0, 6);
            }
            rVar.R();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(g.a.Result.ContentData contentData, p076m2.r rVar, int i15) {
        g.a.Result.ContentData contentData2;
        int i16;
        if ((i15 & 6) == 0) {
            contentData2 = contentData;
            i16 = i15 | (rVar.W(contentData2) ? 4 : 2);
        } else {
            contentData2 = contentData;
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-2142030210, i16, -1, "pl.gov.coi.mobywatel.feature.epayments.presentation.result.ComposableSingletons$PaymentResultScreenKt.lambda$-2142030210.<anonymous> (PaymentResultScreen.kt:81)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            f3.m mVarD = w0.i.d(companion, aVar.a(rVar, i17).getBase().a(), null, 2, null);
            w0 w0VarA = e0.a(d1.i.f39152a.e(), f3.c.INSTANCE.g(), rVar, 54);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarD);
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
            Label paymentTitle = contentData2.getPaymentTitle();
            TextStyle textStyleB = aVar.f(rVar, i17).b();
            long jB = aVar.a(rVar, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b();
            b5.j.Companion companion3 = b5.j.INSTANCE;
            j70.h.g(null, null, paymentTitle, null, null, jB, 0L, null, null, null, 0L, null, b5.j.h(companion3.a()), 0L, 0, false, 0, 0, null, textStyleB, null, null, false, false, null, rVar, 0, 0, 0, 33026011);
            j70.h.g(null, null, contentData.getPaymentTitleDescription(), null, null, 0L, 0L, null, null, null, 0L, null, b5.j.h(companion3.a()), 0L, 0, false, 0, 0, null, aVar.f(rVar, i17).p(), null, null, false, false, null, rVar, 0, 0, 0, 33026043);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing400()), rVar, 0);
            j70.h.g(null, null, contentData.getPaymentAmountTitle(), null, null, aVar.a(rVar, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i17).b(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
            j70.h.g(null, null, contentData.getPaymentAmountDescription(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i17).p(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
            rVar.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    public final er.q<g.a.Result.ContentData, p076m2.r, Integer, i0> c() {
        return f224034b;
    }

    public final er.q<IconPageBottomContentData, p076m2.r, Integer, i0> d() {
        return f224035c;
    }
}
