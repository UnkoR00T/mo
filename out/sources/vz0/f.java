package vz0;

import d1.a3;
import d1.d3;
import d1.e0;
import d1.r3;
import i50.BaseScaffoldData;
import java.io.IOException;
import java.util.Iterator;
import n50.h0;
import oq.i0;
import org.xmlpull.v1.XmlPullParserException;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import q40.IconPageData;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\tH\u0003¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000e²\u0006\f\u0010\r\u001a\u00020\f8\nX\u008a\u0084\u0002"}, d2 = {"Lvz0/i;", "viewModel", "Loq/i0;", "f", "(Lvz0/i;Lm2/r;I)V", "Lvz0/i$a$c;", "data", "l", "(Lvz0/i$a$c;Lm2/r;I)V", "Lvz0/i$a$a;", "i", "(Lvz0/i$a$a;Lm2/r;I)V", "Lvz0/i$a;", "state", "applicationforms_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class f {
    public static final void f(final i iVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1127724854);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(iVar) : rVarH.G(iVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1127724854, i16, -1, "pl.gov.coi.mobywatel.feature.applicationforms.presentation.categories.ApplicationCategoriesScreen (ApplicationCategoriesScreen.kt:27)");
            }
            i.a aVarG = g(m7.b.c(iVar.getState(), null, null, null, rVarH, 0, 7));
            if (fr.t.c(aVarG, i.a.b.f208746a)) {
                rVarH.X(-816691114);
                rVarH.R();
            } else if (aVarG instanceof i.a.DataLoaded) {
                rVarH.X(-1411815725);
                i((i.a.DataLoaded) aVarG, rVarH, 0);
                rVarH.R();
            } else {
                if (!(aVarG instanceof i.a.NoData)) {
                    rVarH.X(-1411820824);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(-1411812334);
                l((i.a.NoData) aVarG, rVarH, 0);
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
            d5VarM.a(new er.p() { // from class: vz0.a
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return f.h(iVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final i.a g(f6<? extends i.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(i iVar, int i15, p076m2.r rVar, int i16) {
        f(iVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private static final void i(final i.a.DataLoaded dataLoaded, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(-153789484);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(dataLoaded) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-153789484, i16, -1, "pl.gov.coi.mobywatel.feature.applicationforms.presentation.categories.CategoriesContentScreen (ApplicationCategoriesScreen.kt:60)");
            }
            rVar2 = rVarH;
            i50.s.r(dataLoaded.getBaseScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(2098695361, true, new er.q() { // from class: vz0.b
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return f.j(dataLoaded, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
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
            d5VarM.a(new er.p() { // from class: vz0.c
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return f.k(dataLoaded, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j(i.a.DataLoaded dataLoaded, d3 d3Var, p076m2.r rVar, int i15) throws XmlPullParserException, IOException {
        if ((i15 & 6) == 0) {
            i15 |= rVar.W(d3Var) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(2098695361, i15, -1, "pl.gov.coi.mobywatel.feature.applicationforms.presentation.categories.CategoriesContentScreen.<anonymous> (ApplicationCategoriesScreen.kt:64)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarN = t70.s.n(t70.i.S(a3.l(androidx.compose.foundation.layout.d.f(companion, 0.0f, 1, null), d3Var), null, rVar, 0, 1), rVar, 0);
            w0 w0VarA = e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
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
            p076m2.r rVarC = n6.c(rVar);
            n6.i(rVarC, w0VarA, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
            n6.g(rVarC, companion2.a());
            n6.i(rVarC, mVarE, companion2.e());
            d1.i0 i0Var = d1.i0.f39176a;
            o40.j.i(dataLoaded.getHeaderData(), rVar, 0);
            r3.a(androidx.compose.foundation.layout.d.i(companion, k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing300()), rVar, 0);
            rVar.X(-561020169);
            Iterator<T> it = dataLoaded.b().iterator();
            while (it.hasNext()) {
                h0.v((n50.k) it.next(), null, rVar, 0, 2);
                r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing100()), rVar, 0);
            }
            rVar.R();
            rVar.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k(i.a.DataLoaded dataLoaded, int i15, p076m2.r rVar, int i16) {
        i(dataLoaded, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private static final void l(final i.a.NoData noData, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(1170407806);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(noData) : rVarH.G(noData) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1170407806, i16, -1, "pl.gov.coi.mobywatel.feature.applicationforms.presentation.categories.CategoriesScreenNoData (ApplicationCategoriesScreen.kt:41)");
            }
            rVar2 = rVarH;
            i50.s.r(noData.getBaseScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(563556465, true, new er.q() { // from class: vz0.d
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return f.m(noData, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
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
            d5VarM.a(new er.p() { // from class: vz0.e
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return f.n(noData, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(i.a.NoData noData, d3 d3Var, p076m2.r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= rVar.W(d3Var) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(563556465, i15, -1, "pl.gov.coi.mobywatel.feature.applicationforms.presentation.categories.CategoriesScreenNoData.<anonymous> (ApplicationCategoriesScreen.kt:45)");
            }
            f3.m mVarL = a3.l(androidx.compose.foundation.layout.d.f(f3.m.INSTANCE, 0.0f, 1, null), d3Var);
            w0 w0VarA = e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarL);
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
            q40.i.b(noData.b(), null, null, rVar, IconPageData.f164667h, 6);
            rVar.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n(i.a.NoData noData, int i15, p076m2.r rVar, int i16) {
        l(noData, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
