package n63;

import d1.a3;
import d1.d3;
import d1.e0;
import d1.h0;
import d1.r3;
import i50.BaseScaffoldData;
import mx.Label;
import oq.i0;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import q4.TextStyle;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Ln63/i;", "viewModel", "Loq/i0;", "d", "(Ln63/i;Lm2/r;I)V", "Ln63/i$a;", "data", "g", "(Ln63/i$a;Lm2/r;I)V", "settings_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class m {
    public static final void d(final i iVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(1220446367);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(iVar) : rVarH.G(iVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1220446367, i16, -1, "pl.gov.coi.mobywatel.feature.settings.presentation.contactdetails.confirmation.ConfirmationScreen (ConfirmationScreen.kt:29)");
            }
            g(e(m7.b.c(iVar.getState(), null, null, null, rVarH, 0, 7)), rVarH, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: n63.j
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return m.f(iVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final i.Data e(f6<i.Data> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(i iVar, int i15, p076m2.r rVar, int i16) {
        d(iVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void g(final i.Data data, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(1499030082);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(data) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1499030082, i16, -1, "pl.gov.coi.mobywatel.feature.settings.presentation.contactdetails.confirmation.ConfirmationScreenContent (ConfirmationScreen.kt:35)");
            }
            rVar2 = rVarH;
            i50.s.r(data.getScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-133492305, true, new er.q() { // from class: n63.k
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return m.h(data, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVar2, BaseScaffoldData.f89350g, 196608, 32766);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: n63.l
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return m.i(data, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(i.Data data, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        f3.m.Companion companion;
        k70.a aVar;
        int i17;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-133492305, i16, -1, "pl.gov.coi.mobywatel.feature.settings.presentation.contactdetails.confirmation.ConfirmationScreenContent.<anonymous> (ConfirmationScreen.kt:37)");
            }
            f3.m.Companion companion2 = f3.m.INSTANCE;
            f3.m mVarL = a3.l(androidx.compose.foundation.layout.d.f(companion2, 0.0f, 1, null), d3Var);
            k70.a aVar2 = k70.a.f108864a;
            int i18 = k70.a.f108865b;
            f3.m mVarP = a3.p(mVarL, aVar2.b(rVar, i18).getSpacing200(), 0.0f, 2, null);
            f3.c.Companion companion3 = f3.c.INSTANCE;
            f3.c.b bVarG = companion3.g();
            d1.i iVar = d1.i.f39152a;
            w0 w0VarA = e0.a(iVar.k(), bVarG, rVar, 48);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarP);
            androidx.compose.ui.node.c.Companion companion4 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion4.b();
            if (rVar.l() == null) {
                p076m2.m.d();
            }
            rVar.K();
            if (rVar.getInserting()) {
                rVar.H(aVarB);
            } else {
                rVar.u();
            }
            p076m2.r rVarC = n6.c(rVar);
            n6.i(rVarC, w0VarA, companion4.d());
            n6.i(rVarC, e0VarT, companion4.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion4.c());
            n6.g(rVarC, companion4.a());
            n6.i(rVarC, mVarE, companion4.e());
            f3.m mVarR = a3.r(t70.i.S(w0.i.d(h0.b(d1.i0.f39176a, androidx.compose.foundation.layout.d.h(companion2, 0.0f, 1, null), 1.0f, false, 2, null), aVar2.a(rVar, i18).getBase().a(), null, 2, null), null, rVar, 0, 1), 0.0f, aVar2.b(rVar, i18).getSpacing100(), 0.0f, aVar2.b(rVar, i18).getSpacing200(), 5, null);
            w0 w0VarA2 = e0.a(iVar.k(), companion3.g(), rVar, 48);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT2 = rVar.t();
            f3.m mVarE2 = f3.j.e(rVar, mVarR);
            er.a<androidx.compose.ui.node.c> aVarB2 = companion4.b();
            if (rVar.l() == null) {
                p076m2.m.d();
            }
            rVar.K();
            if (rVar.getInserting()) {
                rVar.H(aVarB2);
            } else {
                rVar.u();
            }
            p076m2.r rVarC2 = n6.c(rVar);
            n6.i(rVarC2, w0VarA2, companion4.d());
            n6.i(rVarC2, e0VarT2, companion4.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion4.c());
            n6.g(rVarC2, companion4.a());
            n6.i(rVarC2, mVarE2, companion4.e());
            f3.m mVarH = androidx.compose.foundation.layout.d.h(companion2, 0.0f, 1, null);
            Label description = data.getDescription();
            TextStyle textStyleD = aVar2.f(rVar, i18).d();
            b5.j.Companion companion5 = b5.j.INSTANCE;
            j70.h.g(mVarH, null, description, null, null, 0L, 0L, null, null, null, 0L, null, b5.j.h(companion5.f()), 0L, 0, false, 0, 0, null, textStyleD, null, null, false, false, null, rVar, 6, 0, 0, 33026042);
            p076m2.r rVar2 = rVar;
            Label subtitle = data.getSubtitle();
            if (subtitle == null) {
                rVar2.X(890445940);
                rVar2.R();
                companion = companion2;
                aVar = aVar2;
                i17 = i18;
            } else {
                rVar2.X(890445941);
                r3.a(androidx.compose.foundation.layout.d.i(companion2, aVar2.b(rVar2, i18).getSpacing300()), rVar2, 0);
                companion = companion2;
                j70.h.g(androidx.compose.foundation.layout.d.h(companion2, 0.0f, 1, null), null, subtitle, null, null, 0L, 0L, null, null, null, 0L, null, b5.j.h(companion5.f()), 0L, 0, false, 0, 0, null, aVar2.f(rVar2, i18).b(), null, null, false, false, null, rVar, 6, 0, 0, 33026042);
                rVar2 = rVar;
                i0 i0Var = i0.f148189a;
                rVar2.R();
                aVar = aVar2;
                i17 = i18;
            }
            f3.m.Companion companion6 = companion;
            r3.a(androidx.compose.foundation.layout.d.i(companion6, aVar.b(rVar2, i17).getSpacing200()), rVar2, 0);
            n50.h0.v(data.getContact(), null, rVar2, 0, 2);
            rVar2.x();
            f3.m mVarP2 = a3.p(androidx.compose.foundation.layout.d.h(androidx.compose.foundation.layout.d.C(w0.i.d(companion6, aVar.a(rVar2, i17).getBase().a(), null, 2, null), null, false, 3, null), 0.0f, 1, null), 0.0f, aVar.b(rVar2, i17).getSpacing200(), 1, null);
            w0 w0VarA3 = e0.a(iVar.d(), companion3.k(), rVar2, 6);
            int iHashCode3 = Long.hashCode(p076m2.m.b(rVar2, 0));
            p076m2.e0 e0VarT3 = rVar2.t();
            f3.m mVarE3 = f3.j.e(rVar2, mVarP2);
            er.a<androidx.compose.ui.node.c> aVarB3 = companion4.b();
            if (rVar2.l() == null) {
                p076m2.m.d();
            }
            rVar2.K();
            if (rVar2.getInserting()) {
                rVar2.H(aVarB3);
            } else {
                rVar2.u();
            }
            p076m2.r rVarC3 = n6.c(rVar2);
            n6.i(rVarC3, w0VarA3, companion4.d());
            n6.i(rVarC3, e0VarT3, companion4.f());
            n6.i(rVarC3, Integer.valueOf(iHashCode3), companion4.c());
            n6.g(rVarC3, companion4.a());
            n6.i(rVarC3, mVarE3, companion4.e());
            h30.q.p(data.getNextButton(), false, null, rVar2, 0, 6);
            r3.a(androidx.compose.foundation.layout.d.i(companion6, aVar.b(rVar2, i17).getSpacing150()), rVar2, 0);
            h30.q.p(data.getChangeContactButton(), false, null, rVar2, 0, 6);
            rVar.x();
            rVar.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(i.Data data, int i15, p076m2.r rVar, int i16) {
        g(data, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
