package f24;

import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: f24.e, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001e\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u000e2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0015R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u001b\u0010#R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b!\u0010&R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u001d\u0010'\u001a\u0004\b$\u0010(R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b)\u0010+¨\u0006,"}, d2 = {"Lf24/e;", "", "", "documentId", "", "parentCertificateId", "Lf24/i;", "documentType", "Lf24/h;", "documentStatus", "Lfz/b$c;", "expirationDate", "", "lastUpdateTimestamp", "", "isChild", "<init>", "(Ljava/lang/String;ILf24/i;Lf24/h;Lfz/b$c;JZ)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "I", "f", "c", "Lf24/i;", "()Lf24/i;", "d", "Lf24/h;", "()Lf24/h;", "e", "Lfz/b$c;", "()Lfz/b$c;", "J", "()J", "g", "Z", "()Z", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Document {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String documentId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int parentCertificateId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final i documentType;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final h documentStatus;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final fz.b.LocalDate expirationDate;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final long lastUpdateTimestamp;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isChild;

    public Document(String str, int i15, i iVar, h hVar, fz.b.LocalDate localDate, long j15, boolean z15) {
        this.documentId = str;
        this.parentCertificateId = i15;
        this.documentType = iVar;
        this.documentStatus = hVar;
        this.expirationDate = localDate;
        this.lastUpdateTimestamp = j15;
        this.isChild = z15;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getDocumentId() {
        return this.documentId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final h getDocumentStatus() {
        return this.documentStatus;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final i getDocumentType() {
        return this.documentType;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final fz.b.LocalDate getExpirationDate() {
        return this.expirationDate;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final long getLastUpdateTimestamp() {
        return this.lastUpdateTimestamp;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Document)) {
            return false;
        }
        Document document = (Document) other;
        return t.c(this.documentId, document.documentId) && this.parentCertificateId == document.parentCertificateId && this.documentType == document.documentType && this.documentStatus == document.documentStatus && t.c(this.expirationDate, document.expirationDate) && this.lastUpdateTimestamp == document.lastUpdateTimestamp && this.isChild == document.isChild;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getParentCertificateId() {
        return this.parentCertificateId;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getIsChild() {
        return this.isChild;
    }

    public int hashCode() {
        int iHashCode = ((((((this.documentId.hashCode() * 31) + Integer.hashCode(this.parentCertificateId)) * 31) + this.documentType.hashCode()) * 31) + this.documentStatus.hashCode()) * 31;
        fz.b.LocalDate localDate = this.expirationDate;
        return ((((iHashCode + (localDate == null ? 0 : localDate.hashCode())) * 31) + Long.hashCode(this.lastUpdateTimestamp)) * 31) + Boolean.hashCode(this.isChild);
    }

    public String toString() {
        return "Document(documentId=" + this.documentId + ", parentCertificateId=" + this.parentCertificateId + ", documentType=" + this.documentType + ", documentStatus=" + this.documentStatus + ", expirationDate=" + this.expirationDate + ", lastUpdateTimestamp=" + this.lastUpdateTimestamp + ", isChild=" + this.isChild + ")";
    }
}
