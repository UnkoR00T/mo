package mx0;

import h30.ButtonData;
import i50.BaseScaffoldData;
import mx.Label;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lmx0/e;", "Ll00/e;", "Lmx0/e$a;", "a", "adddocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface e extends l00.e<a> {

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lmx0/e$a;", "", "b", "c", "a", "Lmx0/e$a$a;", "Lmx0/e$a$b;", "Lmx0/e$a$c;", "adddocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {

        /* JADX INFO: renamed from: mx0.e$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010!\u001a\u0004\b\u001a\u0010\"¨\u0006#"}, d2 = {"Lmx0/e$a$a;", "Lmx0/e$a;", "Li50/a;", "baseScaffoldData", "Lo40/a;", "headerData", "Lmx/a;", "supportEmail", "Lh30/a;", "closeButton", "<init>", "(Li50/a;Lo40/a;Lmx/a;Lh30/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "()Li50/a;", "b", "Lo40/a;", "c", "()Lo40/a;", "Lmx/a;", "d", "()Lmx/a;", "Lh30/a;", "()Lh30/a;", "adddocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Failure implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData baseScaffoldData;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final o40.a headerData;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label supportEmail;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final ButtonData closeButton;

            public Failure(BaseScaffoldData baseScaffoldData, o40.a aVar, Label label, ButtonData buttonData) {
                this.baseScaffoldData = baseScaffoldData;
                this.headerData = aVar;
                this.supportEmail = label;
                this.closeButton = buttonData;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final BaseScaffoldData getBaseScaffoldData() {
                return this.baseScaffoldData;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final ButtonData getCloseButton() {
                return this.closeButton;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final o40.a getHeaderData() {
                return this.headerData;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final Label getSupportEmail() {
                return this.supportEmail;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Failure)) {
                    return false;
                }
                Failure failure = (Failure) other;
                return fr.t.c(this.baseScaffoldData, failure.baseScaffoldData) && fr.t.c(this.headerData, failure.headerData) && fr.t.c(this.supportEmail, failure.supportEmail) && fr.t.c(this.closeButton, failure.closeButton);
            }

            public int hashCode() {
                return (((((this.baseScaffoldData.hashCode() * 31) + this.headerData.hashCode()) * 31) + this.supportEmail.hashCode()) * 31) + this.closeButton.hashCode();
            }

            public String toString() {
                return "Failure(baseScaffoldData=" + this.baseScaffoldData + ", headerData=" + this.headerData + ", supportEmail=" + this.supportEmail + ", closeButton=" + this.closeButton + ')';
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lmx0/e$a$b;", "Lmx0/e$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "adddocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class b implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f129010a = new b();

            private b() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof b);
            }

            public int hashCode() {
                return 320627451;
            }

            public String toString() {
                return "Initial";
            }
        }

        /* JADX INFO: renamed from: mx0.e$a$c, reason: from toString */
        @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010%\u001a\u0004\b\u001d\u0010&R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b#\u0010%\u001a\u0004\b!\u0010&R\u0017\u0010\u000b\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b'\u0010%\u001a\u0004\b'\u0010&R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b(\u0010*¨\u0006+"}, d2 = {"Lmx0/e$a$c;", "Lmx0/e$a;", "Li50/a;", "baseScaffoldData", "Lo40/a;", "headerData", "Lh30/a;", "interruptButtonData", "Lmx/a;", "documentDownloading", "documentDownloadingTakeTooLong", "interruptProcessPossibility", "", "showTakesTooLong", "<init>", "(Li50/a;Lo40/a;Lh30/a;Lmx/a;Lmx/a;Lmx/a;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "()Li50/a;", "b", "Lo40/a;", "d", "()Lo40/a;", "c", "Lh30/a;", "e", "()Lh30/a;", "Lmx/a;", "()Lmx/a;", "f", "g", "Z", "()Z", "adddocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Initialized implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData baseScaffoldData;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final o40.a headerData;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final ButtonData interruptButtonData;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label documentDownloading;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label documentDownloadingTakeTooLong;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label interruptProcessPossibility;

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean showTakesTooLong;

            public Initialized(BaseScaffoldData baseScaffoldData, o40.a aVar, ButtonData buttonData, Label label, Label label2, Label label3, boolean z15) {
                this.baseScaffoldData = baseScaffoldData;
                this.headerData = aVar;
                this.interruptButtonData = buttonData;
                this.documentDownloading = label;
                this.documentDownloadingTakeTooLong = label2;
                this.interruptProcessPossibility = label3;
                this.showTakesTooLong = z15;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final BaseScaffoldData getBaseScaffoldData() {
                return this.baseScaffoldData;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final Label getDocumentDownloading() {
                return this.documentDownloading;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final Label getDocumentDownloadingTakeTooLong() {
                return this.documentDownloadingTakeTooLong;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final o40.a getHeaderData() {
                return this.headerData;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final ButtonData getInterruptButtonData() {
                return this.interruptButtonData;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Initialized)) {
                    return false;
                }
                Initialized initialized = (Initialized) other;
                return fr.t.c(this.baseScaffoldData, initialized.baseScaffoldData) && fr.t.c(this.headerData, initialized.headerData) && fr.t.c(this.interruptButtonData, initialized.interruptButtonData) && fr.t.c(this.documentDownloading, initialized.documentDownloading) && fr.t.c(this.documentDownloadingTakeTooLong, initialized.documentDownloadingTakeTooLong) && fr.t.c(this.interruptProcessPossibility, initialized.interruptProcessPossibility) && this.showTakesTooLong == initialized.showTakesTooLong;
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final Label getInterruptProcessPossibility() {
                return this.interruptProcessPossibility;
            }

            /* JADX INFO: renamed from: g, reason: from getter */
            public final boolean getShowTakesTooLong() {
                return this.showTakesTooLong;
            }

            public int hashCode() {
                return (((((((((((this.baseScaffoldData.hashCode() * 31) + this.headerData.hashCode()) * 31) + this.interruptButtonData.hashCode()) * 31) + this.documentDownloading.hashCode()) * 31) + this.documentDownloadingTakeTooLong.hashCode()) * 31) + this.interruptProcessPossibility.hashCode()) * 31) + Boolean.hashCode(this.showTakesTooLong);
            }

            public String toString() {
                return "Initialized(baseScaffoldData=" + this.baseScaffoldData + ", headerData=" + this.headerData + ", interruptButtonData=" + this.interruptButtonData + ", documentDownloading=" + this.documentDownloading + ", documentDownloadingTakeTooLong=" + this.documentDownloadingTakeTooLong + ", interruptProcessPossibility=" + this.interruptProcessPossibility + ", showTakesTooLong=" + this.showTakesTooLong + ')';
            }
        }
    }
}
