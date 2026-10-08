package sy0;

import d1.a3;
import d1.d3;
import d1.r3;
import f1.y0;
import i50.BaseScaffoldData;
import mx.Label;
import n50.DefaultSingleCardData;
import n50.SingleCardConfig;
import n50.h0;
import oq.i0;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.e0;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p088nul.q0;
import p144z20.Function2;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n²\u0006\f\u0010\u0006\u001a\u00020\t8\nX\u008a\u0084\u0002"}, d2 = {"Lsy0/e;", "viewModel", "Loq/i0;", "i", "(Lsy0/e;Lm2/r;I)V", "Lsy0/e$a$b;", "state", "l", "(Lsy0/e$a$b;Lm2/r;I)V", "Lsy0/e$a;", "airquality_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class n {
    public static final void i(final e eVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(802463110);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(eVar) : rVarH.G(eVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(802463110, i16, -1, "pl.gov.coi.mobywatel.feature.airquality.presentation.screens.editfavoritepoints.EditFavoritePointsScreen (EditFavoritePointsScreen.kt:32)");
            }
            e.a aVarJ = j(m7.b.c(eVar.getState(), null, null, null, rVarH, 0, 7));
            if (fr.t.c(aVarJ, e.a.C4795a.f185588a)) {
                rVarH.X(-1927057673);
                c60.b.b(rVarH, 0);
                rVarH.R();
            } else {
                if (!(aVarJ instanceof e.a.Initialized)) {
                    rVarH.X(-1927059875);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(-1927055260);
                l((e.a.Initialized) aVarJ, rVarH, 0);
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
            d5VarM.a(new er.p() { // from class: sy0.f
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return n.k(eVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final e.a j(f6<? extends e.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k(e eVar, int i15, p076m2.r rVar, int i16) {
        i(eVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private static final void l(final e.a.Initialized initialized, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(1754020068);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(initialized) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1754020068, i16, -1, "pl.gov.coi.mobywatel.feature.airquality.presentation.screens.editfavoritepoints.EditFavoritePointsScreenInitialized (EditFavoritePointsScreen.kt:43)");
            }
            i50.s.r(initialized.getBaseScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-1854820015, true, new er.q() { // from class: sy0.g
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return n.m(initialized, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVarH, BaseScaffoldData.f89350g, 196608, 32766);
            rVarH = rVarH;
            q0.g(false, initialized.b(), rVarH, 0, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: sy0.h
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return n.s(initialized, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(final e.a.Initialized initialized, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1854820015, i16, -1, "pl.gov.coi.mobywatel.feature.airquality.presentation.screens.editfavoritepoints.EditFavoritePointsScreenInitialized.<anonymous> (EditFavoritePointsScreen.kt:47)");
            }
            boolean zG = rVar.G(initialized);
            Object objE = rVar.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.p() { // from class: sy0.i
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return n.n(initialized, ((Integer) obj).intValue(), ((Integer) obj2).intValue());
                    }
                };
                rVar.v(objE);
            }
            final p144z20.c cVarA = Function2.a((er.p) objE, rVar, 0);
            f3.m mVarL = a3.l(f3.m.INSTANCE, d3Var);
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            f3.m mVarG = t70.s.G(androidx.compose.foundation.layout.d.d(a3.p(mVarL, aVar.b(rVar, i17).getSpacing200(), 0.0f, 2, null), 0.0f, 1, null), cVarA, rVar, p144z20.c.f232335g << 3);
            d3 d3VarI = a3.i(0.0f, aVar.b(rVar, i17).getSpacing100(), 0.0f, aVar.b(rVar, i17).getSpacing200(), 5, null);
            y0 lazyListState = cVarA.getLazyListState();
            boolean zG2 = rVar.G(initialized) | rVar.G(cVarA);
            Object objE2 = rVar.E();
            if (zG2 || objE2 == p076m2.r.INSTANCE.a()) {
                objE2 = new er.l() { // from class: sy0.j
                    @Override // er.l
                    public final Object b(Object obj) {
                        return n.o(initialized, cVarA, (f1.q0) obj);
                    }
                };
                rVar.v(objE2);
            }
            f1.d.c(mVarG, lazyListState, d3VarI, false, null, null, null, false, null, (er.l) objE2, rVar, 0, 504);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n(e.a.Initialized initialized, int i15, int i16) {
        initialized.e().B(Integer.valueOf(i15), Integer.valueOf(i16));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o(final e.a.Initialized initialized, final p144z20.c cVar, f1.q0 q0Var) {
        f1.q0.c(q0Var, null, null, y2.m.b(-1505982810, true, new er.q() { // from class: sy0.k
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return n.p(initialized, (f1.e) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }), 3, null);
        f1.q0.c(q0Var, null, null, b.f185567a.b(), 3, null);
        p144z20.b.b(q0Var, initialized.d(), y2.m.b(1947957766, true, new er.r() { // from class: sy0.l
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return n.q(initialized, cVar, (f3.m) obj, (DefaultSingleCardData) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), cVar, null);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p(e.a.Initialized initialized, f1.e eVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 17) != 16, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1505982810, i15, -1, "pl.gov.coi.mobywatel.feature.airquality.presentation.screens.editfavoritepoints.EditFavoritePointsScreenInitialized.<anonymous>.<anonymous>.<anonymous>.<anonymous> (EditFavoritePointsScreen.kt:68)");
            }
            Label headerLabel = initialized.getHeaderLabel();
            k70.a aVar = k70.a.f108864a;
            int i16 = k70.a.f108865b;
            j70.h.g(null, null, headerLabel, null, null, aVar.a(rVar, i16).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i16).d(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
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
    public static final i0 q(final e.a.Initialized initialized, p144z20.c cVar, f3.m mVar, DefaultSingleCardData defaultSingleCardData, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(mVar) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVar.W(defaultSingleCardData) ? 32 : 16;
        }
        int i17 = i16;
        if (rVar.r((i17 & 147) != 146, i17 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1947957766, i17, -1, "pl.gov.coi.mobywatel.feature.airquality.presentation.screens.editfavoritepoints.EditFavoritePointsScreenInitialized.<anonymous>.<anonymous>.<anonymous>.<anonymous> (EditFavoritePointsScreen.kt:80)");
            }
            w0 w0VarI = d1.r.i(f3.c.INSTANCE.o(), false);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVar);
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
            p076m2.r rVarC = n6.c(rVar);
            n6.i(rVarC, w0VarI, companion.d());
            n6.i(rVarC, e0VarT, companion.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
            n6.g(rVarC, companion.a());
            n6.i(rVarC, mVarE, companion.e());
            d1.x xVar = d1.x.f39368a;
            f3.m.Companion companion2 = f3.m.INSTANCE;
            int iIndexOf = initialized.d().indexOf(defaultSingleCardData);
            int size = initialized.d().size();
            boolean z15 = cVar.c() != null;
            String text = a0.a(defaultSingleCardData).getText();
            boolean zG = rVar.G(initialized);
            Object objE = rVar.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.p() { // from class: sy0.m
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return n.r(initialized, ((Integer) obj).intValue(), ((Integer) obj2).intValue());
                    }
                };
                rVar.v(objE);
            }
            h0.v(defaultSingleCardData, new SingleCardConfig(t70.i.m(companion2, iIndexOf, size, z15, text, (er.p) objE, rVar, 6), false, 2, null), rVar, ((i17 >> 3) & 14) | (SingleCardConfig.f132071c << 3), 0);
            rVar.x();
            r3.a(androidx.compose.foundation.layout.d.i(companion2, k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing100()), rVar, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r(e.a.Initialized initialized, int i15, int i16) {
        initialized.e().B(Integer.valueOf(i15), Integer.valueOf(i16));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s(e.a.Initialized initialized, int i15, p076m2.r rVar, int i16) {
        l(initialized, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
