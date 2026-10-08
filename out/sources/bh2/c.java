package bh2;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0003\u0006\u0007\bR\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0004\t\n\u000b\f¨\u0006\rÀ\u0006\u0003"}, d2 = {"Lbh2/c;", "", "Ltq0/k$b;", "a", "()Ltq0/k$b;", "orderedDocument", "b", "d", "c", "Lbh2/c$a;", "Lbh2/c$b;", "Lbh2/c$c;", "Lbh2/c$d;", "landregistry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface c {

    /* JADX INFO: renamed from: bh2.c$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lbh2/c$a;", "Lbh2/c;", "Ltq0/k$b;", "orderedDocument", "<init>", "(Ltq0/k$b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ltq0/k$b;", "()Ltq0/k$b;", "landregistry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Content implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final tq0.k.b orderedDocument;

        public Content(tq0.k.b bVar) {
            this.orderedDocument = bVar;
        }

        @Override // bh2.c
        /* JADX INFO: renamed from: a, reason: from getter */
        public tq0.k.b getOrderedDocument() {
            return this.orderedDocument;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Content) && fr.t.c(this.orderedDocument, ((Content) other).orderedDocument);
        }

        public int hashCode() {
            return this.orderedDocument.hashCode();
        }

        public String toString() {
            return "Content(orderedDocument=" + this.orderedDocument + ')';
        }
    }

    /* JADX INFO: renamed from: bh2.c$b, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, d2 = {"Lbh2/c$b;", "Lbh2/c;", "Ltq0/b;", "documentToDownload", "Ltq0/k$b;", "orderedDocument", "<init>", "(Ltq0/b;Ltq0/k$b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ltq0/b;", "b", "()Ltq0/b;", "Ltq0/k$b;", "()Ltq0/k$b;", "landregistry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Downloading implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final tq0.b documentToDownload;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final tq0.k.b orderedDocument;

        public Downloading(tq0.b bVar, tq0.k.b bVar2) {
            this.documentToDownload = bVar;
            this.orderedDocument = bVar2;
        }

        @Override // bh2.c
        /* JADX INFO: renamed from: a, reason: from getter */
        public tq0.k.b getOrderedDocument() {
            return this.orderedDocument;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final tq0.b getDocumentToDownload() {
            return this.documentToDownload;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Downloading)) {
                return false;
            }
            Downloading downloading = (Downloading) other;
            return fr.t.c(this.documentToDownload, downloading.documentToDownload) && fr.t.c(this.orderedDocument, downloading.orderedDocument);
        }

        public int hashCode() {
            return (this.documentToDownload.hashCode() * 31) + this.orderedDocument.hashCode();
        }

        public String toString() {
            return "Downloading(documentToDownload=" + this.documentToDownload + ", orderedDocument=" + this.orderedDocument + ')';
        }
    }

    /* JADX INFO: renamed from: bh2.c$c, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, d2 = {"Lbh2/c$c;", "Lbh2/c;", "Ltq0/k$b;", "orderedDocument", "Lhb4/c;", "errorVMSAdapter", "<init>", "(Ltq0/k$b;Lhb4/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ltq0/k$b;", "()Ltq0/k$b;", "b", "Lhb4/c;", "()Lhb4/c;", "landregistry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Error implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final tq0.k.b orderedDocument;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final hb4.c errorVMSAdapter;

        public Error(tq0.k.b bVar, hb4.c cVar) {
            this.orderedDocument = bVar;
            this.errorVMSAdapter = cVar;
        }

        @Override // bh2.c
        /* JADX INFO: renamed from: a, reason: from getter */
        public tq0.k.b getOrderedDocument() {
            return this.orderedDocument;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final hb4.c getErrorVMSAdapter() {
            return this.errorVMSAdapter;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Error)) {
                return false;
            }
            Error error = (Error) other;
            return fr.t.c(this.orderedDocument, error.orderedDocument) && fr.t.c(this.errorVMSAdapter, error.errorVMSAdapter);
        }

        public int hashCode() {
            return (this.orderedDocument.hashCode() * 31) + this.errorVMSAdapter.hashCode();
        }

        public String toString() {
            return "Error(orderedDocument=" + this.orderedDocument + ", errorVMSAdapter=" + this.errorVMSAdapter + ')';
        }
    }

    /* JADX INFO: renamed from: bh2.c$d, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, d2 = {"Lbh2/c$d;", "Lbh2/c;", "Ltq0/k$b;", "orderedDocument", "Lcb4/i;", "dialogVMS", "<init>", "(Ltq0/k$b;Lcb4/i;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ltq0/k$b;", "()Ltq0/k$b;", "b", "Lcb4/i;", "()Lcb4/i;", "landregistry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PermissionDialog implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final tq0.k.b orderedDocument;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final cb4.i dialogVMS;

        public PermissionDialog(tq0.k.b bVar, cb4.i iVar) {
            this.orderedDocument = bVar;
            this.dialogVMS = iVar;
        }

        @Override // bh2.c
        /* JADX INFO: renamed from: a, reason: from getter */
        public tq0.k.b getOrderedDocument() {
            return this.orderedDocument;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final cb4.i getDialogVMS() {
            return this.dialogVMS;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PermissionDialog)) {
                return false;
            }
            PermissionDialog permissionDialog = (PermissionDialog) other;
            return fr.t.c(this.orderedDocument, permissionDialog.orderedDocument) && fr.t.c(this.dialogVMS, permissionDialog.dialogVMS);
        }

        public int hashCode() {
            return (this.orderedDocument.hashCode() * 31) + this.dialogVMS.hashCode();
        }

        public String toString() {
            return "PermissionDialog(orderedDocument=" + this.orderedDocument + ", dialogVMS=" + this.dialogVMS + ')';
        }
    }

    /* JADX INFO: renamed from: a */
    tq0.k.b getOrderedDocument();
}
