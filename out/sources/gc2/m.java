package gc2;

import d1.a3;
import d1.d3;
import d1.x;
import h30.ButtonData;
import i50.BaseScaffoldData;
import oq.i0;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.e0;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p076m2.t;
import p088nul.q0;
import q40.IconPageData;
import t40.InfoRowListData;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lgc2/h;", "viewModel", "Loq/i0;", "e", "(Lgc2/h;Lm2/r;I)V", "Lgc2/h$a;", "data", "h", "(Lgc2/h$a;Lm2/r;I)V", "identitycardinvalidation_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class m {
    public static final void e(final h hVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-663046870);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(hVar) : rVarH.G(hVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(-663046870, i16, -1, "pl.gov.coi.mobywatel.feature.identitycardinvalidation.presentation.success.SuccessScreen (SuccessScreen.kt:21)");
            }
            h(f(m7.b.c(hVar.getState(), null, null, null, rVarH, 0, 7)), rVarH, BaseScaffoldData.f89350g | IconPageData.f164667h | InfoRowListData.f187643b);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: gc2.i
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return m.g(hVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final h.Data f(f6<h.Data> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 g(h hVar, int i15, p076m2.r rVar, int i16) {
        e(hVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private static final void h(final h.Data data, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-989895769);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(data) : rVarH.G(data) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(-989895769, i16, -1, "pl.gov.coi.mobywatel.feature.identitycardinvalidation.presentation.success.SuccessScreenContent (SuccessScreen.kt:27)");
            }
            i50.s.r(data.getScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(1131079124, true, new er.q() { // from class: gc2.j
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return m.i(data, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVarH, BaseScaffoldData.f89350g, 196608, 32766);
            rVarH = rVarH;
            Object objE = rVarH.E();
            if (objE == p076m2.r.INSTANCE.a()) {
                objE = new er.a() { // from class: gc2.k
                    @Override // er.a
                    public final Object a() {
                        return m.j();
                    }
                };
                rVarH.v(objE);
            }
            q0.g(false, (er.a) objE, rVarH, 48, 1);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: gc2.l
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return m.k(data, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(h.Data data, d3 d3Var, p076m2.r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= rVar.W(d3Var) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (t.k()) {
                t.o(1131079124, i15, -1, "pl.gov.coi.mobywatel.feature.identitycardinvalidation.presentation.success.SuccessScreenContent.<anonymous> (SuccessScreen.kt:29)");
            }
            f3.m mVarL = a3.l(androidx.compose.foundation.layout.d.f(f3.m.INSTANCE, 0.0f, 1, null), d3Var);
            w0 w0VarI = d1.r.i(f3.c.INSTANCE.o(), false);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarL);
            androidx.compose.ui.node.c.Companion companion = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion.b();
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
            n6.i(rVarC, w0VarI, companion.d());
            n6.i(rVarC, e0VarT, companion.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
            n6.g(rVarC, companion.a());
            n6.i(rVarC, mVarE, companion.e());
            x xVar = x.f39368a;
            IconPageData<InfoRowListData, ButtonData> iconPageDataA = data.a();
            d dVar = d.f71774a;
            q40.i.b(iconPageDataA, dVar.e(), dVar.d(), rVar, IconPageData.f164667h | InfoRowListData.f187643b | 432, 0);
            rVar.x();
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j() {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k(h.Data data, int i15, p076m2.r rVar, int i16) {
        h(data, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
