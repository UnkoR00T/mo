package qh1;

import d1.a3;
import d1.d3;
import d1.m3;
import d1.q3;
import d1.r3;
import f1.b1;
import f1.y0;
import i50.BaseScaffoldData;
import java.util.Iterator;
import k40.EmptyStateData;
import mx.Label;
import o50.SmallCardData;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.Function0;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p088nul.q0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\t\u0010\b\u001a\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\n\u0010\b\u001a\u000f\u0010\u000b\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u000b\u0010\f\u001a\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\r\u0010\b¨\u0006\u0010²\u0006\f\u0010\u000f\u001a\u00020\u000e8\nX\u008a\u0084\u0002"}, d2 = {"Lqh1/d;", "viewModel", "Loq/i0;", "o", "(Lqh1/d;Lm2/r;I)V", "Lqh1/d$a$b;", "data", "k", "(Lqh1/d$a$b;Lm2/r;I)V", "z", "r", "x", "(Lm2/r;I)V", "t", "Lqh1/d$a;", "state", "dashboard_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class o {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class a extends vq.k implements er.p<ju.p0, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f166540e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ y0 f166541f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(y0 y0Var, tq.e<? super a> eVar) {
            super(2, eVar);
            this.f166541f = y0Var;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f166540e;
            if (i15 == 0) {
                oq.u.b(obj);
                y0 y0Var = this.f166541f;
                this.f166540e = 1;
                if (y0.r(y0Var, 0, 0, this, 2, null) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ju.p0 p0Var, tq.e<? super oq.i0> eVar) {
            return ((a) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return new a(this.f166541f, eVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 A(d.a.Initialized initialized, int i15, p076m2.r rVar, int i16) {
        z(initialized, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void k(final d.a.Initialized initialized, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-285191783);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(initialized) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-285191783, i16, -1, "pl.gov.coi.mobywatel.feature.dashboard.presentation.screens.globalsearch.GlobalSearchInitialized (GlobalSearchScreen.kt:56)");
            }
            i50.s.r(initialized.getBaseScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-892043124, true, new er.q() { // from class: qh1.f
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return o.l(initialized, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVarH, BaseScaffoldData.f89350g, 196992, 28670);
            rVarH = rVarH;
            cb4.i dialogVMS = initialized.getDialogVMS();
            if (dialogVMS == null) {
                rVarH.X(-702086752);
            } else {
                rVarH.X(808636033);
                dialogVMS.b(rVarH, 0);
            }
            rVarH.R();
            q0.g(false, initialized.e(), rVarH, 0, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: qh1.g
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return o.n(initialized, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 l(final d.a.Initialized initialized, d3 d3Var, p076m2.r rVar, int i15) {
        float spacing200;
        if ((i15 & 6) == 0) {
            i15 |= rVar.W(d3Var) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-892043124, i15, -1, "pl.gov.coi.mobywatel.feature.dashboard.presentation.screens.globalsearch.GlobalSearchInitialized.<anonymous> (GlobalSearchScreen.kt:61)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarL = a3.l(androidx.compose.foundation.layout.d.f(companion, 0.0f, 1, null), d3Var);
            if (initialized.getSearchBarData().getIsActive()) {
                rVar.X(-1893860668);
                spacing200 = k70.a.f108864a.b(rVar, k70.a.f108865b).getZero();
                rVar.R();
            } else {
                rVar.X(-1893804930);
                spacing200 = k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing200();
                rVar.R();
            }
            f3.m mVarP = a3.p(mVarL, spacing200, 0.0f, 2, null);
            w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
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
            j50.f0.A(null, initialized.getSearchBarData(), y2.m.d(1492453432, true, new er.p() { // from class: qh1.h
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return o.m(initialized, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVar, 54), rVar, MLKEMEngine.KyberPolyBytes, 1);
            if (initialized.getSearchBarData().getIsActive()) {
                rVar.X(-1641100180);
            } else {
                rVar.X(-1637698612);
                r3.a(androidx.compose.foundation.layout.d.i(companion, k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing300()), rVar, 0);
                z(initialized, rVar, 0);
            }
            rVar.R();
            rVar.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 m(d.a.Initialized initialized, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1492453432, i15, -1, "pl.gov.coi.mobywatel.feature.dashboard.presentation.screens.globalsearch.GlobalSearchInitialized.<anonymous>.<anonymous>.<anonymous> (GlobalSearchScreen.kt:74)");
            }
            f3.m mVarF = androidx.compose.foundation.layout.d.f(f3.m.INSTANCE, 0.0f, 1, null);
            k70.a aVar = k70.a.f108864a;
            int i16 = k70.a.f108865b;
            f3.m mVarP = a3.p(a3.r(mVarF, 0.0f, aVar.b(rVar, i16).getSpacing200(), 0.0f, 0.0f, 13, null), aVar.b(rVar, i16).getSpacing200(), 0.0f, 2, null);
            w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarP);
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
            r(initialized, rVar, 0);
            rVar.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 n(d.a.Initialized initialized, int i15, p076m2.r rVar, int i16) {
        k(initialized, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void o(final d dVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(370250879);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(dVar) : rVarH.G(dVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(370250879, i16, -1, "pl.gov.coi.mobywatel.feature.dashboard.presentation.screens.globalsearch.GlobalSearchScreen (GlobalSearchScreen.kt:43)");
            }
            d.a aVarP = p(m7.b.c(dVar.getState(), null, null, null, rVarH, 0, 7));
            if (aVarP instanceof d.a.c) {
                rVarH.X(-671184400);
                c60.b.b(rVarH, 0);
                rVarH.R();
            } else if (aVarP instanceof d.a.Initialized) {
                rVarH.X(-671182205);
                k((d.a.Initialized) aVarP, rVarH, 0);
                rVarH.R();
            } else {
                if (!(aVarP instanceof d.a.Error)) {
                    rVarH.X(-671186474);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(-671179193);
                ((d.a.Error) aVarP).getErrorVMS().b(rVarH, 0);
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
            d5VarM.a(new er.p() { // from class: qh1.e
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return o.q(dVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final d.a p(f6<? extends d.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 q(d dVar, int i15, p076m2.r rVar, int i16) {
        o(dVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void r(final d.a.Initialized initialized, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1604187209);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(initialized) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1604187209, i16, -1, "pl.gov.coi.mobywatel.feature.dashboard.presentation.screens.globalsearch.SearchActiveContent (GlobalSearchScreen.kt:134)");
            }
            boolean isLoading = initialized.getIsLoading();
            if (isLoading) {
                rVarH.X(269355146);
                x(rVarH, 0);
                rVarH.R();
            } else {
                if (isLoading) {
                    rVarH.X(269354078);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(269356213);
                t(initialized, rVarH, i16 & 14);
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
            d5VarM.a(new er.p() { // from class: qh1.j
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return o.s(initialized, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 s(d.a.Initialized initialized, int i15, p076m2.r rVar, int i16) {
        r(initialized, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void t(final d.a.Initialized initialized, p076m2.r rVar, final int i15) {
        int i16;
        d5 d5VarM;
        er.p<? super p076m2.r, ? super Integer, oq.i0> pVar;
        p076m2.r rVarH = rVar.h(-334847281);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(initialized) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-334847281, i16, -1, "pl.gov.coi.mobywatel.feature.dashboard.presentation.screens.globalsearch.SearchListContent (GlobalSearchScreen.kt:155)");
            }
            y0 y0VarC = b1.c(0, 0, rVarH, 0, 3);
            String query = initialized.getSearchBarData().getQuery();
            boolean zW = rVarH.W(y0VarC);
            Object objE = rVarH.E();
            if (zW || objE == p076m2.r.INSTANCE.a()) {
                objE = new a(y0VarC, null);
                rVarH.v(objE);
            }
            Function0.d(query, (er.p) objE, rVarH, 0);
            m30.m.d(initialized.getSearchItems(), y0VarC, rVarH, 0, 0);
            if (!initialized.getSearchItems().d().isEmpty()) {
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                d5VarM = rVarH.m();
                if (d5VarM == null) {
                    return;
                } else {
                    pVar = new er.p() { // from class: qh1.k
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return o.u(initialized, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                        }
                    };
                }
            } else if (initialized.getIsQueryEmpty()) {
                rVarH.X(1774086191);
                f3.m mVarF = androidx.compose.foundation.layout.d.f(f3.m.INSTANCE, 0.0f, 1, null);
                w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVarH, 0);
                int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
                p076m2.e0 e0VarT = rVarH.t();
                f3.m mVarE = f3.j.e(rVarH, mVarF);
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
                if (initialized.getLastSearchedItemsData() != null) {
                    rVarH.X(22345241);
                    rh1.g.f(initialized.getLastSearchedItemsData(), rVarH, 0);
                } else {
                    rVarH.X(16677883);
                }
                rVarH.R();
                rVarH.x();
                rVarH.R();
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                d5VarM = rVarH.m();
                if (d5VarM == null) {
                    return;
                } else {
                    pVar = new er.p() { // from class: qh1.l
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return o.v(initialized, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                        }
                    };
                }
            } else {
                rVarH.X(1768522931);
                rVarH.R();
                f3.m mVarR = a3.r(androidx.compose.foundation.layout.d.f(f3.m.INSTANCE, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing200(), 7, null);
                w0 w0VarA2 = d1.e0.a(d1.i.f39152a.e(), f3.c.INSTANCE.g(), rVarH, 54);
                int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, 0));
                p076m2.e0 e0VarT2 = rVarH.t();
                f3.m mVarE2 = f3.j.e(rVarH, mVarR);
                androidx.compose.ui.node.c.Companion companion2 = androidx.compose.ui.node.c.INSTANCE;
                er.a<androidx.compose.ui.node.c> aVarB2 = companion2.b();
                if (rVarH.l() == null) {
                    p076m2.m.d();
                }
                rVarH.K();
                if (rVarH.getInserting()) {
                    rVarH.H(aVarB2);
                } else {
                    rVarH.u();
                }
                p076m2.r rVarC2 = n6.c(rVarH);
                n6.i(rVarC2, w0VarA2, companion2.d());
                n6.i(rVarC2, e0VarT2, companion2.f());
                n6.i(rVarC2, Integer.valueOf(iHashCode2), companion2.c());
                n6.g(rVarC2, companion2.a());
                n6.i(rVarC2, mVarE2, companion2.e());
                d1.i0 i0Var2 = d1.i0.f39176a;
                k40.d.c(null, initialized.getNoResultsEmptyStateData(), rVarH, EmptyStateData.f108236d << 3, 1);
                rVarH.x();
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
            }
            d5VarM.a(pVar);
        }
        rVarH.O();
        d5VarM = rVarH.m();
        if (d5VarM != null) {
            pVar = new er.p() { // from class: qh1.m
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return o.w(initialized, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            };
            d5VarM.a(pVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 u(d.a.Initialized initialized, int i15, p076m2.r rVar, int i16) {
        t(initialized, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 v(d.a.Initialized initialized, int i15, p076m2.r rVar, int i16) {
        t(initialized, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 w(d.a.Initialized initialized, int i15, p076m2.r rVar, int i16) {
        t(initialized, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void x(p076m2.r rVar, final int i15) {
        p076m2.r rVarH = rVar.h(250934624);
        if (rVarH.r(i15 != 0, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(250934624, i15, -1, "pl.gov.coi.mobywatel.feature.dashboard.presentation.screens.globalsearch.SearchListLoading (GlobalSearchScreen.kt:142)");
            }
            f3.m mVarF = androidx.compose.foundation.layout.d.f(f3.m.INSTANCE, 0.0f, 1, null);
            w0 w0VarI = d1.r.i(f3.c.INSTANCE.e(), false);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, mVarF);
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
            n6.i(rVarC, w0VarI, companion.d());
            n6.i(rVarC, e0VarT, companion.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
            n6.g(rVarC, companion.a());
            n6.i(rVarC, mVarE, companion.e());
            d1.x xVar = d1.x.f39368a;
            x70.f.g(x70.a.C5796a.f217280c, rVarH, x70.a.C5796a.f217281d);
            rVarH.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: qh1.n
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return o.y(i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 y(int i15, p076m2.r rVar, int i16) {
        x(rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void z(final d.a.Initialized initialized, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(1802437054);
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVarH.G(initialized) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1802437054, i16, -1, "pl.gov.coi.mobywatel.feature.dashboard.presentation.screens.globalsearch.SearchNotActiveContent (GlobalSearchScreen.kt:97)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarS = t70.i.S(androidx.compose.foundation.layout.d.f(companion, 0.0f, 1, null), null, rVarH, 6, 1);
            d1.i iVar = d1.i.f39152a;
            d1.i.n nVarK = iVar.k();
            f3.c.Companion companion2 = f3.c.INSTANCE;
            w0 w0VarA = d1.e0.a(nVarK, companion2.k(), rVarH, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, mVarS);
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
            p076m2.r rVarC = n6.c(rVarH);
            n6.i(rVarC, w0VarA, companion3.d());
            n6.i(rVarC, e0VarT, companion3.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion3.c());
            n6.g(rVarC, companion3.a());
            n6.i(rVarC, mVarE, companion3.e());
            d1.i0 i0Var = d1.i0.f39176a;
            d.SectionNewsData sectionNewsData = initialized.getSectionNewsData();
            if (sectionNewsData == null) {
                rVarH.X(-1179455767);
                rVarH.R();
            } else {
                rVarH.X(-1179455766);
                Label title = sectionNewsData.getTitle();
                k70.a aVar = k70.a.f108864a;
                int i17 = k70.a.f108865b;
                j70.h.g(null, null, title, null, null, aVar.a(rVarH, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i17).a(), null, null, false, false, null, rVarH, 0, 0, 0, 33030107);
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i17).getSpacing200()), rVarH, 0);
                w0 w0VarB = m3.b(iVar.j(), companion2.l(), rVarH, 0);
                int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, 0));
                p076m2.e0 e0VarT2 = rVarH.t();
                f3.m mVarE2 = f3.j.e(rVarH, companion);
                er.a<androidx.compose.ui.node.c> aVarB2 = companion3.b();
                if (rVarH.l() == null) {
                    rVarH = rVarH;
                    p076m2.m.d();
                }
                rVarH = rVarH;
                rVarH.K();
                if (rVarH.getInserting()) {
                    rVarH.H(aVarB2);
                } else {
                    rVarH.u();
                }
                p076m2.r rVarC2 = n6.c(rVarH);
                n6.i(rVarC2, w0VarB, companion3.d());
                n6.i(rVarC2, e0VarT2, companion3.f());
                n6.i(rVarC2, Integer.valueOf(iHashCode2), companion3.c());
                n6.g(rVarC2, companion3.a());
                n6.i(rVarC2, mVarE2, companion3.e());
                q3 q3Var = q3.f39261a;
                rVarH.X(1717562860);
                Iterator<T> it = sectionNewsData.a().iterator();
                while (it.hasNext()) {
                    o50.e.d((SmallCardData) it.next(), false, rVarH, SmallCardData.f142457h, 2);
                }
                rVarH.R();
                rVarH.x();
                r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing300()), rVarH, 0);
                rVarH.R();
            }
            d.SectionPopularData sectionPopularData = initialized.getSectionPopularData();
            if (sectionPopularData == null) {
                rVarH.X(-1178947739);
            } else {
                rVarH.X(-1178947738);
                Label title2 = sectionPopularData.getTitle();
                k70.a aVar2 = k70.a.f108864a;
                int i18 = k70.a.f108865b;
                p076m2.r rVar2 = rVarH;
                j70.h.g(null, null, title2, null, null, aVar2.a(rVarH, i18).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVarH, i18).a(), null, null, false, false, null, rVar2, 0, 0, 0, 33030107);
                rVarH = rVar2;
                f3.m.Companion companion4 = f3.m.INSTANCE;
                r3.a(androidx.compose.foundation.layout.d.i(companion4, aVar2.b(rVarH, i18).getSpacing200()), rVarH, 0);
                m30.i.d(sectionPopularData.getCardListData(), null, null, rVarH, 0, 6);
                r3.a(androidx.compose.foundation.layout.d.i(companion4, aVar2.b(rVarH, i18).getSpacing300()), rVarH, 0);
            }
            rVarH.R();
            rVarH.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: qh1.i
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return o.A(initialized, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
