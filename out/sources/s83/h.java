package s83;

import d1.a3;
import d1.d3;
import d1.e0;
import er.q;
import i50.BaseScaffoldData;
import i50.s;
import oq.i0;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.t;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Ls83/e;", "viewModel", "Loq/i0;", "c", "(Ls83/e;Lm2/r;I)V", "Ls83/e$a;", "screenData", "technicalsupport_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class h {
    public static final void c(final e eVar, r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(-274154896);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(eVar) : rVarH.G(eVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(-274154896, i16, -1, "pl.gov.coi.mobywatel.feature.technicalsupport.presentation.screens.reasonlist.ReasonListScreen (ReasonListScreen.kt:18)");
            }
            final e.a aVarD = d(m7.b.c(eVar.getState(), null, null, null, rVarH, 0, 7));
            if (fr.t.c(aVarD, e.a.C4606a.f179260a)) {
                rVarH.X(-1469843724);
                rVarH.R();
            } else {
                if (!(aVarD instanceof e.a.Initialized)) {
                    rVarH.X(-1469845563);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(-1469841692);
                s.r(((e.a.Initialized) aVarD).getBaseScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-1580395742, true, new q() { // from class: s83.f
                    @Override // er.q
                    public final Object w(Object obj, Object obj2, Object obj3) {
                        return h.e(aVarD, (d3) obj, (r) obj2, ((Integer) obj3).intValue());
                    }
                }, rVarH, 54), rVarH, BaseScaffoldData.f89350g, 196608, 32766);
                rVarH = rVarH;
                rVarH.R();
            }
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: s83.g
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return h.f(eVar, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final e.a d(f6<? extends e.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 e(e.a aVar, d3 d3Var, r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= rVar.W(d3Var) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (t.k()) {
                t.o(-1580395742, i15, -1, "pl.gov.coi.mobywatel.feature.technicalsupport.presentation.screens.reasonlist.ReasonListScreen.<anonymous> (ReasonListScreen.kt:25)");
            }
            f3.m mVarN = t70.s.n(t70.i.S(a3.l(f3.m.INSTANCE, d3Var), null, rVar, 0, 1), rVar, 0);
            w0 w0VarA = e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
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
            r rVarC = n6.c(rVar);
            n6.i(rVarC, w0VarA, companion.d());
            n6.i(rVarC, e0VarT, companion.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
            n6.g(rVarC, companion.a());
            n6.i(rVarC, mVarE, companion.e());
            d1.i0 i0Var = d1.i0.f39176a;
            m30.i.d(((e.a.Initialized) aVar).getSingleCardListData(), null, null, rVar, 0, 6);
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
    public static final i0 f(e eVar, int i15, r rVar, int i16) {
        c(eVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
