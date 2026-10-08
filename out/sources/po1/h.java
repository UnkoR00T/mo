package po1;

import d1.a3;
import d1.d3;
import i50.BaseScaffoldData;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n²\u0006\f\u0010\t\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lpo1/c;", "viewModel", "Loq/i0;", "i", "(Lpo1/c;Lm2/r;I)V", "Lpo1/c$a;", "data", "e", "(Lpo1/c$a;Lm2/r;I)V", "state", "developer_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class h {
    public static final void e(final c.Data data, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(1940431973);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(data) : rVarH.G(data) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1940431973, i16, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.DesignSystemInitialized (DesignSystemScreen.kt:32)");
            }
            int i17 = i16;
            i50.s.r(data.getBaseScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(1569762776, true, new er.q() { // from class: po1.e
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return h.f(data, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVarH, BaseScaffoldData.f89350g, 196608, 32766);
            rVarH = rVarH;
            boolean z15 = (i17 & 14) == 4 || ((i17 & 8) != 0 && rVarH.G(data));
            Object objE = rVarH.E();
            if (z15 || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.a() { // from class: po1.f
                    @Override // er.a
                    public final Object a() {
                        return h.g(data);
                    }
                };
                rVarH.v(objE);
            }
            p088nul.q0.g(false, (er.a) objE, rVarH, 0, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: po1.g
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return h.h(data, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 f(c.Data data, d3 d3Var, p076m2.r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= rVar.W(d3Var) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1569762776, i15, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.DesignSystemInitialized.<anonymous> (DesignSystemScreen.kt:36)");
            }
            f3.m mVarN = t70.s.n(androidx.compose.foundation.layout.d.f(a3.l(f3.m.INSTANCE, d3Var), 0.0f, 1, null), rVar, 0);
            p036e4.w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarN);
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
            n6.i(rVarC, w0VarA, companion.d());
            n6.i(rVarC, e0VarT, companion.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
            n6.g(rVarC, companion.a());
            n6.i(rVarC, mVarE, companion.e());
            d1.i0 i0Var = d1.i0.f39176a;
            m30.m.d(data.getCardList(), null, rVar, 0, 2);
            rVar.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 g(c.Data data) {
        data.c().a();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 h(c.Data data, int i15, p076m2.r rVar, int i16) {
        e(data, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void i(final c cVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-660115857);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(cVar) : rVarH.G(cVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-660115857, i16, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.DesignSystemScreen (DesignSystemScreen.kt:21)");
            }
            e(j(m7.b.c(cVar.getState(), null, null, null, rVarH, 0, 7)), rVarH, BaseScaffoldData.f89350g);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: po1.d
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return h.k(cVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final c.Data j(f6<c.Data> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 k(c cVar, int i15, p076m2.r rVar, int i16) {
        i(cVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }
}
