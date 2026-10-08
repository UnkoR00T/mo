package gm0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: gm0.b5, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u000f\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000e¨\u0006\u0010"}, d2 = {"Lgm0/b5;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "hasElectronicDeliveryAddress", "documentmanagementservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PassportChildApplicationVerifyOfficeElectronicDeliveryAddressDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("hasElectronicDeliveryAddress")
    private final boolean hasElectronicDeliveryAddress;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getHasElectronicDeliveryAddress() {
        return this.hasElectronicDeliveryAddress;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof PassportChildApplicationVerifyOfficeElectronicDeliveryAddressDto) && this.hasElectronicDeliveryAddress == ((PassportChildApplicationVerifyOfficeElectronicDeliveryAddressDto) other).hasElectronicDeliveryAddress;
    }

    public int hashCode() {
        return Boolean.hashCode(this.hasElectronicDeliveryAddress);
    }

    public String toString() {
        return "PassportChildApplicationVerifyOfficeElectronicDeliveryAddressDto(hasElectronicDeliveryAddress=" + this.hasElectronicDeliveryAddress + ')';
    }
}
