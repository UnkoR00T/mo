package c71;

import h30.ButtonData;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
public final class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k0 f23875a = new k0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static er.q<ButtonData, p076m2.r, Integer, oq.i0> f23876b = y2.m.b(1154200302, false, new er.q() { // from class: c71.i0
        @Override // er.q
        public final Object w(Object obj, Object obj2, Object obj3) {
            return k0.e((ButtonData) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static er.q<ButtonData, p076m2.r, Integer, oq.i0> f23877c = y2.m.b(2113939270, false, new er.q() { // from class: c71.j0
        @Override // er.q
        public final Object w(Object obj, Object obj2, Object obj3) {
            return k0.f((ButtonData) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 e(ButtonData buttonData, p076m2.r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= rVar.W(buttonData) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1154200302, i15, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.authorizationcheck.ComposableSingletons$ChildPassportApplicationAuthorizationCheckScreenKt.lambda$1154200302.<anonymous> (ChildPassportApplicationAuthorizationCheckScreen.kt:45)");
            }
            h30.q.p(buttonData, false, null, rVar, i15 & 14, 6);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 f(ButtonData buttonData, p076m2.r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= rVar.W(buttonData) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(2113939270, i15, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.authorizationcheck.ComposableSingletons$ChildPassportApplicationAuthorizationCheckScreenKt.lambda$2113939270.<anonymous> (ChildPassportApplicationAuthorizationCheckScreen.kt:66)");
            }
            h30.q.p(buttonData, false, null, rVar, i15 & 14, 6);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    public final er.q<ButtonData, p076m2.r, Integer, oq.i0> c() {
        return f23876b;
    }

    public final er.q<ButtonData, p076m2.r, Integer, oq.i0> d() {
        return f23877c;
    }
}
