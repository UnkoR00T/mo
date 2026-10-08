package eo0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: eo0.s0, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u000eR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u0019\u0010\u000eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u0018\u0010\u000eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001a\u0010\u001dR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001b\u0010\u000eR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0017\u001a\u0004\b\u001e\u0010\u000eR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0017\u001a\u0004\b\u001f\u0010\u000e¨\u0006 "}, d2 = {"Leo0/s0;", "", "", "buildingNumber", "flatNumber", "city", "Leo0/l;", "country", "countryCode", "postalCode", "street", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Leo0/l;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "e", "c", "d", "Leo0/l;", "()Leo0/l;", "f", "g", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SearchAddressRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String buildingNumber;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String flatNumber;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String city;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final CountryDictionary country;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String countryCode;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String postalCode;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String street;

    public SearchAddressRequest(String str, String str2, String str3, CountryDictionary countryDictionary, String str4, String str5, String str6) {
        this.buildingNumber = str;
        this.flatNumber = str2;
        this.city = str3;
        this.country = countryDictionary;
        this.countryCode = str4;
        this.postalCode = str5;
        this.street = str6;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getBuildingNumber() {
        return this.buildingNumber;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCity() {
        return this.city;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final CountryDictionary getCountry() {
        return this.country;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getCountryCode() {
        return this.countryCode;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getFlatNumber() {
        return this.flatNumber;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchAddressRequest)) {
            return false;
        }
        SearchAddressRequest searchAddressRequest = (SearchAddressRequest) other;
        return fr.t.c(this.buildingNumber, searchAddressRequest.buildingNumber) && fr.t.c(this.flatNumber, searchAddressRequest.flatNumber) && fr.t.c(this.city, searchAddressRequest.city) && fr.t.c(this.country, searchAddressRequest.country) && fr.t.c(this.countryCode, searchAddressRequest.countryCode) && fr.t.c(this.postalCode, searchAddressRequest.postalCode) && fr.t.c(this.street, searchAddressRequest.street);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getPostalCode() {
        return this.postalCode;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getStreet() {
        return this.street;
    }

    public int hashCode() {
        String str = this.buildingNumber;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.flatNumber;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.city;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        CountryDictionary countryDictionary = this.country;
        int iHashCode4 = (iHashCode3 + (countryDictionary == null ? 0 : countryDictionary.hashCode())) * 31;
        String str4 = this.countryCode;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.postalCode;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.street;
        return iHashCode6 + (str6 != null ? str6.hashCode() : 0);
    }

    public String toString() {
        return "SearchAddressRequest(buildingNumber=" + this.buildingNumber + ", flatNumber=" + this.flatNumber + ", city=" + this.city + ", country=" + this.country + ", countryCode=" + this.countryCode + ", postalCode=" + this.postalCode + ", street=" + this.street + ")";
    }
}
