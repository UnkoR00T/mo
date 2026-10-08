package k73;

import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: k73.a, reason: from toString */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001f\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u0013R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b\r\u0010*¨\u0006+"}, d2 = {"Lk73/a;", "", "", "documentId", "", "parentCertificateId", "Lk73/b;", "documentStatus", "Lfz/b$c;", "expirationDate", "", "lastUpdateTimestamp", "", "isChild", "<init>", "(Ljava/lang/String;ILk73/b;Lfz/b$c;JZ)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "I", "getParentCertificateId", "c", "Lk73/b;", "getDocumentStatus", "()Lk73/b;", "d", "Lfz/b$c;", "getExpirationDate", "()Lfz/b$c;", "e", "J", "getLastUpdateTimestamp", "()J", "f", "Z", "()Z", "studentcard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Document {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f108994g = fz.b.LocalDate.f68860b;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String documentId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int parentCertificateId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final b documentStatus;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final fz.b.LocalDate expirationDate;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final long lastUpdateTimestamp;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isChild;

    public Document(String str, int i15, b bVar, fz.b.LocalDate localDate, long j15, boolean z15) {
        this.documentId = str;
        this.parentCertificateId = i15;
        this.documentStatus = bVar;
        this.expirationDate = localDate;
        this.lastUpdateTimestamp = j15;
        this.isChild = z15;
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
        return t.c(this.documentId, document.documentId) && this.parentCertificateId == document.parentCertificateId && this.documentStatus == document.documentStatus && t.c(this.expirationDate, document.expirationDate) && this.lastUpdateTimestamp == document.lastUpdateTimestamp && this.isChild == document.isChild;
    }

    public int hashCode() {
        int iHashCode = ((((this.documentId.hashCode() * 31) + Integer.hashCode(this.parentCertificateId)) * 31) + this.documentStatus.hashCode()) * 31;
        fz.b.LocalDate localDate = this.expirationDate;
        return ((((iHashCode + (localDate == null ? 0 : localDate.hashCode())) * 31) + Long.hashCode(this.lastUpdateTimestamp)) * 31) + Boolean.hashCode(this.isChild);
    }

    public String toString() {
        return "Document(documentId=" + this.documentId + ", parentCertificateId=" + this.parentCertificateId + ", documentStatus=" + this.documentStatus + ", expirationDate=" + this.expirationDate + ", lastUpdateTimestamp=" + this.lastUpdateTimestamp + ", isChild=" + this.isChild + ')';
    }
}
