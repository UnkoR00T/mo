package d22;

import b5.v;
import d1.a3;
import d1.d3;
import d1.e0;
import d1.i;
import d1.m3;
import d1.p3;
import d1.q3;
import d1.r3;
import er.l;
import er.p;
import er.q;
import f1.q0;
import f3.j;
import i50.BaseScaffoldData;
import i50.s;
import j30.ButtonTextData;
import ja.w;
import mx.Label;
import n50.k;
import oq.i0;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.c6;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.t;
import q4.TextLayoutResult;
import q4.TextStyle;
import y2.m;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a%\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\f\u0010\r¨\u0006\u0011²\u0006\f\u0010\u0006\u001a\u00020\u000e8\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0010\u001a\u00020\u000f8\n@\nX\u008a\u008e\u0002"}, d2 = {"Lb22/c;", "viewModel", "Loq/i0;", "m", "(Lb22/c;Lm2/r;I)V", "Lb22/c$a$b;", "data", "Lka/a;", "Ln50/k;", "pagingItems", "h", "(Lb22/c$a$b;Lka/a;Lm2/r;I)V", "p", "(Lb22/c$a$b;Lm2/r;I)V", "Lb22/c$a;", "", "showMoreButton", "electronicdelivery_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class h {
    public static final void h(final b22.c.a.Initialized initialized, final ka.a<k> aVar, r rVar, final int i15) {
        int i16;
        r rVar2;
        r rVarH = rVar.h(1361945403);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(initialized) : rVarH.G(initialized) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= (i15 & 64) == 0 ? rVarH.W(aVar) : rVarH.G(aVar) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (t.k()) {
                t.o(1361945403, i16, -1, "pl.gov.coi.mobywatel.feature.electronicdelivery.presentation.screens.messagewizard.advancedsearchresults.screen.AdvancedSearchResultsContent (AdvancedSearchResultsScreen.kt:53)");
            }
            rVar2 = rVarH;
            s.r(initialized.getBaseScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, m.d(-1473123288, true, new q() { // from class: d22.b
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return h.i(aVar, initialized, (d3) obj, (r) obj2, ((Integer) obj3).intValue());
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
            d5VarM.a(new p() { // from class: d22.c
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return h.l(initialized, aVar, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(final ka.a aVar, final b22.c.a.Initialized initialized, d3 d3Var, r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (t.k()) {
                t.o(-1473123288, i16, -1, "pl.gov.coi.mobywatel.feature.electronicdelivery.presentation.screens.messagewizard.advancedsearchresults.screen.AdvancedSearchResultsContent.<anonymous> (AdvancedSearchResultsScreen.kt:55)");
            }
            if (fr.t.c(aVar.i().getRefresh(), w.Loading.f101205b)) {
                rVar.X(160040461);
                f3.m mVarL = a3.l(f3.m.INSTANCE, d3Var);
                w0 w0VarA = e0.a(i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
                int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
                p076m2.e0 e0VarT = rVar.t();
                f3.m mVarE = j.e(rVar, mVarL);
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
                x70.f.g(x70.a.b.f217282c, rVar, x70.a.b.f217283d);
                rVar.x();
                rVar.R();
            } else {
                rVar.X(160205195);
                k70.a aVar2 = k70.a.f108864a;
                int i17 = k70.a.f108865b;
                d3 d3VarH = a3.h(aVar2.b(rVar, i17).getSpacing200(), aVar2.b(rVar, i17).getSpacing100(), aVar2.b(rVar, i17).getSpacing200(), aVar2.b(rVar, i17).getSpacing200());
                f3.m mVarL2 = a3.l(f3.m.INSTANCE, d3Var);
                boolean zG = rVar.G(initialized) | rVar.G(aVar);
                Object objE = rVar.E();
                if (zG || objE == r.INSTANCE.a()) {
                    objE = new l() { // from class: d22.d
                        @Override // er.l
                        public final Object b(Object obj) {
                            return h.j(aVar, initialized, (q0) obj);
                        }
                    };
                    rVar.v(objE);
                }
                f1.d.c(mVarL2, null, d3VarH, false, null, null, null, false, null, (l) objE, rVar, 0, 506);
                rVar.R();
            }
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j(ka.a aVar, final b22.c.a.Initialized initialized, q0 q0Var) {
        q0.c(q0Var, null, null, m.b(-1661250143, true, new q() { // from class: d22.e
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return h.k(initialized, (f1.e) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }), 3, null);
        m30.q.d(q0Var, aVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k(b22.c.a.Initialized initialized, f1.e eVar, r rVar, int i15) {
        if (rVar.r((i15 & 17) != 16, i15 & 1)) {
            if (t.k()) {
                t.o(-1661250143, i15, -1, "pl.gov.coi.mobywatel.feature.electronicdelivery.presentation.screens.messagewizard.advancedsearchresults.screen.AdvancedSearchResultsContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AdvancedSearchResultsScreen.kt:71)");
            }
            p(initialized, rVar, BaseScaffoldData.f89350g | ButtonTextData.f99099f);
            r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing200()), rVar, 0);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(b22.c.a.Initialized initialized, ka.a aVar, int i15, r rVar, int i16) {
        h(initialized, aVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void m(final b22.c cVar, r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(1330828336);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(cVar) : rVarH.G(cVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(1330828336, i16, -1, "pl.gov.coi.mobywatel.feature.electronicdelivery.presentation.screens.messagewizard.advancedsearchresults.screen.AdvancedSearchResultsScreen (AdvancedSearchResultsScreen.kt:36)");
            }
            f6 f6VarC = m7.b.c(cVar.getState(), null, null, null, rVarH, 0, 7);
            ka.a aVarB = ka.b.b(cVar.z8(), null, rVarH, 0, 1);
            b22.c.a aVarN = n(f6VarC);
            if (aVarN instanceof b22.c.a.Initialized) {
                rVarH.X(-974213592);
                h((b22.c.a.Initialized) aVarN, aVarB, rVarH, ka.a.f109310f << 3);
                rVarH.R();
            } else {
                if (!(aVarN instanceof b22.c.a.Error)) {
                    rVarH.X(-974216146);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(-974208648);
                ((b22.c.a.Error) aVarN).getErrorVMS().b(rVarH, 0);
                rVarH.R();
            }
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: d22.a
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return h.o(cVar, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final b22.c.a n(f6<? extends b22.c.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o(b22.c cVar, int i15, r rVar, int i16) {
        m(cVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private static final void p(final b22.c.a.Initialized initialized, r rVar, final int i15) {
        int i16;
        final p076m2.a3 a3Var;
        r rVarH = rVar.h(-1299166932);
        if ((i15 & 6) == 0) {
            i16 = i15 | ((i15 & 8) == 0 ? rVarH.W(initialized) : rVarH.G(initialized) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(-1299166932, i16, -1, "pl.gov.coi.mobywatel.feature.electronicdelivery.presentation.screens.messagewizard.advancedsearchresults.screen.TopSection (AdvancedSearchResultsScreen.kt:82)");
            }
            Object objE = rVarH.E();
            r.Companion companion = r.INSTANCE;
            if (objE == companion.a()) {
                objE = c6.e(Boolean.FALSE, null, 2, null);
                rVarH.v(objE);
            }
            p076m2.a3 a3Var2 = (p076m2.a3) objE;
            f3.m.Companion companion2 = f3.m.INSTANCE;
            i iVar = i.f39152a;
            i.n nVarK = iVar.k();
            f3.c.Companion companion3 = f3.c.INSTANCE;
            w0 w0VarA = e0.a(nVarK, companion3.k(), rVarH, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            f3.m mVarE = j.e(rVarH, companion2);
            androidx.compose.ui.node.c.Companion companion4 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion4.b();
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
            n6.i(rVarC, w0VarA, companion4.d());
            n6.i(rVarC, e0VarT, companion4.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion4.c());
            n6.g(rVarC, companion4.a());
            n6.i(rVarC, mVarE, companion4.e());
            d1.i0 i0Var = d1.i0.f39176a;
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            j70.h.g(null, null, initialized.getHeaderText(), null, null, aVar.a(rVarH, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i17).j(), null, null, false, false, null, rVarH, 0, 0, 0, 33030107);
            r3.a(androidx.compose.foundation.layout.d.i(companion2, aVar.b(rVarH, i17).getSpacing100()), rVarH, 0);
            w0 w0VarB = m3.b(iVar.j(), companion3.l(), rVarH, 0);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT2 = rVarH.t();
            f3.m mVarE2 = j.e(rVarH, companion2);
            er.a<androidx.compose.ui.node.c> aVarB2 = companion4.b();
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
            n6.i(rVarC2, w0VarB, companion4.d());
            n6.i(rVarC2, e0VarT2, companion4.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion4.c());
            n6.g(rVarC2, companion4.a());
            n6.i(rVarC2, mVarE2, companion4.e());
            f3.m mVarC = p3.c(q3.f39261a, companion2, 1.0f, false, 2, null);
            int iB = v.INSTANCE.b();
            TextStyle textStyleD = aVar.f(rVarH, i17).d();
            long jB = aVar.a(rVarH, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b();
            Label queryDescription = initialized.getQueryDescription();
            Object objE2 = rVarH.E();
            if (objE2 == companion.a()) {
                a3Var = a3Var2;
                objE2 = new l() { // from class: d22.f
                    @Override // er.l
                    public final Object b(Object obj) {
                        return h.s(a3Var, (TextLayoutResult) obj);
                    }
                };
                rVarH.v(objE2);
            } else {
                a3Var = a3Var2;
            }
            j70.h.g(mVarC, null, queryDescription, null, null, jB, 0L, null, null, null, 0L, null, null, 0L, iB, false, 1, 0, (l) objE2, textStyleD, null, null, false, false, null, rVarH, 0, 102260736, 0, 32686042);
            rVarH = rVarH;
            if (q(a3Var)) {
                rVarH.X(-84923436);
                r3.a(androidx.compose.foundation.layout.d.y(companion2, aVar.b(rVarH, i17).getSpacing100()), rVarH, 0);
                j30.f.e(null, initialized.getMoreButton(), false, rVarH, ButtonTextData.f99099f << 3, 5);
            } else {
                rVarH.X(-89005764);
            }
            rVarH.R();
            rVarH.x();
            rVarH.x();
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: d22.g
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return h.t(initialized, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final boolean q(p076m2.a3<Boolean> a3Var) {
        return a3Var.getValue().booleanValue();
    }

    private static final void r(p076m2.a3<Boolean> a3Var, boolean z15) {
        a3Var.setValue(Boolean.valueOf(z15));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s(p076m2.a3 a3Var, TextLayoutResult textLayoutResult) {
        r(a3Var, textLayoutResult.i());
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t(b22.c.a.Initialized initialized, int i15, r rVar, int i16) {
        p(initialized, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
