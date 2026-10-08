package w22;

import d1.a3;
import d1.d3;
import f1.b1;
import f1.q0;
import f1.y0;
import i50.BaseScaffoldData;
import j50.f0;
import ju.p0;
import k40.EmptyStateData;
import n30.CardListData;
import oq.i0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.Function0;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a'\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0003¢\u0006\u0004\b\u000b\u0010\f\u001a\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0011²\u0006\f\u0010\u0010\u001a\u00020\u000f8\nX\u008a\u0084\u0002"}, d2 = {"Lw22/g;", "viewModel", "Loq/i0;", "q", "(Lw22/g;Lm2/r;I)V", "", "query", "Ln30/b;", "cardListData", "Lk40/a;", "emptyStateData", "j", "(Ljava/lang/String;Ln30/b;Lk40/a;Lm2/r;I)V", "n", "(Ln30/b;Lm2/r;I)V", "Lw22/g$a;", "state", "electronicdelivery_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class q {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class a extends vq.k implements er.p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f209413e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ y0 f209414f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(y0 y0Var, tq.e<? super a> eVar) {
            super(2, eVar);
            this.f209414f = y0Var;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f209413e;
            if (i15 == 0) {
                oq.u.b(obj);
                y0 y0Var = this.f209414f;
                this.f209413e = 1;
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
            return new a(this.f209414f, eVar);
        }
    }

    private static final void j(final String str, final CardListData cardListData, final EmptyStateData emptyStateData, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-710376309);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.W(str) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.W(cardListData) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= (i15 & 512) == 0 ? rVarH.W(emptyStateData) : rVarH.G(emptyStateData) ? 256 : 128;
        }
        boolean z15 = true;
        if (rVarH.r((i16 & 147) != 146, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-710376309, i16, -1, "pl.gov.coi.mobywatel.feature.electronicdelivery.presentation.screens.messagewizard.search.SearchBarActiveContent (SearchScreen.kt:79)");
            }
            y0 y0VarC = b1.c(0, 0, rVarH, 0, 3);
            boolean zW = rVarH.W(y0VarC);
            Object objE = rVarH.E();
            if (zW || objE == p076m2.r.INSTANCE.a()) {
                objE = new a(y0VarC, null);
                rVarH.v(objE);
            }
            Function0.d(str, (er.p) objE, rVarH, i16 & 14);
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            d3 d3VarH = a3.h(aVar.b(rVarH, i17).getSpacing200(), aVar.b(rVarH, i17).getSpacing100(), aVar.b(rVarH, i17).getSpacing200(), aVar.b(rVarH, i17).getSpacing200());
            boolean z16 = (i16 & 112) == 32;
            if ((i16 & 896) != 256 && ((i16 & 512) == 0 || !rVarH.G(emptyStateData))) {
                z15 = false;
            }
            boolean z17 = z16 | z15;
            Object objE2 = rVarH.E();
            if (z17 || objE2 == p076m2.r.INSTANCE.a()) {
                objE2 = new er.l() { // from class: w22.n
                    @Override // er.l
                    public final Object b(Object obj) {
                        return q.k(cardListData, emptyStateData, (q0) obj);
                    }
                };
                rVarH.v(objE2);
            }
            f1.d.c(null, y0VarC, d3VarH, false, null, null, null, false, null, (er.l) objE2, rVarH, 0, 505);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: w22.o
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return q.m(str, cardListData, emptyStateData, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k(final CardListData cardListData, final EmptyStateData emptyStateData, q0 q0Var) {
        m30.m.h(q0Var, cardListData);
        q0.c(q0Var, null, null, y2.m.b(280373856, true, new er.q() { // from class: w22.p
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return q.l(cardListData, emptyStateData, (f1.e) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }), 3, null);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(CardListData cardListData, EmptyStateData emptyStateData, f1.e eVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 17) != 16, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(280373856, i15, -1, "pl.gov.coi.mobywatel.feature.electronicdelivery.presentation.screens.messagewizard.search.SearchBarActiveContent.<anonymous>.<anonymous>.<anonymous> (SearchScreen.kt:99)");
            }
            if (cardListData.d().isEmpty()) {
                rVar.X(-1093787505);
                f3.m mVarF = androidx.compose.foundation.layout.d.f(f3.m.INSTANCE, 0.0f, 1, null);
                w0 w0VarA = d1.e0.a(d1.i.f39152a.e(), f3.c.INSTANCE.g(), rVar, 54);
                int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
                p076m2.e0 e0VarT = rVar.t();
                f3.m mVarE = f3.j.e(rVar, mVarF);
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
                k40.d.c(null, emptyStateData, rVar, EmptyStateData.f108236d << 3, 1);
                rVar.x();
            } else {
                rVar.X(-1096950590);
            }
            rVar.R();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(String str, CardListData cardListData, EmptyStateData emptyStateData, int i15, p076m2.r rVar, int i16) {
        j(str, cardListData, emptyStateData, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private static final void n(final CardListData cardListData, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(1904156090);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.W(cardListData) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1904156090, i16, -1, "pl.gov.coi.mobywatel.feature.electronicdelivery.presentation.screens.messagewizard.search.SearchInactiveContent (SearchScreen.kt:117)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            f3.m mVarR = a3.r(companion, 0.0f, aVar.b(rVarH, i17).getSpacing100(), 0.0f, 0.0f, 13, null);
            d3 d3VarI = a3.i(0.0f, aVar.b(rVarH, i17).getSpacing100(), 0.0f, aVar.b(rVarH, i17).getSpacing200(), 5, null);
            boolean z15 = (i16 & 14) == 4;
            Object objE = rVarH.E();
            if (z15 || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.l() { // from class: w22.l
                    @Override // er.l
                    public final Object b(Object obj) {
                        return q.o(cardListData, (q0) obj);
                    }
                };
                rVarH.v(objE);
            }
            f1.d.c(mVarR, null, d3VarI, false, null, null, null, false, null, (er.l) objE, rVarH, 0, 506);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: w22.m
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return q.p(cardListData, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o(CardListData cardListData, q0 q0Var) {
        m30.m.h(q0Var, cardListData);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p(CardListData cardListData, int i15, p076m2.r rVar, int i16) {
        n(cardListData, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void q(final g gVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(-824567728);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(gVar) : rVarH.G(gVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-824567728, i16, -1, "pl.gov.coi.mobywatel.feature.electronicdelivery.presentation.screens.messagewizard.search.SearchScreen (SearchScreen.kt:33)");
            }
            final f6 f6VarC = m7.b.c(gVar.getState(), null, null, null, rVarH, 0, 7);
            rVar2 = rVarH;
            i50.s.r(r(f6VarC).getBaseScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(1069770755, true, new er.q() { // from class: w22.h
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return q.s(f6VarC, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
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
            d5VarM.a(new er.p() { // from class: w22.i
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return q.v(gVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final g.Data r(f6<g.Data> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s(final f6 f6Var, d3 d3Var, p076m2.r rVar, int i15) {
        float spacing200;
        if ((i15 & 6) == 0) {
            i15 |= rVar.W(d3Var) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1069770755, i15, -1, "pl.gov.coi.mobywatel.feature.electronicdelivery.presentation.screens.messagewizard.search.SearchScreen.<anonymous> (SearchScreen.kt:40)");
            }
            f3.m mVarF = androidx.compose.foundation.layout.d.f(a3.l(f3.m.INSTANCE, d3Var), 0.0f, 1, null);
            if (r(f6Var).getSearchBarData().getIsActive()) {
                rVar.X(883428813);
                spacing200 = k70.a.f108864a.b(rVar, k70.a.f108865b).getZero();
                rVar.R();
            } else {
                rVar.X(883484551);
                spacing200 = k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing200();
                rVar.R();
            }
            f3.m mVarP = a3.p(mVarF, spacing200, 0.0f, 2, null);
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
            f0.A(null, r(f6Var).getSearchBarData(), y2.m.d(1635379887, true, new er.p() { // from class: w22.j
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return q.t(f6Var, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVar, 54), rVar, MLKEMEngine.KyberPolyBytes, 1);
            if (r(f6Var).getSearchBarData().getIsActive()) {
                rVar.X(1154070165);
            } else {
                rVar.X(1156418198);
                n(r(f6Var).getCardListData(), rVar, 0);
            }
            rVar.R();
            rVar.x();
            boolean zW = rVar.W(f6Var);
            Object objE = rVar.E();
            if (zW || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.a() { // from class: w22.k
                    @Override // er.a
                    public final Object a() {
                        return q.u(f6Var);
                    }
                };
                rVar.v(objE);
            }
            p088nul.q0.g(false, (er.a) objE, rVar, 0, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t(f6 f6Var, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1635379887, i15, -1, "pl.gov.coi.mobywatel.feature.electronicdelivery.presentation.screens.messagewizard.search.SearchScreen.<anonymous>.<anonymous>.<anonymous> (SearchScreen.kt:55)");
            }
            j(r(f6Var).getSearchBarData().getQuery(), r(f6Var).getCardListData(), r(f6Var).getEmptyStateData(), rVar, EmptyStateData.f108236d << 6);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u(f6 f6Var) {
        r(f6Var).d().a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v(g gVar, int i15, p076m2.r rVar, int i16) {
        q(gVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
