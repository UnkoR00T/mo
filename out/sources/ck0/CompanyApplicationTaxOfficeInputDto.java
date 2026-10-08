package ck0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: ck0.h0, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0017\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0019\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0014\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0014\u001a\u0004\b\u001d\u0010\u000b¨\u0006\u001e"}, d2 = {"Lck0/h0;", "", "", "buildingNumber", "city", "name", "postalCode", "streetName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getBuildingNumber", "b", "getCity", "c", "getName", "d", "getPostalCode", "e", "getStreetName", "companyservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CompanyApplicationTaxOfficeInputDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("buildingNumber")
    private final String buildingNumber;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("city")
    private final String city;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("name")
    private final String name;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("postalCode")
    private final String postalCode;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("streetName")
    private final String streetName;

    public CompanyApplicationTaxOfficeInputDto(String str, String str2, String str3, String str4, String str5) {
        this.buildingNumber = str;
        this.city = str2;
        this.name = str3;
        this.postalCode = str4;
        this.streetName = str5;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CompanyApplicationTaxOfficeInputDto)) {
            return false;
        }
        CompanyApplicationTaxOfficeInputDto companyApplicationTaxOfficeInputDto = (CompanyApplicationTaxOfficeInputDto) other;
        return fr.t.c(this.buildingNumber, companyApplicationTaxOfficeInputDto.buildingNumber) && fr.t.c(this.city, companyApplicationTaxOfficeInputDto.city) && fr.t.c(this.name, companyApplicationTaxOfficeInputDto.name) && fr.t.c(this.postalCode, companyApplicationTaxOfficeInputDto.postalCode) && fr.t.c(this.streetName, companyApplicationTaxOfficeInputDto.streetName);
    }

    public int hashCode() {
        return (((((((this.buildingNumber.hashCode() * 31) + this.city.hashCode()) * 31) + this.name.hashCode()) * 31) + this.postalCode.hashCode()) * 31) + this.streetName.hashCode();
    }

    public String toString() {
        return "CompanyApplicationTaxOfficeInputDto(buildingNumber=" + this.buildingNumber + ", city=" + this.city + ", name=" + this.name + ", postalCode=" + this.postalCode + ", streetName=" + this.streetName + ')';
    }
}
