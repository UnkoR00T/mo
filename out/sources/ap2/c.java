package ap2;

import ac4.p;
import androidx.compose.ui.graphics.Color;
import e60.FooterData;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import l20.GreetingsHeaderData;
import mx.Label;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.LeadingSection;
import n50.SingleCardLabel;
import n50.i;
import n50.x0;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import x50.NavigationButtonData;
import xw.f;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000fB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\r\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lap2/c;", "Lxw/f;", "Lap2/c$a;", "Lzo2/f$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "Lac4/p;", "Lmx/a;", "c", "(Lac4/p;)Lmx/a;", "params", "e", "(Lap2/c$a;)Lzo2/f$a;", "a", "Lmx/c;", "onboarding_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements f<Params, zo2.f.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: ap2.c$a, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001Bc\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b\u0018\u0010\u001eR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b \u0010\u001eR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\u001d\u001a\u0004\b\"\u0010\u001eR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010\u001d\u001a\u0004\b!\u0010\u001eR\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001d\u001a\u0004\b\u001f\u0010\u001e¨\u0006#"}, d2 = {"Lap2/c$a;", "", "Lzo2/e;", "state", "Lkotlin/Function0;", "Loq/i0;", "displayOnboardingContent", "closeAction", "goToActivateApp", "goToVerification", "goToMJuniorActivation", "goBack", "<init>", "(Lzo2/e;Ler/a;Ler/a;Ler/a;Ler/a;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lzo2/e;", "g", "()Lzo2/e;", "b", "Ler/a;", "()Ler/a;", "c", "d", "e", "f", "onboarding_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final zo2.e state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> displayOnboardingContent;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> closeAction;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> goToActivateApp;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> goToVerification;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> goToMJuniorActivation;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> goBack;

        public Params(zo2.e eVar, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3, er.a<i0> aVar4, er.a<i0> aVar5, er.a<i0> aVar6) {
            this.state = eVar;
            this.displayOnboardingContent = aVar;
            this.closeAction = aVar2;
            this.goToActivateApp = aVar3;
            this.goToVerification = aVar4;
            this.goToMJuniorActivation = aVar5;
            this.goBack = aVar6;
        }

        public final er.a<i0> a() {
            return this.closeAction;
        }

        public final er.a<i0> b() {
            return this.displayOnboardingContent;
        }

        public final er.a<i0> c() {
            return this.goBack;
        }

        public final er.a<i0> d() {
            return this.goToActivateApp;
        }

        public final er.a<i0> e() {
            return this.goToMJuniorActivation;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.displayOnboardingContent, params.displayOnboardingContent) && t.c(this.closeAction, params.closeAction) && t.c(this.goToActivateApp, params.goToActivateApp) && t.c(this.goToVerification, params.goToVerification) && t.c(this.goToMJuniorActivation, params.goToMJuniorActivation) && t.c(this.goBack, params.goBack);
        }

        public final er.a<i0> f() {
            return this.goToVerification;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final zo2.e getState() {
            return this.state;
        }

        public int hashCode() {
            return (((((((((((this.state.hashCode() * 31) + this.displayOnboardingContent.hashCode()) * 31) + this.closeAction.hashCode()) * 31) + this.goToActivateApp.hashCode()) * 31) + this.goToVerification.hashCode()) * 31) + this.goToMJuniorActivation.hashCode()) * 31) + this.goBack.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", displayOnboardingContent=" + this.displayOnboardingContent + ", closeAction=" + this.closeAction + ", goToActivateApp=" + this.goToActivateApp + ", goToVerification=" + this.goToVerification + ", goToMJuniorActivation=" + this.goToMJuniorActivation + ", goBack=" + this.goBack + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f13995a;

        static {
            int[] iArr = new int[p.values().length];
            try {
                iArr[p.MORNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p.AFTERNOON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p.EVENING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f13995a = iArr;
        }
    }

    /* JADX INFO: renamed from: ap2.c$c, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C0301c implements er.p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0301c f13996a = new C0301c();

        C0301c() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(-1986720914);
            if (p076m2.t.k()) {
                p076m2.t.o(-1986720914, i15, -1, "pl.gov.coi.mobywatel.feature.onboarding.presentation.screen.splash.mapper.SplashScreenMapper.invoke.<anonymous> (SplashScreenMapper.kt:68)");
            }
            long jB = k70.a.f108864a.a(rVar, k70.a.f108865b).getNeutral().b();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jB;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class d implements er.p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f13997a = new d();

        d() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(2031477139);
            if (p076m2.t.k()) {
                p076m2.t.o(2031477139, i15, -1, "pl.gov.coi.mobywatel.feature.onboarding.presentation.screen.splash.mapper.SplashScreenMapper.invoke.<anonymous> (SplashScreenMapper.kt:206)");
            }
            long primary = k70.a.f108864a.a(rVar, k70.a.f108865b).getBase().getPrimary();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return primary;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class e implements er.p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f13998a = new e();

        e() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(-1099908972);
            if (p076m2.t.k()) {
                p076m2.t.o(-1099908972, i15, -1, "pl.gov.coi.mobywatel.feature.onboarding.presentation.screen.splash.mapper.SplashScreenMapper.invoke.<anonymous> (SplashScreenMapper.kt:207)");
            }
            long secondary = k70.a.f108864a.a(rVar, k70.a.f108865b).getBase().getSecondary();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return secondary;
        }
    }

    public c(mx.c cVar) {
        this.labelProvider = cVar;
    }

    private final Label c(p pVar) {
        int i15 = b.f13995a[pVar.ordinal()];
        if (i15 == 1) {
            return this.labelProvider.c(oo2.b.f147853j);
        }
        if (i15 == 2) {
            return this.labelProvider.c(oo2.b.f147851h);
        }
        if (i15 == 3) {
            return this.labelProvider.c(oo2.b.f147852i);
        }
        throw new oq.p();
    }

    @Override // er.l
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public zo2.f.a b(Params params) {
        zo2.e state = params.getState();
        if (t.c(state, zo2.e.a.f235798a)) {
            return new zo2.f.a.AnimatedLogo(params.a(), params.b());
        }
        if (state instanceof zo2.e.Onboarding) {
            GreetingsHeaderData greetingsHeaderData = new GreetingsHeaderData(c(((zo2.e.Onboarding) params.getState()).getPartOfTheDay()), this.labelProvider.c(oo2.b.O));
            Label labelC = this.labelProvider.c(oo2.b.H);
            er.a<i0> aVarA = params.a();
            ButtonData buttonData = new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(oo2.b.F), null, 2, null), k30.d.a.f107773a, null, params.d(), 35, null);
            LeadingSection leadingSection = new LeadingSection(false, null, new i.Icon(jz.a.f106792i1, null, C0301c.f13996a, null, null, 26, null), 3, null);
            return new zo2.f.a.Onboarding(aVarA, greetingsHeaderData, buttonData, labelC, new DefaultSingleCardData(null, params.f(), false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(this.labelProvider.c(oo2.b.T), null, null, 0, 0, null, 62, null)), new SingleCardLabel(this.labelProvider.c(oo2.b.S), null, null, 0, 0, null, 62, null), 1, null), leadingSection, x0.Icon.INSTANCE.b(), null, 2301, null), new FooterData(this.labelProvider.e(oo2.b.f147850g, ((zo2.e.Onboarding) params.getState()).getAppVersion()), this.labelProvider.c(oo2.b.G), this.labelProvider.c(oo2.b.f147848e), this.labelProvider.c(oo2.b.f147847d), this.labelProvider.c(oo2.b.f147849f), this.labelProvider.c(oo2.b.f147846c), true));
        }
        if (!(state instanceof zo2.e.OnboardingWithMJuniorIntegration)) {
            if (!(state instanceof zo2.e.b)) {
                throw new oq.p();
            }
            return new zo2.f.a.JuniorInfoScreen(params.c(), new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.c()), this.labelProvider.c(oo2.b.L), null, null, null, 28, null), null, null, null, null, 61, null), new o40.a.Icon(jz.a.Q1, d.f13997a, e.f13998a, this.labelProvider.c(oo2.b.J), this.labelProvider.c(oo2.b.I), null, 32, null));
        }
        GreetingsHeaderData greetingsHeaderData2 = new GreetingsHeaderData(c(((zo2.e.OnboardingWithMJuniorIntegration) params.getState()).getPartOfTheDay()), this.labelProvider.c(oo2.b.P));
        Label labelC2 = this.labelProvider.c(oo2.b.H);
        er.a<i0> aVarA2 = params.a();
        BodySection bodySection = new BodySection(null, new n50.b.Title(new SingleCardLabel(this.labelProvider.c(oo2.b.N), null, null, 0, 0, null, 62, null)), new SingleCardLabel(this.labelProvider.c(oo2.b.M), null, null, 0, 0, null, 62, null), 1, null);
        LeadingSection leadingSection2 = new LeadingSection(false, null, new i.Resource(new i.Resource.a.DrawableResource(oo2.a.f147843b, null, 2, null), null, null, 6, null), 3, null);
        x0.Icon.Companion companion = x0.Icon.INSTANCE;
        return new zo2.f.a.OnboardingWithMJuniorIntegration(aVarA2, greetingsHeaderData2, labelC2, new DefaultSingleCardData(null, params.d(), false, null, null, false, null, null, bodySection, leadingSection2, companion.b(), null, 2301, null), new DefaultSingleCardData(null, params.e(), false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(this.labelProvider.c(oo2.b.L), null, null, 0, 0, null, 62, null)), new SingleCardLabel(this.labelProvider.c(oo2.b.K), null, null, 0, 0, null, 62, null), 1, null), new LeadingSection(false, null, new i.Resource(new i.Resource.a.DrawableResource(oo2.a.f147842a, null, 2, null), null, null, 6, null), 3, null), companion.b(), null, 2301, null), new FooterData(this.labelProvider.e(oo2.b.f147850g, ((zo2.e.OnboardingWithMJuniorIntegration) params.getState()).getAppVersion()), this.labelProvider.c(oo2.b.G), this.labelProvider.c(oo2.b.f147848e), this.labelProvider.c(oo2.b.f147847d), this.labelProvider.c(oo2.b.f147849f), this.labelProvider.c(oo2.b.f147846c), true));
    }
}
