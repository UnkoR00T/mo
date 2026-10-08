package gm0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: gm0.j4, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0015\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0012\u001a\u0004\b\u0017\u0010\t¨\u0006\u0018"}, d2 = {"Lgm0/j4;", "", "", "address", "country", "isoCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getAddress", "b", "getCountry", "c", "getIsoCode", "documentmanagementservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PassportChildApplicationForeignCorrespondenceAddressDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("address")
    private final String address;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("country")
    private final String country;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("isoCode")
    private final String isoCode;

    public PassportChildApplicationForeignCorrespondenceAddressDto(String str, String str2, String str3) {
        this.address = str;
        this.country = str2;
        this.isoCode = str3;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PassportChildApplicationForeignCorrespondenceAddressDto)) {
            return false;
        }
        PassportChildApplicationForeignCorrespondenceAddressDto passportChildApplicationForeignCorrespondenceAddressDto = (PassportChildApplicationForeignCorrespondenceAddressDto) other;
        return fr.t.c(this.address, passportChildApplicationForeignCorrespondenceAddressDto.address) && fr.t.c(this.country, passportChildApplicationForeignCorrespondenceAddressDto.country) && fr.t.c(this.isoCode, passportChildApplicationForeignCorrespondenceAddressDto.isoCode);
    }

    public int hashCode() {
        return (((this.address.hashCode() * 31) + this.country.hashCode()) * 31) + this.isoCode.hashCode();
    }

    public String toString() {
        return "PassportChildApplicationForeignCorrespondenceAddressDto(address=" + this.address + ", country=" + this.country + ", isoCode=" + this.isoCode + ')';
    }
}
