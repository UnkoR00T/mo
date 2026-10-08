package lz3;

import fr.t;
import java.util.Iterator;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: lz3.e, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u0000 \u00162\u00020\u0001:\u0001\nB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ.\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Llz3/e;", "", "Lrq0/b;", "documentType", "", "documentIID", "Llz3/h;", "status", "<init>", "(Lrq0/b;Ljava/lang/String;Llz3/h;)V", "a", "(Lrq0/b;Ljava/lang/String;Llz3/h;)Llz3/e;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lrq0/b;", "d", "()Lrq0/b;", "b", "Ljava/lang/String;", "c", "Llz3/h;", "e", "()Llz3/h;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DocumentDownloadSingleStatus {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final rq0.b documentType;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String documentIID;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final h status;

    /* JADX INFO: renamed from: lz3.e$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u0006*\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Llz3/e$a;", "", "<init>", "()V", "", "Llz3/e;", "Llz3/h;", "a", "(Ljava/util/List;)Llz3/h;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        public final h a(List<DocumentDownloadSingleStatus> list) {
            Object next;
            DocumentDownloadSingleStatus documentDownloadSingleStatus;
            Iterator<T> it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                documentDownloadSingleStatus = (DocumentDownloadSingleStatus) next;
                if (documentDownloadSingleStatus.getStatus() == h.NOT_READY || documentDownloadSingleStatus.getStatus() == h.TAKES_TOO_LONG || documentDownloadSingleStatus.getStatus() == h.CREATING_ERROR) {
                    break;
                }
            } while (documentDownloadSingleStatus.getStatus() != h.ALREADY_DOWNLOADED);
            DocumentDownloadSingleStatus documentDownloadSingleStatus2 = (DocumentDownloadSingleStatus) next;
            if (documentDownloadSingleStatus2 != null) {
                return documentDownloadSingleStatus2.getStatus();
            }
            return null;
        }

        private Companion() {
        }
    }

    public DocumentDownloadSingleStatus(rq0.b bVar, String str, h hVar) {
        this.documentType = bVar;
        this.documentIID = str;
        this.status = hVar;
    }

    public static /* synthetic */ DocumentDownloadSingleStatus b(DocumentDownloadSingleStatus documentDownloadSingleStatus, rq0.b bVar, String str, h hVar, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            bVar = documentDownloadSingleStatus.documentType;
        }
        if ((i15 & 2) != 0) {
            str = documentDownloadSingleStatus.documentIID;
        }
        if ((i15 & 4) != 0) {
            hVar = documentDownloadSingleStatus.status;
        }
        return documentDownloadSingleStatus.a(bVar, str, hVar);
    }

    public final DocumentDownloadSingleStatus a(rq0.b documentType, String documentIID, h status) {
        return new DocumentDownloadSingleStatus(documentType, documentIID, status);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getDocumentIID() {
        return this.documentIID;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final rq0.b getDocumentType() {
        return this.documentType;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final h getStatus() {
        return this.status;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DocumentDownloadSingleStatus)) {
            return false;
        }
        DocumentDownloadSingleStatus documentDownloadSingleStatus = (DocumentDownloadSingleStatus) other;
        return t.c(this.documentType, documentDownloadSingleStatus.documentType) && t.c(this.documentIID, documentDownloadSingleStatus.documentIID) && this.status == documentDownloadSingleStatus.status;
    }

    public int hashCode() {
        return (((this.documentType.hashCode() * 31) + this.documentIID.hashCode()) * 31) + this.status.hashCode();
    }

    public String toString() {
        return "DocumentDownloadSingleStatus(documentType=" + this.documentType + ", documentIID=" + this.documentIID + ", status=" + this.status + ")";
    }
}
