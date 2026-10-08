package fq2;

import d1.a3;
import d1.d3;
import d1.m3;
import d1.q3;
import d1.r3;
import i50.BaseScaffoldData;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p071kotlin.Metadata;
import p076m2.Function0;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import q40.IconPageBottomContentData;
import q40.IconPageData;
import w30.CheckBoxSingleData;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\fH\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lfq2/e;", "viewModel", "Loq/i0;", "l", "(Lfq2/e;Lm2/r;I)V", "Lfq2/e$a;", "screenData", "g", "(Lfq2/e$a;Lm2/r;I)V", "Lfq2/e$a$c;", "i", "(Lfq2/e$a$c;Lm2/r;I)V", "Lfq2/e$a$d;", "o", "(Lfq2/e$a$d;Lm2/r;I)V", "passportagreement_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class l {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class a extends vq.k implements er.p<ju.p0, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f66233e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ e.a.Initialized f66234f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ j1.a f66235g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(e.a.Initialized initialized, j1.a aVar, tq.e<? super a> eVar) {
            super(2, eVar);
            this.f66234f = initialized;
            this.f66235g = aVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f66233e;
            if (i15 == 0) {
                oq.u.b(obj);
                if (this.f66234f.getScrollToStatementCheckBox()) {
                    j1.a aVar = this.f66235g;
                    this.f66233e = 1;
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
            this.f66234f.j().a();
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ju.p0 p0Var, tq.e<? super oq.i0> eVar) {
            return ((a) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return new a(this.f66234f, this.f66235g, eVar);
        }
    }

    public static final void g(final e.a aVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(2142716122);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(aVar) : rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(2142716122, i16, -1, "pl.gov.coi.mobywatel.feature.passportagreement.presentation.summary.PassportAgreementSummaryContent (PassportAgreementSummaryScreen.kt:40)");
            }
            if (fr.t.c(aVar, e.a.b.f66188a)) {
                rVarH.X(1860863723);
                c60.b.b(rVarH, 0);
                rVarH.R();
            } else if (aVar instanceof e.a.Error) {
                rVarH.X(1860866658);
                ((e.a.Error) aVar).getErrorVMS().b(rVarH, 0);
                rVarH.R();
            } else if (aVar instanceof e.a.Initialized) {
                rVarH.X(1860868934);
                i((e.a.Initialized) aVar, rVarH, i16 & 14);
                rVarH.R();
            } else {
                if (!(aVar instanceof e.a.Success)) {
                    rVarH.X(1860861802);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(1860873177);
                o((e.a.Success) aVar, rVarH, i16 & 14);
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
            d5VarM.a(new er.p() { // from class: fq2.g
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return l.h(aVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 h(e.a aVar, int i15, p076m2.r rVar, int i16) {
        g(aVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void i(final e.a.Initialized initialized, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(1698411474);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(initialized) : rVarH.G(initialized) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1698411474, i16, -1, "pl.gov.coi.mobywatel.feature.passportagreement.presentation.summary.PassportAgreementSummaryInitializedContent (PassportAgreementSummaryScreen.kt:51)");
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
            i50.s.r(initialized.getBaseScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(528541131, true, new er.q() { // from class: fq2.j
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return l.j(initialized, initialized, aVar, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVarH, BaseScaffoldData.f89350g, 196608, 32766);
            rVarH = rVarH;
            p088nul.q0.g(false, initialized.i(), rVarH, 0, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: fq2.k
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return l.k(initialized, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 j(e.a.Initialized initialized, e.a.Initialized initialized2, j1.a aVar, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        f3.m.Companion companion;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(528541131, i16, -1, "pl.gov.coi.mobywatel.feature.passportagreement.presentation.summary.PassportAgreementSummaryInitializedContent.<anonymous>.<anonymous> (PassportAgreementSummaryScreen.kt:62)");
            }
            f3.m.Companion companion2 = f3.m.INSTANCE;
            f3.m mVarL = a3.l(androidx.compose.foundation.layout.d.f(companion2, 0.0f, 1, null), d3Var);
            k70.a aVar2 = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            f3.m mVarP = a3.p(mVarL, aVar2.b(rVar, i17).getSpacing200(), 0.0f, 2, null);
            d1.i iVar = d1.i.f39152a;
            d1.i.n nVarK = iVar.k();
            f3.c.Companion companion3 = f3.c.INSTANCE;
            p036e4.w0 w0VarA = d1.e0.a(nVarK, companion3.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarP);
            androidx.compose.ui.node.c.Companion companion4 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion4.b();
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
            n6.i(rVarC, w0VarA, companion4.d());
            n6.i(rVarC, e0VarT, companion4.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion4.c());
            n6.g(rVarC, companion4.a());
            n6.i(rVarC, mVarE, companion4.e());
            f3.m mVarR = a3.r(t70.i.S(d1.h0.b(d1.i0.f39176a, companion2, 1.0f, false, 2, null), null, rVar, 0, 1), 0.0f, aVar2.b(rVar, i17).getSpacing100(), 0.0f, 0.0f, 13, null);
            p036e4.w0 w0VarA2 = d1.e0.a(iVar.k(), companion3.k(), rVar, 0);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT2 = rVar.t();
            f3.m mVarE2 = f3.j.e(rVar, mVarR);
            er.a<androidx.compose.ui.node.c> aVarB2 = companion4.b();
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
            n6.i(rVarC2, w0VarA2, companion4.d());
            n6.i(rVarC2, e0VarT2, companion4.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion4.c());
            n6.g(rVarC2, companion4.a());
            n6.i(rVarC2, mVarE2, companion4.e());
            j70.h.g(null, null, initialized.getHeaderLabel(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVar, i17).i(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
            r3.a(androidx.compose.foundation.layout.d.i(companion2, aVar2.b(rVar, i17).getSpacing300()), rVar, 0);
            m30.i.d(initialized.getOfficeCardListData(), null, null, rVar, 0, 6);
            r3.a(androidx.compose.foundation.layout.d.i(companion2, aVar2.b(rVar, i17).getSpacing300()), rVar, 0);
            j70.h.g(null, null, initialized.getParentSectionTitleLabel(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVar, i17).j(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
            r3.a(androidx.compose.foundation.layout.d.i(companion2, aVar2.b(rVar, i17).getSpacing200()), rVar, 0);
            m30.i.d(initialized.getParentCardListData(), null, null, rVar, 0, 6);
            r3.a(androidx.compose.foundation.layout.d.i(companion2, aVar2.b(rVar, i17).getSpacing300()), rVar, 0);
            j70.h.g(null, null, initialized.getChildSectionTitleLabel(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVar, i17).j(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
            p076m2.r rVar2 = rVar;
            k70.a aVar3 = aVar2;
            int i18 = i17;
            f3.m.Companion companion5 = companion2;
            int i19 = 0;
            r3.a(androidx.compose.foundation.layout.d.i(companion5, aVar3.b(rVar2, i18).getSpacing200()), rVar2, 0);
            m30.i.d(initialized.getChildCardListData(), null, null, rVar2, 0, 6);
            if (initialized.getAttachmentsCardListData().d().isEmpty()) {
                rVar2.X(-164998493);
            } else {
                rVar2.X(-160852460);
                r3.a(androidx.compose.foundation.layout.d.i(companion5, aVar3.b(rVar2, i18).getSpacing300()), rVar2, 0);
                j70.h.g(null, null, initialized.getAttachmentsSectionTitleLabel(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar3.f(rVar2, i18).j(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
                rVar2 = rVar;
                aVar3 = aVar3;
                i18 = i18;
                companion5 = companion5;
                i19 = 0;
                r3.a(androidx.compose.foundation.layout.d.i(companion5, aVar3.b(rVar2, i18).getSpacing200()), rVar2, 0);
                m30.i.d(initialized.getAttachmentsCardListData(), null, null, rVar2, 0, 6);
            }
            rVar2.R();
            CheckBoxSingleData statementCheckBoxSingleData = initialized.getStatementCheckBoxSingleData();
            if (statementCheckBoxSingleData == null) {
                rVar2.X(-160475315);
                rVar2.R();
                companion = companion5;
            } else {
                rVar2.X(-160475314);
                r3.a(androidx.compose.foundation.layout.d.i(companion5, aVar3.b(rVar2, i18).getSpacing300()), rVar2, i19);
                j70.h.g(null, null, initialized.getStatementSectionTitleLabel(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar3.f(rVar2, i18).j(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
                rVar2 = rVar;
                aVar3 = aVar3;
                i18 = i18;
                companion = companion5;
                i19 = 0;
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar3.b(rVar2, i18).getSpacing200()), rVar2, 0);
                f3.m mVarB = j1.e.b(companion, aVar);
                p036e4.w0 w0VarI = d1.r.i(companion3.o(), false);
                int iHashCode3 = Long.hashCode(p076m2.m.b(rVar2, 0));
                p076m2.e0 e0VarT3 = rVar2.t();
                f3.m mVarE3 = f3.j.e(rVar2, mVarB);
                er.a<androidx.compose.ui.node.c> aVarB3 = companion4.b();
                if (rVar2.l() == null) {
                    p076m2.m.d();
                }
                rVar2.K();
                if (rVar2.getInserting()) {
                    rVar2.H(aVarB3);
                } else {
                    rVar2.u();
                }
                p076m2.r rVarC3 = n6.c(rVar2);
                n6.i(rVarC3, w0VarI, companion4.d());
                n6.i(rVarC3, e0VarT3, companion4.f());
                n6.i(rVarC3, Integer.valueOf(iHashCode3), companion4.c());
                n6.g(rVarC3, companion4.a());
                n6.i(rVarC3, mVarE3, companion4.e());
                d1.x xVar = d1.x.f39368a;
                v30.d.f(statementCheckBoxSingleData, rVar2, CheckBoxSingleData.f210090f);
                rVar2.x();
                oq.i0 i0Var = oq.i0.f148189a;
                rVar2.R();
            }
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar3.b(rVar2, i18).getSpacing200()), rVar2, i19);
            c30.e.c(null, initialized2.getAlertData(), rVar2, c30.b.f22944i << 3, 1);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar3.b(rVar2, i18).getSpacing200()), rVar2, i19);
            rVar2.x();
            f3.m mVarP2 = a3.p(companion, 0.0f, aVar3.b(rVar2, i18).getSpacing200(), 1, null);
            p036e4.w0 w0VarB = m3.b(iVar.j(), companion3.l(), rVar2, i19);
            int iHashCode4 = Long.hashCode(p076m2.m.b(rVar2, i19));
            p076m2.e0 e0VarT4 = rVar2.t();
            f3.m mVarE4 = f3.j.e(rVar2, mVarP2);
            er.a<androidx.compose.ui.node.c> aVarB4 = companion4.b();
            if (rVar2.l() == null) {
                p076m2.m.d();
            }
            rVar2.K();
            if (rVar2.getInserting()) {
                rVar2.H(aVarB4);
            } else {
                rVar2.u();
            }
            p076m2.r rVarC4 = n6.c(rVar2);
            n6.i(rVarC4, w0VarB, companion4.d());
            n6.i(rVarC4, e0VarT4, companion4.f());
            n6.i(rVarC4, Integer.valueOf(iHashCode4), companion4.c());
            n6.g(rVarC4, companion4.a());
            n6.i(rVarC4, mVarE4, companion4.e());
            q3 q3Var = q3.f39261a;
            h30.q.p(initialized.getSendButtonData(), false, null, rVar2, 0, 6);
            rVar.x();
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
    public static final oq.i0 k(e.a.Initialized initialized, int i15, p076m2.r rVar, int i16) {
        i(initialized, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void l(final e eVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(473192425);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(eVar) : rVarH.G(eVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(473192425, i16, -1, "pl.gov.coi.mobywatel.feature.passportagreement.presentation.summary.PassportAgreementSummaryScreen (PassportAgreementSummaryScreen.kt:34)");
            }
            g(m(m7.b.c(eVar.getState(), null, null, null, rVarH, 0, 7)), rVarH, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: fq2.f
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return l.n(eVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final e.a m(f6<? extends e.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 n(e eVar, int i15, p076m2.r rVar, int i16) {
        l(eVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void o(final e.a.Success success, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(1843651186);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(success) : rVarH.G(success) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1843651186, i16, -1, "pl.gov.coi.mobywatel.feature.passportagreement.presentation.summary.PassportAgreementSummarySuccessContent (PassportAgreementSummaryScreen.kt:116)");
            }
            rVar2 = rVarH;
            i50.s.r(success.getBaseScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(1758792092, true, new er.q() { // from class: fq2.h
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return l.p(success, success, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
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
            d5VarM.a(new er.p() { // from class: fq2.i
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return l.q(success, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 p(e.a.Success success, e.a.Success success2, d3 d3Var, p076m2.r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= rVar.W(d3Var) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1758792092, i15, -1, "pl.gov.coi.mobywatel.feature.passportagreement.presentation.summary.PassportAgreementSummarySuccessContent.<anonymous>.<anonymous> (PassportAgreementSummaryScreen.kt:120)");
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
            q40.i.b(success2.b(), null, b.f66148a.b(), rVar, IconPageData.f164667h | IconPageBottomContentData.f164663d | MLKEMEngine.KyberPolyBytes, 2);
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
    public static final oq.i0 q(e.a.Success success, int i15, p076m2.r rVar, int i16) {
        o(success, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }
}
