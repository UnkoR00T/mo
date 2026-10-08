package pl.gov.coi.mobywatel.technical.containers.data.model;

import androidx.annotation.Keep;
import fr.k;
import fr.t;
import java.util.Date;
import org.bouncycastle.asn1.eac.CertificateBody;
import p071kotlin.Metadata;
import vl.c;

/* JADX INFO: loaded from: classes10.dex */
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J]\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000eR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000e¨\u0006#"}, d2 = {"Lpl/gov/coi/mobywatel/technical/containers/data/model/OtherDocumentDto;", "", "institutionName", "", "documentType", "documentId", "isDuplicate", "distributionDate", "Ljava/util/Date;", "expireDate", "issueReason", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;)V", "getInstitutionName", "()Ljava/lang/String;", "getDocumentType", "getDocumentId", "getDistributionDate", "()Ljava/util/Date;", "getExpireDate", "getIssueReason", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "containers_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class OtherDocumentDto {

    @c("distributionDate")
    private final Date distributionDate;

    @c("documentId")
    private final String documentId;

    @c("documentType")
    private final String documentType;

    @c("expireDate")
    private final Date expireDate;

    @c("institutionName")
    private final String institutionName;

    @c("isDuplicate")
    private final String isDuplicate;

    @c("issueReason")
    private final String issueReason;

    public OtherDocumentDto() {
        this(null, null, null, null, null, null, null, CertificateBody.profileType, null);
    }

    public static /* synthetic */ OtherDocumentDto copy$default(OtherDocumentDto otherDocumentDto, String str, String str2, String str3, String str4, Date date, Date date2, String str5, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            str = otherDocumentDto.institutionName;
        }
        if ((i15 & 2) != 0) {
            str2 = otherDocumentDto.documentType;
        }
        if ((i15 & 4) != 0) {
            str3 = otherDocumentDto.documentId;
        }
        if ((i15 & 8) != 0) {
            str4 = otherDocumentDto.isDuplicate;
        }
        if ((i15 & 16) != 0) {
            date = otherDocumentDto.distributionDate;
        }
        if ((i15 & 32) != 0) {
            date2 = otherDocumentDto.expireDate;
        }
        if ((i15 & 64) != 0) {
            str5 = otherDocumentDto.issueReason;
        }
        Date date3 = date2;
        String str6 = str5;
        Date date4 = date;
        String str7 = str3;
        return otherDocumentDto.copy(str, str2, str7, str4, date4, date3, str6);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getInstitutionName() {
        return this.institutionName;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDocumentType() {
        return this.documentType;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDocumentId() {
        return this.documentId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getIsDuplicate() {
        return this.isDuplicate;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Date getDistributionDate() {
        return this.distributionDate;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Date getExpireDate() {
        return this.expireDate;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getIssueReason() {
        return this.issueReason;
    }

    public final OtherDocumentDto copy(String institutionName, String documentType, String documentId, String isDuplicate, Date distributionDate, Date expireDate, String issueReason) {
        return new OtherDocumentDto(institutionName, documentType, documentId, isDuplicate, distributionDate, expireDate, issueReason);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OtherDocumentDto)) {
            return false;
        }
        OtherDocumentDto otherDocumentDto = (OtherDocumentDto) other;
        return t.c(this.institutionName, otherDocumentDto.institutionName) && t.c(this.documentType, otherDocumentDto.documentType) && t.c(this.documentId, otherDocumentDto.documentId) && t.c(this.isDuplicate, otherDocumentDto.isDuplicate) && t.c(this.distributionDate, otherDocumentDto.distributionDate) && t.c(this.expireDate, otherDocumentDto.expireDate) && t.c(this.issueReason, otherDocumentDto.issueReason);
    }

    public final Date getDistributionDate() {
        return this.distributionDate;
    }

    public final String getDocumentId() {
        return this.documentId;
    }

    public final String getDocumentType() {
        return this.documentType;
    }

    public final Date getExpireDate() {
        return this.expireDate;
    }

    public final String getInstitutionName() {
        return this.institutionName;
    }

    public final String getIssueReason() {
        return this.issueReason;
    }

    public int hashCode() {
        String str = this.institutionName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.documentType;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.documentId;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.isDuplicate;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Date date = this.distributionDate;
        int iHashCode5 = (iHashCode4 + (date == null ? 0 : date.hashCode())) * 31;
        Date date2 = this.expireDate;
        int iHashCode6 = (iHashCode5 + (date2 == null ? 0 : date2.hashCode())) * 31;
        String str5 = this.issueReason;
        return iHashCode6 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String isDuplicate() {
        return this.isDuplicate;
    }

    public String toString() {
        return "OtherDocumentDto(institutionName=" + this.institutionName + ", documentType=" + this.documentType + ", documentId=" + this.documentId + ", isDuplicate=" + this.isDuplicate + ", distributionDate=" + this.distributionDate + ", expireDate=" + this.expireDate + ", issueReason=" + this.issueReason + ')';
    }

    public OtherDocumentDto(String str, String str2, String str3, String str4, Date date, Date date2, String str5) {
        this.institutionName = str;
        this.documentType = str2;
        this.documentId = str3;
        this.isDuplicate = str4;
        this.distributionDate = date;
        this.expireDate = date2;
        this.issueReason = str5;
    }

    public /* synthetic */ OtherDocumentDto(String str, String str2, String str3, String str4, Date date, Date date2, String str5, int i15, k kVar) {
        this((i15 & 1) != 0 ? null : str, (i15 & 2) != 0 ? null : str2, (i15 & 4) != 0 ? null : str3, (i15 & 8) != 0 ? null : str4, (i15 & 16) != 0 ? null : date, (i15 & 32) != 0 ? null : date2, (i15 & 64) != 0 ? null : str5);
    }
}
