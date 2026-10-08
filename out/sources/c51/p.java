package c51;

import d1.a3;
import d1.d3;
import d1.r3;
import g30.ModalBottomSheetData;
import i50.BaseScaffoldData;
import mx.Label;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.Function0;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import q40.IconPageData;
import u50.v0;
import w30.CheckBoxSingleData;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\tH\u0003¢\u0006\u0004\b\n\u0010\u000b\u001a\u001f\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0003¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\tH\u0003¢\u0006\u0004\b\u0010\u0010\u000b¨\u0006\u0013²\u0006\f\u0010\u0012\u001a\u00020\u00118\nX\u008a\u0084\u0002"}, d2 = {"Lc51/d;", "viewModel", "Loq/i0;", "z", "(Lc51/d;Lm2/r;I)V", "Lc51/d$a$a;", "data", "n", "(Lc51/d$a$a;Lm2/r;I)V", "Lc51/d$a$b;", "t", "(Lc51/d$a$b;Lm2/r;I)V", "Ld1/d3;", "paddingValues", "r", "(Lc51/d$a$b;Ld1/d3;Lm2/r;I)V", "l", "Lc51/d$a;", "state", "childbirthregistration_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class p {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class a extends vq.k implements er.p<ju.p0, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f23606e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ d.a.Initialized f23607f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ j1.a f23608g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(d.a.Initialized initialized, j1.a aVar, tq.e<? super a> eVar) {
            super(2, eVar);
            this.f23607f = initialized;
            this.f23608g = aVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f23606e;
            if (i15 == 0) {
                oq.u.b(obj);
                if (this.f23607f.getShouldScrollToStatementSection()) {
                    j1.a aVar = this.f23608g;
                    this.f23606e = 1;
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
            this.f23607f.i().a();
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ju.p0 p0Var, tq.e<? super oq.i0> eVar) {
            return ((a) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return new a(this.f23607f, this.f23608g, eVar);
        }
    }

    private static final d.a A(f6<? extends d.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 B(d dVar, int i15, p076m2.r rVar, int i16) {
        z(dVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void l(final d.a.Initialized initialized, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-176842965);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(initialized) : rVarH.G(initialized) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-176842965, i16, -1, "pl.gov.coi.mobywatel.feature.childbirthregistration.presentation.screens.wizardsteps.personaldata.BottomSheetContent (PersonalDataScreen.kt:150)");
            }
            d60.c cVarB = d60.e.b(initialized.getBottomSheetInputShouldBeFocused(), null, rVarH, 0, 2);
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarS = t70.i.S(companion, null, rVarH, 6, 1);
            w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVarH, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, mVarS);
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
            v0.g(initialized.getBottomSheetInputData(), cVarB, rVarH, v50.c.f203957t, 0);
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i17).getSpacing300()), rVarH, 0);
            h30.q.p(initialized.getAddSecondNameButtonData(), false, null, rVarH, 0, 6);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i17).getSpacing200()), rVarH, 0);
            rVarH.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: c51.f
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return p.m(initialized, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 m(d.a.Initialized initialized, int i15, p076m2.r rVar, int i16) {
        l(initialized, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void n(final d.a.Empty empty, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(-699978325);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(empty) : rVarH.G(empty) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-699978325, i16, -1, "pl.gov.coi.mobywatel.feature.childbirthregistration.presentation.screens.wizardsteps.personaldata.EmptyContent (PersonalDataScreen.kt:56)");
            }
            rVar2 = rVarH;
            i50.s.r(empty.getBaseScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-1492993634, true, new er.q() { // from class: c51.l
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return p.o(empty, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
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
            d5VarM.a(new er.p() { // from class: c51.m
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return p.q(empty, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 o(d.a.Empty empty, d3 d3Var, p076m2.r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= rVar.W(d3Var) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1492993634, i15, -1, "pl.gov.coi.mobywatel.feature.childbirthregistration.presentation.screens.wizardsteps.personaldata.EmptyContent.<anonymous> (PersonalDataScreen.kt:60)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            Object objE = rVar.E();
            if (objE == p076m2.r.INSTANCE.a()) {
                objE = new er.l() { // from class: c51.o
                    @Override // er.l
                    public final Object b(Object obj) {
                        return p.p((n4.i0) obj);
                    }
                };
                rVar.v(objE);
            }
            f3.m mVarD = n4.v.d(companion, false, (er.l) objE, 1, null);
            f3.c.Companion companion2 = f3.c.INSTANCE;
            w0 w0VarI = d1.r.i(companion2.o(), false);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
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
            f3.m mVarL = a3.l(companion, d3Var);
            w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), companion2.k(), rVar, 0);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT2 = rVar.t();
            f3.m mVarE2 = f3.j.e(rVar, mVarL);
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
            q40.i.b(empty.b(), null, null, rVar, IconPageData.f164667h, 6);
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
    public static final oq.i0 p(n4.i0 i0Var) {
        t70.i.A(i0Var);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 q(d.a.Empty empty, int i15, p076m2.r rVar, int i16) {
        n(empty, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    /* JADX WARN: Code duplicated, block: B:59:0x0260  */
    /* JADX WARN: Code duplicated, block: B:61:0x0266  */
    /* JADX WARN: Code duplicated, block: B:64:0x0280  */
    private static final void r(d.a.Initialized initialized, final d3 d3Var, p076m2.r rVar, final int i15) {
        int i16;
        final d.a.Initialized initialized2;
        boolean z15;
        boolean zG;
        Object objE;
        p076m2.r rVarH = rVar.h(209036550);
        if ((i15 & 6) == 0) {
            i16 = i15 | ((i15 & 8) == 0 ? rVarH.W(initialized) : rVarH.G(initialized) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.W(d3Var) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(209036550, i16, -1, "pl.gov.coi.mobywatel.feature.childbirthregistration.presentation.screens.wizardsteps.personaldata.InitializedScreenContent (PersonalDataScreen.kt:105)");
            }
            Object objE2 = rVarH.E();
            p076m2.r.Companion companion = p076m2.r.INSTANCE;
            if (objE2 == companion.a()) {
                objE2 = j1.e.a();
                rVarH.v(objE2);
            }
            j1.a aVar = (j1.a) objE2;
            f3.m.Companion companion2 = f3.m.INSTANCE;
            f3.m mVarN = t70.s.n(t70.i.S(androidx.compose.foundation.layout.d.f(a3.l(companion2, d3Var), 0.0f, 1, null), null, rVarH, 0, 1), rVarH, 0);
            d1.i iVar = d1.i.f39152a;
            d1.i.n nVarK = iVar.k();
            f3.c.Companion companion3 = f3.c.INSTANCE;
            w0 w0VarA = d1.e0.a(nVarK, companion3.k(), rVarH, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, mVarN);
            androidx.compose.ui.node.c.Companion companion4 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion4.b();
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
            n6.i(rVarC, w0VarA, companion4.d());
            n6.i(rVarC, e0VarT, companion4.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion4.c());
            n6.g(rVarC, companion4.a());
            n6.i(rVarC, mVarE, companion4.e());
            d1.i0 i0Var = d1.i0.f39176a;
            Label title = initialized.getTitle();
            k70.a aVar2 = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            int i18 = i16;
            j70.h.g(null, null, title, null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVarH, i17).i(), null, null, false, false, null, rVarH, 0, 0, 0, 33030139);
            r3.a(androidx.compose.foundation.layout.d.i(companion2, aVar2.b(rVarH, i17).getSpacing200()), rVarH, 0);
            m30.i.d(initialized.getCardListData(), null, null, rVarH, 0, 6);
            r3.a(androidx.compose.foundation.layout.d.i(companion2, aVar2.b(rVarH, i17).getSpacing300()), rVarH, 0);
            j70.h.g(null, null, initialized.getStatementTitle(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVarH, i17).j(), null, null, false, false, null, rVarH, 0, 0, 0, 33030139);
            rVarH = rVarH;
            r3.a(androidx.compose.foundation.layout.d.i(companion2, aVar2.b(rVarH, i17).getSpacing200()), rVarH, 0);
            f3.m mVarB = j1.e.b(companion2, aVar);
            w0 w0VarA2 = d1.e0.a(iVar.k(), companion3.k(), rVarH, 0);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT2 = rVarH.t();
            f3.m mVarE2 = f3.j.e(rVarH, mVarB);
            er.a<androidx.compose.ui.node.c> aVarB2 = companion4.b();
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
            n6.i(rVarC2, w0VarA2, companion4.d());
            n6.i(rVarC2, e0VarT2, companion4.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion4.c());
            n6.g(rVarC2, companion4.a());
            n6.i(rVarC2, mVarE2, companion4.e());
            v30.d.f(initialized.getStatementCheckBox(), rVarH, CheckBoxSingleData.f210090f);
            Boolean boolValueOf = Boolean.valueOf(initialized.getShouldScrollToStatementSection());
            if ((i18 & 14) != 4) {
                if ((i18 & 8) != 0) {
                    initialized2 = initialized;
                    if (rVarH.G(initialized2)) {
                    }
                    zG = rVarH.G(aVar) | z15;
                    objE = rVarH.E();
                    if (zG || objE == companion.a()) {
                        objE = new a(initialized2, aVar, null);
                        rVarH.v(objE);
                    }
                    Function0.d(boolValueOf, (er.p) objE, rVarH, 0);
                    rVarH.x();
                    rVarH.x();
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                } else {
                    initialized2 = initialized;
                }
                z15 = false;
                zG = rVarH.G(aVar) | z15;
                objE = rVarH.E();
                if (zG) {
                    objE = new a(initialized2, aVar, null);
                    rVarH.v(objE);
                } else {
                    objE = new a(initialized2, aVar, null);
                    rVarH.v(objE);
                }
                Function0.d(boolValueOf, (er.p) objE, rVarH, 0);
                rVarH.x();
                rVarH.x();
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
            } else {
                initialized2 = initialized;
            }
            z15 = true;
            zG = rVarH.G(aVar) | z15;
            objE = rVarH.E();
            if (zG) {
                objE = new a(initialized2, aVar, null);
                rVarH.v(objE);
            } else {
                objE = new a(initialized2, aVar, null);
                rVarH.v(objE);
            }
            Function0.d(boolValueOf, (er.p) objE, rVarH, 0);
            rVarH.x();
            rVarH.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            initialized2 = initialized;
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: c51.n
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return p.s(initialized2, d3Var, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 s(d.a.Initialized initialized, d3 d3Var, int i15, p076m2.r rVar, int i16) {
        r(initialized, d3Var, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void t(final d.a.Initialized initialized, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(641067659);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(initialized) : rVarH.G(initialized) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(641067659, i16, -1, "pl.gov.coi.mobywatel.feature.childbirthregistration.presentation.screens.wizardsteps.personaldata.PersonalDataContentInitialized (PersonalDataScreen.kt:75)");
            }
            g30.m.j(initialized.getModalBottomSheetData(), initialized.getBaseScaffoldData(), 0.0f, null, null, y2.m.d(1399931343, true, new er.p() { // from class: c51.g
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return p.u(initialized, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), y2.m.d(831959120, true, new er.p() { // from class: c51.h
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return p.v(initialized, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), y2.m.d(-2070884588, true, new er.q() { // from class: c51.i
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return p.w(initialized, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVarH, 14352384 | ModalBottomSheetData.f70192e | (BaseScaffoldData.f89350g << 3), 28);
            boolean z15 = (i16 & 14) == 4 || ((i16 & 8) != 0 && rVarH.G(initialized));
            Object objE = rVarH.E();
            if (z15 || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.a() { // from class: c51.j
                    @Override // er.a
                    public final Object a() {
                        return p.x(initialized);
                    }
                };
                rVarH.v(objE);
            }
            p088nul.q0.g(false, (er.a) objE, rVarH, 0, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: c51.k
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return p.y(initialized, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 u(d.a.Initialized initialized, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1399931343, i15, -1, "pl.gov.coi.mobywatel.feature.childbirthregistration.presentation.screens.wizardsteps.personaldata.PersonalDataContentInitialized.<anonymous> (PersonalDataScreen.kt:89)");
            }
            f3.m mVarN = a3.n(f3.m.INSTANCE, k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing200());
            w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
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
            n6.i(rVarC, w0VarA, companion.d());
            n6.i(rVarC, e0VarT, companion.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
            n6.g(rVarC, companion.a());
            n6.i(rVarC, mVarE, companion.e());
            d1.i0 i0Var = d1.i0.f39176a;
            h30.q.p(initialized.getNextButtonData(), false, null, rVar, 0, 6);
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
    public static final oq.i0 v(d.a.Initialized initialized, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(831959120, i15, -1, "pl.gov.coi.mobywatel.feature.childbirthregistration.presentation.screens.wizardsteps.personaldata.PersonalDataContentInitialized.<anonymous> (PersonalDataScreen.kt:80)");
            }
            l(initialized, rVar, BaseScaffoldData.f89350g | ModalBottomSheetData.f70192e | CheckBoxSingleData.f210090f | v50.c.f203957t);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 w(d.a.Initialized initialized, d3 d3Var, p076m2.r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= rVar.W(d3Var) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-2070884588, i15, -1, "pl.gov.coi.mobywatel.feature.childbirthregistration.presentation.screens.wizardsteps.personaldata.PersonalDataContentInitialized.<anonymous> (PersonalDataScreen.kt:83)");
            }
            r(initialized, d3Var, rVar, ((i15 << 3) & 112) | BaseScaffoldData.f89350g | ModalBottomSheetData.f70192e | CheckBoxSingleData.f210090f | v50.c.f203957t);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 x(d.a.Initialized initialized) {
        initialized.h().a();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 y(d.a.Initialized initialized, int i15, p076m2.r rVar, int i16) {
        t(initialized, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void z(final d dVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(1977285580);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(dVar) : rVarH.G(dVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1977285580, i16, -1, "pl.gov.coi.mobywatel.feature.childbirthregistration.presentation.screens.wizardsteps.personaldata.PersonalDataScreen (PersonalDataScreen.kt:41)");
            }
            d.a aVarA = A(m7.b.c(dVar.getState(), null, null, null, rVarH, 0, 7));
            if (fr.t.c(aVarA, d.a.c.f23581a)) {
                rVarH.X(1795903901);
                c60.b.b(rVarH, 0);
                rVarH.R();
            } else if (aVarA instanceof d.a.Empty) {
                rVarH.X(1795905893);
                n((d.a.Empty) aVarA, rVarH, 0);
                rVarH.R();
            } else {
                if (!(aVarA instanceof d.a.Initialized)) {
                    rVarH.X(1795901943);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(1795908356);
                t((d.a.Initialized) aVarA, rVarH, 0);
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
            d5VarM.a(new er.p() { // from class: c51.e
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return p.B(dVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
