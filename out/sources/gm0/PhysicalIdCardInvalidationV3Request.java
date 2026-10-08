package gm0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: gm0.l6, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010\u001d\u001a\u0004\b(\u0010\u0010R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lgm0/l6;", "", "Lgm0/a6;", "applicantData", "", "officeTerc", "Lgm0/t2;", "reason", "Lgm0/u1;", "contactDetailsDto", "epuapAddress", "Lgm0/k6;", "parentsData", "<init>", "(Lgm0/a6;Ljava/lang/String;Lgm0/t2;Lgm0/u1;Ljava/lang/String;Lgm0/k6;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lgm0/a6;", "getApplicantData", "()Lgm0/a6;", "b", "Ljava/lang/String;", "getOfficeTerc", "c", "Lgm0/t2;", "getReason", "()Lgm0/t2;", "d", "Lgm0/u1;", "getContactDetailsDto", "()Lgm0/u1;", "e", "getEpuapAddress", "f", "Lgm0/k6;", "getParentsData", "()Lgm0/k6;", "documentmanagementservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PhysicalIdCardInvalidationV3Request {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("applicantData")
    private final PhysicalIdCardInvalidationApplicantDataDto applicantData;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("officeTerc")
    private final String officeTerc;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("reason")
    private final t2 reason;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("contactDetailsDto")
    private final ContactDetailsDto contactDetailsDto;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("epuapAddress")
    private final String epuapAddress;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("parentsData")
    private final PhysicalIdCardInvalidationParentsDataDto parentsData;

    public PhysicalIdCardInvalidationV3Request(PhysicalIdCardInvalidationApplicantDataDto physicalIdCardInvalidationApplicantDataDto, String str, t2 t2Var, ContactDetailsDto contactDetailsDto, String str2, PhysicalIdCardInvalidationParentsDataDto physicalIdCardInvalidationParentsDataDto) {
        this.applicantData = physicalIdCardInvalidationApplicantDataDto;
        this.officeTerc = str;
        this.reason = t2Var;
        this.contactDetailsDto = contactDetailsDto;
        this.epuapAddress = str2;
        this.parentsData = physicalIdCardInvalidationParentsDataDto;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PhysicalIdCardInvalidationV3Request)) {
            return false;
        }
        PhysicalIdCardInvalidationV3Request physicalIdCardInvalidationV3Request = (PhysicalIdCardInvalidationV3Request) other;
        return fr.t.c(this.applicantData, physicalIdCardInvalidationV3Request.applicantData) && fr.t.c(this.officeTerc, physicalIdCardInvalidationV3Request.officeTerc) && this.reason == physicalIdCardInvalidationV3Request.reason && fr.t.c(this.contactDetailsDto, physicalIdCardInvalidationV3Request.contactDetailsDto) && fr.t.c(this.epuapAddress, physicalIdCardInvalidationV3Request.epuapAddress) && fr.t.c(this.parentsData, physicalIdCardInvalidationV3Request.parentsData);
    }

    public int hashCode() {
        int iHashCode = ((((this.applicantData.hashCode() * 31) + this.officeTerc.hashCode()) * 31) + this.reason.hashCode()) * 31;
        ContactDetailsDto contactDetailsDto = this.contactDetailsDto;
        int iHashCode2 = (iHashCode + (contactDetailsDto == null ? 0 : contactDetailsDto.hashCode())) * 31;
        String str = this.epuapAddress;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        PhysicalIdCardInvalidationParentsDataDto physicalIdCardInvalidationParentsDataDto = this.parentsData;
        return iHashCode3 + (physicalIdCardInvalidationParentsDataDto != null ? physicalIdCardInvalidationParentsDataDto.hashCode() : 0);
    }

    public String toString() {
        return "PhysicalIdCardInvalidationV3Request(applicantData=" + this.applicantData + ", officeTerc=" + this.officeTerc + ", reason=" + this.reason + ", contactDetailsDto=" + this.contactDetailsDto + ", epuapAddress=" + this.epuapAddress + ", parentsData=" + this.parentsData + ')';
    }

    public /* synthetic */ PhysicalIdCardInvalidationV3Request(PhysicalIdCardInvalidationApplicantDataDto physicalIdCardInvalidationApplicantDataDto, String str, t2 t2Var, ContactDetailsDto contactDetailsDto, String str2, PhysicalIdCardInvalidationParentsDataDto physicalIdCardInvalidationParentsDataDto, int i15, fr.k kVar) {
        this(physicalIdCardInvalidationApplicantDataDto, str, t2Var, (i15 & 8) != 0 ? null : contactDetailsDto, (i15 & 16) != 0 ? null : str2, (i15 & 32) != 0 ? null : physicalIdCardInvalidationParentsDataDto);
    }
}
