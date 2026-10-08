package mc0;

import e60.FooterData;
import h30.ButtonData;
import i50.BaseScaffoldData;
import j30.ButtonTextData;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0004R\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lmc0/k;", "Ll00/e;", "Lmc0/k$a;", "Loz/j;", "a", "()Loz/j;", "lifecycleConnector", "login_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface k extends l00.e<a> {

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lmc0/k$a;", "", "b", "c", "a", "Lmc0/k$a$a;", "Lmc0/k$a$b;", "Lmc0/k$a$c;", "login_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {

        /* JADX INFO: renamed from: mc0.k$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b'\u0010$\u001a\u0004\b(\u0010&R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b#\u0010+R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b(\u0010$\u001a\u0004\b\u001f\u0010&R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b%\u0010,\u001a\u0004\b-\u0010.R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b/\u0010,\u001a\u0004\b/\u0010.R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b-\u00100\u001a\u0004\b'\u00101R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b!\u00102\u001a\u0004\b)\u00103¨\u00064"}, d2 = {"Lmc0/k$a$a;", "Lmc0/k$a;", "Li50/a;", "scaffoldData", "Lmx/a;", "greetingsTitle", "greetingsDescription", "Ld40/b;", "biometricIconData", "biometricDescription", "Lkotlin/Function0;", "Loq/i0;", "onBiometricSectionClick", "onBackAction", "Lh30/a;", "enterPinButtonData", "Le60/a;", "footerData", "<init>", "(Li50/a;Lmx/a;Lmx/a;Ld40/b;Lmx/a;Ler/a;Ler/a;Lh30/a;Le60/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "i", "()Li50/a;", "b", "Lmx/a;", "f", "()Lmx/a;", "c", "e", "d", "Ld40/b;", "()Ld40/b;", "Ler/a;", "h", "()Ler/a;", "g", "Lh30/a;", "()Lh30/a;", "Le60/a;", "()Le60/a;", "login_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Biometric implements a {

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public static final int f125407j = (FooterData.f47642h | d40.b.f39676g) | BaseScaffoldData.f89350g;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData scaffoldData;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label greetingsTitle;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label greetingsDescription;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final d40.b biometricIconData;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label biometricDescription;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<i0> onBiometricSectionClick;

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<i0> onBackAction;

            /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
            private final ButtonData enterPinButtonData;

            /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
            private final FooterData footerData;

            public Biometric(BaseScaffoldData baseScaffoldData, Label label, Label label2, d40.b bVar, Label label3, er.a<i0> aVar, er.a<i0> aVar2, ButtonData buttonData, FooterData footerData) {
                this.scaffoldData = baseScaffoldData;
                this.greetingsTitle = label;
                this.greetingsDescription = label2;
                this.biometricIconData = bVar;
                this.biometricDescription = label3;
                this.onBiometricSectionClick = aVar;
                this.onBackAction = aVar2;
                this.enterPinButtonData = buttonData;
                this.footerData = footerData;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final Label getBiometricDescription() {
                return this.biometricDescription;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final d40.b getBiometricIconData() {
                return this.biometricIconData;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final ButtonData getEnterPinButtonData() {
                return this.enterPinButtonData;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final FooterData getFooterData() {
                return this.footerData;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final Label getGreetingsDescription() {
                return this.greetingsDescription;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Biometric)) {
                    return false;
                }
                Biometric biometric = (Biometric) other;
                return fr.t.c(this.scaffoldData, biometric.scaffoldData) && fr.t.c(this.greetingsTitle, biometric.greetingsTitle) && fr.t.c(this.greetingsDescription, biometric.greetingsDescription) && fr.t.c(this.biometricIconData, biometric.biometricIconData) && fr.t.c(this.biometricDescription, biometric.biometricDescription) && fr.t.c(this.onBiometricSectionClick, biometric.onBiometricSectionClick) && fr.t.c(this.onBackAction, biometric.onBackAction) && fr.t.c(this.enterPinButtonData, biometric.enterPinButtonData) && fr.t.c(this.footerData, biometric.footerData);
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final Label getGreetingsTitle() {
                return this.greetingsTitle;
            }

            public final er.a<i0> g() {
                return this.onBackAction;
            }

            public final er.a<i0> h() {
                return this.onBiometricSectionClick;
            }

            public int hashCode() {
                return (((((((((((((((this.scaffoldData.hashCode() * 31) + this.greetingsTitle.hashCode()) * 31) + this.greetingsDescription.hashCode()) * 31) + this.biometricIconData.hashCode()) * 31) + this.biometricDescription.hashCode()) * 31) + this.onBiometricSectionClick.hashCode()) * 31) + this.onBackAction.hashCode()) * 31) + this.enterPinButtonData.hashCode()) * 31) + this.footerData.hashCode();
            }

            /* JADX INFO: renamed from: i, reason: from getter */
            public final BaseScaffoldData getScaffoldData() {
                return this.scaffoldData;
            }

            public String toString() {
                return "Biometric(scaffoldData=" + this.scaffoldData + ", greetingsTitle=" + this.greetingsTitle + ", greetingsDescription=" + this.greetingsDescription + ", biometricIconData=" + this.biometricIconData + ", biometricDescription=" + this.biometricDescription + ", onBiometricSectionClick=" + this.onBiometricSectionClick + ", onBackAction=" + this.onBackAction + ", enterPinButtonData=" + this.enterPinButtonData + ", footerData=" + this.footerData + ')';
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lmc0/k$a$b;", "Lmc0/k$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "login_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class b implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f125417a = new b();

            private b() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof b);
            }

            public int hashCode() {
                return -1172238237;
            }

            public String toString() {
                return "Initial";
            }
        }

        /* JADX INFO: renamed from: mc0.k$a$c, reason: from toString */
        @Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b \b\u0087\b\u0018\u00002\u00020\u0001Bc\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u000b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b*\u0010'\u001a\u0004\b+\u0010)R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b+\u00100\u001a\u0004\b,\u00101R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b(\u00102\u001a\u0004\b3\u00104R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b5\u00107R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b.\u00108\u001a\u0004\b*\u00109R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b$\u0010:\u001a\u0004\b\"\u0010;R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b3\u0010<\u001a\u0004\b&\u0010=¨\u0006>"}, d2 = {"Lmc0/k$a$c;", "Lmc0/k$a;", "Li50/a;", "scaffoldData", "Lmx/a;", "greetingsTitle", "greetingsDescription", "Lv50/c;", "pinTextInputData", "Lj30/a;", "forgotPasswordTextData", "", "shouldFocusWithKeyboard", "Lkotlin/Function0;", "Loq/i0;", "onBackAction", "Le60/a;", "footerData", "Lh30/a;", "biometricButtonData", "Lcb4/i;", "dialogVMSAdapter", "<init>", "(Li50/a;Lmx/a;Lmx/a;Lv50/c;Lj30/a;ZLer/a;Le60/a;Lh30/a;Lcb4/i;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "i", "()Li50/a;", "b", "Lmx/a;", "f", "()Lmx/a;", "c", "e", "d", "Lv50/c;", "h", "()Lv50/c;", "Lj30/a;", "()Lj30/a;", "Z", "j", "()Z", "g", "Ler/a;", "()Ler/a;", "Le60/a;", "()Le60/a;", "Lh30/a;", "()Lh30/a;", "Lcb4/i;", "()Lcb4/i;", "login_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Password implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData scaffoldData;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label greetingsTitle;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label greetingsDescription;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final v50.c pinTextInputData;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final ButtonTextData forgotPasswordTextData;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean shouldFocusWithKeyboard;

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<i0> onBackAction;

            /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
            private final FooterData footerData;

            /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
            private final ButtonData biometricButtonData;

            /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
            private final cb4.i dialogVMSAdapter;

            public Password(BaseScaffoldData baseScaffoldData, Label label, Label label2, v50.c cVar, ButtonTextData buttonTextData, boolean z15, er.a<i0> aVar, FooterData footerData, ButtonData buttonData, cb4.i iVar) {
                this.scaffoldData = baseScaffoldData;
                this.greetingsTitle = label;
                this.greetingsDescription = label2;
                this.pinTextInputData = cVar;
                this.forgotPasswordTextData = buttonTextData;
                this.shouldFocusWithKeyboard = z15;
                this.onBackAction = aVar;
                this.footerData = footerData;
                this.biometricButtonData = buttonData;
                this.dialogVMSAdapter = iVar;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final ButtonData getBiometricButtonData() {
                return this.biometricButtonData;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final cb4.i getDialogVMSAdapter() {
                return this.dialogVMSAdapter;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final FooterData getFooterData() {
                return this.footerData;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final ButtonTextData getForgotPasswordTextData() {
                return this.forgotPasswordTextData;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final Label getGreetingsDescription() {
                return this.greetingsDescription;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Password)) {
                    return false;
                }
                Password password = (Password) other;
                return fr.t.c(this.scaffoldData, password.scaffoldData) && fr.t.c(this.greetingsTitle, password.greetingsTitle) && fr.t.c(this.greetingsDescription, password.greetingsDescription) && fr.t.c(this.pinTextInputData, password.pinTextInputData) && fr.t.c(this.forgotPasswordTextData, password.forgotPasswordTextData) && this.shouldFocusWithKeyboard == password.shouldFocusWithKeyboard && fr.t.c(this.onBackAction, password.onBackAction) && fr.t.c(this.footerData, password.footerData) && fr.t.c(this.biometricButtonData, password.biometricButtonData) && fr.t.c(this.dialogVMSAdapter, password.dialogVMSAdapter);
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final Label getGreetingsTitle() {
                return this.greetingsTitle;
            }

            public final er.a<i0> g() {
                return this.onBackAction;
            }

            /* JADX INFO: renamed from: h, reason: from getter */
            public final v50.c getPinTextInputData() {
                return this.pinTextInputData;
            }

            public int hashCode() {
                int iHashCode = ((((((((((((((this.scaffoldData.hashCode() * 31) + this.greetingsTitle.hashCode()) * 31) + this.greetingsDescription.hashCode()) * 31) + this.pinTextInputData.hashCode()) * 31) + this.forgotPasswordTextData.hashCode()) * 31) + Boolean.hashCode(this.shouldFocusWithKeyboard)) * 31) + this.onBackAction.hashCode()) * 31) + this.footerData.hashCode()) * 31;
                ButtonData buttonData = this.biometricButtonData;
                int iHashCode2 = (iHashCode + (buttonData == null ? 0 : buttonData.hashCode())) * 31;
                cb4.i iVar = this.dialogVMSAdapter;
                return iHashCode2 + (iVar != null ? iVar.hashCode() : 0);
            }

            /* JADX INFO: renamed from: i, reason: from getter */
            public final BaseScaffoldData getScaffoldData() {
                return this.scaffoldData;
            }

            /* JADX INFO: renamed from: j, reason: from getter */
            public final boolean getShouldFocusWithKeyboard() {
                return this.shouldFocusWithKeyboard;
            }

            public String toString() {
                return "Password(scaffoldData=" + this.scaffoldData + ", greetingsTitle=" + this.greetingsTitle + ", greetingsDescription=" + this.greetingsDescription + ", pinTextInputData=" + this.pinTextInputData + ", forgotPasswordTextData=" + this.forgotPasswordTextData + ", shouldFocusWithKeyboard=" + this.shouldFocusWithKeyboard + ", onBackAction=" + this.onBackAction + ", footerData=" + this.footerData + ", biometricButtonData=" + this.biometricButtonData + ", dialogVMSAdapter=" + this.dialogVMSAdapter + ')';
            }
        }
    }

    oz.j a();
}
