package pl.gov.coi.mobywatel.technical.documents.data.model;

import androidx.annotation.Keep;
import fr.k;
import fr.t;
import java.time.OffsetDateTime;
import oq.a;
import p071kotlin.Metadata;
import vl.c;
import wq.b;

/* JADX INFO: loaded from: classes10.dex */
@Keep
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u00016Bc\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0007HÆ\u0003J\t\u0010(\u001a\u00020\tHÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u000eHÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\u0010\u0010.\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\"J~\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u00100J\u0013\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00104\u001a\u00020\tHÖ\u0001J\t\u00105\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014R\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0014R\u0016\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010\u000f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0014R\u001a\u0010\u0010\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010#\u001a\u0004\b!\u0010\"¨\u00067"}, d2 = {"Lpl/gov/coi/mobywatel/technical/documents/data/model/HeaderContainerDto;", "", "pesel", "", "internalDocumentId", "version", "documentType", "Lpl/gov/coi/mobywatel/technical/documents/data/model/HeaderContainerDto$DocumentType;", "documentVersion", "", "certificateSubjectDn", "certificateSerialNumber", "certificateIssuerDn", "creationTimestamp", "Ljava/time/OffsetDateTime;", "documentIssuer", "documentSubtype", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lpl/gov/coi/mobywatel/technical/documents/data/model/HeaderContainerDto$DocumentType;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/time/OffsetDateTime;Ljava/lang/String;Ljava/lang/Integer;)V", "getPesel", "()Ljava/lang/String;", "getInternalDocumentId", "getVersion", "getDocumentType", "()Lpl/gov/coi/mobywatel/technical/documents/data/model/HeaderContainerDto$DocumentType;", "getDocumentVersion", "()I", "getCertificateSubjectDn", "getCertificateSerialNumber", "getCertificateIssuerDn", "getCreationTimestamp", "()Ljava/time/OffsetDateTime;", "getDocumentIssuer", "getDocumentSubtype", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lpl/gov/coi/mobywatel/technical/documents/data/model/HeaderContainerDto$DocumentType;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/time/OffsetDateTime;Ljava/lang/String;Ljava/lang/Integer;)Lpl/gov/coi/mobywatel/technical/documents/data/model/HeaderContainerDto;", "equals", "", "other", "hashCode", "toString", "DocumentType", "documents_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@a
public final /* data */ class HeaderContainerDto {

    @c("certificateIssuerDn")
    private final String certificateIssuerDn;

    @c("certificateSerialNumber")
    private final String certificateSerialNumber;

    @c("certificateSubjectDn")
    private final String certificateSubjectDn;

    @c("creationTimestamp")
    private final OffsetDateTime creationTimestamp;

    @c("documentIssuer")
    private final String documentIssuer;

    @c("documentSubtype")
    private final Integer documentSubtype;

    @c("documentType")
    private final DocumentType documentType;

    @c("documentVersion")
    private final int documentVersion;

    @c("internalDocumentId")
    private final String internalDocumentId;

    @c("pesel")
    private final String pesel;

    @c("version")
    private final String version;

    @Keep
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lpl/gov/coi/mobywatel/technical/documents/data/model/HeaderContainerDto$DocumentType;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "MOBILE_ID_CARD", "DRIVING_LICENCE", "TEMPORARY_DRIVING_LICENCE", "DEPUTY", "NURSE", "MIDWIFE", "PENSIONER", "DOCTOR", "UNKNOWN", "documents_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public enum DocumentType {
        MOBILE_ID_CARD("MOBILE_ID_CARD"),
        DRIVING_LICENCE("DRIVING_LICENCE"),
        TEMPORARY_DRIVING_LICENCE("TEMPORARY_DRIVING_LICENCE"),
        DEPUTY("DEPUTY"),
        NURSE("NURSE"),
        MIDWIFE("MIDWIFE"),
        PENSIONER("PENSIONER"),
        DOCTOR("DOCTOR"),
        UNKNOWN("UNKNOWN");

        private static final /* synthetic */ wq.a $ENTRIES = b.a(values());
        private final String value;

        DocumentType(String str) {
            this.value = str;
        }

        public static wq.a<DocumentType> getEntries() {
            return $ENTRIES;
        }

        public final String getValue() {
            return this.value;
        }
    }

    public HeaderContainerDto(String str, String str2, String str3, DocumentType documentType, int i15, String str4, String str5, String str6, OffsetDateTime offsetDateTime, String str7, Integer num) {
        this.pesel = str;
        this.internalDocumentId = str2;
        this.version = str3;
        this.documentType = documentType;
        this.documentVersion = i15;
        this.certificateSubjectDn = str4;
        this.certificateSerialNumber = str5;
        this.certificateIssuerDn = str6;
        this.creationTimestamp = offsetDateTime;
        this.documentIssuer = str7;
        this.documentSubtype = num;
    }

    public static /* synthetic */ HeaderContainerDto copy$default(HeaderContainerDto headerContainerDto, String str, String str2, String str3, DocumentType documentType, int i15, String str4, String str5, String str6, OffsetDateTime offsetDateTime, String str7, Integer num, int i16, Object obj) {
        if ((i16 & 1) != 0) {
            str = headerContainerDto.pesel;
        }
        if ((i16 & 2) != 0) {
            str2 = headerContainerDto.internalDocumentId;
        }
        if ((i16 & 4) != 0) {
            str3 = headerContainerDto.version;
        }
        if ((i16 & 8) != 0) {
            documentType = headerContainerDto.documentType;
        }
        if ((i16 & 16) != 0) {
            i15 = headerContainerDto.documentVersion;
        }
        if ((i16 & 32) != 0) {
            str4 = headerContainerDto.certificateSubjectDn;
        }
        if ((i16 & 64) != 0) {
            str5 = headerContainerDto.certificateSerialNumber;
        }
        if ((i16 & 128) != 0) {
            str6 = headerContainerDto.certificateIssuerDn;
        }
        if ((i16 & 256) != 0) {
            offsetDateTime = headerContainerDto.creationTimestamp;
        }
        if ((i16 & 512) != 0) {
            str7 = headerContainerDto.documentIssuer;
        }
        if ((i16 & 1024) != 0) {
            num = headerContainerDto.documentSubtype;
        }
        String str8 = str7;
        Integer num2 = num;
        String str9 = str6;
        OffsetDateTime offsetDateTime2 = offsetDateTime;
        String str10 = str4;
        String str11 = str5;
        int i17 = i15;
        String str12 = str3;
        return headerContainerDto.copy(str, str2, str12, documentType, i17, str10, str11, str9, offsetDateTime2, str8, num2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPesel() {
        return this.pesel;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getDocumentIssuer() {
        return this.documentIssuer;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Integer getDocumentSubtype() {
        return this.documentSubtype;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getInternalDocumentId() {
        return this.internalDocumentId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final DocumentType getDocumentType() {
        return this.documentType;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getDocumentVersion() {
        return this.documentVersion;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getCertificateSubjectDn() {
        return this.certificateSubjectDn;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getCertificateSerialNumber() {
        return this.certificateSerialNumber;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getCertificateIssuerDn() {
        return this.certificateIssuerDn;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final OffsetDateTime getCreationTimestamp() {
        return this.creationTimestamp;
    }

    public final HeaderContainerDto copy(String pesel, String internalDocumentId, String version, DocumentType documentType, int documentVersion, String certificateSubjectDn, String certificateSerialNumber, String certificateIssuerDn, OffsetDateTime creationTimestamp, String documentIssuer, Integer documentSubtype) {
        return new HeaderContainerDto(pesel, internalDocumentId, version, documentType, documentVersion, certificateSubjectDn, certificateSerialNumber, certificateIssuerDn, creationTimestamp, documentIssuer, documentSubtype);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HeaderContainerDto)) {
            return false;
        }
        HeaderContainerDto headerContainerDto = (HeaderContainerDto) other;
        return t.c(this.pesel, headerContainerDto.pesel) && t.c(this.internalDocumentId, headerContainerDto.internalDocumentId) && t.c(this.version, headerContainerDto.version) && this.documentType == headerContainerDto.documentType && this.documentVersion == headerContainerDto.documentVersion && t.c(this.certificateSubjectDn, headerContainerDto.certificateSubjectDn) && t.c(this.certificateSerialNumber, headerContainerDto.certificateSerialNumber) && t.c(this.certificateIssuerDn, headerContainerDto.certificateIssuerDn) && t.c(this.creationTimestamp, headerContainerDto.creationTimestamp) && t.c(this.documentIssuer, headerContainerDto.documentIssuer) && t.c(this.documentSubtype, headerContainerDto.documentSubtype);
    }

    public final String getCertificateIssuerDn() {
        return this.certificateIssuerDn;
    }

    public final String getCertificateSerialNumber() {
        return this.certificateSerialNumber;
    }

    public final String getCertificateSubjectDn() {
        return this.certificateSubjectDn;
    }

    public final OffsetDateTime getCreationTimestamp() {
        return this.creationTimestamp;
    }

    public final String getDocumentIssuer() {
        return this.documentIssuer;
    }

    public final Integer getDocumentSubtype() {
        return this.documentSubtype;
    }

    public final DocumentType getDocumentType() {
        return this.documentType;
    }

    public final int getDocumentVersion() {
        return this.documentVersion;
    }

    public final String getInternalDocumentId() {
        return this.internalDocumentId;
    }

    public final String getPesel() {
        return this.pesel;
    }

    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((((((this.pesel.hashCode() * 31) + this.internalDocumentId.hashCode()) * 31) + this.version.hashCode()) * 31) + this.documentType.hashCode()) * 31) + Integer.hashCode(this.documentVersion)) * 31) + this.certificateSubjectDn.hashCode()) * 31) + this.certificateSerialNumber.hashCode()) * 31) + this.certificateIssuerDn.hashCode()) * 31) + this.creationTimestamp.hashCode()) * 31) + this.documentIssuer.hashCode()) * 31;
        Integer num = this.documentSubtype;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public String toString() {
        return "HeaderContainerDto(pesel=" + this.pesel + ", internalDocumentId=" + this.internalDocumentId + ", version=" + this.version + ", documentType=" + this.documentType + ", documentVersion=" + this.documentVersion + ", certificateSubjectDn=" + this.certificateSubjectDn + ", certificateSerialNumber=" + this.certificateSerialNumber + ", certificateIssuerDn=" + this.certificateIssuerDn + ", creationTimestamp=" + this.creationTimestamp + ", documentIssuer=" + this.documentIssuer + ", documentSubtype=" + this.documentSubtype + ')';
    }

    public /* synthetic */ HeaderContainerDto(String str, String str2, String str3, DocumentType documentType, int i15, String str4, String str5, String str6, OffsetDateTime offsetDateTime, String str7, Integer num, int i16, k kVar) {
        this(str, str2, str3, documentType, i15, str4, str5, str6, offsetDateTime, str7, (i16 & 1024) != 0 ? null : num);
    }
}
