package gm0;

import java.time.LocalDate;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: gm0.j2, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001e\b\u0086\b\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u0010\u0014¨\u00067"}, d2 = {"Lgm0/j2;", "", "Lgm0/a6;", "applicantData", "Lgm0/q1;", "communityOffice", "Lgm0/u1;", "contactDetails", "", "Lgm0/f2;", "files", "Ljava/time/LocalDate;", "issuedDate", "Lgm0/k6;", "parentsData", "", "situationDescription", "<init>", "(Lgm0/a6;Lgm0/q1;Lgm0/u1;Ljava/util/List;Ljava/time/LocalDate;Lgm0/k6;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lgm0/a6;", "getApplicantData", "()Lgm0/a6;", "b", "Lgm0/q1;", "getCommunityOffice", "()Lgm0/q1;", "c", "Lgm0/u1;", "getContactDetails", "()Lgm0/u1;", "d", "Ljava/util/List;", "getFiles", "()Ljava/util/List;", "e", "Ljava/time/LocalDate;", "getIssuedDate", "()Ljava/time/LocalDate;", "f", "Lgm0/k6;", "getParentsData", "()Lgm0/k6;", "g", "Ljava/lang/String;", "getSituationDescription", "documentmanagementservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class GeneratePhysicalIdCardXmlIdentityTheftV4Request {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("applicantData")
    private final PhysicalIdCardInvalidationApplicantDataDto applicantData;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("communityOffice")
    private final CommunityOfficeDto communityOffice;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("contactDetails")
    private final ContactDetailsDto contactDetails;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("files")
    private final List<FileV4Dto> files;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("issuedDate")
    private final LocalDate issuedDate;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("parentsData")
    private final PhysicalIdCardInvalidationParentsDataDto parentsData;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("situationDescription")
    private final String situationDescription;

    public GeneratePhysicalIdCardXmlIdentityTheftV4Request(PhysicalIdCardInvalidationApplicantDataDto physicalIdCardInvalidationApplicantDataDto, CommunityOfficeDto communityOfficeDto, ContactDetailsDto contactDetailsDto, List<FileV4Dto> list, LocalDate localDate, PhysicalIdCardInvalidationParentsDataDto physicalIdCardInvalidationParentsDataDto, String str) {
        this.applicantData = physicalIdCardInvalidationApplicantDataDto;
        this.communityOffice = communityOfficeDto;
        this.contactDetails = contactDetailsDto;
        this.files = list;
        this.issuedDate = localDate;
        this.parentsData = physicalIdCardInvalidationParentsDataDto;
        this.situationDescription = str;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GeneratePhysicalIdCardXmlIdentityTheftV4Request)) {
            return false;
        }
        GeneratePhysicalIdCardXmlIdentityTheftV4Request generatePhysicalIdCardXmlIdentityTheftV4Request = (GeneratePhysicalIdCardXmlIdentityTheftV4Request) other;
        return fr.t.c(this.applicantData, generatePhysicalIdCardXmlIdentityTheftV4Request.applicantData) && fr.t.c(this.communityOffice, generatePhysicalIdCardXmlIdentityTheftV4Request.communityOffice) && fr.t.c(this.contactDetails, generatePhysicalIdCardXmlIdentityTheftV4Request.contactDetails) && fr.t.c(this.files, generatePhysicalIdCardXmlIdentityTheftV4Request.files) && fr.t.c(this.issuedDate, generatePhysicalIdCardXmlIdentityTheftV4Request.issuedDate) && fr.t.c(this.parentsData, generatePhysicalIdCardXmlIdentityTheftV4Request.parentsData) && fr.t.c(this.situationDescription, generatePhysicalIdCardXmlIdentityTheftV4Request.situationDescription);
    }

    public int hashCode() {
        int iHashCode = ((this.applicantData.hashCode() * 31) + this.communityOffice.hashCode()) * 31;
        ContactDetailsDto contactDetailsDto = this.contactDetails;
        int iHashCode2 = (iHashCode + (contactDetailsDto == null ? 0 : contactDetailsDto.hashCode())) * 31;
        List<FileV4Dto> list = this.files;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        LocalDate localDate = this.issuedDate;
        int iHashCode4 = (iHashCode3 + (localDate == null ? 0 : localDate.hashCode())) * 31;
        PhysicalIdCardInvalidationParentsDataDto physicalIdCardInvalidationParentsDataDto = this.parentsData;
        int iHashCode5 = (iHashCode4 + (physicalIdCardInvalidationParentsDataDto == null ? 0 : physicalIdCardInvalidationParentsDataDto.hashCode())) * 31;
        String str = this.situationDescription;
        return iHashCode5 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "GeneratePhysicalIdCardXmlIdentityTheftV4Request(applicantData=" + this.applicantData + ", communityOffice=" + this.communityOffice + ", contactDetails=" + this.contactDetails + ", files=" + this.files + ", issuedDate=" + this.issuedDate + ", parentsData=" + this.parentsData + ", situationDescription=" + this.situationDescription + ')';
    }
}
