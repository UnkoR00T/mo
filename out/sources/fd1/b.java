package fd1;

import jd1.OpenCompanyWizardData;
import ld1.StatementAttachment;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lfd1/b;", "", "a", "c", "b", "Lfd1/b$a;", "Lfd1/b$b;", "Lfd1/b$c;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface b {

    /* JADX INFO: renamed from: fd1.b$a, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lfd1/b$a;", "Lfd1/b;", "Ljd1/a;", "summaryData", "Lld1/n;", "attachment", "<init>", "(Ljd1/a;Lld1/n;)V", "a", "(Ljd1/a;Lld1/n;)Lfd1/b$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljd1/a;", "d", "()Ljd1/a;", "b", "Lld1/n;", "c", "()Lld1/n;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Initialized implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final OpenCompanyWizardData summaryData;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final StatementAttachment attachment;

        public Initialized(OpenCompanyWizardData openCompanyWizardData, StatementAttachment statementAttachment) {
            this.summaryData = openCompanyWizardData;
            this.attachment = statementAttachment;
        }

        public static /* synthetic */ Initialized b(Initialized initialized, OpenCompanyWizardData openCompanyWizardData, StatementAttachment statementAttachment, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                openCompanyWizardData = initialized.summaryData;
            }
            if ((i15 & 2) != 0) {
                statementAttachment = initialized.attachment;
            }
            return initialized.a(openCompanyWizardData, statementAttachment);
        }

        public final Initialized a(OpenCompanyWizardData summaryData, StatementAttachment attachment) {
            return new Initialized(summaryData, attachment);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final StatementAttachment getAttachment() {
            return this.attachment;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final OpenCompanyWizardData getSummaryData() {
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
            return fr.t.c(this.summaryData, initialized.summaryData) && fr.t.c(this.attachment, initialized.attachment);
        }

        public int hashCode() {
            int iHashCode = this.summaryData.hashCode() * 31;
            StatementAttachment statementAttachment = this.attachment;
            return iHashCode + (statementAttachment == null ? 0 : statementAttachment.hashCode());
        }

        public String toString() {
            return "Initialized(summaryData=" + this.summaryData + ", attachment=" + this.attachment + ')';
        }
    }

    /* JADX INFO: renamed from: fd1.b$b, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, d2 = {"Lfd1/b$b;", "Lfd1/b;", "Ljd1/a;", "summaryData", "Lld1/n;", "attachment", "<init>", "(Ljd1/a;Lld1/n;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljd1/a;", "b", "()Ljd1/a;", "Lld1/n;", "()Lld1/n;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Pkd implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final OpenCompanyWizardData summaryData;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final StatementAttachment attachment;

        public Pkd(OpenCompanyWizardData openCompanyWizardData, StatementAttachment statementAttachment) {
            this.summaryData = openCompanyWizardData;
            this.attachment = statementAttachment;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final StatementAttachment getAttachment() {
            return this.attachment;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final OpenCompanyWizardData getSummaryData() {
            return this.summaryData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Pkd)) {
                return false;
            }
            Pkd pkd = (Pkd) other;
            return fr.t.c(this.summaryData, pkd.summaryData) && fr.t.c(this.attachment, pkd.attachment);
        }

        public int hashCode() {
            int iHashCode = this.summaryData.hashCode() * 31;
            StatementAttachment statementAttachment = this.attachment;
            return iHashCode + (statementAttachment == null ? 0 : statementAttachment.hashCode());
        }

        public String toString() {
            return "Pkd(summaryData=" + this.summaryData + ", attachment=" + this.attachment + ')';
        }
    }

    /* JADX INFO: renamed from: fd1.b$c, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, d2 = {"Lfd1/b$c;", "Lfd1/b;", "Ljd1/a;", "summaryData", "Lld1/n;", "attachment", "<init>", "(Ljd1/a;Lld1/n;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljd1/a;", "b", "()Ljd1/a;", "Lld1/n;", "()Lld1/n;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class YourData implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final OpenCompanyWizardData summaryData;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final StatementAttachment attachment;

        public YourData(OpenCompanyWizardData openCompanyWizardData, StatementAttachment statementAttachment) {
            this.summaryData = openCompanyWizardData;
            this.attachment = statementAttachment;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final StatementAttachment getAttachment() {
            return this.attachment;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final OpenCompanyWizardData getSummaryData() {
            return this.summaryData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof YourData)) {
                return false;
            }
            YourData yourData = (YourData) other;
            return fr.t.c(this.summaryData, yourData.summaryData) && fr.t.c(this.attachment, yourData.attachment);
        }

        public int hashCode() {
            int iHashCode = this.summaryData.hashCode() * 31;
            StatementAttachment statementAttachment = this.attachment;
            return iHashCode + (statementAttachment == null ? 0 : statementAttachment.hashCode());
        }

        public String toString() {
            return "YourData(summaryData=" + this.summaryData + ", attachment=" + this.attachment + ')';
        }
    }
}
