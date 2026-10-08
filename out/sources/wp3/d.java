package wp3;

import d1.r3;
import h30.ButtonData;
import oq.i0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p071kotlin.Metadata;
import q40.IconPageBottomContentData;
import t40.InfoRowListData;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f214315a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static er.q<InfoRowListData, p076m2.r, Integer, i0> f214316b = y2.m.b(-782090329, false, new er.q() { // from class: wp3.a
        @Override // er.q
        public final Object w(Object obj, Object obj2, Object obj3) {
            return d.g((InfoRowListData) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static er.q<IconPageBottomContentData, p076m2.r, Integer, i0> f214317c = y2.m.b(881572972, false, new er.q() { // from class: wp3.b
        @Override // er.q
        public final Object w(Object obj, Object obj2, Object obj3) {
            return d.f((IconPageBottomContentData) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(IconPageBottomContentData iconPageBottomContentData, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVar.W(iconPageBottomContentData) : rVar.G(iconPageBottomContentData) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(881572972, i16, -1, "pl.gov.coi.mobywatel.feature.voteidea.presentation.screens.roundsummary.ComposableSingletons$RoundSummaryScreenKt.lambda$881572972.<anonymous> (RoundSummaryScreen.kt:50)");
            }
            h30.q.p(iconPageBottomContentData.getPrimaryButtonData(), false, null, rVar, 0, 6);
            ButtonData secondaryButtonData = iconPageBottomContentData.getSecondaryButtonData();
            if (secondaryButtonData == null) {
                rVar.X(-784464672);
            } else {
                rVar.X(-784464671);
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 g(final InfoRowListData infoRowListData, p076m2.r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= (i15 & 8) == 0 ? rVar.W(infoRowListData) : rVar.G(infoRowListData) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-782090329, i15, -1, "pl.gov.coi.mobywatel.feature.voteidea.presentation.screens.roundsummary.ComposableSingletons$RoundSummaryScreenKt.lambda$-782090329.<anonymous> (RoundSummaryScreen.kt:45)");
            }
            x30.c.c(null, 0.0f, y2.m.d(-50572570, true, new er.p() { // from class: wp3.c
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return d.h(infoRowListData, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVar, 54), rVar, MLKEMEngine.KyberPolyBytes, 3);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(InfoRowListData infoRowListData, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-50572570, i15, -1, "pl.gov.coi.mobywatel.feature.voteidea.presentation.screens.roundsummary.ComposableSingletons$RoundSummaryScreenKt.lambda$-782090329.<anonymous>.<anonymous> (RoundSummaryScreen.kt:46)");
            }
            s40.g.c(infoRowListData, 0.0f, rVar, InfoRowListData.f187643b, 2);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    public final er.q<InfoRowListData, p076m2.r, Integer, i0> d() {
        return f214316b;
    }

    public final er.q<IconPageBottomContentData, p076m2.r, Integer, i0> e() {
        return f214317c;
    }
}
