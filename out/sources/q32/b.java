package q32;

import h30.ButtonData;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f164122a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static er.q<ButtonData, p076m2.r, Integer, i0> f164123b = y2.m.b(754623594, false, new er.q() { // from class: q32.a
        @Override // er.q
        public final Object w(Object obj, Object obj2, Object obj3) {
            return b.c((ButtonData) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 c(ButtonData buttonData, p076m2.r rVar, int i15) {
        p076m2.r rVar2;
        if ((i15 & 6) == 0) {
            i15 |= rVar.W(buttonData) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(754623594, i15, -1, "pl.gov.coi.mobywatel.feature.electronicdelivery.presentation.screens.webview.ComposableSingletons$OAuthWebViewScreenKt.lambda$754623594.<anonymous> (OAuthWebViewScreen.kt:68)");
            }
            if (buttonData != null) {
                rVar.X(1132714788);
                rVar2 = rVar;
                h30.q.p(buttonData, false, null, rVar2, i15 & 14, 6);
            } else {
                rVar2 = rVar;
                rVar2.X(1130202424);
            }
            rVar2.R();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    public final er.q<ButtonData, p076m2.r, Integer, i0> b() {
        return f164123b;
    }
}
