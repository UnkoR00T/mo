package sa1;

import d1.r3;
import h30.ButtonData;
import p071kotlin.Metadata;
import q40.IconPageBottomContentData;
import x40.LinkData;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
public final class w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w0 f179797a = new w0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static er.q<LinkData, p076m2.r, Integer, oq.i0> f179798b = y2.m.b(-1331755051, false, new er.q() { // from class: sa1.t0
        @Override // er.q
        public final Object w(Object obj, Object obj2, Object obj3) {
            return w0.h((LinkData) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static er.q<IconPageBottomContentData, p076m2.r, Integer, oq.i0> f179799c = y2.m.b(-927904685, false, new er.q() { // from class: sa1.u0
        @Override // er.q
        public final Object w(Object obj, Object obj2, Object obj3) {
            return w0.i((IconPageBottomContentData) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static er.q<IconPageBottomContentData, p076m2.r, Integer, oq.i0> f179800d = y2.m.b(1905302174, false, new er.q() { // from class: sa1.v0
        @Override // er.q
        public final Object w(Object obj, Object obj2, Object obj3) {
            return w0.g((IconPageBottomContentData) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 g(IconPageBottomContentData iconPageBottomContentData, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVar.W(iconPageBottomContentData) : rVar.G(iconPageBottomContentData) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1905302174, i16, -1, "pl.gov.coi.mobywatel.feature.company.presentation.details.ComposableSingletons$CompanyDetailsScreenKt.lambda$1905302174.<anonymous> (CompanyDetailsScreen.kt:237)");
            }
            h30.q.p(iconPageBottomContentData.getPrimaryButtonData(), false, null, rVar, 0, 6);
            ButtonData secondaryButtonData = iconPageBottomContentData.getSecondaryButtonData();
            if (secondaryButtonData == null) {
                rVar.X(-1430593092);
            } else {
                rVar.X(-1430593091);
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
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 h(LinkData linkData, p076m2.r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= (i15 & 8) == 0 ? rVar.W(linkData) : rVar.G(linkData) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1331755051, i15, -1, "pl.gov.coi.mobywatel.feature.company.presentation.details.ComposableSingletons$CompanyDetailsScreenKt.lambda$-1331755051.<anonymous> (CompanyDetailsScreen.kt:112)");
            }
            x40.h.g(linkData, rVar, (i15 & 14) | LinkData.f216731g);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 i(IconPageBottomContentData iconPageBottomContentData, p076m2.r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= (i15 & 8) == 0 ? rVar.W(iconPageBottomContentData) : rVar.G(iconPageBottomContentData) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-927904685, i15, -1, "pl.gov.coi.mobywatel.feature.company.presentation.details.ComposableSingletons$CompanyDetailsScreenKt.lambda$-927904685.<anonymous> (CompanyDetailsScreen.kt:216)");
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

    public final er.q<LinkData, p076m2.r, Integer, oq.i0> d() {
        return f179798b;
    }

    public final er.q<IconPageBottomContentData, p076m2.r, Integer, oq.i0> e() {
        return f179799c;
    }

    public final er.q<IconPageBottomContentData, p076m2.r, Integer, oq.i0> f() {
        return f179800d;
    }
}
