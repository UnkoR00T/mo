package s51;

import d1.r3;
import h30.ButtonData;
import oq.i0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p071kotlin.Metadata;
import q40.IconPageBottomContentData;
import t40.InfoRowListData;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f178043a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static er.q<t51.c, p076m2.r, Integer, i0> f178044b = y2.m.b(-1796895271, false, new er.q() { // from class: s51.a
        @Override // er.q
        public final Object w(Object obj, Object obj2, Object obj3) {
            return d.f((t51.c) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static er.q<IconPageBottomContentData, p076m2.r, Integer, i0> f178045c = y2.m.b(-1981970629, false, new er.q() { // from class: s51.b
        @Override // er.q
        public final Object w(Object obj, Object obj2, Object obj3) {
            return d.h((IconPageBottomContentData) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(final t51.c cVar, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVar.W(cVar) : rVar.G(cVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1796895271, i16, -1, "pl.gov.coi.mobywatel.feature.childbirthregistration.presentation.screens.wizardsteps.summary.ComposableSingletons$SummaryScreenKt.lambda$-1796895271.<anonymous> (SummaryScreen.kt:112)");
            }
            if (cVar instanceof t51.c.AllSuccess) {
                rVar.X(-239499159);
                x30.c.c(null, 0.0f, y2.m.d(-713504160, true, new er.p() { // from class: s51.c
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return d.g(cVar, (p076m2.r) obj, ((Integer) obj2).intValue());
                    }
                }, rVar, 54), rVar, MLKEMEngine.KyberPolyBytes, 3);
                rVar.R();
            } else {
                if (!(cVar instanceof t51.c.PartialSuccess)) {
                    rVar.X(-239501313);
                    rVar.R();
                    throw new oq.p();
                }
                rVar.X(-239494815);
                m30.i.d(((t51.c.PartialSuccess) cVar).getCardListData(), null, null, rVar, 0, 6);
                rVar.R();
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
    public static final i0 g(t51.c cVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-713504160, i15, -1, "pl.gov.coi.mobywatel.feature.childbirthregistration.presentation.screens.wizardsteps.summary.ComposableSingletons$SummaryScreenKt.lambda$-1796895271.<anonymous>.<anonymous> (SummaryScreen.kt:114)");
            }
            s40.g.c(((t51.c.AllSuccess) cVar).getBullets(), 0.0f, rVar, InfoRowListData.f187643b, 2);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(IconPageBottomContentData iconPageBottomContentData, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVar.W(iconPageBottomContentData) : rVar.G(iconPageBottomContentData) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1981970629, i16, -1, "pl.gov.coi.mobywatel.feature.childbirthregistration.presentation.screens.wizardsteps.summary.ComposableSingletons$SummaryScreenKt.lambda$-1981970629.<anonymous> (SummaryScreen.kt:120)");
            }
            h30.q.p(iconPageBottomContentData.getPrimaryButtonData(), false, null, rVar, 0, 6);
            ButtonData secondaryButtonData = iconPageBottomContentData.getSecondaryButtonData();
            if (secondaryButtonData == null) {
                rVar.X(-1971453065);
            } else {
                rVar.X(-1971453064);
                r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing150()), rVar, 0);
                h30.q.p(secondaryButtonData, false, null, rVar, 0, 6);
            }
            rVar.R();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    public final er.q<t51.c, p076m2.r, Integer, i0> d() {
        return f178044b;
    }

    public final er.q<IconPageBottomContentData, p076m2.r, Integer, i0> e() {
        return f178045c;
    }
}
