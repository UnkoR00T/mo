package gm0;

import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: gm0.i2, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b#\b\u0086\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001a\u001a\u00020\u000b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010\u0015R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001a\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001a\u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b7\u0010%\u001a\u0004\b8\u0010\u0015¨\u00069"}, d2 = {"Lgm0/i2;", "", "Lgm0/a;", "addressData", "Lgm0/i;", "applicationReasonType", "", "communityOfficeId", "", "Lgm0/f2;", "files", "", "hasPersonalSigningCertificate", "Lgm0/r5;", "personalData", "Lgm0/u1;", "contactDetails", "epuapAddress", "<init>", "(Lgm0/a;Lgm0/i;Ljava/lang/String;Ljava/util/List;ZLgm0/r5;Lgm0/u1;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lgm0/a;", "getAddressData", "()Lgm0/a;", "b", "Lgm0/i;", "getApplicationReasonType", "()Lgm0/i;", "c", "Ljava/lang/String;", "getCommunityOfficeId", "d", "Ljava/util/List;", "getFiles", "()Ljava/util/List;", "e", "Z", "getHasPersonalSigningCertificate", "()Z", "f", "Lgm0/r5;", "getPersonalData", "()Lgm0/r5;", "g", "Lgm0/u1;", "getContactDetails", "()Lgm0/u1;", "h", "getEpuapAddress", "documentmanagementservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class GeneratePhysicalIdCardXmlApplicationV4Request {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("addressData")
    private final AddressDataDto addressData;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("applicationReasonType")
    private final i applicationReasonType;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("communityOfficeId")
    private final String communityOfficeId;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("files")
    private final List<FileV4Dto> files;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("hasPersonalSigningCertificate")
    private final boolean hasPersonalSigningCertificate;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("personalData")
    private final PersonalDataDto personalData;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("contactDetails")
    private final ContactDetailsDto contactDetails;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("epuapAddress")
    private final String epuapAddress;

    public GeneratePhysicalIdCardXmlApplicationV4Request(AddressDataDto addressDataDto, i iVar, String str, List<FileV4Dto> list, boolean z15, PersonalDataDto personalDataDto, ContactDetailsDto contactDetailsDto, String str2) {
        this.addressData = addressDataDto;
        this.applicationReasonType = iVar;
        this.communityOfficeId = str;
        this.files = list;
        this.hasPersonalSigningCertificate = z15;
        this.personalData = personalDataDto;
        this.contactDetails = contactDetailsDto;
        this.epuapAddress = str2;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GeneratePhysicalIdCardXmlApplicationV4Request)) {
            return false;
        }
        GeneratePhysicalIdCardXmlApplicationV4Request generatePhysicalIdCardXmlApplicationV4Request = (GeneratePhysicalIdCardXmlApplicationV4Request) other;
        return fr.t.c(this.addressData, generatePhysicalIdCardXmlApplicationV4Request.addressData) && this.applicationReasonType == generatePhysicalIdCardXmlApplicationV4Request.applicationReasonType && fr.t.c(this.communityOfficeId, generatePhysicalIdCardXmlApplicationV4Request.communityOfficeId) && fr.t.c(this.files, generatePhysicalIdCardXmlApplicationV4Request.files) && this.hasPersonalSigningCertificate == generatePhysicalIdCardXmlApplicationV4Request.hasPersonalSigningCertificate && fr.t.c(this.personalData, generatePhysicalIdCardXmlApplicationV4Request.personalData) && fr.t.c(this.contactDetails, generatePhysicalIdCardXmlApplicationV4Request.contactDetails) && fr.t.c(this.epuapAddress, generatePhysicalIdCardXmlApplicationV4Request.epuapAddress);
    }

    public int hashCode() {
        int iHashCode = ((((((((((this.addressData.hashCode() * 31) + this.applicationReasonType.hashCode()) * 31) + this.communityOfficeId.hashCode()) * 31) + this.files.hashCode()) * 31) + Boolean.hashCode(this.hasPersonalSigningCertificate)) * 31) + this.personalData.hashCode()) * 31;
        ContactDetailsDto contactDetailsDto = this.contactDetails;
        int iHashCode2 = (iHashCode + (contactDetailsDto == null ? 0 : contactDetailsDto.hashCode())) * 31;
        String str = this.epuapAddress;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "GeneratePhysicalIdCardXmlApplicationV4Request(addressData=" + this.addressData + ", applicationReasonType=" + this.applicationReasonType + ", communityOfficeId=" + this.communityOfficeId + ", files=" + this.files + ", hasPersonalSigningCertificate=" + this.hasPersonalSigningCertificate + ", personalData=" + this.personalData + ", contactDetails=" + this.contactDetails + ", epuapAddress=" + this.epuapAddress + ')';
    }

    public /* synthetic */ GeneratePhysicalIdCardXmlApplicationV4Request(AddressDataDto addressDataDto, i iVar, String str, List list, boolean z15, PersonalDataDto personalDataDto, ContactDetailsDto contactDetailsDto, String str2, int i15, fr.k kVar) {
        this(addressDataDto, iVar, str, list, z15, personalDataDto, (i15 & 64) != 0 ? null : contactDetailsDto, (i15 & 128) != 0 ? null : str2);
    }
}
