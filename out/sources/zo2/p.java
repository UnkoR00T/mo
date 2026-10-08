package zo2;

import d1.d3;
import d1.e0;
import d1.h0;
import d1.r3;
import e60.FooterData;
import i50.BaseScaffoldData;
import java.io.IOException;
import ju.p0;
import l20.GreetingsHeaderData;
import oq.i0;
import org.xmlpull.v1.XmlPullParserException;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.Function0;
import p076m2.a3;
import p076m2.c6;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p088nul.q0;
import u0.x2;
import w0.i1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\tH\u0003¢\u0006\u0004\b\n\u0010\u000b\u001a\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\fH\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0017\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0012H\u0003¢\u0006\u0004\b\u0013\u0010\u0014\"\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017\"\u0014\u0010\u001a\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017¨\u0006\u001e²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u001c\u001a\u00020\u001b8\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\u001d\u001a\u00020\u00158\nX\u008a\u0084\u0002"}, d2 = {"Lzo2/f;", "viewModel", "Loq/i0;", "w", "(Lzo2/f;Lm2/r;I)V", "Lzo2/f$a;", "screenData", "z", "(Lzo2/f$a;Lm2/r;I)V", "Lzo2/f$a$a;", "j", "(Lzo2/f$a$a;Lm2/r;I)V", "Lzo2/f$a$c;", "s", "(Lzo2/f$a$c;Lm2/r;I)V", "Lzo2/f$a$d;", "u", "(Lzo2/f$a$d;Lm2/r;I)V", "Lzo2/f$a$b;", "p", "(Lzo2/f$a$b;Lm2/r;I)V", "Lc5/h;", "a", "F", "LOGO_TARGET_SIZE", "b", "LOGO_START_SIZE", "", "startLogoAnimation", "animatedSize", "onboarding_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f235836a = c5.h.n(133);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f235837b = c5.h.n(56);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class a extends vq.k implements er.p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f235838e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ a3<Boolean> f235839f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(a3<Boolean> a3Var, tq.e<? super a> eVar) {
            super(2, eVar);
            this.f235839f = a3Var;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f235838e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            p.l(this.f235839f, true);
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((a) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return new a(this.f235839f, eVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p114t0.v A(p114t0.h hVar) {
        return p114t0.d.f(p114t0.a0.o(u0.m.l(1000, 500, null, 4, null), 0.0f, 2, null), p114t0.a0.q(u0.m.l(1000, 0, null, 6, null), 0.0f, 2, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 B(f.a aVar, int i15, p076m2.r rVar, int i16) {
        z(aVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(final f.a.AnimatedLogo animatedLogo, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-194478482);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.W(animatedLogo) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-194478482, i16, -1, "pl.gov.coi.mobywatel.feature.onboarding.presentation.screen.splash.AnimatedLogo (SplashScreen.kt:103)");
            }
            Object objE = rVarH.E();
            p076m2.r.Companion companion = p076m2.r.INSTANCE;
            if (objE == companion.a()) {
                objE = c6.e(Boolean.FALSE, null, 2, null);
                rVarH.v(objE);
            }
            a3 a3Var = (a3) objE;
            float f15 = k(a3Var) ? f235836a : f235837b;
            x2 x2VarL = u0.m.l(1000, 0, null, 6, null);
            boolean z15 = (i16 & 14) == 4;
            Object objE2 = rVarH.E();
            if (z15 || objE2 == companion.a()) {
                objE2 = new er.l() { // from class: zo2.m
                    @Override // er.l
                    public final Object b(Object obj) {
                        return p.m(animatedLogo, (c5.h) obj);
                    }
                };
                rVarH.v(objE2);
            }
            i1.c(l4.c.c(c20.b.f22730x, rVarH, 0), null, androidx.compose.foundation.layout.d.t(f3.m.INSTANCE, n(u0.f.d(f15, x2VarL, "animatedSize", (er.l) objE2, rVarH, 432, 0))), null, null, 0.0f, null, rVarH, androidx.compose.ui.graphics.painter.a.f9956g | 48, 120);
            rVarH = rVarH;
            i0 i0Var = i0.f148189a;
            Object objE3 = rVarH.E();
            if (objE3 == companion.a()) {
                objE3 = new a(a3Var, null);
                rVarH.v(objE3);
            }
            Function0.d(i0Var, (er.p) objE3, rVarH, 6);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: zo2.n
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return p.o(animatedLogo, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final boolean k(a3<Boolean> a3Var) {
        return a3Var.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(a3<Boolean> a3Var, boolean z15) {
        a3Var.setValue(Boolean.valueOf(z15));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(f.a.AnimatedLogo animatedLogo, c5.h hVar) {
        animatedLogo.b().a();
        return i0.f148189a;
    }

    private static final float n(f6<c5.h> f6Var) {
        return f6Var.getValue().getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o(f.a.AnimatedLogo animatedLogo, int i15, p076m2.r rVar, int i16) {
        j(animatedLogo, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(final f.a.JuniorInfoScreen juniorInfoScreen, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(-690483611);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(juniorInfoScreen) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-690483611, i16, -1, "pl.gov.coi.mobywatel.feature.onboarding.presentation.screen.splash.JuniorInfoScreenContent (SplashScreen.kt:178)");
            }
            rVar2 = rVarH;
            i50.s.r(juniorInfoScreen.getScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-812483886, true, new er.q() { // from class: zo2.k
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return p.q(juniorInfoScreen, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
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
            d5VarM.a(new er.p() { // from class: zo2.l
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return p.r(juniorInfoScreen, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(f.a.JuniorInfoScreen juniorInfoScreen, d3 d3Var, p076m2.r rVar, int i15) throws XmlPullParserException, IOException {
        if ((i15 & 6) == 0) {
            i15 |= rVar.W(d3Var) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-812483886, i15, -1, "pl.gov.coi.mobywatel.feature.onboarding.presentation.screen.splash.JuniorInfoScreenContent.<anonymous> (SplashScreen.kt:182)");
            }
            f3.m mVarL = d1.a3.l(f3.m.INSTANCE, d3Var);
            k70.a aVar = k70.a.f108864a;
            int i16 = k70.a.f108865b;
            f3.m mVarS = t70.i.S(androidx.compose.foundation.layout.d.f(d1.a3.q(mVarL, aVar.b(rVar, i16).getSpacing200(), aVar.b(rVar, i16).getSpacing100(), aVar.b(rVar, i16).getSpacing200(), aVar.b(rVar, i16).getSpacing200()), 0.0f, 1, null), null, rVar, 0, 1);
            w0 w0VarA = e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarS);
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
            o40.j.i(juniorInfoScreen.getHeaderData(), rVar, 0);
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
    public static final i0 r(f.a.JuniorInfoScreen juniorInfoScreen, int i15, p076m2.r rVar, int i16) {
        p(juniorInfoScreen, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void s(final f.a.Onboarding onboarding, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(992537653);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(onboarding) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(992537653, i16, -1, "pl.gov.coi.mobywatel.feature.onboarding.presentation.screen.splash.OnboardingContent (SplashScreen.kt:132)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            f3.m mVarS = t70.i.S(androidx.compose.foundation.layout.d.f(d1.a3.o(companion, aVar.b(rVarH, i17).getSpacing200(), aVar.b(rVarH, i17).getSpacing100()), 0.0f, 1, null), null, rVarH, 0, 1);
            w0 w0VarA = e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVarH, 0);
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
            k20.b.b(onboarding.getGreetingsHeaderData(), rVarH, GreetingsHeaderData.f115424c);
            r3.a(h0.b(i0Var, companion, 1.0f, false, 2, null), rVarH, 0);
            n50.h0.v(onboarding.getVerificationSingleCardData(), null, rVarH, 0, 2);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i17).getSpacing200()), rVarH, 0);
            h30.q.p(onboarding.getRegistrationButton(), false, null, rVarH, 0, 6);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i17).getSpacing200()), rVarH, 0);
            e60.f.e(onboarding.getFooterData(), null, rVarH, FooterData.f47642h, 2);
            rVarH.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: zo2.o
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return p.t(onboarding, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t(f.a.Onboarding onboarding, int i15, p076m2.r rVar, int i16) {
        s(onboarding, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void u(final f.a.OnboardingWithMJuniorIntegration onboardingWithMJuniorIntegration, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1779876307);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(onboardingWithMJuniorIntegration) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1779876307, i16, -1, "pl.gov.coi.mobywatel.feature.onboarding.presentation.screen.splash.OnboardingWithMJuniorIntegrationContent (SplashScreen.kt:154)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            f3.m mVarS = t70.i.S(androidx.compose.foundation.layout.d.f(d1.a3.o(companion, aVar.b(rVarH, i17).getSpacing200(), aVar.b(rVarH, i17).getSpacing100()), 0.0f, 1, null), null, rVarH, 0, 1);
            w0 w0VarA = e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVarH, 0);
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
            k20.b.b(onboardingWithMJuniorIntegration.getGreetingsHeaderData(), rVarH, GreetingsHeaderData.f115424c);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i17).getSpacing300()), rVarH, 0);
            n50.h0.v(onboardingWithMJuniorIntegration.getMObywatelActivationSingleCardData(), null, rVarH, 0, 2);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i17).getSpacing200()), rVarH, 0);
            n50.h0.v(onboardingWithMJuniorIntegration.getMJuniorActivationSingleCardData(), null, rVarH, 0, 2);
            r3.a(h0.b(i0Var, companion, 1.0f, false, 2, null), rVarH, 0);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i17).getSpacing200()), rVarH, 0);
            e60.f.e(onboardingWithMJuniorIntegration.getFooterData(), null, rVarH, FooterData.f47642h, 2);
            rVarH.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: zo2.j
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return p.v(onboardingWithMJuniorIntegration, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v(f.a.OnboardingWithMJuniorIntegration onboardingWithMJuniorIntegration, int i15, p076m2.r rVar, int i16) {
        u(onboardingWithMJuniorIntegration, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void w(final f fVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-589367157);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(fVar) : rVarH.G(fVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-589367157, i16, -1, "pl.gov.coi.mobywatel.feature.onboarding.presentation.screen.splash.SplashScreen (SplashScreen.kt:53)");
            }
            f6 f6VarC = m7.b.c(fVar.getState(), null, null, null, rVarH, 0, 7);
            z(x(f6VarC), rVarH, 0);
            q0.g(false, x(f6VarC).a(), rVarH, 0, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: zo2.g
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return p.y(fVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final f.a x(f6<? extends f.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 y(f fVar, int i15, p076m2.r rVar, int i16) {
        w(fVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void z(final f.a aVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(1679874414);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(aVar) : rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1679874414, i16, -1, "pl.gov.coi.mobywatel.feature.onboarding.presentation.screen.splash.SplashScreenContent (SplashScreen.kt:62)");
            }
            f3.m mVarB = androidx.compose.ui.draw.a.b(androidx.compose.foundation.layout.d.f(f3.m.INSTANCE, 0.0f, 1, null), l4.c.c(c20.b.D, rVarH, 0), false, null, p036e4.l.INSTANCE.b(), 0.0f, null, 54, null);
            f3.c.Companion companion = f3.c.INSTANCE;
            w0 w0VarI = d1.r.i(companion.e(), false);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, mVarB);
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
            n6.i(rVarC, w0VarI, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
            n6.g(rVarC, companion2.a());
            n6.i(rVarC, mVarE, companion2.e());
            d1.x xVar = d1.x.f39368a;
            f3.c cVarE = companion.e();
            Object objE = rVarH.E();
            if (objE == p076m2.r.INSTANCE.a()) {
                objE = new er.l() { // from class: zo2.h
                    @Override // er.l
                    public final Object b(Object obj) {
                        return p.A((p114t0.h) obj);
                    }
                };
                rVarH.v(objE);
            }
            p114t0.d.a(aVar, null, (er.l) objE, cVarE, "animatedContent", null, b.f235781a.b(), rVarH, (i16 & 14) | 1600896, 34);
            rVarH.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: zo2.i
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return p.B(aVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
