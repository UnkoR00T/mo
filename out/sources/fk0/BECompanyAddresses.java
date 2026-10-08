package fk0;

import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: fk0.v, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u000bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u0018\u0010\u000bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u0019\u0010\u000b¨\u0006\u001a"}, d2 = {"Lfk0/v;", "", "", "", "additionalAddresses", "correspondenceAddress", "electronicDeliveryAddressV2", "mainAddress", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "Ljava/lang/String;", "c", "d", "companyservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BECompanyAddresses {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<String> additionalAddresses;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String correspondenceAddress;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String electronicDeliveryAddressV2;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String mainAddress;

    public BECompanyAddresses(List<String> list, String str, String str2, String str3) {
        this.additionalAddresses = list;
        this.correspondenceAddress = str;
        this.electronicDeliveryAddressV2 = str2;
        this.mainAddress = str3;
    }

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
        if (!(other instanceof BECompanyAddresses)) {
            return false;
        }
        BECompanyAddresses bECompanyAddresses = (BECompanyAddresses) other;
        return fr.t.c(this.additionalAddresses, bECompanyAddresses.additionalAddresses) && fr.t.c(this.correspondenceAddress, bECompanyAddresses.correspondenceAddress) && fr.t.c(this.electronicDeliveryAddressV2, bECompanyAddresses.electronicDeliveryAddressV2) && fr.t.c(this.mainAddress, bECompanyAddresses.mainAddress);
    }

    public int hashCode() {
        int iHashCode = ((this.additionalAddresses.hashCode() * 31) + this.correspondenceAddress.hashCode()) * 31;
        String str = this.electronicDeliveryAddressV2;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.mainAddress;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "BECompanyAddresses(additionalAddresses=" + this.additionalAddresses + ", correspondenceAddress=" + this.correspondenceAddress + ", electronicDeliveryAddressV2=" + this.electronicDeliveryAddressV2 + ", mainAddress=" + this.mainAddress + ')';
    }
}
