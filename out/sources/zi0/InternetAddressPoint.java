package zi0;

import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: zi0.a, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Lzi0/a;", "", "", "communityId", "displayAddress", "", "id", "<init>", "(Ljava/lang/String;Ljava/lang/String;J)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "J", "()J", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InternetAddressPoint {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String communityId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String displayAddress;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final long id;

    public InternetAddressPoint(String str, String str2, long j15) {
        this.communityId = str;
        this.displayAddress = str2;
        this.id = j15;
    }

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
        if (!(other instanceof InternetAddressPoint)) {
            return false;
        }
        InternetAddressPoint internetAddressPoint = (InternetAddressPoint) other;
        return t.c(this.communityId, internetAddressPoint.communityId) && t.c(this.displayAddress, internetAddressPoint.displayAddress) && this.id == internetAddressPoint.id;
    }

    public int hashCode() {
        return (((this.communityId.hashCode() * 31) + this.displayAddress.hashCode()) * 31) + Long.hashCode(this.id);
    }

    public String toString() {
        return "InternetAddressPoint(communityId=" + this.communityId + ", displayAddress=" + this.displayAddress + ", id=" + this.id + ")";
    }
}
