package hg0;

import fr.k;
import fr.t;
import java.time.LocalDate;
import oq.p;
import p071kotlin.Metadata;
import pl.gov.coi.mjunior.technical.containers.data.database.entities.DocumentEntityStatus;
import pl.gov.coi.mjunior.technical.containers.data.database.entities.DocumentEntityType;

/* JADX INFO: renamed from: hg0.c, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010!\u001a\u0004\b\"\u0010#R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b\u001d\u0010&R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010'\u001a\u0004\b\u0018\u0010(R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b$\u0010\u0011R\u0011\u0010*\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b)\u0010#¨\u0006+"}, d2 = {"Lhg0/c;", "", "", "id", "", "documentId", "Lpl/gov/coi/mjunior/technical/containers/data/database/entities/DocumentEntityType;", "type", "Lpl/gov/coi/mjunior/technical/containers/data/database/entities/DocumentEntityStatus;", "status", "Ljava/time/LocalDate;", "expirationDate", "certificateId", "parentId", "<init>", "(ILjava/lang/String;Lpl/gov/coi/mjunior/technical/containers/data/database/entities/DocumentEntityType;Lpl/gov/coi/mjunior/technical/containers/data/database/entities/DocumentEntityStatus;Ljava/time/LocalDate;Ljava/lang/Integer;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "d", "b", "Ljava/lang/String;", "c", "Lpl/gov/coi/mjunior/technical/containers/data/database/entities/DocumentEntityType;", "g", "()Lpl/gov/coi/mjunior/technical/containers/data/database/entities/DocumentEntityType;", "Lpl/gov/coi/mjunior/technical/containers/data/database/entities/DocumentEntityStatus;", "f", "()Lpl/gov/coi/mjunior/technical/containers/data/database/entities/DocumentEntityStatus;", "e", "Ljava/time/LocalDate;", "()Ljava/time/LocalDate;", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "h", "validatedStatus", "containers_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DocumentEntity {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String documentId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final DocumentEntityType type;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final DocumentEntityStatus status;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocalDate expirationDate;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer certificateId;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String parentId;

    /* JADX INFO: renamed from: hg0.c$a */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f84331a;

        static {
            int[] iArr = new int[DocumentEntityStatus.values().length];
            try {
                iArr[DocumentEntityStatus.ACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DocumentEntityStatus.INACTIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DocumentEntityStatus.TO_UPDATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f84331a = iArr;
        }
    }

    public DocumentEntity(int i15, String str, DocumentEntityType documentEntityType, DocumentEntityStatus documentEntityStatus, LocalDate localDate, Integer num, String str2) {
        this.id = i15;
        this.documentId = str;
        this.type = documentEntityType;
        this.status = documentEntityStatus;
        this.expirationDate = localDate;
        this.certificateId = num;
        this.parentId = str2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Integer getCertificateId() {
        return this.certificateId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getDocumentId() {
        return this.documentId;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final LocalDate getExpirationDate() {
        return this.expirationDate;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getParentId() {
        return this.parentId;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DocumentEntity)) {
            return false;
        }
        DocumentEntity documentEntity = (DocumentEntity) other;
        return this.id == documentEntity.id && t.c(this.documentId, documentEntity.documentId) && this.type == documentEntity.type && this.status == documentEntity.status && t.c(this.expirationDate, documentEntity.expirationDate) && t.c(this.certificateId, documentEntity.certificateId) && t.c(this.parentId, documentEntity.parentId);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final DocumentEntityStatus getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final DocumentEntityType getType() {
        return this.type;
    }

    public final DocumentEntityStatus h() {
        int i15 = a.f84331a[this.status.ordinal()];
        if (i15 == 1) {
            LocalDate localDateNow = LocalDate.now();
            LocalDate localDate = this.expirationDate;
            return (localDate == null || !localDate.isBefore(localDateNow)) ? this.status : DocumentEntityStatus.TO_UPDATE;
        }
        if (i15 == 2 || i15 == 3) {
            return this.status;
        }
        throw new p();
    }

    public int hashCode() {
        int iHashCode = ((((((Integer.hashCode(this.id) * 31) + this.documentId.hashCode()) * 31) + this.type.hashCode()) * 31) + this.status.hashCode()) * 31;
        LocalDate localDate = this.expirationDate;
        int iHashCode2 = (iHashCode + (localDate == null ? 0 : localDate.hashCode())) * 31;
        Integer num = this.certificateId;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.parentId;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "DocumentEntity(id=" + this.id + ", documentId=" + this.documentId + ", type=" + this.type + ", status=" + this.status + ", expirationDate=" + this.expirationDate + ", certificateId=" + this.certificateId + ", parentId=" + this.parentId + ')';
    }

    public /* synthetic */ DocumentEntity(int i15, String str, DocumentEntityType documentEntityType, DocumentEntityStatus documentEntityStatus, LocalDate localDate, Integer num, String str2, int i16, k kVar) {
        this((i16 & 1) != 0 ? 0 : i15, str, documentEntityType, documentEntityStatus, localDate, (i16 & 32) != 0 ? null : num, (i16 & 64) != 0 ? null : str2);
    }
}
