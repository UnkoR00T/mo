package p133xq1;

import er.a;
import er.p;
import i50.BaseScaffoldData;
import i50.s;
import mx.b;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p076m2.r;
import p076m2.t;
import x50.NavigationButtonData;
import x50.i;

/* JADX INFO: renamed from: xq1.d, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001d\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/Function0;", "Loq/i0;", "close", "b", "(Ler/a;Lm2/r;I)V", "developer_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class Function0 {
    public static final void b(final a<i0> aVar, r rVar, final int i15) {
        int i16;
        r rVar2;
        r rVarH = rVar.h(-30273631);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(-30273631, i16, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.ds.statusbadge.DeveloperStatusBadgeScreen (DeveloperStatusBadgeScreen.kt:23)");
            }
            rVar2 = rVarH;
            s.r(new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), aVar), b.b("Status Badge 1.2.0", ""), null, null, null, 28, null), null, null, null, null, 61, null), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, b.f220513a.b(), rVar2, BaseScaffoldData.f89350g, 196608, 32766);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: xq1.c
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return Function0.c(aVar, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 c(a aVar, int i15, r rVar, int i16) {
        b(aVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
