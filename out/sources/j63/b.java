package j63;

import er.q;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import p076m2.t;
import q40.IconPageBottomContentData;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f99820a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static q<IconPageBottomContentData, r, Integer, i0> f99821b = y2.m.b(-1053650773, false, new q() { // from class: j63.a
        @Override // er.q
        public final Object w(Object obj, Object obj2, Object obj3) {
            return b.c((IconPageBottomContentData) obj, (r) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 c(IconPageBottomContentData iconPageBottomContentData, r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= (i15 & 8) == 0 ? rVar.W(iconPageBottomContentData) : rVar.G(iconPageBottomContentData) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (t.k()) {
                t.o(-1053650773, i15, -1, "pl.gov.coi.mobywatel.feature.settings.presentation.contactdetails.common.editionexceeded.ComposableSingletons$ContactDetailsEditionExceededScreenKt.lambda$-1053650773.<anonymous> (ContactDetailsEditionExceededScreen.kt:32)");
            }
            h30.q.p(iconPageBottomContentData.getPrimaryButtonData(), false, null, rVar, 0, 6);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    public final q<IconPageBottomContentData, r, Integer, i0> b() {
        return f99821b;
    }
}
