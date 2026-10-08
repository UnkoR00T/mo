package bz3;

import b70.RequirementListData;
import d1.a3;
import d1.d3;
import d1.r3;
import i50.BaseScaffoldData;
import java.io.IOException;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.xmlpull.v1.XmlPullParserException;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.Function0;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import u50.v0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n²\u0006\f\u0010\t\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lbz3/i;", "viewModel", "Loq/i0;", "j", "(Lbz3/i;Lm2/r;I)V", "Lbz3/i$a;", "data", "m", "(Lbz3/i$a;Lm2/r;I)V", "state", "setpassword_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class s {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class a extends vq.k implements er.p<ju.p0, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f22201e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ i.Data f22202f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ d60.c f22203g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(i.Data data, d60.c cVar, tq.e<? super a> eVar) {
            super(2, eVar);
            this.f22202f = data;
            this.f22203g = cVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f22201e;
            if (i15 == 0) {
                oq.u.b(obj);
                if (this.f22202f.getPasswordInputData().getValidationState() instanceof hz.b.Invalid) {
                    d60.c cVar = this.f22203g;
                    this.f22201e = 1;
                    if (d60.c.f(cVar, false, this, 1, null) == objE) {
                        return objE;
                    }
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
            return new a(this.f22202f, this.f22203g, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.p<ju.p0, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f22204e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ i.Data f22205f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ d60.c f22206g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(i.Data data, d60.c cVar, tq.e<? super b> eVar) {
            super(2, eVar);
            this.f22205f = data;
            this.f22206g = cVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f22204e;
            if (i15 == 0) {
                oq.u.b(obj);
                hz.b repeatPasswordState = this.f22205f.getRepeatPasswordState();
                if (repeatPasswordState instanceof hz.b.Invalid) {
                    d60.c cVar = this.f22206g;
                    this.f22204e = 1;
                    if (d60.c.f(cVar, false, this, 1, null) == objE) {
                        return objE;
                    }
                } else if (fr.t.c(repeatPasswordState, hz.b.d.f86848c)) {
                    this.f22205f.f().a();
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
            return ((b) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return new b(this.f22205f, this.f22206g, eVar);
        }
    }

    public static final void j(final i iVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1061671339);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(iVar) : rVarH.G(iVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1061671339, i16, -1, "pl.gov.coi.mobywatel.segment.setpassword.presentation.SetPasswordScreen (SetPasswordScreen.kt:35)");
            }
            m(k(m7.b.c(iVar.getState(), null, null, null, rVarH, 0, 7)), rVarH, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: bz3.j
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return s.l(iVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final i.Data k(f6<i.Data> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 l(i iVar, int i15, p076m2.r rVar, int i16) {
        j(iVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void m(final i.Data data, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(1761783992);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(data) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1761783992, i16, -1, "pl.gov.coi.mobywatel.segment.setpassword.presentation.SetPasswordScreenContent (SetPasswordScreen.kt:44)");
            }
            boolean passwordInputShouldBeFocused = data.getPasswordInputShouldBeFocused();
            boolean zG = rVarH.G(data);
            Object objE = rVarH.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.l() { // from class: bz3.k
                    @Override // er.l
                    public final Object b(Object obj) {
                        return s.n(data, ((Boolean) obj).booleanValue());
                    }
                };
                rVarH.v(objE);
            }
            final d60.c cVarB = d60.e.b(passwordInputShouldBeFocused, (er.l) objE, rVarH, 0, 0);
            boolean zG2 = rVarH.G(data);
            Object objE2 = rVarH.E();
            if (zG2 || objE2 == p076m2.r.INSTANCE.a()) {
                objE2 = new er.l() { // from class: bz3.l
                    @Override // er.l
                    public final Object b(Object obj) {
                        return s.o(data, ((Boolean) obj).booleanValue());
                    }
                };
                rVarH.v(objE2);
            }
            final d60.c cVarB2 = d60.e.b(false, (er.l) objE2, rVarH, 0, 1);
            hz.b validationState = data.getPasswordInputData().getValidationState();
            boolean zG3 = rVarH.G(data) | rVarH.W(cVarB);
            Object objE3 = rVarH.E();
            if (zG3 || objE3 == p076m2.r.INSTANCE.a()) {
                objE3 = new a(data, cVarB, null);
                rVarH.v(objE3);
            }
            int i17 = hz.b.f86845b;
            Function0.d(validationState, (er.p) objE3, rVarH, i17);
            hz.b repeatPasswordState = data.getRepeatPasswordState();
            boolean zG4 = rVarH.G(data) | rVarH.W(cVarB2);
            Object objE4 = rVarH.E();
            if (zG4 || objE4 == p076m2.r.INSTANCE.a()) {
                objE4 = new b(data, cVarB2, null);
                rVarH.v(objE4);
            }
            Function0.d(repeatPasswordState, (er.p) objE4, rVarH, i17);
            boolean zG5 = rVarH.G(data);
            Object objE5 = rVarH.E();
            if (zG5 || objE5 == p076m2.r.INSTANCE.a()) {
                objE5 = new er.a() { // from class: bz3.m
                    @Override // er.a
                    public final Object a() {
                        return s.p(data);
                    }
                };
                rVarH.v(objE5);
            }
            p088nul.q0.g(false, (er.a) objE5, rVarH, 0, 1);
            rVar2 = rVarH;
            i50.s.r(data.getBaseScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(2030971243, true, new er.q() { // from class: bz3.n
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return s.q(data, cVarB, cVarB2, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
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
            d5VarM.a(new er.p() { // from class: bz3.o
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return s.u(data, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 n(i.Data data, boolean z15) {
        data.e().b(Boolean.valueOf(z15));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 o(i.Data data, boolean z15) {
        data.g().b(Boolean.valueOf(z15));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 p(i.Data data) {
        data.d().a();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 q(final i.Data data, final d60.c cVar, final d60.c cVar2, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(2030971243, i16, -1, "pl.gov.coi.mobywatel.segment.setpassword.presentation.SetPasswordScreenContent.<anonymous> (SetPasswordScreen.kt:77)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarL = a3.l(androidx.compose.foundation.layout.d.f(companion, 0.0f, 1, null), d3Var);
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            f3.m mVarR = a3.r(mVarL, aVar.b(rVar, i17).getSpacing200(), 0.0f, aVar.b(rVar, i17).getSpacing200(), 0.0f, 10, null);
            d1.i iVar = d1.i.f39152a;
            d1.i.n nVarK = iVar.k();
            f3.c.Companion companion2 = f3.c.INSTANCE;
            w0 w0VarA = d1.e0.a(nVarK, companion2.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarR);
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
            f3.m mVarB = d1.h0.b(d1.i0.f39176a, companion, 1.0f, false, 2, null);
            f3.c.b bVarG = companion2.g();
            d3 d3VarI = a3.i(0.0f, aVar.b(rVar, i17).getSpacing100(), 0.0f, aVar.b(rVar, i17).getSpacing200(), 5, null);
            boolean zG = rVar.G(data) | rVar.W(cVar) | rVar.W(cVar2);
            Object objE = rVar.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.l() { // from class: bz3.p
                    @Override // er.l
                    public final Object b(Object obj) {
                        return s.r(data, cVar, cVar2, (f1.q0) obj);
                    }
                };
                rVar.v(objE);
            }
            f1.d.c(mVarB, null, d3VarI, false, null, bVarG, null, false, null, (er.l) objE, rVar, 196608, 474);
            f3.m mVarR2 = a3.r(androidx.compose.foundation.layout.d.h(androidx.compose.foundation.layout.d.C(companion, null, false, 3, null), 0.0f, 1, null), 0.0f, 0.0f, 0.0f, aVar.b(rVar, i17).getSpacing200(), 7, null);
            w0 w0VarA2 = d1.e0.a(iVar.d(), companion2.k(), rVar, 6);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT2 = rVar.t();
            f3.m mVarE2 = f3.j.e(rVar, mVarR2);
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
            n6.i(rVarC2, w0VarA2, companion3.d());
            n6.i(rVarC2, e0VarT2, companion3.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion3.c());
            n6.g(rVarC2, companion3.a());
            n6.i(rVarC2, mVarE2, companion3.e());
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing200()), rVar, 0);
            h30.q.p(data.getNextButtonData(), false, null, rVar, 0, 6);
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
    public static final oq.i0 r(final i.Data data, final d60.c cVar, final d60.c cVar2, f1.q0 q0Var) {
        f1.q0.c(q0Var, null, null, y2.m.b(-536289024, true, new er.q() { // from class: bz3.q
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return s.s(data, cVar, cVar2, (f1.e) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }), 3, null);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 s(final i.Data data, final d60.c cVar, final d60.c cVar2, f1.e eVar, p076m2.r rVar, int i15) throws XmlPullParserException, IOException {
        if (rVar.r((i15 & 17) != 16, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-536289024, i15, -1, "pl.gov.coi.mobywatel.segment.setpassword.presentation.SetPasswordScreenContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SetPasswordScreen.kt:95)");
            }
            o40.j.i(data.getHeaderData(), rVar, 0);
            r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing300()), rVar, 0);
            x30.c.c(null, 0.0f, y2.m.d(297372927, true, new er.p() { // from class: bz3.r
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return s.t(cVar, cVar2, data, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVar, 54), rVar, MLKEMEngine.KyberPolyBytes, 3);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 t(d60.c cVar, d60.c cVar2, i.Data data, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(297372927, i15, -1, "pl.gov.coi.mobywatel.segment.setpassword.presentation.SetPasswordScreenContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SetPasswordScreen.kt:98)");
            }
            d60.c.Companion companion = d60.c.INSTANCE;
            f3.m.Companion companion2 = f3.m.INSTANCE;
            f3.m mVarD = companion.d(companion.d(companion2, cVar), cVar2);
            w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
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
            n6.i(rVarC, w0VarA, companion3.d());
            n6.i(rVarC, e0VarT, companion3.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion3.c());
            n6.g(rVarC, companion3.a());
            n6.i(rVarC, mVarE, companion3.e());
            d1.i0 i0Var = d1.i0.f39176a;
            v50.c passwordInputData = data.getPasswordInputData();
            int i16 = v50.c.f203957t;
            v0.g(passwordInputData, cVar, rVar, i16, 0);
            b70.i.l(data.getRequirementListData(), rVar, RequirementListData.f16989d);
            r3.a(androidx.compose.foundation.layout.d.i(companion2, k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing200()), rVar, 0);
            v0.g(data.getRepeatPasswordInputData(), cVar2, rVar, i16, 0);
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
    public static final oq.i0 u(i.Data data, int i15, p076m2.r rVar, int i16) {
        m(data, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }
}
