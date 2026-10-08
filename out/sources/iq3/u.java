package iq3;

import d1.a3;
import d1.d3;
import d1.m3;
import d1.p3;
import d1.q3;
import d1.r3;
import f1.b1;
import f1.y0;
import i50.BaseScaffoldData;
import k40.EmptyStateData;
import mx.Label;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.Function0;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p088nul.q0;
import q40.IconPageBottomContentData;
import q40.IconPageData;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\tH\u0003¢\u0006\u0004\b\n\u0010\u000b\u001a\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\tH\u0003¢\u0006\u0004\b\f\u0010\u000b\u001a\u001b\u0010\u000e\u001a\u00020\u0002*\u00020\r2\u0006\u0010\u0006\u001a\u00020\tH\u0003¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001b\u0010\u0010\u001a\u00020\u0002*\u00020\r2\u0006\u0010\u0006\u001a\u00020\tH\u0003¢\u0006\u0004\b\u0010\u0010\u000f\u001a\u0017\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\tH\u0003¢\u0006\u0004\b\u0011\u0010\u000b\u001a\u0017\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\tH\u0003¢\u0006\u0004\b\u0012\u0010\u000b¨\u0006\u0015²\u0006\f\u0010\u0014\u001a\u00020\u00138\nX\u008a\u0084\u0002"}, d2 = {"Liq3/f;", "viewModel", "Loq/i0;", "I", "(Liq3/f;Lm2/r;I)V", "Liq3/f$a$a;", "data", "w", "(Liq3/f$a$a;Lm2/r;I)V", "Liq3/f$a$c;", "E", "(Liq3/f$a$c;Lm2/r;I)V", "z", "Ld1/p3;", "o", "(Ld1/p3;Liq3/f$a$c;Lm2/r;I)V", "q", "u", "s", "Liq3/f$a;", "state", "voteidea_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class u {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class a extends vq.k implements er.p<ju.p0, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f96703e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ y0 f96704f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(y0 y0Var, tq.e<? super a> eVar) {
            super(2, eVar);
            this.f96704f = y0Var;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f96703e;
            if (i15 == 0) {
                oq.u.b(obj);
                y0 y0Var = this.f96704f;
                this.f96703e = 1;
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
            return new a(this.f96704f, eVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 A(final f.a.Initialized initialized, d3 d3Var, p076m2.r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= rVar.W(d3Var) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-219735983, i15, -1, "pl.gov.coi.mobywatel.feature.voteidea.presentation.screens.votelist.VoteIdeaInitializedSearchBarActive.<anonymous> (VoteIdeaListScreen.kt:134)");
            }
            f3.m mVarP = a3.p(a3.l(androidx.compose.foundation.layout.d.f(f3.m.INSTANCE, 0.0f, 1, null), d3Var), k70.a.f108864a.b(rVar, k70.a.f108865b).getZero(), 0.0f, 2, null);
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
            j50.f0.A(null, initialized.getSearchBarData(), y2.m.d(1559637757, true, new er.p() { // from class: iq3.s
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return u.B(initialized, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVar, 54), rVar, MLKEMEngine.KyberPolyBytes, 1);
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
    public static final oq.i0 B(f.a.Initialized initialized, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1559637757, i15, -1, "pl.gov.coi.mobywatel.feature.voteidea.presentation.screens.votelist.VoteIdeaInitializedSearchBarActive.<anonymous>.<anonymous>.<anonymous> (VoteIdeaListScreen.kt:141)");
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
            d1.x xVar = d1.x.f39368a;
            int i17 = BaseScaffoldData.f89350g;
            int i18 = EmptyStateData.f108236d;
            s(initialized, rVar, i17 | i18 | y30.n.Filter.f223689d | i18);
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
    public static final oq.i0 C(f.a.Initialized initialized) {
        initialized.getSearchBarData().c().b(Boolean.FALSE);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 D(f.a.Initialized initialized, int i15, p076m2.r rVar, int i16) {
        z(initialized, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void E(final f.a.Initialized initialized, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(-699429117);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(initialized) : rVarH.G(initialized) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-699429117, i16, -1, "pl.gov.coi.mobywatel.feature.voteidea.presentation.screens.votelist.VoteIdeaInitializedSearchBarInactive (VoteIdeaListScreen.kt:79)");
            }
            final y0 y0VarC = b1.c(0, 0, rVarH, 0, 3);
            rVar2 = rVarH;
            i50.s.r(initialized.getBaseScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-1492444426, true, new er.q() { // from class: iq3.l
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return u.F(initialized, y0VarC, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
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
            d5VarM.a(new er.p() { // from class: iq3.m
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return u.H(initialized, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 F(final f.a.Initialized initialized, y0 y0Var, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1492444426, i16, -1, "pl.gov.coi.mobywatel.feature.voteidea.presentation.screens.votelist.VoteIdeaInitializedSearchBarInactive.<anonymous> (VoteIdeaListScreen.kt:84)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarL = a3.l(androidx.compose.foundation.layout.d.f(companion, 0.0f, 1, null), d3Var);
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            f3.m mVarS = t70.i.S(a3.p(mVarL, aVar.b(rVar, i17).getSpacing200(), 0.0f, 2, null), null, rVar, 0, 1);
            d1.i iVar = d1.i.f39152a;
            d1.i.n nVarK = iVar.k();
            f3.c.Companion companion2 = f3.c.INSTANCE;
            w0 w0VarA = d1.e0.a(nVarK, companion2.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarS);
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
            n6.i(rVarC, w0VarA, companion3.d());
            n6.i(rVarC, e0VarT, companion3.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion3.c());
            n6.g(rVarC, companion3.a());
            n6.i(rVarC, mVarE, companion3.e());
            d1.i0 i0Var = d1.i0.f39176a;
            int i18 = BaseScaffoldData.f89350g;
            int i19 = EmptyStateData.f108236d;
            int i25 = y30.n.Filter.f223689d;
            u(initialized, rVar, i18 | i19 | i25 | i19);
            j50.f0.A(null, initialized.getSearchBarData(), c.f96543a.c(), rVar, MLKEMEngine.KyberPolyBytes, 1);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing200()), rVar, 0);
            f3.m mVarN = a3.n(companion, aVar.b(rVar, i17).getSpacing50());
            w0 w0VarB = m3.b(iVar.j(), companion2.l(), rVar, 0);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT2 = rVar.t();
            f3.m mVarE2 = f3.j.e(rVar, mVarN);
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
            n6.i(rVarC2, w0VarB, companion3.d());
            n6.i(rVarC2, e0VarT2, companion3.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion3.c());
            n6.g(rVarC2, companion3.a());
            n6.i(rVarC2, mVarE2, companion3.e());
            q3 q3Var = q3.f39261a;
            y30.f.c(initialized.getFilters(), y0Var, rVar, i25, 0);
            rVar.x();
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing200()), rVar, 0);
            if (initialized.getIdeas().d().isEmpty()) {
                rVar.X(1297746510);
                f3.m mVarR = a3.r(a3.p(androidx.compose.foundation.layout.d.f(companion, 0.0f, 1, null), aVar.b(rVar, i17).getSpacing300(), 0.0f, 2, null), 0.0f, 0.0f, 0.0f, i50.s.N(), 7, null);
                w0 w0VarI = d1.r.i(companion2.e(), false);
                int iHashCode3 = Long.hashCode(p076m2.m.b(rVar, 0));
                p076m2.e0 e0VarT3 = rVar.t();
                f3.m mVarE3 = f3.j.e(rVar, mVarR);
                er.a<androidx.compose.ui.node.c> aVarB3 = companion3.b();
                if (rVar.l() == null) {
                    p076m2.m.d();
                }
                rVar.K();
                if (rVar.getInserting()) {
                    rVar.H(aVarB3);
                } else {
                    rVar.u();
                }
                p076m2.r rVarC3 = n6.c(rVar);
                n6.i(rVarC3, w0VarI, companion3.d());
                n6.i(rVarC3, e0VarT3, companion3.f());
                n6.i(rVarC3, Integer.valueOf(iHashCode3), companion3.c());
                n6.g(rVarC3, companion3.a());
                n6.i(rVarC3, mVarE3, companion3.e());
                d1.x xVar = d1.x.f39368a;
                k40.d.c(null, initialized.getEmptyIdeasState(), rVar, i19 << 3, 1);
                rVar.x();
                rVar.R();
            } else {
                rVar.X(1298114263);
                m30.i.d(initialized.getIdeas(), null, null, rVar, 0, 6);
                r3.a(androidx.compose.foundation.layout.d.i(companion, i50.s.N()), rVar, 0);
                rVar.R();
            }
            rVar.x();
            boolean zG = rVar.G(initialized);
            Object objE = rVar.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.a() { // from class: iq3.t
                    @Override // er.a
                    public final Object a() {
                        return u.G(initialized);
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
    public static final oq.i0 G(f.a.Initialized initialized) {
        initialized.a().a();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 H(f.a.Initialized initialized, int i15, p076m2.r rVar, int i16) {
        E(initialized, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void I(final f fVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(1763570171);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(fVar) : rVarH.G(fVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1763570171, i16, -1, "pl.gov.coi.mobywatel.feature.voteidea.presentation.screens.votelist.VoteIdeaListScreen (VoteIdeaListScreen.kt:39)");
            }
            f.a aVarJ = J(m7.b.c(fVar.getState(), null, null, null, rVarH, 0, 7));
            if (fr.t.c(aVarJ, f.a.b.f96577a)) {
                rVarH.X(-1721141057);
                rVarH.R();
            } else if (aVarJ instanceof f.a.Initialized) {
                rVarH.X(-1721138946);
                f.a.Initialized initialized = (f.a.Initialized) aVarJ;
                if (initialized.getSearchBarData().getIsActive()) {
                    rVarH.X(-1815670198);
                    z(initialized, rVarH, 0);
                    rVarH.R();
                } else {
                    rVarH.X(-1815603672);
                    E(initialized, rVarH, 0);
                    rVarH.R();
                }
                rVarH.R();
            } else {
                if (!(aVarJ instanceof f.a.Empty)) {
                    rVarH.X(-1721143073);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(-1721132196);
                w((f.a.Empty) aVarJ, rVarH, 0);
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
            d5VarM.a(new er.p() { // from class: iq3.g
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return u.K(fVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final f.a J(f6<? extends f.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 K(f fVar, int i15, p076m2.r rVar, int i16) {
        I(fVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void o(final p3 p3Var, final f.a.Initialized initialized, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(1905875888);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.W(p3Var) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= (i15 & 64) == 0 ? rVarH.W(initialized) : rVarH.G(initialized) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1905875888, i16, -1, "pl.gov.coi.mobywatel.feature.voteidea.presentation.screens.votelist.NewTopContent (VoteIdeaListScreen.kt:161)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVarH, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, companion);
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
            Label roundVoteLabel = initialized.getRoundVoteLabel();
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            rVar2 = rVarH;
            j70.h.g(null, null, roundVoteLabel, null, null, aVar.a(rVarH, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i17).a(), null, null, false, false, null, rVar2, 0, 0, 0, 33030107);
            j70.h.g(null, null, initialized.getVoteDaysLeftLabel(), null, null, aVar.a(rVar2, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar2, i17).d(), null, null, false, false, null, rVar2, 0, 0, 0, 33030107);
            rVar2.x();
            r3.a(p3.c(p3Var, companion, 1.0f, false, 2, null), rVar2, 0);
            h30.q.p(initialized.getResultsButtonData(), false, null, rVar2, 0, 6);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: iq3.k
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return u.p(p3Var, initialized, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 p(p3 p3Var, f.a.Initialized initialized, int i15, p076m2.r rVar, int i16) {
        o(p3Var, initialized, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void q(final p3 p3Var, final f.a.Initialized initialized, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(1365468663);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.W(p3Var) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= (i15 & 64) == 0 ? rVarH.W(initialized) : rVarH.G(initialized) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1365468663, i16, -1, "pl.gov.coi.mobywatel.feature.voteidea.presentation.screens.votelist.OldTopContent (VoteIdeaListScreen.kt:183)");
            }
            Label roundVoteLabel = initialized.getRoundVoteLabel();
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            rVar2 = rVarH;
            j70.h.g(null, null, roundVoteLabel, null, null, aVar.a(rVarH, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i17).a(), null, null, false, false, null, rVar2, 0, 0, 0, 33030107);
            r3.a(p3.c(p3Var, f3.m.INSTANCE, 1.0f, false, 2, null), rVar2, 0);
            j70.h.g(null, null, initialized.getVoteDaysLeftLabel(), null, null, aVar.a(rVar2, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar2, i17).d(), null, null, false, false, null, rVar2, 0, 0, 0, 33030107);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: iq3.j
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return u.r(p3Var, initialized, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 r(p3 p3Var, f.a.Initialized initialized, int i15, p076m2.r rVar, int i16) {
        q(p3Var, initialized, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void s(final f.a.Initialized initialized, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1152201208);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(initialized) : rVarH.G(initialized) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1152201208, i16, -1, "pl.gov.coi.mobywatel.feature.voteidea.presentation.screens.votelist.SearchBarActiveContent (VoteIdeaListScreen.kt:225)");
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
            m30.m.d(initialized.getSearchedIdeas(), y0VarC, rVarH, 0, 0);
            if (initialized.getSearchedIdeas().d().isEmpty()) {
                rVarH.X(152822476);
                f3.m mVarR = a3.r(androidx.compose.foundation.layout.d.f(f3.m.INSTANCE, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing200(), 7, null);
                w0 w0VarA = d1.e0.a(d1.i.f39152a.e(), f3.c.INSTANCE.g(), rVarH, 54);
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
                k40.d.c(null, initialized.getSearchedNotFoundEmptyState(), rVarH, EmptyStateData.f108236d << 3, 1);
                rVarH.x();
            } else {
                rVarH.X(145211418);
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
            d5VarM.a(new er.p() { // from class: iq3.h
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return u.t(initialized, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 t(f.a.Initialized initialized, int i15, p076m2.r rVar, int i16) {
        s(initialized, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void u(final f.a.Initialized initialized, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(1868057012);
        if ((i15 & 6) == 0) {
            i16 = i15 | ((i15 & 8) == 0 ? rVarH.W(initialized) : rVarH.G(initialized) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1868057012, i16, -1, "pl.gov.coi.mobywatel.feature.voteidea.presentation.screens.votelist.TopContentInitialized (VoteIdeaListScreen.kt:200)");
            }
            if (initialized.getSearchBarData().getIsActive()) {
                rVarH.X(1388760078);
            } else {
                rVarH.X(1395331737);
                f3.m.Companion companion = f3.m.INSTANCE;
                d1.i iVar = d1.i.f39152a;
                d1.i.n nVarK = iVar.k();
                f3.c.Companion companion2 = f3.c.INSTANCE;
                w0 w0VarA = d1.e0.a(nVarK, companion2.k(), rVarH, 0);
                int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
                p076m2.e0 e0VarT = rVarH.t();
                f3.m mVarE = f3.j.e(rVarH, companion);
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
                k70.a aVar = k70.a.f108864a;
                int i17 = k70.a.f108865b;
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i17).getSpacing100()), rVarH, 0);
                w0 w0VarB = m3.b(iVar.j(), companion2.l(), rVarH, 0);
                int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, 0));
                p076m2.e0 e0VarT2 = rVarH.t();
                f3.m mVarE2 = f3.j.e(rVarH, companion);
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
                n6.i(rVarC2, w0VarB, companion3.d());
                n6.i(rVarC2, e0VarT2, companion3.f());
                n6.i(rVarC2, Integer.valueOf(iHashCode2), companion3.c());
                n6.g(rVarC2, companion3.a());
                n6.i(rVarC2, mVarE2, companion3.e());
                q3 q3Var = q3.f39261a;
                if (initialized.getShouldShowNewContent()) {
                    rVarH.X(1411676265);
                    int i18 = BaseScaffoldData.f89350g;
                    int i19 = EmptyStateData.f108236d;
                    o(q3Var, initialized, rVarH, ((i16 << 3) & 112) | ((((i18 | i19) | y30.n.Filter.f223689d) | i19) << 3) | 6);
                    rVarH.R();
                } else {
                    rVarH.X(1411791337);
                    int i25 = BaseScaffoldData.f89350g;
                    int i26 = EmptyStateData.f108236d;
                    q(q3Var, initialized, rVarH, ((i16 << 3) & 112) | ((((i25 | i26) | y30.n.Filter.f223689d) | i26) << 3) | 6);
                    rVarH.R();
                }
                rVarH.x();
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i17).getSpacing100()), rVarH, 0);
                j70.h.g(null, null, initialized.getInfoLabel(), null, null, aVar.a(rVarH, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i17).d(), null, null, false, false, null, rVarH, 0, 0, 0, 33030107);
                rVarH = rVarH;
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i17).getSpacing200()), rVarH, 0);
                rVarH.x();
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
            d5VarM.a(new er.p() { // from class: iq3.i
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return u.v(initialized, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 v(f.a.Initialized initialized, int i15, p076m2.r rVar, int i16) {
        u(initialized, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void w(final f.a.Empty empty, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(-1529385018);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(empty) : rVarH.G(empty) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1529385018, i16, -1, "pl.gov.coi.mobywatel.feature.voteidea.presentation.screens.votelist.VoteIdeaEmptyContent (VoteIdeaListScreen.kt:54)");
            }
            rVar2 = rVarH;
            i50.s.r(empty.getBaseScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(755790841, true, new er.q() { // from class: iq3.n
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return u.x(empty, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
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
            d5VarM.a(new er.p() { // from class: iq3.o
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return u.y(empty, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 x(f.a.Empty empty, d3 d3Var, p076m2.r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= rVar.W(d3Var) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(755790841, i15, -1, "pl.gov.coi.mobywatel.feature.voteidea.presentation.screens.votelist.VoteIdeaEmptyContent.<anonymous> (VoteIdeaListScreen.kt:58)");
            }
            f3.m mVarL = a3.l(f3.m.INSTANCE, d3Var);
            w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
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
            q40.i.b(empty.b(), null, c.f96543a.d(), rVar, IconPageData.f164667h | IconPageBottomContentData.f164663d | MLKEMEngine.KyberPolyBytes, 2);
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
    public static final oq.i0 y(f.a.Empty empty, int i15, p076m2.r rVar, int i16) {
        w(empty, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void z(final f.a.Initialized initialized, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1327289442);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(initialized) : rVarH.G(initialized) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1327289442, i16, -1, "pl.gov.coi.mobywatel.feature.voteidea.presentation.screens.votelist.VoteIdeaInitializedSearchBarActive (VoteIdeaListScreen.kt:130)");
            }
            int i17 = i16;
            i50.s.r(initialized.getBaseScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-219735983, true, new er.q() { // from class: iq3.p
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return u.A(initialized, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVarH, BaseScaffoldData.f89350g, 196608, 32766);
            rVarH = rVarH;
            boolean z15 = (i17 & 14) == 4 || ((i17 & 8) != 0 && rVarH.G(initialized));
            Object objE = rVarH.E();
            if (z15 || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.a() { // from class: iq3.q
                    @Override // er.a
                    public final Object a() {
                        return u.C(initialized);
                    }
                };
                rVarH.v(objE);
            }
            q0.g(false, (er.a) objE, rVarH, 0, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: iq3.r
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return u.D(initialized, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
