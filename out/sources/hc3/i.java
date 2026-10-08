package hc3;

import d1.a3;
import d1.d3;
import d1.e0;
import d1.r3;
import er.q;
import i50.BaseScaffoldData;
import i50.s;
import java.io.IOException;
import java.util.List;
import n50.h0;
import oq.i0;
import org.xmlpull.v1.XmlPullParserException;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.t;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lhc3/e;", "viewModel", "Loq/i0;", "g", "(Lhc3/e;Lm2/r;I)V", "Lhc3/e$a;", "data", "d", "(Lhc3/e$a;Lm2/r;I)V", "travelabroad_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class i {
    private static final void d(final e.Data data, r rVar, final int i15) {
        int i16;
        r rVar2;
        r rVarH = rVar.h(-12367989);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(data) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(-12367989, i16, -1, "pl.gov.coi.mobywatel.feature.travelabroad.presentation.welcome.WelcomeContent (WelcomeScreen.kt:34)");
            }
            rVar2 = rVarH;
            s.r(data.getScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-1268389128, true, new q() { // from class: hc3.g
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return i.e(data, (d3) obj, (r) obj2, ((Integer) obj3).intValue());
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
            d5VarM.a(new er.p() { // from class: hc3.h
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i.f(data, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 e(e.Data data, d3 d3Var, r rVar, int i15) throws XmlPullParserException, IOException {
        if ((i15 & 6) == 0) {
            i15 |= rVar.W(d3Var) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (t.k()) {
                t.o(-1268389128, i15, -1, "pl.gov.coi.mobywatel.feature.travelabroad.presentation.welcome.WelcomeContent.<anonymous> (WelcomeScreen.kt:36)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarN = t70.s.n(t70.i.S(a3.l(companion, d3Var), null, rVar, 0, 1), rVar, 0);
            d1.i iVar = d1.i.f39152a;
            k70.a aVar = k70.a.f108864a;
            int i16 = k70.a.f108865b;
            w0 w0VarA = e0.a(iVar.r(aVar.b(rVar, i16).getSpacing100()), f3.c.INSTANCE.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarN);
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
            d1.i0 i0Var = d1.i0.f39176a;
            o40.j.i(data.getHeader(), rVar, 0);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i16).getSpacing200()), rVar, 0);
            rVar.X(-1374785553);
            List<n50.k> listA = data.a();
            int size = listA.size();
            for (int i17 = 0; i17 < size; i17++) {
                h0.v(listA.get(i17), null, rVar, 0, 2);
            }
            rVar.R();
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
    public static final i0 f(e.Data data, int i15, r rVar, int i16) {
        d(data, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void g(final e eVar, r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(2042062810);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(eVar) : rVarH.G(eVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(2042062810, i16, -1, "pl.gov.coi.mobywatel.feature.travelabroad.presentation.welcome.WelcomeScreen (WelcomeScreen.kt:26)");
            }
            d(h(m7.b.c(eVar.getState(), null, null, null, rVarH, 0, 7)), rVarH, 0);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: hc3.f
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i.i(eVar, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final e.Data h(f6<e.Data> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(e eVar, int i15, r rVar, int i16) {
        g(eVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
