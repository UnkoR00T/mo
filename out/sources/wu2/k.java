package wu2;

import d1.a3;
import d1.e0;
import d1.h0;
import d1.l1;
import d1.r3;
import d1.x;
import d1.z0;
import j30.ButtonTextData;
import java.util.Iterator;
import java.util.List;
import ju.p0;
import mx.Label;
import oq.i0;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.Function0;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import w0.f3;
import w0.u2;
import w30.CheckBoxSingleData;
import xu2.SummaryElementData;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lwu2/d;", "viewModel", "Loq/i0;", "e", "(Lwu2/d;Lm2/r;I)V", "Lwu2/d$a;", "data", "h", "(Lwu2/d$a;Lm2/r;I)V", "Lxu2/a;", "summaryElementData", "j", "(Lxu2/a;Lm2/r;I)V", "peselrestrictionverification_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class k {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class a extends vq.k implements er.p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f215159e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ d.Data f215160f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ f3 f215161g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(d.Data data, f3 f3Var, tq.e<? super a> eVar) {
            super(2, eVar);
            this.f215160f = data;
            this.f215161g = f3Var;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f215159e;
            if (i15 == 0) {
                oq.u.b(obj);
                if (this.f215160f.getCheckBoxValidationState() instanceof hz.b.Invalid) {
                    f3 f3Var = this.f215161g;
                    int iT = f3Var.t();
                    this.f215159e = 1;
                    if (f3.p(f3Var, iT, null, this, 2, null) == objE) {
                        return objE;
                    }
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
            return new a(this.f215160f, this.f215161g, eVar);
        }
    }

    public static final void e(final d dVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(566519126);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(dVar) : rVarH.G(dVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(566519126, i16, -1, "pl.gov.coi.mobywatel.feature.peselrestrictionverification.presentation.screen.wizard.summary.PeselRestrictionVerificationSummaryScreen (PeselRestrictionVerificationSummaryScreen.kt:36)");
            }
            h(f(m7.b.c(dVar.getState(), null, null, null, rVarH, 0, 7)), rVarH, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: wu2.g
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return k.g(dVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final d.Data f(f6<d.Data> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 g(d dVar, int i15, p076m2.r rVar, int i16) {
        e(dVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void h(d.Data data, p076m2.r rVar, final int i15) {
        int i16;
        final d.Data data2;
        p076m2.r rVarH = rVar.h(1665594579);
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVarH.G(data) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1665594579, i16, -1, "pl.gov.coi.mobywatel.feature.peselrestrictionverification.presentation.screen.wizard.summary.PeselRestrictionVerificationSummaryScreenContent (PeselRestrictionVerificationSummaryScreen.kt:42)");
            }
            f3 f3VarB = u2.b(0, rVarH, 0, 1);
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarF = androidx.compose.foundation.layout.d.f(companion, 0.0f, 1, null);
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            f3.m mVarP = a3.p(w0.i.d(mVarF, aVar.a(rVarH, i17).getBase().a(), null, 2, null), aVar.b(rVarH, i17).getSpacing200(), 0.0f, 2, null);
            d1.i iVar = d1.i.f39152a;
            d1.i.n nVarK = iVar.k();
            f3.c.Companion companion2 = f3.c.INSTANCE;
            w0 w0VarA = e0.a(nVarK, companion2.k(), rVarH, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, mVarP);
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
            f3.m mVarR = a3.r(h0.b(d1.i0.f39176a, t70.i.S(companion, f3VarB, rVarH, 6, 0), 1.0f, false, 2, null), 0.0f, aVar.b(rVarH, i17).getSpacing100(), 0.0f, aVar.b(rVarH, i17).getSpacing200(), 5, null);
            w0 w0VarA2 = e0.a(iVar.k(), companion2.k(), rVarH, 0);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT2 = rVarH.t();
            f3.m mVarE2 = f3.j.e(rVarH, mVarR);
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
            n6.i(rVarC2, w0VarA2, companion3.d());
            n6.i(rVarC2, e0VarT2, companion3.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion3.c());
            n6.g(rVarC2, companion3.a());
            n6.i(rVarC2, mVarE2, companion3.e());
            j70.h.g(null, null, data.getScreenLabel(), null, null, aVar.a(rVarH, i17).getNeutral().i(), 0L, null, null, null, 0L, null, b5.j.h(b5.j.INSTANCE.f()), 0L, 0, false, 0, 0, null, aVar.f(rVarH, i17).q(), null, null, false, false, null, rVarH, 0, 0, 0, 33026011);
            List<SummaryElementData> listG = data.g();
            if (listG == null) {
                rVarH.X(590914293);
                rVarH.R();
            } else {
                rVarH.X(590914294);
                Iterator<T> it = listG.iterator();
                while (it.hasNext()) {
                    j((SummaryElementData) it.next(), rVarH, 0);
                }
                rVarH.R();
                i0 i0Var = i0.f148189a;
            }
            rVarH.X(711802700);
            Iterator<T> it4 = data.f().iterator();
            while (it4.hasNext()) {
                j((SummaryElementData) it4.next(), rVarH, 0);
            }
            rVarH.R();
            f3.m.Companion companion4 = f3.m.INSTANCE;
            k70.a aVar2 = k70.a.f108864a;
            int i18 = k70.a.f108865b;
            r3.a(androidx.compose.foundation.layout.d.i(companion4, aVar2.b(rVarH, i18).getSpacing300()), rVarH, 0);
            j70.h.g(null, null, data.getStatementHeader(), null, null, aVar2.a(rVarH, i18).getNeutral().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVarH, i18).a(), null, null, false, false, null, rVarH, 0, 0, 0, 33030107);
            rVarH = rVarH;
            r3.a(androidx.compose.foundation.layout.d.i(companion4, aVar2.b(rVarH, i18).getSpacing200()), rVarH, 0);
            v30.d.f(data.getCheckBoxData(), rVarH, CheckBoxSingleData.f210090f);
            rVarH.x();
            f3.m mVarP2 = a3.p(companion4, 0.0f, aVar2.b(rVarH, i18).getSpacing200(), 1, null);
            w0 w0VarI = d1.r.i(f3.c.INSTANCE.o(), false);
            int iHashCode3 = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT3 = rVarH.t();
            f3.m mVarE3 = f3.j.e(rVarH, mVarP2);
            androidx.compose.ui.node.c.Companion companion5 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB3 = companion5.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB3);
            } else {
                rVarH.u();
            }
            p076m2.r rVarC3 = n6.c(rVarH);
            n6.i(rVarC3, w0VarI, companion5.d());
            n6.i(rVarC3, e0VarT3, companion5.f());
            n6.i(rVarC3, Integer.valueOf(iHashCode3), companion5.c());
            n6.g(rVarC3, companion5.a());
            n6.i(rVarC3, mVarE3, companion5.e());
            x xVar = x.f39368a;
            h30.q.p(data.getSendButtonData(), false, null, rVarH, 0, 6);
            rVarH.x();
            rVarH.x();
            hz.b checkBoxValidationState = data.getCheckBoxValidationState();
            data2 = data;
            boolean zG = rVarH.G(data2) | rVarH.W(f3VarB);
            Object objE = rVarH.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new a(data2, f3VarB, null);
                rVarH.v(objE);
            }
            Function0.d(checkBoxValidationState, (er.p) objE, rVarH, hz.b.f86845b);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            data2 = data;
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: wu2.h
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return k.i(data2, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(d.Data data, int i15, p076m2.r rVar, int i16) {
        h(data, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void j(final SummaryElementData summaryElementData, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(1579713448);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.W(summaryElementData) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1579713448, i16, -1, "pl.gov.coi.mobywatel.feature.peselrestrictionverification.presentation.screen.wizard.summary.SummaryScreenElement (PeselRestrictionVerificationSummaryScreen.kt:100)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            d1.i iVar = d1.i.f39152a;
            w0 w0VarA = e0.a(iVar.k(), f3.c.INSTANCE.k(), rVarH, 0);
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
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i17).getSpacing200()), rVarH, 0);
            rVar2 = rVarH;
            z0.h(androidx.compose.foundation.layout.d.h(companion, 0.0f, 1, null), iVar.h(), iVar.e(), null, 0, 0, y2.m.d(1034714307, true, new er.q() { // from class: wu2.i
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return k.k(summaryElementData, (l1) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVar2, 1573302, 56);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar2, i17).getSpacing200()), rVar2, 0);
            m30.i.d(summaryElementData.getCardElements(), null, null, rVar2, 0, 6);
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
            d5VarM.a(new er.p() { // from class: wu2.j
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return k.l(summaryElementData, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k(SummaryElementData summaryElementData, l1 l1Var, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 17) != 16, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1034714307, i15, -1, "pl.gov.coi.mobywatel.feature.peselrestrictionverification.presentation.screen.wizard.summary.SummaryScreenElement.<anonymous>.<anonymous> (PeselRestrictionVerificationSummaryScreen.kt:110)");
            }
            Label title = summaryElementData.getTitle();
            k70.a aVar = k70.a.f108864a;
            int i16 = k70.a.f108865b;
            j70.h.g(null, null, title, null, null, aVar.a(rVar, i16).getNeutral().i(), 0L, null, null, null, 0L, null, b5.j.h(b5.j.INSTANCE.f()), 0L, 0, false, 0, 0, null, aVar.f(rVar, i16).a(), null, null, false, false, null, rVar, 0, 0, 0, 33026011);
            j30.f.e(null, new ButtonTextData(null, summaryElementData.getChangeButtonLabel(), null, summaryElementData.getChangeButtonContentDescription(), summaryElementData.d(), 5, null), false, rVar, ButtonTextData.f99099f << 3, 5);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(SummaryElementData summaryElementData, int i15, p076m2.r rVar, int i16) {
        j(summaryElementData, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
