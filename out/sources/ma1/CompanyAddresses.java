package ma1;

import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: ma1.b, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u000bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0016\u0010\u000bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0017\u0010\u000bR\u001f\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u0019¨\u0006\u001a"}, d2 = {"Lma1/b;", "", "", "correspondenceAddress", "electronicDeliveryAddress", "mainAddress", "", "additionalAddresses", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "d", "Ljava/util/List;", "()Ljava/util/List;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CompanyAddresses {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String correspondenceAddress;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String electronicDeliveryAddress;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String mainAddress;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<String> additionalAddresses;

    public CompanyAddresses(String str, String str2, String str3, List<String> list) {
        this.correspondenceAddress = str;
        this.electronicDeliveryAddress = str2;
        this.mainAddress = str3;
        this.additionalAddresses = list;
    }

    public final List<String> a() {
        return this.additionalAddresses;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCorrespondenceAddress() {
        return this.correspondenceAddress;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getElectronicDeliveryAddress() {
        return this.electronicDeliveryAddress;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getMainAddress() {
        return this.mainAddress;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CompanyAddresses)) {
            return false;
        }
        CompanyAddresses companyAddresses = (CompanyAddresses) other;
        return fr.t.c(this.correspondenceAddress, companyAddresses.correspondenceAddress) && fr.t.c(this.electronicDeliveryAddress, companyAddresses.electronicDeliveryAddress) && fr.t.c(this.mainAddress, companyAddresses.mainAddress) && fr.t.c(this.additionalAddresses, companyAddresses.additionalAddresses);
    }

    public int hashCode() {
        int iHashCode = this.correspondenceAddress.hashCode() * 31;
        String str = this.electronicDeliveryAddress;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.mainAddress;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<String> list = this.additionalAddresses;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return "CompanyAddresses(correspondenceAddress=" + this.correspondenceAddress + ", electronicDeliveryAddress=" + this.electronicDeliveryAddress + ", mainAddress=" + this.mainAddress + ", additionalAddresses=" + this.additionalAddresses + ')';
    }
}
