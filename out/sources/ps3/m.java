package ps3;

import d1.a3;
import d1.d3;
import d1.e0;
import d1.r3;
import d1.x;
import f1.b1;
import f1.y0;
import i50.BaseScaffoldData;
import j50.f0;
import ju.p0;
import oq.i0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.Function0;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p088nul.q0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\tH\u0003¢\u0006\u0004\b\n\u0010\u000b\u001a\u001f\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0003¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lps3/e;", "viewModel", "Loq/i0;", "l", "(Lps3/e;Lm2/r;I)V", "Lps3/e$a;", "screenData", "j", "(Lps3/e$a;Lm2/r;I)V", "Lps3/e$a$a;", "o", "(Lps3/e$a$a;Lm2/r;I)V", "Lf1/y0;", "lazyListState", "h", "(Lps3/e$a$a;Lf1/y0;Lm2/r;I)V", "zusvisit_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class m {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class a extends vq.k implements er.p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f162448e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ y0 f162449f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(y0 y0Var, tq.e<? super a> eVar) {
            super(2, eVar);
            this.f162449f = y0Var;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f162448e;
            if (i15 == 0) {
                oq.u.b(obj);
                y0 y0Var = this.f162449f;
                this.f162448e = 1;
                if (y0.r(y0Var, 0, 0, this, 2, null) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((a) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return new a(this.f162449f, eVar);
        }
    }

    private static final void h(final e.a.DisplayedScreenData displayedScreenData, final y0 y0Var, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(-1665641461);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(displayedScreenData) : rVarH.G(displayedScreenData) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.W(y0Var) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1665641461, i16, -1, "pl.gov.coi.mobywatel.feature.zusvisit.presentation.screens.newvisitwizard.departmentselect.DepartmentCardsContent (DepartmentSelectScreen.kt:111)");
            }
            String query = displayedScreenData.getSearchBarData().getQuery();
            int i17 = i16 & 112;
            boolean z15 = i17 == 32;
            Object objE = rVarH.E();
            if (z15 || objE == p076m2.r.INSTANCE.a()) {
                objE = new a(y0Var, null);
                rVarH.v(objE);
            }
            Function0.d(query, (er.p) objE, rVarH, 0);
            m30.m.d(displayedScreenData.getDepartmentsCardList(), y0Var, rVarH, i17, 0);
            if (displayedScreenData.getDepartmentsCardList().d().isEmpty()) {
                rVarH.X(-1367183676);
                f3.m mVarF = androidx.compose.foundation.layout.d.f(f3.m.INSTANCE, 0.0f, 1, null);
                k70.a aVar = k70.a.f108864a;
                int i18 = k70.a.f108865b;
                f3.m mVarR = a3.r(mVarF, 0.0f, 0.0f, 0.0f, aVar.b(rVarH, i18).getSpacing200(), 7, null);
                w0 w0VarA = e0.a(d1.i.f39152a.e(), f3.c.INSTANCE.g(), rVarH, 54);
                int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
                p076m2.e0 e0VarT = rVarH.t();
                f3.m mVarE = f3.j.e(rVarH, mVarR);
                androidx.compose.ui.node.c.Companion companion = androidx.compose.ui.node.c.INSTANCE;
                er.a<androidx.compose.ui.node.c> aVarB = companion.b();
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
                n6.i(rVarC, w0VarA, companion.d());
                n6.i(rVarC, e0VarT, companion.f());
                n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
                n6.g(rVarC, companion.a());
                n6.i(rVarC, mVarE, companion.e());
                d1.i0 i0Var = d1.i0.f39176a;
                j70.h.g(null, null, displayedScreenData.getNotFoundText(), null, null, 0L, 0L, null, null, null, 0L, null, b5.j.h(b5.j.INSTANCE.a()), 0L, 0, false, 0, 0, null, aVar.f(rVarH, i18).a(), null, null, false, false, null, rVarH, 0, 0, 0, 33026043);
                rVar2 = rVarH;
                rVar2.x();
            } else {
                rVar2 = rVarH;
                rVar2.X(-1371187977);
            }
            rVar2.R();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: ps3.l
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return m.i(displayedScreenData, y0Var, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(e.a.DisplayedScreenData displayedScreenData, y0 y0Var, int i15, p076m2.r rVar, int i16) {
        h(displayedScreenData, y0Var, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void j(final e.a aVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(360352238);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(aVar) : rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(360352238, i16, -1, "pl.gov.coi.mobywatel.feature.zusvisit.presentation.screens.newvisitwizard.departmentselect.DepartmentSelectContent (DepartmentSelectScreen.kt:43)");
            }
            if (aVar instanceof e.a.b) {
                rVarH.X(-1593845377);
                c60.b.b(rVarH, 0);
                rVarH.R();
            } else {
                if (!(aVar instanceof e.a.DisplayedScreenData)) {
                    rVarH.X(-1593847404);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(-1593842572);
                o((e.a.DisplayedScreenData) aVar, rVarH, i16 & 14);
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
            d5VarM.a(new er.p() { // from class: ps3.g
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return m.k(aVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k(e.a aVar, int i15, p076m2.r rVar, int i16) {
        j(aVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void l(final e eVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1053961473);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(eVar) : rVarH.G(eVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1053961473, i16, -1, "pl.gov.coi.mobywatel.feature.zusvisit.presentation.screens.newvisitwizard.departmentselect.DepartmentSelectScreen (DepartmentSelectScreen.kt:35)");
            }
            j(m(m7.b.c(eVar.getState(), null, null, null, rVarH, 0, 7)), rVarH, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: ps3.f
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return m.n(eVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final e.a m(f6<? extends e.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n(e eVar, int i15, p076m2.r rVar, int i16) {
        l(eVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private static final void o(final e.a.DisplayedScreenData displayedScreenData, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(-1531283484);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(displayedScreenData) : rVarH.G(displayedScreenData) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1531283484, i16, -1, "pl.gov.coi.mobywatel.feature.zusvisit.presentation.screens.newvisitwizard.departmentselect.DepartmentSelectSearchScreen (DepartmentSelectScreen.kt:56)");
            }
            final y0 y0VarC = b1.c(0, 0, rVarH, 0, 3);
            boolean z15 = (i16 & 14) == 4 || ((i16 & 8) != 0 && rVarH.G(displayedScreenData));
            Object objE = rVarH.E();
            if (z15 || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.a() { // from class: ps3.h
                    @Override // er.a
                    public final Object a() {
                        return m.p(displayedScreenData);
                    }
                };
                rVarH.v(objE);
            }
            q0.g(false, (er.a) objE, rVarH, 0, 1);
            rVar2 = rVarH;
            i50.s.r(displayedScreenData.getBaseScaffoldData(), null, null, 0, 0L, null, y0VarC, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(1284115473, true, new er.q() { // from class: ps3.i
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return m.q(displayedScreenData, y0VarC, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVar2, BaseScaffoldData.f89350g, 196608, 32702);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: ps3.j
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return m.s(displayedScreenData, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p(e.a.DisplayedScreenData displayedScreenData) {
        if (displayedScreenData.getSearchBarData().getIsActive()) {
            displayedScreenData.getSearchBarData().c().b(Boolean.FALSE);
        } else {
            displayedScreenData.d().a();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(final e.a.DisplayedScreenData displayedScreenData, final y0 y0Var, d3 d3Var, p076m2.r rVar, int i15) {
        float spacing200;
        if ((i15 & 6) == 0) {
            i15 |= rVar.W(d3Var) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1284115473, i15, -1, "pl.gov.coi.mobywatel.feature.zusvisit.presentation.screens.newvisitwizard.departmentselect.DepartmentSelectSearchScreen.<anonymous> (DepartmentSelectScreen.kt:71)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarL = a3.l(androidx.compose.foundation.layout.d.f(companion, 0.0f, 1, null), d3Var);
            if (displayedScreenData.getSearchBarData().getIsActive()) {
                rVar.X(-189441441);
                spacing200 = k70.a.f108864a.b(rVar, k70.a.f108865b).getZero();
                rVar.R();
            } else {
                rVar.X(-189385703);
                spacing200 = k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing200();
                rVar.R();
            }
            f3.m mVarP = a3.p(mVarL, spacing200, 0.0f, 2, null);
            w0 w0VarA = e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarP);
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
            f0.A(null, displayedScreenData.getSearchBarData(), y2.m.d(2073953509, true, new er.p() { // from class: ps3.k
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return m.r(displayedScreenData, y0Var, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVar, 54), rVar, MLKEMEngine.KyberPolyBytes, 1);
            if (displayedScreenData.getSearchBarData().getIsActive()) {
                rVar.X(137952827);
            } else {
                rVar.X(141318993);
                r3.a(androidx.compose.foundation.layout.d.i(companion, k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing300()), rVar, 0);
                h(displayedScreenData, y0Var, rVar, BaseScaffoldData.f89350g);
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
    public static final i0 r(e.a.DisplayedScreenData displayedScreenData, y0 y0Var, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(2073953509, i15, -1, "pl.gov.coi.mobywatel.feature.zusvisit.presentation.screens.newvisitwizard.departmentselect.DepartmentSelectSearchScreen.<anonymous>.<anonymous>.<anonymous> (DepartmentSelectScreen.kt:84)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            k70.a aVar = k70.a.f108864a;
            int i16 = k70.a.f108865b;
            f3.m mVarP = a3.p(a3.r(companion, 0.0f, aVar.b(rVar, i16).getSpacing200(), 0.0f, 0.0f, 13, null), aVar.b(rVar, i16).getSpacing200(), 0.0f, 2, null);
            w0 w0VarI = d1.r.i(f3.c.INSTANCE.o(), false);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarP);
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
            n6.i(rVarC, w0VarI, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
            n6.g(rVarC, companion2.a());
            n6.i(rVarC, mVarE, companion2.e());
            x xVar = x.f39368a;
            h(displayedScreenData, y0Var, rVar, BaseScaffoldData.f89350g);
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
    public static final i0 s(e.a.DisplayedScreenData displayedScreenData, int i15, p076m2.r rVar, int i16) {
        o(displayedScreenData, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
