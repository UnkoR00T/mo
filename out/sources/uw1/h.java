package uw1;

import d1.d3;
import i50.BaseScaffoldData;
import oq.i0;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.e0;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p088nul.q0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b²\u0006\f\u0010\n\u001a\u00020\t8\nX\u008a\u0084\u0002"}, d2 = {"Luw1/c;", "viewModel", "Loq/i0;", "e", "(Luw1/c;Lm2/r;I)V", "Luw1/c$a$c;", "data", "h", "(Luw1/c$a$c;Lm2/r;I)V", "Luw1/c$a;", "state", "eidservices_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class h {
    public static final void e(final c cVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(607643484);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(cVar) : rVarH.G(cVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(607643484, i16, -1, "pl.gov.coi.mobywatel.feature.eidservices.common.presentation.electroniccapability.ElectronicCapabilityScreen (ElectronicCapabilityScreen.kt:20)");
            }
            c.a aVarF = f(m7.b.c(cVar.getState(), null, null, null, rVarH, 0, 7));
            if (aVarF instanceof c.a.StatusChecked) {
                rVarH.X(-170156451);
                h((c.a.StatusChecked) aVarF, rVarH, 0);
                rVarH.R();
            } else if (aVarF instanceof c.a.Error) {
                rVarH.X(-170152028);
                ((c.a.Error) aVarF).getErrorVMS().b(rVarH, 0);
                rVarH.R();
            } else {
                if (!(aVarF instanceof c.a.C5247a)) {
                    rVarH.X(-170159176);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(-170150035);
                c60.b.b(rVarH, 0);
                rVarH.R();
            }
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: uw1.d
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return h.g(cVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final c.a f(f6<? extends c.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 g(c cVar, int i15, p076m2.r rVar, int i16) {
        e(cVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void h(final c.a.StatusChecked statusChecked, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-495447425);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(statusChecked) : rVarH.G(statusChecked) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-495447425, i16, -1, "pl.gov.coi.mobywatel.feature.eidservices.common.presentation.electroniccapability.ElectronicCapabilityStatusScreen (ElectronicCapabilityScreen.kt:37)");
            }
            int i17 = i16;
            i50.s.r(statusChecked.getScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(170993394, true, new er.q() { // from class: uw1.e
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return h.i(statusChecked, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVarH, BaseScaffoldData.f89350g, 196608, 32766);
            rVarH = rVarH;
            boolean z15 = (i17 & 14) == 4 || ((i17 & 8) != 0 && rVarH.G(statusChecked));
            Object objE = rVarH.E();
            if (z15 || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.a() { // from class: uw1.f
                    @Override // er.a
                    public final Object a() {
                        return h.j(statusChecked);
                    }
                };
                rVarH.v(objE);
            }
            q0.g(false, (er.a) objE, rVarH, 0, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: uw1.g
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return h.k(statusChecked, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(c.a.StatusChecked statusChecked, d3 d3Var, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 17) != 16, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(170993394, i15, -1, "pl.gov.coi.mobywatel.feature.eidservices.common.presentation.electroniccapability.ElectronicCapabilityStatusScreen.<anonymous> (ElectronicCapabilityScreen.kt:39)");
            }
            f3.m mVarF = androidx.compose.foundation.layout.d.f(f3.m.INSTANCE, 0.0f, 1, null);
            w0 w0VarI = d1.r.i(f3.c.INSTANCE.o(), false);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarF);
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
            d1.x xVar = d1.x.f39368a;
            h50.a statusData = statusChecked.getStatusData();
            if (statusData == null) {
                rVar.X(-1217300204);
            } else {
                rVar.X(-1217300203);
                h50.c.b(statusData, rVar, h50.a.f80999k);
            }
            rVar.R();
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
    public static final i0 j(c.a.StatusChecked statusChecked) {
        statusChecked.a().a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k(c.a.StatusChecked statusChecked, int i15, p076m2.r rVar, int i16) {
        h(statusChecked, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
