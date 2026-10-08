package on1;

import d1.a3;
import d1.d3;
import d1.x;
import er.q;
import i50.BaseScaffoldData;
import i50.s;
import oq.i0;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.e0;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.t;
import p088nul.q0;
import q40.IconPageData;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lon1/d;", "viewModel", "Loq/i0;", "i", "(Lon1/d;Lm2/r;I)V", "Lon1/d$a;", "data", "e", "(Lon1/d$a;Lm2/r;I)V", "dependentidsuspension_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class j {
    private static final void e(final d.Data data, r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(1096322619);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(data) : rVarH.G(data) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(1096322619, i16, -1, "pl.gov.coi.mobywatel.feature.dependentidsuspension.presentation.step.prohibitedaccess.ProhibitedAccessContent (ProhibitedAccessScreen.kt:23)");
            }
            int i17 = i16;
            s.r(data.getScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-782177938, true, new q() { // from class: on1.g
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return j.f(data, (d3) obj, (r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVarH, BaseScaffoldData.f89350g, 196608, 32766);
            rVarH = rVarH;
            boolean z15 = (i17 & 14) == 4 || ((i17 & 8) != 0 && rVarH.G(data));
            Object objE = rVarH.E();
            if (z15 || objE == r.INSTANCE.a()) {
                objE = new er.a() { // from class: on1.h
                    @Override // er.a
                    public final Object a() {
                        return j.g(data);
                    }
                };
                rVarH.v(objE);
            }
            q0.g(false, (er.a) objE, rVarH, 0, 1);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: on1.i
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return j.h(data, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(d.Data data, d3 d3Var, r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= rVar.W(d3Var) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (t.k()) {
                t.o(-782177938, i15, -1, "pl.gov.coi.mobywatel.feature.dependentidsuspension.presentation.step.prohibitedaccess.ProhibitedAccessContent.<anonymous> (ProhibitedAccessScreen.kt:25)");
            }
            f3.m mVarL = a3.l(f3.m.INSTANCE, d3Var);
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
            r rVarC = n6.c(rVar);
            n6.i(rVarC, w0VarI, companion.d());
            n6.i(rVarC, e0VarT, companion.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
            n6.g(rVarC, companion.a());
            n6.i(rVarC, mVarE, companion.e());
            x xVar = x.f39368a;
            q40.i.b(data.a(), null, null, rVar, IconPageData.f164667h, 6);
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
    public static final i0 g(d.Data data) {
        data.b().a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(d.Data data, int i15, r rVar, int i16) {
        e(data, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void i(final d dVar, r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(-1762847606);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(dVar) : rVarH.G(dVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(-1762847606, i16, -1, "pl.gov.coi.mobywatel.feature.dependentidsuspension.presentation.step.prohibitedaccess.ProhibitedAccessScreen (ProhibitedAccessScreen.kt:17)");
            }
            e(j(m7.b.c(dVar.getState(), null, null, null, rVarH, 0, 7)), rVarH, BaseScaffoldData.f89350g | IconPageData.f164667h);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: on1.f
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return j.k(dVar, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final d.Data j(f6<d.Data> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k(d dVar, int i15, r rVar, int i16) {
        i(dVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
