package gz3;

import java.io.ByteArrayOutputStream;
import mx.Label;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0004\u0005\u0006\u0007\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lgz3/i;", "", "a", "c", "b", "Lgz3/i$a$a;", "Lgz3/i$a$b;", "Lgz3/i$b;", "Lgz3/i$c;", "webpreview_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface i {

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\n\u0007R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0001\u0002\u000b\f¨\u0006\rÀ\u0006\u0003"}, d2 = {"Lgz3/i$a;", "", "", "getFileName", "()Ljava/lang/String;", "fileName", "Ljava/io/ByteArrayOutputStream;", "a", "()Ljava/io/ByteArrayOutputStream;", "byteArrayOutputStream", "b", "Lgz3/i$a$a;", "Lgz3/i$a$b;", "webpreview_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {

        /* JADX INFO: renamed from: gz3.i$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0015\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0018\u0010\u001d¨\u0006\u001e"}, d2 = {"Lgz3/i$a$a;", "Lgz3/i$a;", "Lgz3/i;", "", "fileName", "Ljava/io/ByteArrayOutputStream;", "byteArrayOutputStream", "Lcb4/i;", "dialogVmsAdapter", "<init>", "(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;Lcb4/i;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getFileName", "b", "Ljava/io/ByteArrayOutputStream;", "()Ljava/io/ByteArrayOutputStream;", "c", "Lcb4/i;", "()Lcb4/i;", "webpreview_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Dialog implements a, i {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String fileName;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final ByteArrayOutputStream byteArrayOutputStream;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final cb4.i dialogVmsAdapter;

            public Dialog(String str, ByteArrayOutputStream byteArrayOutputStream, cb4.i iVar) {
                this.fileName = str;
                this.byteArrayOutputStream = byteArrayOutputStream;
                this.dialogVmsAdapter = iVar;
            }

            @Override // gz3.i.a
            /* JADX INFO: renamed from: a, reason: from getter */
            public ByteArrayOutputStream getByteArrayOutputStream() {
                return this.byteArrayOutputStream;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final cb4.i getDialogVmsAdapter() {
                return this.dialogVmsAdapter;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Dialog)) {
                    return false;
                }
                Dialog dialog = (Dialog) other;
                return fr.t.c(this.fileName, dialog.fileName) && fr.t.c(this.byteArrayOutputStream, dialog.byteArrayOutputStream) && fr.t.c(this.dialogVmsAdapter, dialog.dialogVmsAdapter);
            }

            @Override // gz3.i.a
            public String getFileName() {
                return this.fileName;
            }

            public int hashCode() {
                return (((this.fileName.hashCode() * 31) + this.byteArrayOutputStream.hashCode()) * 31) + this.dialogVmsAdapter.hashCode();
            }

            public String toString() {
                return "Dialog(fileName=" + this.fileName + ", byteArrayOutputStream=" + this.byteArrayOutputStream + ", dialogVmsAdapter=" + this.dialogVmsAdapter + ')';
            }
        }

        /* JADX INFO: renamed from: gz3.i$a$b, reason: from toString */
        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, d2 = {"Lgz3/i$a$b;", "Lgz3/i$a;", "Lgz3/i;", "", "fileName", "Ljava/io/ByteArrayOutputStream;", "byteArrayOutputStream", "<init>", "(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getFileName", "b", "Ljava/io/ByteArrayOutputStream;", "()Ljava/io/ByteArrayOutputStream;", "webpreview_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Initialized implements a, i {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String fileName;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final ByteArrayOutputStream byteArrayOutputStream;

            public Initialized(String str, ByteArrayOutputStream byteArrayOutputStream) {
                this.fileName = str;
                this.byteArrayOutputStream = byteArrayOutputStream;
            }

            @Override // gz3.i.a
            /* JADX INFO: renamed from: a, reason: from getter */
            public ByteArrayOutputStream getByteArrayOutputStream() {
                return this.byteArrayOutputStream;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Initialized)) {
                    return false;
                }
                Initialized initialized = (Initialized) other;
                return fr.t.c(this.fileName, initialized.fileName) && fr.t.c(this.byteArrayOutputStream, initialized.byteArrayOutputStream);
            }

            @Override // gz3.i.a
            public String getFileName() {
                return this.fileName;
            }

            public int hashCode() {
                return (this.fileName.hashCode() * 31) + this.byteArrayOutputStream.hashCode();
            }

            public String toString() {
                return "Initialized(fileName=" + this.fileName + ", byteArrayOutputStream=" + this.byteArrayOutputStream + ')';
            }
        }

        /* JADX INFO: renamed from: a */
        ByteArrayOutputStream getByteArrayOutputStream();

        String getFileName();
    }

    /* JADX INFO: renamed from: gz3.i$c, reason: from toString */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Lgz3/i$c;", "Lgz3/i;", "", "text", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "webpreview_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Text implements i {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String text;

        public Text(String str) {
            this.text = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getText() {
            return this.text;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Text) && fr.t.c(this.text, ((Text) other).text);
        }

        public int hashCode() {
            return this.text.hashCode();
        }

        public String toString() {
            return "Text(text=" + this.text + ')';
        }
    }

    /* JADX INFO: renamed from: gz3.i$b, reason: from toString */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ^\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\t2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\t2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u0013R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001b\u001a\u0004\b\"\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u001b\u001a\u0004\b$\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u001b\u001a\u0004\b#\u0010\u001dR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\"\u0010%\u001a\u0004\b&\u0010'R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b&\u0010(\u001a\u0004\b!\u0010)¨\u0006*"}, d2 = {"Lgz3/i$b;", "Lgz3/i;", "Lmx/a;", "screenTitle", "", "url", "errorTitle", "errorDescription", "errorButtonLabel", "", "failedLoading", "Lkotlin/Function0;", "Loq/i0;", "errorAction", "<init>", "(Lmx/a;Ljava/lang/String;Lmx/a;Lmx/a;Lmx/a;ZLer/a;)V", "a", "(Lmx/a;Ljava/lang/String;Lmx/a;Lmx/a;Lmx/a;ZLer/a;)Lgz3/i$b;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lmx/a;", "getScreenTitle", "()Lmx/a;", "b", "Ljava/lang/String;", "h", "c", "f", "d", "e", "Z", "g", "()Z", "Ler/a;", "()Ler/a;", "webpreview_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PDF implements i {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label screenTitle;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String url;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label errorTitle;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label errorDescription;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label errorButtonLabel;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean failedLoading;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<oq.i0> errorAction;

        public PDF(Label label, String str, Label label2, Label label3, Label label4, boolean z15, er.a<oq.i0> aVar) {
            this.screenTitle = label;
            this.url = str;
            this.errorTitle = label2;
            this.errorDescription = label3;
            this.errorButtonLabel = label4;
            this.failedLoading = z15;
            this.errorAction = aVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PDF b(PDF pdf, Label label, String str, Label label2, Label label3, Label label4, boolean z15, er.a aVar, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                label = pdf.screenTitle;
            }
            if ((i15 & 2) != 0) {
                str = pdf.url;
            }
            if ((i15 & 4) != 0) {
                label2 = pdf.errorTitle;
            }
            if ((i15 & 8) != 0) {
                label3 = pdf.errorDescription;
            }
            if ((i15 & 16) != 0) {
                label4 = pdf.errorButtonLabel;
            }
            if ((i15 & 32) != 0) {
                z15 = pdf.failedLoading;
            }
            if ((i15 & 64) != 0) {
                aVar = pdf.errorAction;
            }
            boolean z16 = z15;
            er.a aVar2 = aVar;
            Label label5 = label4;
            Label label6 = label2;
            return pdf.a(label, str, label6, label3, label5, z16, aVar2);
        }

        public final PDF a(Label screenTitle, String url, Label errorTitle, Label errorDescription, Label errorButtonLabel, boolean failedLoading, er.a<oq.i0> errorAction) {
            return new PDF(screenTitle, url, errorTitle, errorDescription, errorButtonLabel, failedLoading, errorAction);
        }

        public final er.a<oq.i0> c() {
            return this.errorAction;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final Label getErrorButtonLabel() {
            return this.errorButtonLabel;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final Label getErrorDescription() {
            return this.errorDescription;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PDF)) {
                return false;
            }
            PDF pdf = (PDF) other;
            return fr.t.c(this.screenTitle, pdf.screenTitle) && fr.t.c(this.url, pdf.url) && fr.t.c(this.errorTitle, pdf.errorTitle) && fr.t.c(this.errorDescription, pdf.errorDescription) && fr.t.c(this.errorButtonLabel, pdf.errorButtonLabel) && this.failedLoading == pdf.failedLoading && fr.t.c(this.errorAction, pdf.errorAction);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final Label getErrorTitle() {
            return this.errorTitle;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final boolean getFailedLoading() {
            return this.failedLoading;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            Label label = this.screenTitle;
            return ((((((((((((label == null ? 0 : label.hashCode()) * 31) + this.url.hashCode()) * 31) + this.errorTitle.hashCode()) * 31) + this.errorDescription.hashCode()) * 31) + this.errorButtonLabel.hashCode()) * 31) + Boolean.hashCode(this.failedLoading)) * 31) + this.errorAction.hashCode();
        }

        public String toString() {
            return "PDF(screenTitle=" + this.screenTitle + ", url=" + this.url + ", errorTitle=" + this.errorTitle + ", errorDescription=" + this.errorDescription + ", errorButtonLabel=" + this.errorButtonLabel + ", failedLoading=" + this.failedLoading + ", errorAction=" + this.errorAction + ')';
        }

        public /* synthetic */ PDF(Label label, String str, Label label2, Label label3, Label label4, boolean z15, er.a aVar, int i15, fr.k kVar) {
            this(label, str, label2, label3, label4, (i15 & 32) != 0 ? false : z15, aVar);
        }
    }
}
