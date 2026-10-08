package bn3;

import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: bn3.b, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0010R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u001a\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0012R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lbn3/b;", "", "", "parentId", "documentId", "", "parentCertificateId", "Lbn3/d;", "documentStatus", "Lfz/b$c;", "expirationDate", "", "lastUpdateTimestamp", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILbn3/d;Lfz/b$c;J)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "getDocumentId", "c", "I", "getParentCertificateId", "d", "Lbn3/d;", "getDocumentStatus", "()Lbn3/d;", "e", "Lfz/b$c;", "getExpirationDate", "()Lfz/b$c;", "f", "J", "getLastUpdateTimestamp", "()J", "vehicles_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Document {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f20371g = fz.b.LocalDate.f68860b;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String parentId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String documentId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final int parentCertificateId;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final d documentStatus;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final fz.b.LocalDate expirationDate;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final long lastUpdateTimestamp;

    public Document(String str, String str2, int i15, d dVar, fz.b.LocalDate localDate, long j15) {
        this.parentId = str;
        this.documentId = str2;
        this.parentCertificateId = i15;
        this.documentStatus = dVar;
        this.expirationDate = localDate;
        this.lastUpdateTimestamp = j15;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getParentId() {
        return this.parentId;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Document)) {
            return false;
        }
        Document document = (Document) other;
        return t.c(this.parentId, document.parentId) && t.c(this.documentId, document.documentId) && this.parentCertificateId == document.parentCertificateId && this.documentStatus == document.documentStatus && t.c(this.expirationDate, document.expirationDate) && this.lastUpdateTimestamp == document.lastUpdateTimestamp;
    }

    public int hashCode() {
        int iHashCode = ((((((this.parentId.hashCode() * 31) + this.documentId.hashCode()) * 31) + Integer.hashCode(this.parentCertificateId)) * 31) + this.documentStatus.hashCode()) * 31;
        fz.b.LocalDate localDate = this.expirationDate;
        return ((iHashCode + (localDate == null ? 0 : localDate.hashCode())) * 31) + Long.hashCode(this.lastUpdateTimestamp);
    }

    public String toString() {
        return "Document(parentId=" + this.parentId + ", documentId=" + this.documentId + ", parentCertificateId=" + this.parentCertificateId + ", documentStatus=" + this.documentStatus + ", expirationDate=" + this.expirationDate + ", lastUpdateTimestamp=" + this.lastUpdateTimestamp + ')';
    }
}
