package g70;

import d1.e0;
import d1.i;
import d1.i0;
import d1.r3;
import er.p;
import f3.j;
import f3.m;
import n50.h0;
import n50.k;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.t;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lg70/c;", "shortcutsMoreContentData", "Loq/i0;", "b", "(Lg70/c;Lm2/r;I)V", "ui_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class e {
    public static final void b(final ShortcutsMoreContentData shortcutsMoreContentData, r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(-1069369803);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(shortcutsMoreContentData) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(-1069369803, i16, -1, "pl.gov.coi.common.ui.shortcuts.more.ShortcutsMoreContent (ShortcutsMoreContent.kt:14)");
            }
            m.Companion companion = m.INSTANCE;
            w0 w0VarA = e0.a(i.f39152a.k(), f3.c.INSTANCE.k(), rVarH, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            m mVarE = j.e(rVarH, companion);
            androidx.compose.ui.node.c.Companion companion2 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion2.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB);
            } else {
                rVarH.u();
            }
            r rVarC = n6.c(rVarH);
            n6.i(rVarC, w0VarA, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
            n6.g(rVarC, companion2.a());
            n6.i(rVarC, mVarE, companion2.e());
            i0 i0Var = i0.f39176a;
            m30.i.d(shortcutsMoreContentData.getShortcutsData(), null, null, rVarH, 0, 6);
            k deleteShortcutData = shortcutsMoreContentData.getDeleteShortcutData();
            if (deleteShortcutData == null) {
                rVarH.X(510371734);
            } else {
                rVarH.X(510371735);
                r3.a(androidx.compose.foundation.layout.d.i(companion, k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing200()), rVarH, 0);
                h0.v(deleteShortcutData, null, rVarH, 0, 2);
            }
            rVarH.R();
            rVarH.x();
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: g70.d
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return e.c(shortcutsMoreContentData, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 c(ShortcutsMoreContentData shortcutsMoreContentData, int i15, r rVar, int i16) {
        b(shortcutsMoreContentData, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }
}
