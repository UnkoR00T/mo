package zg2;

import java.util.List;
import n30.CardListData;
import oq.i0;
import p071kotlin.Metadata;
import q40.IconPageBottomContentData;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f235146a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static er.q<List<? extends n50.k>, p076m2.r, Integer, i0> f235147b = y2.m.b(-1578890463, false, new er.q() { // from class: zg2.a
        @Override // er.q
        public final Object w(Object obj, Object obj2, Object obj3) {
            return c.f((List) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static er.q<IconPageBottomContentData, p076m2.r, Integer, i0> f235148c = y2.m.b(1103765574, false, new er.q() { // from class: zg2.b
        @Override // er.q
        public final Object w(Object obj, Object obj2, Object obj3) {
            return c.e((IconPageBottomContentData) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 e(IconPageBottomContentData iconPageBottomContentData, p076m2.r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= (i15 & 8) == 0 ? rVar.W(iconPageBottomContentData) : rVar.G(iconPageBottomContentData) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1103765574, i15, -1, "pl.gov.coi.mobywatel.feature.landregistry.presentation.ordereddocuments.expairedDocument.ComposableSingletons$ExpiredDocumentScreenKt.lambda$1103765574.<anonymous> (ExpiredDocumentScreen.kt:51)");
            }
            h30.q.p(iconPageBottomContentData.getPrimaryButtonData(), false, null, rVar, 0, 6);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(List list, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1578890463, i15, -1, "pl.gov.coi.mobywatel.feature.landregistry.presentation.ordereddocuments.expairedDocument.ComposableSingletons$ExpiredDocumentScreenKt.lambda$-1578890463.<anonymous> (ExpiredDocumentScreen.kt:44)");
        }
        m30.i.d(new CardListData(list, null, false, null, null, 30, null), null, null, rVar, 0, 6);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    public final er.q<List<? extends n50.k>, p076m2.r, Integer, i0> c() {
        return f235147b;
    }

    public final er.q<IconPageBottomContentData, p076m2.r, Integer, i0> d() {
        return f235148c;
    }
}
