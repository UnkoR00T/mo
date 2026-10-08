package qj1;

import androidx.compose.ui.graphics.Color;
import mx.Label;
import p071kotlin.Metadata;
import tj1.TrainingPointClusterItem;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f166739a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static er.q<bm.a<TrainingPointClusterItem>, p076m2.r, Integer, oq.i0> f166740b = y2.m.b(-229512791, false, new er.q() { // from class: qj1.a
        @Override // er.q
        public final Object w(Object obj, Object obj2, Object obj3) {
            return c.f((bm.a) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static er.q<TrainingPointClusterItem, p076m2.r, Integer, oq.i0> f166741c = y2.m.b(1445633143, false, new er.q() { // from class: qj1.b
        @Override // er.q
        public final Object w(Object obj, Object obj2, Object obj3) {
            return c.e((TrainingPointClusterItem) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
        }
    });

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a implements er.p<p076m2.r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f166742a = new a();

        a() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(p076m2.r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(p076m2.r rVar, int i15) {
            rVar.X(510197051);
            if (p076m2.t.k()) {
                p076m2.t.o(510197051, i15, -1, "pl.gov.coi.mobywatel.feature.defencetraining.presentation.newregistration.traininglocation.ComposableSingletons$TrainingLocationScreenKt.lambda$1445633143.<anonymous>.<anonymous> (TrainingLocationScreen.kt:313)");
            }
            long jH = Color.INSTANCE.h();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jH;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 e(TrainingPointClusterItem trainingPointClusterItem, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1445633143, i15, -1, "pl.gov.coi.mobywatel.feature.defencetraining.presentation.newregistration.traininglocation.ComposableSingletons$TrainingLocationScreenKt.lambda$1445633143.<anonymous> (TrainingLocationScreen.kt:309)");
        }
        d0.s(new d40.b.C0864b(null, ri1.a.f174345a, d40.i.h.f39711e, a.f166742a, Label.INSTANCE.c(), null, 33, null), rVar, d40.b.C0864b.f39687h);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 f(bm.a aVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-229512791, i15, -1, "pl.gov.coi.mobywatel.feature.defencetraining.presentation.newregistration.traininglocation.ComposableSingletons$TrainingLocationScreenKt.lambda$-229512791.<anonymous> (TrainingLocationScreen.kt:306)");
        }
        d0.u(aVar.getSize(), rVar, 0);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    public final er.q<bm.a<TrainingPointClusterItem>, p076m2.r, Integer, oq.i0> c() {
        return f166740b;
    }

    public final er.q<TrainingPointClusterItem, p076m2.r, Integer, oq.i0> d() {
        return f166741c;
    }
}
