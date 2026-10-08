package if1;

import d1.r3;
import h30.ButtonData;
import oq.i0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p071kotlin.Metadata;
import p076m2.r;
import p076m2.t;
import q40.IconPageBottomContentData;
import t40.InfoRowListData;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f92080a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static er.q<InfoRowListData, r, Integer, i0> f92081b = y2.m.b(-1951259029, false, new er.q() { // from class: if1.a
        @Override // er.q
        public final Object w(Object obj, Object obj2, Object obj3) {
            return d.g((InfoRowListData) obj, (r) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static er.q<IconPageBottomContentData, r, Integer, i0> f92082c = y2.m.b(1676312006, false, new er.q() { // from class: if1.b
        @Override // er.q
        public final Object w(Object obj, Object obj2, Object obj3) {
            return d.f((IconPageBottomContentData) obj, (r) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(IconPageBottomContentData iconPageBottomContentData, r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVar.W(iconPageBottomContentData) : rVar.G(iconPageBottomContentData) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (t.k()) {
                t.o(1676312006, i16, -1, "pl.gov.coi.mobywatel.feature.companycommon.summarystatus.ComposableSingletons$SummaryStatusScreenKt.lambda$1676312006.<anonymous> (SummaryStatusScreen.kt:56)");
            }
            h30.q.p(iconPageBottomContentData.getPrimaryButtonData(), false, null, rVar, 0, 6);
            ButtonData secondaryButtonData = iconPageBottomContentData.getSecondaryButtonData();
            if (secondaryButtonData == null) {
                rVar.X(1426357516);
            } else {
                rVar.X(1426357517);
                r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing150()), rVar, 0);
                h30.q.p(secondaryButtonData, false, null, rVar, 0, 6);
            }
            rVar.R();
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 g(final InfoRowListData infoRowListData, r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= (i15 & 8) == 0 ? rVar.W(infoRowListData) : rVar.G(infoRowListData) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (t.k()) {
                t.o(-1951259029, i15, -1, "pl.gov.coi.mobywatel.feature.companycommon.summarystatus.ComposableSingletons$SummaryStatusScreenKt.lambda$-1951259029.<anonymous> (SummaryStatusScreen.kt:49)");
            }
            if (infoRowListData == null) {
                rVar.X(-1870297383);
                rVar.R();
            } else {
                rVar.X(-1870297382);
                x30.c.c(null, 0.0f, y2.m.d(-1220752453, true, new er.p() { // from class: if1.c
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return d.h(infoRowListData, (r) obj, ((Integer) obj2).intValue());
                    }
                }, rVar, 54), rVar, MLKEMEngine.KyberPolyBytes, 3);
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
    public static final i0 h(InfoRowListData infoRowListData, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(-1220752453, i15, -1, "pl.gov.coi.mobywatel.feature.companycommon.summarystatus.ComposableSingletons$SummaryStatusScreenKt.lambda$-1951259029.<anonymous>.<anonymous>.<anonymous> (SummaryStatusScreen.kt:51)");
            }
            s40.g.c(infoRowListData, 0.0f, rVar, InfoRowListData.f187643b, 2);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    public final er.q<InfoRowListData, r, Integer, i0> d() {
        return f92081b;
    }

    public final er.q<IconPageBottomContentData, r, Integer, i0> e() {
        return f92082c;
    }
}
