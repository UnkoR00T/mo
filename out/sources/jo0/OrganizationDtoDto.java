package jo0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: jo0.e1, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u0004R\u001a\u0010\u0015\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\f\u0010\u0019R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\r\u001a\u0004\b\u0011\u0010\u0004R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\r\u001a\u0004\b\u0017\u0010\u0004R\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\r\u001a\u0004\b\u001c\u0010\u0004R\u001c\u0010 \u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\r\u001a\u0004\b\u001e\u0010\u0004R\u001c\u0010\"\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\r\u001a\u0004\b!\u0010\u0004R\u001c\u0010'\u001a\u0004\u0018\u00010#8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b$\u0010&¨\u0006("}, d2 = {"Ljo0/e1;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "d", "fullName", "Ljo0/f1;", "b", "Ljo0/f1;", "g", "()Ljo0/f1;", "recipientType", "Ljo0/d1;", "c", "Ljo0/d1;", "()Ljo0/d1;", "address", "deliveryAddress", "e", "epuapAddress", "f", "krs", "nip", "h", "regon", "Ljo0/g1;", "i", "Ljo0/g1;", "()Ljo0/g1;", "warning", "electronicdeliveryservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class OrganizationDtoDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("fullName")
    private final String fullName;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("recipientType")
    private final f1 recipientType;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("address")
    private final OrganizationAddressDtoDto address;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("deliveryAddress")
    private final String deliveryAddress;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("epuapAddress")
    private final String epuapAddress;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("krs")
    private final String krs;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("nip")
    private final String nip;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("regon")
    private final String regon;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("warning")
    private final OrganizationWarningDtoDto warning;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final OrganizationAddressDtoDto getAddress() {
        return this.address;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getDeliveryAddress() {
        return this.deliveryAddress;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getEpuapAddress() {
        return this.epuapAddress;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getFullName() {
        return this.fullName;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getKrs() {
        return this.krs;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrganizationDtoDto)) {
            return false;
        }
        OrganizationDtoDto organizationDtoDto = (OrganizationDtoDto) other;
        return fr.t.c(this.fullName, organizationDtoDto.fullName) && this.recipientType == organizationDtoDto.recipientType && fr.t.c(this.address, organizationDtoDto.address) && fr.t.c(this.deliveryAddress, organizationDtoDto.deliveryAddress) && fr.t.c(this.epuapAddress, organizationDtoDto.epuapAddress) && fr.t.c(this.krs, organizationDtoDto.krs) && fr.t.c(this.nip, organizationDtoDto.nip) && fr.t.c(this.regon, organizationDtoDto.regon) && fr.t.c(this.warning, organizationDtoDto.warning);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getNip() {
        return this.nip;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final f1 getRecipientType() {
        return this.recipientType;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getRegon() {
        return this.regon;
    }

    public int hashCode() {
        int iHashCode = ((this.fullName.hashCode() * 31) + this.recipientType.hashCode()) * 31;
        OrganizationAddressDtoDto organizationAddressDtoDto = this.address;
        int iHashCode2 = (iHashCode + (organizationAddressDtoDto == null ? 0 : organizationAddressDtoDto.hashCode())) * 31;
        String str = this.deliveryAddress;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.epuapAddress;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.krs;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.nip;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.regon;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        OrganizationWarningDtoDto organizationWarningDtoDto = this.warning;
        return iHashCode7 + (organizationWarningDtoDto != null ? organizationWarningDtoDto.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final OrganizationWarningDtoDto getWarning() {
        return this.warning;
    }

    public String toString() {
        return "OrganizationDtoDto(fullName=" + this.fullName + ", recipientType=" + this.recipientType + ", address=" + this.address + ", deliveryAddress=" + this.deliveryAddress + ", epuapAddress=" + this.epuapAddress + ", krs=" + this.krs + ", nip=" + this.nip + ", regon=" + this.regon + ", warning=" + this.warning + ')';
    }
}
