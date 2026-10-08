package jo0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: jo0.d0, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0010\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000fR\u001a\u0010\u0013\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0004R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0014\u0010\u0004¨\u0006\u0016"}, d2 = {"Ljo0/d0;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljo0/z0;", "a", "Ljo0/z0;", "()Ljo0/z0;", "code", "b", "Ljava/lang/String;", "displayValue", "c", "statusDescription", "electronicdeliveryservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DeliveryStatusDtoDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("code")
    private final z0 code;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("displayValue")
    private final String displayValue;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("statusDescription")
    private final String statusDescription;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final z0 getCode() {
        return this.code;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getDisplayValue() {
        return this.displayValue;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getStatusDescription() {
        return this.statusDescription;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeliveryStatusDtoDto)) {
            return false;
        }
        DeliveryStatusDtoDto deliveryStatusDtoDto = (DeliveryStatusDtoDto) other;
        return this.code == deliveryStatusDtoDto.code && fr.t.c(this.displayValue, deliveryStatusDtoDto.displayValue) && fr.t.c(this.statusDescription, deliveryStatusDtoDto.statusDescription);
    }

    public int hashCode() {
        int iHashCode = ((this.code.hashCode() * 31) + this.displayValue.hashCode()) * 31;
        String str = this.statusDescription;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "DeliveryStatusDtoDto(code=" + this.code + ", displayValue=" + this.displayValue + ", statusDescription=" + this.statusDescription + ')';
    }
}
