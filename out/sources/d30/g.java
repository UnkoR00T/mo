package d30;

import d40.h;
import d40.i;
import d40.j;
import er.q;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import p076m2.t;
import y2.m;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f39539a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static q f39540b = m.b(-377680070, false, new q() { // from class: d30.e
        @Override // er.q
        public final Object w(Object obj, Object obj2, Object obj3) {
            return g.d(obj, (r) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static q<Object, r, Integer, i0> f39541c = m.b(-90140324, false, new q() { // from class: d30.f
        @Override // er.q
        public final Object w(Object obj, Object obj2, Object obj3) {
            return g.e(obj, (r) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 d(Object obj, r rVar, int i15) {
        if (rVar.r((i15 & 17) != 16, i15 & 1)) {
            if (t.k()) {
                t.o(-377680070, i15, -1, "pl.gov.coi.common.ui.ds.badge.ComposableSingletons$BadgeKt.lambda$-377680070.<anonymous> (Badge.kt:34)");
            }
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 e(Object obj, r rVar, int i15) {
        if (t.k()) {
            t.o(-90140324, i15, -1, "pl.gov.coi.common.ui.ds.badge.ComposableSingletons$BadgeKt.lambda$-90140324.<anonymous> (Badge.kt:86)");
        }
        h.f(null, new d40.b.C0864b("badge-preview-content", jz.a.f106756d4, i.f.f39709e, null, mx.b.b("badge-preview-content", ""), j.ENABLED, 8, null), false, rVar, 0, 5);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    public final q c() {
        return f39540b;
    }
}
