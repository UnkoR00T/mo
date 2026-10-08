package p015ae4;

import be4.h;
import be4.n;
import ee4.l;
import ee4.s;
import er.q;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import p076m2.t;
import y2.m;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f6045a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static q<s, r, Integer, i0> f6046b = m.b(-509589443, false, new q() { // from class: ae4.a
        @Override // er.q
        public final Object w(Object obj, Object obj2, Object obj3) {
            return c.f((s) obj, (r) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static q<n, r, Integer, i0> f6047c = m.b(965047645, false, new q() { // from class: ae4.b
        @Override // er.q
        public final Object w(Object obj, Object obj2, Object obj3) {
            return c.e((n) obj, (r) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 e(n nVar, r rVar, int i15) {
        if (t.k()) {
            t.o(965047645, i15, -1, "pl.gov.mobywatel.feature.passportagreementmanagement.presentation.ComposableSingletons$PassportAgreementManagementNavContentKt.lambda$965047645.<anonymous> (PassportAgreementManagementNavContent.kt:67)");
        }
        h.g(nVar, rVar, i15 & 14);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(s sVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-509589443, i15, -1, "pl.gov.mobywatel.feature.passportagreementmanagement.presentation.ComposableSingletons$PassportAgreementManagementNavContentKt.lambda$-509589443.<anonymous> (PassportAgreementManagementNavContent.kt:42)");
        }
        l.r(sVar, rVar, i15 & 14);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    public final q<s, r, Integer, i0> c() {
        return f6046b;
    }

    public final q<n, r, Integer, i0> d() {
        return f6047c;
    }
}
