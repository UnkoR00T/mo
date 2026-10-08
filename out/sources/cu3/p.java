package cu3;

import d1.a3;
import d1.d3;
import d1.e0;
import f1.b1;
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
import p088nul.q0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a'\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0003¢\u0006\u0004\b\u000b\u0010\f\u001a\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0011²\u0006\f\u0010\u0010\u001a\u00020\u000f8\nX\u008a\u0084\u0002"}, d2 = {"Lcu3/f;", "viewModel", "Loq/i0;", "g", "(Lcu3/f;Lm2/r;I)V", "", "query", "Ln30/b;", "cardListData", "Lk40/a;", "emptyStateData", "m", "(Ljava/lang/String;Ln30/b;Lk40/a;Lm2/r;I)V", "o", "(Ln30/b;Lm2/r;I)V", "Lcu3/f$a;", "state", "addressform_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class p {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class a extends vq.k implements er.p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f38072e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ y0 f38073f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(y0 y0Var, tq.e<? super a> eVar) {
            super(2, eVar);
            this.f38073f = y0Var;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f38072e;
            if (i15 == 0) {
                oq.u.b(obj);
                y0 y0Var = this.f38073f;
                this.f38072e = 1;
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
            return new a(this.f38073f, eVar);
        }
    }

    public static final void g(final f fVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(1535227292);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(fVar) : rVarH.G(fVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1535227292, i16, -1, "pl.gov.coi.mobywatel.segment.addressform.presentation.search.AddressSearchScreen (AddressSearchScreen.kt:33)");
            }
            final f6 f6VarC = m7.b.c(fVar.getState(), null, null, null, rVarH, 0, 7);
            rVar2 = rVarH;
            i50.s.r(h(f6VarC).getBaseScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(1681348169, true, new er.q() { // from class: cu3.j
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return p.i(f6VarC, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
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
            d5VarM.a(new er.p() { // from class: cu3.k
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return p.l(fVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final f.Data h(f6<f.Data> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(final f6 f6Var, d3 d3Var, p076m2.r rVar, int i15) {
        float spacing200;
        if ((i15 & 6) == 0) {
            i15 |= rVar.W(d3Var) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1681348169, i15, -1, "pl.gov.coi.mobywatel.segment.addressform.presentation.search.AddressSearchScreen.<anonymous> (AddressSearchScreen.kt:39)");
            }
            f3.m mVarF = androidx.compose.foundation.layout.d.f(f3.m.INSTANCE, 0.0f, 1, null);
            k70.a aVar = k70.a.f108864a;
            int i16 = k70.a.f108865b;
            f3.m mVarL = a3.l(w0.i.d(mVarF, aVar.a(rVar, i16).getBase().a(), null, 2, null), d3Var);
            if (h(f6Var).getSearchState().getIsActive()) {
                rVar.X(1134958183);
                spacing200 = aVar.b(rVar, i16).getZero();
                rVar.R();
            } else {
                rVar.X(1135013921);
                spacing200 = aVar.b(rVar, i16).getSpacing200();
                rVar.R();
            }
            f3.m mVarP = a3.p(mVarL, spacing200, 0.0f, 2, null);
            w0 w0VarA = e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
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
            f0.A(null, h(f6Var).getSearchState(), y2.m.d(735662365, true, new er.p() { // from class: cu3.l
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return p.j(f6Var, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVar, 54), rVar, MLKEMEngine.KyberPolyBytes, 1);
            if (h(f6Var).getSearchState().getIsActive()) {
                rVar.X(1955237603);
            } else {
                rVar.X(1957583652);
                o(h(f6Var).getCardListData(), rVar, 0);
            }
            rVar.R();
            rVar.x();
            boolean zW = rVar.W(f6Var);
            Object objE = rVar.E();
            if (zW || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.a() { // from class: cu3.m
                    @Override // er.a
                    public final Object a() {
                        return p.k(f6Var);
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
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j(f6 f6Var, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(735662365, i15, -1, "pl.gov.coi.mobywatel.segment.addressform.presentation.search.AddressSearchScreen.<anonymous>.<anonymous>.<anonymous> (AddressSearchScreen.kt:55)");
            }
            m(h(f6Var).getSearchState().getQuery(), h(f6Var).getCardListData(), h(f6Var).getEmptyStateData(), rVar, EmptyStateData.f108236d << 6);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k(f6 f6Var) {
        h(f6Var).d().a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(f fVar, int i15, p076m2.r rVar, int i16) {
        g(fVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private static final void m(final String str, final CardListData cardListData, final EmptyStateData emptyStateData, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1544850145);
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
        if (rVarH.r((i16 & 147) != 146, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1544850145, i16, -1, "pl.gov.coi.mobywatel.segment.addressform.presentation.search.SearchBarActiveContent (AddressSearchScreen.kt:79)");
            }
            y0 y0VarC = b1.c(0, 0, rVarH, 0, 3);
            boolean zW = rVarH.W(y0VarC);
            Object objE = rVarH.E();
            if (zW || objE == p076m2.r.INSTANCE.a()) {
                objE = new a(y0VarC, null);
                rVarH.v(objE);
            }
            Function0.d(str, (er.p) objE, rVarH, i16 & 14);
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarN = a3.n(androidx.compose.foundation.layout.d.f(companion, 0.0f, 1, null), k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing200());
            f3.c.Companion companion2 = f3.c.INSTANCE;
            w0 w0VarI = d1.r.i(companion2.o(), false);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, mVarN);
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
            n6.i(rVarC, w0VarI, companion3.d());
            n6.i(rVarC, e0VarT, companion3.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion3.c());
            n6.g(rVarC, companion3.a());
            n6.i(rVarC, mVarE, companion3.e());
            d1.x xVar = d1.x.f39368a;
            int i17 = i16 >> 3;
            m30.m.d(cardListData, y0VarC, rVarH, i17 & 14, 0);
            if (cardListData.d().isEmpty()) {
                rVarH.X(891330174);
                f3.m mVarF = androidx.compose.foundation.layout.d.f(companion, 0.0f, 1, null);
                w0 w0VarA = e0.a(d1.i.f39152a.e(), companion2.g(), rVarH, 54);
                int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, 0));
                p076m2.e0 e0VarT2 = rVarH.t();
                f3.m mVarE2 = f3.j.e(rVarH, mVarF);
                er.a<androidx.compose.ui.node.c> aVarB2 = companion3.b();
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
                n6.i(rVarC2, w0VarA, companion3.d());
                n6.i(rVarC2, e0VarT2, companion3.f());
                n6.i(rVarC2, Integer.valueOf(iHashCode2), companion3.c());
                n6.g(rVarC2, companion3.a());
                n6.i(rVarC2, mVarE2, companion3.e());
                d1.i0 i0Var = d1.i0.f39176a;
                k40.d.c(null, emptyStateData, rVarH, (i17 & 112) | (EmptyStateData.f108236d << 3), 1);
                rVarH.x();
            } else {
                rVarH.X(888313533);
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
            d5VarM.a(new er.p() { // from class: cu3.o
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return p.n(str, cardListData, emptyStateData, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n(String str, CardListData cardListData, EmptyStateData emptyStateData, int i15, p076m2.r rVar, int i16) {
        m(str, cardListData, emptyStateData, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private static final void o(final CardListData cardListData, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1868489842);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.W(cardListData) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1868489842, i16, -1, "pl.gov.coi.mobywatel.segment.addressform.presentation.search.SearchInactiveContent (AddressSearchScreen.kt:112)");
            }
            f3.m mVarP = a3.p(androidx.compose.foundation.layout.d.f(f3.m.INSTANCE, 0.0f, 1, null), 0.0f, k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing300(), 1, null);
            w0 w0VarI = d1.r.i(f3.c.INSTANCE.o(), false);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, mVarP);
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
            m30.m.d(cardListData, null, rVarH, i16 & 14, 2);
            rVarH.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: cu3.n
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return p.p(cardListData, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p(CardListData cardListData, int i15, p076m2.r rVar, int i16) {
        o(cardListData, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
