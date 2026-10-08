package jo0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: jo0.t1, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0011\u001a\u0004\b\u0014\u0010\b¨\u0006\u0015"}, d2 = {"Ljo0/t1;", "", "", "address", "fullName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getAddress", "b", "getFullName", "electronicdeliveryservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SendEdeliveryMessageAddressDataDtoDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("address")
    private final String address;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("fullName")
    private final String fullName;

    public SendEdeliveryMessageAddressDataDtoDto(String str, String str2) {
        this.address = str;
        this.fullName = str2;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SendEdeliveryMessageAddressDataDtoDto)) {
            return false;
        }
        SendEdeliveryMessageAddressDataDtoDto sendEdeliveryMessageAddressDataDtoDto = (SendEdeliveryMessageAddressDataDtoDto) other;
        return fr.t.c(this.address, sendEdeliveryMessageAddressDataDtoDto.address) && fr.t.c(this.fullName, sendEdeliveryMessageAddressDataDtoDto.fullName);
    }

    public int hashCode() {
        return (this.address.hashCode() * 31) + this.fullName.hashCode();
    }

    public String toString() {
        return "SendEdeliveryMessageAddressDataDtoDto(address=" + this.address + ", fullName=" + this.fullName + ')';
    }
}
