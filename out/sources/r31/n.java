package r31;

import d1.a3;
import d1.d3;
import d1.r3;
import f1.b1;
import f1.y0;
import i50.BaseScaffoldData;
import j50.f0;
import ju.p0;
import k40.EmptyStateData;
import mx.Label;
import oq.i0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.Function0;
import p076m2.d5;
import p076m2.e0;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p088nul.q0;
import t31.SearchScreenModel;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\t\u0010\b¨\u0006\u000b²\u0006\f\u0010\n\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lr31/e;", "viewModel", "Loq/i0;", "n", "(Lr31/e;Lm2/r;I)V", "Lr31/e$a;", "data", "i", "(Lr31/e$a;Lm2/r;I)V", "q", "state", "childbirthregistration_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class n {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class a extends vq.k implements er.p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f171300e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ y0 f171301f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(y0 y0Var, tq.e<? super a> eVar) {
            super(2, eVar);
            this.f171301f = y0Var;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f171300e;
            if (i15 == 0) {
                oq.u.b(obj);
                y0 y0Var = this.f171301f;
                this.f171300e = 1;
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
            return new a(this.f171301f, eVar);
        }
    }

    private static final void i(final e.Data data, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(-1126492174);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(data) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1126492174, i16, -1, "pl.gov.coi.mobywatel.feature.childbirthregistration.presentation.screens.birthplaceofficesearch.BirthPlaceOfficeSearchInitialized (BirthPlaceOfficeSearchScreen.kt:47)");
            }
            rVar2 = rVarH;
            i50.s.r(data.getBaseScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(251529573, true, new er.q() { // from class: r31.g
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return n.j(data, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
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
            d5VarM.a(new er.p() { // from class: r31.h
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return n.m(data, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j(final e.Data data, d3 d3Var, p076m2.r rVar, int i15) {
        float spacing200;
        if ((i15 & 6) == 0) {
            i15 |= rVar.W(d3Var) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(251529573, i15, -1, "pl.gov.coi.mobywatel.feature.childbirthregistration.presentation.screens.birthplaceofficesearch.BirthPlaceOfficeSearchInitialized.<anonymous> (BirthPlaceOfficeSearchScreen.kt:51)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            Object objE = rVar.E();
            if (objE == p076m2.r.INSTANCE.a()) {
                objE = new er.l() { // from class: r31.i
                    @Override // er.l
                    public final Object b(Object obj) {
                        return n.k((n4.i0) obj);
                    }
                };
                rVar.v(objE);
            }
            f3.m mVarD = n4.v.d(companion, false, (er.l) objE, 1, null);
            f3.c.Companion companion2 = f3.c.INSTANCE;
            w0 w0VarI = d1.r.i(companion2.o(), false);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarD);
            androidx.compose.ui.node.c.Companion companion3 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion3.b();
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
            n6.i(rVarC, w0VarI, companion3.d());
            n6.i(rVarC, e0VarT, companion3.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion3.c());
            n6.g(rVarC, companion3.a());
            n6.i(rVarC, mVarE, companion3.e());
            d1.x xVar = d1.x.f39368a;
            f3.m mVarL = a3.l(androidx.compose.foundation.layout.d.f(companion, 0.0f, 1, null), d3Var);
            if (data.getSearchBarData().getIsActive()) {
                rVar.X(1320555245);
                spacing200 = k70.a.f108864a.b(rVar, k70.a.f108865b).getZero();
                rVar.R();
            } else {
                rVar.X(1320614951);
                spacing200 = k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing200();
                rVar.R();
            }
            f3.m mVarP = a3.p(mVarL, spacing200, 0.0f, 2, null);
            w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), companion2.k(), rVar, 0);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVar, 0));
            e0 e0VarT2 = rVar.t();
            f3.m mVarE2 = f3.j.e(rVar, mVarP);
            er.a<androidx.compose.ui.node.c> aVarB2 = companion3.b();
            if (rVar.l() == null) {
                p076m2.m.d();
            }
            rVar.K();
            if (rVar.getInserting()) {
                rVar.H(aVarB2);
            } else {
                rVar.u();
            }
            p076m2.r rVarC2 = n6.c(rVar);
            n6.i(rVarC2, w0VarA, companion3.d());
            n6.i(rVarC2, e0VarT2, companion3.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion3.c());
            n6.g(rVarC2, companion3.a());
            n6.i(rVarC2, mVarE2, companion3.e());
            d1.i0 i0Var = d1.i0.f39176a;
            f0.A(null, data.getSearchBarData(), y2.m.d(-1243804341, true, new er.p() { // from class: r31.j
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return n.l(data, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVar, 54), rVar, MLKEMEngine.KyberPolyBytes, 1);
            if (data.getSearchBarData().getIsActive()) {
                rVar.X(1331549433);
            } else {
                rVar.X(1334428403);
                r3.a(androidx.compose.foundation.layout.d.i(companion, k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing300()), rVar, 0);
                q(data, rVar, 0);
            }
            rVar.R();
            rVar.x();
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
    public static final i0 k(n4.i0 i0Var) {
        t70.i.A(i0Var);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(e.Data data, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1243804341, i15, -1, "pl.gov.coi.mobywatel.feature.childbirthregistration.presentation.screens.birthplaceofficesearch.BirthPlaceOfficeSearchInitialized.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BirthPlaceOfficeSearchScreen.kt:67)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            k70.a aVar = k70.a.f108864a;
            int i16 = k70.a.f108865b;
            f3.m mVarP = a3.p(a3.r(companion, 0.0f, aVar.b(rVar, i16).getSpacing200(), 0.0f, 0.0f, 13, null), aVar.b(rVar, i16).getSpacing200(), 0.0f, 2, null);
            w0 w0VarI = d1.r.i(f3.c.INSTANCE.o(), false);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            e0 e0VarT = rVar.t();
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
            d1.x xVar = d1.x.f39368a;
            q(data, rVar, 0);
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
    public static final i0 m(e.Data data, int i15, p076m2.r rVar, int i16) {
        i(data, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void n(final e eVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-538331524);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(eVar) : rVarH.G(eVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-538331524, i16, -1, "pl.gov.coi.mobywatel.feature.childbirthregistration.presentation.screens.birthplaceofficesearch.BirthPlaceOfficeSearchScreen (BirthPlaceOfficeSearchScreen.kt:36)");
            }
            f6 f6VarC = m7.b.c(eVar.getState(), null, null, null, rVarH, 0, 7);
            i(o(f6VarC), rVarH, 0);
            q0.g(false, o(f6VarC).b(), rVarH, 0, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: r31.f
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return n.p(eVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final e.Data o(f6<e.Data> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p(e eVar, int i15, p076m2.r rVar, int i16) {
        n(eVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private static final void q(final e.Data data, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(221155434);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(data) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(221155434, i16, -1, "pl.gov.coi.mobywatel.feature.childbirthregistration.presentation.screens.birthplaceofficesearch.OfficeCardsListContent (BirthPlaceOfficeSearchScreen.kt:88)");
            }
            y0 y0VarC = b1.c(0, 0, rVarH, 0, 3);
            String query = data.getSearchBarData().getQuery();
            boolean zW = rVarH.W(y0VarC);
            Object objE = rVarH.E();
            if (zW || objE == p076m2.r.INSTANCE.a()) {
                objE = new a(y0VarC, null);
                rVarH.v(objE);
            }
            Function0.d(query, (er.p) objE, rVarH, 0);
            boolean zG = rVarH.G(data);
            Object objE2 = rVarH.E();
            if (zG || objE2 == p076m2.r.INSTANCE.a()) {
                objE2 = new er.l() { // from class: r31.k
                    @Override // er.l
                    public final Object b(Object obj) {
                        return n.r(data, (f1.q0) obj);
                    }
                };
                rVarH.v(objE2);
            }
            f1.d.c(null, y0VarC, null, false, null, null, null, false, null, (er.l) objE2, rVarH, 0, 509);
            if (data.getSearchScreenModel().d()) {
                rVarH.X(-37302699);
                f3.m mVarR = a3.r(androidx.compose.foundation.layout.d.f(f3.m.INSTANCE, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing200(), 7, null);
                w0 w0VarA = d1.e0.a(d1.i.f39152a.e(), f3.c.INSTANCE.g(), rVarH, 54);
                int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
                e0 e0VarT = rVarH.t();
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
                k40.d.c(null, data.getSearchScreenModel().getNoSearchResultsEmptyStateData(), rVarH, EmptyStateData.f108236d << 3, 1);
                rVarH.x();
            } else {
                rVarH.X(-41347176);
            }
            rVarH.R();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: r31.l
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return n.t(data, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r(e.Data data, f1.q0 q0Var) {
        int i15 = 0;
        for (Object obj : data.getSearchScreenModel().b()) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                pq.v.x();
            }
            final SearchScreenModel.CardGroup cardGroup = (SearchScreenModel.CardGroup) obj;
            if (!cardGroup.getCardListData().d().isEmpty()) {
                if (cardGroup.getTitle() != null) {
                    f1.q0.c(q0Var, null, null, y2.m.b(399098886, true, new er.q() { // from class: r31.m
                        @Override // er.q
                        public final Object w(Object obj2, Object obj3, Object obj4) {
                            return n.s(cardGroup, (f1.e) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
                        }
                    }), 3, null);
                }
                m30.m.h(q0Var, cardGroup.getCardListData());
                if (i15 < data.getSearchScreenModel().b().size() - 1) {
                    f1.q0.c(q0Var, null, null, a0.f171278a.b(), 3, null);
                }
            }
            i15 = i16;
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s(SearchScreenModel.CardGroup cardGroup, f1.e eVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 17) != 16, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(399098886, i15, -1, "pl.gov.coi.mobywatel.feature.childbirthregistration.presentation.screens.birthplaceofficesearch.OfficeCardsListContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BirthPlaceOfficeSearchScreen.kt:103)");
            }
            Label title = cardGroup.getTitle();
            k70.a aVar = k70.a.f108864a;
            int i16 = k70.a.f108865b;
            j70.h.g(null, null, title, null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i16).j(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
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
    public static final i0 t(e.Data data, int i15, p076m2.r rVar, int i16) {
        q(data, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
