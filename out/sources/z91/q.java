package z91;

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
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q f233681a = new q();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static er.q<InfoRowListData, r, Integer, i0> f233682b = y2.m.b(-1374997314, false, new er.q() { // from class: z91.n
        @Override // er.q
        public final Object w(Object obj, Object obj2, Object obj3) {
            return q.g((InfoRowListData) obj, (r) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static er.q<IconPageBottomContentData, r, Integer, i0> f233683c = y2.m.b(1651513433, false, new er.q() { // from class: z91.o
        @Override // er.q
        public final Object w(Object obj, Object obj2, Object obj3) {
            return q.f((IconPageBottomContentData) obj, (r) obj2, ((Integer) obj3).intValue());
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
                t.o(1651513433, i16, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.takestoolong.ComposableSingletons$ChildPassportApplicationTakesTooLongScreenKt.lambda$1651513433.<anonymous> (ChildPassportApplicationTakesTooLongScreen.kt:41)");
            }
            h30.q.p(iconPageBottomContentData.getPrimaryButtonData(), false, null, rVar, 0, 6);
            ButtonData secondaryButtonData = iconPageBottomContentData.getSecondaryButtonData();
            if (secondaryButtonData == null) {
                rVar.X(1386435877);
            } else {
                rVar.X(1386435878);
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
                t.o(-1374997314, i15, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.takestoolong.ComposableSingletons$ChildPassportApplicationTakesTooLongScreenKt.lambda$-1374997314.<anonymous> (ChildPassportApplicationTakesTooLongScreen.kt:34)");
            }
            x30.c.c(null, 0.0f, y2.m.d(-2095098721, true, new er.p() { // from class: z91.p
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return q.h(infoRowListData, (r) obj, ((Integer) obj2).intValue());
                }
            }, rVar, 54), rVar, MLKEMEngine.KyberPolyBytes, 3);
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
                t.o(-2095098721, i15, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.takestoolong.ComposableSingletons$ChildPassportApplicationTakesTooLongScreenKt.lambda$-1374997314.<anonymous>.<anonymous> (ChildPassportApplicationTakesTooLongScreen.kt:35)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            k70.a aVar = k70.a.f108864a;
            int i16 = k70.a.f108865b;
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i16).getSpacing50()), rVar, 0);
            s40.g.c(infoRowListData, 0.0f, rVar, InfoRowListData.f187643b, 2);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i16).getSpacing50()), rVar, 0);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    public final er.q<InfoRowListData, r, Integer, i0> d() {
        return f233682b;
    }

    public final er.q<IconPageBottomContentData, r, Integer, i0> e() {
        return f233683c;
    }
}
