package xt0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: xt0.k0, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\t¨\u0006\u0018"}, d2 = {"Lxt0/k0;", "", "Lxt0/h0;", "address", "", "facilityName", "<init>", "(Lxt0/h0;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lxt0/h0;", "getAddress", "()Lxt0/h0;", "b", "Ljava/lang/String;", "getFacilityName", "sanitaryinspectorservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ReportProductInterventionRequestOfflinePurchaseDetails {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("address")
    private final ReportProductInterventionRequestAddressRequest address;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("facilityName")
    private final String facilityName;

    /* JADX WARN: Multi-variable type inference failed */
    public ReportProductInterventionRequestOfflinePurchaseDetails() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReportProductInterventionRequestOfflinePurchaseDetails)) {
            return false;
        }
        ReportProductInterventionRequestOfflinePurchaseDetails reportProductInterventionRequestOfflinePurchaseDetails = (ReportProductInterventionRequestOfflinePurchaseDetails) other;
        return fr.t.c(this.address, reportProductInterventionRequestOfflinePurchaseDetails.address) && fr.t.c(this.facilityName, reportProductInterventionRequestOfflinePurchaseDetails.facilityName);
    }

    public int hashCode() {
        ReportProductInterventionRequestAddressRequest reportProductInterventionRequestAddressRequest = this.address;
        int iHashCode = (reportProductInterventionRequestAddressRequest == null ? 0 : reportProductInterventionRequestAddressRequest.hashCode()) * 31;
        String str = this.facilityName;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "ReportProductInterventionRequestOfflinePurchaseDetails(address=" + this.address + ", facilityName=" + this.facilityName + ')';
    }

    public ReportProductInterventionRequestOfflinePurchaseDetails(ReportProductInterventionRequestAddressRequest reportProductInterventionRequestAddressRequest, String str) {
        this.address = reportProductInterventionRequestAddressRequest;
        this.facilityName = str;
    }

    public /* synthetic */ ReportProductInterventionRequestOfflinePurchaseDetails(ReportProductInterventionRequestAddressRequest reportProductInterventionRequestAddressRequest, String str, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? null : reportProductInterventionRequestAddressRequest, (i15 & 2) != 0 ? null : str);
    }
}
