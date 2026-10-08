package zo2;

import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f235781a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static er.r<p114t0.f, f.a, p076m2.r, Integer, i0> f235782b = y2.m.b(1822299127, false, new er.r() { // from class: zo2.a
        @Override // er.r
        public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
            return b.c((p114t0.f) obj, (f.a) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 c(p114t0.f fVar, f.a aVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1822299127, i15, -1, "pl.gov.coi.mobywatel.feature.onboarding.presentation.screen.splash.ComposableSingletons$SplashScreenKt.lambda$1822299127.<anonymous> (SplashScreen.kt:86)");
        }
        if (aVar instanceof f.a.AnimatedLogo) {
            rVar.X(-1117192707);
            p.j((f.a.AnimatedLogo) aVar, rVar, (i15 >> 3) & 14);
            rVar.R();
        } else if (aVar instanceof f.a.Onboarding) {
            rVar.X(-1117189950);
            p.s((f.a.Onboarding) aVar, rVar, (i15 >> 3) & 14);
            rVar.R();
        } else if (aVar instanceof f.a.OnboardingWithMJuniorIntegration) {
            rVar.X(-1117185967);
            p.u((f.a.OnboardingWithMJuniorIntegration) aVar, rVar, (i15 >> 3) & 14);
            rVar.R();
        } else {
            if (!(aVar instanceof f.a.JuniorInfoScreen)) {
                rVar.X(-1117194504);
                rVar.R();
                throw new oq.p();
            }
            rVar.X(-1117181368);
            p.p((f.a.JuniorInfoScreen) aVar, rVar, (i15 >> 3) & 14);
            rVar.R();
        }
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    public final er.r<p114t0.f, f.a, p076m2.r, Integer, i0> b() {
        return f235782b;
    }
}
