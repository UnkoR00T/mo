package pl.gov.coi.mobywatel.technical.documents.data.model;

import androidx.annotation.Keep;
import fr.t;
import java.time.LocalDate;
import p071kotlin.Metadata;
import vl.c;

/* JADX INFO: loaded from: classes10.dex */
@Keep
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003J?\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, d2 = {"Lpl/gov/coi/mobywatel/technical/documents/data/model/DocumentSummaryDataDto;", "", "documentType", "", "documentIID", "documentStatus", "expirationDate", "Ljava/time/LocalDate;", "timestamp", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/time/LocalDate;J)V", "getDocumentType", "()Ljava/lang/String;", "getDocumentIID", "getDocumentStatus", "getExpirationDate", "()Ljava/time/LocalDate;", "getTimestamp", "()J", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "documents_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DocumentSummaryDataDto {

    @c("documentIID")
    private final String documentIID;

    @c("documentStatus")
    private final String documentStatus;

    @c("documentType")
    private final String documentType;

    @c("expirationDate")
    private final LocalDate expirationDate;

    @c("timestamp")
    private final long timestamp;

    public DocumentSummaryDataDto(String str, String str2, String str3, LocalDate localDate, long j15) {
        this.documentType = str;
        this.documentIID = str2;
        this.documentStatus = str3;
        this.expirationDate = localDate;
        this.timestamp = j15;
    }

    public static /* synthetic */ DocumentSummaryDataDto copy$default(DocumentSummaryDataDto documentSummaryDataDto, String str, String str2, String str3, LocalDate localDate, long j15, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            str = documentSummaryDataDto.documentType;
        }
        if ((i15 & 2) != 0) {
            str2 = documentSummaryDataDto.documentIID;
        }
        if ((i15 & 4) != 0) {
            str3 = documentSummaryDataDto.documentStatus;
        }
        if ((i15 & 8) != 0) {
            localDate = documentSummaryDataDto.expirationDate;
        }
        if ((i15 & 16) != 0) {
            j15 = documentSummaryDataDto.timestamp;
        }
        long j16 = j15;
        return documentSummaryDataDto.copy(str, str2, str3, localDate, j16);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDocumentType() {
        return this.documentType;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDocumentIID() {
        return this.documentIID;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDocumentStatus() {
        return this.documentStatus;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final LocalDate getExpirationDate() {
        return this.expirationDate;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    public final DocumentSummaryDataDto copy(String documentType, String documentIID, String documentStatus, LocalDate expirationDate, long timestamp) {
        return new DocumentSummaryDataDto(documentType, documentIID, documentStatus, expirationDate, timestamp);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DocumentSummaryDataDto)) {
            return false;
        }
        DocumentSummaryDataDto documentSummaryDataDto = (DocumentSummaryDataDto) other;
        return t.c(this.documentType, documentSummaryDataDto.documentType) && t.c(this.documentIID, documentSummaryDataDto.documentIID) && t.c(this.documentStatus, documentSummaryDataDto.documentStatus) && t.c(this.expirationDate, documentSummaryDataDto.expirationDate) && this.timestamp == documentSummaryDataDto.timestamp;
    }

    public final String getDocumentIID() {
        return this.documentIID;
    }

    public final String getDocumentStatus() {
        return this.documentStatus;
    }

    public final String getDocumentType() {
        return this.documentType;
    }

    public final LocalDate getExpirationDate() {
        return this.expirationDate;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        int iHashCode = this.documentType.hashCode() * 31;
        String str = this.documentIID;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.documentStatus.hashCode()) * 31;
        LocalDate localDate = this.expirationDate;
        return ((iHashCode2 + (localDate != null ? localDate.hashCode() : 0)) * 31) + Long.hashCode(this.timestamp);
    }

    public String toString() {
        return "DocumentSummaryDataDto(documentType=" + this.documentType + ", documentIID=" + this.documentIID + ", documentStatus=" + this.documentStatus + ", expirationDate=" + this.expirationDate + ", timestamp=" + this.timestamp + ')';
    }
}
