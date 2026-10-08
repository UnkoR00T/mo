package uu3;

import d1.a3;
import d1.d3;
import d1.r3;
import d1.x;
import i50.BaseScaffoldData;
import ju.p0;
import l3.d0;
import l3.g0;
import mx.Label;
import oq.i0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.Function0;
import p076m2.d5;
import p076m2.e0;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import u50.v0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Luu3/c;", "viewModel", "Loq/i0;", "k", "(Luu3/c;Lm2/r;I)V", "Luu3/c$a;", "data", "f", "(Luu3/c$a;Lm2/r;I)V", "contactdetailsform_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class i {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class a extends vq.k implements er.p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f201546e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ c.Data f201547f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ j1.a f201548g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(c.Data data, j1.a aVar, tq.e<? super a> eVar) {
            super(2, eVar);
            this.f201547f = data;
            this.f201548g = aVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f201546e;
            if (i15 == 0) {
                oq.u.b(obj);
                if (this.f201547f.getContactDetailsFormSection().getScrollToPhoneField()) {
                    j1.a aVar = this.f201548g;
                    this.f201546e = 1;
                    if (j1.a.a(aVar, null, this, 1, null) == objE) {
                        return objE;
                    }
                }
                return i0.f148189a;
            }
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            this.f201547f.getContactDetailsFormSection().d().a();
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((a) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return new a(this.f201547f, this.f201548g, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f201549e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ c.Data f201550f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ j1.a f201551g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(c.Data data, j1.a aVar, tq.e<? super b> eVar) {
            super(2, eVar);
            this.f201550f = data;
            this.f201551g = aVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f201549e;
            if (i15 == 0) {
                oq.u.b(obj);
                if (this.f201550f.getContactDetailsFormSection().getScrollToEmailField()) {
                    j1.a aVar = this.f201551g;
                    this.f201549e = 1;
                    if (j1.a.a(aVar, null, this, 1, null) == objE) {
                        return objE;
                    }
                }
                return i0.f148189a;
            }
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            this.f201550f.getContactDetailsFormSection().c().a();
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((b) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return new b(this.f201550f, this.f201551g, eVar);
        }
    }

    private static final void f(final c.Data data, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(-1363708375);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(data) : rVarH.G(data) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1363708375, i16, -1, "pl.gov.coi.mobywatel.segment.contactdetailsform.presentation.ContactDetailsContent (ContactDetailsFormScreen.kt:41)");
            }
            Object objE = rVarH.E();
            p076m2.r.Companion companion = p076m2.r.INSTANCE;
            if (objE == companion.a()) {
                objE = j1.e.a();
                rVarH.v(objE);
            }
            final j1.a aVar = (j1.a) objE;
            Object objE2 = rVarH.E();
            if (objE2 == companion.a()) {
                objE2 = j1.e.a();
                rVarH.v(objE2);
            }
            final j1.a aVar2 = (j1.a) objE2;
            Object objE3 = rVarH.E();
            if (objE3 == companion.a()) {
                objE3 = new d0();
                rVarH.v(objE3);
            }
            final d0 d0Var = (d0) objE3;
            Boolean boolValueOf = Boolean.valueOf(data.getContactDetailsFormSection().getScrollToPhoneField());
            int i17 = i16 & 14;
            boolean zG = (i17 == 4 || ((i16 & 8) != 0 && rVarH.G(data))) | rVarH.G(aVar);
            Object objE4 = rVarH.E();
            if (zG || objE4 == companion.a()) {
                objE4 = new a(data, aVar, null);
                rVarH.v(objE4);
            }
            Function0.d(boolValueOf, (er.p) objE4, rVarH, 0);
            Boolean boolValueOf2 = Boolean.valueOf(data.getContactDetailsFormSection().getScrollToEmailField());
            boolean zG2 = (i17 == 4 || ((i16 & 8) != 0 && rVarH.G(data))) | rVarH.G(aVar2);
            Object objE5 = rVarH.E();
            if (zG2 || objE5 == companion.a()) {
                objE5 = new b(data, aVar2, null);
                rVarH.v(objE5);
            }
            Function0.d(boolValueOf2, (er.p) objE5, rVarH, 0);
            rVar2 = rVarH;
            i50.s.r(data.getScaffoldData(), y2.m.d(-1787071586, true, new er.p() { // from class: uu3.e
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i.g(data, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), null, 0, 0L, null, null, false, null, null, null, d0Var, false, 0.0f, 0.0f, y2.m.d(1619500950, true, new er.q() { // from class: uu3.f
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return i.h(data, aVar, d0Var, aVar2, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVar2, BaseScaffoldData.f89350g | 48, 196656, 30716);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: uu3.g
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i.j(data, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 g(c.Data data, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1787071586, i15, -1, "pl.gov.coi.mobywatel.segment.contactdetailsform.presentation.ContactDetailsContent.<anonymous> (ContactDetailsFormScreen.kt:64)");
            }
            f3.m mVarN = a3.n(f3.m.INSTANCE, k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing200());
            w0 w0VarI = d1.r.i(f3.c.INSTANCE.o(), false);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            e0 e0VarT = rVar.t();
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
            n6.i(rVarC, w0VarI, companion.d());
            n6.i(rVarC, e0VarT, companion.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
            n6.g(rVarC, companion.a());
            n6.i(rVarC, mVarE, companion.e());
            x xVar = x.f39368a;
            h30.q.p(data.getNextButton(), false, null, rVar, 0, 6);
            rVar.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(final c.Data data, final j1.a aVar, final d0 d0Var, final j1.a aVar2, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1619500950, i16, -1, "pl.gov.coi.mobywatel.segment.contactdetailsform.presentation.ContactDetailsContent.<anonymous> (ContactDetailsFormScreen.kt:69)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarN = t70.s.n(t70.i.S(a3.l(androidx.compose.foundation.layout.d.f(companion, 0.0f, 1, null), d3Var), null, rVar, 0, 1), rVar, 0);
            w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarN);
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
            Label title = data.getContactDetailsFormSection().getTitle();
            k70.a aVar3 = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            j70.h.g(null, null, title, null, null, aVar3.a(rVar, i17).getNeutral().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar3.f(rVar, i17).i(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar3.b(rVar, i17).getSpacing100()), rVar, 0);
            j70.h.g(null, null, data.getContactDetailsFormSection().getDescription(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, null, false, false, null, rVar, 0, 0, 0, 33554427);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar3.b(rVar, i17).getSpacing200()), rVar, 0);
            x30.c.c(null, 0.0f, y2.m.d(-1269922963, true, new er.p() { // from class: uu3.h
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i.i(aVar, d0Var, aVar2, data, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVar, 54), rVar, MLKEMEngine.KyberPolyBytes, 3);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar3.b(rVar, i17).getSpacing200()), rVar, 0);
            c30.e.c(null, data.getAlertData(), rVar, 0, 1);
            rVar.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(j1.a aVar, d0 d0Var, j1.a aVar2, c.Data data, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1269922963, i15, -1, "pl.gov.coi.mobywatel.segment.contactdetailsform.presentation.ContactDetailsContent.<anonymous>.<anonymous>.<anonymous> (ContactDetailsFormScreen.kt:87)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            d1.i.n nVarK = d1.i.f39152a.k();
            f3.c.Companion companion2 = f3.c.INSTANCE;
            w0 w0VarA = d1.e0.a(nVarK, companion2.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, companion);
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
            f3.m mVarB = j1.e.b(companion, aVar);
            w0 w0VarI = d1.r.i(companion2.o(), false);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVar, 0));
            e0 e0VarT2 = rVar.t();
            f3.m mVarE2 = f3.j.e(rVar, mVarB);
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
            n6.i(rVarC2, w0VarI, companion3.d());
            n6.i(rVarC2, e0VarT2, companion3.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion3.c());
            n6.g(rVarC2, companion3.a());
            n6.i(rVarC2, mVarE2, companion3.e());
            x xVar = x.f39368a;
            v50.c phoneNumberTextInputData = data.getContactDetailsFormSection().getPhoneNumberTextInputData();
            int i16 = v50.c.f203957t;
            v0.g(phoneNumberTextInputData, null, rVar, i16, 2);
            rVar.x();
            r3.a(androidx.compose.foundation.layout.d.i(companion, k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing200()), rVar, 0);
            f3.m mVarB2 = j1.e.b(g0.a(companion, d0Var), aVar2);
            w0 w0VarI2 = d1.r.i(companion2.o(), false);
            int iHashCode3 = Long.hashCode(p076m2.m.b(rVar, 0));
            e0 e0VarT3 = rVar.t();
            f3.m mVarE3 = f3.j.e(rVar, mVarB2);
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
            n6.i(rVarC3, w0VarI2, companion3.d());
            n6.i(rVarC3, e0VarT3, companion3.f());
            n6.i(rVarC3, Integer.valueOf(iHashCode3), companion3.c());
            n6.g(rVarC3, companion3.a());
            n6.i(rVarC3, mVarE3, companion3.e());
            v0.g(data.getContactDetailsFormSection().getEmailAddressTextInputData(), null, rVar, i16, 2);
            rVar.x();
            rVar.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j(c.Data data, int i15, p076m2.r rVar, int i16) {
        f(data, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void k(final c cVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-761658538);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(cVar) : rVarH.G(cVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-761658538, i16, -1, "pl.gov.coi.mobywatel.segment.contactdetailsform.presentation.ContactDetailsFormScreen (ContactDetailsFormScreen.kt:33)");
            }
            f(l(m7.b.c(cVar.getState(), null, null, null, rVarH, 0, 7)), rVarH, BaseScaffoldData.f89350g | v50.c.f203957t);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: uu3.d
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i.m(cVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final c.Data l(f6<c.Data> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(c cVar, int i15, p076m2.r rVar, int i16) {
        k(cVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
