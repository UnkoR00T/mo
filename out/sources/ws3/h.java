package ws3;

import mr3.UserDocumentData;
import p071kotlin.Metadata;
import ss3.SummaryData;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lws3/h;", "", "a", "b", "Lws3/h$a;", "Lws3/h$b;", "zusvisit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface h {

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lws3/h$a;", "Lws3/h;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "zusvisit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f214931a = new a();

        private a() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof a);
        }

        public int hashCode() {
            return -1808177136;
        }

        public String toString() {
            return "Initial";
        }
    }

    /* JADX INFO: renamed from: ws3.h$b, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJL\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b%\u0010#R\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010!\u001a\u0004\b$\u0010#R\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010!\u001a\u0004\b \u0010#¨\u0006&"}, d2 = {"Lws3/h$b;", "Lws3/h;", "Lss3/b;", "summaryData", "Lmr3/a;", "userData", "", "isStatementAccepted", "isAcceptStatementError", "showValidation", "shouldScrollToStatementSection", "<init>", "(Lss3/b;Lmr3/a;ZZZZ)V", "a", "(Lss3/b;Lmr3/a;ZZZZ)Lws3/h$b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lss3/b;", "e", "()Lss3/b;", "b", "Lmr3/a;", "f", "()Lmr3/a;", "c", "Z", "h", "()Z", "d", "g", "zusvisit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Initialized implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final SummaryData summaryData;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final UserDocumentData userData;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isStatementAccepted;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isAcceptStatementError;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean showValidation;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean shouldScrollToStatementSection;

        public Initialized(SummaryData summaryData, UserDocumentData userDocumentData, boolean z15, boolean z16, boolean z17, boolean z18) {
            this.summaryData = summaryData;
            this.userData = userDocumentData;
            this.isStatementAccepted = z15;
            this.isAcceptStatementError = z16;
            this.showValidation = z17;
            this.shouldScrollToStatementSection = z18;
        }

        public static /* synthetic */ Initialized b(Initialized initialized, SummaryData summaryData, UserDocumentData userDocumentData, boolean z15, boolean z16, boolean z17, boolean z18, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                summaryData = initialized.summaryData;
            }
            if ((i15 & 2) != 0) {
                userDocumentData = initialized.userData;
            }
            if ((i15 & 4) != 0) {
                z15 = initialized.isStatementAccepted;
            }
            if ((i15 & 8) != 0) {
                z16 = initialized.isAcceptStatementError;
            }
            if ((i15 & 16) != 0) {
                z17 = initialized.showValidation;
            }
            if ((i15 & 32) != 0) {
                z18 = initialized.shouldScrollToStatementSection;
            }
            boolean z19 = z17;
            boolean z25 = z18;
            return initialized.a(summaryData, userDocumentData, z15, z16, z19, z25);
        }

        public final Initialized a(SummaryData summaryData, UserDocumentData userData, boolean isStatementAccepted, boolean isAcceptStatementError, boolean showValidation, boolean shouldScrollToStatementSection) {
            return new Initialized(summaryData, userData, isStatementAccepted, isAcceptStatementError, showValidation, shouldScrollToStatementSection);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getShouldScrollToStatementSection() {
            return this.shouldScrollToStatementSection;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final boolean getShowValidation() {
            return this.showValidation;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final SummaryData getSummaryData() {
            return this.summaryData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Initialized)) {
                return false;
            }
            Initialized initialized = (Initialized) other;
            return fr.t.c(this.summaryData, initialized.summaryData) && fr.t.c(this.userData, initialized.userData) && this.isStatementAccepted == initialized.isStatementAccepted && this.isAcceptStatementError == initialized.isAcceptStatementError && this.showValidation == initialized.showValidation && this.shouldScrollToStatementSection == initialized.shouldScrollToStatementSection;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final UserDocumentData getUserData() {
            return this.userData;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final boolean getIsAcceptStatementError() {
            return this.isAcceptStatementError;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final boolean getIsStatementAccepted() {
            return this.isStatementAccepted;
        }

        public int hashCode() {
            return (((((((((this.summaryData.hashCode() * 31) + this.userData.hashCode()) * 31) + Boolean.hashCode(this.isStatementAccepted)) * 31) + Boolean.hashCode(this.isAcceptStatementError)) * 31) + Boolean.hashCode(this.showValidation)) * 31) + Boolean.hashCode(this.shouldScrollToStatementSection);
        }

        public String toString() {
            return "Initialized(summaryData=" + this.summaryData + ", userData=" + this.userData + ", isStatementAccepted=" + this.isStatementAccepted + ", isAcceptStatementError=" + this.isAcceptStatementError + ", showValidation=" + this.showValidation + ", shouldScrollToStatementSection=" + this.shouldScrollToStatementSection + ')';
        }

        public /* synthetic */ Initialized(SummaryData summaryData, UserDocumentData userDocumentData, boolean z15, boolean z16, boolean z17, boolean z18, int i15, fr.k kVar) {
            this((i15 & 1) != 0 ? new SummaryData(null, null, null, 0, null, null, false, null, null, null, 1023, null) : summaryData, userDocumentData, (i15 & 4) != 0 ? false : z15, (i15 & 8) != 0 ? false : z16, (i15 & 16) != 0 ? false : z17, (i15 & 32) != 0 ? false : z18);
        }
    }
}
