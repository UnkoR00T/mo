package mc0;

import d1.a3;
import d1.d3;
import d1.r3;
import e60.FooterData;
import h30.ButtonData;
import i50.BaseScaffoldData;
import j30.ButtonTextData;
import oq.i0;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p088nul.q0;
import u50.v0;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lmc0/k;", "viewModel", "Loq/i0;", "p", "(Lmc0/k;Lm2/r;I)V", "Lmc0/k$a$c;", "data", "l", "(Lmc0/k$a$c;Lm2/r;I)V", "Lmc0/k$a$a;", "h", "(Lmc0/k$a$a;Lm2/r;I)V", "login_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class h {
    public static final void h(final k.a.Biometric biometric, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(-1862270410);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(biometric) : rVarH.G(biometric) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1862270410, i16, -1, "pl.gov.coi.mjunior.feature.login.presentation.screen.login.LoginBiometricContent (LoginScreen.kt:94)");
            }
            rVar2 = rVarH;
            i50.s.r(biometric.getScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-2107400221, true, new er.q() { // from class: mc0.d
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return h.i(biometric, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
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
            d5VarM.a(new er.p() { // from class: mc0.e
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return h.k(biometric, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(final k.a.Biometric biometric, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-2107400221, i16, -1, "pl.gov.coi.mjunior.feature.login.presentation.screen.login.LoginBiometricContent.<anonymous> (LoginScreen.kt:96)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarS = t70.i.S(androidx.compose.foundation.layout.d.f(a3.l(companion, d3Var), 0.0f, 1, null), null, rVar, 0, 1);
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            f3.m mVarP = a3.p(mVarS, aVar.b(rVar, i17).getSpacing200(), 0.0f, 2, null);
            d1.i iVar = d1.i.f39152a;
            d1.i.n nVarK = iVar.k();
            f3.c.Companion companion2 = f3.c.INSTANCE;
            w0 w0VarA = d1.e0.a(nVarK, companion2.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarP);
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
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing100()), rVar, 0);
            j70.h.g(null, null, biometric.getGreetingsTitle(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i17).g(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing100()), rVar, 0);
            j70.h.g(null, null, biometric.getGreetingsDescription(), null, null, aVar.a(rVar, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i17).b(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
            f3.m mVarN = androidx.compose.foundation.b.n(androidx.compose.foundation.layout.d.h(d1.h0.b(i0Var, companion, 1.0f, false, 2, null), 0.0f, 1, null), false, null, null, null, biometric.h(), 15, null);
            w0 w0VarA2 = d1.e0.a(iVar.e(), companion2.g(), rVar, 54);
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
            n6.i(rVarC2, w0VarA2, companion3.d());
            n6.i(rVarC2, e0VarT2, companion3.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion3.c());
            n6.g(rVarC2, companion3.a());
            n6.i(rVarC2, mVarE2, companion3.e());
            d40.h.f(null, biometric.getBiometricIconData(), false, rVar, d40.b.f39676g << 3, 5);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing200()), rVar, 0);
            j70.h.g(null, null, biometric.getBiometricDescription(), null, null, aVar.a(rVar, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i17).b(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
            rVar.x();
            h30.q.p(biometric.getEnterPinButtonData(), false, null, rVar, 0, 6);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing200()), rVar, 0);
            e60.f.e(biometric.getFooterData(), a3.r(companion, 0.0f, 0.0f, 0.0f, aVar.b(rVar, i17).getSpacing100(), 7, null), rVar, FooterData.f47642h, 0);
            rVar.x();
            boolean zG = rVar.G(biometric);
            Object objE = rVar.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.a() { // from class: mc0.g
                    @Override // er.a
                    public final Object a() {
                        return h.j(biometric);
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
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j(k.a.Biometric biometric) {
        biometric.g().a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k(k.a.Biometric biometric, int i15, p076m2.r rVar, int i16) {
        h(biometric, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void l(final k.a.Password password, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(-21454998);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(password) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-21454998, i16, -1, "pl.gov.coi.mjunior.feature.login.presentation.screen.login.LoginPasswordContent (LoginScreen.kt:52)");
            }
            rVar2 = rVarH;
            i50.s.r(password.getScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(1372701783, true, new er.q() { // from class: mc0.b
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return h.m(password, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
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
            d5VarM.a(new er.p() { // from class: mc0.c
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return h.o(password, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(final k.a.Password password, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1372701783, i16, -1, "pl.gov.coi.mjunior.feature.login.presentation.screen.login.LoginPasswordContent.<anonymous> (LoginScreen.kt:54)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarS = t70.i.S(androidx.compose.foundation.layout.d.f(a3.l(companion, d3Var), 0.0f, 1, null), null, rVar, 0, 1);
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            f3.m mVarP = a3.p(mVarS, aVar.b(rVar, i17).getSpacing200(), 0.0f, 2, null);
            w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
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
            n6.i(rVarC, w0VarA, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
            n6.g(rVarC, companion2.a());
            n6.i(rVarC, mVarE, companion2.e());
            d1.i0 i0Var = d1.i0.f39176a;
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing100()), rVar, 0);
            j70.h.g(null, null, password.getGreetingsTitle(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i17).g(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing100()), rVar, 0);
            j70.h.g(null, null, password.getGreetingsDescription(), null, null, aVar.a(rVar, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i17).b(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing200()), rVar, 0);
            v0.g(password.getPinTextInputData(), d60.e.b(password.getShouldFocusWithKeyboard(), null, rVar, 0, 2), rVar, v50.c.f203957t, 0);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing200()), rVar, 0);
            j30.f.e(null, password.getForgotPasswordTextData(), false, rVar, ButtonTextData.f99099f << 3, 5);
            r3.a(d1.h0.b(i0Var, companion, 1.0f, false, 2, null), rVar, 0);
            ButtonData biometricButtonData = password.getBiometricButtonData();
            if (biometricButtonData == null) {
                rVar.X(1561815366);
            } else {
                rVar.X(1561815367);
                h30.q.p(biometricButtonData, false, null, rVar, 0, 6);
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing200()), rVar, 0);
            }
            rVar.R();
            e60.f.e(password.getFooterData(), a3.r(companion, 0.0f, 0.0f, 0.0f, aVar.b(rVar, i17).getSpacing100(), 7, null), rVar, FooterData.f47642h, 0);
            rVar.x();
            boolean zG = rVar.G(password);
            Object objE = rVar.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.a() { // from class: mc0.f
                    @Override // er.a
                    public final Object a() {
                        return h.n(password);
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
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n(k.a.Password password) {
        password.g().a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o(k.a.Password password, int i15, p076m2.r rVar, int i16) {
        l(password, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void p(final k kVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(719756237);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(kVar) : rVarH.G(kVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(719756237, i16, -1, "pl.gov.coi.mjunior.feature.login.presentation.screen.login.LoginScreen (LoginScreen.kt:33)");
            }
            f6 f6VarC = m7.b.c(kVar.getState(), null, null, null, rVarH, 0, 7);
            oz.l.b(kVar.getLifecycleConnector(), rVarH, 0);
            k.a aVar = (k.a) f6VarC.getValue();
            if (fr.t.c(aVar, k.a.b.f125417a)) {
                rVarH.X(196016798);
                c60.b.b(rVarH, 0);
                rVarH.R();
            } else if (aVar instanceof k.a.Password) {
                rVarH.X(1781615072);
                k.a.Password password = (k.a.Password) aVar;
                cb4.i dialogVMSAdapter = password.getDialogVMSAdapter();
                if (dialogVMSAdapter == null) {
                    rVarH.X(1781643436);
                } else {
                    rVarH.X(196019701);
                    dialogVMSAdapter.b(rVarH, 0);
                }
                rVarH.R();
                l(password, rVarH, 0);
                rVarH.R();
            } else {
                if (!(aVar instanceof k.a.Biometric)) {
                    rVarH.X(196014690);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(196023055);
                h((k.a.Biometric) aVar, rVarH, 0);
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
            d5VarM.a(new er.p() { // from class: mc0.a
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return h.q(kVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(k kVar, int i15, p076m2.r rVar, int i16) {
        p(kVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
