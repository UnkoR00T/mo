package r21;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lr21/f;", "", "b", "a", "Lr21/f$a;", "Lr21/f$b;", "chatbot_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface f {

    /* JADX INFO: renamed from: r21.f$a, reason: from toString */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J.\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u0019\u0010\u0016¨\u0006\u001a"}, d2 = {"Lr21/f$a;", "Lr21/f;", "", "isAgreementAccepted", "showValidationError", "scrollToAgreement", "<init>", "(ZZZ)V", "a", "(ZZZ)Lr21/f$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "e", "()Z", "b", "d", "c", "chatbot_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Initialized implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isAgreementAccepted;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean showValidationError;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean scrollToAgreement;

        public Initialized() {
            this(false, false, false, 7, null);
        }

        public static /* synthetic */ Initialized b(Initialized initialized, boolean z15, boolean z16, boolean z17, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                z15 = initialized.isAgreementAccepted;
            }
            if ((i15 & 2) != 0) {
                z16 = initialized.showValidationError;
            }
            if ((i15 & 4) != 0) {
                z17 = initialized.scrollToAgreement;
            }
            return initialized.a(z15, z16, z17);
        }

        public final Initialized a(boolean isAgreementAccepted, boolean showValidationError, boolean scrollToAgreement) {
            return new Initialized(isAgreementAccepted, showValidationError, scrollToAgreement);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getScrollToAgreement() {
            return this.scrollToAgreement;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final boolean getShowValidationError() {
            return this.showValidationError;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final boolean getIsAgreementAccepted() {
            return this.isAgreementAccepted;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Initialized)) {
                return false;
            }
            Initialized initialized = (Initialized) other;
            return this.isAgreementAccepted == initialized.isAgreementAccepted && this.showValidationError == initialized.showValidationError && this.scrollToAgreement == initialized.scrollToAgreement;
        }

        public int hashCode() {
            return (((Boolean.hashCode(this.isAgreementAccepted) * 31) + Boolean.hashCode(this.showValidationError)) * 31) + Boolean.hashCode(this.scrollToAgreement);
        }

        public String toString() {
            return "Initialized(isAgreementAccepted=" + this.isAgreementAccepted + ", showValidationError=" + this.showValidationError + ", scrollToAgreement=" + this.scrollToAgreement + ')';
        }

        public Initialized(boolean z15, boolean z16, boolean z17) {
            this.isAgreementAccepted = z15;
            this.showValidationError = z16;
            this.scrollToAgreement = z17;
        }

        public /* synthetic */ Initialized(boolean z15, boolean z16, boolean z17, int i15, fr.k kVar) {
            this((i15 & 1) != 0 ? false : z15, (i15 & 2) != 0 ? false : z16, (i15 & 4) != 0 ? false : z17);
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lr21/f$b;", "Lr21/f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "chatbot_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f170872a = new b();

        private b() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof b);
        }

        public int hashCode() {
            return 707980169;
        }

        public String toString() {
            return "Loading";
        }
    }
}
