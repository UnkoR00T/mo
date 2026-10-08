package bh3;

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
    public static final d f19630a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static er.q<InfoRowListData, p076m2.r, Integer, i0> f19631b = y2.m.b(1409358875, false, new er.q() { // from class: bh3.a
        @Override // er.q
        public final Object w(Object obj, Object obj2, Object obj3) {
            return d.f((InfoRowListData) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static er.q<IconPageBottomContentData, p076m2.r, Integer, i0> f19632c = y2.m.b(550536992, false, new er.q() { // from class: bh3.b
        @Override // er.q
        public final Object w(Object obj, Object obj2, Object obj3) {
            return d.h((IconPageBottomContentData) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(final InfoRowListData infoRowListData, p076m2.r rVar, int i15) {
        p076m2.r rVar2;
        if ((i15 & 6) == 0) {
            i15 |= (i15 & 8) == 0 ? rVar.W(infoRowListData) : rVar.G(infoRowListData) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1409358875, i15, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.screens.newcolission.success.ComposableSingletons$SuccessScreenKt.lambda$1409358875.<anonymous> (SuccessScreen.kt:60)");
            }
            if (infoRowListData != null) {
                rVar.X(-1389975035);
                rVar2 = rVar;
                x30.c.c(null, 0.0f, y2.m.d(153816863, true, new er.p() { // from class: bh3.c
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return d.g(infoRowListData, (p076m2.r) obj, ((Integer) obj2).intValue());
                    }
                }, rVar, 54), rVar2, MLKEMEngine.KyberPolyBytes, 3);
            } else {
                rVar2 = rVar;
                rVar2.X(-1392159481);
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 g(InfoRowListData infoRowListData, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(153816863, i15, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.screens.newcolission.success.ComposableSingletons$SuccessScreenKt.lambda$1409358875.<anonymous>.<anonymous> (SuccessScreen.kt:62)");
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
                p076m2.t.o(550536992, i16, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.screens.newcolission.success.ComposableSingletons$SuccessScreenKt.lambda$550536992.<anonymous> (SuccessScreen.kt:67)");
            }
            h30.q.p(iconPageBottomContentData.getPrimaryButtonData(), false, null, rVar, 0, 6);
            ButtonData secondaryButtonData = iconPageBottomContentData.getSecondaryButtonData();
            if (secondaryButtonData == null) {
                rVar.X(-1432449294);
            } else {
                rVar.X(-1432449293);
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

    public final er.q<InfoRowListData, p076m2.r, Integer, i0> d() {
        return f19631b;
    }

    public final er.q<IconPageBottomContentData, p076m2.r, Integer, i0> e() {
        return f19632c;
    }
}
