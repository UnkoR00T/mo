package ck0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: ck0.m1, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u0004R\u001a\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\r\u001a\u0004\b\u000f\u0010\u0004R\u001a\u0010\u0012\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\r\u001a\u0004\b\u0011\u0010\u0004R\u001a\u0010\u0014\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\r\u001a\u0004\b\u0013\u0010\u0004R\u001a\u0010\u0016\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\r\u001a\u0004\b\u0015\u0010\u0004R\u001a\u0010\u0018\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\r\u001a\u0004\b\u0017\u0010\u0004¨\u0006\u0019"}, d2 = {"Lck0/m1;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "buildingNumber", "b", "city", "c", "description", "d", "name", "e", "postalCode", "f", "streetName", "companyservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SocialInsuranceFundDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("buildingNumber")
    private final String buildingNumber;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("city")
    private final String city;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("description")
    private final String description;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("name")
    private final String name;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("postalCode")
    private final String postalCode;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("streetName")
    private final String streetName;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getBuildingNumber() {
        return this.buildingNumber;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCity() {
        return this.city;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getPostalCode() {
        return this.postalCode;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SocialInsuranceFundDto)) {
            return false;
        }
        SocialInsuranceFundDto socialInsuranceFundDto = (SocialInsuranceFundDto) other;
        return fr.t.c(this.buildingNumber, socialInsuranceFundDto.buildingNumber) && fr.t.c(this.city, socialInsuranceFundDto.city) && fr.t.c(this.description, socialInsuranceFundDto.description) && fr.t.c(this.name, socialInsuranceFundDto.name) && fr.t.c(this.postalCode, socialInsuranceFundDto.postalCode) && fr.t.c(this.streetName, socialInsuranceFundDto.streetName);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getStreetName() {
        return this.streetName;
    }

    public int hashCode() {
        return (((((((((this.buildingNumber.hashCode() * 31) + this.city.hashCode()) * 31) + this.description.hashCode()) * 31) + this.name.hashCode()) * 31) + this.postalCode.hashCode()) * 31) + this.streetName.hashCode();
    }

    public String toString() {
        return "SocialInsuranceFundDto(buildingNumber=" + this.buildingNumber + ", city=" + this.city + ", description=" + this.description + ", name=" + this.name + ", postalCode=" + this.postalCode + ", streetName=" + this.streetName + ')';
    }
}
