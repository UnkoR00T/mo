package wr0;

import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: wr0.a, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0017\u0010\fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0014\u0010\fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u0018\u0010\fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001a\u0010\fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u001b\u0010\fR\u0011\u0010\u001c\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\f¨\u0006\u001d"}, d2 = {"Lwr0/a;", "", "", "street", "buildingNumber", "apartmentNumber", "city", "postalCode", "country", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "f", "b", "c", "d", "e", "getCountry", "paymentAddress", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BEPaymentAddress {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String street;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String buildingNumber;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String apartmentNumber;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String city;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String postalCode;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String country;

    public BEPaymentAddress(String str, String str2, String str3, String str4, String str5, String str6) {
        this.street = str;
        this.buildingNumber = str2;
        this.apartmentNumber = str3;
        this.city = str4;
        this.postalCode = str5;
        this.country = str6;
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
    public final String getCity() {
        return this.city;
    }

    public final String d() {
        StringBuilder sb5 = new StringBuilder();
        String str = this.street;
        if (str != null) {
            sb5.append(str);
            sb5.append(" ");
        }
        String str2 = this.buildingNumber;
        if (str2 != null) {
            sb5.append(str2);
        }
        String str3 = this.apartmentNumber;
        if (str3 != null) {
            sb5.append("/");
            sb5.append(str3);
        }
        if (sb5.length() > 0 && (this.postalCode != null || this.city != null)) {
            sb5.append("\n");
        }
        String str4 = this.postalCode;
        if (str4 != null) {
            sb5.append(str4);
            sb5.append(" ");
        }
        String str5 = this.city;
        if (str5 != null) {
            sb5.append(str5);
        }
        if (sb5.length() > 0 && this.country != null) {
            sb5.append("\n");
        }
        String str6 = this.country;
        if (str6 != null) {
            sb5.append(str6);
        }
        return sb5.toString();
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getPostalCode() {
        return this.postalCode;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BEPaymentAddress)) {
            return false;
        }
        BEPaymentAddress bEPaymentAddress = (BEPaymentAddress) other;
        return t.c(this.street, bEPaymentAddress.street) && t.c(this.buildingNumber, bEPaymentAddress.buildingNumber) && t.c(this.apartmentNumber, bEPaymentAddress.apartmentNumber) && t.c(this.city, bEPaymentAddress.city) && t.c(this.postalCode, bEPaymentAddress.postalCode) && t.c(this.country, bEPaymentAddress.country);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getStreet() {
        return this.street;
    }

    public int hashCode() {
        String str = this.street;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.buildingNumber;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.apartmentNumber;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.city;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.postalCode;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.country;
        return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    public String toString() {
        return "BEPaymentAddress(street=" + this.street + ", buildingNumber=" + this.buildingNumber + ", apartmentNumber=" + this.apartmentNumber + ", city=" + this.city + ", postalCode=" + this.postalCode + ", country=" + this.country + ")";
    }
}
