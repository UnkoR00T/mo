package p104pq1;

import androidx.compose.foundation.layout.d;
import d1.d3;
import d1.e0;
import er.a;
import er.l;
import er.p;
import er.q;
import f3.c;
import f3.j;
import i50.BaseScaffoldData;
import i50.s;
import j50.SearchBarData;
import j50.f0;
import j70.h;
import mx.Label;
import mx.b;
import oq.i0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.a3;
import p076m2.c6;
import p076m2.d5;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.t;
import x50.NavigationButtonData;
import x50.i;
import y2.m;

/* JADX INFO: renamed from: pq1.g, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u001d\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\t²\u0006\u000e\u0010\u0006\u001a\u00020\u00058\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\b\u001a\u00020\u00078\n@\nX\u008a\u008e\u0002"}, d2 = {"Lkotlin/Function0;", "Loq/i0;", "close", "g", "(Ler/a;Lm2/r;I)V", "", "searchActive", "", "query", "developer_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class Function0 {
    public static final void g(final a<i0> aVar, r rVar, final int i15) {
        int i16;
        r rVar2;
        r rVarH = rVar.h(-836840141);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(-836840141, i16, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.ds.searchbar.DeveloperSearchBarScreen (DeveloperSearchBarScreen.kt:29)");
            }
            Object objE = rVarH.E();
            r.Companion companion = r.INSTANCE;
            if (objE == companion.a()) {
                objE = c6.e(Boolean.FALSE, null, 2, null);
                rVarH.v(objE);
            }
            final a3 a3Var = (a3) objE;
            Object objE2 = rVarH.E();
            if (objE2 == companion.a()) {
                objE2 = c6.e("", null, 2, null);
                rVarH.v(objE2);
            }
            final a3 a3Var2 = (a3) objE2;
            rVar2 = rVarH;
            s.r(new BaseScaffoldData(null, !h(a3Var) ? new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), aVar), b.b("SearchBar 1.1.0", ""), null, null, null, 28, null) : null, null, null, null, null, 61, null), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, m.d(-775732448, true, new q() { // from class: pq1.e
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return Function0.l(a3Var, a3Var2, (d3) obj, (r) obj2, ((Integer) obj3).intValue());
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
            d5VarM.a(new p() { // from class: pq1.f
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return Function0.q(aVar, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final boolean h(a3<Boolean> a3Var) {
        return a3Var.getValue().booleanValue();
    }

    private static final void i(a3<Boolean> a3Var, boolean z15) {
        a3Var.setValue(Boolean.valueOf(z15));
    }

    private static final String j(a3<String> a3Var) {
        return a3Var.getValue();
    }

    private static final void k(a3<String> a3Var, String str) {
        a3Var.setValue(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(final a3 a3Var, final a3 a3Var2, final d3 d3Var, r rVar, int i15) {
        int i16;
        float spacing200;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (t.k()) {
                t.o(-775732448, i16, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.ds.searchbar.DeveloperSearchBarScreen.<anonymous> (DeveloperSearchBarScreen.kt:44)");
            }
            f3.m mVarF = d.f(f3.m.INSTANCE, 0.0f, 1, null);
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            f3.m mVarD = w0.i.d(mVarF, aVar.a(rVar, i17).getBase().a(), null, 2, null);
            if (h(a3Var)) {
                rVar.X(1373861360);
                spacing200 = aVar.b(rVar, i17).getZero();
                rVar.R();
            } else {
                rVar.X(1373917098);
                spacing200 = aVar.b(rVar, i17).getSpacing200();
                rVar.R();
            }
            f3.m mVarL = d1.a3.l(d1.a3.p(mVarD, spacing200, 0.0f, 2, null), d3Var);
            w0 w0VarA = e0.a(d1.i.f39152a.k(), c.INSTANCE.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = j.e(rVar, mVarL);
            androidx.compose.ui.node.c.Companion companion = androidx.compose.ui.node.c.INSTANCE;
            a<androidx.compose.ui.node.c> aVarB = companion.b();
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
            Label labelB = b.b("Wyszukaj", "");
            boolean zH = h(a3Var);
            String strJ = j(a3Var2);
            Object objE = rVar.E();
            r.Companion companion2 = r.INSTANCE;
            if (objE == companion2.a()) {
                objE = new l() { // from class: pq1.a
                    @Override // er.l
                    public final Object b(Object obj) {
                        return Function0.m(a3Var2, (String) obj);
                    }
                };
                rVar.v(objE);
            }
            l lVar = (l) objE;
            Object objE2 = rVar.E();
            if (objE2 == companion2.a()) {
                objE2 = new l() { // from class: pq1.b
                    @Override // er.l
                    public final Object b(Object obj) {
                        return Function0.n(a3Var, ((Boolean) obj).booleanValue());
                    }
                };
                rVar.v(objE2);
            }
            l lVar2 = (l) objE2;
            Object objE3 = rVar.E();
            if (objE3 == companion2.a()) {
                objE3 = new a() { // from class: pq1.c
                    @Override // er.a
                    public final Object a() {
                        return Function0.o(a3Var2);
                    }
                };
                rVar.v(objE3);
            }
            f0.A(null, new SearchBarData(strJ, lVar, zH, lVar2, (a) objE3, labelB, null, 1, 64, null), m.d(-618939660, true, new p() { // from class: pq1.d
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return Function0.p(d3Var, (r) obj, ((Integer) obj2).intValue());
                }
            }, rVar, 54), rVar, MLKEMEngine.KyberPolyBytes, 1);
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
    public static final i0 m(a3 a3Var, String str) {
        k(a3Var, str);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n(a3 a3Var, boolean z15) {
        i(a3Var, z15);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o(a3 a3Var) {
        k(a3Var, "");
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p(d3 d3Var, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(-618939660, i15, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.ds.searchbar.DeveloperSearchBarScreen.<anonymous>.<anonymous>.<anonymous> (DeveloperSearchBarScreen.kt:75)");
            }
            f3.m mVarP = d1.a3.p(t70.i.S(d.f(d1.a3.l(f3.m.INSTANCE, d3Var), 0.0f, 1, null), null, rVar, 0, 1), k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing200(), 0.0f, 2, null);
            w0 w0VarA = e0.a(d1.i.f39152a.k(), c.INSTANCE.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = j.e(rVar, mVarP);
            androidx.compose.ui.node.c.Companion companion = androidx.compose.ui.node.c.INSTANCE;
            a<androidx.compose.ui.node.c> aVarB = companion.b();
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
            h.g(null, null, b.b("This is the search bar's innerContent.\nResult of the search should be placed here.", ""), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, null, false, false, null, rVar, 0, 0, 0, 33554427);
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
    public static final i0 q(a aVar, int i15, r rVar, int i16) {
        g(aVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
