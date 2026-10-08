package y33;

import d1.a3;
import d1.d3;
import d1.r3;
import f1.b1;
import f1.y0;
import i50.BaseScaffoldData;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p088nul.q0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n²\u0006\f\u0010\t\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Ly33/c;", "viewModel", "Loq/i0;", "m", "(Ly33/c;Lm2/r;I)V", "Ly33/c$a;", "data", "g", "(Ly33/c$a;Lm2/r;I)V", "state", "sanitary_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class k {
    public static final void g(final c.Data data, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(179008729);
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVarH.G(data) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(179008729, i16, -1, "pl.gov.coi.mobywatel.feature.sanitary.presentation.screens.newreport.typeofreport.TypeOfReportContent (TypeOfReportScreen.kt:38)");
            }
            final y0 y0VarC = b1.c(0, 0, rVarH, 0, 3);
            cb4.i dialogVMSAdapter = data.getDialogVMSAdapter();
            if (dialogVMSAdapter == null) {
                rVarH.X(-1500202816);
            } else {
                rVarH.X(228701025);
                dialogVMSAdapter.b(rVarH, 0);
            }
            rVarH.R();
            i50.s.r(data.getBaseScaffoldData(), null, null, 0, 0L, null, y0VarC, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(2073347212, true, new er.q() { // from class: y33.f
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return k.h(y0VarC, data, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVarH, BaseScaffoldData.f89350g, 196608, 32702);
            rVarH = rVarH;
            boolean zG = rVarH.G(data);
            Object objE = rVarH.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.a() { // from class: y33.g
                    @Override // er.a
                    public final Object a() {
                        return k.k(data);
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
            d5VarM.a(new er.p() { // from class: y33.h
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return k.l(data, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(y0 y0Var, final c.Data data, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(2073347212, i16, -1, "pl.gov.coi.mobywatel.feature.sanitary.presentation.screens.newreport.typeofreport.TypeOfReportContent.<anonymous> (TypeOfReportScreen.kt:47)");
            }
            d3 d3VarD = t70.s.D(rVar, 0);
            f3.m mVarF = androidx.compose.foundation.layout.d.f(a3.l(f3.m.INSTANCE, d3Var), 0.0f, 1, null);
            boolean zG = rVar.G(data);
            Object objE = rVar.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.l() { // from class: y33.i
                    @Override // er.l
                    public final Object b(Object obj) {
                        return k.i(data, (f1.q0) obj);
                    }
                };
                rVar.v(objE);
            }
            f1.d.c(mVarF, y0Var, d3VarD, false, null, null, null, false, null, (er.l) objE, rVar, 0, 504);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(final c.Data data, f1.q0 q0Var) {
        f1.q0.c(q0Var, null, null, y2.m.b(1972168791, true, new er.q() { // from class: y33.j
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return k.j(data, (f1.e) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }), 3, null);
        m30.m.h(q0Var, data.getCards());
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j(c.Data data, f1.e eVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 17) != 16, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1972168791, i15, -1, "pl.gov.coi.mobywatel.feature.sanitary.presentation.screens.newreport.typeofreport.TypeOfReportContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TypeOfReportScreen.kt:55)");
            }
            Label headline = data.getHeadline();
            k70.a aVar = k70.a.f108864a;
            int i16 = k70.a.f108865b;
            j70.h.g(null, null, headline, null, null, aVar.a(rVar, i16).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i16).m(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
            r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, aVar.b(rVar, i16).getSpacing200()), rVar, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k(c.Data data) {
        data.e().a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(c.Data data, int i15, p076m2.r rVar, int i16) {
        g(data, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void m(final c cVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(1704272040);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(cVar) : rVarH.G(cVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1704272040, i16, -1, "pl.gov.coi.mobywatel.feature.sanitary.presentation.screens.newreport.typeofreport.TypeOfReportScreen (TypeOfReportScreen.kt:27)");
            }
            g(n(m7.b.c(cVar.getState(), null, null, null, rVarH, 0, 7)), rVarH, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: y33.e
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return k.o(cVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final c.Data n(f6<c.Data> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o(c cVar, int i15, p076m2.r rVar, int i16) {
        m(cVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
