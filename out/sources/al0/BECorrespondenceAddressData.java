package al0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: al0.k, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0018\u001a\u0004\b\u001d\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001f\u001a\u0004\b \u0010\u000fR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u0018\u001a\u0004\b!\u0010\u001aR\u0017\u0010\n\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001f\u001a\u0004\b\u001b\u0010\u000fR\u0017\u0010\u000b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b!\u0010\u001f\u001a\u0004\b\u0017\u0010\u000f¨\u0006\""}, d2 = {"Lal0/k;", "", "Lal0/w;", "province", "county", "community", "city", "", "postalCode", "street", "buildingNumber", "apartmentNumber", "<init>", "(Lal0/w;Lal0/w;Lal0/w;Lal0/w;Ljava/lang/String;Lal0/w;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lal0/w;", "g", "()Lal0/w;", "b", "e", "c", "d", "Ljava/lang/String;", "f", "h", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BECorrespondenceAddressData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final DMSTerytDetail province;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final DMSTerytDetail county;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final DMSTerytDetail community;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final DMSTerytDetail city;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String postalCode;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final DMSTerytDetail street;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String buildingNumber;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final String apartmentNumber;

    public BECorrespondenceAddressData(DMSTerytDetail dMSTerytDetail, DMSTerytDetail dMSTerytDetail2, DMSTerytDetail dMSTerytDetail3, DMSTerytDetail dMSTerytDetail4, String str, DMSTerytDetail dMSTerytDetail5, String str2, String str3) {
        this.province = dMSTerytDetail;
        this.county = dMSTerytDetail2;
        this.community = dMSTerytDetail3;
        this.city = dMSTerytDetail4;
        this.postalCode = str;
        this.street = dMSTerytDetail5;
        this.buildingNumber = str2;
        this.apartmentNumber = str3;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getApartmentNumber() {
        return this.apartmentNumber;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getBuildingNumber() {
        return this.buildingNumber;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final DMSTerytDetail getCity() {
        return this.city;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final DMSTerytDetail getCommunity() {
        return this.community;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final DMSTerytDetail getCounty() {
        return this.county;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BECorrespondenceAddressData)) {
            return false;
        }
        BECorrespondenceAddressData bECorrespondenceAddressData = (BECorrespondenceAddressData) other;
        return fr.t.c(this.province, bECorrespondenceAddressData.province) && fr.t.c(this.county, bECorrespondenceAddressData.county) && fr.t.c(this.community, bECorrespondenceAddressData.community) && fr.t.c(this.city, bECorrespondenceAddressData.city) && fr.t.c(this.postalCode, bECorrespondenceAddressData.postalCode) && fr.t.c(this.street, bECorrespondenceAddressData.street) && fr.t.c(this.buildingNumber, bECorrespondenceAddressData.buildingNumber) && fr.t.c(this.apartmentNumber, bECorrespondenceAddressData.apartmentNumber);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getPostalCode() {
        return this.postalCode;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final DMSTerytDetail getProvince() {
        return this.province;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final DMSTerytDetail getStreet() {
        return this.street;
    }

    public int hashCode() {
        int iHashCode = ((((((((this.province.hashCode() * 31) + this.county.hashCode()) * 31) + this.community.hashCode()) * 31) + this.city.hashCode()) * 31) + this.postalCode.hashCode()) * 31;
        DMSTerytDetail dMSTerytDetail = this.street;
        return ((((iHashCode + (dMSTerytDetail == null ? 0 : dMSTerytDetail.hashCode())) * 31) + this.buildingNumber.hashCode()) * 31) + this.apartmentNumber.hashCode();
    }

    public String toString() {
        return "BECorrespondenceAddressData(province=" + this.province + ", county=" + this.county + ", community=" + this.community + ", city=" + this.city + ", postalCode=" + this.postalCode + ", street=" + this.street + ", buildingNumber=" + this.buildingNumber + ", apartmentNumber=" + this.apartmentNumber + ")";
    }
}
