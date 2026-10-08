package d23;

import d1.a3;
import d1.d3;
import d1.e0;
import d1.h0;
import d1.r3;
import er.p;
import er.q;
import i50.BaseScaffoldData;
import i50.s;
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
import t40.InfoRowListData;
import w0.i1;
import w0.q0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Ld23/c;", "viewModel", "Loq/i0;", "e", "(Ld23/c;Lm2/r;I)V", "Ld23/c$a;", "screenData", "h", "(Ld23/c$a;Lm2/r;I)V", "safetyguide_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class h {
    public static final void e(final c cVar, r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(1510314506);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(cVar) : rVarH.G(cVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(1510314506, i16, -1, "pl.gov.coi.mobywatel.feature.safetyguide.presentation.rules.SafetyGuideRulesScreen (SafetyGuideRulesScreen.kt:29)");
            }
            h(f(m7.b.c(cVar.getState(), null, null, null, rVarH, 0, 7)), rVarH, BaseScaffoldData.f89350g | InfoRowListData.f187643b);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: d23.d
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return h.g(cVar, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final c.Data f(f6<c.Data> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 g(c cVar, int i15, r rVar, int i16) {
        e(cVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void h(final c.Data data, r rVar, final int i15) {
        int i16;
        r rVar2;
        r rVarH = rVar.h(-1613414201);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(data) : rVarH.G(data) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(-1613414201, i16, -1, "pl.gov.coi.mobywatel.feature.safetyguide.presentation.rules.SafetyGuideRulesScreenContent (SafetyGuideRulesScreen.kt:35)");
            }
            rVar2 = rVarH;
            s.r(data.getBaseScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(1085731706, true, new q() { // from class: d23.e
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return h.i(data, (d3) obj, (r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVar2, BaseScaffoldData.f89350g, 196608, 32766);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: d23.f
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return h.k(data, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(final c.Data data, d3 d3Var, r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= rVar.W(d3Var) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (t.k()) {
                t.o(1085731706, i15, -1, "pl.gov.coi.mobywatel.feature.safetyguide.presentation.rules.SafetyGuideRulesScreenContent.<anonymous> (SafetyGuideRulesScreen.kt:39)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarC = q0.c(t70.s.n(t70.i.S(a3.l(companion, d3Var), null, rVar, 0, 1), rVar, 0), true, null, 2, null);
            w0 w0VarA = e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarC);
            androidx.compose.ui.node.c.Companion companion2 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion2.b();
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
            n6.i(rVarC, w0VarA, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
            n6.g(rVarC, companion2.a());
            n6.i(rVarC, mVarE, companion2.e());
            final d1.i0 i0Var = d1.i0.f39176a;
            x30.c.c(null, 0.0f, y2.m.d(598203907, true, new p() { // from class: d23.g
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return h.j(i0Var, data, (r) obj, ((Integer) obj2).intValue());
                }
            }, rVar, 54), rVar, MLKEMEngine.KyberPolyBytes, 3);
            r3.a(androidx.compose.foundation.layout.d.i(companion, k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing300()), rVar, 0);
            s40.g.c(data.getInfoRowListData(), 0.0f, rVar, InfoRowListData.f187643b, 2);
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
    public static final i0 j(h0 h0Var, c.Data data, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(598203907, i15, -1, "pl.gov.coi.mobywatel.feature.safetyguide.presentation.rules.SafetyGuideRulesScreenContent.<anonymous>.<anonymous>.<anonymous> (SafetyGuideRulesScreen.kt:47)");
            }
            i1.c(l4.c.c(data.getImageResId(), rVar, 0), null, h0Var.c(a3.n(androidx.compose.foundation.layout.d.f(f3.m.INSTANCE, 0.0f, 1, null), k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing100()), f3.c.INSTANCE.g()), null, p036e4.l.INSTANCE.d(), 0.0f, null, rVar, androidx.compose.ui.graphics.painter.a.f9956g | 24624, 104);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k(c.Data data, int i15, r rVar, int i16) {
        h(data, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
