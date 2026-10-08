package hs1;

import d1.a3;
import d1.e0;
import d1.r3;
import h30.ButtonData;
import oq.i0;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import u50.v0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lhs1/g;", "viewModel", "Loq/i0;", "d", "(Lhs1/g;Lm2/r;I)V", "Lhs1/g$a;", "data", "g", "(Lhs1/g$a;Lm2/r;I)V", "developer_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class l {
    public static final void d(final g gVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1274141250);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(gVar) : rVarH.G(gVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1274141250, i16, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.shared.second.DeveloperSecondStepScreen (DeveloperSecondStepScreen.kt:19)");
            }
            g(e(m7.b.c(gVar.getState(), null, null, null, rVarH, 0, 7)), rVarH, v50.c.Text.P);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: hs1.i
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return l.f(gVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final g.Data e(f6<g.Data> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(g gVar, int i15, p076m2.r rVar, int i16) {
        d(gVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private static final void g(final g.Data data, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(1820133345);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(data) : rVarH.G(data) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        boolean z15 = true;
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1820133345, i16, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.shared.second.DeveloperSecondStepScreenContent (DeveloperSecondStepScreen.kt:25)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarH = androidx.compose.foundation.layout.d.h(companion, 0.0f, 1, null);
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            f3.m mVarR = a3.r(w0.i.d(mVarH, aVar.a(rVarH, i17).getBase().a(), null, 2, null), 0.0f, aVar.b(rVarH, i17).getSpacing700(), 0.0f, 0.0f, 13, null);
            d1.i iVar = d1.i.f39152a;
            d1.i.n nVarK = iVar.k();
            f3.c.Companion companion2 = f3.c.INSTANCE;
            w0 w0VarA = e0.a(nVarK, companion2.k(), rVarH, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, mVarR);
            androidx.compose.ui.node.c.Companion companion3 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion3.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB);
            } else {
                rVarH.u();
            }
            p076m2.r rVarC = n6.c(rVarH);
            n6.i(rVarC, w0VarA, companion3.d());
            n6.i(rVarC, e0VarT, companion3.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion3.c());
            n6.g(rVarC, companion3.a());
            n6.i(rVarC, mVarE, companion3.e());
            d1.i0 i0Var = d1.i0.f39176a;
            f3.m mVarF = androidx.compose.foundation.layout.d.f(a3.n(w0.i.d(companion, aVar.a(rVarH, i17).getBase().a(), null, 2, null), aVar.b(rVarH, i17).getSpacing200()), 0.0f, 1, null);
            w0 w0VarA2 = e0.a(iVar.k(), companion2.g(), rVarH, 48);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT2 = rVarH.t();
            f3.m mVarE2 = f3.j.e(rVarH, mVarF);
            er.a<androidx.compose.ui.node.c> aVarB2 = companion3.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB2);
            } else {
                rVarH.u();
            }
            p076m2.r rVarC2 = n6.c(rVarH);
            n6.i(rVarC2, w0VarA2, companion3.d());
            n6.i(rVarC2, e0VarT2, companion3.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion3.c());
            n6.g(rVarC2, companion3.a());
            n6.i(rVarC2, mVarE2, companion3.e());
            v50.c.Text firstInputData = data.getFirstInputData();
            int i18 = v50.c.Text.P;
            v0.g(firstInputData, null, rVarH, i18, 2);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i17).getSpacing300()), rVarH, 0);
            v0.g(data.getSecondInputData(), null, rVarH, i18, 2);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i17).getSpacing600()), rVarH, 0);
            ButtonData saveAdHocButton = data.getSaveAdHocButton();
            if ((i16 & 14) != 4 && ((i16 & 8) == 0 || !rVarH.G(data))) {
                z15 = false;
            }
            Object objE = rVarH.E();
            if (z15 || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.a() { // from class: hs1.j
                    @Override // er.a
                    public final Object a() {
                        return l.h(data);
                    }
                };
                rVarH.v(objE);
            }
            h30.q.p(ButtonData.b(saveAdHocButton, null, null, null, null, null, null, (er.a) objE, 63, null), false, null, rVarH, 0, 6);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i17).getSpacing300()), rVarH, 0);
            h30.q.p(data.getNextButton(), false, null, rVarH, 0, 6);
            rVarH.x();
            rVarH.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: hs1.k
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return l.i(data, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(g.Data data) {
        data.getSaveAdHocButton().h().a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(g.Data data, int i15, p076m2.r rVar, int i16) {
        g(data, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
