package zo2;

import e60.FooterData;
import h30.ButtonData;
import i50.BaseScaffoldData;
import l20.GreetingsHeaderData;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lzo2/f;", "Ll00/e;", "Lzo2/f$a;", "a", "onboarding_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface f extends l00.e<a> {

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0004\u0007\b\tR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0004\n\u000b\f\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Lzo2/f$a;", "", "Lkotlin/Function0;", "Loq/i0;", "a", "()Ler/a;", "onBack", "c", "d", "b", "Lzo2/f$a$a;", "Lzo2/f$a$b;", "Lzo2/f$a$c;", "Lzo2/f$a$d;", "onboarding_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {

        /* JADX INFO: renamed from: zo2.f$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0016\u0010\u0015¨\u0006\u0017"}, d2 = {"Lzo2/f$a$a;", "Lzo2/f$a;", "Lkotlin/Function0;", "Loq/i0;", "onBack", "displayOnboardingContent", "<init>", "(Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ler/a;", "()Ler/a;", "b", "onboarding_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class AnimatedLogo implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<i0> onBack;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<i0> displayOnboardingContent;

            public AnimatedLogo(er.a<i0> aVar, er.a<i0> aVar2) {
                this.onBack = aVar;
                this.displayOnboardingContent = aVar2;
            }

            @Override // zo2.f.a
            public er.a<i0> a() {
                return this.onBack;
            }

            public final er.a<i0> b() {
                return this.displayOnboardingContent;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof AnimatedLogo)) {
                    return false;
                }
                AnimatedLogo animatedLogo = (AnimatedLogo) other;
                return fr.t.c(this.onBack, animatedLogo.onBack) && fr.t.c(this.displayOnboardingContent, animatedLogo.displayOnboardingContent);
            }

            public int hashCode() {
                return (this.onBack.hashCode() * 31) + this.displayOnboardingContent.hashCode();
            }

            public String toString() {
                return "AnimatedLogo(onBack=" + this.onBack + ", displayOnboardingContent=" + this.displayOnboardingContent + ')';
            }
        }

        /* JADX INFO: renamed from: zo2.f$a$b, reason: from toString */
        @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\u0019\u0010\u001e¨\u0006\u001f"}, d2 = {"Lzo2/f$a$b;", "Lzo2/f$a;", "Lkotlin/Function0;", "Loq/i0;", "onBack", "Li50/a;", "scaffoldData", "Lo40/a;", "headerData", "<init>", "(Ler/a;Li50/a;Lo40/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ler/a;", "()Ler/a;", "b", "Li50/a;", "c", "()Li50/a;", "Lo40/a;", "()Lo40/a;", "onboarding_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class JuniorInfoScreen implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<i0> onBack;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData scaffoldData;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final o40.a headerData;

            public JuniorInfoScreen(er.a<i0> aVar, BaseScaffoldData baseScaffoldData, o40.a aVar2) {
                this.onBack = aVar;
                this.scaffoldData = baseScaffoldData;
                this.headerData = aVar2;
            }

            @Override // zo2.f.a
            public er.a<i0> a() {
                return this.onBack;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final o40.a getHeaderData() {
                return this.headerData;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final BaseScaffoldData getScaffoldData() {
                return this.scaffoldData;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof JuniorInfoScreen)) {
                    return false;
                }
                JuniorInfoScreen juniorInfoScreen = (JuniorInfoScreen) other;
                return fr.t.c(this.onBack, juniorInfoScreen.onBack) && fr.t.c(this.scaffoldData, juniorInfoScreen.scaffoldData) && fr.t.c(this.headerData, juniorInfoScreen.headerData);
            }

            public int hashCode() {
                return (((this.onBack.hashCode() * 31) + this.scaffoldData.hashCode()) * 31) + this.headerData.hashCode();
            }

            public String toString() {
                return "JuniorInfoScreen(onBack=" + this.onBack + ", scaffoldData=" + this.scaffoldData + ", headerData=" + this.headerData + ')';
            }
        }

        /* JADX INFO: renamed from: zo2.f$a$c, reason: from toString */
        @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b!\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b$\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b)\u0010+R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b\u001f\u0010.¨\u0006/"}, d2 = {"Lzo2/f$a$c;", "Lzo2/f$a;", "Lkotlin/Function0;", "Loq/i0;", "onBack", "Ll20/a;", "greetingsHeaderData", "Lh30/a;", "registrationButton", "Lmx/a;", "mainLogoContentDescription", "Ln50/k;", "verificationSingleCardData", "Le60/a;", "footerData", "<init>", "(Ler/a;Ll20/a;Lh30/a;Lmx/a;Ln50/k;Le60/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ler/a;", "()Ler/a;", "b", "Ll20/a;", "c", "()Ll20/a;", "Lh30/a;", "d", "()Lh30/a;", "Lmx/a;", "getMainLogoContentDescription", "()Lmx/a;", "e", "Ln50/k;", "()Ln50/k;", "f", "Le60/a;", "()Le60/a;", "onboarding_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Onboarding implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<i0> onBack;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final GreetingsHeaderData greetingsHeaderData;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final ButtonData registrationButton;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label mainLogoContentDescription;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final n50.k verificationSingleCardData;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            private final FooterData footerData;

            public Onboarding(er.a<i0> aVar, GreetingsHeaderData greetingsHeaderData, ButtonData buttonData, Label label, n50.k kVar, FooterData footerData) {
                this.onBack = aVar;
                this.greetingsHeaderData = greetingsHeaderData;
                this.registrationButton = buttonData;
                this.mainLogoContentDescription = label;
                this.verificationSingleCardData = kVar;
                this.footerData = footerData;
            }

            @Override // zo2.f.a
            public er.a<i0> a() {
                return this.onBack;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final FooterData getFooterData() {
                return this.footerData;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final GreetingsHeaderData getGreetingsHeaderData() {
                return this.greetingsHeaderData;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final ButtonData getRegistrationButton() {
                return this.registrationButton;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final n50.k getVerificationSingleCardData() {
                return this.verificationSingleCardData;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Onboarding)) {
                    return false;
                }
                Onboarding onboarding = (Onboarding) other;
                return fr.t.c(this.onBack, onboarding.onBack) && fr.t.c(this.greetingsHeaderData, onboarding.greetingsHeaderData) && fr.t.c(this.registrationButton, onboarding.registrationButton) && fr.t.c(this.mainLogoContentDescription, onboarding.mainLogoContentDescription) && fr.t.c(this.verificationSingleCardData, onboarding.verificationSingleCardData) && fr.t.c(this.footerData, onboarding.footerData);
            }

            public int hashCode() {
                return (((((((((this.onBack.hashCode() * 31) + this.greetingsHeaderData.hashCode()) * 31) + this.registrationButton.hashCode()) * 31) + this.mainLogoContentDescription.hashCode()) * 31) + this.verificationSingleCardData.hashCode()) * 31) + this.footerData.hashCode();
            }

            public String toString() {
                return "Onboarding(onBack=" + this.onBack + ", greetingsHeaderData=" + this.greetingsHeaderData + ", registrationButton=" + this.registrationButton + ", mainLogoContentDescription=" + this.mainLogoContentDescription + ", verificationSingleCardData=" + this.verificationSingleCardData + ", footerData=" + this.footerData + ')';
            }
        }

        /* JADX INFO: renamed from: zo2.f$a$d, reason: from toString */
        @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b \u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b'\u0010&\u001a\u0004\b%\u0010(R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b\u001e\u0010+¨\u0006,"}, d2 = {"Lzo2/f$a$d;", "Lzo2/f$a;", "Lkotlin/Function0;", "Loq/i0;", "onBack", "Ll20/a;", "greetingsHeaderData", "Lmx/a;", "mainLogoContentDescription", "Ln50/k;", "mObywatelActivationSingleCardData", "mJuniorActivationSingleCardData", "Le60/a;", "footerData", "<init>", "(Ler/a;Ll20/a;Lmx/a;Ln50/k;Ln50/k;Le60/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ler/a;", "()Ler/a;", "b", "Ll20/a;", "c", "()Ll20/a;", "Lmx/a;", "getMainLogoContentDescription", "()Lmx/a;", "d", "Ln50/k;", "e", "()Ln50/k;", "f", "Le60/a;", "()Le60/a;", "onboarding_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class OnboardingWithMJuniorIntegration implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<i0> onBack;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final GreetingsHeaderData greetingsHeaderData;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label mainLogoContentDescription;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final n50.k mObywatelActivationSingleCardData;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final n50.k mJuniorActivationSingleCardData;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            private final FooterData footerData;

            public OnboardingWithMJuniorIntegration(er.a<i0> aVar, GreetingsHeaderData greetingsHeaderData, Label label, n50.k kVar, n50.k kVar2, FooterData footerData) {
                this.onBack = aVar;
                this.greetingsHeaderData = greetingsHeaderData;
                this.mainLogoContentDescription = label;
                this.mObywatelActivationSingleCardData = kVar;
                this.mJuniorActivationSingleCardData = kVar2;
                this.footerData = footerData;
            }

            @Override // zo2.f.a
            public er.a<i0> a() {
                return this.onBack;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final FooterData getFooterData() {
                return this.footerData;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final GreetingsHeaderData getGreetingsHeaderData() {
                return this.greetingsHeaderData;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final n50.k getMJuniorActivationSingleCardData() {
                return this.mJuniorActivationSingleCardData;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final n50.k getMObywatelActivationSingleCardData() {
                return this.mObywatelActivationSingleCardData;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof OnboardingWithMJuniorIntegration)) {
                    return false;
                }
                OnboardingWithMJuniorIntegration onboardingWithMJuniorIntegration = (OnboardingWithMJuniorIntegration) other;
                return fr.t.c(this.onBack, onboardingWithMJuniorIntegration.onBack) && fr.t.c(this.greetingsHeaderData, onboardingWithMJuniorIntegration.greetingsHeaderData) && fr.t.c(this.mainLogoContentDescription, onboardingWithMJuniorIntegration.mainLogoContentDescription) && fr.t.c(this.mObywatelActivationSingleCardData, onboardingWithMJuniorIntegration.mObywatelActivationSingleCardData) && fr.t.c(this.mJuniorActivationSingleCardData, onboardingWithMJuniorIntegration.mJuniorActivationSingleCardData) && fr.t.c(this.footerData, onboardingWithMJuniorIntegration.footerData);
            }

            public int hashCode() {
                return (((((((((this.onBack.hashCode() * 31) + this.greetingsHeaderData.hashCode()) * 31) + this.mainLogoContentDescription.hashCode()) * 31) + this.mObywatelActivationSingleCardData.hashCode()) * 31) + this.mJuniorActivationSingleCardData.hashCode()) * 31) + this.footerData.hashCode();
            }

            public String toString() {
                return "OnboardingWithMJuniorIntegration(onBack=" + this.onBack + ", greetingsHeaderData=" + this.greetingsHeaderData + ", mainLogoContentDescription=" + this.mainLogoContentDescription + ", mObywatelActivationSingleCardData=" + this.mObywatelActivationSingleCardData + ", mJuniorActivationSingleCardData=" + this.mJuniorActivationSingleCardData + ", footerData=" + this.footerData + ')';
            }
        }

        er.a<i0> a();
    }
}
