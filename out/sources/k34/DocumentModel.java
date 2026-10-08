package k34;

import java.util.Date;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: k34.m, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u000eR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\u000eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u0019\u0010\u000eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\u000eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001d\u001a\u0004\b\u0016\u0010\u001eR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b\u001b\u0010\u001eR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001f\u0010\u000e¨\u0006 "}, d2 = {"Lk34/m;", "", "", "institutionName", "documentType", "documentId", "isDuplicate", "Ljava/util/Date;", "distributionDate", "expireDate", "issueReason", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "e", "b", "c", "d", "g", "Ljava/util/Date;", "()Ljava/util/Date;", "f", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DocumentModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String institutionName;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String documentType;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String documentId;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String isDuplicate;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final Date distributionDate;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final Date expireDate;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String issueReason;

    public DocumentModel(String str, String str2, String str3, String str4, Date date, Date date2, String str5) {
        this.institutionName = str;
        this.documentType = str2;
        this.documentId = str3;
        this.isDuplicate = str4;
        this.distributionDate = date;
        this.expireDate = date2;
        this.issueReason = str5;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Date getDistributionDate() {
        return this.distributionDate;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getDocumentId() {
        return this.documentId;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getDocumentType() {
        return this.documentType;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Date getExpireDate() {
        return this.expireDate;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getInstitutionName() {
        return this.institutionName;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DocumentModel)) {
            return false;
        }
        DocumentModel documentModel = (DocumentModel) other;
        return fr.t.c(this.institutionName, documentModel.institutionName) && fr.t.c(this.documentType, documentModel.documentType) && fr.t.c(this.documentId, documentModel.documentId) && fr.t.c(this.isDuplicate, documentModel.isDuplicate) && fr.t.c(this.distributionDate, documentModel.distributionDate) && fr.t.c(this.expireDate, documentModel.expireDate) && fr.t.c(this.issueReason, documentModel.issueReason);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getIssueReason() {
        return this.issueReason;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getIsDuplicate() {
        return this.isDuplicate;
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

    public String toString() {
        return "DocumentModel(institutionName=" + this.institutionName + ", documentType=" + this.documentType + ", documentId=" + this.documentId + ", isDuplicate=" + this.isDuplicate + ", distributionDate=" + this.distributionDate + ", expireDate=" + this.expireDate + ", issueReason=" + this.issueReason + ")";
    }
}
