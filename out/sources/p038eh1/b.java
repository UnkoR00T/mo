package p038eh1;

import ci1.g;
import ci1.j;
import er.q;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import p076m2.t;
import y2.m;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f51354a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static q<j, r, Integer, i0> f51355b = m.b(32435151, false, new q() { // from class: eh1.a
        @Override // er.q
        public final Object w(Object obj, Object obj2, Object obj3) {
            return b.c((j) obj, (r) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 c(j jVar, r rVar, int i15) {
        if (t.k()) {
            t.o(32435151, i15, -1, "pl.gov.coi.mobywatel.feature.dashboard.presentation.ComposableSingletons$DashboardNavContentKt.lambda$32435151.<anonymous> (DashboardNavContent.kt:172)");
        }
        g.d(jVar, rVar, i15 & 14);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    public final q<j, r, Integer, i0> b() {
        return f51355b;
    }
}
