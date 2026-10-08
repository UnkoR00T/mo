package m24;

import fr.t;
import java.time.LocalDate;
import p071kotlin.Metadata;
import pl.gov.coi.mobywatel.technical.containers.data.database.entities.DocumentEntityStatus;
import pl.gov.coi.mobywatel.technical.containers.data.database.entities.DocumentEntityType;

/* JADX INFO: renamed from: m24.e, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001a\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001f\u001a\u0004\b \u0010!R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\u001d\u0010$R\u001a\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b\"\u0010'R\u001a\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010\u001e\u001a\u0004\b(\u0010\u0013R\u001a\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b%\u0010\u0015¨\u0006,"}, d2 = {"Lm24/e;", "", "", "id", "", "documentId", "Lpl/gov/coi/mobywatel/technical/containers/data/database/entities/DocumentEntityType;", "type", "Ljava/time/LocalDate;", "expirationDate", "", "lastUpdateTimestamp", "Lpl/gov/coi/mobywatel/technical/containers/data/database/entities/DocumentEntityStatus;", "status", "parentDocumentId", "parentCertificateId", "<init>", "(ILjava/lang/String;Lpl/gov/coi/mobywatel/technical/containers/data/database/entities/DocumentEntityType;Ljava/time/LocalDate;JLpl/gov/coi/mobywatel/technical/containers/data/database/entities/DocumentEntityStatus;Ljava/lang/String;I)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "c", "b", "Ljava/lang/String;", "Lpl/gov/coi/mobywatel/technical/containers/data/database/entities/DocumentEntityType;", "h", "()Lpl/gov/coi/mobywatel/technical/containers/data/database/entities/DocumentEntityType;", "d", "Ljava/time/LocalDate;", "()Ljava/time/LocalDate;", "e", "J", "()J", "f", "Lpl/gov/coi/mobywatel/technical/containers/data/database/entities/DocumentEntityStatus;", "g", "()Lpl/gov/coi/mobywatel/technical/containers/data/database/entities/DocumentEntityStatus;", "containers_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DocumentEntity {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String documentId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final DocumentEntityType type;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocalDate expirationDate;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final long lastUpdateTimestamp;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final DocumentEntityStatus status;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String parentDocumentId;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final int parentCertificateId;

    public DocumentEntity(int i15, String str, DocumentEntityType documentEntityType, LocalDate localDate, long j15, DocumentEntityStatus documentEntityStatus, String str2, int i16) {
        this.id = i15;
        this.documentId = str;
        this.type = documentEntityType;
        this.expirationDate = localDate;
        this.lastUpdateTimestamp = j15;
        this.status = documentEntityStatus;
        this.parentDocumentId = str2;
        this.parentCertificateId = i16;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getDocumentId() {
        return this.documentId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final LocalDate getExpirationDate() {
        return this.expirationDate;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getLastUpdateTimestamp() {
        return this.lastUpdateTimestamp;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getParentCertificateId() {
        return this.parentCertificateId;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DocumentEntity)) {
            return false;
        }
        DocumentEntity documentEntity = (DocumentEntity) other;
        return this.id == documentEntity.id && t.c(this.documentId, documentEntity.documentId) && this.type == documentEntity.type && t.c(this.expirationDate, documentEntity.expirationDate) && this.lastUpdateTimestamp == documentEntity.lastUpdateTimestamp && this.status == documentEntity.status && t.c(this.parentDocumentId, documentEntity.parentDocumentId) && this.parentCertificateId == documentEntity.parentCertificateId;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getParentDocumentId() {
        return this.parentDocumentId;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final DocumentEntityStatus getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final DocumentEntityType getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = ((((Integer.hashCode(this.id) * 31) + this.documentId.hashCode()) * 31) + this.type.hashCode()) * 31;
        LocalDate localDate = this.expirationDate;
        int iHashCode2 = (((((iHashCode + (localDate == null ? 0 : localDate.hashCode())) * 31) + Long.hashCode(this.lastUpdateTimestamp)) * 31) + this.status.hashCode()) * 31;
        String str = this.parentDocumentId;
        return ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + Integer.hashCode(this.parentCertificateId);
    }

    public String toString() {
        return "DocumentEntity(id=" + this.id + ", documentId=" + this.documentId + ", type=" + this.type + ", expirationDate=" + this.expirationDate + ", lastUpdateTimestamp=" + this.lastUpdateTimestamp + ", status=" + this.status + ", parentDocumentId=" + this.parentDocumentId + ", parentCertificateId=" + this.parentCertificateId + ')';
    }

    public /* synthetic */ DocumentEntity(int i15, String str, DocumentEntityType documentEntityType, LocalDate localDate, long j15, DocumentEntityStatus documentEntityStatus, String str2, int i16, int i17, fr.k kVar) {
        this((i17 & 1) != 0 ? 0 : i15, str, documentEntityType, localDate, j15, documentEntityStatus, (i17 & 64) != 0 ? null : str2, i16);
    }
}
