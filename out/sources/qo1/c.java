package qo1;

import mx.Label;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lqo1/c;", "", "b", "a", "Lqo1/c$a;", "Lqo1/c$b;", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface c {

    /* JADX INFO: renamed from: qo1.c$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001Bg\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00042\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u001d\u001a\u0004\b%\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010\u001d\u001a\u0004\b'\u0010\u001fR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010\u001d\u001a\u0004\b)\u0010\u001fR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b*\u0010\u001d\u001a\u0004\b\u001c\u0010\u001fR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b+\u0010\u001d\u001a\u0004\b&\u0010\u001fR\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u0010\u001d\u001a\u0004\b$\u0010\u001fR\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010\u001d\u001a\u0004\b*\u0010\u001fR\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u001d\u001a\u0004\b \u0010\u001fR\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001d\u001a\u0004\b+\u0010\u001fR\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001d\u001a\u0004\b(\u0010\u001f¨\u0006,"}, d2 = {"Lqo1/c$a;", "Lqo1/c;", "Lmx/a;", "topBar", "", "isUserLogged", "passwordInputLabel", "passwordInputHint", "password", "activateBiometricButton", "biometricTypeButton", "biometricType", "checkBiometricRequirementsButton", "biometricRequirements", "loginBiometricButton", "changeTypeButton", "<init>", "(Lmx/a;ZLmx/a;Lmx/a;Lmx/a;Lmx/a;Lmx/a;Lmx/a;Lmx/a;Lmx/a;Lmx/a;Lmx/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lmx/a;", "k", "()Lmx/a;", "b", "Z", "l", "()Z", "c", "j", "d", "i", "e", "h", "f", "g", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DisplayedScreenData implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label topBar;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isUserLogged;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label passwordInputLabel;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label passwordInputHint;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label password;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label activateBiometricButton;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label biometricTypeButton;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label biometricType;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label checkBiometricRequirementsButton;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label biometricRequirements;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label loginBiometricButton;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label changeTypeButton;

        public DisplayedScreenData(Label label, boolean z15, Label label2, Label label3, Label label4, Label label5, Label label6, Label label7, Label label8, Label label9, Label label10, Label label11) {
            this.topBar = label;
            this.isUserLogged = z15;
            this.passwordInputLabel = label2;
            this.passwordInputHint = label3;
            this.password = label4;
            this.activateBiometricButton = label5;
            this.biometricTypeButton = label6;
            this.biometricType = label7;
            this.checkBiometricRequirementsButton = label8;
            this.biometricRequirements = label9;
            this.loginBiometricButton = label10;
            this.changeTypeButton = label11;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Label getActivateBiometricButton() {
            return this.activateBiometricButton;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Label getBiometricRequirements() {
            return this.biometricRequirements;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final Label getBiometricType() {
            return this.biometricType;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final Label getBiometricTypeButton() {
            return this.biometricTypeButton;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final Label getChangeTypeButton() {
            return this.changeTypeButton;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DisplayedScreenData)) {
                return false;
            }
            DisplayedScreenData displayedScreenData = (DisplayedScreenData) other;
            return fr.t.c(this.topBar, displayedScreenData.topBar) && this.isUserLogged == displayedScreenData.isUserLogged && fr.t.c(this.passwordInputLabel, displayedScreenData.passwordInputLabel) && fr.t.c(this.passwordInputHint, displayedScreenData.passwordInputHint) && fr.t.c(this.password, displayedScreenData.password) && fr.t.c(this.activateBiometricButton, displayedScreenData.activateBiometricButton) && fr.t.c(this.biometricTypeButton, displayedScreenData.biometricTypeButton) && fr.t.c(this.biometricType, displayedScreenData.biometricType) && fr.t.c(this.checkBiometricRequirementsButton, displayedScreenData.checkBiometricRequirementsButton) && fr.t.c(this.biometricRequirements, displayedScreenData.biometricRequirements) && fr.t.c(this.loginBiometricButton, displayedScreenData.loginBiometricButton) && fr.t.c(this.changeTypeButton, displayedScreenData.changeTypeButton);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final Label getCheckBiometricRequirementsButton() {
            return this.checkBiometricRequirementsButton;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final Label getLoginBiometricButton() {
            return this.loginBiometricButton;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final Label getPassword() {
            return this.password;
        }

        public int hashCode() {
            return (((((((((((((((((((((this.topBar.hashCode() * 31) + Boolean.hashCode(this.isUserLogged)) * 31) + this.passwordInputLabel.hashCode()) * 31) + this.passwordInputHint.hashCode()) * 31) + this.password.hashCode()) * 31) + this.activateBiometricButton.hashCode()) * 31) + this.biometricTypeButton.hashCode()) * 31) + this.biometricType.hashCode()) * 31) + this.checkBiometricRequirementsButton.hashCode()) * 31) + this.biometricRequirements.hashCode()) * 31) + this.loginBiometricButton.hashCode()) * 31) + this.changeTypeButton.hashCode();
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final Label getPasswordInputHint() {
            return this.passwordInputHint;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final Label getPasswordInputLabel() {
            return this.passwordInputLabel;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final Label getTopBar() {
            return this.topBar;
        }

        /* JADX INFO: renamed from: l, reason: from getter */
        public final boolean getIsUserLogged() {
            return this.isUserLogged;
        }

        public String toString() {
            return "DisplayedScreenData(topBar=" + this.topBar + ", isUserLogged=" + this.isUserLogged + ", passwordInputLabel=" + this.passwordInputLabel + ", passwordInputHint=" + this.passwordInputHint + ", password=" + this.password + ", activateBiometricButton=" + this.activateBiometricButton + ", biometricTypeButton=" + this.biometricTypeButton + ", biometricType=" + this.biometricType + ", checkBiometricRequirementsButton=" + this.checkBiometricRequirementsButton + ", biometricRequirements=" + this.biometricRequirements + ", loginBiometricButton=" + this.loginBiometricButton + ", changeTypeButton=" + this.changeTypeButton + ')';
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lqo1/c$b;", "Lqo1/c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f167585a = new b();

        private b() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof b);
        }

        public int hashCode() {
            return -1980174033;
        }

        public String toString() {
            return "Initial";
        }
    }
}
