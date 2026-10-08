package v33;

import java.util.List;
import k23.AttachmentFile;
import p071kotlin.Metadata;
import tt0.BEAttachmentsConfiguration;
import tt0.BESendReportResponse;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lv33/g;", "", "c", "b", "a", "Lv33/g$b;", "Lv33/g$c;", "sanitary_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface g {

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lv33/g$a;", "", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "sanitary_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f203523a = new a();

        private a() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof a);
        }

        public int hashCode() {
            return -485449672;
        }

        public String toString() {
            return "Field";
        }
    }

    /* JADX INFO: renamed from: v33.g$b, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lv33/g$b;", "Lv33/g;", "Ltt0/t;", "response", "<init>", "(Ltt0/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ltt0/t;", "b", "()Ltt0/t;", "sanitary_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Success implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final BESendReportResponse response;

        public Success(BESendReportResponse bESendReportResponse) {
            this.response = bESendReportResponse;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final BESendReportResponse getResponse() {
            return this.response;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Success) && fr.t.c(this.response, ((Success) other).response);
        }

        public int hashCode() {
            return this.response.hashCode();
        }

        public String toString() {
            return "Success(response=" + this.response + ')';
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0006\u0003\u0007\bR\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0004\t\n\u000b\f¨\u0006\rÀ\u0006\u0003"}, d2 = {"Lv33/g$c;", "Lv33/g;", "Lv33/h;", "a", "()Lv33/h;", "form", "b", "c", "d", "Lv33/g$c$a;", "Lv33/g$c$b;", "Lv33/g$c$c;", "Lv33/g$c$d;", "sanitary_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface c extends g {

        /* JADX INFO: renamed from: v33.g$c$a, reason: from toString */
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, d2 = {"Lv33/g$c$a;", "Lv33/g$c;", "Lv33/h;", "form", "Lcb4/i;", "dialogVMSAdapter", "<init>", "(Lv33/h;Lcb4/i;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lv33/h;", "()Lv33/h;", "b", "Lcb4/i;", "()Lcb4/i;", "sanitary_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Dialog implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final SummaryForm form;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final cb4.i dialogVMSAdapter;

            public Dialog(SummaryForm hVar, cb4.i iVar) {
                this.form = hVar;
                this.dialogVMSAdapter = iVar;
            }

            @Override // v33.g.c
            /* JADX INFO: renamed from: a, reason: from getter */
            public SummaryForm getForm() {
                return this.form;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final cb4.i getDialogVMSAdapter() {
                return this.dialogVMSAdapter;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Dialog)) {
                    return false;
                }
                Dialog dialog = (Dialog) other;
                return fr.t.c(this.form, dialog.form) && fr.t.c(this.dialogVMSAdapter, dialog.dialogVMSAdapter);
            }

            public int hashCode() {
                return (this.form.hashCode() * 31) + this.dialogVMSAdapter.hashCode();
            }

            public String toString() {
                return "Dialog(form=" + this.form + ", dialogVMSAdapter=" + this.dialogVMSAdapter + ')';
            }
        }

        /* JADX INFO: renamed from: v33.g$c$b, reason: from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0016"}, d2 = {"Lv33/g$c$b;", "Lv33/g$c;", "Lv33/h;", "form", "<init>", "(Lv33/h;)V", "b", "(Lv33/h;)Lv33/g$c$b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lv33/h;", "()Lv33/h;", "sanitary_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Screen implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final SummaryForm form;

            public Screen(SummaryForm hVar) {
                this.form = hVar;
            }

            @Override // v33.g.c
            /* JADX INFO: renamed from: a, reason: from getter */
            public SummaryForm getForm() {
                return this.form;
            }

            public final Screen b(SummaryForm form) {
                return new Screen(form);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Screen) && fr.t.c(this.form, ((Screen) other).form);
            }

            public int hashCode() {
                return this.form.hashCode();
            }

            public String toString() {
                return "Screen(form=" + this.form + ')';
            }
        }

        /* JADX INFO: renamed from: v33.g$c$c, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001e¨\u0006\u001f"}, d2 = {"Lv33/g$c$c;", "Lv33/g$c;", "Lv33/h;", "form", "", "Lk23/a;", "attachments", "Ltt0/b;", "attachmentsConfiguration", "<init>", "(Lv33/h;Ljava/util/List;Ltt0/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lv33/h;", "()Lv33/h;", "b", "Ljava/util/List;", "()Ljava/util/List;", "c", "Ltt0/b;", "()Ltt0/b;", "sanitary_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class SendingReport implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final SummaryForm form;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final List<AttachmentFile> attachments;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final BEAttachmentsConfiguration attachmentsConfiguration;

            public SendingReport(SummaryForm hVar, List<AttachmentFile> list, BEAttachmentsConfiguration bEAttachmentsConfiguration) {
                this.form = hVar;
                this.attachments = list;
                this.attachmentsConfiguration = bEAttachmentsConfiguration;
            }

            @Override // v33.g.c
            /* JADX INFO: renamed from: a, reason: from getter */
            public SummaryForm getForm() {
                return this.form;
            }

            public final List<AttachmentFile> b() {
                return this.attachments;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final BEAttachmentsConfiguration getAttachmentsConfiguration() {
                return this.attachmentsConfiguration;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SendingReport)) {
                    return false;
                }
                SendingReport sendingReport = (SendingReport) other;
                return fr.t.c(this.form, sendingReport.form) && fr.t.c(this.attachments, sendingReport.attachments) && fr.t.c(this.attachmentsConfiguration, sendingReport.attachmentsConfiguration);
            }

            public int hashCode() {
                int iHashCode = ((this.form.hashCode() * 31) + this.attachments.hashCode()) * 31;
                BEAttachmentsConfiguration bEAttachmentsConfiguration = this.attachmentsConfiguration;
                return iHashCode + (bEAttachmentsConfiguration == null ? 0 : bEAttachmentsConfiguration.hashCode());
            }

            public String toString() {
                return "SendingReport(form=" + this.form + ", attachments=" + this.attachments + ", attachmentsConfiguration=" + this.attachmentsConfiguration + ')';
            }
        }

        /* JADX INFO: renamed from: v33.g$c$d, reason: from toString */
        @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010#¨\u0006$"}, d2 = {"Lv33/g$c$d;", "Lv33/g$c;", "Lv33/h;", "form", "", "Lk23/a;", "attachments", "Ltt0/b;", "attachmentsConfiguration", "Lhb4/c;", "errorVMSAdapter", "<init>", "(Lv33/h;Ljava/util/List;Ltt0/b;Lhb4/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lv33/h;", "()Lv33/h;", "b", "Ljava/util/List;", "()Ljava/util/List;", "c", "Ltt0/b;", "()Ltt0/b;", "d", "Lhb4/c;", "()Lhb4/c;", "sanitary_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class SendingReportError implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final SummaryForm form;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final List<AttachmentFile> attachments;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final BEAttachmentsConfiguration attachmentsConfiguration;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final hb4.c errorVMSAdapter;

            public SendingReportError(SummaryForm hVar, List<AttachmentFile> list, BEAttachmentsConfiguration bEAttachmentsConfiguration, hb4.c cVar) {
                this.form = hVar;
                this.attachments = list;
                this.attachmentsConfiguration = bEAttachmentsConfiguration;
                this.errorVMSAdapter = cVar;
            }

            @Override // v33.g.c
            /* JADX INFO: renamed from: a, reason: from getter */
            public SummaryForm getForm() {
                return this.form;
            }

            public final List<AttachmentFile> b() {
                return this.attachments;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final BEAttachmentsConfiguration getAttachmentsConfiguration() {
                return this.attachmentsConfiguration;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final hb4.c getErrorVMSAdapter() {
                return this.errorVMSAdapter;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SendingReportError)) {
                    return false;
                }
                SendingReportError sendingReportError = (SendingReportError) other;
                return fr.t.c(this.form, sendingReportError.form) && fr.t.c(this.attachments, sendingReportError.attachments) && fr.t.c(this.attachmentsConfiguration, sendingReportError.attachmentsConfiguration) && fr.t.c(this.errorVMSAdapter, sendingReportError.errorVMSAdapter);
            }

            public int hashCode() {
                int iHashCode = ((this.form.hashCode() * 31) + this.attachments.hashCode()) * 31;
                BEAttachmentsConfiguration bEAttachmentsConfiguration = this.attachmentsConfiguration;
                return ((iHashCode + (bEAttachmentsConfiguration == null ? 0 : bEAttachmentsConfiguration.hashCode())) * 31) + this.errorVMSAdapter.hashCode();
            }

            public String toString() {
                return "SendingReportError(form=" + this.form + ", attachments=" + this.attachments + ", attachmentsConfiguration=" + this.attachmentsConfiguration + ", errorVMSAdapter=" + this.errorVMSAdapter + ')';
            }
        }

        /* JADX INFO: renamed from: a */
        SummaryForm getForm();
    }
}
