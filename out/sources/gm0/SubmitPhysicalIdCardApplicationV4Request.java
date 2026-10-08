package gm0;

import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: gm0.c7, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001c\b\u0086\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\u0013R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010$\u001a\u0004\b/\u0010\u0013R\"\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103¨\u00064"}, d2 = {"Lgm0/c7;", "", "Lgm0/c;", "applicantType", "Lgm0/q1;", "communityOffice", "", "signedApplication", "Lgm0/m1;", "childApplicationType", "Lgm0/u1;", "contactDetails", "epuapAddress", "", "Lgm0/c2;", "filesInfo", "<init>", "(Lgm0/c;Lgm0/q1;Ljava/lang/String;Lgm0/m1;Lgm0/u1;Ljava/lang/String;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lgm0/c;", "getApplicantType", "()Lgm0/c;", "b", "Lgm0/q1;", "getCommunityOffice", "()Lgm0/q1;", "c", "Ljava/lang/String;", "getSignedApplication", "d", "Lgm0/m1;", "getChildApplicationType", "()Lgm0/m1;", "e", "Lgm0/u1;", "getContactDetails", "()Lgm0/u1;", "f", "getEpuapAddress", "g", "Ljava/util/List;", "getFilesInfo", "()Ljava/util/List;", "documentmanagementservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SubmitPhysicalIdCardApplicationV4Request {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("applicantType")
    private final c applicantType;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("communityOffice")
    private final CommunityOfficeDto communityOffice;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("signedApplication")
    private final String signedApplication;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("childApplicationType")
    private final m1 childApplicationType;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("contactDetails")
    private final ContactDetailsDto contactDetails;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("epuapAddress")
    private final String epuapAddress;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("filesInfo")
    private final List<FileInfoDto> filesInfo;

    public SubmitPhysicalIdCardApplicationV4Request(c cVar, CommunityOfficeDto communityOfficeDto, String str, m1 m1Var, ContactDetailsDto contactDetailsDto, String str2, List<FileInfoDto> list) {
        this.applicantType = cVar;
        this.communityOffice = communityOfficeDto;
        this.signedApplication = str;
        this.childApplicationType = m1Var;
        this.contactDetails = contactDetailsDto;
        this.epuapAddress = str2;
        this.filesInfo = list;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubmitPhysicalIdCardApplicationV4Request)) {
            return false;
        }
        SubmitPhysicalIdCardApplicationV4Request submitPhysicalIdCardApplicationV4Request = (SubmitPhysicalIdCardApplicationV4Request) other;
        return this.applicantType == submitPhysicalIdCardApplicationV4Request.applicantType && fr.t.c(this.communityOffice, submitPhysicalIdCardApplicationV4Request.communityOffice) && fr.t.c(this.signedApplication, submitPhysicalIdCardApplicationV4Request.signedApplication) && this.childApplicationType == submitPhysicalIdCardApplicationV4Request.childApplicationType && fr.t.c(this.contactDetails, submitPhysicalIdCardApplicationV4Request.contactDetails) && fr.t.c(this.epuapAddress, submitPhysicalIdCardApplicationV4Request.epuapAddress) && fr.t.c(this.filesInfo, submitPhysicalIdCardApplicationV4Request.filesInfo);
    }

    public int hashCode() {
        int iHashCode = ((((this.applicantType.hashCode() * 31) + this.communityOffice.hashCode()) * 31) + this.signedApplication.hashCode()) * 31;
        m1 m1Var = this.childApplicationType;
        int iHashCode2 = (iHashCode + (m1Var == null ? 0 : m1Var.hashCode())) * 31;
        ContactDetailsDto contactDetailsDto = this.contactDetails;
        int iHashCode3 = (iHashCode2 + (contactDetailsDto == null ? 0 : contactDetailsDto.hashCode())) * 31;
        String str = this.epuapAddress;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        List<FileInfoDto> list = this.filesInfo;
        return iHashCode4 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return "SubmitPhysicalIdCardApplicationV4Request(applicantType=" + this.applicantType + ", communityOffice=" + this.communityOffice + ", signedApplication=" + this.signedApplication + ", childApplicationType=" + this.childApplicationType + ", contactDetails=" + this.contactDetails + ", epuapAddress=" + this.epuapAddress + ", filesInfo=" + this.filesInfo + ')';
    }

    public /* synthetic */ SubmitPhysicalIdCardApplicationV4Request(c cVar, CommunityOfficeDto communityOfficeDto, String str, m1 m1Var, ContactDetailsDto contactDetailsDto, String str2, List list, int i15, fr.k kVar) {
        this(cVar, communityOfficeDto, str, (i15 & 8) != 0 ? null : m1Var, (i15 & 16) != 0 ? null : contactDetailsDto, (i15 & 32) != 0 ? null : str2, (i15 & 64) != 0 ? null : list);
    }
}
