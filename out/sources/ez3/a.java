package ez3;

import fr.k;
import fr.t;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;
import wx.DomainFile;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lez3/a;", "", "<init>", "()V", "a", "c", "b", "Lez3/a$a;", "Lez3/a$b;", "Lez3/a$c;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class a {

    /* JADX INFO: renamed from: ez3.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lez3/a$a;", "Lez3/a;", "Lwx/a;", "domainFile", "<init>", "(Lwx/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lwx/a;", "()Lwx/a;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class File extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final DomainFile domainFile;

        public File(DomainFile domainFile) {
            super(null);
            this.domainFile = domainFile;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final DomainFile getDomainFile() {
            return this.domainFile;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof File) && t.c(this.domainFile, ((File) other).domainFile);
        }

        public int hashCode() {
            return this.domainFile.hashCode();
        }

        public String toString() {
            return "File(domainFile=" + this.domainFile + ")";
        }
    }

    /* JADX INFO: renamed from: ez3.a$b, reason: from toString */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0019\u001a\u0004\b \u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u0019\u001a\u0004\b\u001f\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001c\u0010\u001bR\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u001a\u0010!\u001a\u0004\b\u0018\u0010\"¨\u0006#"}, d2 = {"Lez3/a$b;", "Lez3/a;", "Lmx/a;", "screenTitle", "", "pdfUrl", "errorTitle", "errorDescription", "errorButtonLabel", "Lkotlin/Function0;", "Loq/i0;", "errorAction", "<init>", "(Lmx/a;Ljava/lang/String;Lmx/a;Lmx/a;Lmx/a;Ler/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmx/a;", "f", "()Lmx/a;", "b", "Ljava/lang/String;", "e", "c", "d", "Ler/a;", "()Ler/a;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PDF extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label screenTitle;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String pdfUrl;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label errorTitle;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label errorDescription;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label errorButtonLabel;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> errorAction;

        public PDF(Label label, String str, Label label2, Label label3, Label label4, er.a<i0> aVar) {
            super(null);
            this.screenTitle = label;
            this.pdfUrl = str;
            this.errorTitle = label2;
            this.errorDescription = label3;
            this.errorButtonLabel = label4;
            this.errorAction = aVar;
        }

        public final er.a<i0> a() {
            return this.errorAction;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Label getErrorButtonLabel() {
            return this.errorButtonLabel;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final Label getErrorDescription() {
            return this.errorDescription;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final Label getErrorTitle() {
            return this.errorTitle;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getPdfUrl() {
            return this.pdfUrl;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PDF)) {
                return false;
            }
            PDF pdf = (PDF) other;
            return t.c(this.screenTitle, pdf.screenTitle) && t.c(this.pdfUrl, pdf.pdfUrl) && t.c(this.errorTitle, pdf.errorTitle) && t.c(this.errorDescription, pdf.errorDescription) && t.c(this.errorButtonLabel, pdf.errorButtonLabel) && t.c(this.errorAction, pdf.errorAction);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final Label getScreenTitle() {
            return this.screenTitle;
        }

        public int hashCode() {
            Label label = this.screenTitle;
            return ((((((((((label == null ? 0 : label.hashCode()) * 31) + this.pdfUrl.hashCode()) * 31) + this.errorTitle.hashCode()) * 31) + this.errorDescription.hashCode()) * 31) + this.errorButtonLabel.hashCode()) * 31) + this.errorAction.hashCode();
        }

        public String toString() {
            return "PDF(screenTitle=" + this.screenTitle + ", pdfUrl=" + this.pdfUrl + ", errorTitle=" + this.errorTitle + ", errorDescription=" + this.errorDescription + ", errorButtonLabel=" + this.errorButtonLabel + ", errorAction=" + this.errorAction + ")";
        }
    }

    /* JADX INFO: renamed from: ez3.a$c, reason: from toString */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u0004¨\u0006\u0010"}, d2 = {"Lez3/a$c;", "Lez3/a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "text", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Text extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String text;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getText() {
            return this.text;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Text) && t.c(this.text, ((Text) other).text);
        }

        public int hashCode() {
            return this.text.hashCode();
        }

        public String toString() {
            return "Text(text=" + this.text + ")";
        }
    }

    public /* synthetic */ a(k kVar) {
        this();
    }

    private a() {
    }
}
