package ck0;

import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: ck0.d, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000fR\u001a\u0010\u0013\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0004R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0014\u0010\u0004R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0012\u001a\u0004\b\u0016\u0010\u0004¨\u0006\u0018"}, d2 = {"Lck0/d;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "a", "Ljava/util/List;", "()Ljava/util/List;", "additionalAddresses", "b", "Ljava/lang/String;", "correspondenceAddress", "c", "electronicDeliveryAddressV2", "d", "mainAddress", "companyservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CompanyAddressesDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("additionalAddresses")
    private final List<String> additionalAddresses;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("correspondenceAddress")
    private final String correspondenceAddress;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("electronicDeliveryAddressV2")
    private final String electronicDeliveryAddressV2;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("mainAddress")
    private final String mainAddress;

    public final List<String> a() {
        return this.additionalAddresses;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCorrespondenceAddress() {
        return this.correspondenceAddress;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getElectronicDeliveryAddressV2() {
        return this.electronicDeliveryAddressV2;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getMainAddress() {
        return this.mainAddress;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CompanyAddressesDto)) {
            return false;
        }
        CompanyAddressesDto companyAddressesDto = (CompanyAddressesDto) other;
        return fr.t.c(this.additionalAddresses, companyAddressesDto.additionalAddresses) && fr.t.c(this.correspondenceAddress, companyAddressesDto.correspondenceAddress) && fr.t.c(this.electronicDeliveryAddressV2, companyAddressesDto.electronicDeliveryAddressV2) && fr.t.c(this.mainAddress, companyAddressesDto.mainAddress);
    }

    public int hashCode() {
        int iHashCode = ((this.additionalAddresses.hashCode() * 31) + this.correspondenceAddress.hashCode()) * 31;
        String str = this.electronicDeliveryAddressV2;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.mainAddress;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "CompanyAddressesDto(additionalAddresses=" + this.additionalAddresses + ", correspondenceAddress=" + this.correspondenceAddress + ", electronicDeliveryAddressV2=" + this.electronicDeliveryAddressV2 + ", mainAddress=" + this.mainAddress + ')';
    }
}
