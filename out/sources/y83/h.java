package y83;

import d1.a3;
import d1.d3;
import d1.e0;
import er.p;
import er.q;
import i50.BaseScaffoldData;
import i50.s;
import mx.Label;
import oq.i0;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.t;
import t40.InfoRowListData;
import x40.LinkData;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Ly83/e;", "viewModel", "Loq/i0;", "c", "(Ly83/e;Lm2/r;I)V", "Ly83/e$a;", "data", "technicalsupport_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class h {
    public static final void c(final e eVar, r rVar, final int i15) {
        int i16;
        r rVar2;
        r rVarH = rVar.h(770805281);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(eVar) : rVarH.G(eVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(770805281, i16, -1, "pl.gov.coi.mobywatel.feature.technicalsupport.presentation.screens.reportinfopage.ReportInfoPageScreen (ReportInfoPageScreen.kt:25)");
            }
            final f6 f6VarC = m7.b.c(eVar.getState(), null, null, null, rVarH, 0, 7);
            rVar2 = rVarH;
            s.r(d(f6VarC).getBaseScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(1878358740, true, new q() { // from class: y83.f
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return h.e(f6VarC, (d3) obj, (r) obj2, ((Integer) obj3).intValue());
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
            d5VarM.a(new p() { // from class: y83.g
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return h.f(eVar, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final e.Data d(f6<e.Data> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 e(f6 f6Var, d3 d3Var, r rVar, int i15) {
        int i16;
        r rVar2 = rVar;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar2.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar2.r((i16 & 19) != 18, i16 & 1)) {
            if (t.k()) {
                t.o(1878358740, i16, -1, "pl.gov.coi.mobywatel.feature.technicalsupport.presentation.screens.reportinfopage.ReportInfoPageScreen.<anonymous> (ReportInfoPageScreen.kt:31)");
            }
            f3.m mVarN = t70.s.n(t70.i.S(a3.l(f3.m.INSTANCE, d3Var), null, rVar2, 0, 1), rVar2, 0);
            d1.i iVar = d1.i.f39152a;
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            w0 w0VarA = e0.a(iVar.r(aVar.b(rVar2, i17).getSpacing200()), f3.c.INSTANCE.k(), rVar2, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar2, 0));
            p076m2.e0 e0VarT = rVar2.t();
            f3.m mVarE = f3.j.e(rVar2, mVarN);
            androidx.compose.ui.node.c.Companion companion = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion.b();
            if (rVar2.l() == null) {
                p076m2.m.d();
            }
            rVar2.K();
            if (rVar2.getInserting()) {
                rVar2.H(aVarB);
            } else {
                rVar2.u();
            }
            r rVarC = n6.c(rVar2);
            n6.i(rVarC, w0VarA, companion.d());
            n6.i(rVarC, e0VarT, companion.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
            n6.g(rVarC, companion.a());
            n6.i(rVarC, mVarE, companion.e());
            d1.i0 i0Var = d1.i0.f39176a;
            Label header = d(f6Var).getHeader();
            if (header == null) {
                rVar2.X(1730231102);
            } else {
                rVar2.X(1730231103);
                j70.h.g(null, null, header, null, null, aVar.a(rVar2, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, b5.j.h(b5.j.INSTANCE.f()), 0L, 0, false, 0, 0, null, aVar.f(rVar2, i17).i(), null, null, false, false, null, rVar, 0, 0, 0, 33026011);
                rVar2 = rVar;
            }
            rVar2.R();
            InfoRowListData infoRowList = d(f6Var).getInfoRowList();
            if (infoRowList == null) {
                rVar2.X(1730478730);
            } else {
                rVar2.X(1730478731);
                s40.g.c(infoRowList, 0.0f, rVar2, InfoRowListData.f187643b, 2);
            }
            rVar2.R();
            LinkData linkButton = d(f6Var).getLinkButton();
            if (linkButton == null) {
                rVar2.X(1730590547);
            } else {
                rVar2.X(1730590548);
                x40.h.g(linkButton, rVar2, LinkData.f216731g);
            }
            rVar2.R();
            rVar2.x();
            if (t.k()) {
                t.n();
            }
        } else {
            rVar2.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(e eVar, int i15, r rVar, int i16) {
        c(eVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
