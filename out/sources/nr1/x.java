package nr1;

import d1.a3;
import d1.d3;
import d1.r3;
import f1.b1;
import f1.y0;
import i50.BaseScaffoldData;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p088nul.q0;
import u60.PagingListData;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\t\u0010\n\u001a\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u000bH\u0003¢\u0006\u0004\b\f\u0010\r\u001a\u000f\u0010\u000e\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0012²\u0006\f\u0010\u0011\u001a\u00020\u00108\nX\u008a\u0084\u0002"}, d2 = {"Lnr1/m;", "viewModel", "Loq/i0;", "i", "(Lnr1/m;Lm2/r;I)V", "Lnr1/m$a$a;", "data", "Lf1/y0;", "lazyListState", "r", "(Lnr1/m$a$a;Lf1/y0;Lm2/r;I)V", "Lnr1/m$a$b;", "l", "(Lnr1/m$a$b;Lm2/r;I)V", "p", "(Lm2/r;I)V", "Lnr1/m$a;", "state", "developer_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class x {
    public static final void i(final m mVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(386707697);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(mVar) : rVarH.G(mVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(386707697, i16, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.paging.DeveloperPagingScreen (DeveloperPagingScreen.kt:34)");
            }
            f6 f6VarC = m7.b.c(mVar.getState(), null, null, null, rVarH, 0, 7);
            y0 y0VarC = b1.c(0, 0, rVarH, 0, 3);
            m.a aVarJ = j(f6VarC);
            if (fr.t.c(aVarJ, m.a.d.f137951a)) {
                rVarH.X(-2036049631);
                p(rVarH, 0);
                rVarH.R();
            } else if (aVarJ instanceof m.a.Empty) {
                rVarH.X(-2036047568);
                l((m.a.Empty) aVarJ, rVarH, 0);
                rVarH.R();
            } else if (aVarJ instanceof m.a.Content) {
                rVarH.X(-2036044925);
                r((m.a.Content) aVarJ, y0VarC, rVarH, 0);
                rVarH.R();
            } else {
                if (!(aVarJ instanceof m.a.Error)) {
                    rVarH.X(-2036051760);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(-2036040263);
                ((m.a.Error) aVarJ).getError().b(rVarH, 0);
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
            d5VarM.a(new er.p() { // from class: nr1.p
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return x.k(mVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final m.a j(f6<? extends m.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 k(m mVar, int i15, p076m2.r rVar, int i16) {
        i(mVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void l(final m.a.Empty empty, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(-1090739584);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(empty) : rVarH.G(empty) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1090739584, i16, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.paging.EmptyContent (DeveloperPagingScreen.kt:80)");
            }
            rVar2 = rVarH;
            i50.s.r(empty.getBaseScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-1461408781, true, new er.q() { // from class: nr1.t
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return x.m(empty, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
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
            d5VarM.a(new er.p() { // from class: nr1.u
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return x.o(empty, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 m(final m.a.Empty empty, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1461408781, i16, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.paging.EmptyContent.<anonymous> (DeveloperPagingScreen.kt:84)");
            }
            f3.m mVarF = androidx.compose.foundation.layout.d.f(a3.l(f3.m.INSTANCE, d3Var), 0.0f, 1, null);
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            f3.m mVarD = w0.i.d(a3.r(mVarF, 0.0f, aVar.b(rVar, i17).getSpacing600(), 0.0f, 0.0f, 13, null), aVar.a(rVar, i17).getBase().a(), null, 2, null);
            w0 w0VarA = d1.e0.a(d1.i.f39152a.e(), f3.c.INSTANCE.g(), rVar, 54);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarD);
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
            n6.i(rVarC, w0VarA, companion.d());
            n6.i(rVarC, e0VarT, companion.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
            n6.g(rVarC, companion.a());
            n6.i(rVarC, mVarE, companion.e());
            d1.i0 i0Var = d1.i0.f39176a;
            j70.h.g(null, null, mx.b.b("Brak danych", ""), null, null, aVar.a(rVar, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i17).b(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
            rVar.x();
            boolean zG = rVar.G(empty);
            Object objE = rVar.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.a() { // from class: nr1.w
                    @Override // er.a
                    public final Object a() {
                        return x.n(empty);
                    }
                };
                rVar.v(objE);
            }
            q0.g(false, (er.a) objE, rVar, 0, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 n(m.a.Empty empty) {
        empty.b().a();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 o(m.a.Empty empty, int i15, p076m2.r rVar, int i16) {
        l(empty, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void p(p076m2.r rVar, final int i15) {
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(-1978774498);
        if (rVarH.r(i15 != 0, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1978774498, i15, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.paging.LoadingContent (DeveloperPagingScreen.kt:106)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarF = androidx.compose.foundation.layout.d.f(companion, 0.0f, 1, null);
            k70.a aVar = k70.a.f108864a;
            int i16 = k70.a.f108865b;
            f3.m mVarD = w0.i.d(a3.r(mVarF, 0.0f, aVar.b(rVarH, i16).getSpacing600(), 0.0f, 0.0f, 13, null), aVar.a(rVarH, i16).getBase().a(), null, 2, null);
            w0 w0VarA = d1.e0.a(d1.i.f39152a.e(), f3.c.INSTANCE.g(), rVarH, 54);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, mVarD);
            androidx.compose.ui.node.c.Companion companion2 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion2.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB);
            } else {
                rVarH.u();
            }
            p076m2.r rVarC = n6.c(rVarH);
            n6.i(rVarC, w0VarA, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
            n6.g(rVarC, companion2.a());
            n6.i(rVarC, mVarE, companion2.e());
            d1.i0 i0Var = d1.i0.f39176a;
            x70.f.g(x70.a.C5796a.f217280c, rVarH, x70.a.C5796a.f217281d);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i16).getSpacing200()), rVarH, 0);
            rVar2 = rVarH;
            j70.h.g(null, null, mx.b.b("Trwa ładowanie...", ""), null, null, aVar.a(rVarH, i16).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i16).b(), null, null, false, false, null, rVar2, 0, 0, 0, 33030107);
            rVar2.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: nr1.q
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return x.q(i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 q(int i15, p076m2.r rVar, int i16) {
        p(rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void r(final m.a.Content content, final y0 y0Var, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(226710308);
        if ((i15 & 6) == 0) {
            i16 = i15 | ((i15 & 8) == 0 ? rVarH.W(content) : rVarH.G(content) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.W(y0Var) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(226710308, i16, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.paging.PagingContent (DeveloperPagingScreen.kt:54)");
            }
            rVar2 = rVarH;
            i50.s.r(content.getBaseScaffoldData(), null, null, 0, 0L, null, y0Var, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-1625883119, true, new er.q() { // from class: nr1.r
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return x.s(content, y0Var, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVar2, BaseScaffoldData.f89350g | ((i16 << 15) & 3670016), 196608, 32702);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: nr1.s
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return x.u(content, y0Var, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 s(final m.a.Content content, y0 y0Var, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1625883119, i16, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.paging.PagingContent.<anonymous> (DeveloperPagingScreen.kt:59)");
            }
            u60.j.g(content.c(), t70.s.n(androidx.compose.foundation.layout.d.f(a3.l(f3.m.INSTANCE, d3Var), 0.0f, 1, null), rVar, 0), null, null, null, y0Var, h.f137898a.b(), rVar, PagingListData.f195779i | 1572864, 28);
            boolean zG = rVar.G(content);
            Object objE = rVar.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.a() { // from class: nr1.v
                    @Override // er.a
                    public final Object a() {
                        return x.t(content);
                    }
                };
                rVar.v(objE);
            }
            q0.g(false, (er.a) objE, rVar, 0, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 t(m.a.Content content) {
        content.b().a();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 u(m.a.Content content, y0 y0Var, int i15, p076m2.r rVar, int i16) {
        r(content, y0Var, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }
}
