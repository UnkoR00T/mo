package gm0;

import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: gm0.d7, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u000eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lgm0/d7;", "", "Lgm0/q1;", "communityOffice", "", "signedDocument", "Lgm0/u1;", "contactDetails", "", "Lgm0/c2;", "filesInfo", "<init>", "(Lgm0/q1;Ljava/lang/String;Lgm0/u1;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lgm0/q1;", "getCommunityOffice", "()Lgm0/q1;", "b", "Ljava/lang/String;", "getSignedDocument", "c", "Lgm0/u1;", "getContactDetails", "()Lgm0/u1;", "d", "Ljava/util/List;", "getFilesInfo", "()Ljava/util/List;", "documentmanagementservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SubmitPhysicalIdCardIdentityTheftV4Request {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("communityOffice")
    private final CommunityOfficeDto communityOffice;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("signedDocument")
    private final String signedDocument;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("contactDetails")
    private final ContactDetailsDto contactDetails;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("filesInfo")
    private final List<FileInfoDto> filesInfo;

    public SubmitPhysicalIdCardIdentityTheftV4Request(CommunityOfficeDto communityOfficeDto, String str, ContactDetailsDto contactDetailsDto, List<FileInfoDto> list) {
        this.communityOffice = communityOfficeDto;
        this.signedDocument = str;
        this.contactDetails = contactDetailsDto;
        this.filesInfo = list;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubmitPhysicalIdCardIdentityTheftV4Request)) {
            return false;
        }
        SubmitPhysicalIdCardIdentityTheftV4Request submitPhysicalIdCardIdentityTheftV4Request = (SubmitPhysicalIdCardIdentityTheftV4Request) other;
        return fr.t.c(this.communityOffice, submitPhysicalIdCardIdentityTheftV4Request.communityOffice) && fr.t.c(this.signedDocument, submitPhysicalIdCardIdentityTheftV4Request.signedDocument) && fr.t.c(this.contactDetails, submitPhysicalIdCardIdentityTheftV4Request.contactDetails) && fr.t.c(this.filesInfo, submitPhysicalIdCardIdentityTheftV4Request.filesInfo);
    }

    public int hashCode() {
        int iHashCode = ((this.communityOffice.hashCode() * 31) + this.signedDocument.hashCode()) * 31;
        ContactDetailsDto contactDetailsDto = this.contactDetails;
        int iHashCode2 = (iHashCode + (contactDetailsDto == null ? 0 : contactDetailsDto.hashCode())) * 31;
        List<FileInfoDto> list = this.filesInfo;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return "SubmitPhysicalIdCardIdentityTheftV4Request(communityOffice=" + this.communityOffice + ", signedDocument=" + this.signedDocument + ", contactDetails=" + this.contactDetails + ", filesInfo=" + this.filesInfo + ')';
    }
}
