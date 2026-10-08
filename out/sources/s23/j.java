package s23;

import d1.a3;
import d1.d3;
import d1.e0;
import er.q;
import i50.BaseScaffoldData;
import i50.s;
import m70.TimelineData;
import oq.i0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.t;
import p088nul.q0;
import w0.f3;
import w0.u2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b²\u0006\f\u0010\n\u001a\u00020\t8\nX\u008a\u0084\u0002"}, d2 = {"Ls23/d;", "viewModel", "Loq/i0;", "f", "(Ls23/d;Lm2/r;I)V", "Ls23/d$a$a;", "data", "i", "(Ls23/d$a$a;Lm2/r;I)V", "Ls23/d$a;", "screenData", "sanitary_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class j {
    public static final void f(final d dVar, r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(818977964);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(dVar) : rVarH.G(dVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(818977964, i16, -1, "pl.gov.coi.mobywatel.feature.sanitary.presentation.screens.interventionhistory.InterventionHistoryScreen (InterventionHistoryScreen.kt:22)");
            }
            d.a aVarG = g(m7.b.c(dVar.getState(), null, null, null, rVarH, 0, 7));
            if (!(aVarG instanceof d.a.Content)) {
                rVarH.X(1058812958);
                rVarH.R();
                throw new oq.p();
            }
            rVarH.X(1058815558);
            i((d.a.Content) aVarG, rVarH, 0);
            rVarH.R();
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: s23.e
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return j.h(dVar, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final d.a g(f6<? extends d.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(d dVar, int i15, r rVar, int i16) {
        f(dVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void i(final d.a.Content content, r rVar, final int i15) {
        int i16;
        r rVar2;
        r rVarH = rVar.h(-1867225564);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(content) : rVarH.G(content) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(-1867225564, i16, -1, "pl.gov.coi.mobywatel.feature.sanitary.presentation.screens.interventionhistory.InterventionHistoryScreenContent (InterventionHistoryScreen.kt:33)");
            }
            boolean z15 = (i16 & 14) == 4 || ((i16 & 8) != 0 && rVarH.G(content));
            Object objE = rVarH.E();
            if (z15 || objE == r.INSTANCE.a()) {
                objE = new er.a() { // from class: s23.f
                    @Override // er.a
                    public final Object a() {
                        return j.j(content);
                    }
                };
                rVarH.v(objE);
            }
            q0.g(false, (er.a) objE, rVarH, 0, 1);
            final f3 f3VarB = u2.b(0, rVarH, 0, 1);
            rVar2 = rVarH;
            s.r(content.getScaffoldData(), null, null, 0, 0L, null, f3VarB, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(1976819287, true, new q() { // from class: s23.g
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return j.k(f3VarB, content, (d3) obj, (r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVar2, BaseScaffoldData.f89350g, 196608, 32702);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: s23.h
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return j.m(content, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j(d.a.Content content) {
        content.a().a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k(f3 f3Var, final d.a.Content content, d3 d3Var, r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= rVar.W(d3Var) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (t.k()) {
                t.o(1976819287, i15, -1, "pl.gov.coi.mobywatel.feature.sanitary.presentation.screens.interventionhistory.InterventionHistoryScreenContent.<anonymous> (InterventionHistoryScreen.kt:43)");
            }
            f3.m mVarN = t70.s.n(t70.i.S(androidx.compose.foundation.layout.d.f(a3.l(f3.m.INSTANCE, d3Var), 0.0f, 1, null), f3Var, rVar, 0, 0), rVar, 0);
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
            x30.c.c(null, 0.0f, y2.m.d(-1285353120, true, new er.p() { // from class: s23.i
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return j.l(content, (r) obj, ((Integer) obj2).intValue());
                }
            }, rVar, 54), rVar, MLKEMEngine.KyberPolyBytes, 3);
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
    public static final i0 l(d.a.Content content, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(-1285353120, i15, -1, "pl.gov.coi.mobywatel.feature.sanitary.presentation.screens.interventionhistory.InterventionHistoryScreenContent.<anonymous>.<anonymous>.<anonymous> (InterventionHistoryScreen.kt:51)");
            }
            m70.f.g(content.getTimelineData(), rVar, TimelineData.f124016b);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(d.a.Content content, int i15, r rVar, int i16) {
        i(content, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
