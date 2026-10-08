package kp1;

import er.q;
import i30.ButtonIconData;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import p076m2.t;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f112142a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static q<d40.b.C0864b, r, Integer, i0> f112143b = y2.m.b(-1471926093, false, new q() { // from class: kp1.a
        @Override // er.q
        public final Object w(Object obj, Object obj2, Object obj3) {
            return d.i((d40.b.C0864b) obj, (r) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static q<d40.b.C0864b, r, Integer, i0> f112144c = y2.m.b(1578207786, false, new q() { // from class: kp1.b
        @Override // er.q
        public final Object w(Object obj, Object obj2, Object obj3) {
            return d.h((d40.b.C0864b) obj, (r) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static q<ButtonIconData, r, Integer, i0> f112145d = y2.m.b(1171728707, false, new q() { // from class: kp1.c
        @Override // er.q
        public final Object w(Object obj, Object obj2, Object obj3) {
            return d.g((ButtonIconData) obj, (r) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 g(ButtonIconData buttonIconData, r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= (i15 & 8) == 0 ? rVar.W(buttonIconData) : rVar.G(buttonIconData) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (t.k()) {
                t.o(1171728707, i15, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.ds.badge.ComposableSingletons$DeveloperBadgeScreenKt.lambda$1171728707.<anonymous> (DeveloperBadgeScreen.kt:92)");
            }
            if (buttonIconData == null) {
                rVar.X(1770759041);
                rVar.R();
            } else {
                rVar.X(1770759042);
                i30.g.f(buttonIconData, false, false, rVar, ButtonIconData.f88935g, 6);
                rVar.R();
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
    public static final i0 h(d40.b.C0864b c0864b, r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= (i15 & 8) == 0 ? rVar.W(c0864b) : rVar.G(c0864b) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (t.k()) {
                t.o(1578207786, i15, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.ds.badge.ComposableSingletons$DeveloperBadgeScreenKt.lambda$1578207786.<anonymous> (DeveloperBadgeScreen.kt:83)");
            }
            if (c0864b == null) {
                rVar.X(-618782304);
                rVar.R();
            } else {
                rVar.X(-618782303);
                d40.h.f(null, c0864b, false, rVar, d40.b.C0864b.f39687h << 3, 5);
                rVar.R();
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
    public static final i0 i(d40.b.C0864b c0864b, r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= (i15 & 8) == 0 ? rVar.W(c0864b) : rVar.G(c0864b) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (t.k()) {
                t.o(-1471926093, i15, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.ds.badge.ComposableSingletons$DeveloperBadgeScreenKt.lambda$-1471926093.<anonymous> (DeveloperBadgeScreen.kt:74)");
            }
            if (c0864b == null) {
                rVar.X(1465909879);
                rVar.R();
            } else {
                rVar.X(1465909880);
                d40.h.f(null, c0864b, false, rVar, d40.b.C0864b.f39687h << 3, 5);
                rVar.R();
            }
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    public final q<d40.b.C0864b, r, Integer, i0> d() {
        return f112143b;
    }

    public final q<ButtonIconData, r, Integer, i0> e() {
        return f112145d;
    }

    public final q<d40.b.C0864b, r, Integer, i0> f() {
        return f112144c;
    }
}
