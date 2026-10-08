package mv1;

import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: mv1.a, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lmv1/a;", "", "", "documentId", "Lrq0/b;", "documentType", "Lmv1/b;", "documentStatus", "Lfz/b$c;", "expirationDate", "", "lastUpdateTimestamp", "<init>", "(Ljava/lang/String;Lrq0/b;Lmv1/b;Lfz/b$c;J)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lrq0/b;", "getDocumentType", "()Lrq0/b;", "c", "Lmv1/b;", "getDocumentStatus", "()Lmv1/b;", "d", "Lfz/b$c;", "getExpirationDate", "()Lfz/b$c;", "e", "J", "getLastUpdateTimestamp", "()J", "dynamicdocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Document {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String documentId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final rq0.b documentType;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final b documentStatus;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final fz.b.LocalDate expirationDate;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final long lastUpdateTimestamp;

    public Document(String str, rq0.b bVar, b bVar2, fz.b.LocalDate localDate, long j15) {
        this.documentId = str;
        this.documentType = bVar;
        this.documentStatus = bVar2;
        this.expirationDate = localDate;
        this.lastUpdateTimestamp = j15;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getDocumentId() {
        return this.documentId;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Document)) {
            return false;
        }
        Document document = (Document) other;
        return t.c(this.documentId, document.documentId) && t.c(this.documentType, document.documentType) && this.documentStatus == document.documentStatus && t.c(this.expirationDate, document.expirationDate) && this.lastUpdateTimestamp == document.lastUpdateTimestamp;
    }

    public int hashCode() {
        int iHashCode = ((((this.documentId.hashCode() * 31) + this.documentType.hashCode()) * 31) + this.documentStatus.hashCode()) * 31;
        fz.b.LocalDate localDate = this.expirationDate;
        return ((iHashCode + (localDate == null ? 0 : localDate.hashCode())) * 31) + Long.hashCode(this.lastUpdateTimestamp);
    }

    public String toString() {
        return "Document(documentId=" + this.documentId + ", documentType=" + this.documentType + ", documentStatus=" + this.documentStatus + ", expirationDate=" + this.expirationDate + ", lastUpdateTimestamp=" + this.lastUpdateTimestamp + ')';
    }
}
