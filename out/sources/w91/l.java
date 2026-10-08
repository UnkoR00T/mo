package w91;

import d1.a3;
import d1.d3;
import d1.m3;
import d1.q3;
import d1.r3;
import i50.BaseScaffoldData;
import n30.CardListData;
import p071kotlin.Metadata;
import p076m2.Function0;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import q40.IconPageBottomContentData;
import q40.IconPageData;
import t40.InfoRowListData;
import w30.CheckBoxSingleData;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\fH\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lw91/d;", "viewModel", "Loq/i0;", "n", "(Lw91/d;Lm2/r;I)V", "Lw91/d$a;", "screenData", "h", "(Lw91/d$a;Lm2/r;I)V", "Lw91/d$a$c;", "j", "(Lw91/d$a$c;Lm2/r;I)V", "Lw91/d$a$d;", "q", "(Lw91/d$a$d;Lm2/r;I)V", "childpassportapplication_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class l {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class a extends vq.k implements er.p<ju.p0, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f211393e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ d.a.Initialized f211394f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ j1.a f211395g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(d.a.Initialized initialized, j1.a aVar, tq.e<? super a> eVar) {
            super(2, eVar);
            this.f211394f = initialized;
            this.f211395g = aVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f211393e;
            if (i15 == 0) {
                oq.u.b(obj);
                if (this.f211394f.getScrollToStatementCheckBox()) {
                    j1.a aVar = this.f211395g;
                    this.f211393e = 1;
                    if (j1.a.a(aVar, null, this, 1, null) == objE) {
                        return objE;
                    }
                }
                return oq.i0.f148189a;
            }
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            this.f211394f.n().a();
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ju.p0 p0Var, tq.e<? super oq.i0> eVar) {
            return ((a) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return new a(this.f211394f, this.f211395g, eVar);
        }
    }

    public static final void h(final d.a aVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(2029366952);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(aVar) : rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(2029366952, i16, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.summary.ChildPassportApplicationSummaryContent (ChildPassportApplicationSummaryScreen.kt:44)");
            }
            if (fr.t.c(aVar, d.a.b.f211327a)) {
                rVarH.X(306494585);
                c60.b.b(rVarH, 0);
                rVarH.R();
            } else if (aVar instanceof d.a.Error) {
                rVarH.X(306497744);
                ((d.a.Error) aVar).getErrorVMS().b(rVarH, 0);
                rVarH.R();
            } else if (aVar instanceof d.a.Initialized) {
                rVarH.X(306500251);
                j((d.a.Initialized) aVar, rVarH, i16 & 14);
                rVarH.R();
            } else {
                if (!(aVar instanceof d.a.Success)) {
                    rVarH.X(306492491);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(306504951);
                q((d.a.Success) aVar, rVarH, i16 & 14);
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
            d5VarM.a(new er.p() { // from class: w91.f
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return l.i(aVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 i(d.a aVar, int i15, p076m2.r rVar, int i16) {
        h(aVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void j(final d.a.Initialized initialized, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1625801440);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(initialized) : rVarH.G(initialized) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1625801440, i16, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.summary.ChildPassportApplicationSummaryInitializedContent (ChildPassportApplicationSummaryScreen.kt:58)");
            }
            Object objE = rVarH.E();
            p076m2.r.Companion companion = p076m2.r.INSTANCE;
            if (objE == companion.a()) {
                objE = j1.e.a();
                rVarH.v(objE);
            }
            final j1.a aVar = (j1.a) objE;
            Boolean boolValueOf = Boolean.valueOf(initialized.getScrollToStatementCheckBox());
            boolean zG = rVarH.G(initialized) | rVarH.G(aVar);
            Object objE2 = rVarH.E();
            if (zG || objE2 == companion.a()) {
                objE2 = new a(initialized, aVar, null);
                rVarH.v(objE2);
            }
            Function0.d(boolValueOf, (er.p) objE2, rVarH, 0);
            i50.s.r(initialized.getBaseScaffoldData(), y2.m.d(207787215, true, new er.p() { // from class: w91.i
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return l.k(initialized, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-490852153, true, new er.q() { // from class: w91.j
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return l.l(initialized, initialized, aVar, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVarH, BaseScaffoldData.f89350g | 48, 196608, 32764);
            rVarH = rVarH;
            p088nul.q0.g(false, initialized.m(), rVarH, 0, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: w91.k
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return l.m(initialized, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 k(d.a.Initialized initialized, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(207787215, i15, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.summary.ChildPassportApplicationSummaryInitializedContent.<anonymous>.<anonymous> (ChildPassportApplicationSummaryScreen.kt:69)");
            }
            f3.m mVarN = a3.n(f3.m.INSTANCE, k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing200());
            p036e4.w0 w0VarB = m3.b(d1.i.f39152a.j(), f3.c.INSTANCE.l(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarN);
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
            n6.i(rVarC, w0VarB, companion.d());
            n6.i(rVarC, e0VarT, companion.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
            n6.g(rVarC, companion.a());
            n6.i(rVarC, mVarE, companion.e());
            q3 q3Var = q3.f39261a;
            h30.q.p(initialized.getSendButtonData(), false, null, rVar, 0, 6);
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
    public static final oq.i0 l(d.a.Initialized initialized, d.a.Initialized initialized2, j1.a aVar, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-490852153, i16, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.summary.ChildPassportApplicationSummaryInitializedContent.<anonymous>.<anonymous> (ChildPassportApplicationSummaryScreen.kt:74)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarL = a3.l(androidx.compose.foundation.layout.d.f(companion, 0.0f, 1, null), d3Var);
            k70.a aVar2 = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            f3.m mVarS = t70.i.S(a3.p(mVarL, aVar2.b(rVar, i17).getSpacing200(), 0.0f, 2, null), null, rVar, 0, 1);
            d1.i.n nVarK = d1.i.f39152a.k();
            f3.c.Companion companion2 = f3.c.INSTANCE;
            p036e4.w0 w0VarA = d1.e0.a(nVarK, companion2.k(), rVar, 0);
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
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar2.b(rVar, i17).getSpacing100()), rVar, 0);
            j70.h.g(null, null, initialized.getHeaderLabel(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVar, i17).i(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar2.b(rVar, i17).getSpacing300()), rVar, 0);
            m30.i.d(initialized.getOfficeCardListData(), null, null, rVar, 0, 6);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar2.b(rVar, i17).getSpacing300()), rVar, 0);
            j70.h.g(null, null, initialized.getParentSectionTitleLabel(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVar, i17).j(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar2.b(rVar, i17).getSpacing200()), rVar, 0);
            m30.i.d(initialized.getParentCardListData(), null, null, rVar, 0, 6);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar2.b(rVar, i17).getSpacing300()), rVar, 0);
            j70.h.g(null, null, initialized.getChildSectionTitleLabel(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVar, i17).j(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar2.b(rVar, i17).getSpacing200()), rVar, 0);
            m30.i.d(initialized.getChildCardListData(), null, null, rVar, 0, 6);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar2.b(rVar, i17).getSpacing300()), rVar, 0);
            j70.h.g(null, null, initialized.getCorrespondenceAddressTitleLabel(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVar, i17).j(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
            p076m2.r rVar2 = rVar;
            k70.a aVar3 = aVar2;
            int i18 = i17;
            f3.m.Companion companion4 = companion;
            int i19 = 0;
            r3.a(androidx.compose.foundation.layout.d.i(companion4, aVar3.b(rVar2, i18).getSpacing200()), rVar2, 0);
            m30.i.d(initialized.getCorrespondenceAddressCardListData(), null, null, rVar2, 0, 6);
            CardListData contactCardListData = initialized.getContactCardListData();
            if (contactCardListData == null) {
                rVar2.X(-534982435);
            } else {
                rVar2.X(-534982434);
                r3.a(androidx.compose.foundation.layout.d.i(companion4, aVar3.b(rVar2, i18).getSpacing300()), rVar2, 0);
                j70.h.g(null, null, initialized.getContactTitleLabel(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar3.f(rVar2, i18).j(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
                rVar2 = rVar;
                aVar3 = aVar3;
                i18 = i18;
                companion4 = companion4;
                i19 = 0;
                r3.a(androidx.compose.foundation.layout.d.i(companion4, aVar3.b(rVar2, i18).getSpacing200()), rVar2, 0);
                m30.i.d(contactCardListData, null, null, rVar2, 0, 6);
                oq.i0 i0Var2 = oq.i0.f148189a;
            }
            rVar2.R();
            r3.a(androidx.compose.foundation.layout.d.i(companion4, aVar3.b(rVar2, i18).getSpacing300()), rVar2, i19);
            j70.h.g(null, null, initialized.getPaymentTitleLabel(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar3.f(rVar2, i18).j(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
            p076m2.r rVar3 = rVar;
            k70.a aVar4 = aVar3;
            int i25 = i18;
            f3.m.Companion companion5 = companion4;
            int i26 = 0;
            r3.a(androidx.compose.foundation.layout.d.i(companion5, aVar4.b(rVar3, i25).getSpacing200()), rVar3, 0);
            m30.i.d(initialized.getPaymentCardListData(), null, null, rVar3, 0, 6);
            CardListData pickupMethodCardListData = initialized.getPickupMethodCardListData();
            if (pickupMethodCardListData == null) {
                rVar3.X(-534342130);
            } else {
                rVar3.X(-534342129);
                r3.a(androidx.compose.foundation.layout.d.i(companion5, aVar4.b(rVar3, i25).getSpacing300()), rVar3, 0);
                j70.h.g(null, null, initialized.getPickupMethodTitleLabel(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar4.f(rVar3, i25).j(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
                rVar3 = rVar;
                aVar4 = aVar4;
                i25 = i25;
                companion5 = companion5;
                i26 = 0;
                r3.a(androidx.compose.foundation.layout.d.i(companion5, aVar4.b(rVar3, i25).getSpacing200()), rVar3, 0);
                m30.i.d(pickupMethodCardListData, null, null, rVar3, 0, 6);
                oq.i0 i0Var3 = oq.i0.f148189a;
            }
            rVar3.R();
            if (initialized.getAttachmentsCardListData().d().isEmpty()) {
                rVar3.X(-539632155);
            } else {
                rVar3.X(-533939222);
                r3.a(androidx.compose.foundation.layout.d.i(companion5, aVar4.b(rVar3, i25).getSpacing300()), rVar3, i26);
                j70.h.g(null, null, initialized.getAttachmentsSectionTitleLabel(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar4.f(rVar3, i25).j(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
                rVar3 = rVar;
                aVar4 = aVar4;
                i25 = i25;
                companion5 = companion5;
                i26 = 0;
                r3.a(androidx.compose.foundation.layout.d.i(companion5, aVar4.b(rVar3, i25).getSpacing200()), rVar3, 0);
                m30.i.d(initialized.getAttachmentsCardListData(), null, null, rVar3, 0, 6);
            }
            rVar3.R();
            CheckBoxSingleData statementCheckBoxSingleData = initialized.getStatementCheckBoxSingleData();
            if (statementCheckBoxSingleData == null) {
                rVar3.X(-533586133);
            } else {
                rVar3.X(-533586132);
                r3.a(androidx.compose.foundation.layout.d.i(companion5, aVar4.b(rVar3, i25).getSpacing300()), rVar3, i26);
                j70.h.g(null, null, initialized.getStatementSectionTitleLabel(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar4.f(rVar3, i25).j(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
                rVar3 = rVar;
                aVar4 = aVar4;
                i25 = i25;
                companion5 = companion5;
                i26 = 0;
                r3.a(androidx.compose.foundation.layout.d.i(companion5, aVar4.b(rVar3, i25).getSpacing200()), rVar3, 0);
                f3.m mVarB = j1.e.b(companion5, aVar);
                p036e4.w0 w0VarI = d1.r.i(companion2.o(), false);
                int iHashCode2 = Long.hashCode(p076m2.m.b(rVar3, 0));
                p076m2.e0 e0VarT2 = rVar3.t();
                f3.m mVarE2 = f3.j.e(rVar3, mVarB);
                er.a<androidx.compose.ui.node.c> aVarB2 = companion3.b();
                if (rVar3.l() == null) {
                    p076m2.m.d();
                }
                rVar3.K();
                if (rVar3.getInserting()) {
                    rVar3.H(aVarB2);
                } else {
                    rVar3.u();
                }
                p076m2.r rVarC2 = n6.c(rVar3);
                n6.i(rVarC2, w0VarI, companion3.d());
                n6.i(rVarC2, e0VarT2, companion3.f());
                n6.i(rVarC2, Integer.valueOf(iHashCode2), companion3.c());
                n6.g(rVarC2, companion3.a());
                n6.i(rVarC2, mVarE2, companion3.e());
                d1.x xVar = d1.x.f39368a;
                v30.d.f(statementCheckBoxSingleData, rVar3, CheckBoxSingleData.f210090f);
                rVar3.x();
                oq.i0 i0Var4 = oq.i0.f148189a;
            }
            rVar3.R();
            r3.a(androidx.compose.foundation.layout.d.i(companion5, aVar4.b(rVar3, i25).getSpacing300()), rVar3, i26);
            c30.e.c(null, initialized2.getAlertData(), rVar3, c30.b.f22944i << 3, 1);
            r3.a(androidx.compose.foundation.layout.d.i(companion5, aVar4.b(rVar3, i25).getSpacing200()), rVar3, i26);
            rVar3.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 m(d.a.Initialized initialized, int i15, p076m2.r rVar, int i16) {
        j(initialized, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void n(final d dVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1886543241);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(dVar) : rVarH.G(dVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1886543241, i16, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.summary.ChildPassportApplicationSummaryScreen (ChildPassportApplicationSummaryScreen.kt:36)");
            }
            h(o(m7.b.c(dVar.getState(), null, null, null, rVarH, 0, 7)), rVarH, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: w91.e
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return l.p(dVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final d.a o(f6<? extends d.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 p(d dVar, int i15, p076m2.r rVar, int i16) {
        n(dVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void q(final d.a.Success success, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(1515949504);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(success) : rVarH.G(success) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1515949504, i16, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.summary.ChildPassportApplicationSummarySuccessContent (ChildPassportApplicationSummaryScreen.kt:144)");
            }
            rVar2 = rVarH;
            i50.s.r(success.getBaseScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-1050057514, true, new er.q() { // from class: w91.g
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return l.r(success, success, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
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
            d5VarM.a(new er.p() { // from class: w91.h
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return l.s(success, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 r(d.a.Success success, d.a.Success success2, d3 d3Var, p076m2.r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= rVar.W(d3Var) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1050057514, i15, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.summary.ChildPassportApplicationSummarySuccessContent.<anonymous>.<anonymous> (ChildPassportApplicationSummaryScreen.kt:148)");
            }
            f3.m mVarL = a3.l(androidx.compose.foundation.layout.d.f(f3.m.INSTANCE, 0.0f, 1, null), d3Var);
            p036e4.w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
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
            IconPageData<InfoRowListData, IconPageBottomContentData> iconPageDataB = success2.b();
            j1 j1Var = j1.f211387a;
            q40.i.b(iconPageDataB, j1Var.d(), j1Var.e(), rVar, IconPageData.f164667h | InfoRowListData.f187643b | IconPageBottomContentData.f164663d | 432, 0);
            rVar.x();
            p088nul.q0.g(false, success.c(), rVar, 0, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 s(d.a.Success success, int i15, p076m2.r rVar, int i16) {
        q(success, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }
}
