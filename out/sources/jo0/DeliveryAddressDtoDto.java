package jo0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: jo0.y, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0011\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0014\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0012\u001a\u0004\b\u0013\u0010\u0004R\u001a\u0010\u0019\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\r\u0010\u0004¨\u0006\u001b"}, d2 = {"Ljo0/y;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljo0/h;", "a", "Ljo0/h;", "b", "()Ljo0/h;", "addressType", "Ljava/lang/String;", "c", "epuapId", "Ljo0/g;", "Ljo0/g;", "d", "()Ljo0/g;", "status", "address", "electronicdeliveryservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DeliveryAddressDtoDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("addressType")
    private final h addressType;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("epuapId")
    private final String epuapId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("status")
    private final g status;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("address")
    private final String address;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAddress() {
        return this.address;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final h getAddressType() {
        return this.addressType;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getEpuapId() {
        return this.epuapId;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final g getStatus() {
        return this.status;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeliveryAddressDtoDto)) {
            return false;
        }
        DeliveryAddressDtoDto deliveryAddressDtoDto = (DeliveryAddressDtoDto) other;
        return this.addressType == deliveryAddressDtoDto.addressType && fr.t.c(this.epuapId, deliveryAddressDtoDto.epuapId) && this.status == deliveryAddressDtoDto.status && fr.t.c(this.address, deliveryAddressDtoDto.address);
    }

    public int hashCode() {
        int iHashCode = ((((this.addressType.hashCode() * 31) + this.epuapId.hashCode()) * 31) + this.status.hashCode()) * 31;
        String str = this.address;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "DeliveryAddressDtoDto(addressType=" + this.addressType + ", epuapId=" + this.epuapId + ", status=" + this.status + ", address=" + this.address + ')';
    }
}
