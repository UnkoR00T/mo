package mc0;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lmc0/j;", "", "a", "b", "Lmc0/j$a;", "Lmc0/j$b;", "login_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface j {

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lmc0/j$a;", "Lmc0/j;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "login_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f125399a = new a();

        private a() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof a);
        }

        public int hashCode() {
            return 795535726;
        }

        public String toString() {
            return "Initial";
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0006\u0003\u0007R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0003\b\t\n¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lmc0/j$b;", "Lmc0/j;", "", "a", "()Ljava/lang/String;", "appVersion", "c", "b", "Lmc0/j$b$a;", "Lmc0/j$b$b;", "Lmc0/j$b$c;", "login_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface b extends j {

        /* JADX INFO: renamed from: mc0.j$b$a, reason: from toString */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Lmc0/j$b$a;", "Lmc0/j$b;", "", "appVersion", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "login_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Biometric implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String appVersion;

            public Biometric(String str) {
                this.appVersion = str;
            }

            @Override // mc0.j.b
            /* JADX INFO: renamed from: a, reason: from getter */
            public String getAppVersion() {
                return this.appVersion;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Biometric) && fr.t.c(this.appVersion, ((Biometric) other).appVersion);
            }

            public int hashCode() {
                return this.appVersion.hashCode();
            }

            public String toString() {
                return "Biometric(appVersion=" + this.appVersion + ')';
            }
        }

        /* JADX INFO: renamed from: mc0.j$b$b, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Lmc0/j$b$b;", "Lmc0/j$b;", "", "appVersion", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "login_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class BiometricAuthenticationInProgress implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String appVersion;

            public BiometricAuthenticationInProgress(String str) {
                this.appVersion = str;
            }

            @Override // mc0.j.b
            /* JADX INFO: renamed from: a, reason: from getter */
            public String getAppVersion() {
                return this.appVersion;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof BiometricAuthenticationInProgress) && fr.t.c(this.appVersion, ((BiometricAuthenticationInProgress) other).appVersion);
            }

            public int hashCode() {
                return this.appVersion.hashCode();
            }

            public String toString() {
                return "BiometricAuthenticationInProgress(appVersion=" + this.appVersion + ')';
            }
        }

        /* JADX INFO: renamed from: a */
        String getAppVersion();

        /* JADX INFO: renamed from: mc0.j$b$c, reason: from toString */
        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJD\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u001c\u0010&\u001a\u0004\b\"\u0010'¨\u0006("}, d2 = {"Lmc0/j$b$c;", "Lmc0/j$b;", "", "appVersion", "Liy/b0;", "pinValue", "Lhz/b;", "validationState", "", "isBiometricEnabled", "Lcb4/i;", "dialogVMSAdapter", "<init>", "(Ljava/lang/String;Liy/b0;Lhz/b;ZLcb4/i;)V", "b", "(Ljava/lang/String;Liy/b0;Lhz/b;ZLcb4/i;)Lmc0/j$b$c;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "Liy/b0;", "e", "()Liy/b0;", "c", "Lhz/b;", "f", "()Lhz/b;", "d", "Z", "g", "()Z", "Lcb4/i;", "()Lcb4/i;", "login_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Password implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String appVersion;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final iy.b0 pinValue;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final hz.b validationState;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean isBiometricEnabled;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final cb4.i dialogVMSAdapter;

            public Password(String str, iy.b0 b0Var, hz.b bVar, boolean z15, cb4.i iVar) {
                this.appVersion = str;
                this.pinValue = b0Var;
                this.validationState = bVar;
                this.isBiometricEnabled = z15;
                this.dialogVMSAdapter = iVar;
            }

            public static /* synthetic */ Password c(Password password, String str, iy.b0 b0Var, hz.b bVar, boolean z15, cb4.i iVar, int i15, Object obj) {
                if ((i15 & 1) != 0) {
                    str = password.appVersion;
                }
                if ((i15 & 2) != 0) {
                    b0Var = password.pinValue;
                }
                if ((i15 & 4) != 0) {
                    bVar = password.validationState;
                }
                if ((i15 & 8) != 0) {
                    z15 = password.isBiometricEnabled;
                }
                if ((i15 & 16) != 0) {
                    iVar = password.dialogVMSAdapter;
                }
                cb4.i iVar2 = iVar;
                hz.b bVar2 = bVar;
                return password.b(str, b0Var, bVar2, z15, iVar2);
            }

            @Override // mc0.j.b
            /* JADX INFO: renamed from: a, reason: from getter */
            public String getAppVersion() {
                return this.appVersion;
            }

            public final Password b(String appVersion, iy.b0 pinValue, hz.b validationState, boolean isBiometricEnabled, cb4.i dialogVMSAdapter) {
                return new Password(appVersion, pinValue, validationState, isBiometricEnabled, dialogVMSAdapter);
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final cb4.i getDialogVMSAdapter() {
                return this.dialogVMSAdapter;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final iy.b0 getPinValue() {
                return this.pinValue;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Password)) {
                    return false;
                }
                Password password = (Password) other;
                return fr.t.c(this.appVersion, password.appVersion) && fr.t.c(this.pinValue, password.pinValue) && fr.t.c(this.validationState, password.validationState) && this.isBiometricEnabled == password.isBiometricEnabled && fr.t.c(this.dialogVMSAdapter, password.dialogVMSAdapter);
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final hz.b getValidationState() {
                return this.validationState;
            }

            /* JADX INFO: renamed from: g, reason: from getter */
            public final boolean getIsBiometricEnabled() {
                return this.isBiometricEnabled;
            }

            public int hashCode() {
                int iHashCode = ((((((this.appVersion.hashCode() * 31) + this.pinValue.hashCode()) * 31) + this.validationState.hashCode()) * 31) + Boolean.hashCode(this.isBiometricEnabled)) * 31;
                cb4.i iVar = this.dialogVMSAdapter;
                return iHashCode + (iVar == null ? 0 : iVar.hashCode());
            }

            public String toString() {
                return "Password(appVersion=" + this.appVersion + ", pinValue=" + this.pinValue + ", validationState=" + this.validationState + ", isBiometricEnabled=" + this.isBiometricEnabled + ", dialogVMSAdapter=" + this.dialogVMSAdapter + ')';
            }

            public /* synthetic */ Password(String str, iy.b0 b0Var, hz.b bVar, boolean z15, cb4.i iVar, int i15, fr.k kVar) {
                this(str, (i15 & 2) != 0 ? iy.b0.INSTANCE.a() : b0Var, (i15 & 4) != 0 ? hz.b.C2039b.f86846c : bVar, z15, (i15 & 16) != 0 ? null : iVar);
            }
        }
    }
}
