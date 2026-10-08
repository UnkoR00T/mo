package dk2;

import d1.a3;
import d1.h0;
import d1.m3;
import d1.q3;
import d1.r3;
import e60.FooterData;
import h30.ButtonData;
import j30.ButtonTextData;
import ju.p0;
import l20.GreetingsHeaderData;
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
import u50.v0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\fH\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Ldk2/d;", "viewModel", "Loq/i0;", "p", "(Ldk2/d;Lm2/r;I)V", "Ldk2/d$a;", "screenData", "i", "(Ldk2/d$a;Lm2/r;I)V", "Ldk2/d$a$b;", "k", "(Ldk2/d$a$b;Lm2/r;I)V", "Ldk2/d$a$c$b;", "m", "(Ldk2/d$a$c$b;Lm2/r;I)V", "Ldk2/d$a$c$a;", "g", "(Ldk2/d$a$c$a;Lm2/r;I)V", "login_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class k {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class a extends vq.k implements er.p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f43206e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ d.a.c.Password f43207f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ d60.c f43208g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(d.a.c.Password password, d60.c cVar, tq.e<? super a> eVar) {
            super(2, eVar);
            this.f43207f = password;
            this.f43208g = cVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f43206e;
            if (i15 == 0) {
                oq.u.b(obj);
                if (this.f43207f.getPasswordInputData().getValidationState() instanceof hz.b.Invalid) {
                    d60.c cVar = this.f43208g;
                    this.f43206e = 1;
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
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((a) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return new a(this.f43207f, this.f43208g, eVar);
        }
    }

    public static final void g(final d.a.c.Biometric biometric, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(1890192408);
        if ((i15 & 6) == 0) {
            i16 = i15 | ((i15 & 8) == 0 ? rVarH.W(biometric) : rVarH.G(biometric) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1890192408, i16, -1, "pl.gov.coi.mobywatel.feature.login.presentation.screen.login.LoginBiometricContent (LoginScreen.kt:125)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarB = androidx.compose.ui.draw.a.b(androidx.compose.foundation.layout.d.f(companion, 0.0f, 1, null), l4.c.c(c20.b.D, rVarH, 0), false, null, p036e4.l.INSTANCE.a(), 0.0f, null, 54, null);
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            f3.m mVarP = a3.p(mVarB, aVar.b(rVarH, i17).getSpacing200(), 0.0f, 2, null);
            d1.i iVar = d1.i.f39152a;
            d1.i.n nVarK = iVar.k();
            f3.c.Companion companion2 = f3.c.INSTANCE;
            w0 w0VarA = d1.e0.a(nVarK, companion2.k(), rVarH, 0);
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
            d1.i0 i0Var = d1.i0.f39176a;
            f3.m mVarS = t70.i.S(h0.b(i0Var, companion, 1.0f, false, 2, null), null, rVarH, 0, 1);
            w0 w0VarA2 = d1.e0.a(iVar.k(), companion2.k(), rVarH, 0);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT2 = rVarH.t();
            f3.m mVarE2 = f3.j.e(rVarH, mVarS);
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
            k20.b.b(biometric.getGreetingsHeaderData(), rVarH, GreetingsHeaderData.f115424c);
            r3.a(h0.b(i0Var, companion, 1.0f, false, 2, null), rVarH, 0);
            f3.m mVarL = androidx.compose.foundation.b.l(androidx.compose.foundation.layout.d.h(companion, 0.0f, 1, null), new t70.x(), null, false, null, null, biometric.e(), 28, null);
            w0 w0VarA3 = d1.e0.a(iVar.k(), companion2.g(), rVarH, 48);
            int iHashCode3 = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT3 = rVarH.t();
            f3.m mVarE3 = f3.j.e(rVarH, mVarL);
            er.a<androidx.compose.ui.node.c> aVarB3 = companion3.b();
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
            n6.i(rVarC3, w0VarA3, companion3.d());
            n6.i(rVarC3, e0VarT3, companion3.f());
            n6.i(rVarC3, Integer.valueOf(iHashCode3), companion3.c());
            n6.g(rVarC3, companion3.a());
            n6.i(rVarC3, mVarE3, companion3.e());
            d40.h.f(null, biometric.getBiometricIconData(), false, rVarH, d40.b.f39676g << 3, 5);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i17).getSpacing100()), rVarH, 0);
            j70.h.g(null, null, biometric.getBiometricInstruction(), null, null, aVar.a(rVarH, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, null, null, 0L, null, b5.j.h(b5.j.INSTANCE.a()), 0L, 0, false, 0, 0, null, aVar.f(rVarH, i17).b(), null, null, false, false, null, rVarH, 0, 0, 0, 33026011);
            rVarH = rVarH;
            rVarH.x();
            r3.a(h0.b(i0Var, companion, 1.0f, false, 2, null), rVarH, 0);
            rVarH.x();
            f3.m mVarP2 = a3.p(companion, 0.0f, aVar.b(rVarH, i17).getSpacing200(), 1, null);
            w0 w0VarB = m3.b(iVar.j(), companion2.l(), rVarH, 0);
            int iHashCode4 = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT4 = rVarH.t();
            f3.m mVarE4 = f3.j.e(rVarH, mVarP2);
            er.a<androidx.compose.ui.node.c> aVarB4 = companion3.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB4);
            } else {
                rVarH.u();
            }
            p076m2.r rVarC4 = n6.c(rVarH);
            n6.i(rVarC4, w0VarB, companion3.d());
            n6.i(rVarC4, e0VarT4, companion3.f());
            n6.i(rVarC4, Integer.valueOf(iHashCode4), companion3.c());
            n6.g(rVarC4, companion3.a());
            n6.i(rVarC4, mVarE4, companion3.e());
            q3 q3Var = q3.f39261a;
            h30.q.p(biometric.getToLoginPasswordButtonData(), false, null, rVarH, 0, 6);
            rVarH.x();
            e60.f.e(biometric.getFooterData(), null, rVarH, FooterData.f47642h, 2);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i17).getSpacing100()), rVarH, 0);
            rVarH.x();
            i0 i0Var2 = i0.f148189a;
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: dk2.g
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return k.h(biometric, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(d.a.c.Biometric biometric, int i15, p076m2.r rVar, int i16) {
        g(biometric, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void i(final d.a aVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1937311840);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(aVar) : rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1937311840, i16, -1, "pl.gov.coi.mobywatel.feature.login.presentation.screen.login.LoginContent (LoginScreen.kt:52)");
            }
            if (fr.t.c(aVar, d.a.C0959a.f43172a)) {
                rVarH.X(-2035835516);
                rVarH.R();
            } else {
                if (!(aVar instanceof d.a.Initialized)) {
                    rVarH.X(-2035837156);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(-2035833936);
                k((d.a.Initialized) aVar, rVarH, i16 & 14);
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
            d5VarM.a(new er.p() { // from class: dk2.e
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return k.j(aVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j(d.a aVar, int i15, p076m2.r rVar, int i16) {
        i(aVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void k(final d.a.Initialized initialized, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(553338584);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(initialized) : rVarH.G(initialized) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(553338584, i16, -1, "pl.gov.coi.mobywatel.feature.login.presentation.screen.login.LoginInitializedContent (LoginScreen.kt:60)");
            }
            d.a.c loginContent = initialized.getLoginContent();
            if (loginContent instanceof d.a.c.Password) {
                rVarH.X(2093673249);
                m((d.a.c.Password) initialized.getLoginContent(), rVarH, 0);
                rVarH.R();
            } else {
                if (!(loginContent instanceof d.a.c.Biometric)) {
                    rVarH.X(2093671031);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(2093676514);
                g((d.a.c.Biometric) initialized.getLoginContent(), rVarH, 0);
                rVarH.R();
            }
            q0.g(false, initialized.b(), rVarH, 0, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: dk2.f
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return k.l(initialized, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(d.a.Initialized initialized, int i15, p076m2.r rVar, int i16) {
        k(initialized, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void m(final d.a.c.Password password, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(1387277388);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(password) : rVarH.G(password) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1387277388, i16, -1, "pl.gov.coi.mobywatel.feature.login.presentation.screen.login.LoginPasswordContent (LoginScreen.kt:69)");
            }
            final d60.c cVarB = d60.e.b(false, null, rVarH, 0, 3);
            hz.b validationState = password.getPasswordInputData().getValidationState();
            boolean zG = rVarH.G(password) | rVarH.W(cVarB);
            Object objE = rVarH.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new a(password, cVarB, null);
                rVarH.v(objE);
            }
            Function0.d(validationState, (er.p) objE, rVarH, hz.b.f86845b);
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarB = androidx.compose.ui.draw.a.b(androidx.compose.foundation.layout.d.f(companion, 0.0f, 1, null), l4.c.c(c20.b.D, rVarH, 0), false, null, p036e4.l.INSTANCE.a(), 0.0f, null, 54, null);
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            f3.m mVarP = a3.p(mVarB, aVar.b(rVarH, i17).getSpacing200(), 0.0f, 2, null);
            d1.i iVar = d1.i.f39152a;
            d1.i.n nVarK = iVar.k();
            f3.c.Companion companion2 = f3.c.INSTANCE;
            w0 w0VarA = d1.e0.a(nVarK, companion2.k(), rVarH, 0);
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
            f3.m mVarS = t70.i.S(h0.b(d1.i0.f39176a, androidx.compose.foundation.layout.d.f(companion, 0.0f, 1, null), 1.0f, false, 2, null), null, rVarH, 0, 1);
            w0 w0VarA2 = d1.e0.a(iVar.k(), companion2.k(), rVarH, 0);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT2 = rVarH.t();
            f3.m mVarE2 = f3.j.e(rVarH, mVarS);
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
            k20.b.b(password.getGreetingsHeaderData(), rVarH, GreetingsHeaderData.f115424c);
            f3.m mVarR = a3.r(companion, 0.0f, aVar.b(rVarH, i17).getSpacing300(), 0.0f, 0.0f, 13, null);
            w0 w0VarA3 = d1.e0.a(iVar.k(), companion2.g(), rVarH, 48);
            int iHashCode3 = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT3 = rVarH.t();
            f3.m mVarE3 = f3.j.e(rVarH, mVarR);
            er.a<androidx.compose.ui.node.c> aVarB3 = companion3.b();
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
            n6.i(rVarC3, w0VarA3, companion3.d());
            n6.i(rVarC3, e0VarT3, companion3.f());
            n6.i(rVarC3, Integer.valueOf(iHashCode3), companion3.c());
            n6.g(rVarC3, companion3.a());
            n6.i(rVarC3, mVarE3, companion3.e());
            x30.c.c(null, 0.0f, y2.m.d(369340870, true, new er.p() { // from class: dk2.h
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return k.n(password, cVarB, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), rVarH, MLKEMEngine.KyberPolyBytes, 3);
            rVarH.x();
            rVarH.x();
            f3.m mVarP2 = a3.p(companion, 0.0f, aVar.b(rVarH, i17).getSpacing200(), 1, null);
            w0 w0VarA4 = d1.e0.a(iVar.k(), companion2.k(), rVarH, 0);
            int iHashCode4 = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT4 = rVarH.t();
            f3.m mVarE4 = f3.j.e(rVarH, mVarP2);
            er.a<androidx.compose.ui.node.c> aVarB4 = companion3.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB4);
            } else {
                rVarH.u();
            }
            p076m2.r rVarC4 = n6.c(rVarH);
            n6.i(rVarC4, w0VarA4, companion3.d());
            n6.i(rVarC4, e0VarT4, companion3.f());
            n6.i(rVarC4, Integer.valueOf(iHashCode4), companion3.c());
            n6.g(rVarC4, companion3.a());
            n6.i(rVarC4, mVarE4, companion3.e());
            h30.q.p(password.getLoginButtonData(), false, null, rVarH, 0, 6);
            ButtonData toLoginBiometricButtonData = password.getToLoginBiometricButtonData();
            if (toLoginBiometricButtonData == null) {
                rVarH.X(-628820557);
            } else {
                rVarH.X(-628820556);
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i17).getSpacing150()), rVarH, 0);
                h30.q.p(toLoginBiometricButtonData, false, null, rVarH, 0, 6);
                i0 i0Var = i0.f148189a;
            }
            rVarH.R();
            rVarH.x();
            if (password.getIsImeVisible()) {
                rVarH.X(-1449736689);
            } else {
                rVarH.X(-1445303472);
                e60.f.e(password.getFooterData(), null, rVarH, FooterData.f47642h, 2);
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i17).getSpacing100()), rVarH, 0);
            }
            rVarH.R();
            rVarH.x();
            i0 i0Var2 = i0.f148189a;
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: dk2.i
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return k.o(password, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n(d.a.c.Password password, d60.c cVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(369340870, i15, -1, "pl.gov.coi.mobywatel.feature.login.presentation.screen.login.LoginPasswordContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LoginScreen.kt:99)");
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
            v0.g(password.getPasswordInputData(), cVar, rVar, v50.c.f203957t, 0);
            r3.a(androidx.compose.foundation.layout.d.i(companion, k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing100()), rVar, 0);
            j30.f.e(null, password.getForgottenPasswordButtonTextData(), false, rVar, ButtonTextData.f99099f << 3, 5);
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
    public static final i0 o(d.a.c.Password password, int i15, p076m2.r rVar, int i16) {
        m(password, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void p(final d dVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(726703087);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(dVar) : rVarH.G(dVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(726703087, i16, -1, "pl.gov.coi.mobywatel.feature.login.presentation.screen.login.LoginScreen (LoginScreen.kt:43)");
            }
            f6 f6VarC = m7.b.c(dVar.getState(), null, null, null, rVarH, 0, 7);
            oz.l.b(dVar.getLifecycleConnector(), rVarH, 0);
            i(q(f6VarC), rVarH, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: dk2.j
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return k.r(dVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final d.a q(f6<? extends d.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r(d dVar, int i15, p076m2.r rVar, int i16) {
        p(dVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
