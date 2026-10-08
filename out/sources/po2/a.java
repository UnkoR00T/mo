package po2;

import fr.k;
import gx.b;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lpo2/a;", "Lgx/b;", "<init>", "()V", "a", "Lpo2/a$a;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class a implements b {

    /* JADX INFO: renamed from: po2.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0012\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015¨\u0006\u0017"}, d2 = {"Lpo2/a$a;", "Lpo2/a;", "", "resetPassword", "clearProcesses", "showAppNotActivatedDialog", "<init>", "(ZZZ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "b", "()Z", "c", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ToOnboarding extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean resetPassword;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean clearProcesses;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean showAppNotActivatedDialog;

        public ToOnboarding() {
            this(false, false, false, 7, null);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getClearProcesses() {
            return this.clearProcesses;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getResetPassword() {
            return this.resetPassword;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getShowAppNotActivatedDialog() {
            return this.showAppNotActivatedDialog;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ToOnboarding)) {
                return false;
            }
            ToOnboarding toOnboarding = (ToOnboarding) other;
            return this.resetPassword == toOnboarding.resetPassword && this.clearProcesses == toOnboarding.clearProcesses && this.showAppNotActivatedDialog == toOnboarding.showAppNotActivatedDialog;
        }

        public int hashCode() {
            return (((Boolean.hashCode(this.resetPassword) * 31) + Boolean.hashCode(this.clearProcesses)) * 31) + Boolean.hashCode(this.showAppNotActivatedDialog);
        }

        public String toString() {
            return "ToOnboarding(resetPassword=" + this.resetPassword + ", clearProcesses=" + this.clearProcesses + ", showAppNotActivatedDialog=" + this.showAppNotActivatedDialog + ")";
        }

        public ToOnboarding(boolean z15, boolean z16, boolean z17) {
            super(null);
            this.resetPassword = z15;
            this.clearProcesses = z16;
            this.showAppNotActivatedDialog = z17;
        }

        public /* synthetic */ ToOnboarding(boolean z15, boolean z16, boolean z17, int i15, k kVar) {
            this((i15 & 1) != 0 ? false : z15, (i15 & 2) != 0 ? false : z16, (i15 & 4) != 0 ? false : z17);
        }
    }

    public /* synthetic */ a(k kVar) {
        this();
    }

    private a() {
    }
}
