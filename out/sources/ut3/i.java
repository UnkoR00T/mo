package ut3;

import androidx.p016lifecycle.t0;
import cu3.p;
import er.q;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import p076m2.t;
import y2.m;
import yt3.k;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f201442a = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static q<t0, r, Integer, i0> f201443b = m.b(-1707696629, false, new q() { // from class: ut3.g
        @Override // er.q
        public final Object w(Object obj, Object obj2, Object obj3) {
            return i.f((t0) obj, (r) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static q<t0, r, Integer, i0> f201444c = m.b(931820994, false, new q() { // from class: ut3.h
        @Override // er.q
        public final Object w(Object obj, Object obj2, Object obj3) {
            return i.e((t0) obj, (r) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final i0 e(t0 t0Var, r rVar, int i15) {
        if (t.k()) {
            t.o(931820994, i15, -1, "pl.gov.coi.mobywatel.segment.addressform.di.ComposableSingletons$AddressFormModuleKt.lambda$931820994.<anonymous> (AddressFormModule.kt:46)");
        }
        p.g((cu3.f) t0Var, rVar, i15 & 14);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final i0 f(t0 t0Var, r rVar, int i15) {
        if (t.k()) {
            t.o(-1707696629, i15, -1, "pl.gov.coi.mobywatel.segment.addressform.di.ComposableSingletons$AddressFormModuleKt.lambda$-1707696629.<anonymous> (AddressFormModule.kt:40)");
        }
        k.g((yt3.c) t0Var, rVar, i15 & 14);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    public final q<t0, r, Integer, i0> c() {
        return f201443b;
    }

    public final q<t0, r, Integer, i0> d() {
        return f201444c;
    }
}
