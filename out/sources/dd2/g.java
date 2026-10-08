package dd2;

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
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.t;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Ldd2/c;", "viewModel", "Loq/i0;", "d", "(Ldd2/c;Lm2/r;I)V", "Ldd2/c$a;", "data", "g", "(Ldd2/c$a;Lm2/r;I)V", "identitycardsuspension_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class g {
    public static final void d(final c cVar, r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(-1394337458);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(cVar) : rVarH.G(cVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(-1394337458, i16, -1, "pl.gov.coi.mobywatel.feature.identitycardsuspension.presentation.summary.SummaryScreen (SummaryScreen.kt:24)");
            }
            g(e(m7.b.c(cVar.getState(), null, null, null, rVarH, 0, 7)), rVarH, BaseScaffoldData.f89350g | c30.b.f22944i);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: dd2.d
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return g.f(cVar, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final c.Data e(f6<c.Data> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(c cVar, int i15, r rVar, int i16) {
        d(cVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private static final void g(final c.Data data, r rVar, final int i15) {
        int i16;
        r rVar2;
        r rVarH = rVar.h(1309943371);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(data) : rVarH.G(data) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(1309943371, i16, -1, "pl.gov.coi.mobywatel.feature.identitycardsuspension.presentation.summary.SummaryScreenContent (SummaryScreen.kt:32)");
            }
            rVar2 = rVarH;
            s.r(data.getScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-1814600, true, new q() { // from class: dd2.e
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return g.h(data, (d3) obj, (r) obj2, ((Integer) obj3).intValue());
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
            d5VarM.a(new p() { // from class: dd2.f
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return g.i(data, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(c.Data data, d3 d3Var, r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (t.k()) {
                t.o(-1814600, i16, -1, "pl.gov.coi.mobywatel.feature.identitycardsuspension.presentation.summary.SummaryScreenContent.<anonymous> (SummaryScreen.kt:34)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarL = a3.l(androidx.compose.foundation.layout.d.f(companion, 0.0f, 1, null), d3Var);
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            f3.m mVarQ = a3.q(mVarL, aVar.b(rVar, i17).getSpacing200(), aVar.b(rVar, i17).getSpacing100(), aVar.b(rVar, i17).getSpacing200(), aVar.b(rVar, i17).getSpacing200());
            d1.i iVar = d1.i.f39152a;
            d1.i.n nVarK = iVar.k();
            f3.c.Companion companion2 = f3.c.INSTANCE;
            w0 w0VarA = e0.a(nVarK, companion2.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarQ);
            androidx.compose.ui.node.c.Companion companion3 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion3.b();
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
            n6.i(rVarC, w0VarA, companion3.d());
            n6.i(rVarC, e0VarT, companion3.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion3.c());
            n6.g(rVarC, companion3.a());
            n6.i(rVarC, mVarE, companion3.e());
            f3.m mVarS = t70.i.S(h0.b(d1.i0.f39176a, companion, 1.0f, false, 2, null), null, rVar, 0, 1);
            w0 w0VarA2 = e0.a(iVar.k(), companion2.k(), rVar, 0);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT2 = rVar.t();
            f3.m mVarE2 = f3.j.e(rVar, mVarS);
            er.a<androidx.compose.ui.node.c> aVarB2 = companion3.b();
            if (rVar.l() == null) {
                p076m2.m.d();
            }
            rVar.K();
            if (rVar.getInserting()) {
                rVar.H(aVarB2);
            } else {
                rVar.u();
            }
            r rVarC2 = n6.c(rVar);
            n6.i(rVarC2, w0VarA2, companion3.d());
            n6.i(rVarC2, e0VarT2, companion3.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion3.c());
            n6.g(rVarC2, companion3.a());
            n6.i(rVarC2, mVarE2, companion3.e());
            j70.h.g(null, null, data.getTitle(), null, null, aVar.a(rVar, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i17).i(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing100()), rVar, 0);
            j70.h.g(null, null, data.getDescription(), null, null, aVar.a(rVar, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i17).d(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing200()), rVar, 0);
            m30.i.d(data.getCardsData(), null, null, rVar, 0, 6);
            if (data.getAlertData() == null) {
                rVar.X(1830692644);
            } else {
                rVar.X(1830692645);
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing200()), rVar, 0);
                c30.e.c(null, data.getAlertData(), rVar, c30.b.f22944i << 3, 1);
            }
            rVar.R();
            rVar.x();
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing200()), rVar, 0);
            h30.q.p(data.getButtonData(), false, null, rVar, 0, 6);
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
    public static final i0 i(c.Data data, int i15, r rVar, int i16) {
        g(data, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
