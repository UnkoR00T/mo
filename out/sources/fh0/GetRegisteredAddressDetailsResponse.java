package fh0;

import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: fh0.a, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0011\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\r\u0010\u0015R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0018"}, d2 = {"Lfh0/a;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lfh0/d;", "a", "Lfh0/d;", "c", "()Lfh0/d;", "timeline", "Lfh0/b;", "b", "Lfh0/b;", "()Lfh0/b;", "permanentAddress", "temporaryAddress", "addressservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class GetRegisteredAddressDetailsResponse {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("timeline")
    private final RegisteredAddressTimelineDto timeline;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("permanentAddress")
    private final RegisteredAddressDto permanentAddress;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("temporaryAddress")
    private final RegisteredAddressDto temporaryAddress;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final RegisteredAddressDto getPermanentAddress() {
        return this.permanentAddress;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final RegisteredAddressDto getTemporaryAddress() {
        return this.temporaryAddress;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final RegisteredAddressTimelineDto getTimeline() {
        return this.timeline;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetRegisteredAddressDetailsResponse)) {
            return false;
        }
        GetRegisteredAddressDetailsResponse getRegisteredAddressDetailsResponse = (GetRegisteredAddressDetailsResponse) other;
        return t.c(this.timeline, getRegisteredAddressDetailsResponse.timeline) && t.c(this.permanentAddress, getRegisteredAddressDetailsResponse.permanentAddress) && t.c(this.temporaryAddress, getRegisteredAddressDetailsResponse.temporaryAddress);
    }

    public int hashCode() {
        int iHashCode = this.timeline.hashCode() * 31;
        RegisteredAddressDto registeredAddressDto = this.permanentAddress;
        int iHashCode2 = (iHashCode + (registeredAddressDto == null ? 0 : registeredAddressDto.hashCode())) * 31;
        RegisteredAddressDto registeredAddressDto2 = this.temporaryAddress;
        return iHashCode2 + (registeredAddressDto2 != null ? registeredAddressDto2.hashCode() : 0);
    }

    public String toString() {
        return "GetRegisteredAddressDetailsResponse(timeline=" + this.timeline + ", permanentAddress=" + this.permanentAddress + ", temporaryAddress=" + this.temporaryAddress + ')';
    }
}
