package hc0;

import d1.a3;
import d1.d3;
import d1.e0;
import d1.r3;
import er.p;
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
import p088nul.q0;
import t40.InfoRowListData;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lhc0/g;", "viewModel", "Loq/i0;", "d", "(Lhc0/g;Lm2/r;I)V", "Lhc0/g$a;", "state", "infopage_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class d {
    public static final void d(final g gVar, r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(-469809728);
        if ((i15 & 6) == 0) {
            i16 = i15 | ((i15 & 8) == 0 ? rVarH.W(gVar) : rVarH.G(gVar) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(-469809728, i16, -1, "pl.gov.coi.mjunior.feature.infopage.presentation.screen.InfoPageScreen (InfoPageScreen.kt:27)");
            }
            final f6 f6VarC = m7.b.c(gVar.getState(), null, null, null, rVarH, 0, 7);
            s.r(e(f6VarC).getScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(1567883443, true, new q() { // from class: hc0.a
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return d.f(f6VarC, (d3) obj, (r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVarH, BaseScaffoldData.f89350g, 196608, 32766);
            rVarH = rVarH;
            boolean zW = rVarH.W(f6VarC);
            Object objE = rVarH.E();
            if (zW || objE == r.INSTANCE.a()) {
                objE = new er.a() { // from class: hc0.b
                    @Override // er.a
                    public final Object a() {
                        return d.g(f6VarC);
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
            d5VarM.a(new p() { // from class: hc0.c
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return d.h(gVar, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final g.Data e(f6<g.Data> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(f6 f6Var, d3 d3Var, r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (t.k()) {
                t.o(1567883443, i16, -1, "pl.gov.coi.mjunior.feature.infopage.presentation.screen.InfoPageScreen.<anonymous> (InfoPageScreen.kt:32)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarN = t70.s.n(a3.l(androidx.compose.foundation.layout.d.f(t70.i.S(companion, null, rVar, 6, 1), 0.0f, 1, null), d3Var), rVar, 0);
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            f3.m mVarD = w0.i.d(mVarN, aVar.a(rVar, i17).getBase().a(), null, 2, null);
            w0 w0VarA = e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarD);
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
            j70.h.g(null, null, e(f6Var).getTitle(), null, null, aVar.a(rVar, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i17).g(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing300()), rVar, 0);
            s40.g.c(e(f6Var).getInfoRowListData(), 0.0f, rVar, InfoRowListData.f187643b, 2);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing200()), rVar, 0);
            j70.h.g(null, null, e(f6Var).getDescription(), null, null, aVar.a(rVar, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i17).b(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
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
    public static final i0 g(f6 f6Var) {
        e(f6Var).c().a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(g gVar, int i15, r rVar, int i16) {
        d(gVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
