package y30;

import er.p;
import er.q;
import java.util.List;
import oq.i0;
import p046f2.TabPosition;
import p071kotlin.Metadata;
import p076m2.r;
import p076m2.t;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f223658a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static q<List<TabPosition>, r, Integer, i0> f223659b = y2.m.b(-961502324, false, new q() { // from class: y30.a
        @Override // er.q
        public final Object w(Object obj, Object obj2, Object obj3) {
            return c.f((List) obj, (r) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static p<r, Integer, i0> f223660c = y2.m.b(-313444533, false, new p() { // from class: y30.b
        @Override // er.p
        public final Object B(Object obj, Object obj2) {
            return c.e((r) obj, ((Integer) obj2).intValue());
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 e(r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(-313444533, i15, -1, "pl.gov.coi.common.ui.ds.controllers.ComposableSingletons$ControllerSwitchKt.lambda$-313444533.<anonymous> (ControllerSwitch.kt:52)");
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
    public static final i0 f(List list, r rVar, int i15) {
        if (t.k()) {
            t.o(-961502324, i15, -1, "pl.gov.coi.common.ui.ds.controllers.ComposableSingletons$ControllerSwitchKt.lambda$-961502324.<anonymous> (ControllerSwitch.kt:51)");
        }
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    public final p<r, Integer, i0> c() {
        return f223660c;
    }

    public final q<List<TabPosition>, r, Integer, i0> d() {
        return f223659b;
    }
}
