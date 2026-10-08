package sp3;

import d1.a3;
import d1.d3;
import d1.r3;
import f1.q0;
import i50.BaseScaffoldData;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b²\u0006\f\u0010\n\u001a\u00020\t8\nX\u008a\u0084\u0002"}, d2 = {"Lsp3/j;", "viewModel", "Loq/i0;", "k", "(Lsp3/j;Lm2/r;I)V", "Lsp3/j$a$a;", "data", "f", "(Lsp3/j$a$a;Lm2/r;I)V", "Lsp3/j$a;", "state", "voteidea_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class f {
    public static final void f(final j.a.Initialized initialized, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(-859756311);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(initialized) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-859756311, i16, -1, "pl.gov.coi.mobywatel.feature.voteidea.presentation.screens.results.ResultsInitialized (ResultsScreen.kt:31)");
            }
            rVar2 = rVarH;
            i50.s.r(initialized.getScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-624976420, true, new er.q() { // from class: sp3.b
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return f.g(initialized, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVar2, BaseScaffoldData.f89350g, 196608, 32766);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: sp3.c
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return f.j(initialized, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 g(final j.a.Initialized initialized, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-624976420, i16, -1, "pl.gov.coi.mobywatel.feature.voteidea.presentation.screens.results.ResultsInitialized.<anonymous> (ResultsScreen.kt:36)");
            }
            f3.m mVarL = a3.l(f3.m.INSTANCE, d3Var);
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            f3.m mVarP = a3.p(mVarL, aVar.b(rVar, i17).getSpacing200(), 0.0f, 2, null);
            d1.i.f fVarR = d1.i.f39152a.r(aVar.b(rVar, i17).getSpacing200());
            d3 d3VarI = a3.i(0.0f, aVar.b(rVar, i17).getSpacing100(), 0.0f, aVar.b(rVar, i17).getSpacing200(), 5, null);
            boolean zG = rVar.G(initialized);
            Object objE = rVar.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.l() { // from class: sp3.d
                    @Override // er.l
                    public final Object b(Object obj) {
                        return f.h(initialized, (q0) obj);
                    }
                };
                rVar.v(objE);
            }
            f1.d.c(mVarP, null, d3VarI, false, fVarR, null, null, false, null, (er.l) objE, rVar, 0, 490);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(j.a.Initialized initialized, q0 q0Var) {
        for (final Section section : initialized.a()) {
            q0.c(q0Var, null, null, y2.m.b(-295553383, true, new er.q() { // from class: sp3.e
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return f.i(section, (f1.e) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }), 3, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(Section section, f1.e eVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 17) != 16, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-295553383, i15, -1, "pl.gov.coi.mobywatel.feature.voteidea.presentation.screens.results.ResultsInitialized.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ResultsScreen.kt:48)");
            }
            Label title = section.getTitle();
            k70.a aVar = k70.a.f108864a;
            int i16 = k70.a.f108865b;
            j70.h.g(null, null, title, null, null, aVar.a(rVar, i16).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i16).h(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
            r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, aVar.b(rVar, i16).getSpacing200()), rVar, 0);
            m30.i.d(section.getItems(), null, null, rVar, 0, 6);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j(j.a.Initialized initialized, int i15, p076m2.r rVar, int i16) {
        f(initialized, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void k(final j jVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(833600129);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(jVar) : rVarH.G(jVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(833600129, i16, -1, "pl.gov.coi.mobywatel.feature.voteidea.presentation.screens.results.ResultsScreen (ResultsScreen.kt:22)");
            }
            j.a aVarL = l(m7.b.c(jVar.getState(), null, null, null, rVarH, 0, 7));
            if (fr.t.c(aVarL, j.a.b.f183459a)) {
                rVarH.X(-2069154203);
                rVarH.R();
            } else {
                if (!(aVarL instanceof j.a.Initialized)) {
                    rVarH.X(-2069156346);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(-2069152320);
                f((j.a.Initialized) aVarL, rVarH, 0);
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
            d5VarM.a(new er.p() { // from class: sp3.a
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return f.m(jVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final j.a l(f6<? extends j.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(j jVar, int i15, p076m2.r rVar, int i16) {
        k(jVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
