package fw0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: fw0.p1, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0012\u0010\b¨\u0006\u0013"}, d2 = {"Lfw0/p1;", "", "", "fillFormClaimUrl", "phoneNumber", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "vehicleservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ReportVehicleCollisionToInsurerResponse {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("fillFormClaimUrl")
    private final String fillFormClaimUrl;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("phoneNumber")
    private final String phoneNumber;

    /* JADX WARN: Multi-variable type inference failed */
    public ReportVehicleCollisionToInsurerResponse() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getFillFormClaimUrl() {
        return this.fillFormClaimUrl;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReportVehicleCollisionToInsurerResponse)) {
            return false;
        }
        ReportVehicleCollisionToInsurerResponse reportVehicleCollisionToInsurerResponse = (ReportVehicleCollisionToInsurerResponse) other;
        return fr.t.c(this.fillFormClaimUrl, reportVehicleCollisionToInsurerResponse.fillFormClaimUrl) && fr.t.c(this.phoneNumber, reportVehicleCollisionToInsurerResponse.phoneNumber);
    }

    public int hashCode() {
        String str = this.fillFormClaimUrl;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.phoneNumber;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "ReportVehicleCollisionToInsurerResponse(fillFormClaimUrl=" + this.fillFormClaimUrl + ", phoneNumber=" + this.phoneNumber + ')';
    }

    public ReportVehicleCollisionToInsurerResponse(String str, String str2) {
        this.fillFormClaimUrl = str;
        this.phoneNumber = str2;
    }

    public /* synthetic */ ReportVehicleCollisionToInsurerResponse(String str, String str2, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? null : str, (i15 & 2) != 0 ? null : str2);
    }
}
