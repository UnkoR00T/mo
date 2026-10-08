package is1;

import d1.a3;
import d1.e0;
import d1.r3;
import er.p;
import f3.m;
import oq.i0;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.t;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lis1/b;", "viewModel", "Loq/i0;", "c", "(Lis1/b;Lm2/r;I)V", "Lis1/b$a;", "data", "f", "(Lis1/b$a;Lm2/r;I)V", "developer_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class e {
    public static final void c(final b bVar, r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(-247252512);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(bVar) : rVarH.G(bVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(-247252512, i16, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.shared.summary.DeveloperSummaryScreen (DeveloperSummaryScreen.kt:19)");
            }
            f(d(m7.b.c(bVar.getState(), null, null, null, rVarH, 0, 7)), rVarH, 0);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: is1.c
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return e.e(bVar, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final b.Data d(f6<b.Data> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 e(b bVar, int i15, r rVar, int i16) {
        c(bVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private static final void f(final b.Data data, r rVar, final int i15) {
        int i16;
        r rVar2;
        r rVarH = rVar.h(1563702339);
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVarH.W(data) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(1563702339, i16, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.shared.summary.DeveloperSummaryScreenContent (DeveloperSummaryScreen.kt:25)");
            }
            m.Companion companion = m.INSTANCE;
            m mVarH = androidx.compose.foundation.layout.d.h(companion, 0.0f, 1, null);
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            m mVarR = a3.r(w0.i.d(mVarH, aVar.a(rVarH, i17).getBase().a(), null, 2, null), 0.0f, aVar.b(rVarH, i17).getSpacing700(), 0.0f, 0.0f, 13, null);
            d1.i iVar = d1.i.f39152a;
            d1.i.n nVarK = iVar.k();
            f3.c.Companion companion2 = f3.c.INSTANCE;
            w0 w0VarA = e0.a(nVarK, companion2.k(), rVarH, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            m mVarE = f3.j.e(rVarH, mVarR);
            androidx.compose.ui.node.c.Companion companion3 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion3.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB);
            } else {
                rVarH.u();
            }
            r rVarC = n6.c(rVarH);
            n6.i(rVarC, w0VarA, companion3.d());
            n6.i(rVarC, e0VarT, companion3.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion3.c());
            n6.g(rVarC, companion3.a());
            n6.i(rVarC, mVarE, companion3.e());
            d1.i0 i0Var = d1.i0.f39176a;
            m mVarF = androidx.compose.foundation.layout.d.f(a3.n(w0.i.d(companion, aVar.a(rVarH, i17).getBase().a(), null, 2, null), aVar.b(rVarH, i17).getSpacing200()), 0.0f, 1, null);
            w0 w0VarA2 = e0.a(iVar.k(), companion2.g(), rVarH, 48);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT2 = rVarH.t();
            m mVarE2 = f3.j.e(rVarH, mVarF);
            er.a<androidx.compose.ui.node.c> aVarB2 = companion3.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB2);
            } else {
                rVarH.u();
            }
            r rVarC2 = n6.c(rVarH);
            n6.i(rVarC2, w0VarA2, companion3.d());
            n6.i(rVarC2, e0VarT2, companion3.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion3.c());
            n6.g(rVarC2, companion3.a());
            n6.i(rVarC2, mVarE2, companion3.e());
            rVar2 = rVarH;
            j70.h.g(null, null, mx.b.b("Data from first step:", ""), null, null, aVar.a(rVarH, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i17).j(), null, null, false, false, null, rVar2, 0, 0, 0, 33030107);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar2, i17).getSpacing100()), rVar2, 0);
            j70.h.g(null, null, data.getFirstLabel(), null, null, aVar.a(rVar2, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar2, i17).b(), null, null, false, false, null, rVar2, 0, 0, 0, 33030107);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar2, i17).getSpacing300()), rVar2, 0);
            j70.h.g(null, null, mx.b.b("Data from second step:", ""), null, null, aVar.a(rVar2, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar2, i17).j(), null, null, false, false, null, rVar2, 0, 0, 0, 33030107);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar2, i17).getSpacing100()), rVar2, 0);
            j70.h.g(null, null, data.getSecond1Label(), null, null, aVar.a(rVar2, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar2, i17).d(), null, null, false, false, null, rVar2, 0, 0, 0, 33030107);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar2, i17).getSpacing100()), rVar2, 0);
            j70.h.g(null, null, data.getSecond2Label(), null, null, aVar.a(rVar2, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar2, i17).d(), null, null, false, false, null, rVar2, 0, 0, 0, 33030107);
            rVar2.x();
            rVar2.x();
            if (t.k()) {
                t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: is1.d
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return e.g(data, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 g(b.Data data, int i15, r rVar, int i16) {
        f(data, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
