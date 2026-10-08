package gm0;

import org.bouncycastle.pqc.crypto.rainbow.GF2Field;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: gm0.u, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0086\b\u0018\u00002\u00020\u0001Bg\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u0013R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\"R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b#\u0010%R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010\u001c\u001a\u0004\b&\u0010\u0013R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010\u001c\u001a\u0004\b'\u0010\u0013R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b(\u0010*R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b+\u0010-¨\u0006."}, d2 = {"Lgm0/u;", "", "", "apartmentNumber", "Lgm0/r;", "city", "Lgm0/s;", "community", "Lgm0/t;", "county", "houseNumber", "postCode", "Lgm0/v;", "street", "Lgm0/w;", "voivodeship", "<init>", "(Ljava/lang/String;Lgm0/r;Lgm0/s;Lgm0/t;Ljava/lang/String;Ljava/lang/String;Lgm0/v;Lgm0/w;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lgm0/r;", "()Lgm0/r;", "c", "Lgm0/s;", "()Lgm0/s;", "d", "Lgm0/t;", "()Lgm0/t;", "e", "f", "g", "Lgm0/v;", "()Lgm0/v;", "h", "Lgm0/w;", "()Lgm0/w;", "documentmanagementservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ChildBirthRegistrationAddressDataDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("apartmentNumber")
    private final String apartmentNumber;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("city")
    private final ChildBirthRegistrationAddressCityDto city;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("community")
    private final ChildBirthRegistrationAddressCommunityDto community;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("county")
    private final ChildBirthRegistrationAddressCountyDto county;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("houseNumber")
    private final String houseNumber;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("postCode")
    private final String postCode;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("street")
    private final ChildBirthRegistrationAddressStreetDto street;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("voivodeship")
    private final ChildBirthRegistrationAddressVoivodeshipDto voivodeship;

    public ChildBirthRegistrationAddressDataDto() {
        this(null, null, null, null, null, null, null, null, GF2Field.MASK, null);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getApartmentNumber() {
        return this.apartmentNumber;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final ChildBirthRegistrationAddressCityDto getCity() {
        return this.city;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final ChildBirthRegistrationAddressCommunityDto getCommunity() {
        return this.community;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final ChildBirthRegistrationAddressCountyDto getCounty() {
        return this.county;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getHouseNumber() {
        return this.houseNumber;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChildBirthRegistrationAddressDataDto)) {
            return false;
        }
        ChildBirthRegistrationAddressDataDto childBirthRegistrationAddressDataDto = (ChildBirthRegistrationAddressDataDto) other;
        return fr.t.c(this.apartmentNumber, childBirthRegistrationAddressDataDto.apartmentNumber) && fr.t.c(this.city, childBirthRegistrationAddressDataDto.city) && fr.t.c(this.community, childBirthRegistrationAddressDataDto.community) && fr.t.c(this.county, childBirthRegistrationAddressDataDto.county) && fr.t.c(this.houseNumber, childBirthRegistrationAddressDataDto.houseNumber) && fr.t.c(this.postCode, childBirthRegistrationAddressDataDto.postCode) && fr.t.c(this.street, childBirthRegistrationAddressDataDto.street) && fr.t.c(this.voivodeship, childBirthRegistrationAddressDataDto.voivodeship);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getPostCode() {
        return this.postCode;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final ChildBirthRegistrationAddressStreetDto getStreet() {
        return this.street;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final ChildBirthRegistrationAddressVoivodeshipDto getVoivodeship() {
        return this.voivodeship;
    }

    public int hashCode() {
        String str = this.apartmentNumber;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        ChildBirthRegistrationAddressCityDto childBirthRegistrationAddressCityDto = this.city;
        int iHashCode2 = (iHashCode + (childBirthRegistrationAddressCityDto == null ? 0 : childBirthRegistrationAddressCityDto.hashCode())) * 31;
        ChildBirthRegistrationAddressCommunityDto childBirthRegistrationAddressCommunityDto = this.community;
        int iHashCode3 = (iHashCode2 + (childBirthRegistrationAddressCommunityDto == null ? 0 : childBirthRegistrationAddressCommunityDto.hashCode())) * 31;
        ChildBirthRegistrationAddressCountyDto childBirthRegistrationAddressCountyDto = this.county;
        int iHashCode4 = (iHashCode3 + (childBirthRegistrationAddressCountyDto == null ? 0 : childBirthRegistrationAddressCountyDto.hashCode())) * 31;
        String str2 = this.houseNumber;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.postCode;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        ChildBirthRegistrationAddressStreetDto childBirthRegistrationAddressStreetDto = this.street;
        int iHashCode7 = (iHashCode6 + (childBirthRegistrationAddressStreetDto == null ? 0 : childBirthRegistrationAddressStreetDto.hashCode())) * 31;
        ChildBirthRegistrationAddressVoivodeshipDto childBirthRegistrationAddressVoivodeshipDto = this.voivodeship;
        return iHashCode7 + (childBirthRegistrationAddressVoivodeshipDto != null ? childBirthRegistrationAddressVoivodeshipDto.hashCode() : 0);
    }

    public String toString() {
        return "ChildBirthRegistrationAddressDataDto(apartmentNumber=" + this.apartmentNumber + ", city=" + this.city + ", community=" + this.community + ", county=" + this.county + ", houseNumber=" + this.houseNumber + ", postCode=" + this.postCode + ", street=" + this.street + ", voivodeship=" + this.voivodeship + ')';
    }

    public ChildBirthRegistrationAddressDataDto(String str, ChildBirthRegistrationAddressCityDto childBirthRegistrationAddressCityDto, ChildBirthRegistrationAddressCommunityDto childBirthRegistrationAddressCommunityDto, ChildBirthRegistrationAddressCountyDto childBirthRegistrationAddressCountyDto, String str2, String str3, ChildBirthRegistrationAddressStreetDto childBirthRegistrationAddressStreetDto, ChildBirthRegistrationAddressVoivodeshipDto childBirthRegistrationAddressVoivodeshipDto) {
        this.apartmentNumber = str;
        this.city = childBirthRegistrationAddressCityDto;
        this.community = childBirthRegistrationAddressCommunityDto;
        this.county = childBirthRegistrationAddressCountyDto;
        this.houseNumber = str2;
        this.postCode = str3;
        this.street = childBirthRegistrationAddressStreetDto;
        this.voivodeship = childBirthRegistrationAddressVoivodeshipDto;
    }

    public /* synthetic */ ChildBirthRegistrationAddressDataDto(String str, ChildBirthRegistrationAddressCityDto childBirthRegistrationAddressCityDto, ChildBirthRegistrationAddressCommunityDto childBirthRegistrationAddressCommunityDto, ChildBirthRegistrationAddressCountyDto childBirthRegistrationAddressCountyDto, String str2, String str3, ChildBirthRegistrationAddressStreetDto childBirthRegistrationAddressStreetDto, ChildBirthRegistrationAddressVoivodeshipDto childBirthRegistrationAddressVoivodeshipDto, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? null : str, (i15 & 2) != 0 ? null : childBirthRegistrationAddressCityDto, (i15 & 4) != 0 ? null : childBirthRegistrationAddressCommunityDto, (i15 & 8) != 0 ? null : childBirthRegistrationAddressCountyDto, (i15 & 16) != 0 ? null : str2, (i15 & 32) != 0 ? null : str3, (i15 & 64) != 0 ? null : childBirthRegistrationAddressStreetDto, (i15 & 128) != 0 ? null : childBirthRegistrationAddressVoivodeshipDto);
    }
}
