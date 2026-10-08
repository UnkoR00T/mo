package i81;

import d1.a3;
import d1.d3;
import d1.r3;
import i50.BaseScaffoldData;
import ju.p0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.Function0;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p088nul.q0;
import u50.v0;
import v40.InputDateTimeData;
import w30.CheckBoxSingleData;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\t\u0010\b\u001a\u001f\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0003¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Li81/c;", "viewModel", "Loq/i0;", "p", "(Li81/c;Lm2/r;I)V", "Li81/c$a;", "screenData", "m", "(Li81/c$a;Lm2/r;I)V", "s", "Lv50/c;", "data", "", "isVisible", "j", "(Lv50/c;ZLm2/r;I)V", "childpassportapplication_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class m {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class a extends vq.k implements er.p<p0, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f90017e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ c.Data f90018f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ j1.a f90019g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(c.Data data, j1.a aVar, tq.e<? super a> eVar) {
            super(2, eVar);
            this.f90018f = data;
            this.f90019g = aVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f90017e;
            if (i15 == 0) {
                oq.u.b(obj);
                if (this.f90018f.getScrollToCitizenshipCheckBox()) {
                    j1.a aVar = this.f90019g;
                    this.f90017e = 1;
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
            this.f90018f.n().a();
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super oq.i0> eVar) {
            return ((a) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return new a(this.f90018f, this.f90019g, eVar);
        }
    }

    private static final void j(final v50.c cVar, boolean z15, p076m2.r rVar, final int i15) {
        int i16;
        final boolean z16;
        p076m2.r rVarH = rVar.h(-1456074311);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(cVar) : rVarH.G(cVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.a(z15) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1456074311, i16, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.enterchilddata.AnimatedField (ChildPassportApplicationEnterChildDataScreen.kt:145)");
            }
            z16 = z15;
            p114t0.k.g(z16, null, null, null, null, y2.m.d(-786946927, true, new er.q() { // from class: i81.k
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return m.k(cVar, (p114t0.l) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVarH, ((i16 >> 3) & 14) | 196608, 30);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            z16 = z15;
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: i81.l
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return m.l(cVar, z16, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 k(v50.c cVar, p114t0.l lVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-786946927, i15, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.enterchilddata.AnimatedField.<anonymous> (ChildPassportApplicationEnterChildDataScreen.kt:147)");
        }
        v0.g(cVar, null, rVar, v50.c.f203957t, 2);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 l(v50.c cVar, boolean z15, int i15, p076m2.r rVar, int i16) {
        j(cVar, z15, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void m(final c.Data data, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(310003820);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(data) : rVarH.G(data) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(310003820, i16, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.enterchilddata.ChildPassportApplicationEnterChildDataContent (ChildPassportApplicationEnterChildDataScreen.kt:45)");
            }
            Object objE = rVarH.E();
            p076m2.r.Companion companion = p076m2.r.INSTANCE;
            if (objE == companion.a()) {
                objE = j1.e.a();
                rVarH.v(objE);
            }
            final j1.a aVar = (j1.a) objE;
            Boolean boolValueOf = Boolean.valueOf(data.getScrollToCitizenshipCheckBox());
            boolean zG = ((i16 & 14) == 4 || ((i16 & 8) != 0 && rVarH.G(data))) | rVarH.G(aVar);
            Object objE2 = rVarH.E();
            if (zG || objE2 == companion.a()) {
                objE2 = new a(data, aVar, null);
                rVarH.v(objE2);
            }
            Function0.d(boolValueOf, (er.p) objE2, rVarH, 0);
            i50.s.r(data.getBaseScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-306957153, true, new er.q() { // from class: i81.e
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return m.n(data, aVar, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVarH, BaseScaffoldData.f89350g, 196608, 32766);
            rVarH = rVarH;
            q0.g(false, data.m(), rVarH, 0, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: i81.f
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return m.o(data, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 n(c.Data data, j1.a aVar, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-306957153, i16, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.enterchilddata.ChildPassportApplicationEnterChildDataContent.<anonymous> (ChildPassportApplicationEnterChildDataScreen.kt:54)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            k70.a aVar2 = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            f3.m mVarR = a3.r(a3.l(w0.i.d(companion, aVar2.a(rVar, i17).getBase().a(), null, 2, null), d3Var), aVar2.b(rVar, i17).getSpacing200(), 0.0f, aVar2.b(rVar, i17).getSpacing200(), aVar2.b(rVar, i17).getSpacing200(), 2, null);
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
            f3.m mVarR2 = a3.r(t70.i.S(d1.h0.b(d1.i0.f39176a, companion, 1.0f, false, 2, null), null, rVar, 0, 1), 0.0f, aVar2.b(rVar, i17).getSpacing100(), 0.0f, aVar2.b(rVar, i17).getSpacing200(), 5, null);
            w0 w0VarA2 = d1.e0.a(iVar.k(), companion2.k(), rVar, 0);
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
            j70.h.g(null, null, data.getTitle(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVar, i17).i(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar2.b(rVar, i17).getSpacing100()), rVar, 0);
            int i18 = BaseScaffoldData.f89350g;
            int i19 = v50.c.Text.P;
            int i25 = i18 | i19 | i19 | i19 | i19 | v50.c.Number.P | i19 | InputDateTimeData.f203769m;
            int i26 = CheckBoxSingleData.f210090f;
            s(data, rVar, i25 | i26);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar2.b(rVar, i17).getSpacing300()), rVar, 0);
            j70.h.g(null, null, data.getCitizenshipTitle(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVar, i17).p(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar2.b(rVar, i17).getSpacing200()), rVar, 0);
            f3.m mVarB = j1.e.b(companion, aVar);
            w0 w0VarI = d1.r.i(companion2.o(), false);
            int iHashCode3 = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT3 = rVar.t();
            f3.m mVarE3 = f3.j.e(rVar, mVarB);
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
            v30.d.f(data.getCitizenshipCheckBox(), rVar, i26);
            rVar.x();
            rVar.x();
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar2.b(rVar, i17).getSpacing200()), rVar, 0);
            h30.q.p(data.getNextButtonData(), false, null, rVar, 0, 6);
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
    public static final oq.i0 o(c.Data data, int i15, p076m2.r rVar, int i16) {
        m(data, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void p(final c cVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1826287109);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(cVar) : rVarH.G(cVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1826287109, i16, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.enterchilddata.ChildPassportApplicationEnterChildDataScreen (ChildPassportApplicationEnterChildDataScreen.kt:39)");
            }
            c.Data dataQ = q(m7.b.c(cVar.getState(), null, null, null, rVarH, 0, 7));
            int i17 = BaseScaffoldData.f89350g;
            int i18 = v50.c.Text.P;
            m(dataQ, rVarH, i17 | i18 | i18 | i18 | i18 | v50.c.Number.P | i18 | InputDateTimeData.f203769m | CheckBoxSingleData.f210090f);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: i81.d
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return m.r(cVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final c.Data q(f6<c.Data> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 r(c cVar, int i15, p076m2.r rVar, int i16) {
        p(cVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void s(final c.Data data, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1305727555);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(data) : rVarH.G(data) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1305727555, i16, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.enterchilddata.FieldList (ChildPassportApplicationEnterChildDataScreen.kt:99)");
            }
            x30.c.c(null, 0.0f, y2.m.d(269324028, true, new er.p() { // from class: i81.g
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return m.t(data, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), rVarH, MLKEMEngine.KyberPolyBytes, 3);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: i81.h
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return m.w(data, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 t(final c.Data data, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(269324028, i15, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.enterchilddata.FieldList.<anonymous> (ChildPassportApplicationEnterChildDataScreen.kt:101)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, companion);
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
            n6.i(rVarC, w0VarA, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
            n6.g(rVarC, companion2.a());
            n6.i(rVarC, mVarE, companion2.e());
            d1.i0 i0Var = d1.i0.f39176a;
            v50.c.Text firstNameInputData = data.getFirstNameInputData();
            boolean namesFieldsVisible = data.getNamesFieldsVisible();
            int i16 = v50.c.Text.P;
            j(firstNameInputData, namesFieldsVisible, rVar, i16);
            p114t0.k.e(i0Var, data.getLastNameFieldVisible(), null, null, null, null, y2.m.d(-1710904978, true, new er.q() { // from class: i81.i
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return m.u(data, (p114t0.l) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVar, 54), rVar, 1572870, 30);
            if (data.getNamesFieldsVisible()) {
                rVar.X(-1224138895);
                r3.a(androidx.compose.foundation.layout.d.i(companion, k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing100()), rVar, 0);
            } else {
                rVar.X(701797692);
            }
            rVar.R();
            j(data.getSecondNameInputData(), data.getNamesFieldsVisible(), rVar, i16);
            if (data.getNamesFieldsVisible()) {
                rVar.X(-1224131119);
                r3.a(androidx.compose.foundation.layout.d.i(companion, k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing200()), rVar, 0);
            } else {
                rVar.X(701797692);
            }
            rVar.R();
            j(data.getOtherNameInputData(), data.getNamesFieldsVisible(), rVar, i16);
            if (data.getLastNameFieldVisible() && data.getNamesFieldsVisible()) {
                rVar.X(706917311);
                r3.a(androidx.compose.foundation.layout.d.i(companion, k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing200()), rVar, 0);
                rVar.R();
            } else {
                rVar.X(707015519);
                r3.a(androidx.compose.foundation.layout.d.i(companion, k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing100()), rVar, 0);
                rVar.R();
            }
            j(data.getLastNameInputData(), data.getLastNameFieldVisible(), rVar, i16);
            p114t0.k.e(i0Var, data.getNamesFieldsVisible(), null, null, null, null, y2.m.d(-1302620009, true, new er.q() { // from class: i81.j
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return m.v(data, (p114t0.l) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVar, 54), rVar, 1572870, 30);
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing100()), rVar, 0);
            v0.g(data.getPeselInputData(), null, rVar, v50.c.Number.P, 2);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing100()), rVar, 0);
            v40.i.h(data.getBirthDateInputData(), rVar, InputDateTimeData.f203769m);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing200()), rVar, 0);
            v0.g(data.getBirhtPlaceInputData(), null, rVar, i16, 2);
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
    public static final oq.i0 u(c.Data data, p114t0.l lVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1710904978, i15, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.enterchilddata.FieldList.<anonymous>.<anonymous>.<anonymous> (ChildPassportApplicationEnterChildDataScreen.kt:107)");
        }
        s50.d.b(data.getNoNamesSwitchData(), rVar, 0);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 v(c.Data data, p114t0.l lVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1302620009, i15, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.enterchilddata.FieldList.<anonymous>.<anonymous>.<anonymous> (ChildPassportApplicationEnterChildDataScreen.kt:129)");
        }
        s50.d.b(data.getNoLastNameSwitchData(), rVar, 0);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 w(c.Data data, int i15, p076m2.r rVar, int i16) {
        s(data, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }
}
