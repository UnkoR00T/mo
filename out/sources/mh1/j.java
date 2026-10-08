package mh1;

import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0004\u0007\bR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0003\t\n\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lmh1/j;", "", "", "Lk34/g;", "a", "()Ljava/util/List;", "documents", "c", "b", "Lmh1/j$a;", "Lmh1/j$b;", "Lmh1/j$c;", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface j {

    /* JADX INFO: renamed from: mh1.j$a, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u0007\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u0017"}, d2 = {"Lmh1/j$a;", "Lmh1/j;", "", "Lk34/g;", "documents", "<init>", "(Ljava/util/List;)V", "b", "(Ljava/util/List;)Lmh1/j$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Content implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<k34.g> documents;

        /* JADX WARN: Multi-variable type inference failed */
        public Content(List<? extends k34.g> list) {
            this.documents = list;
        }

        @Override // mh1.j
        public List<k34.g> a() {
            return this.documents;
        }

        public final Content b(List<? extends k34.g> documents) {
            return new Content(documents);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Content) && fr.t.c(this.documents, ((Content) other).documents);
        }

        public int hashCode() {
            return this.documents.hashCode();
        }

        public String toString() {
            return "Content(documents=" + this.documents + ')';
        }
    }

    /* JADX INFO: renamed from: mh1.j$b, reason: from toString */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u0018\u0010\u001d¨\u0006\u001e"}, d2 = {"Lmh1/j$b;", "Lmh1/j;", "", "Lk34/g;", "documents", "documentToDelete", "Lcb4/i;", "dialogVMS", "<init>", "(Ljava/util/List;Lk34/g;Lcb4/i;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "Lk34/g;", "c", "()Lk34/g;", "Lcb4/i;", "()Lcb4/i;", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DocumentDeletionDialog implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<k34.g> documents;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final k34.g documentToDelete;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final cb4.i dialogVMS;

        /* JADX WARN: Multi-variable type inference failed */
        public DocumentDeletionDialog(List<? extends k34.g> list, k34.g gVar, cb4.i iVar) {
            this.documents = list;
            this.documentToDelete = gVar;
            this.dialogVMS = iVar;
        }

        @Override // mh1.j
        public List<k34.g> a() {
            return this.documents;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final cb4.i getDialogVMS() {
            return this.dialogVMS;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final k34.g getDocumentToDelete() {
            return this.documentToDelete;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DocumentDeletionDialog)) {
                return false;
            }
            DocumentDeletionDialog documentDeletionDialog = (DocumentDeletionDialog) other;
            return fr.t.c(this.documents, documentDeletionDialog.documents) && fr.t.c(this.documentToDelete, documentDeletionDialog.documentToDelete) && fr.t.c(this.dialogVMS, documentDeletionDialog.dialogVMS);
        }

        public int hashCode() {
            return (((this.documents.hashCode() * 31) + this.documentToDelete.hashCode()) * 31) + this.dialogVMS.hashCode();
        }

        public String toString() {
            return "DocumentDeletionDialog(documents=" + this.documents + ", documentToDelete=" + this.documentToDelete + ", dialogVMS=" + this.dialogVMS + ')';
        }
    }

    /* JADX INFO: renamed from: mh1.j$c, reason: from toString */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001a"}, d2 = {"Lmh1/j$c;", "Lmh1/j;", "", "Lk34/g;", "documents", "Lhb4/c;", "errorVMS", "<init>", "(Ljava/util/List;Lhb4/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "Lhb4/c;", "()Lhb4/c;", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DocumentDeletionError implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<k34.g> documents;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final hb4.c errorVMS;

        /* JADX WARN: Multi-variable type inference failed */
        public DocumentDeletionError(List<? extends k34.g> list, hb4.c cVar) {
            this.documents = list;
            this.errorVMS = cVar;
        }

        @Override // mh1.j
        public List<k34.g> a() {
            return this.documents;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final hb4.c getErrorVMS() {
            return this.errorVMS;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DocumentDeletionError)) {
                return false;
            }
            DocumentDeletionError documentDeletionError = (DocumentDeletionError) other;
            return fr.t.c(this.documents, documentDeletionError.documents) && fr.t.c(this.errorVMS, documentDeletionError.errorVMS);
        }

        public int hashCode() {
            return (this.documents.hashCode() * 31) + this.errorVMS.hashCode();
        }

        public String toString() {
            return "DocumentDeletionError(documents=" + this.documents + ", errorVMS=" + this.errorVMS + ')';
        }
    }

    List<k34.g> a();
}
