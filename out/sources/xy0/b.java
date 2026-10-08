package xy0;

import p071kotlin.Metadata;
import zy0.PointPinItem;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f222106a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static er.q<bm.a<PointPinItem>, p076m2.r, Integer, oq.i0> f222107b = y2.m.b(-1746545153, false, new er.q() { // from class: xy0.a
        @Override // er.q
        public final Object w(Object obj, Object obj2, Object obj3) {
            return b.c((bm.a) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 c(bm.a aVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1746545153, i15, -1, "pl.gov.coi.mobywatel.feature.airquality.presentation.screens.map.ComposableSingletons$MapScreenKt.lambda$-1746545153.<anonymous> (MapScreen.kt:205)");
        }
        v.s(new zy0.d(pq.v.f1(aVar.a())), rVar, 0);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    public final er.q<bm.a<PointPinItem>, p076m2.r, Integer, oq.i0> b() {
        return f222107b;
    }
}
