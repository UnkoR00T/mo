package pj2;

import d1.a3;
import d1.d3;
import d1.r3;
import i50.BaseScaffoldData;
import ju.p0;
import n30.CardListData;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.Function0;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p088nul.q0;
import rj2.LegalInformationBottomSheetModel;
import rj2.LegalInformationScreenModel;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0003¢\u0006\u0004\b\u000b\u0010\f\u001a\u0017\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0003¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0013²\u0006\f\u0010\u0012\u001a\u00020\u00118\nX\u008a\u0084\u0002"}, d2 = {"Lpj2/v;", "viewModel", "Loq/i0;", "t", "(Lpj2/v;Lm2/r;I)V", "Lpj2/v$a$b;", "state", "n", "(Lpj2/v$a$b;Lm2/r;I)V", "Lrj2/c;", "model", "w", "(Lrj2/c;Lm2/r;I)V", "Lpj2/v$a$a;", "stateData", "k", "(Lpj2/v$a$a;Lm2/r;I)V", "Lpj2/v$a;", "viewModelState", "legalinformation_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class s {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class a extends vq.k implements er.p<p0, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f158010e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ v.a.Initialized f158011f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ p012a2.k0 f158012g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(v.a.Initialized initialized, p012a2.k0 k0Var, tq.e<? super a> eVar) {
            super(2, eVar);
            this.f158011f = initialized;
            this.f158012g = k0Var;
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x003c, code lost:
        
            if (r5.f(r4) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x004b, code lost:
        
            if (r5.e(r4) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x004d, code lost:
        
            return r0;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r5) throws java.lang.Throwable {
            /*
                r4 = this;
                java.lang.Object r0 = uq.b.e()
                int r1 = r4.f158010e
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1b
                if (r1 == r3) goto L17
                if (r1 != r2) goto Lf
                goto L17
            Lf:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L17:
                oq.u.b(r5)
                goto L4e
            L1b:
                oq.u.b(r5)
                pj2.v$a$b r5 = r4.f158011f
                rj2.c r5 = r5.getScreenModel()
                rj2.b r5 = r5.getBottomSheetState()
                rj2.b$a r1 = rj2.b.a.f174627a
                boolean r5 = fr.t.c(r5, r1)
                if (r5 == 0) goto L3f
                a2.k0 r5 = r4.f158012g
                a2.p0 r5 = r5.getBottomSheetState()
                r4.f158010e = r3
                java.lang.Object r5 = r5.f(r4)
                if (r5 != r0) goto L4e
                goto L4d
            L3f:
                a2.k0 r5 = r4.f158012g
                a2.p0 r5 = r5.getBottomSheetState()
                r4.f158010e = r2
                java.lang.Object r5 = r5.e(r4)
                if (r5 != r0) goto L4e
            L4d:
                return r0
            L4e:
                oq.i0 r5 = oq.i0.f148189a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: pj2.s.a.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super oq.i0> eVar) {
            return ((a) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return new a(this.f158011f, this.f158012g, eVar);
        }
    }

    private static final void k(final v.a.Error error, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(552472240);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(error) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(552472240, i16, -1, "pl.gov.coi.mobywatel.feature.legalinformation.presentation.screens.ErrorScreen (LegalInformationScreen.kt:138)");
            }
            error.getErrorVMS().b(rVarH, 0);
            Object objE = rVarH.E();
            if (objE == p076m2.r.INSTANCE.a()) {
                objE = new er.a() { // from class: pj2.n
                    @Override // er.a
                    public final Object a() {
                        return s.l();
                    }
                };
                rVarH.v(objE);
            }
            q0.g(false, (er.a) objE, rVarH, 48, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: pj2.o
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return s.m(error, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 l() {
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 m(v.a.Error error, int i15, p076m2.r rVar, int i16) {
        k(error, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void n(final v.a.Initialized initialized, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-168541289);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(initialized) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-168541289, i16, -1, "pl.gov.coi.mobywatel.feature.legalinformation.presentation.screens.LegalInformationBottomSheet (LegalInformationScreen.kt:49)");
            }
            p012a2.q0 q0Var = p012a2.q0.Collapsed;
            boolean zG = rVarH.G(initialized);
            Object objE = rVarH.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.l() { // from class: pj2.i
                    @Override // er.l
                    public final Object b(Object obj) {
                        return Boolean.valueOf(s.o(initialized, (p012a2.q0) obj));
                    }
                };
                rVarH.v(objE);
            }
            final p012a2.k0 k0VarL = p012a2.i0.L(p012a2.i0.M(q0Var, null, (er.l) objE, rVarH, 6, 2), null, rVarH, 0, 2);
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            p012a2.i0.r(y2.m.d(1331481448, true, new er.q() { // from class: pj2.j
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return s.p(initialized, (d1.h0) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), null, k0VarL, null, null, null, 0, false, l1.h.h(aVar.b(rVarH, i17).getSpacing300(), aVar.b(rVarH, i17).getSpacing300(), 0.0f, 0.0f, 12, null), 0.0f, 0L, 0L, aVar.b(rVarH, i17).getZero(), aVar.a(rVarH, i17).getBase().a(), 0L, y2.m.d(-1797056047, true, new er.q() { // from class: pj2.k
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return s.q(initialized, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVarH, 6, 196608, 20218);
            rVarH = rVarH;
            rj2.b bottomSheetState = initialized.getScreenModel().getBottomSheetState();
            boolean zG2 = rVarH.G(initialized) | rVarH.W(k0VarL);
            Object objE2 = rVarH.E();
            if (zG2 || objE2 == p076m2.r.INSTANCE.a()) {
                objE2 = new a(initialized, k0VarL, null);
                rVarH.v(objE2);
            }
            Function0.d(bottomSheetState, (er.p) objE2, rVarH, 0);
            boolean zW = rVarH.W(k0VarL) | rVarH.G(initialized);
            Object objE3 = rVarH.E();
            if (zW || objE3 == p076m2.r.INSTANCE.a()) {
                objE3 = new er.a() { // from class: pj2.l
                    @Override // er.a
                    public final Object a() {
                        return s.r(k0VarL, initialized);
                    }
                };
                rVarH.v(objE3);
            }
            q0.g(false, (er.a) objE3, rVarH, 0, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: pj2.m
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return s.s(initialized, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean o(v.a.Initialized initialized, p012a2.q0 q0Var) {
        if (q0Var != p012a2.q0.Collapsed) {
            return true;
        }
        initialized.getScreenModel().d().a();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 p(v.a.Initialized initialized, d1.h0 h0Var, p076m2.r rVar, int i15) {
        LegalInformationBottomSheetModel mObywatelProfileRegulationsModel;
        p076m2.r rVar2;
        if (rVar.r((i15 & 17) != 16, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1331481448, i15, -1, "pl.gov.coi.mobywatel.feature.legalinformation.presentation.screens.LegalInformationBottomSheet.<anonymous> (LegalInformationScreen.kt:71)");
            }
            rj2.b bottomSheetState = initialized.getScreenModel().getBottomSheetState();
            oq.i0 i0Var = null;
            if (bottomSheetState instanceof rj2.b.a) {
                mObywatelProfileRegulationsModel = initialized.getScreenModel().getMObywatelProfileRegulationsModel();
            } else {
                if (!(bottomSheetState instanceof rj2.b.C4451b)) {
                    throw new oq.p();
                }
                mObywatelProfileRegulationsModel = null;
            }
            if (mObywatelProfileRegulationsModel == null) {
                rVar.X(2141087460);
                rVar.R();
                rVar2 = rVar;
            } else {
                rVar.X(2141087461);
                rVar2 = rVar;
                h.f(mObywatelProfileRegulationsModel.getTitle(), mObywatelProfileRegulationsModel.getDownloadButtonText(), mObywatelProfileRegulationsModel.getCloseButtonText(), mObywatelProfileRegulationsModel.getWebViewUrl(), mObywatelProfileRegulationsModel.c(), initialized.getScreenModel().d(), mObywatelProfileRegulationsModel.d(), rVar2, 0);
                rVar2.R();
                i0Var = oq.i0.f148189a;
            }
            if (i0Var == null) {
                rVar2.X(-346561911);
                r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, k70.a.f108864a.b(rVar2, k70.a.f108865b).getSpacing25()), rVar2, 0);
                rVar2.R();
            } else {
                rVar2.X(-346575148);
                rVar2.R();
            }
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 q(v.a.Initialized initialized, d3 d3Var, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 17) != 16, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1797056047, i15, -1, "pl.gov.coi.mobywatel.feature.legalinformation.presentation.screens.LegalInformationBottomSheet.<anonymous> (LegalInformationScreen.kt:88)");
            }
            w(initialized.getScreenModel(), rVar, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 r(p012a2.k0 k0Var, v.a.Initialized initialized) {
        if (k0Var.getBottomSheetState().j()) {
            initialized.getScreenModel().d().a();
        } else {
            initialized.a().a();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 s(v.a.Initialized initialized, int i15, p076m2.r rVar, int i16) {
        n(initialized, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void t(final v vVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(348887821);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(vVar) : rVarH.G(vVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(348887821, i16, -1, "pl.gov.coi.mobywatel.feature.legalinformation.presentation.screens.LegalInformationScreen (LegalInformationScreen.kt:36)");
            }
            v.a aVarU = u(m7.b.c(vVar.getState(), null, null, null, rVarH, 0, 7));
            if (aVarU instanceof v.a.Initialized) {
                rVarH.X(273753399);
                n((v.a.Initialized) aVarU, rVarH, 0);
                rVarH.R();
            } else {
                if (!(aVarU instanceof v.a.Error)) {
                    rVarH.X(273751202);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(273755755);
                k((v.a.Error) aVarU, rVarH, 0);
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
            d5VarM.a(new er.p() { // from class: pj2.r
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return s.v(vVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final v.a u(f6<? extends v.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 v(v vVar, int i15, p076m2.r rVar, int i16) {
        t(vVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void w(final LegalInformationScreenModel legalInformationScreenModel, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1132394392);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(legalInformationScreenModel) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1132394392, i16, -1, "pl.gov.coi.mobywatel.feature.legalinformation.presentation.screens.LegalInformationScreenContent (LegalInformationScreen.kt:110)");
            }
            i50.s.r(legalInformationScreenModel.getScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-677167141, true, new er.q() { // from class: pj2.p
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return s.x(legalInformationScreenModel, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVarH, BaseScaffoldData.f89350g, 196608, 32766);
            rVarH = rVarH;
            f20.d.d(!fr.t.c(legalInformationScreenModel.getBottomSheetState(), rj2.b.C4451b.f174628a), null, rVarH, 0, 2);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: pj2.q
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return s.y(legalInformationScreenModel, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 x(LegalInformationScreenModel legalInformationScreenModel, d3 d3Var, p076m2.r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= rVar.W(d3Var) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-677167141, i15, -1, "pl.gov.coi.mobywatel.feature.legalinformation.presentation.screens.LegalInformationScreenContent.<anonymous> (LegalInformationScreen.kt:114)");
            }
            f3.m mVarL = a3.l(f3.m.INSTANCE, d3Var);
            k70.a aVar = k70.a.f108864a;
            int i16 = k70.a.f108865b;
            f3.m mVarF = androidx.compose.foundation.layout.d.f(a3.q(mVarL, aVar.b(rVar, i16).getSpacing200(), aVar.b(rVar, i16).getSpacing100(), aVar.b(rVar, i16).getSpacing200(), aVar.b(rVar, i16).getSpacing200()), 0.0f, 1, null);
            w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
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
            m30.i.d(new CardListData(legalInformationScreenModel.a(), null, false, null, null, 30, null), null, null, rVar, 0, 6);
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
    public static final oq.i0 y(LegalInformationScreenModel legalInformationScreenModel, int i15, p076m2.r rVar, int i16) {
        w(legalInformationScreenModel, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }
}
