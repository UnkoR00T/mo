package i50;

import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v f89493a = new v();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static er.p<p076m2.r, Integer, i0> f89494b = y2.m.b(-1004153695, false, new er.p() { // from class: i50.t
        @Override // er.p
        public final Object B(Object obj, Object obj2) {
            return v.f((p076m2.r) obj, ((Integer) obj2).intValue());
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static er.p<p076m2.r, Integer, i0> f89495c = y2.m.b(290648064, false, new er.p() { // from class: i50.u
        @Override // er.p
        public final Object B(Object obj, Object obj2) {
            return v.e((p076m2.r) obj, ((Integer) obj2).intValue());
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 e(p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(290648064, i15, -1, "pl.gov.coi.common.ui.ds.scaffold.ComposableSingletons$BaseScaffoldKt.lambda$290648064.<anonymous> (BaseScaffold.kt:73)");
            }
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1004153695, i15, -1, "pl.gov.coi.common.ui.ds.scaffold.ComposableSingletons$BaseScaffoldKt.lambda$-1004153695.<anonymous> (BaseScaffold.kt:72)");
            }
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    public final er.p<p076m2.r, Integer, i0> c() {
        return f89494b;
    }

    public final er.p<p076m2.r, Integer, i0> d() {
        return f89495c;
    }
}
