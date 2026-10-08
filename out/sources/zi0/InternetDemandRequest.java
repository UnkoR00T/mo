package zi0;

import fr.t;
import java.util.Set;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: zi0.d, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b!\b\u0086\b\u0018\u00002\u00020\u0001Bg\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0018\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u0014R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\b8\u0006¢\u0006\f\n\u0004\b!\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b&\u0010 \u001a\u0004\b'\u0010\"R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b(\u0010\u001e\u001a\u0004\b\u001d\u0010\u0014R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b$\u0010)\u001a\u0004\b&\u0010*R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b+\u0010\u001e\u001a\u0004\b(\u0010\u0014R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b'\u0010\u001e\u001a\u0004\b+\u0010\u0014R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b,\u0010)\u001a\u0004\b,\u0010*¨\u0006-"}, d2 = {"Lzi0/d;", "", "", "addressPointId", "", "communityId", "", "dataShareConsent", "", "operatorIds", "upgrade", "apartmentNumber", "", "downlink", "email", "phoneNumber", "uplink", "<init>", "(JLjava/lang/String;ZLjava/util/Set;ZLjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "J", "()J", "b", "Ljava/lang/String;", "c", "Z", "d", "()Z", "Ljava/util/Set;", "g", "()Ljava/util/Set;", "e", "i", "f", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "h", "j", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InternetDemandRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final long addressPointId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String communityId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean dataShareConsent;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final Set<Long> operatorIds;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean upgrade;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String apartmentNumber;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer downlink;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final String email;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final String phoneNumber;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer uplink;

    public InternetDemandRequest(long j15, String str, boolean z15, Set<Long> set, boolean z16, String str2, Integer num, String str3, String str4, Integer num2) {
        this.addressPointId = j15;
        this.communityId = str;
        this.dataShareConsent = z15;
        this.operatorIds = set;
        this.upgrade = z16;
        this.apartmentNumber = str2;
        this.downlink = num;
        this.email = str3;
        this.phoneNumber = str4;
        this.uplink = num2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getAddressPointId() {
        return this.addressPointId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getApartmentNumber() {
        return this.apartmentNumber;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getCommunityId() {
        return this.communityId;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getDataShareConsent() {
        return this.dataShareConsent;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Integer getDownlink() {
        return this.downlink;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InternetDemandRequest)) {
            return false;
        }
        InternetDemandRequest internetDemandRequest = (InternetDemandRequest) other;
        return this.addressPointId == internetDemandRequest.addressPointId && t.c(this.communityId, internetDemandRequest.communityId) && this.dataShareConsent == internetDemandRequest.dataShareConsent && t.c(this.operatorIds, internetDemandRequest.operatorIds) && this.upgrade == internetDemandRequest.upgrade && t.c(this.apartmentNumber, internetDemandRequest.apartmentNumber) && t.c(this.downlink, internetDemandRequest.downlink) && t.c(this.email, internetDemandRequest.email) && t.c(this.phoneNumber, internetDemandRequest.phoneNumber) && t.c(this.uplink, internetDemandRequest.uplink);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    public final Set<Long> g() {
        return this.operatorIds;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    public int hashCode() {
        int iHashCode = ((((((((Long.hashCode(this.addressPointId) * 31) + this.communityId.hashCode()) * 31) + Boolean.hashCode(this.dataShareConsent)) * 31) + this.operatorIds.hashCode()) * 31) + Boolean.hashCode(this.upgrade)) * 31;
        String str = this.apartmentNumber;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.downlink;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.email;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.phoneNumber;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num2 = this.uplink;
        return iHashCode5 + (num2 != null ? num2.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getUpgrade() {
        return this.upgrade;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final Integer getUplink() {
        return this.uplink;
    }

    public String toString() {
        return "InternetDemandRequest(addressPointId=" + this.addressPointId + ", communityId=" + this.communityId + ", dataShareConsent=" + this.dataShareConsent + ", operatorIds=" + this.operatorIds + ", upgrade=" + this.upgrade + ", apartmentNumber=" + this.apartmentNumber + ", downlink=" + this.downlink + ", email=" + this.email + ", phoneNumber=" + this.phoneNumber + ", uplink=" + this.uplink + ")";
    }
}
