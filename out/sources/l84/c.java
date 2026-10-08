package l84;

import h30.ButtonData;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f117024a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static er.q<ButtonData, p076m2.r, Integer, oq.i0> f117025b = y2.m.b(-1557248696, false, new er.q() { // from class: l84.a
        @Override // er.q
        public final Object w(Object obj, Object obj2, Object obj3) {
            return c.e((ButtonData) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static er.q<ButtonData, p076m2.r, Integer, oq.i0> f117026c = y2.m.b(-504211929, false, new er.q() { // from class: l84.b
        @Override // er.q
        public final Object w(Object obj, Object obj2, Object obj3) {
            return c.f((ButtonData) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 e(ButtonData buttonData, p076m2.r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= rVar.W(buttonData) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1557248696, i15, -1, "pl.gov.coi.shared.feature.notificationshistory.presentation.ComposableSingletons$NotificationsHistoryScreenKt.lambda$-1557248696.<anonymous> (NotificationsHistoryScreen.kt:144)");
            }
            if (buttonData == null) {
                rVar.X(-2054107625);
                rVar.R();
            } else {
                rVar.X(-2054107624);
                h30.q.p(buttonData, false, null, rVar, i15 & 14, 6);
                rVar.R();
            }
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
                p076m2.t.o(-504211929, i15, -1, "pl.gov.coi.shared.feature.notificationshistory.presentation.ComposableSingletons$NotificationsHistoryScreenKt.lambda$-504211929.<anonymous> (NotificationsHistoryScreen.kt:145)");
            }
            if (buttonData == null) {
                rVar.X(-1476899822);
                rVar.R();
            } else {
                rVar.X(-1476899821);
                h30.q.p(buttonData, false, null, rVar, i15 & 14, 6);
                rVar.R();
            }
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    public final er.q<ButtonData, p076m2.r, Integer, oq.i0> c() {
        return f117025b;
    }

    public final er.q<ButtonData, p076m2.r, Integer, oq.i0> d() {
        return f117026c;
    }
}
