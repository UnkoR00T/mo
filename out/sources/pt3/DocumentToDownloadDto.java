package pt3;

import java.time.LocalDate;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: pt3.n, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u0004R\u001a\u0010\u0014\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00020\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\u0019R \u0010 \u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0017\u001a\u0004\b\u001f\u0010\u0019R\"\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\f\u0010\u0019R\u001c\u0010'\u001a\u0004\u0018\u00010\"8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001c\u0010(\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\r\u001a\u0004\b\u001b\u0010\u0004R\u001c\u0010,\u001a\u0004\u0018\u00010)8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010*\u001a\u0004\b\u001e\u0010+R\u001c\u0010.\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010\r\u001a\u0004\b#\u0010\u0004R\u001c\u00100\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010\r\u001a\u0004\b-\u0010\u0004¨\u00061"}, d2 = {"Lpt3/n;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "documentId", "Lpt3/q;", "Lpt3/q;", "c", "()Lpt3/q;", "documentType", "", "Lpt3/u;", "Ljava/util/List;", "f", "()Ljava/util/List;", "longName", "d", "h", "previousDocumentsToRemove", "e", "i", "shortName", "additionalNameDescription", "Lpt3/m;", "g", "Lpt3/m;", "getDocumentStoringMode", "()Lpt3/m;", "documentStoringMode", "encryptedScopes", "Ljava/time/LocalDate;", "Ljava/time/LocalDate;", "()Ljava/time/LocalDate;", "expirationDate", "j", "parentDocumentId", "k", "subtype", "async_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DocumentToDownloadDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("documentId")
    private final String documentId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("documentType")
    private final q documentType;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("longName")
    private final List<LabelDto> longName;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("previousDocumentsToRemove")
    private final List<String> previousDocumentsToRemove;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("shortName")
    private final List<LabelDto> shortName;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("additionalNameDescription")
    private final List<LabelDto> additionalNameDescription;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("documentStoringMode")
    private final m documentStoringMode;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("encryptedScopes")
    private final String encryptedScopes;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("expirationDate")
    private final LocalDate expirationDate;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("parentDocumentId")
    private final String parentDocumentId;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("subtype")
    private final String subtype;

    public final List<LabelDto> a() {
        return this.additionalNameDescription;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getDocumentId() {
        return this.documentId;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final q getDocumentType() {
        return this.documentType;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getEncryptedScopes() {
        return this.encryptedScopes;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final LocalDate getExpirationDate() {
        return this.expirationDate;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DocumentToDownloadDto)) {
            return false;
        }
        DocumentToDownloadDto documentToDownloadDto = (DocumentToDownloadDto) other;
        return fr.t.c(this.documentId, documentToDownloadDto.documentId) && this.documentType == documentToDownloadDto.documentType && fr.t.c(this.longName, documentToDownloadDto.longName) && fr.t.c(this.previousDocumentsToRemove, documentToDownloadDto.previousDocumentsToRemove) && fr.t.c(this.shortName, documentToDownloadDto.shortName) && fr.t.c(this.additionalNameDescription, documentToDownloadDto.additionalNameDescription) && this.documentStoringMode == documentToDownloadDto.documentStoringMode && fr.t.c(this.encryptedScopes, documentToDownloadDto.encryptedScopes) && fr.t.c(this.expirationDate, documentToDownloadDto.expirationDate) && fr.t.c(this.parentDocumentId, documentToDownloadDto.parentDocumentId) && fr.t.c(this.subtype, documentToDownloadDto.subtype);
    }

    public final List<LabelDto> f() {
        return this.longName;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getParentDocumentId() {
        return this.parentDocumentId;
    }

    public final List<String> h() {
        return this.previousDocumentsToRemove;
    }

    public int hashCode() {
        int iHashCode = ((((((((this.documentId.hashCode() * 31) + this.documentType.hashCode()) * 31) + this.longName.hashCode()) * 31) + this.previousDocumentsToRemove.hashCode()) * 31) + this.shortName.hashCode()) * 31;
        List<LabelDto> list = this.additionalNameDescription;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        m mVar = this.documentStoringMode;
        int iHashCode3 = (iHashCode2 + (mVar == null ? 0 : mVar.hashCode())) * 31;
        String str = this.encryptedScopes;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        LocalDate localDate = this.expirationDate;
        int iHashCode5 = (iHashCode4 + (localDate == null ? 0 : localDate.hashCode())) * 31;
        String str2 = this.parentDocumentId;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.subtype;
        return iHashCode6 + (str3 != null ? str3.hashCode() : 0);
    }

    public final List<LabelDto> i() {
        return this.shortName;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getSubtype() {
        return this.subtype;
    }

    public String toString() {
        return "DocumentToDownloadDto(documentId=" + this.documentId + ", documentType=" + this.documentType + ", longName=" + this.longName + ", previousDocumentsToRemove=" + this.previousDocumentsToRemove + ", shortName=" + this.shortName + ", additionalNameDescription=" + this.additionalNameDescription + ", documentStoringMode=" + this.documentStoringMode + ", encryptedScopes=" + this.encryptedScopes + ", expirationDate=" + this.expirationDate + ", parentDocumentId=" + this.parentDocumentId + ", subtype=" + this.subtype + ')';
    }
}
