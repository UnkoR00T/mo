package nj0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: nj0.u, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u0004R\u001a\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\r\u001a\u0004\b\u000f\u0010\u0004R\u001a\u0010\u0015\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0016"}, d2 = {"Lnj0/u;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "communityId", "b", "displayAddress", "", "c", "J", "()J", "id", "citizenservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InternetAddressPointDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("communityId")
    private final String communityId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("displayAddress")
    private final String displayAddress;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("id")
    private final long id;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCommunityId() {
        return this.communityId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getDisplayAddress() {
        return this.displayAddress;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getId() {
        return this.id;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InternetAddressPointDto)) {
            return false;
        }
        InternetAddressPointDto internetAddressPointDto = (InternetAddressPointDto) other;
        return fr.t.c(this.communityId, internetAddressPointDto.communityId) && fr.t.c(this.displayAddress, internetAddressPointDto.displayAddress) && this.id == internetAddressPointDto.id;
    }

    public int hashCode() {
        return (((this.communityId.hashCode() * 31) + this.displayAddress.hashCode()) * 31) + Long.hashCode(this.id);
    }

    public String toString() {
        return "InternetAddressPointDto(communityId=" + this.communityId + ", displayAddress=" + this.displayAddress + ", id=" + this.id + ')';
    }
}
