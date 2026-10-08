package gq1;

import h30.ButtonData;
import oq.i0;
import p071kotlin.Metadata;
import t40.InfoRowListData;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f76167a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static er.q<InfoRowListData, p076m2.r, Integer, i0> f76168b = y2.m.b(2101165455, false, new er.q() { // from class: gq1.a
        @Override // er.q
        public final Object w(Object obj, Object obj2, Object obj3) {
            return c.f((InfoRowListData) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static er.q<ButtonData, p076m2.r, Integer, i0> f76169c = y2.m.b(1636575054, false, new er.q() { // from class: gq1.b
        @Override // er.q
        public final Object w(Object obj, Object obj2, Object obj3) {
            return c.e((ButtonData) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 e(ButtonData buttonData, p076m2.r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= rVar.W(buttonData) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1636575054, i15, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.ds.illustrationpage.ComposableSingletons$DeveloperIllustrationPageScreenKt.lambda$1636575054.<anonymous> (DeveloperIllustrationPageScreen.kt:45)");
            }
            h30.q.p(buttonData, false, null, rVar, i15 & 14, 6);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(InfoRowListData infoRowListData, p076m2.r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= (i15 & 8) == 0 ? rVar.W(infoRowListData) : rVar.G(infoRowListData) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(2101165455, i15, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.ds.illustrationpage.ComposableSingletons$DeveloperIllustrationPageScreenKt.lambda$2101165455.<anonymous> (DeveloperIllustrationPageScreen.kt:40)");
            }
            s40.g.c(infoRowListData, 0.0f, rVar, (i15 & 14) | InfoRowListData.f187643b, 2);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    public final er.q<ButtonData, p076m2.r, Integer, i0> c() {
        return f76169c;
    }

    public final er.q<InfoRowListData, p076m2.r, Integer, i0> d() {
        return f76168b;
    }
}
